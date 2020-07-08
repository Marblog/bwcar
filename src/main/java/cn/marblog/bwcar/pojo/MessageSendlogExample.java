package cn.marblog.bwcar.pojo;

import java.util.ArrayList;
import java.util.List;

public class MessageSendlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageSendlogExample() {
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Long value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Long value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Long value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Long value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Long value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Long> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Long> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Long value1, Long value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Long value1, Long value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Long value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Long value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Long value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Long value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Long value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Long> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Long> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Long value1, Long value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Long value1, Long value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andToMidIsNull() {
            addCriterion("to_mid is null");
            return (Criteria) this;
        }

        public Criteria andToMidIsNotNull() {
            addCriterion("to_mid is not null");
            return (Criteria) this;
        }

        public Criteria andToMidEqualTo(Long value) {
            addCriterion("to_mid =", value, "toMid");
            return (Criteria) this;
        }

        public Criteria andToMidNotEqualTo(Long value) {
            addCriterion("to_mid <>", value, "toMid");
            return (Criteria) this;
        }

        public Criteria andToMidGreaterThan(Long value) {
            addCriterion("to_mid >", value, "toMid");
            return (Criteria) this;
        }

        public Criteria andToMidGreaterThanOrEqualTo(Long value) {
            addCriterion("to_mid >=", value, "toMid");
            return (Criteria) this;
        }

        public Criteria andToMidLessThan(Long value) {
            addCriterion("to_mid <", value, "toMid");
            return (Criteria) this;
        }

        public Criteria andToMidLessThanOrEqualTo(Long value) {
            addCriterion("to_mid <=", value, "toMid");
            return (Criteria) this;
        }

        public Criteria andToMidIn(List<Long> values) {
            addCriterion("to_mid in", values, "toMid");
            return (Criteria) this;
        }

        public Criteria andToMidNotIn(List<Long> values) {
            addCriterion("to_mid not in", values, "toMid");
            return (Criteria) this;
        }

        public Criteria andToMidBetween(Long value1, Long value2) {
            addCriterion("to_mid between", value1, value2, "toMid");
            return (Criteria) this;
        }

        public Criteria andToMidNotBetween(Long value1, Long value2) {
            addCriterion("to_mid not between", value1, value2, "toMid");
            return (Criteria) this;
        }

        public Criteria andReceivedIsNull() {
            addCriterion("received is null");
            return (Criteria) this;
        }

