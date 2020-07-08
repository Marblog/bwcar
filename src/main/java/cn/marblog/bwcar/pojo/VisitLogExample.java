package cn.marblog.bwcar.pojo;

import java.util.ArrayList;
import java.util.List;

public class VisitLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitLogExample() {
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

        public Criteria andVisitorIdIsNull() {
            addCriterion("visitor_id is null");
            return (Criteria) this;
        }

        public Criteria andVisitorIdIsNotNull() {
            addCriterion("visitor_id is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorIdEqualTo(Long value) {
            addCriterion("visitor_id =", value, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNotEqualTo(Long value) {
            addCriterion("visitor_id <>", value, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdGreaterThan(Long value) {
            addCriterion("visitor_id >", value, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("visitor_id >=", value, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdLessThan(Long value) {
            addCriterion("visitor_id <", value, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdLessThanOrEqualTo(Long value) {
            addCriterion("visitor_id <=", value, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdIn(List<Long> values) {
            addCriterion("visitor_id in", values, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNotIn(List<Long> values) {
            addCriterion("visitor_id not in", values, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdBetween(Long value1, Long value2) {
            addCriterion("visitor_id between", value1, value2, "visitorId");
            return (Criteria) this;
        }

        public Criteria andVisitorIdNotBetween(Long value1, Long value2) {
            addCriterion("visitor_id not between", value1, value2, "visitorId");
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

        public Criteria andVisitUrlIsNull() {
            addCriterion("visit_url is null");
            return (Criteria) this;
        }

        public Criteria andVisitUrlIsNotNull() {
            addCriterion("visit_url is not null");
            return (Criteria) this;
        }

        public Criteria andVisitUrlEqualTo(String value) {
            addCriterion("visit_url =", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotEqualTo(String value) {
            addCriterion("visit_url <>", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlGreaterThan(String value) {
            addCriterion("visit_url >", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlGreaterThanOrEqualTo(String value) {
            addCriterion("visit_url >=", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlLessThan(String value) {
            addCriterion("visit_url <", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlLessThanOrEqualTo(String value) {
            addCriterion("visit_url <=", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlLike(String value) {
            addCriterion("visit_url like", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotLike(String value) {
            addCriterion("visit_url not like", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlIn(List<String> values) {
            addCriterion("visit_url in", values, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotIn(List<String> values) {
            addCriterion("visit_url not in", values, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlBetween(String value1, String value2) {
            addCriterion("visit_url between", value1, value2, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotBetween(String value1, String value2) {
            addCriterion("visit_url not between", value1, value2, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitIpIsNull() {
            addCriterion("visit_ip is null");
            return (Criteria) this;
        }

        public Criteria andVisitIpIsNotNull() {
            addCriterion("visit_ip is not null");
            return (Criteria) this;
        }

        public Criteria andVisitIpEqualTo(String value) {
            addCriterion("visit_ip =", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpNotEqualTo(String value) {
            addCriterion("visit_ip <>", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpGreaterThan(String value) {
            addCriterion("visit_ip >", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpGreaterThanOrEqualTo(String value) {
            addCriterion("visit_ip >=", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpLessThan(String value) {
            addCriterion("visit_ip <", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpLessThanOrEqualTo(String value) {
            addCriterion("visit_ip <=", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpLike(String value) {
            addCriterion("visit_ip like", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpNotLike(String value) {
            addCriterion("visit_ip not like", value, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpIn(List<String> values) {
            addCriterion("visit_ip in", values, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpNotIn(List<String> values) {
            addCriterion("visit_ip not in", values, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpBetween(String value1, String value2) {
            addCriterion("visit_ip between", value1, value2, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitIpNotBetween(String value1, String value2) {
            addCriterion("visit_ip not between", value1, value2, "visitIp");
            return (Criteria) this;
        }

        public Criteria andVisitDeviceIsNull() {
            addCriterion("visit_device is null");
            return (Criteria) this;
        }

        public Criteria andVisitDeviceIsNotNull() {
            addCriterion("visit_device is not null");
            return (Criteria) this;
        }

        public Criteria andVisitDeviceEqualTo(String value) {
            addCriterion("visit_device =", value, "visitDevice");
            return (Criteria) this;
        }

        public Criteria andVisitDeviceNotEqualTo(String value) {
            addCriterion("visit_device <>", value, "visitDevice");
            return (Criteria) this;
        }

        public Criteria andVisitDeviceGreaterThan(String value) {
            addCriterion("visit_device >", value, "visitDevice");
            return (Criteria) this;
        }

        public Criteria andVisitDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("visit_device >=", value, "visitDevice");
            return (Criteria) this;
        }

        public Criteria andVisitDeviceLessThan(String value) {
            addCriterion("visit_device <", value, "visitDevice");
            return (Criteria) this;
        }

        public Criteria andVisitDeviceLessThanOrEqualTo(String value) {
            addCriterion("visit_device <=", value, "visitDevice");
            return (Criteria) this;
        }

        public Criteria andVisitDeviceLike(String value) {
            addCriterion("visit_device like", value, "visitDevice");
            return (Criteria) this;
        }

        public Criteria andVisitDeviceNotLike(String value) {
            addCriterion("visit_device not like", value, "visitDevice");
            return (Criteria) this;
        }

        public Criteria andVisitDeviceIn(List<String> values) {
            addCriterion("visit_device in", values, "visitDevice");
            return (Criteria) this;
        }

        public Criteria andVisitDeviceNotIn(List<String> values) {
            addCriterion("visit_device not in", values, "visitDevice");
            return (Criteria) this;
        }

        public Criteria andVisitDeviceBetween(String value1, String value2) {
            addCriterion("visit_device between", value1, value2, "visitDevice");
            return (Criteria) this;
        }

        public Criteria andVisitDeviceNotBetween(String value1, String value2) {
            addCriterion("visit_device not between", value1, value2, "visitDevice");
            return (Criteria) this;
        }

        public Criteria andVisitSourceIsNull() {
            addCriterion("visit_source is null");
            return (Criteria) this;
        }

        public Criteria andVisitSourceIsNotNull() {
            addCriterion("visit_source is not null");
            return (Criteria) this;
        }

        public Criteria andVisitSourceEqualTo(String value) {
            addCriterion("visit_source =", value, "visitSource");
            return (Criteria) this;
        }

        public Criteria andVisitSourceNotEqualTo(String value) {
            addCriterion("visit_source <>", value, "visitSource");
            return (Criteria) this;
        }

        public Criteria andVisitSourceGreaterThan(String value) {
            addCriterion("visit_source >", value, "visitSource");
            return (Criteria) this;
        }

        public Criteria andVisitSourceGreaterThanOrEqualTo(String value) {
            addCriterion("visit_source >=", value, "visitSource");
            return (Criteria) this;
        }

        public Criteria andVisitSourceLessThan(String value) {
            addCriterion("visit_source <", value, "visitSource");
            return (Criteria) this;
        }

        public Criteria andVisitSourceLessThanOrEqualTo(String value) {
            addCriterion("visit_source <=", value, "visitSource");
            return (Criteria) this;
        }

        public Criteria andVisitSourceLike(String value) {
            addCriterion("visit_source like", value, "visitSource");
            return (Criteria) this;
        }

        public Criteria andVisitSourceNotLike(String value) {
            addCriterion("visit_source not like", value, "visitSource");
            return (Criteria) this;
        }

        public Criteria andVisitSourceIn(List<String> values) {
            addCriterion("visit_source in", values, "visitSource");
            return (Criteria) this;
        }

        public Criteria andVisitSourceNotIn(List<String> values) {
            addCriterion("visit_source not in", values, "visitSource");
            return (Criteria) this;
        }

        public Criteria andVisitSourceBetween(String value1, String value2) {
            addCriterion("visit_source between", value1, value2, "visitSource");
            return (Criteria) this;
        }

        public Criteria andVisitSourceNotBetween(String value1, String value2) {
            addCriterion("visit_source not between", value1, value2, "visitSource");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIsNull() {
            addCriterion("enter_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIsNotNull() {
            addCriterion("enter_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterTimeEqualTo(Long value) {
            addCriterion("enter_time =", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotEqualTo(Long value) {
            addCriterion("enter_time <>", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeGreaterThan(Long value) {
            addCriterion("enter_time >", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("enter_time >=", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeLessThan(Long value) {
            addCriterion("enter_time <", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeLessThanOrEqualTo(Long value) {
            addCriterion("enter_time <=", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIn(List<Long> values) {
            addCriterion("enter_time in", values, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotIn(List<Long> values) {
            addCriterion("enter_time not in", values, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeBetween(Long value1, Long value2) {
            addCriterion("enter_time between", value1, value2, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotBetween(Long value1, Long value2) {
            addCriterion("enter_time not between", value1, value2, "enterTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeIsNull() {
            addCriterion("exit_time is null");
            return (Criteria) this;
        }

        public Criteria andExitTimeIsNotNull() {
            addCriterion("exit_time is not null");
            return (Criteria) this;
        }

        public Criteria andExitTimeEqualTo(Long value) {
            addCriterion("exit_time =", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeNotEqualTo(Long value) {
            addCriterion("exit_time <>", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeGreaterThan(Long value) {
            addCriterion("exit_time >", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("exit_time >=", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeLessThan(Long value) {
            addCriterion("exit_time <", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeLessThanOrEqualTo(Long value) {
            addCriterion("exit_time <=", value, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeIn(List<Long> values) {
            addCriterion("exit_time in", values, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeNotIn(List<Long> values) {
            addCriterion("exit_time not in", values, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeBetween(Long value1, Long value2) {
            addCriterion("exit_time between", value1, value2, "exitTime");
            return (Criteria) this;
        }

        public Criteria andExitTimeNotBetween(Long value1, Long value2) {
            addCriterion("exit_time not between", value1, value2, "exitTime");
            return (Criteria) this;
        }

        public Criteria andStayIsNull() {
            addCriterion("stay is null");
            return (Criteria) this;
        }

        public Criteria andStayIsNotNull() {
            addCriterion("stay is not null");
            return (Criteria) this;
        }

        public Criteria andStayEqualTo(Long value) {
            addCriterion("stay =", value, "stay");
            return (Criteria) this;
        }

        public Criteria andStayNotEqualTo(Long value) {
            addCriterion("stay <>", value, "stay");
            return (Criteria) this;
        }

        public Criteria andStayGreaterThan(Long value) {
            addCriterion("stay >", value, "stay");
            return (Criteria) this;
        }

        public Criteria andStayGreaterThanOrEqualTo(Long value) {
            addCriterion("stay >=", value, "stay");
            return (Criteria) this;
        }

        public Criteria andStayLessThan(Long value) {
            addCriterion("stay <", value, "stay");
            return (Criteria) this;
        }

        public Criteria andStayLessThanOrEqualTo(Long value) {
            addCriterion("stay <=", value, "stay");
            return (Criteria) this;
        }

        public Criteria andStayIn(List<Long> values) {
            addCriterion("stay in", values, "stay");
            return (Criteria) this;
        }

        public Criteria andStayNotIn(List<Long> values) {
            addCriterion("stay not in", values, "stay");
            return (Criteria) this;
        }

        public Criteria andStayBetween(Long value1, Long value2) {
            addCriterion("stay between", value1, value2, "stay");
            return (Criteria) this;
        }

        public Criteria andStayNotBetween(Long value1, Long value2) {
            addCriterion("stay not between", value1, value2, "stay");
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