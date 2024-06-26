/**
 *    Copyright 2009-2020 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.datasource.unpooled;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;

/**  之所以称之为Unpooled, 是因为每次获取连接都是直接调用DriverManager.getConnection,来获取物理连接，没有任何缓存动作
 * @author Clinton Begin
 * @author Eduardo Macarron
 */
public class UnpooledDataSource implements DataSource {

  private ClassLoader driverClassLoader;
  private Properties driverProperties;
  private static Map<String, Driver> registeredDrivers = new ConcurrentHashMap<>();

  private String driver; //构造UnpooledDataSource时传入的新的驱动，动态注入DriverManager中
  private String url;
  private String username;
  private String password;

  private Boolean autoCommit; //自动提交
  private Integer defaultTransactionIsolationLevel; //隔离级别
  private Integer defaultNetworkTimeout; //超时时间

  static {
    //从CopyOnWriteArrayList<DriverInfo> registeredDrivers = new CopyOnWriteArrayList<>(); 这个集合里面取驱动,
    //DriverManager.registeredDrivers 这个集合里面是有驱动得，因为各个厂商得驱动程序里面都有静态代码块，往DriverManager里面注册驱动，如:
/** mYSQL注册驱动,里面有静态注册的代码块，调用方Class.forname  或者 Spi 机制，都可以将驱动注册到DriverManager
 * public class Driver extends NonRegisteringDriver implements java.sql.Driver {
 *       public Driver() throws SQLException {
 *       }
 *
 *       static {
 *         try {
 *           DriverManager.registerDriver(new Driver());
 *         } catch (SQLException var1) {
 *           throw new RuntimeException("Can't register driver!");
 *         }
 *       }
 *     }
 */
    //会促销DriverManager里面的spi机制
    Enumeration<Driver> drivers = DriverManager.getDrivers();
    while (drivers.hasMoreElements()) {
      Driver driver = drivers.nextElement();
      registeredDrivers.put(driver.getClass().getName(), driver);
    }
  }

  public UnpooledDataSource() {
  }

  public UnpooledDataSource(String driver, String url, String username, String password) {
    this.driver = driver;
    this.url = url;
    this.username = username;
    this.password = password;
  }

  public UnpooledDataSource(String driver, String url, Properties driverProperties) {
    this.driver = driver;
    this.url = url;
    this.driverProperties = driverProperties;
  }

  public UnpooledDataSource(ClassLoader driverClassLoader, String driver, String url, String username, String password) {
    this.driverClassLoader = driverClassLoader;
    this.driver = driver;
    this.url = url;
    this.username = username;
    this.password = password;
  }

  public UnpooledDataSource(ClassLoader driverClassLoader, String driver, String url, Properties driverProperties) {
    this.driverClassLoader = driverClassLoader;
    this.driver = driver;
    this.url = url;
    this.driverProperties = driverProperties;
  }

  /**
   * 之所以叫做UnpolledConnection， 是因为每次获取连接都是直接调用DriverManager.getConnection,来获取物理连接，没有任何缓存动作
   * @return
   * @throws SQLException
   */

  @Override
  public Connection getConnection() throws SQLException {
    return doGetConnection(username, password);
  }

  @Override
  public Connection getConnection(String username, String password) throws SQLException {
    return doGetConnection(username, password);
  }

  @Override
  public void setLoginTimeout(int loginTimeout) {
    DriverManager.setLoginTimeout(loginTimeout);
  }

  @Override
  public int getLoginTimeout() {
    return DriverManager.getLoginTimeout();
  }

  @Override
  public void setLogWriter(PrintWriter logWriter) {
    DriverManager.setLogWriter(logWriter);
  }

  @Override
  public PrintWriter getLogWriter() {
    return DriverManager.getLogWriter();
  }

  public ClassLoader getDriverClassLoader() {
    return driverClassLoader;
  }

  public void setDriverClassLoader(ClassLoader driverClassLoader) {
    this.driverClassLoader = driverClassLoader;
  }

  public Properties getDriverProperties() {
    return driverProperties;
  }

  public void setDriverProperties(Properties driverProperties) {
    this.driverProperties = driverProperties;
  }

  public String getDriver() {
    return driver;
  }

