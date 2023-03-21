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
package org.apache.ibatis.mybatis测试;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mybatis测试.entity.UserInfoEntity;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Enumeration;
import java.util.List;

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
    List<UserInfoEntity> res1 = sqlSession.selectList("org.apache.ibatis.mybatis测试.mapper.UserInfoEntityMapper.selectAll");
    log.info("查询结果:{}", res1);
    //清空一级缓存
   // sqlSession.clearCache();
    List<UserInfoEntity> res2 = sqlSession.selectList("org.apache.ibatis.mybatis测试.mapper.UserInfoEntityMapper.selectAll");
    log.info("第二次查询结果:{}", res2);

  }
}
