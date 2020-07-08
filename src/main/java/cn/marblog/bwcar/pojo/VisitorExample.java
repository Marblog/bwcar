package cn.marblog.bwcar.pojo;

import java.util.ArrayList;
import java.util.List;

public class VisitorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitorExample() {
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

        public Criteria andVisitorGuidIsNull() {
            addCriterion("visitor_guid is null");
            return (Criteria) this;
        }

        public Criteria andVisitorGuidIsNotNull() {
            addCriterion("visitor_guid is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorGuidEqualTo(String value) {
            addCriterion("visitor_guid =", value, "visitorGuid");
            return (Criteria) this;
        }

        public Criteria andVisitorGuidNotEqualTo(String value) {
            addCriterion("visitor_guid <>", value, "visitorGuid");
            return (Criteria) this;
        }

        public Criteria andVisitorGuidGreaterThan(String value) {
            addCriterion("visitor_guid >", value, "visitorGuid");
            return (Criteria) this;
        }

        public Criteria andVisitorGuidGreaterThanOrEqualTo(String value) {
            addCriterion("visitor_guid >=", value, "visitorGuid");
            return (Criteria) this;
        }

        public Criteria andVisitorGuidLessThan(String value) {
            addCriterion("visitor_guid <", value, "visitorGuid");
            return (Criteria) this;
        }

        public Criteria andVisitorGuidLessThanOrEqualTo(String value) {
            addCriterion("visitor_guid <=", value, "visitorGuid");
            return (Criteria) this;
        }

        public Criteria andVisitorGuidLike(String value) {
            addCriterion("visitor_guid like", value, "visitorGuid");
            return (Criteria) this;
        }

        public Criteria andVisitorGuidNotLike(String value) {
            addCriterion("visitor_guid not like", value, "visitorGuid");
            return (Criteria) this;
        }

        public Criteria andVisitorGuidIn(List<String> values) {
            addCriterion("visitor_guid in", values, "visitorGuid");
            return (Criteria) this;
        }

        public Criteria andVisitorGuidNotIn(List<String> values) {
            addCriterion("visitor_guid not in", values, "visitorGuid");
            return (Criteria) this;
        }

        public Criteria andVisitorGuidBetween(String value1, String value2) {
            addCriterion("visitor_guid between", value1, value2, "visitorGuid");
            return (Criteria) this;
        }

        public Criteria andVisitorGuidNotBetween(String value1, String value2) {
            addCriterion("visitor_guid not between", value1, value2, "visitorGuid");
            return (Criteria) this;
        }

        public Criteria andFirstVisitTimeIsNull() {
            addCriterion("first_visit_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstVisitTimeIsNotNull() {
            addCriterion("first_visit_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstVisitTimeEqualTo(Long value) {
            addCriterion("first_visit_time =", value, "firstVisitTime");
            return (Criteria) this;
        }

        public Criteria andFirstVisitTimeNotEqualTo(Long value) {
            addCriterion("first_visit_time <>", value, "firstVisitTime");
            return (Criteria) this;
        }

        public Criteria andFirstVisitTimeGreaterThan(Long value) {
            addCriterion("first_visit_time >", value, "firstVisitTime");
            return (Criteria) this;
        }

        public Criteria andFirstVisitTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("first_visit_time >=", value, "firstVisitTime");
            return (Criteria) this;
        }

        public Criteria andFirstVisitTimeLessThan(Long value) {
            addCriterion("first_visit_time <", value, "firstVisitTime");
            return (Criteria) this;
        }

        public Criteria andFirstVisitTimeLessThanOrEqualTo(Long value) {
            addCriterion("first_visit_time <=", value, "firstVisitTime");
            return (Criteria) this;
        }

        public Criteria andFirstVisitTimeIn(List<Long> values) {
            addCriterion("first_visit_time in", values, "firstVisitTime");
            return (Criteria) this;
        }

        public Criteria andFirstVisitTimeNotIn(List<Long> values) {
            addCriterion("first_visit_time not in", values, "firstVisitTime");
            return (Criteria) this;
        }

        public Criteria andFirstVisitTimeBetween(Long value1, Long value2) {
            addCriterion("first_visit_time between", value1, value2, "firstVisitTime");
            return (Criteria) this;
        }

        public Criteria andFirstVisitTimeNotBetween(Long value1, Long value2) {
            addCriterion("first_visit_time not between", value1, value2, "firstVisitTime");
            return (Criteria) this;
        }

        public Criteria andEntryUrlIsNull() {
            addCriterion("entry_url is null");
            return (Criteria) this;
        }

        public Criteria andEntryUrlIsNotNull() {
            addCriterion("entry_url is not null");
            return (Criteria) this;
        }

        public Criteria andEntryUrlEqualTo(String value) {
            addCriterion("entry_url =", value, "entryUrl");
            return (Criteria) this;
        }

        public Criteria andEntryUrlNotEqualTo(String value) {
            addCriterion("entry_url <>", value, "entryUrl");
            return (Criteria) this;
        }

        public Criteria andEntryUrlGreaterThan(String value) {
            addCriterion("entry_url >", value, "entryUrl");
            return (Criteria) this;
        }

        public Criteria andEntryUrlGreaterThanOrEqualTo(String value) {
            addCriterion("entry_url >=", value, "entryUrl");
            return (Criteria) this;
        }

        public Criteria andEntryUrlLessThan(String value) {
            addCriterion("entry_url <", value, "entryUrl");
            return (Criteria) this;
        }

        public Criteria andEntryUrlLessThanOrEqualTo(String value) {
            addCriterion("entry_url <=", value, "entryUrl");
            return (Criteria) this;
        }

        public Criteria andEntryUrlLike(String value) {
            addCriterion("entry_url like", value, "entryUrl");
            return (Criteria) this;
        }

        public Criteria andEntryUrlNotLike(String value) {
            addCriterion("entry_url not like", value, "entryUrl");
            return (Criteria) this;
        }

        public Criteria andEntryUrlIn(List<String> values) {
            addCriterion("entry_url in", values, "entryUrl");
            return (Criteria) this;
        }

        public Criteria andEntryUrlNotIn(List<String> values) {
            addCriterion("entry_url not in", values, "entryUrl");
            return (Criteria) this;
        }

        public Criteria andEntryUrlBetween(String value1, String value2) {
            addCriterion("entry_url between", value1, value2, "entryUrl");
            return (Criteria) this;
        }

        public Criteria andEntryUrlNotBetween(String value1, String value2) {
            addCriterion("entry_url not between", value1, value2, "entryUrl");
            return (Criteria) this;
        }

        public Criteria andVisitorIpIsNull() {
            addCriterion("visitor_ip is null");
            return (Criteria) this;
        }

        public Criteria andVisitorIpIsNotNull() {
            addCriterion("visitor_ip is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorIpEqualTo(String value) {
            addCriterion("visitor_ip =", value, "visitorIp");
            return (Criteria) this;
        }

        public Criteria andVisitorIpNotEqualTo(String value) {
            addCriterion("visitor_ip <>", value, "visitorIp");
            return (Criteria) this;
        }

        public Criteria andVisitorIpGreaterThan(String value) {
            addCriterion("visitor_ip >", value, "visitorIp");
            return (Criteria) this;
        }

        public Criteria andVisitorIpGreaterThanOrEqualTo(String value) {
            addCriterion("visitor_ip >=", value, "visitorIp");
            return (Criteria) this;
        }

        public Criteria andVisitorIpLessThan(String value) {
            addCriterion("visitor_ip <", value, "visitorIp");
            return (Criteria) this;
        }

        public Criteria andVisitorIpLessThanOrEqualTo(String value) {
            addCriterion("visitor_ip <=", value, "visitorIp");
            return (Criteria) this;
        }

        public Criteria andVisitorIpLike(String value) {
            addCriterion("visitor_ip like", value, "visitorIp");
            return (Criteria) this;
        }

        public Criteria andVisitorIpNotLike(String value) {
            addCriterion("visitor_ip not like", value, "visitorIp");
            return (Criteria) this;
        }

        public Criteria andVisitorIpIn(List<String> values) {
            addCriterion("visitor_ip in", values, "visitorIp");
            return (Criteria) this;
        }

        public Criteria andVisitorIpNotIn(List<String> values) {
            addCriterion("visitor_ip not in", values, "visitorIp");
            return (Criteria) this;
        }

        public Criteria andVisitorIpBetween(String value1, String value2) {
            addCriterion("visitor_ip between", value1, value2, "visitorIp");
            return (Criteria) this;
        }

        public Criteria andVisitorIpNotBetween(String value1, String value2) {
            addCriterion("visitor_ip not between", value1, value2, "visitorIp");
            return (Criteria) this;
        }

        public Criteria andVisitorDeviceIsNull() {
            addCriterion("visitor_device is null");
            return (Criteria) this;
        }

        public Criteria andVisitorDeviceIsNotNull() {
            addCriterion("visitor_device is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorDeviceEqualTo(String value) {
            addCriterion("visitor_device =", value, "visitorDevice");
            return (Criteria) this;
        }

        public Criteria andVisitorDeviceNotEqualTo(String value) {
            addCriterion("visitor_device <>", value, "visitorDevice");
            return (Criteria) this;
        }

        public Criteria andVisitorDeviceGreaterThan(String value) {
            addCriterion("visitor_device >", value, "visitorDevice");
            return (Criteria) this;
        }

        public Criteria andVisitorDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("visitor_device >=", value, "visitorDevice");
            return (Criteria) this;
        }

        public Criteria andVisitorDeviceLessThan(String value) {
            addCriterion("visitor_device <", value, "visitorDevice");
            return (Criteria) this;
        }

        public Criteria andVisitorDeviceLessThanOrEqualTo(String value) {
            addCriterion("visitor_device <=", value, "visitorDevice");
            return (Criteria) this;
        }

        public Criteria andVisitorDeviceLike(String value) {
            addCriterion("visitor_device like", value, "visitorDevice");
            return (Criteria) this;
        }

        public Criteria andVisitorDeviceNotLike(String value) {
            addCriterion("visitor_device not like", value, "visitorDevice");
            return (Criteria) this;
        }

        public Criteria andVisitorDeviceIn(List<String> values) {
            addCriterion("visitor_device in", values, "visitorDevice");
            return (Criteria) this;
        }

        public Criteria andVisitorDeviceNotIn(List<String> values) {
            addCriterion("visitor_device not in", values, "visitorDevice");
            return (Criteria) this;
        }

        public Criteria andVisitorDeviceBetween(String value1, String value2) {
            addCriterion("visitor_device between", value1, value2, "visitorDevice");
            return (Criteria) this;
        }

        public Criteria andVisitorDeviceNotBetween(String value1, String value2) {
            addCriterion("visitor_device not between", value1, value2, "visitorDevice");
            return (Criteria) this;
        }

        public Criteria andVisitorChannelIsNull() {
            addCriterion("visitor_channel is null");
            return (Criteria) this;
        }

        public Criteria andVisitorChannelIsNotNull() {
            addCriterion("visitor_channel is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorChannelEqualTo(String value) {
            addCriterion("visitor_channel =", value, "visitorChannel");
            return (Criteria) this;
        }

        public Criteria andVisitorChannelNotEqualTo(String value) {
            addCriterion("visitor_channel <>", value, "visitorChannel");
            return (Criteria) this;
        }

        public Criteria andVisitorChannelGreaterThan(String value) {
            addCriterion("visitor_channel >", value, "visitorChannel");
            return (Criteria) this;
        }

        public Criteria andVisitorChannelGreaterThanOrEqualTo(String value) {
            addCriterion("visitor_channel >=", value, "visitorChannel");
            return (Criteria) this;
        }

        public Criteria andVisitorChannelLessThan(String value) {
            addCriterion("visitor_channel <", value, "visitorChannel");
            return (Criteria) this;
        }

        public Criteria andVisitorChannelLessThanOrEqualTo(String value) {
            addCriterion("visitor_channel <=", value, "visitorChannel");
            return (Criteria) this;
        }

        public Criteria andVisitorChannelLike(String value) {
            addCriterion("visitor_channel like", value, "visitorChannel");
            return (Criteria) this;
        }

        public Criteria andVisitorChannelNotLike(String value) {
            addCriterion("visitor_channel not like", value, "visitorChannel");
            return (Criteria) this;
        }

        public Criteria andVisitorChannelIn(List<String> values) {
            addCriterion("visitor_channel in", values, "visitorChannel");
            return (Criteria) this;
        }

        public Criteria andVisitorChannelNotIn(List<String> values) {
            addCriterion("visitor_channel not in", values, "visitorChannel");
            return (Criteria) this;
        }

        public Criteria andVisitorChannelBetween(String value1, String value2) {
            addCriterion("visitor_channel between", value1, value2, "visitorChannel");
            return (Criteria) this;
        }

        public Criteria andVisitorChannelNotBetween(String value1, String value2) {
            addCriterion("visitor_channel not between", value1, value2, "visitorChannel");
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