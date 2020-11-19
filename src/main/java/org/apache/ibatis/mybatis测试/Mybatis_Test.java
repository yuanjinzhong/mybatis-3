package org.apache.ibatis.mybatis测试;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Enumeration;

@Slf4j
public class Mybatis_Test {


  /**
   *
   * 原生mybatis
   *
   * @throws IOException
   * @throws InterruptedException
   */
  @Test
  public void test() throws IOException, InterruptedException {

    Enumeration em = DriverManager.getDrivers();

    log.info("这是一条info");
    // mybatis的配置文件
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    //创建mybatis的 sqlSessionFactory
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    //利用sqlSession会话工厂打开 sqlSession
    SqlSession sqlSession = sqlSessionFactory.openSession();
    int count = sqlSession.selectOne("org.apache.ibatis.mybatis测试.mapper.GoodsMapper.queryGoodsCount");
    log.info("查询结果:{}", count);
    //清空一级缓存
    sqlSession.clearCache();
    int count2 = sqlSession.selectOne("org.apache.ibatis.mybatis测试.mapper.GoodsMapper.queryGoodsCount");
    log.info("第二次查询结果:{}", count2);

  }
}
