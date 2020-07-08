package cn.marblog.bwcar.pojo;

import java.util.ArrayList;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("link is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("link is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("link =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("link <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("link >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("link >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("link <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("link <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("link like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("link not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("link in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("link not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("link between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("link not between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Long value) {
            addCriterion("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Long value) {
            addCriterion("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Long value) {
            addCriterion("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Long value) {
            addCriterion("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Long value) {
            addCriterion("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Long> values) {
            addCriterion("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Long> values) {
            addCriterion("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Long value1, Long value2) {
            addCriterion("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Long value1, Long value2) {
            addCriterion("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Long value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Long value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Long value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Long value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Long> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Long> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Long value1, Long value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andChannelTopIsNull() {
            addCriterion("channel_top is null");
            return (Criteria) this;
        }

        public Criteria andChannelTopIsNotNull() {
            addCriterion("channel_top is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTopEqualTo(Byte value) {
            addCriterion("channel_top =", value, "channelTop");
            return (Criteria) this;
        }

        public Criteria andChannelTopNotEqualTo(Byte value) {
            addCriterion("channel_top <>", value, "channelTop");
            return (Criteria) this;
        }

        public Criteria andChannelTopGreaterThan(Byte value) {
            addCriterion("channel_top >", value, "channelTop");
            return (Criteria) this;
        }

        public Criteria andChannelTopGreaterThanOrEqualTo(Byte value) {
            addCriterion("channel_top >=", value, "channelTop");
            return (Criteria) this;
        }

        public Criteria andChannelTopLessThan(Byte value) {
            addCriterion("channel_top <", value, "channelTop");
            return (Criteria) this;
        }

        public Criteria andChannelTopLessThanOrEqualTo(Byte value) {
            addCriterion("channel_top <=", value, "channelTop");
            return (Criteria) this;
        }

        public Criteria andChannelTopIn(List<Byte> values) {
            addCriterion("channel_top in", values, "channelTop");
            return (Criteria) this;
        }

        public Criteria andChannelTopNotIn(List<Byte> values) {
            addCriterion("channel_top not in", values, "channelTop");
            return (Criteria) this;
        }

        public Criteria andChannelTopBetween(Byte value1, Byte value2) {
            addCriterion("channel_top between", value1, value2, "channelTop");
            return (Criteria) this;
        }

        public Criteria andChannelTopNotBetween(Byte value1, Byte value2) {
            addCriterion("channel_top not between", value1, value2, "channelTop");
            return (Criteria) this;
        }

        public Criteria andHomeTopIsNull() {
            addCriterion("home_top is null");
            return (Criteria) this;
        }

        public Criteria andHomeTopIsNotNull() {
            addCriterion("home_top is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTopEqualTo(Byte value) {
            addCriterion("home_top =", value, "homeTop");
            return (Criteria) this;
        }

        public Criteria andHomeTopNotEqualTo(Byte value) {
            addCriterion("home_top <>", value, "homeTop");
            return (Criteria) this;
        }

        public Criteria andHomeTopGreaterThan(Byte value) {
            addCriterion("home_top >", value, "homeTop");
            return (Criteria) this;
        }

        public Criteria andHomeTopGreaterThanOrEqualTo(Byte value) {
            addCriterion("home_top >=", value, "homeTop");
            return (Criteria) this;
        }

        public Criteria andHomeTopLessThan(Byte value) {
            addCriterion("home_top <", value, "homeTop");
            return (Criteria) this;
        }

        public Criteria andHomeTopLessThanOrEqualTo(Byte value) {
            addCriterion("home_top <=", value, "homeTop");
            return (Criteria) this;
        }

        public Criteria andHomeTopIn(List<Byte> values) {
            addCriterion("home_top in", values, "homeTop");
            return (Criteria) this;
        }

        public Criteria andHomeTopNotIn(List<Byte> values) {
            addCriterion("home_top not in", values, "homeTop");
            return (Criteria) this;
        }

        public Criteria andHomeTopBetween(Byte value1, Byte value2) {
            addCriterion("home_top between", value1, value2, "homeTop");
            return (Criteria) this;
        }

        public Criteria andHomeTopNotBetween(Byte value1, Byte value2) {
            addCriterion("home_top not between", value1, value2, "homeTop");
            return (Criteria) this;
        }

        public Criteria andPvCountIsNull() {
            addCriterion("pv_count is null");
            return (Criteria) this;
        }

        public Criteria andPvCountIsNotNull() {
            addCriterion("pv_count is not null");
            return (Criteria) this;
        }

        public Criteria andPvCountEqualTo(Integer value) {
            addCriterion("pv_count =", value, "pvCount");
            return (Criteria) this;
        }

        public Criteria andPvCountNotEqualTo(Integer value) {
            addCriterion("pv_count <>", value, "pvCount");
            return (Criteria) this;
        }

        public Criteria andPvCountGreaterThan(Integer value) {
            addCriterion("pv_count >", value, "pvCount");
            return (Criteria) this;
        }

        public Criteria andPvCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pv_count >=", value, "pvCount");
            return (Criteria) this;
        }

        public Criteria andPvCountLessThan(Integer value) {
            addCriterion("pv_count <", value, "pvCount");
            return (Criteria) this;
        }

        public Criteria andPvCountLessThanOrEqualTo(Integer value) {
            addCriterion("pv_count <=", value, "pvCount");
            return (Criteria) this;
        }

        public Criteria andPvCountIn(List<Integer> values) {
            addCriterion("pv_count in", values, "pvCount");
            return (Criteria) this;
        }

        public Criteria andPvCountNotIn(List<Integer> values) {
            addCriterion("pv_count not in", values, "pvCount");
            return (Criteria) this;
        }

        public Criteria andPvCountBetween(Integer value1, Integer value2) {
            addCriterion("pv_count between", value1, value2, "pvCount");
            return (Criteria) this;
        }

        public Criteria andPvCountNotBetween(Integer value1, Integer value2) {
            addCriterion("pv_count not between", value1, value2, "pvCount");
            return (Criteria) this;
        }

        public Criteria andUvCountIsNull() {
            addCriterion("uv_count is null");
            return (Criteria) this;
        }

        public Criteria andUvCountIsNotNull() {
            addCriterion("uv_count is not null");
            return (Criteria) this;
        }

        public Criteria andUvCountEqualTo(Integer value) {
            addCriterion("uv_count =", value, "uvCount");
            return (Criteria) this;
        }

        public Criteria andUvCountNotEqualTo(Integer value) {
            addCriterion("uv_count <>", value, "uvCount");
            return (Criteria) this;
        }

        public Criteria andUvCountGreaterThan(Integer value) {
            addCriterion("uv_count >", value, "uvCount");
            return (Criteria) this;
        }

        public Criteria andUvCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("uv_count >=", value, "uvCount");
            return (Criteria) this;
        }

        public Criteria andUvCountLessThan(Integer value) {
            addCriterion("uv_count <", value, "uvCount");
            return (Criteria) this;
        }

        public Criteria andUvCountLessThanOrEqualTo(Integer value) {
            addCriterion("uv_count <=", value, "uvCount");
            return (Criteria) this;
        }

        public Criteria andUvCountIn(List<Integer> values) {
            addCriterion("uv_count in", values, "uvCount");
            return (Criteria) this;
        }

        public Criteria andUvCountNotIn(List<Integer> values) {
            addCriterion("uv_count not in", values, "uvCount");
            return (Criteria) this;
        }

        public Criteria andUvCountBetween(Integer value1, Integer value2) {
            addCriterion("uv_count between", value1, value2, "uvCount");
            return (Criteria) this;
        }

        public Criteria andUvCountNotBetween(Integer value1, Integer value2) {
            addCriterion("uv_count not between", value1, value2, "uvCount");
            return (Criteria) this;
        }

        public Criteria andUpCountIsNull() {
            addCriterion("up_count is null");
            return (Criteria) this;
        }

        public Criteria andUpCountIsNotNull() {
            addCriterion("up_count is not null");
            return (Criteria) this;
        }

        public Criteria andUpCountEqualTo(Integer value) {
            addCriterion("up_count =", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountNotEqualTo(Integer value) {
            addCriterion("up_count <>", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountGreaterThan(Integer value) {
            addCriterion("up_count >", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_count >=", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountLessThan(Integer value) {
            addCriterion("up_count <", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountLessThanOrEqualTo(Integer value) {
            addCriterion("up_count <=", value, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountIn(List<Integer> values) {
            addCriterion("up_count in", values, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountNotIn(List<Integer> values) {
            addCriterion("up_count not in", values, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountBetween(Integer value1, Integer value2) {
            addCriterion("up_count between", value1, value2, "upCount");
            return (Criteria) this;
        }

        public Criteria andUpCountNotBetween(Integer value1, Integer value2) {
            addCriterion("up_count not between", value1, value2, "upCount");
            return (Criteria) this;
        }

        public Criteria andFavCountIsNull() {
            addCriterion("fav_count is null");
            return (Criteria) this;
        }

        public Criteria andFavCountIsNotNull() {
            addCriterion("fav_count is not null");
            return (Criteria) this;
        }

        public Criteria andFavCountEqualTo(Integer value) {
            addCriterion("fav_count =", value, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountNotEqualTo(Integer value) {
            addCriterion("fav_count <>", value, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountGreaterThan(Integer value) {
            addCriterion("fav_count >", value, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fav_count >=", value, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountLessThan(Integer value) {
            addCriterion("fav_count <", value, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountLessThanOrEqualTo(Integer value) {
            addCriterion("fav_count <=", value, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountIn(List<Integer> values) {
            addCriterion("fav_count in", values, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountNotIn(List<Integer> values) {
            addCriterion("fav_count not in", values, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountBetween(Integer value1, Integer value2) {
            addCriterion("fav_count between", value1, value2, "favCount");
            return (Criteria) this;
        }

        public Criteria andFavCountNotBetween(Integer value1, Integer value2) {
            addCriterion("fav_count not between", value1, value2, "favCount");
            return (Criteria) this;
        }

        public Criteria andPublishStateIsNull() {
            addCriterion("publish_state is null");
            return (Criteria) this;
        }

        public Criteria andPublishStateIsNotNull() {
            addCriterion("publish_state is not null");
            return (Criteria) this;
        }

        public Criteria andPublishStateEqualTo(Byte value) {
            addCriterion("publish_state =", value, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateNotEqualTo(Byte value) {
            addCriterion("publish_state <>", value, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateGreaterThan(Byte value) {
            addCriterion("publish_state >", value, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("publish_state >=", value, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateLessThan(Byte value) {
            addCriterion("publish_state <", value, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateLessThanOrEqualTo(Byte value) {
            addCriterion("publish_state <=", value, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateIn(List<Byte> values) {
            addCriterion("publish_state in", values, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateNotIn(List<Byte> values) {
            addCriterion("publish_state not in", values, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateBetween(Byte value1, Byte value2) {
            addCriterion("publish_state between", value1, value2, "publishState");
            return (Criteria) this;
        }

        public Criteria andPublishStateNotBetween(Byte value1, Byte value2) {
            addCriterion("publish_state not between", value1, value2, "publishState");
            return (Criteria) this;
        }

        public Criteria andCreateUidIsNull() {
            addCriterion("create_uid is null");
            return (Criteria) this;
        }

        public Criteria andCreateUidIsNotNull() {
            addCriterion("create_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUidEqualTo(Integer value) {
            addCriterion("create_uid =", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidNotEqualTo(Integer value) {
            addCriterion("create_uid <>", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidGreaterThan(Integer value) {
            addCriterion("create_uid >", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_uid >=", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidLessThan(Integer value) {
            addCriterion("create_uid <", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidLessThanOrEqualTo(Integer value) {
            addCriterion("create_uid <=", value, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidIn(List<Integer> values) {
            addCriterion("create_uid in", values, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidNotIn(List<Integer> values) {
            addCriterion("create_uid not in", values, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidBetween(Integer value1, Integer value2) {
            addCriterion("create_uid between", value1, value2, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateUidNotBetween(Integer value1, Integer value2) {
            addCriterion("create_uid not between", value1, value2, "createUid");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andUnpublishUnameIsNull() {
            addCriterion("unpublish_uname is null");
            return (Criteria) this;
        }

        public Criteria andUnpublishUnameIsNotNull() {
            addCriterion("unpublish_uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnpublishUnameEqualTo(String value) {
            addCriterion("unpublish_uname =", value, "unpublishUname");
            return (Criteria) this;
        }

        public Criteria andUnpublishUnameNotEqualTo(String value) {
            addCriterion("unpublish_uname <>", value, "unpublishUname");
            return (Criteria) this;
        }

        public Criteria andUnpublishUnameGreaterThan(String value) {
            addCriterion("unpublish_uname >", value, "unpublishUname");
            return (Criteria) this;
        }

        public Criteria andUnpublishUnameGreaterThanOrEqualTo(String value) {
            addCriterion("unpublish_uname >=", value, "unpublishUname");
            return (Criteria) this;
        }

        public Criteria andUnpublishUnameLessThan(String value) {
            addCriterion("unpublish_uname <", value, "unpublishUname");
            return (Criteria) this;
        }

        public Criteria andUnpublishUnameLessThanOrEqualTo(String value) {
            addCriterion("unpublish_uname <=", value, "unpublishUname");
            return (Criteria) this;
        }

        public Criteria andUnpublishUnameLike(String value) {
            addCriterion("unpublish_uname like", value, "unpublishUname");
            return (Criteria) this;
        }

        public Criteria andUnpublishUnameNotLike(String value) {
            addCriterion("unpublish_uname not like", value, "unpublishUname");
            return (Criteria) this;
        }

        public Criteria andUnpublishUnameIn(List<String> values) {
            addCriterion("unpublish_uname in", values, "unpublishUname");
            return (Criteria) this;
        }

        public Criteria andUnpublishUnameNotIn(List<String> values) {
            addCriterion("unpublish_uname not in", values, "unpublishUname");
            return (Criteria) this;
        }

        public Criteria andUnpublishUnameBetween(String value1, String value2) {
            addCriterion("unpublish_uname between", value1, value2, "unpublishUname");
            return (Criteria) this;
        }

        public Criteria andUnpublishUnameNotBetween(String value1, String value2) {
            addCriterion("unpublish_uname not between", value1, value2, "unpublishUname");
            return (Criteria) this;
        }

        public Criteria andUnpublishTimeIsNull() {
            addCriterion("unpublish_time is null");
            return (Criteria) this;
        }

        public Criteria andUnpublishTimeIsNotNull() {
            addCriterion("unpublish_time is not null");
            return (Criteria) this;
        }

        public Criteria andUnpublishTimeEqualTo(Long value) {
            addCriterion("unpublish_time =", value, "unpublishTime");
            return (Criteria) this;
        }

        public Criteria andUnpublishTimeNotEqualTo(Long value) {
            addCriterion("unpublish_time <>", value, "unpublishTime");
            return (Criteria) this;
        }

        public Criteria andUnpublishTimeGreaterThan(Long value) {
            addCriterion("unpublish_time >", value, "unpublishTime");
            return (Criteria) this;
        }

        public Criteria andUnpublishTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("unpublish_time >=", value, "unpublishTime");
            return (Criteria) this;
        }

        public Criteria andUnpublishTimeLessThan(Long value) {
            addCriterion("unpublish_time <", value, "unpublishTime");
            return (Criteria) this;
        }

        public Criteria andUnpublishTimeLessThanOrEqualTo(Long value) {
            addCriterion("unpublish_time <=", value, "unpublishTime");
            return (Criteria) this;
        }

        public Criteria andUnpublishTimeIn(List<Long> values) {
            addCriterion("unpublish_time in", values, "unpublishTime");
            return (Criteria) this;
        }

        public Criteria andUnpublishTimeNotIn(List<Long> values) {
            addCriterion("unpublish_time not in", values, "unpublishTime");
            return (Criteria) this;
        }

        public Criteria andUnpublishTimeBetween(Long value1, Long value2) {
            addCriterion("unpublish_time between", value1, value2, "unpublishTime");
            return (Criteria) this;
        }

        public Criteria andUnpublishTimeNotBetween(Long value1, Long value2) {
            addCriterion("unpublish_time not between", value1, value2, "unpublishTime");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIsNull() {
            addCriterion("seo_keywords is null");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIsNotNull() {
            addCriterion("seo_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsEqualTo(String value) {
            addCriterion("seo_keywords =", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotEqualTo(String value) {
            addCriterion("seo_keywords <>", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsGreaterThan(String value) {
            addCriterion("seo_keywords >", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("seo_keywords >=", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLessThan(String value) {
            addCriterion("seo_keywords <", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLessThanOrEqualTo(String value) {
            addCriterion("seo_keywords <=", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLike(String value) {
            addCriterion("seo_keywords like", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotLike(String value) {
            addCriterion("seo_keywords not like", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIn(List<String> values) {
            addCriterion("seo_keywords in", values, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotIn(List<String> values) {
            addCriterion("seo_keywords not in", values, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsBetween(String value1, String value2) {
            addCriterion("seo_keywords between", value1, value2, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotBetween(String value1, String value2) {
            addCriterion("seo_keywords not between", value1, value2, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSdkPathIsNull() {
            addCriterion("sdk_path is null");
            return (Criteria) this;
        }

        public Criteria andSdkPathIsNotNull() {
            addCriterion("sdk_path is not null");
            return (Criteria) this;
        }

        public Criteria andSdkPathEqualTo(String value) {
            addCriterion("sdk_path =", value, "sdkPath");
            return (Criteria) this;
        }

        public Criteria andSdkPathNotEqualTo(String value) {
            addCriterion("sdk_path <>", value, "sdkPath");
            return (Criteria) this;
        }

        public Criteria andSdkPathGreaterThan(String value) {
            addCriterion("sdk_path >", value, "sdkPath");
            return (Criteria) this;
        }

        public Criteria andSdkPathGreaterThanOrEqualTo(String value) {
            addCriterion("sdk_path >=", value, "sdkPath");
            return (Criteria) this;
        }

        public Criteria andSdkPathLessThan(String value) {
            addCriterion("sdk_path <", value, "sdkPath");
            return (Criteria) this;
        }

        public Criteria andSdkPathLessThanOrEqualTo(String value) {
            addCriterion("sdk_path <=", value, "sdkPath");
            return (Criteria) this;
        }

        public Criteria andSdkPathLike(String value) {
            addCriterion("sdk_path like", value, "sdkPath");
            return (Criteria) this;
        }

        public Criteria andSdkPathNotLike(String value) {
            addCriterion("sdk_path not like", value, "sdkPath");
            return (Criteria) this;
        }

        public Criteria andSdkPathIn(List<String> values) {
            addCriterion("sdk_path in", values, "sdkPath");
            return (Criteria) this;
        }

        public Criteria andSdkPathNotIn(List<String> values) {
            addCriterion("sdk_path not in", values, "sdkPath");
            return (Criteria) this;
        }

        public Criteria andSdkPathBetween(String value1, String value2) {
            addCriterion("sdk_path between", value1, value2, "sdkPath");
            return (Criteria) this;
        }

        public Criteria andSdkPathNotBetween(String value1, String value2) {
            addCriterion("sdk_path not between", value1, value2, "sdkPath");
            return (Criteria) this;
        }

        public Criteria andLikeCountIsNull() {
            addCriterion("like_count is null");
            return (Criteria) this;
        }

        public Criteria andLikeCountIsNotNull() {
            addCriterion("like_count is not null");
            return (Criteria) this;
        }

        public Criteria andLikeCountEqualTo(Integer value) {
            addCriterion("like_count =", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotEqualTo(Integer value) {
            addCriterion("like_count <>", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountGreaterThan(Integer value) {
            addCriterion("like_count >", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_count >=", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountLessThan(Integer value) {
            addCriterion("like_count <", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountLessThanOrEqualTo(Integer value) {
            addCriterion("like_count <=", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountIn(List<Integer> values) {
            addCriterion("like_count in", values, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotIn(List<Integer> values) {
            addCriterion("like_count not in", values, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountBetween(Integer value1, Integer value2) {
            addCriterion("like_count between", value1, value2, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("like_count not between", value1, value2, "likeCount");
            return (Criteria) this;
        }

        public Criteria andShareCountIsNull() {
            addCriterion("share_count is null");
            return (Criteria) this;
        }

        public Criteria andShareCountIsNotNull() {
            addCriterion("share_count is not null");
            return (Criteria) this;
        }

        public Criteria andShareCountEqualTo(Integer value) {
            addCriterion("share_count =", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotEqualTo(Integer value) {
            addCriterion("share_count <>", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountGreaterThan(Integer value) {
            addCriterion("share_count >", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_count >=", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountLessThan(Integer value) {
            addCriterion("share_count <", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountLessThanOrEqualTo(Integer value) {
            addCriterion("share_count <=", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountIn(List<Integer> values) {
            addCriterion("share_count in", values, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotIn(List<Integer> values) {
            addCriterion("share_count not in", values, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountBetween(Integer value1, Integer value2) {
            addCriterion("share_count between", value1, value2, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotBetween(Integer value1, Integer value2) {
            addCriterion("share_count not between", value1, value2, "shareCount");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNull() {
            addCriterion("view_count is null");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNotNull() {
            addCriterion("view_count is not null");
            return (Criteria) this;
        }

        public Criteria andViewCountEqualTo(Integer value) {
            addCriterion("view_count =", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotEqualTo(Integer value) {
            addCriterion("view_count <>", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThan(Integer value) {
            addCriterion("view_count >", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("view_count >=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThan(Integer value) {
            addCriterion("view_count <", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThanOrEqualTo(Integer value) {
            addCriterion("view_count <=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountIn(List<Integer> values) {
            addCriterion("view_count in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotIn(List<Integer> values) {
            addCriterion("view_count not in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountBetween(Integer value1, Integer value2) {
            addCriterion("view_count between", value1, value2, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotBetween(Integer value1, Integer value2) {
            addCriterion("view_count not between", value1, value2, "viewCount");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andCoverPicIsNull() {
            addCriterion("cover_pic is null");
            return (Criteria) this;
        }

        public Criteria andCoverPicIsNotNull() {
            addCriterion("cover_pic is not null");
            return (Criteria) this;
        }

        public Criteria andCoverPicEqualTo(String value) {
            addCriterion("cover_pic =", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicNotEqualTo(String value) {
            addCriterion("cover_pic <>", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicGreaterThan(String value) {
            addCriterion("cover_pic >", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicGreaterThanOrEqualTo(String value) {
            addCriterion("cover_pic >=", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicLessThan(String value) {
            addCriterion("cover_pic <", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicLessThanOrEqualTo(String value) {
            addCriterion("cover_pic <=", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicLike(String value) {
            addCriterion("cover_pic like", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicNotLike(String value) {
            addCriterion("cover_pic not like", value, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicIn(List<String> values) {
            addCriterion("cover_pic in", values, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicNotIn(List<String> values) {
            addCriterion("cover_pic not in", values, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicBetween(String value1, String value2) {
            addCriterion("cover_pic between", value1, value2, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCoverPicNotBetween(String value1, String value2) {
            addCriterion("cover_pic not between", value1, value2, "coverPic");
            return (Criteria) this;
        }

        public Criteria andCarsIsNull() {
            addCriterion("cars is null");
            return (Criteria) this;
        }

        public Criteria andCarsIsNotNull() {
            addCriterion("cars is not null");
            return (Criteria) this;
        }

        public Criteria andCarsEqualTo(String value) {
            addCriterion("cars =", value, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsNotEqualTo(String value) {
            addCriterion("cars <>", value, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsGreaterThan(String value) {
            addCriterion("cars >", value, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsGreaterThanOrEqualTo(String value) {
            addCriterion("cars >=", value, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsLessThan(String value) {
            addCriterion("cars <", value, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsLessThanOrEqualTo(String value) {
            addCriterion("cars <=", value, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsLike(String value) {
            addCriterion("cars like", value, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsNotLike(String value) {
            addCriterion("cars not like", value, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsIn(List<String> values) {
            addCriterion("cars in", values, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsNotIn(List<String> values) {
            addCriterion("cars not in", values, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsBetween(String value1, String value2) {
            addCriterion("cars between", value1, value2, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsNotBetween(String value1, String value2) {
            addCriterion("cars not between", value1, value2, "cars");
            return (Criteria) this;
        }

        public Criteria andSdkIdIsNull() {
            addCriterion("sdk_id is null");
            return (Criteria) this;
        }

        public Criteria andSdkIdIsNotNull() {
            addCriterion("sdk_id is not null");
            return (Criteria) this;
        }

        public Criteria andSdkIdEqualTo(Integer value) {
            addCriterion("sdk_id =", value, "sdkId");
            return (Criteria) this;
        }

        public Criteria andSdkIdNotEqualTo(Integer value) {
            addCriterion("sdk_id <>", value, "sdkId");
            return (Criteria) this;
        }

        public Criteria andSdkIdGreaterThan(Integer value) {
            addCriterion("sdk_id >", value, "sdkId");
            return (Criteria) this;
        }

        public Criteria andSdkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sdk_id >=", value, "sdkId");
            return (Criteria) this;
        }

        public Criteria andSdkIdLessThan(Integer value) {
            addCriterion("sdk_id <", value, "sdkId");
            return (Criteria) this;
        }

        public Criteria andSdkIdLessThanOrEqualTo(Integer value) {
            addCriterion("sdk_id <=", value, "sdkId");
            return (Criteria) this;
        }

        public Criteria andSdkIdIn(List<Integer> values) {
            addCriterion("sdk_id in", values, "sdkId");
            return (Criteria) this;
        }

        public Criteria andSdkIdNotIn(List<Integer> values) {
            addCriterion("sdk_id not in", values, "sdkId");
            return (Criteria) this;
        }

        public Criteria andSdkIdBetween(Integer value1, Integer value2) {
            addCriterion("sdk_id between", value1, value2, "sdkId");
            return (Criteria) this;
        }

        public Criteria andSdkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sdk_id not between", value1, value2, "sdkId");
            return (Criteria) this;
        }

        public Criteria andSdkTitleIsNull() {
            addCriterion("sdk_title is null");
            return (Criteria) this;
        }

        public Criteria andSdkTitleIsNotNull() {
            addCriterion("sdk_title is not null");
            return (Criteria) this;
        }

        public Criteria andSdkTitleEqualTo(String value) {
            addCriterion("sdk_title =", value, "sdkTitle");
            return (Criteria) this;
        }

        public Criteria andSdkTitleNotEqualTo(String value) {
            addCriterion("sdk_title <>", value, "sdkTitle");
            return (Criteria) this;
        }

        public Criteria andSdkTitleGreaterThan(String value) {
            addCriterion("sdk_title >", value, "sdkTitle");
            return (Criteria) this;
        }

        public Criteria andSdkTitleGreaterThanOrEqualTo(String value) {
            addCriterion("sdk_title >=", value, "sdkTitle");
            return (Criteria) this;
        }

        public Criteria andSdkTitleLessThan(String value) {
            addCriterion("sdk_title <", value, "sdkTitle");
            return (Criteria) this;
        }

        public Criteria andSdkTitleLessThanOrEqualTo(String value) {
            addCriterion("sdk_title <=", value, "sdkTitle");
            return (Criteria) this;
        }

        public Criteria andSdkTitleLike(String value) {
            addCriterion("sdk_title like", value, "sdkTitle");
            return (Criteria) this;
        }

        public Criteria andSdkTitleNotLike(String value) {
            addCriterion("sdk_title not like", value, "sdkTitle");
            return (Criteria) this;
        }

        public Criteria andSdkTitleIn(List<String> values) {
            addCriterion("sdk_title in", values, "sdkTitle");
            return (Criteria) this;
        }

        public Criteria andSdkTitleNotIn(List<String> values) {
            addCriterion("sdk_title not in", values, "sdkTitle");
            return (Criteria) this;
        }

        public Criteria andSdkTitleBetween(String value1, String value2) {
            addCriterion("sdk_title between", value1, value2, "sdkTitle");
            return (Criteria) this;
        }

        public Criteria andSdkTitleNotBetween(String value1, String value2) {
            addCriterion("sdk_title not between", value1, value2, "sdkTitle");
            return (Criteria) this;
        }

        public Criteria andDealerIsNull() {
            addCriterion("dealer is null");
            return (Criteria) this;
        }

        public Criteria andDealerIsNotNull() {
            addCriterion("dealer is not null");
            return (Criteria) this;
        }

        public Criteria andDealerEqualTo(String value) {
            addCriterion("dealer =", value, "dealer");
            return (Criteria) this;
        }

        public Criteria andDealerNotEqualTo(String value) {
            addCriterion("dealer <>", value, "dealer");
            return (Criteria) this;
        }

        public Criteria andDealerGreaterThan(String value) {
            addCriterion("dealer >", value, "dealer");
            return (Criteria) this;
        }

        public Criteria andDealerGreaterThanOrEqualTo(String value) {
            addCriterion("dealer >=", value, "dealer");
            return (Criteria) this;
        }

        public Criteria andDealerLessThan(String value) {
            addCriterion("dealer <", value, "dealer");
            return (Criteria) this;
        }

        public Criteria andDealerLessThanOrEqualTo(String value) {
            addCriterion("dealer <=", value, "dealer");
            return (Criteria) this;
        }

        public Criteria andDealerLike(String value) {
            addCriterion("dealer like", value, "dealer");
            return (Criteria) this;
        }

        public Criteria andDealerNotLike(String value) {
            addCriterion("dealer not like", value, "dealer");
            return (Criteria) this;
        }

        public Criteria andDealerIn(List<String> values) {
            addCriterion("dealer in", values, "dealer");
            return (Criteria) this;
        }

        public Criteria andDealerNotIn(List<String> values) {
            addCriterion("dealer not in", values, "dealer");
            return (Criteria) this;
        }

        public Criteria andDealerBetween(String value1, String value2) {
            addCriterion("dealer between", value1, value2, "dealer");
            return (Criteria) this;
        }

        public Criteria andDealerNotBetween(String value1, String value2) {
            addCriterion("dealer not between", value1, value2, "dealer");
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