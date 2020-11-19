/**
 *    Copyright 2009-2019 the original author or authors.
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
package org.apache.ibatis.transaction;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * mybatis的事务,
 * 事务是一个抽象概念,事务本质上是依据不同【隔离级别】和【传播行为】对Connection对象的处理(提交/回滚/关闭/等)
 * 包装数据库连接
 * Wraps a database connection.
 * Handles the connection lifecycle that comprises: its creation, preparation, commit/rollback and close.
 *
 * @author Clinton Begin
 */
public interface Transaction {

  /**
   *关于Connection
   * 出于简化的想法，Sun公司，定义了一套面向所有关系型数据库的 API 即 JDBC ，其只提供接口，而具体实现去交给数据库厂商实现，
   * 而我们作为开发者，我们针对数据数据库的操作，只需要基于JDBC即可
   *
   * Retrieve inner database connection.
   * @return DataBase connection
   * @throws SQLException
   */
  Connection getConnection() throws SQLException;

  /**
   * Commit inner database connection.
   * @throws SQLException
   */
  void commit() throws SQLException;

  /**
   * Rollback inner database connection.
   * @throws SQLException
   */
  void rollback() throws SQLException;

  /**
   * Close inner database connection.
   * @throws SQLException
   */
  void close() throws SQLException;

  /**
   * Get transaction timeout if set.
   * @throws SQLException
   */
  Integer getTimeout() throws SQLException;

}
