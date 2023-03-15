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
package org.apache.ibatis.mybatis测试.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.mybatis测试.entity.GoodsEntity;
import org.apache.ibatis.mybatis测试.entity.GoodsEntityExample;

import java.util.List;

public interface GoodsEntityMapper {
  int countByExample(GoodsEntityExample example);

  int deleteByExample(GoodsEntityExample example);

  int deleteByPrimaryKey(Integer goodsId);

  int insert(GoodsEntity record);

  int insertSelective(GoodsEntity record);

  List<GoodsEntity> selectByExample(GoodsEntityExample example);

  GoodsEntity selectByPrimaryKey(Integer goodsId);

  int updateByExampleSelective(@Param("record") GoodsEntity record, @Param("example") GoodsEntityExample example);

  int updateByExample(@Param("record") GoodsEntity record, @Param("example") GoodsEntityExample example);

  int updateByPrimaryKeySelective(GoodsEntity record);

  int updateByPrimaryKey(GoodsEntity record);
}