        public Criteria andReceivedIsNotNull() {
            addCriterion("received is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedEqualTo(Integer value) {
            addCriterion("received =", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedNotEqualTo(Integer value) {
            addCriterion("received <>", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedGreaterThan(Integer value) {
            addCriterion("received >", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedGreaterThanOrEqualTo(Integer value) {
            addCriterion("received >=", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedLessThan(Integer value) {
            addCriterion("received <", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedLessThanOrEqualTo(Integer value) {
            addCriterion("received <=", value, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedIn(List<Integer> values) {
            addCriterion("received in", values, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedNotIn(List<Integer> values) {
            addCriterion("received not in", values, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedBetween(Integer value1, Integer value2) {
            addCriterion("received between", value1, value2, "received");
            return (Criteria) this;
        }

        public Criteria andReceivedNotBetween(Integer value1, Integer value2) {
            addCriterion("received not between", value1, value2, "received");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("receive_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Long value) {
            addCriterion("receive_time =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Long value) {
            addCriterion("receive_time <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Long value) {
            addCriterion("receive_time >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("receive_time >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Long value) {
            addCriterion("receive_time <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Long value) {
            addCriterion("receive_time <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Long> values) {
            addCriterion("receive_time in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Long> values) {
            addCriterion("receive_time not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Long value1, Long value2) {
            addCriterion("receive_time between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Long value1, Long value2) {
            addCriterion("receive_time not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andViewedIsNull() {
            addCriterion("viewed is null");
            return (Criteria) this;
        }

        public Criteria andViewedIsNotNull() {
            addCriterion("viewed is not null");
            return (Criteria) this;
        }

        public Criteria andViewedEqualTo(Byte value) {
            addCriterion("viewed =", value, "viewed");
            return (Criteria) this;
        }

        public Criteria andViewedNotEqualTo(Byte value) {
            addCriterion("viewed <>", value, "viewed");
            return (Criteria) this;
        }

        public Criteria andViewedGreaterThan(Byte value) {
            addCriterion("viewed >", value, "viewed");
            return (Criteria) this;
        }

        public Criteria andViewedGreaterThanOrEqualTo(Byte value) {
            addCriterion("viewed >=", value, "viewed");
            return (Criteria) this;
        }

        public Criteria andViewedLessThan(Byte value) {
            addCriterion("viewed <", value, "viewed");
            return (Criteria) this;
        }

        public Criteria andViewedLessThanOrEqualTo(Byte value) {
            addCriterion("viewed <=", value, "viewed");
            return (Criteria) this;
        }

        public Criteria andViewedIn(List<Byte> values) {
            addCriterion("viewed in", values, "viewed");
            return (Criteria) this;
        }

        public Criteria andViewedNotIn(List<Byte> values) {
            addCriterion("viewed not in", values, "viewed");
            return (Criteria) this;
        }

        public Criteria andViewedBetween(Byte value1, Byte value2) {
            addCriterion("viewed between", value1, value2, "viewed");
            return (Criteria) this;
        }

        public Criteria andViewedNotBetween(Byte value1, Byte value2) {
            addCriterion("viewed not between", value1, value2, "viewed");
            return (Criteria) this;
        }

        public Criteria andViewTimeIsNull() {
            addCriterion("view_time is null");
            return (Criteria) this;
        }

        public Criteria andViewTimeIsNotNull() {
            addCriterion("view_time is not null");
            return (Criteria) this;
        }

        public Criteria andViewTimeEqualTo(Long value) {
            addCriterion("view_time =", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeNotEqualTo(Long value) {
            addCriterion("view_time <>", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeGreaterThan(Long value) {
            addCriterion("view_time >", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("view_time >=", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeLessThan(Long value) {
            addCriterion("view_time <", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeLessThanOrEqualTo(Long value) {
            addCriterion("view_time <=", value, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeIn(List<Long> values) {
            addCriterion("view_time in", values, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeNotIn(List<Long> values) {
            addCriterion("view_time not in", values, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeBetween(Long value1, Long value2) {
            addCriterion("view_time between", value1, value2, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewTimeNotBetween(Long value1, Long value2) {
            addCriterion("view_time not between", value1, value2, "viewTime");
            return (Criteria) this;
        }

        public Criteria andViewDetailIsNull() {
            addCriterion("view_detail is null");
            return (Criteria) this;
        }

        public Criteria andViewDetailIsNotNull() {
            addCriterion("view_detail is not null");
            return (Criteria) this;
        }

        public Criteria andViewDetailEqualTo(Byte value) {
            addCriterion("view_detail =", value, "viewDetail");
            return (Criteria) this;
        }

        public Criteria andViewDetailNotEqualTo(Byte value) {
            addCriterion("view_detail <>", value, "viewDetail");
            return (Criteria) this;
        }

        public Criteria andViewDetailGreaterThan(Byte value) {
            addCriterion("view_detail >", value, "viewDetail");
            return (Criteria) this;
        }

        public Criteria andViewDetailGreaterThanOrEqualTo(Byte value) {
            addCriterion("view_detail >=", value, "viewDetail");
            return (Criteria) this;
        }

        public Criteria andViewDetailLessThan(Byte value) {
            addCriterion("view_detail <", value, "viewDetail");
            return (Criteria) this;
        }

        public Criteria andViewDetailLessThanOrEqualTo(Byte value) {
            addCriterion("view_detail <=", value, "viewDetail");
            return (Criteria) this;
        }

        public Criteria andViewDetailIn(List<Byte> values) {
            addCriterion("view_detail in", values, "viewDetail");
            return (Criteria) this;
        }

        public Criteria andViewDetailNotIn(List<Byte> values) {
            addCriterion("view_detail not in", values, "viewDetail");
            return (Criteria) this;
        }

        public Criteria andViewDetailBetween(Byte value1, Byte value2) {
            addCriterion("view_detail between", value1, value2, "viewDetail");
            return (Criteria) this;
        }

        public Criteria andViewDetailNotBetween(Byte value1, Byte value2) {
            addCriterion("view_detail not between", value1, value2, "viewDetail");
            return (Criteria) this;
        }

        public Criteria andViewDetailTimeIsNull() {
            addCriterion("view_detail_time is null");
            return (Criteria) this;
        }

        public Criteria andViewDetailTimeIsNotNull() {
            addCriterion("view_detail_time is not null");
            return (Criteria) this;
        }

        public Criteria andViewDetailTimeEqualTo(Long value) {
            addCriterion("view_detail_time =", value, "viewDetailTime");
            return (Criteria) this;
        }

        public Criteria andViewDetailTimeNotEqualTo(Long value) {
            addCriterion("view_detail_time <>", value, "viewDetailTime");
            return (Criteria) this;
        }

        public Criteria andViewDetailTimeGreaterThan(Long value) {
            addCriterion("view_detail_time >", value, "viewDetailTime");
            return (Criteria) this;
        }

        public Criteria andViewDetailTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("view_detail_time >=", value, "viewDetailTime");
            return (Criteria) this;
        }

        public Criteria andViewDetailTimeLessThan(Long value) {
            addCriterion("view_detail_time <", value, "viewDetailTime");
            return (Criteria) this;
        }

        public Criteria andViewDetailTimeLessThanOrEqualTo(Long value) {
            addCriterion("view_detail_time <=", value, "viewDetailTime");
            return (Criteria) this;
        }

        public Criteria andViewDetailTimeIn(List<Long> values) {
            addCriterion("view_detail_time in", values, "viewDetailTime");
            return (Criteria) this;
        }

        public Criteria andViewDetailTimeNotIn(List<Long> values) {
            addCriterion("view_detail_time not in", values, "viewDetailTime");
            return (Criteria) this;
        }

        public Criteria andViewDetailTimeBetween(Long value1, Long value2) {
            addCriterion("view_detail_time between", value1, value2, "viewDetailTime");
            return (Criteria) this;
        }

        public Criteria andViewDetailTimeNotBetween(Long value1, Long value2) {
            addCriterion("view_detail_time not between", value1, value2, "viewDetailTime");
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