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
package org.apache.ibatis.mybatis测试.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsEntityExample {
  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  public GoodsEntityExample() {
    oredCriteria = new ArrayList<Criteria>();
  }

  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  public String getOrderByClause() {
    return orderByClause;
  }

  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  public boolean isDistinct() {
    return distinct;
  }

  public List<Criteria> getOredCriteria() {
    return oredCriteria;
  }

  public void or(Criteria criteria) {
    oredCriteria.add(criteria);
  }

  public Criteria or() {
    Criteria criteria = createCriteriaInternal();
    oredCriteria.add(criteria);
    return criteria;
  }

  public Criteria createCriteria() {
    Criteria criteria = createCriteriaInternal();
    if (oredCriteria.size() == 0) {
      oredCriteria.add(criteria);
    }
    return criteria;
  }

  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  public void clear() {
    oredCriteria.clear();
    orderByClause = null;
    distinct = false;
  }

  protected abstract static class GeneratedCriteria {
    protected List<Criterion> criteria;

    protected GeneratedCriteria() {
      super();
      criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
      return criteria.size() > 0;
    }

    public List<Criterion> getAllCriteria() {
      return criteria;
    }

    public List<Criterion> getCriteria() {
      return criteria;
    }

    protected void addCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      criteria.add(new Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      criteria.add(new Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
      if (value1 == null || value2 == null) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      criteria.add(new Criterion(condition, value1, value2));
    }

    public Criteria andGoodsIdIsNull() {
      addCriterion("goods_id is null");
      return (Criteria) this;
    }

    public Criteria andGoodsIdIsNotNull() {
      addCriterion("goods_id is not null");
      return (Criteria) this;
    }

    public Criteria andGoodsIdEqualTo(Integer value) {
      addCriterion("goods_id =", value, "goodsId");
      return (Criteria) this;
    }

    public Criteria andGoodsIdNotEqualTo(Integer value) {
      addCriterion("goods_id <>", value, "goodsId");
      return (Criteria) this;
    }

    public Criteria andGoodsIdGreaterThan(Integer value) {
      addCriterion("goods_id >", value, "goodsId");
      return (Criteria) this;
    }

    public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("goods_id >=", value, "goodsId");
      return (Criteria) this;
    }

    public Criteria andGoodsIdLessThan(Integer value) {
      addCriterion("goods_id <", value, "goodsId");
      return (Criteria) this;
    }

    public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
      addCriterion("goods_id <=", value, "goodsId");
      return (Criteria) this;
    }

    public Criteria andGoodsIdIn(List<Integer> values) {
      addCriterion("goods_id in", values, "goodsId");
      return (Criteria) this;
    }

    public Criteria andGoodsIdNotIn(List<Integer> values) {
      addCriterion("goods_id not in", values, "goodsId");
      return (Criteria) this;
    }

    public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
      addCriterion("goods_id between", value1, value2, "goodsId");
      return (Criteria) this;
    }

    public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
      addCriterion("goods_id not between", value1, value2, "goodsId");
      return (Criteria) this;
    }

    public Criteria andGoodsNameIsNull() {
      addCriterion("goods_name is null");
      return (Criteria) this;
    }

    public Criteria andGoodsNameIsNotNull() {
      addCriterion("goods_name is not null");
      return (Criteria) this;
    }

    public Criteria andGoodsNameEqualTo(String value) {
      addCriterion("goods_name =", value, "goodsName");
      return (Criteria) this;
    }

    public Criteria andGoodsNameNotEqualTo(String value) {
      addCriterion("goods_name <>", value, "goodsName");
      return (Criteria) this;
    }

    public Criteria andGoodsNameGreaterThan(String value) {
      addCriterion("goods_name >", value, "goodsName");
      return (Criteria) this;
    }

    public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
      addCriterion("goods_name >=", value, "goodsName");
      return (Criteria) this;
    }

    public Criteria andGoodsNameLessThan(String value) {
      addCriterion("goods_name <", value, "goodsName");
      return (Criteria) this;
    }

    public Criteria andGoodsNameLessThanOrEqualTo(String value) {
      addCriterion("goods_name <=", value, "goodsName");
      return (Criteria) this;
    }

    public Criteria andGoodsNameLike(String value) {
      addCriterion("goods_name like", value, "goodsName");
      return (Criteria) this;
    }

    public Criteria andGoodsNameNotLike(String value) {
      addCriterion("goods_name not like", value, "goodsName");
      return (Criteria) this;
    }

    public Criteria andGoodsNameIn(List<String> values) {
      addCriterion("goods_name in", values, "goodsName");
      return (Criteria) this;
    }

    public Criteria andGoodsNameNotIn(List<String> values) {
      addCriterion("goods_name not in", values, "goodsName");
      return (Criteria) this;
    }

    public Criteria andGoodsNameBetween(String value1, String value2) {
      addCriterion("goods_name between", value1, value2, "goodsName");
      return (Criteria) this;
    }

    public Criteria andGoodsNameNotBetween(String value1, String value2) {
      addCriterion("goods_name not between", value1, value2, "goodsName");
      return (Criteria) this;
    }

    public Criteria andGoodsCodeIsNull() {
      addCriterion("goods_code is null");
      return (Criteria) this;
    }

    public Criteria andGoodsCodeIsNotNull() {
      addCriterion("goods_code is not null");
      return (Criteria) this;
    }

    public Criteria andGoodsCodeEqualTo(String value) {
      addCriterion("goods_code =", value, "goodsCode");
      return (Criteria) this;
    }

    public Criteria andGoodsCodeNotEqualTo(String value) {
      addCriterion("goods_code <>", value, "goodsCode");
      return (Criteria) this;
    }

    public Criteria andGoodsCodeGreaterThan(String value) {
      addCriterion("goods_code >", value, "goodsCode");
      return (Criteria) this;
    }

    public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
      addCriterion("goods_code >=", value, "goodsCode");
      return (Criteria) this;
    }

    public Criteria andGoodsCodeLessThan(String value) {
      addCriterion("goods_code <", value, "goodsCode");
      return (Criteria) this;
    }

    public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
      addCriterion("goods_code <=", value, "goodsCode");
      return (Criteria) this;
    }

    public Criteria andGoodsCodeLike(String value) {
      addCriterion("goods_code like", value, "goodsCode");
      return (Criteria) this;
    }

    public Criteria andGoodsCodeNotLike(String value) {
      addCriterion("goods_code not like", value, "goodsCode");
      return (Criteria) this;
    }

    public Criteria andGoodsCodeIn(List<String> values) {
      addCriterion("goods_code in", values, "goodsCode");
      return (Criteria) this;
    }

    public Criteria andGoodsCodeNotIn(List<String> values) {
      addCriterion("goods_code not in", values, "goodsCode");
      return (Criteria) this;
    }

    public Criteria andGoodsCodeBetween(String value1, String value2) {
      addCriterion("goods_code between", value1, value2, "goodsCode");
      return (Criteria) this;
    }

    public Criteria andGoodsCodeNotBetween(String value1, String value2) {
      addCriterion("goods_code not between", value1, value2, "goodsCode");
      return (Criteria) this;
    }

    public Criteria andGoodsIconUrlIsNull() {
      addCriterion("goods_icon_url is null");
      return (Criteria) this;
    }

    public Criteria andGoodsIconUrlIsNotNull() {
      addCriterion("goods_icon_url is not null");
      return (Criteria) this;
    }

    public Criteria andGoodsIconUrlEqualTo(String value) {
      addCriterion("goods_icon_url =", value, "goodsIconUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsIconUrlNotEqualTo(String value) {
      addCriterion("goods_icon_url <>", value, "goodsIconUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsIconUrlGreaterThan(String value) {
      addCriterion("goods_icon_url >", value, "goodsIconUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsIconUrlGreaterThanOrEqualTo(String value) {
      addCriterion("goods_icon_url >=", value, "goodsIconUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsIconUrlLessThan(String value) {
      addCriterion("goods_icon_url <", value, "goodsIconUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsIconUrlLessThanOrEqualTo(String value) {
      addCriterion("goods_icon_url <=", value, "goodsIconUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsIconUrlLike(String value) {
      addCriterion("goods_icon_url like", value, "goodsIconUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsIconUrlNotLike(String value) {
      addCriterion("goods_icon_url not like", value, "goodsIconUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsIconUrlIn(List<String> values) {
      addCriterion("goods_icon_url in", values, "goodsIconUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsIconUrlNotIn(List<String> values) {
      addCriterion("goods_icon_url not in", values, "goodsIconUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsIconUrlBetween(String value1, String value2) {
      addCriterion("goods_icon_url between", value1, value2, "goodsIconUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsIconUrlNotBetween(String value1, String value2) {
      addCriterion("goods_icon_url not between", value1, value2, "goodsIconUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsImageUrlIsNull() {
      addCriterion("goods_image_url is null");
      return (Criteria) this;
    }

    public Criteria andGoodsImageUrlIsNotNull() {
      addCriterion("goods_image_url is not null");
      return (Criteria) this;
    }

    public Criteria andGoodsImageUrlEqualTo(String value) {
      addCriterion("goods_image_url =", value, "goodsImageUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsImageUrlNotEqualTo(String value) {
      addCriterion("goods_image_url <>", value, "goodsImageUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsImageUrlGreaterThan(String value) {
      addCriterion("goods_image_url >", value, "goodsImageUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsImageUrlGreaterThanOrEqualTo(String value) {
      addCriterion("goods_image_url >=", value, "goodsImageUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsImageUrlLessThan(String value) {
      addCriterion("goods_image_url <", value, "goodsImageUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsImageUrlLessThanOrEqualTo(String value) {
      addCriterion("goods_image_url <=", value, "goodsImageUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsImageUrlLike(String value) {
      addCriterion("goods_image_url like", value, "goodsImageUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsImageUrlNotLike(String value) {
      addCriterion("goods_image_url not like", value, "goodsImageUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsImageUrlIn(List<String> values) {
      addCriterion("goods_image_url in", values, "goodsImageUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsImageUrlNotIn(List<String> values) {
      addCriterion("goods_image_url not in", values, "goodsImageUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsImageUrlBetween(String value1, String value2) {
      addCriterion("goods_image_url between", value1, value2, "goodsImageUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsImageUrlNotBetween(String value1, String value2) {
      addCriterion("goods_image_url not between", value1, value2, "goodsImageUrl");
      return (Criteria) this;
    }

    public Criteria andGoodsExchangedNumIsNull() {
      addCriterion("goods_exchanged_num is null");
      return (Criteria) this;
    }

    public Criteria andGoodsExchangedNumIsNotNull() {
      addCriterion("goods_exchanged_num is not null");
      return (Criteria) this;
    }

    public Criteria andGoodsExchangedNumEqualTo(Integer value) {
      addCriterion("goods_exchanged_num =", value, "goodsExchangedNum");
      return (Criteria) this;
    }

    public Criteria andGoodsExchangedNumNotEqualTo(Integer value) {
      addCriterion("goods_exchanged_num <>", value, "goodsExchangedNum");
      return (Criteria) this;
    }

    public Criteria andGoodsExchangedNumGreaterThan(Integer value) {
      addCriterion("goods_exchanged_num >", value, "goodsExchangedNum");
      return (Criteria) this;
    }

    public Criteria andGoodsExchangedNumGreaterThanOrEqualTo(Integer value) {
      addCriterion("goods_exchanged_num >=", value, "goodsExchangedNum");
      return (Criteria) this;
    }

    public Criteria andGoodsExchangedNumLessThan(Integer value) {
      addCriterion("goods_exchanged_num <", value, "goodsExchangedNum");
      return (Criteria) this;
    }

    public Criteria andGoodsExchangedNumLessThanOrEqualTo(Integer value) {
      addCriterion("goods_exchanged_num <=", value, "goodsExchangedNum");
      return (Criteria) this;
    }

    public Criteria andGoodsExchangedNumIn(List<Integer> values) {
      addCriterion("goods_exchanged_num in", values, "goodsExchangedNum");
      return (Criteria) this;
    }

    public Criteria andGoodsExchangedNumNotIn(List<Integer> values) {
      addCriterion("goods_exchanged_num not in", values, "goodsExchangedNum");
      return (Criteria) this;
    }

    public Criteria andGoodsExchangedNumBetween(Integer value1, Integer value2) {
      addCriterion("goods_exchanged_num between", value1, value2, "goodsExchangedNum");
      return (Criteria) this;
    }

    public Criteria andGoodsExchangedNumNotBetween(Integer value1, Integer value2) {
      addCriterion("goods_exchanged_num not between", value1, value2, "goodsExchangedNum");
      return (Criteria) this;
    }

    public Criteria andGoodsOriginalPriceIsNull() {
      addCriterion("goods_original_price is null");
      return (Criteria) this;
    }

    public Criteria andGoodsOriginalPriceIsNotNull() {
      addCriterion("goods_original_price is not null");
      return (Criteria) this;
    }

    public Criteria andGoodsOriginalPriceEqualTo(String value) {
      addCriterion("goods_original_price =", value, "goodsOriginalPrice");
      return (Criteria) this;
    }

    public Criteria andGoodsOriginalPriceNotEqualTo(String value) {
      addCriterion("goods_original_price <>", value, "goodsOriginalPrice");
      return (Criteria) this;
    }

    public Criteria andGoodsOriginalPriceGreaterThan(String value) {
      addCriterion("goods_original_price >", value, "goodsOriginalPrice");
      return (Criteria) this;
    }

    public Criteria andGoodsOriginalPriceGreaterThanOrEqualTo(String value) {
      addCriterion("goods_original_price >=", value, "goodsOriginalPrice");
      return (Criteria) this;
    }

    public Criteria andGoodsOriginalPriceLessThan(String value) {
      addCriterion("goods_original_price <", value, "goodsOriginalPrice");
      return (Criteria) this;
    }

    public Criteria andGoodsOriginalPriceLessThanOrEqualTo(String value) {
      addCriterion("goods_original_price <=", value, "goodsOriginalPrice");
      return (Criteria) this;
    }

    public Criteria andGoodsOriginalPriceLike(String value) {
      addCriterion("goods_original_price like", value, "goodsOriginalPrice");
      return (Criteria) this;
    }

    public Criteria andGoodsOriginalPriceNotLike(String value) {
      addCriterion("goods_original_price not like", value, "goodsOriginalPrice");
      return (Criteria) this;
    }

    public Criteria andGoodsOriginalPriceIn(List<String> values) {
      addCriterion("goods_original_price in", values, "goodsOriginalPrice");
      return (Criteria) this;
    }

    public Criteria andGoodsOriginalPriceNotIn(List<String> values) {
      addCriterion("goods_original_price not in", values, "goodsOriginalPrice");
      return (Criteria) this;
    }

    public Criteria andGoodsOriginalPriceBetween(String value1, String value2) {
      addCriterion("goods_original_price between", value1, value2, "goodsOriginalPrice");
      return (Criteria) this;
    }

    public Criteria andGoodsOriginalPriceNotBetween(String value1, String value2) {
      addCriterion("goods_original_price not between", value1, value2, "goodsOriginalPrice");
      return (Criteria) this;
    }

    public Criteria andGoodsNeedIntegralIsNull() {
      addCriterion("goods_need_integral is null");
      return (Criteria) this;
    }

    public Criteria andGoodsNeedIntegralIsNotNull() {
      addCriterion("goods_need_integral is not null");
      return (Criteria) this;
    }

    public Criteria andGoodsNeedIntegralEqualTo(Integer value) {
      addCriterion("goods_need_integral =", value, "goodsNeedIntegral");
      return (Criteria) this;
    }

    public Criteria andGoodsNeedIntegralNotEqualTo(Integer value) {
      addCriterion("goods_need_integral <>", value, "goodsNeedIntegral");
      return (Criteria) this;
    }

    public Criteria andGoodsNeedIntegralGreaterThan(Integer value) {
      addCriterion("goods_need_integral >", value, "goodsNeedIntegral");
      return (Criteria) this;
    }

    public Criteria andGoodsNeedIntegralGreaterThanOrEqualTo(Integer value) {
      addCriterion("goods_need_integral >=", value, "goodsNeedIntegral");
      return (Criteria) this;
    }

    public Criteria andGoodsNeedIntegralLessThan(Integer value) {
      addCriterion("goods_need_integral <", value, "goodsNeedIntegral");
      return (Criteria) this;
    }

    public Criteria andGoodsNeedIntegralLessThanOrEqualTo(Integer value) {
      addCriterion("goods_need_integral <=", value, "goodsNeedIntegral");
      return (Criteria) this;
    }

    public Criteria andGoodsNeedIntegralIn(List<Integer> values) {
      addCriterion("goods_need_integral in", values, "goodsNeedIntegral");
      return (Criteria) this;
    }

    public Criteria andGoodsNeedIntegralNotIn(List<Integer> values) {
      addCriterion("goods_need_integral not in", values, "goodsNeedIntegral");
      return (Criteria) this;
    }

    public Criteria andGoodsNeedIntegralBetween(Integer value1, Integer value2) {
      addCriterion("goods_need_integral between", value1, value2, "goodsNeedIntegral");
      return (Criteria) this;
    }

    public Criteria andGoodsNeedIntegralNotBetween(Integer value1, Integer value2) {
      addCriterion("goods_need_integral not between", value1, value2, "goodsNeedIntegral");
      return (Criteria) this;
    }

    public Criteria andGoodsTitleIsNull() {
      addCriterion("goods_title is null");
      return (Criteria) this;
    }

    public Criteria andGoodsTitleIsNotNull() {
      addCriterion("goods_title is not null");
      return (Criteria) this;
    }

    public Criteria andGoodsTitleEqualTo(String value) {
      addCriterion("goods_title =", value, "goodsTitle");
      return (Criteria) this;
    }

    public Criteria andGoodsTitleNotEqualTo(String value) {
      addCriterion("goods_title <>", value, "goodsTitle");
      return (Criteria) this;
    }

    public Criteria andGoodsTitleGreaterThan(String value) {
      addCriterion("goods_title >", value, "goodsTitle");
      return (Criteria) this;
    }

    public Criteria andGoodsTitleGreaterThanOrEqualTo(String value) {
      addCriterion("goods_title >=", value, "goodsTitle");
      return (Criteria) this;
    }

    public Criteria andGoodsTitleLessThan(String value) {
      addCriterion("goods_title <", value, "goodsTitle");
      return (Criteria) this;
    }

    public Criteria andGoodsTitleLessThanOrEqualTo(String value) {
      addCriterion("goods_title <=", value, "goodsTitle");
      return (Criteria) this;
    }

    public Criteria andGoodsTitleLike(String value) {
      addCriterion("goods_title like", value, "goodsTitle");
      return (Criteria) this;
    }

    public Criteria andGoodsTitleNotLike(String value) {
      addCriterion("goods_title not like", value, "goodsTitle");
      return (Criteria) this;
    }

    public Criteria andGoodsTitleIn(List<String> values) {
      addCriterion("goods_title in", values, "goodsTitle");
      return (Criteria) this;
    }

    public Criteria andGoodsTitleNotIn(List<String> values) {
      addCriterion("goods_title not in", values, "goodsTitle");
      return (Criteria) this;
    }

    public Criteria andGoodsTitleBetween(String value1, String value2) {
      addCriterion("goods_title between", value1, value2, "goodsTitle");
      return (Criteria) this;
    }

    public Criteria andGoodsTitleNotBetween(String value1, String value2) {
      addCriterion("goods_title not between", value1, value2, "goodsTitle");
      return (Criteria) this;
    }

    public Criteria andGoodDescriptionIsNull() {
      addCriterion("good_description is null");
      return (Criteria) this;
    }

    public Criteria andGoodDescriptionIsNotNull() {
      addCriterion("good_description is not null");
      return (Criteria) this;
    }

    public Criteria andGoodDescriptionEqualTo(String value) {
      addCriterion("good_description =", value, "goodDescription");
      return (Criteria) this;
    }

    public Criteria andGoodDescriptionNotEqualTo(String value) {
      addCriterion("good_description <>", value, "goodDescription");
      return (Criteria) this;
    }

    public Criteria andGoodDescriptionGreaterThan(String value) {
      addCriterion("good_description >", value, "goodDescription");
      return (Criteria) this;
    }

    public Criteria andGoodDescriptionGreaterThanOrEqualTo(String value) {
      addCriterion("good_description >=", value, "goodDescription");
      return (Criteria) this;
    }

    public Criteria andGoodDescriptionLessThan(String value) {
      addCriterion("good_description <", value, "goodDescription");
      return (Criteria) this;
    }

    public Criteria andGoodDescriptionLessThanOrEqualTo(String value) {
      addCriterion("good_description <=", value, "goodDescription");
      return (Criteria) this;
    }

    public Criteria andGoodDescriptionLike(String value) {
      addCriterion("good_description like", value, "goodDescription");
      return (Criteria) this;
    }

    public Criteria andGoodDescriptionNotLike(String value) {
      addCriterion("good_description not like", value, "goodDescription");
      return (Criteria) this;
    }

    public Criteria andGoodDescriptionIn(List<String> values) {
      addCriterion("good_description in", values, "goodDescription");
      return (Criteria) this;
    }

    public Criteria andGoodDescriptionNotIn(List<String> values) {
      addCriterion("good_description not in", values, "goodDescription");
      return (Criteria) this;
    }

    public Criteria andGoodDescriptionBetween(String value1, String value2) {
      addCriterion("good_description between", value1, value2, "goodDescription");
      return (Criteria) this;
    }

    public Criteria andGoodDescriptionNotBetween(String value1, String value2) {
      addCriterion("good_description not between", value1, value2, "goodDescription");
      return (Criteria) this;
    }

    public Criteria andGoodTypeIsNull() {
      addCriterion("good_type is null");
      return (Criteria) this;
    }

    public Criteria andGoodTypeIsNotNull() {
      addCriterion("good_type is not null");
      return (Criteria) this;
    }

    public Criteria andGoodTypeEqualTo(Integer value) {
      addCriterion("good_type =", value, "goodType");
      return (Criteria) this;
    }

    public Criteria andGoodTypeNotEqualTo(Integer value) {
      addCriterion("good_type <>", value, "goodType");
      return (Criteria) this;
    }

    public Criteria andGoodTypeGreaterThan(Integer value) {
      addCriterion("good_type >", value, "goodType");
      return (Criteria) this;
    }

    public Criteria andGoodTypeGreaterThanOrEqualTo(Integer value) {
      addCriterion("good_type >=", value, "goodType");
      return (Criteria) this;
    }

    public Criteria andGoodTypeLessThan(Integer value) {
      addCriterion("good_type <", value, "goodType");
      return (Criteria) this;
    }

    public Criteria andGoodTypeLessThanOrEqualTo(Integer value) {
      addCriterion("good_type <=", value, "goodType");
      return (Criteria) this;
    }

    public Criteria andGoodTypeIn(List<Integer> values) {
      addCriterion("good_type in", values, "goodType");
      return (Criteria) this;
    }

    public Criteria andGoodTypeNotIn(List<Integer> values) {
      addCriterion("good_type not in", values, "goodType");
      return (Criteria) this;
    }

    public Criteria andGoodTypeBetween(Integer value1, Integer value2) {
      addCriterion("good_type between", value1, value2, "goodType");
      return (Criteria) this;
    }

    public Criteria andGoodTypeNotBetween(Integer value1, Integer value2) {
      addCriterion("good_type not between", value1, value2, "goodType");
      return (Criteria) this;
    }

    public Criteria andGoodStatusIsNull() {
      addCriterion("good_status is null");
      return (Criteria) this;
    }

    public Criteria andGoodStatusIsNotNull() {
      addCriterion("good_status is not null");
      return (Criteria) this;
    }

    public Criteria andGoodStatusEqualTo(Integer value) {
      addCriterion("good_status =", value, "goodStatus");
      return (Criteria) this;
    }

    public Criteria andGoodStatusNotEqualTo(Integer value) {
      addCriterion("good_status <>", value, "goodStatus");
      return (Criteria) this;
    }

    public Criteria andGoodStatusGreaterThan(Integer value) {
      addCriterion("good_status >", value, "goodStatus");
      return (Criteria) this;
    }

    public Criteria andGoodStatusGreaterThanOrEqualTo(Integer value) {
      addCriterion("good_status >=", value, "goodStatus");
      return (Criteria) this;
    }

    public Criteria andGoodStatusLessThan(Integer value) {
      addCriterion("good_status <", value, "goodStatus");
      return (Criteria) this;
    }

    public Criteria andGoodStatusLessThanOrEqualTo(Integer value) {
      addCriterion("good_status <=", value, "goodStatus");
      return (Criteria) this;
    }

    public Criteria andGoodStatusIn(List<Integer> values) {
      addCriterion("good_status in", values, "goodStatus");
      return (Criteria) this;
    }

    public Criteria andGoodStatusNotIn(List<Integer> values) {
      addCriterion("good_status not in", values, "goodStatus");
      return (Criteria) this;
    }

    public Criteria andGoodStatusBetween(Integer value1, Integer value2) {
      addCriterion("good_status between", value1, value2, "goodStatus");
      return (Criteria) this;
    }

    public Criteria andGoodStatusNotBetween(Integer value1, Integer value2) {
      addCriterion("good_status not between", value1, value2, "goodStatus");
      return (Criteria) this;
    }

    public Criteria andSortcodeIsNull() {
      addCriterion("sortcode is null");
      return (Criteria) this;
    }

    public Criteria andSortcodeIsNotNull() {
      addCriterion("sortcode is not null");
      return (Criteria) this;
    }

    public Criteria andSortcodeEqualTo(Integer value) {
      addCriterion("sortcode =", value, "sortcode");
      return (Criteria) this;
    }

    public Criteria andSortcodeNotEqualTo(Integer value) {
      addCriterion("sortcode <>", value, "sortcode");
      return (Criteria) this;
    }

    public Criteria andSortcodeGreaterThan(Integer value) {
      addCriterion("sortcode >", value, "sortcode");
      return (Criteria) this;
    }

    public Criteria andSortcodeGreaterThanOrEqualTo(Integer value) {
      addCriterion("sortcode >=", value, "sortcode");
      return (Criteria) this;
    }

    public Criteria andSortcodeLessThan(Integer value) {
      addCriterion("sortcode <", value, "sortcode");
      return (Criteria) this;
    }

    public Criteria andSortcodeLessThanOrEqualTo(Integer value) {
      addCriterion("sortcode <=", value, "sortcode");
      return (Criteria) this;
    }

    public Criteria andSortcodeIn(List<Integer> values) {
      addCriterion("sortcode in", values, "sortcode");
      return (Criteria) this;
    }

    public Criteria andSortcodeNotIn(List<Integer> values) {
      addCriterion("sortcode not in", values, "sortcode");
      return (Criteria) this;
    }

    public Criteria andSortcodeBetween(Integer value1, Integer value2) {
      addCriterion("sortcode between", value1, value2, "sortcode");
      return (Criteria) this;
    }

    public Criteria andSortcodeNotBetween(Integer value1, Integer value2) {
      addCriterion("sortcode not between", value1, value2, "sortcode");
      return (Criteria) this;
    }

    public Criteria andGoodCatIdIsNull() {
      addCriterion("good_cat_id is null");
      return (Criteria) this;
    }

    public Criteria andGoodCatIdIsNotNull() {
      addCriterion("good_cat_id is not null");
      return (Criteria) this;
    }

    public Criteria andGoodCatIdEqualTo(Integer value) {
      addCriterion("good_cat_id =", value, "goodCatId");
      return (Criteria) this;
    }

    public Criteria andGoodCatIdNotEqualTo(Integer value) {
      addCriterion("good_cat_id <>", value, "goodCatId");
      return (Criteria) this;
    }

    public Criteria andGoodCatIdGreaterThan(Integer value) {
      addCriterion("good_cat_id >", value, "goodCatId");
      return (Criteria) this;
    }

    public Criteria andGoodCatIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("good_cat_id >=", value, "goodCatId");
      return (Criteria) this;
    }

    public Criteria andGoodCatIdLessThan(Integer value) {
      addCriterion("good_cat_id <", value, "goodCatId");
      return (Criteria) this;
    }

    public Criteria andGoodCatIdLessThanOrEqualTo(Integer value) {
      addCriterion("good_cat_id <=", value, "goodCatId");
      return (Criteria) this;
    }

    public Criteria andGoodCatIdIn(List<Integer> values) {
      addCriterion("good_cat_id in", values, "goodCatId");
      return (Criteria) this;
    }

    public Criteria andGoodCatIdNotIn(List<Integer> values) {
      addCriterion("good_cat_id not in", values, "goodCatId");
      return (Criteria) this;
    }

    public Criteria andGoodCatIdBetween(Integer value1, Integer value2) {
      addCriterion("good_cat_id between", value1, value2, "goodCatId");
      return (Criteria) this;
    }

    public Criteria andGoodCatIdNotBetween(Integer value1, Integer value2) {
      addCriterion("good_cat_id not between", value1, value2, "goodCatId");
      return (Criteria) this;
    }

    public Criteria andLabelIdIsNull() {
      addCriterion("label_id is null");
      return (Criteria) this;
    }

    public Criteria andLabelIdIsNotNull() {
      addCriterion("label_id is not null");
      return (Criteria) this;
    }

    public Criteria andLabelIdEqualTo(Integer value) {
      addCriterion("label_id =", value, "labelId");
      return (Criteria) this;
    }

    public Criteria andLabelIdNotEqualTo(Integer value) {
      addCriterion("label_id <>", value, "labelId");
      return (Criteria) this;
    }

    public Criteria andLabelIdGreaterThan(Integer value) {
      addCriterion("label_id >", value, "labelId");
      return (Criteria) this;
    }

    public Criteria andLabelIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("label_id >=", value, "labelId");
      return (Criteria) this;
    }

    public Criteria andLabelIdLessThan(Integer value) {
      addCriterion("label_id <", value, "labelId");
      return (Criteria) this;
    }

    public Criteria andLabelIdLessThanOrEqualTo(Integer value) {
      addCriterion("label_id <=", value, "labelId");
      return (Criteria) this;
    }

    public Criteria andLabelIdIn(List<Integer> values) {
      addCriterion("label_id in", values, "labelId");
      return (Criteria) this;
    }

    public Criteria andLabelIdNotIn(List<Integer> values) {
      addCriterion("label_id not in", values, "labelId");
      return (Criteria) this;
    }

    public Criteria andLabelIdBetween(Integer value1, Integer value2) {
      addCriterion("label_id between", value1, value2, "labelId");
      return (Criteria) this;
    }

    public Criteria andLabelIdNotBetween(Integer value1, Integer value2) {
      addCriterion("label_id not between", value1, value2, "labelId");
      return (Criteria) this;
    }

    public Criteria andBeginSellTimeIsNull() {
      addCriterion("begin_sell_time is null");
      return (Criteria) this;
    }

    public Criteria andBeginSellTimeIsNotNull() {
      addCriterion("begin_sell_time is not null");
      return (Criteria) this;
    }

    public Criteria andBeginSellTimeEqualTo(Date value) {
      addCriterion("begin_sell_time =", value, "beginSellTime");
      return (Criteria) this;
    }

    public Criteria andBeginSellTimeNotEqualTo(Date value) {
      addCriterion("begin_sell_time <>", value, "beginSellTime");
      return (Criteria) this;
    }

    public Criteria andBeginSellTimeGreaterThan(Date value) {
      addCriterion("begin_sell_time >", value, "beginSellTime");
      return (Criteria) this;
    }

    public Criteria andBeginSellTimeGreaterThanOrEqualTo(Date value) {
      addCriterion("begin_sell_time >=", value, "beginSellTime");
      return (Criteria) this;
    }

    public Criteria andBeginSellTimeLessThan(Date value) {
      addCriterion("begin_sell_time <", value, "beginSellTime");
      return (Criteria) this;
    }

    public Criteria andBeginSellTimeLessThanOrEqualTo(Date value) {
      addCriterion("begin_sell_time <=", value, "beginSellTime");
      return (Criteria) this;
    }

    public Criteria andBeginSellTimeIn(List<Date> values) {
      addCriterion("begin_sell_time in", values, "beginSellTime");
      return (Criteria) this;
    }

    public Criteria andBeginSellTimeNotIn(List<Date> values) {
      addCriterion("begin_sell_time not in", values, "beginSellTime");
      return (Criteria) this;
    }

    public Criteria andBeginSellTimeBetween(Date value1, Date value2) {
      addCriterion("begin_sell_time between", value1, value2, "beginSellTime");
      return (Criteria) this;
    }

    public Criteria andBeginSellTimeNotBetween(Date value1, Date value2) {
      addCriterion("begin_sell_time not between", value1, value2, "beginSellTime");
      return (Criteria) this;
    }

    public Criteria andStopSellTimeIsNull() {
      addCriterion("stop_sell_time is null");
      return (Criteria) this;
    }

    public Criteria andStopSellTimeIsNotNull() {
      addCriterion("stop_sell_time is not null");
      return (Criteria) this;
    }

    public Criteria andStopSellTimeEqualTo(Date value) {
      addCriterion("stop_sell_time =", value, "stopSellTime");
      return (Criteria) this;
    }

    public Criteria andStopSellTimeNotEqualTo(Date value) {
      addCriterion("stop_sell_time <>", value, "stopSellTime");
      return (Criteria) this;
    }

    public Criteria andStopSellTimeGreaterThan(Date value) {
      addCriterion("stop_sell_time >", value, "stopSellTime");
      return (Criteria) this;
    }

    public Criteria andStopSellTimeGreaterThanOrEqualTo(Date value) {
      addCriterion("stop_sell_time >=", value, "stopSellTime");
      return (Criteria) this;
    }

    public Criteria andStopSellTimeLessThan(Date value) {
      addCriterion("stop_sell_time <", value, "stopSellTime");
      return (Criteria) this;
    }

    public Criteria andStopSellTimeLessThanOrEqualTo(Date value) {
      addCriterion("stop_sell_time <=", value, "stopSellTime");
      return (Criteria) this;
    }

    public Criteria andStopSellTimeIn(List<Date> values) {
      addCriterion("stop_sell_time in", values, "stopSellTime");
      return (Criteria) this;
    }

    public Criteria andStopSellTimeNotIn(List<Date> values) {
      addCriterion("stop_sell_time not in", values, "stopSellTime");
      return (Criteria) this;
    }

    public Criteria andStopSellTimeBetween(Date value1, Date value2) {
      addCriterion("stop_sell_time between", value1, value2, "stopSellTime");
      return (Criteria) this;
    }

    public Criteria andStopSellTimeNotBetween(Date value1, Date value2) {
      addCriterion("stop_sell_time not between", value1, value2, "stopSellTime");
      return (Criteria) this;
    }

    public Criteria andDeletemarkIsNull() {
      addCriterion("deletemark is null");
      return (Criteria) this;
    }

    public Criteria andDeletemarkIsNotNull() {
      addCriterion("deletemark is not null");
      return (Criteria) this;
    }

    public Criteria andDeletemarkEqualTo(String value) {
      addCriterion("deletemark =", value, "deletemark");
      return (Criteria) this;
    }

    public Criteria andDeletemarkNotEqualTo(String value) {
      addCriterion("deletemark <>", value, "deletemark");
      return (Criteria) this;
    }

    public Criteria andDeletemarkGreaterThan(String value) {
      addCriterion("deletemark >", value, "deletemark");
      return (Criteria) this;
    }

    public Criteria andDeletemarkGreaterThanOrEqualTo(String value) {
      addCriterion("deletemark >=", value, "deletemark");
      return (Criteria) this;
    }

    public Criteria andDeletemarkLessThan(String value) {
      addCriterion("deletemark <", value, "deletemark");
      return (Criteria) this;
    }

    public Criteria andDeletemarkLessThanOrEqualTo(String value) {
      addCriterion("deletemark <=", value, "deletemark");
      return (Criteria) this;
    }

    public Criteria andDeletemarkLike(String value) {
      addCriterion("deletemark like", value, "deletemark");
      return (Criteria) this;
    }

    public Criteria andDeletemarkNotLike(String value) {
      addCriterion("deletemark not like", value, "deletemark");
      return (Criteria) this;
    }

    public Criteria andDeletemarkIn(List<String> values) {
      addCriterion("deletemark in", values, "deletemark");
      return (Criteria) this;
    }

    public Criteria andDeletemarkNotIn(List<String> values) {
      addCriterion("deletemark not in", values, "deletemark");
      return (Criteria) this;
    }

    public Criteria andDeletemarkBetween(String value1, String value2) {
      addCriterion("deletemark between", value1, value2, "deletemark");
      return (Criteria) this;
    }

    public Criteria andDeletemarkNotBetween(String value1, String value2) {
      addCriterion("deletemark not between", value1, value2, "deletemark");
      return (Criteria) this;
    }

    public Criteria andCreatedateIsNull() {
      addCriterion("CreateDate is null");
      return (Criteria) this;
    }

    public Criteria andCreatedateIsNotNull() {
      addCriterion("CreateDate is not null");
      return (Criteria) this;
    }

    public Criteria andCreatedateEqualTo(Date value) {
      addCriterion("CreateDate =", value, "createdate");
      return (Criteria) this;
    }

    public Criteria andCreatedateNotEqualTo(Date value) {
      addCriterion("CreateDate <>", value, "createdate");
      return (Criteria) this;
    }

    public Criteria andCreatedateGreaterThan(Date value) {
      addCriterion("CreateDate >", value, "createdate");
      return (Criteria) this;
    }

    public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
      addCriterion("CreateDate >=", value, "createdate");
      return (Criteria) this;
    }

    public Criteria andCreatedateLessThan(Date value) {
      addCriterion("CreateDate <", value, "createdate");
      return (Criteria) this;
    }

    public Criteria andCreatedateLessThanOrEqualTo(Date value) {
      addCriterion("CreateDate <=", value, "createdate");
      return (Criteria) this;
    }

    public Criteria andCreatedateIn(List<Date> values) {
      addCriterion("CreateDate in", values, "createdate");
      return (Criteria) this;
    }

    public Criteria andCreatedateNotIn(List<Date> values) {
      addCriterion("CreateDate not in", values, "createdate");
      return (Criteria) this;
    }

    public Criteria andCreatedateBetween(Date value1, Date value2) {
      addCriterion("CreateDate between", value1, value2, "createdate");
      return (Criteria) this;
    }

    public Criteria andCreatedateNotBetween(Date value1, Date value2) {
      addCriterion("CreateDate not between", value1, value2, "createdate");
      return (Criteria) this;
    }

    public Criteria andCreateuseridIsNull() {
      addCriterion("CreateUserId is null");
      return (Criteria) this;
    }

    public Criteria andCreateuseridIsNotNull() {
      addCriterion("CreateUserId is not null");
      return (Criteria) this;
    }

    public Criteria andCreateuseridEqualTo(Integer value) {
      addCriterion("CreateUserId =", value, "createuserid");
      return (Criteria) this;
    }

    public Criteria andCreateuseridNotEqualTo(Integer value) {
      addCriterion("CreateUserId <>", value, "createuserid");
      return (Criteria) this;
    }

    public Criteria andCreateuseridGreaterThan(Integer value) {
      addCriterion("CreateUserId >", value, "createuserid");
      return (Criteria) this;
    }

    public Criteria andCreateuseridGreaterThanOrEqualTo(Integer value) {
      addCriterion("CreateUserId >=", value, "createuserid");
      return (Criteria) this;
    }

    public Criteria andCreateuseridLessThan(Integer value) {
      addCriterion("CreateUserId <", value, "createuserid");
      return (Criteria) this;
    }

    public Criteria andCreateuseridLessThanOrEqualTo(Integer value) {
      addCriterion("CreateUserId <=", value, "createuserid");
      return (Criteria) this;
    }

    public Criteria andCreateuseridIn(List<Integer> values) {
      addCriterion("CreateUserId in", values, "createuserid");
      return (Criteria) this;
    }

    public Criteria andCreateuseridNotIn(List<Integer> values) {
      addCriterion("CreateUserId not in", values, "createuserid");
      return (Criteria) this;
    }

    public Criteria andCreateuseridBetween(Integer value1, Integer value2) {
      addCriterion("CreateUserId between", value1, value2, "createuserid");
      return (Criteria) this;
    }

    public Criteria andCreateuseridNotBetween(Integer value1, Integer value2) {
      addCriterion("CreateUserId not between", value1, value2, "createuserid");
      return (Criteria) this;
    }

    public Criteria andCreateusernameIsNull() {
      addCriterion("CreateUserName is null");
      return (Criteria) this;
    }

    public Criteria andCreateusernameIsNotNull() {
      addCriterion("CreateUserName is not null");
      return (Criteria) this;
    }

    public Criteria andCreateusernameEqualTo(String value) {
      addCriterion("CreateUserName =", value, "createusername");
      return (Criteria) this;
    }

    public Criteria andCreateusernameNotEqualTo(String value) {
      addCriterion("CreateUserName <>", value, "createusername");
      return (Criteria) this;
    }

    public Criteria andCreateusernameGreaterThan(String value) {
      addCriterion("CreateUserName >", value, "createusername");
      return (Criteria) this;
    }

    public Criteria andCreateusernameGreaterThanOrEqualTo(String value) {
      addCriterion("CreateUserName >=", value, "createusername");
      return (Criteria) this;
    }

    public Criteria andCreateusernameLessThan(String value) {
      addCriterion("CreateUserName <", value, "createusername");
      return (Criteria) this;
    }

    public Criteria andCreateusernameLessThanOrEqualTo(String value) {
      addCriterion("CreateUserName <=", value, "createusername");
      return (Criteria) this;
    }

    public Criteria andCreateusernameLike(String value) {
      addCriterion("CreateUserName like", value, "createusername");
      return (Criteria) this;
    }

    public Criteria andCreateusernameNotLike(String value) {
      addCriterion("CreateUserName not like", value, "createusername");
      return (Criteria) this;
    }

    public Criteria andCreateusernameIn(List<String> values) {
      addCriterion("CreateUserName in", values, "createusername");
      return (Criteria) this;
    }

    public Criteria andCreateusernameNotIn(List<String> values) {
      addCriterion("CreateUserName not in", values, "createusername");
      return (Criteria) this;
    }

    public Criteria andCreateusernameBetween(String value1, String value2) {
      addCriterion("CreateUserName between", value1, value2, "createusername");
      return (Criteria) this;
    }

    public Criteria andCreateusernameNotBetween(String value1, String value2) {
      addCriterion("CreateUserName not between", value1, value2, "createusername");
      return (Criteria) this;
    }

    public Criteria andModifydateIsNull() {
      addCriterion("ModifyDate is null");
      return (Criteria) this;
    }

    public Criteria andModifydateIsNotNull() {
      addCriterion("ModifyDate is not null");
      return (Criteria) this;
    }

    public Criteria andModifydateEqualTo(Date value) {
      addCriterion("ModifyDate =", value, "modifydate");
      return (Criteria) this;
    }

    public Criteria andModifydateNotEqualTo(Date value) {
      addCriterion("ModifyDate <>", value, "modifydate");
      return (Criteria) this;
    }

    public Criteria andModifydateGreaterThan(Date value) {
      addCriterion("ModifyDate >", value, "modifydate");
      return (Criteria) this;
    }

    public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
      addCriterion("ModifyDate >=", value, "modifydate");
      return (Criteria) this;
    }

    public Criteria andModifydateLessThan(Date value) {
      addCriterion("ModifyDate <", value, "modifydate");
      return (Criteria) this;
    }

    public Criteria andModifydateLessThanOrEqualTo(Date value) {
      addCriterion("ModifyDate <=", value, "modifydate");
      return (Criteria) this;
    }

    public Criteria andModifydateIn(List<Date> values) {
      addCriterion("ModifyDate in", values, "modifydate");
      return (Criteria) this;
    }

    public Criteria andModifydateNotIn(List<Date> values) {
      addCriterion("ModifyDate not in", values, "modifydate");
      return (Criteria) this;
    }

    public Criteria andModifydateBetween(Date value1, Date value2) {
      addCriterion("ModifyDate between", value1, value2, "modifydate");
      return (Criteria) this;
    }

    public Criteria andModifydateNotBetween(Date value1, Date value2) {
      addCriterion("ModifyDate not between", value1, value2, "modifydate");
      return (Criteria) this;
    }

    public Criteria andModifyuseridIsNull() {
      addCriterion("ModifyUserId is null");
      return (Criteria) this;
    }

    public Criteria andModifyuseridIsNotNull() {
      addCriterion("ModifyUserId is not null");
      return (Criteria) this;
    }

    public Criteria andModifyuseridEqualTo(Integer value) {
      addCriterion("ModifyUserId =", value, "modifyuserid");
      return (Criteria) this;
    }

    public Criteria andModifyuseridNotEqualTo(Integer value) {
      addCriterion("ModifyUserId <>", value, "modifyuserid");
      return (Criteria) this;
    }

    public Criteria andModifyuseridGreaterThan(Integer value) {
      addCriterion("ModifyUserId >", value, "modifyuserid");
      return (Criteria) this;
    }

    public Criteria andModifyuseridGreaterThanOrEqualTo(Integer value) {
      addCriterion("ModifyUserId >=", value, "modifyuserid");
      return (Criteria) this;
    }

    public Criteria andModifyuseridLessThan(Integer value) {
      addCriterion("ModifyUserId <", value, "modifyuserid");
      return (Criteria) this;
    }

    public Criteria andModifyuseridLessThanOrEqualTo(Integer value) {
      addCriterion("ModifyUserId <=", value, "modifyuserid");
      return (Criteria) this;
    }

    public Criteria andModifyuseridIn(List<Integer> values) {
      addCriterion("ModifyUserId in", values, "modifyuserid");
      return (Criteria) this;
    }

    public Criteria andModifyuseridNotIn(List<Integer> values) {
      addCriterion("ModifyUserId not in", values, "modifyuserid");
      return (Criteria) this;
    }

    public Criteria andModifyuseridBetween(Integer value1, Integer value2) {
      addCriterion("ModifyUserId between", value1, value2, "modifyuserid");
      return (Criteria) this;
    }

    public Criteria andModifyuseridNotBetween(Integer value1, Integer value2) {
      addCriterion("ModifyUserId not between", value1, value2, "modifyuserid");
      return (Criteria) this;
    }

    public Criteria andModifyusernameIsNull() {
      addCriterion("ModifyUserName is null");
      return (Criteria) this;
    }

    public Criteria andModifyusernameIsNotNull() {
      addCriterion("ModifyUserName is not null");
      return (Criteria) this;
    }

    public Criteria andModifyusernameEqualTo(String value) {
      addCriterion("ModifyUserName =", value, "modifyusername");
      return (Criteria) this;
    }

    public Criteria andModifyusernameNotEqualTo(String value) {
      addCriterion("ModifyUserName <>", value, "modifyusername");
      return (Criteria) this;
    }

    public Criteria andModifyusernameGreaterThan(String value) {
      addCriterion("ModifyUserName >", value, "modifyusername");
      return (Criteria) this;
    }

    public Criteria andModifyusernameGreaterThanOrEqualTo(String value) {
      addCriterion("ModifyUserName >=", value, "modifyusername");
      return (Criteria) this;
    }

    public Criteria andModifyusernameLessThan(String value) {
      addCriterion("ModifyUserName <", value, "modifyusername");
      return (Criteria) this;
    }

    public Criteria andModifyusernameLessThanOrEqualTo(String value) {
      addCriterion("ModifyUserName <=", value, "modifyusername");
      return (Criteria) this;
    }

    public Criteria andModifyusernameLike(String value) {
      addCriterion("ModifyUserName like", value, "modifyusername");
      return (Criteria) this;
    }

    public Criteria andModifyusernameNotLike(String value) {
      addCriterion("ModifyUserName not like", value, "modifyusername");
      return (Criteria) this;
    }

    public Criteria andModifyusernameIn(List<String> values) {
      addCriterion("ModifyUserName in", values, "modifyusername");
      return (Criteria) this;
    }

    public Criteria andModifyusernameNotIn(List<String> values) {
      addCriterion("ModifyUserName not in", values, "modifyusername");
      return (Criteria) this;
    }

    public Criteria andModifyusernameBetween(String value1, String value2) {
      addCriterion("ModifyUserName between", value1, value2, "modifyusername");
      return (Criteria) this;
    }

    public Criteria andModifyusernameNotBetween(String value1, String value2) {
      addCriterion("ModifyUserName not between", value1, value2, "modifyusername");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierTypeIsNull() {
      addCriterion("goods_supplier_type is null");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierTypeIsNotNull() {
      addCriterion("goods_supplier_type is not null");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierTypeEqualTo(Integer value) {
      addCriterion("goods_supplier_type =", value, "goodsSupplierType");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierTypeNotEqualTo(Integer value) {
      addCriterion("goods_supplier_type <>", value, "goodsSupplierType");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierTypeGreaterThan(Integer value) {
      addCriterion("goods_supplier_type >", value, "goodsSupplierType");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierTypeGreaterThanOrEqualTo(Integer value) {
      addCriterion("goods_supplier_type >=", value, "goodsSupplierType");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierTypeLessThan(Integer value) {
      addCriterion("goods_supplier_type <", value, "goodsSupplierType");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierTypeLessThanOrEqualTo(Integer value) {
      addCriterion("goods_supplier_type <=", value, "goodsSupplierType");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierTypeIn(List<Integer> values) {
      addCriterion("goods_supplier_type in", values, "goodsSupplierType");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierTypeNotIn(List<Integer> values) {
      addCriterion("goods_supplier_type not in", values, "goodsSupplierType");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierTypeBetween(Integer value1, Integer value2) {
      addCriterion("goods_supplier_type between", value1, value2, "goodsSupplierType");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierTypeNotBetween(Integer value1, Integer value2) {
      addCriterion("goods_supplier_type not between", value1, value2, "goodsSupplierType");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierIsNull() {
      addCriterion("goods_supplier is null");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierIsNotNull() {
      addCriterion("goods_supplier is not null");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierEqualTo(String value) {
      addCriterion("goods_supplier =", value, "goodsSupplier");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierNotEqualTo(String value) {
      addCriterion("goods_supplier <>", value, "goodsSupplier");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierGreaterThan(String value) {
      addCriterion("goods_supplier >", value, "goodsSupplier");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierGreaterThanOrEqualTo(String value) {
      addCriterion("goods_supplier >=", value, "goodsSupplier");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierLessThan(String value) {
      addCriterion("goods_supplier <", value, "goodsSupplier");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierLessThanOrEqualTo(String value) {
      addCriterion("goods_supplier <=", value, "goodsSupplier");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierLike(String value) {
      addCriterion("goods_supplier like", value, "goodsSupplier");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierNotLike(String value) {
      addCriterion("goods_supplier not like", value, "goodsSupplier");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierIn(List<String> values) {
      addCriterion("goods_supplier in", values, "goodsSupplier");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierNotIn(List<String> values) {
      addCriterion("goods_supplier not in", values, "goodsSupplier");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierBetween(String value1, String value2) {
      addCriterion("goods_supplier between", value1, value2, "goodsSupplier");
      return (Criteria) this;
    }

    public Criteria andGoodsSupplierNotBetween(String value1, String value2) {
      addCriterion("goods_supplier not between", value1, value2, "goodsSupplier");
      return (Criteria) this;
    }

    public Criteria andProductCodeIsNull() {
      addCriterion("product_code is null");
      return (Criteria) this;
    }

    public Criteria andProductCodeIsNotNull() {
      addCriterion("product_code is not null");
      return (Criteria) this;
    }

    public Criteria andProductCodeEqualTo(String value) {
      addCriterion("product_code =", value, "productCode");
      return (Criteria) this;
    }

    public Criteria andProductCodeNotEqualTo(String value) {
      addCriterion("product_code <>", value, "productCode");
      return (Criteria) this;
    }

    public Criteria andProductCodeGreaterThan(String value) {
      addCriterion("product_code >", value, "productCode");
      return (Criteria) this;
    }

    public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
      addCriterion("product_code >=", value, "productCode");
      return (Criteria) this;
    }

    public Criteria andProductCodeLessThan(String value) {
      addCriterion("product_code <", value, "productCode");
      return (Criteria) this;
    }

    public Criteria andProductCodeLessThanOrEqualTo(String value) {
      addCriterion("product_code <=", value, "productCode");
      return (Criteria) this;
    }

    public Criteria andProductCodeLike(String value) {
      addCriterion("product_code like", value, "productCode");
      return (Criteria) this;
    }

    public Criteria andProductCodeNotLike(String value) {
      addCriterion("product_code not like", value, "productCode");
      return (Criteria) this;
    }

    public Criteria andProductCodeIn(List<String> values) {
      addCriterion("product_code in", values, "productCode");
      return (Criteria) this;
    }

    public Criteria andProductCodeNotIn(List<String> values) {
      addCriterion("product_code not in", values, "productCode");
      return (Criteria) this;
    }

    public Criteria andProductCodeBetween(String value1, String value2) {
      addCriterion("product_code between", value1, value2, "productCode");
      return (Criteria) this;
    }

    public Criteria andProductCodeNotBetween(String value1, String value2) {
      addCriterion("product_code not between", value1, value2, "productCode");
      return (Criteria) this;
    }

    public Criteria andGoodsInventoryIsNull() {
      addCriterion("goods_inventory is null");
      return (Criteria) this;
    }

    public Criteria andGoodsInventoryIsNotNull() {
      addCriterion("goods_inventory is not null");
      return (Criteria) this;
    }

    public Criteria andGoodsInventoryEqualTo(Integer value) {
      addCriterion("goods_inventory =", value, "goodsInventory");
      return (Criteria) this;
    }

    public Criteria andGoodsInventoryNotEqualTo(Integer value) {
      addCriterion("goods_inventory <>", value, "goodsInventory");
      return (Criteria) this;
    }

    public Criteria andGoodsInventoryGreaterThan(Integer value) {
      addCriterion("goods_inventory >", value, "goodsInventory");
      return (Criteria) this;
    }

    public Criteria andGoodsInventoryGreaterThanOrEqualTo(Integer value) {
      addCriterion("goods_inventory >=", value, "goodsInventory");
      return (Criteria) this;
    }

    public Criteria andGoodsInventoryLessThan(Integer value) {
      addCriterion("goods_inventory <", value, "goodsInventory");
      return (Criteria) this;
    }

    public Criteria andGoodsInventoryLessThanOrEqualTo(Integer value) {
      addCriterion("goods_inventory <=", value, "goodsInventory");
      return (Criteria) this;
    }

    public Criteria andGoodsInventoryIn(List<Integer> values) {
      addCriterion("goods_inventory in", values, "goodsInventory");
      return (Criteria) this;
    }

    public Criteria andGoodsInventoryNotIn(List<Integer> values) {
      addCriterion("goods_inventory not in", values, "goodsInventory");
      return (Criteria) this;
    }

    public Criteria andGoodsInventoryBetween(Integer value1, Integer value2) {
      addCriterion("goods_inventory between", value1, value2, "goodsInventory");
      return (Criteria) this;
    }

    public Criteria andGoodsInventoryNotBetween(Integer value1, Integer value2) {
      addCriterion("goods_inventory not between", value1, value2, "goodsInventory");
      return (Criteria) this;
    }
  }

  public static class Criteria extends GeneratedCriteria {

    protected Criteria() {
      super();
    }
  }

  public static class Criterion {
    private String condition;

    private Object value;

    private Object secondValue;

    private boolean noValue;

    private boolean singleValue;

    private boolean betweenValue;

    private boolean listValue;

    private String typeHandler;

    public String getCondition() {
      return condition;
    }

    public Object getValue() {
      return value;
    }

    public Object getSecondValue() {
      return secondValue;
    }

    public boolean isNoValue() {
      return noValue;
    }

    public boolean isSingleValue() {
      return singleValue;
    }

    public boolean isBetweenValue() {
      return betweenValue;
    }

    public boolean isListValue() {
      return listValue;
    }

    public String getTypeHandler() {
      return typeHandler;
    }

    protected Criterion(String condition) {
      super();
      this.condition = condition;
      this.typeHandler = null;
      this.noValue = true;
    }

    protected Criterion(String condition, Object value, String typeHandler) {
      super();
      this.condition = condition;
      this.value = value;
      this.typeHandler = typeHandler;
      if (value instanceof List<?>) {
        this.listValue = true;
      } else {
        this.singleValue = true;
      }
    }

    protected Criterion(String condition, Object value) {
      this(condition, value, null);
    }

    protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
      super();
      this.condition = condition;
      this.value = value;
      this.secondValue = secondValue;
      this.typeHandler = typeHandler;
      this.betweenValue = true;
    }

    protected Criterion(String condition, Object value, Object secondValue) {
      this(condition, value, secondValue, null);
    }
  }
}
