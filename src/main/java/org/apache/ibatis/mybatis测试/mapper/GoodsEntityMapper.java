package org.apache.ibatis.mybatis测试.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.mybatis测试.Entity.GoodsEntity;
import org.apache.ibatis.mybatis测试.Entity.GoodsEntityExample;

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
