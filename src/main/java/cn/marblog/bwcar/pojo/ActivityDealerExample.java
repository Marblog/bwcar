package cn.marblog.bwcar.pojo;

import java.util.ArrayList;
import java.util.List;

public class ActivityDealerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityDealerExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNull() {
            addCriterion("dealer_id is null");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNotNull() {
            addCriterion("dealer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealerIdEqualTo(Integer value) {
            addCriterion("dealer_id =", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotEqualTo(Integer value) {
            addCriterion("dealer_id <>", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThan(Integer value) {
            addCriterion("dealer_id >", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dealer_id >=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThan(Integer value) {
            addCriterion("dealer_id <", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThanOrEqualTo(Integer value) {
            addCriterion("dealer_id <=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdIn(List<Integer> values) {
            addCriterion("dealer_id in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotIn(List<Integer> values) {
            addCriterion("dealer_id not in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdBetween(Integer value1, Integer value2) {
            addCriterion("dealer_id between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dealer_id not between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerProvinceIsNull() {
            addCriterion("dealer_province is null");
            return (Criteria) this;
        }

        public Criteria andDealerProvinceIsNotNull() {
            addCriterion("dealer_province is not null");
            return (Criteria) this;
        }

        public Criteria andDealerProvinceEqualTo(String value) {
            addCriterion("dealer_province =", value, "dealerProvince");
            return (Criteria) this;
        }

        public Criteria andDealerProvinceNotEqualTo(String value) {
            addCriterion("dealer_province <>", value, "dealerProvince");
            return (Criteria) this;
        }

        public Criteria andDealerProvinceGreaterThan(String value) {
            addCriterion("dealer_province >", value, "dealerProvince");
            return (Criteria) this;
        }

        public Criteria andDealerProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_province >=", value, "dealerProvince");
            return (Criteria) this;
        }

        public Criteria andDealerProvinceLessThan(String value) {
            addCriterion("dealer_province <", value, "dealerProvince");
            return (Criteria) this;
        }

        public Criteria andDealerProvinceLessThanOrEqualTo(String value) {
            addCriterion("dealer_province <=", value, "dealerProvince");
            return (Criteria) this;
        }

        public Criteria andDealerProvinceLike(String value) {
            addCriterion("dealer_province like", value, "dealerProvince");
            return (Criteria) this;
        }

        public Criteria andDealerProvinceNotLike(String value) {
            addCriterion("dealer_province not like", value, "dealerProvince");
            return (Criteria) this;
        }

        public Criteria andDealerProvinceIn(List<String> values) {
            addCriterion("dealer_province in", values, "dealerProvince");
            return (Criteria) this;
        }

        public Criteria andDealerProvinceNotIn(List<String> values) {
            addCriterion("dealer_province not in", values, "dealerProvince");
            return (Criteria) this;
        }

        public Criteria andDealerProvinceBetween(String value1, String value2) {
            addCriterion("dealer_province between", value1, value2, "dealerProvince");
            return (Criteria) this;
        }

        public Criteria andDealerProvinceNotBetween(String value1, String value2) {
            addCriterion("dealer_province not between", value1, value2, "dealerProvince");
            return (Criteria) this;
        }

        public Criteria andDealerCityIsNull() {
            addCriterion("dealer_city is null");
            return (Criteria) this;
        }

        public Criteria andDealerCityIsNotNull() {
            addCriterion("dealer_city is not null");
            return (Criteria) this;
        }

        public Criteria andDealerCityEqualTo(String value) {
            addCriterion("dealer_city =", value, "dealerCity");
            return (Criteria) this;
        }

        public Criteria andDealerCityNotEqualTo(String value) {
            addCriterion("dealer_city <>", value, "dealerCity");
            return (Criteria) this;
        }

        public Criteria andDealerCityGreaterThan(String value) {
            addCriterion("dealer_city >", value, "dealerCity");
            return (Criteria) this;
        }

        public Criteria andDealerCityGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_city >=", value, "dealerCity");
            return (Criteria) this;
        }

        public Criteria andDealerCityLessThan(String value) {
            addCriterion("dealer_city <", value, "dealerCity");
            return (Criteria) this;
        }

        public Criteria andDealerCityLessThanOrEqualTo(String value) {
            addCriterion("dealer_city <=", value, "dealerCity");
            return (Criteria) this;
        }

        public Criteria andDealerCityLike(String value) {
            addCriterion("dealer_city like", value, "dealerCity");
            return (Criteria) this;
        }

        public Criteria andDealerCityNotLike(String value) {
            addCriterion("dealer_city not like", value, "dealerCity");
            return (Criteria) this;
        }

        public Criteria andDealerCityIn(List<String> values) {
            addCriterion("dealer_city in", values, "dealerCity");
            return (Criteria) this;
        }

        public Criteria andDealerCityNotIn(List<String> values) {
            addCriterion("dealer_city not in", values, "dealerCity");
            return (Criteria) this;
        }

        public Criteria andDealerCityBetween(String value1, String value2) {
            addCriterion("dealer_city between", value1, value2, "dealerCity");
            return (Criteria) this;
        }

        public Criteria andDealerCityNotBetween(String value1, String value2) {
            addCriterion("dealer_city not between", value1, value2, "dealerCity");
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