package cn.marblog.bwcar.pojo;

import java.util.ArrayList;
import java.util.List;

public class MemberFavExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberFavExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andFavTypeIsNull() {
            addCriterion("fav_type is null");
            return (Criteria) this;
        }

        public Criteria andFavTypeIsNotNull() {
            addCriterion("fav_type is not null");
            return (Criteria) this;
        }

        public Criteria andFavTypeEqualTo(Byte value) {
            addCriterion("fav_type =", value, "favType");
            return (Criteria) this;
        }

        public Criteria andFavTypeNotEqualTo(Byte value) {
            addCriterion("fav_type <>", value, "favType");
            return (Criteria) this;
        }

        public Criteria andFavTypeGreaterThan(Byte value) {
            addCriterion("fav_type >", value, "favType");
            return (Criteria) this;
        }

        public Criteria andFavTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("fav_type >=", value, "favType");
            return (Criteria) this;
        }

        public Criteria andFavTypeLessThan(Byte value) {
            addCriterion("fav_type <", value, "favType");
            return (Criteria) this;
        }

        public Criteria andFavTypeLessThanOrEqualTo(Byte value) {
            addCriterion("fav_type <=", value, "favType");
            return (Criteria) this;
        }

        public Criteria andFavTypeIn(List<Byte> values) {
            addCriterion("fav_type in", values, "favType");
            return (Criteria) this;
        }

        public Criteria andFavTypeNotIn(List<Byte> values) {
            addCriterion("fav_type not in", values, "favType");
            return (Criteria) this;
        }

        public Criteria andFavTypeBetween(Byte value1, Byte value2) {
            addCriterion("fav_type between", value1, value2, "favType");
            return (Criteria) this;
        }

        public Criteria andFavTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("fav_type not between", value1, value2, "favType");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNull() {
            addCriterion("content_id is null");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNotNull() {
            addCriterion("content_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentIdEqualTo(Long value) {
            addCriterion("content_id =", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotEqualTo(Long value) {
            addCriterion("content_id <>", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThan(Long value) {
            addCriterion("content_id >", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("content_id >=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThan(Long value) {
            addCriterion("content_id <", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThanOrEqualTo(Long value) {
            addCriterion("content_id <=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdIn(List<Long> values) {
            addCriterion("content_id in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotIn(List<Long> values) {
            addCriterion("content_id not in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdBetween(Long value1, Long value2) {
            addCriterion("content_id between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotBetween(Long value1, Long value2) {
            addCriterion("content_id not between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andFavTimeIsNull() {
            addCriterion("fav_time is null");
            return (Criteria) this;
        }

        public Criteria andFavTimeIsNotNull() {
            addCriterion("fav_time is not null");
            return (Criteria) this;
        }

        public Criteria andFavTimeEqualTo(Long value) {
            addCriterion("fav_time =", value, "favTime");
            return (Criteria) this;
        }

        public Criteria andFavTimeNotEqualTo(Long value) {
            addCriterion("fav_time <>", value, "favTime");
            return (Criteria) this;
        }

        public Criteria andFavTimeGreaterThan(Long value) {
            addCriterion("fav_time >", value, "favTime");
            return (Criteria) this;
        }

        public Criteria andFavTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("fav_time >=", value, "favTime");
            return (Criteria) this;
        }

        public Criteria andFavTimeLessThan(Long value) {
            addCriterion("fav_time <", value, "favTime");
            return (Criteria) this;
        }

        public Criteria andFavTimeLessThanOrEqualTo(Long value) {
            addCriterion("fav_time <=", value, "favTime");
            return (Criteria) this;
        }

        public Criteria andFavTimeIn(List<Long> values) {
            addCriterion("fav_time in", values, "favTime");
            return (Criteria) this;
        }

        public Criteria andFavTimeNotIn(List<Long> values) {
            addCriterion("fav_time not in", values, "favTime");
            return (Criteria) this;
        }

        public Criteria andFavTimeBetween(Long value1, Long value2) {
            addCriterion("fav_time between", value1, value2, "favTime");
            return (Criteria) this;
        }

        public Criteria andFavTimeNotBetween(Long value1, Long value2) {
            addCriterion("fav_time not between", value1, value2, "favTime");
            return (Criteria) this;
        }

        public Criteria andFavIpIsNull() {
            addCriterion("fav_ip is null");
            return (Criteria) this;
        }

        public Criteria andFavIpIsNotNull() {
            addCriterion("fav_ip is not null");
            return (Criteria) this;
        }

        public Criteria andFavIpEqualTo(String value) {
            addCriterion("fav_ip =", value, "favIp");
            return (Criteria) this;
        }

        public Criteria andFavIpNotEqualTo(String value) {
            addCriterion("fav_ip <>", value, "favIp");
            return (Criteria) this;
        }

        public Criteria andFavIpGreaterThan(String value) {
            addCriterion("fav_ip >", value, "favIp");
            return (Criteria) this;
        }

        public Criteria andFavIpGreaterThanOrEqualTo(String value) {
            addCriterion("fav_ip >=", value, "favIp");
            return (Criteria) this;
        }

        public Criteria andFavIpLessThan(String value) {
            addCriterion("fav_ip <", value, "favIp");
            return (Criteria) this;
        }

        public Criteria andFavIpLessThanOrEqualTo(String value) {
            addCriterion("fav_ip <=", value, "favIp");
            return (Criteria) this;
        }

        public Criteria andFavIpLike(String value) {
            addCriterion("fav_ip like", value, "favIp");
            return (Criteria) this;
        }

        public Criteria andFavIpNotLike(String value) {
            addCriterion("fav_ip not like", value, "favIp");
            return (Criteria) this;
        }

        public Criteria andFavIpIn(List<String> values) {
            addCriterion("fav_ip in", values, "favIp");
            return (Criteria) this;
        }

        public Criteria andFavIpNotIn(List<String> values) {
            addCriterion("fav_ip not in", values, "favIp");
            return (Criteria) this;
        }

        public Criteria andFavIpBetween(String value1, String value2) {
            addCriterion("fav_ip between", value1, value2, "favIp");
            return (Criteria) this;
        }

        public Criteria andFavIpNotBetween(String value1, String value2) {
            addCriterion("fav_ip not between", value1, value2, "favIp");
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