  public synchronized void setDriver(String driver) {
    this.driver = driver;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Boolean isAutoCommit() {
    return autoCommit;
  }

  public void setAutoCommit(Boolean autoCommit) {
    this.autoCommit = autoCommit;
  }

  public Integer getDefaultTransactionIsolationLevel() {
    return defaultTransactionIsolationLevel;
  }

  public void setDefaultTransactionIsolationLevel(Integer defaultTransactionIsolationLevel) {
    this.defaultTransactionIsolationLevel = defaultTransactionIsolationLevel;
  }

  /**
   * @since 3.5.2
   */
  public Integer getDefaultNetworkTimeout() {
    return defaultNetworkTimeout;
  }

  /**
   * Sets the default network timeout value to wait for the database operation to complete. See {@link Connection#setNetworkTimeout(java.util.concurrent.Executor, int)}
   *
   * @param defaultNetworkTimeout
   *          The time in milliseconds to wait for the database operation to complete.
   * @since 3.5.2
   */
  public void setDefaultNetworkTimeout(Integer defaultNetworkTimeout) {
    this.defaultNetworkTimeout = defaultNetworkTimeout;
  }

  private Connection doGetConnection(String username, String password) throws SQLException {
    Properties props = new Properties();
    if (driverProperties != null) {
      props.putAll(driverProperties);
    }
    if (username != null) {
      props.setProperty("user", username);
    }
    if (password != null) {
      props.setProperty("password", password);
    }
    return doGetConnection(props);
  }

  /**
   * Mybatis的方法，调用java.sql包里的 {@link DriverManager#getConnection } 获取物理连接，这玩意是真实的连接
   * @param properties
   * @return
   * @throws SQLException
   */
  private Connection doGetConnection(Properties properties) throws SQLException {
    //动态加载驱动
    initializeDriver();
    //C:/Program Files/Java/jdk1.8.0_181/src.zip!/java/sql/DriverManager.java:639 获取调用者的Application ClassLoader 来加载 mysql的驱动,
    //不然drivermannager的classLoader 是没法加载 mysql的驱动( 父classloader是没法加载子classloader的类的)
    //这是获取物理连接，mybatis中的各种连接操作，都是操作这个物理连接
    Connection connection = DriverManager.getConnection(url, properties);
    //设置超时，事务隔离级别，自动提交等
    configureConnection(connection);
    return connection;
  }

  /**
   * 动态注册驱动，在spi机制下，系统中驱动都会通过DriverManager的静态方法加载进去，这个方法可以动态加载驱动
   *将系统中的驱动注入到这个DriverManager#registeredDrivers里面，交给DriverManager管理
   */
  private synchronized void initializeDriver() throws SQLException {
    if (!registeredDrivers.containsKey(driver)) {
      Class<?> driverType;
      try {
        if (driverClassLoader != null) {
          /**
           * 为了将驱动的静态代码块加载到jvm的方法区里面，如下是mysql的驱动:
           *
           * public class Driver extends NonRegisteringDriver implements java.sql.Driver {
           *            public Driver() throws SQLException {
           *            }
           *            static {
           *              try {
           *                DriverManager.registerDriver(new Driver());
           *              } catch (SQLException var1) {
           *                throw new RuntimeException("Can't register driver!");
           *              }
           *            }
           *          }
           */
          driverType = Class.forName(driver, true, driverClassLoader);// 参数的true 表示初始化这个类
        } else {
          driverType = Resources.classForName(driver);
        }
        // DriverManager requires the driver to be loaded via the system ClassLoader.
        // http://www.kfu.com/~nsayer/Java/dyn-jdbc.html
        Driver driverInstance = (Driver)driverType.getDeclaredConstructor().newInstance();
        /**
         * oracle,mysql等数据库厂商提供的驱动 仅仅是驱动，需要持久称框架注册到 jdk 的DriverManager里面
         */
        DriverManager.registerDriver(new DriverProxy(driverInstance));
        registeredDrivers.put(driver, driverInstance);
      } catch (Exception e) {
        throw new SQLException("Error setting driver on UnpooledDataSource. Cause: " + e);
      }
    }
  }

  private void configureConnection(Connection conn) throws SQLException {
    if (defaultNetworkTimeout != null) {
      conn.setNetworkTimeout(Executors.newSingleThreadExecutor(), defaultNetworkTimeout);
    }
    if (autoCommit != null && autoCommit != conn.getAutoCommit()) {
      conn.setAutoCommit(autoCommit);
    }
    if (defaultTransactionIsolationLevel != null) {
      conn.setTransactionIsolation(defaultTransactionIsolationLevel);
    }
  }

  /**
   * 仅仅是一个静态代理
   */
  private static class DriverProxy implements Driver {
    private Driver driver;

    DriverProxy(Driver d) {
      this.driver = d;
    }

    @Override
    public boolean acceptsURL(String u) throws SQLException {
      return this.driver.acceptsURL(u);
    }

    @Override
    public Connection connect(String u, Properties p) throws SQLException {
      return this.driver.connect(u, p);
    }

    @Override
    public int getMajorVersion() {
      return this.driver.getMajorVersion();
    }

    @Override
    public int getMinorVersion() {
      return this.driver.getMinorVersion();
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String u, Properties p) throws SQLException {
      return this.driver.getPropertyInfo(u, p);
    }

    @Override
    public boolean jdbcCompliant() {
      return this.driver.jdbcCompliant();
    }

    @Override
    public Logger getParentLogger() {
      return Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    }
  }

  @Override
  public <T> T unwrap(Class<T> iface) throws SQLException {
    throw new SQLException(getClass().getName() + " is not a wrapper.");
  }

  @Override
  public boolean isWrapperFor(Class<?> iface) throws SQLException {
    return false;
  }

  @Override
  public Logger getParentLogger() {
    // requires JDK version 1.6
    return Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
  }

}
