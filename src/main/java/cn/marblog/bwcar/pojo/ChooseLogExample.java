package cn.marblog.bwcar.pojo;

import java.util.ArrayList;
import java.util.List;

public class ChooseLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChooseLogExample() {
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

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andUserCountryIsNull() {
            addCriterion("user_country is null");
            return (Criteria) this;
        }

        public Criteria andUserCountryIsNotNull() {
            addCriterion("user_country is not null");
            return (Criteria) this;
        }

        public Criteria andUserCountryEqualTo(Byte value) {
            addCriterion("user_country =", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotEqualTo(Byte value) {
            addCriterion("user_country <>", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryGreaterThan(Byte value) {
            addCriterion("user_country >", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_country >=", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryLessThan(Byte value) {
            addCriterion("user_country <", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryLessThanOrEqualTo(Byte value) {
            addCriterion("user_country <=", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryIn(List<Byte> values) {
            addCriterion("user_country in", values, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotIn(List<Byte> values) {
            addCriterion("user_country not in", values, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryBetween(Byte value1, Byte value2) {
            addCriterion("user_country between", value1, value2, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotBetween(Byte value1, Byte value2) {
            addCriterion("user_country not between", value1, value2, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserSpaceIsNull() {
            addCriterion("user_space is null");
            return (Criteria) this;
        }

        public Criteria andUserSpaceIsNotNull() {
            addCriterion("user_space is not null");
            return (Criteria) this;
        }

        public Criteria andUserSpaceEqualTo(String value) {
            addCriterion("user_space =", value, "userSpace");
            return (Criteria) this;
        }

        public Criteria andUserSpaceNotEqualTo(String value) {
            addCriterion("user_space <>", value, "userSpace");
            return (Criteria) this;
        }

        public Criteria andUserSpaceGreaterThan(String value) {
            addCriterion("user_space >", value, "userSpace");
            return (Criteria) this;
        }

        public Criteria andUserSpaceGreaterThanOrEqualTo(String value) {
            addCriterion("user_space >=", value, "userSpace");
            return (Criteria) this;
        }

        public Criteria andUserSpaceLessThan(String value) {
            addCriterion("user_space <", value, "userSpace");
            return (Criteria) this;
        }

        public Criteria andUserSpaceLessThanOrEqualTo(String value) {
            addCriterion("user_space <=", value, "userSpace");
            return (Criteria) this;
        }

        public Criteria andUserSpaceLike(String value) {
            addCriterion("user_space like", value, "userSpace");
            return (Criteria) this;
        }

        public Criteria andUserSpaceNotLike(String value) {
            addCriterion("user_space not like", value, "userSpace");
            return (Criteria) this;
        }

        public Criteria andUserSpaceIn(List<String> values) {
            addCriterion("user_space in", values, "userSpace");
            return (Criteria) this;
        }

        public Criteria andUserSpaceNotIn(List<String> values) {
            addCriterion("user_space not in", values, "userSpace");
            return (Criteria) this;
        }

        public Criteria andUserSpaceBetween(String value1, String value2) {
            addCriterion("user_space between", value1, value2, "userSpace");
            return (Criteria) this;
        }

        public Criteria andUserSpaceNotBetween(String value1, String value2) {
            addCriterion("user_space not between", value1, value2, "userSpace");
            return (Criteria) this;
        }

        public Criteria andUserPowerIsNull() {
            addCriterion("user_power is null");
            return (Criteria) this;
        }

        public Criteria andUserPowerIsNotNull() {
            addCriterion("user_power is not null");
            return (Criteria) this;
        }

        public Criteria andUserPowerEqualTo(String value) {
            addCriterion("user_power =", value, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerNotEqualTo(String value) {
            addCriterion("user_power <>", value, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerGreaterThan(String value) {
            addCriterion("user_power >", value, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerGreaterThanOrEqualTo(String value) {
            addCriterion("user_power >=", value, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerLessThan(String value) {
            addCriterion("user_power <", value, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerLessThanOrEqualTo(String value) {
            addCriterion("user_power <=", value, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerLike(String value) {
            addCriterion("user_power like", value, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerNotLike(String value) {
            addCriterion("user_power not like", value, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerIn(List<String> values) {
            addCriterion("user_power in", values, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerNotIn(List<String> values) {
            addCriterion("user_power not in", values, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerBetween(String value1, String value2) {
            addCriterion("user_power between", value1, value2, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerNotBetween(String value1, String value2) {
            addCriterion("user_power not between", value1, value2, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserComfortIsNull() {
            addCriterion("user_comfort is null");
            return (Criteria) this;
        }

        public Criteria andUserComfortIsNotNull() {
            addCriterion("user_comfort is not null");
            return (Criteria) this;
        }

        public Criteria andUserComfortEqualTo(String value) {
            addCriterion("user_comfort =", value, "userComfort");
            return (Criteria) this;
        }

        public Criteria andUserComfortNotEqualTo(String value) {
            addCriterion("user_comfort <>", value, "userComfort");
            return (Criteria) this;
        }

        public Criteria andUserComfortGreaterThan(String value) {
            addCriterion("user_comfort >", value, "userComfort");
            return (Criteria) this;
        }

        public Criteria andUserComfortGreaterThanOrEqualTo(String value) {
            addCriterion("user_comfort >=", value, "userComfort");
            return (Criteria) this;
        }

        public Criteria andUserComfortLessThan(String value) {
            addCriterion("user_comfort <", value, "userComfort");
            return (Criteria) this;
        }

        public Criteria andUserComfortLessThanOrEqualTo(String value) {
            addCriterion("user_comfort <=", value, "userComfort");
            return (Criteria) this;
        }

        public Criteria andUserComfortLike(String value) {
            addCriterion("user_comfort like", value, "userComfort");
            return (Criteria) this;
        }

        public Criteria andUserComfortNotLike(String value) {
            addCriterion("user_comfort not like", value, "userComfort");
            return (Criteria) this;
        }

        public Criteria andUserComfortIn(List<String> values) {
            addCriterion("user_comfort in", values, "userComfort");
            return (Criteria) this;
        }

        public Criteria andUserComfortNotIn(List<String> values) {
            addCriterion("user_comfort not in", values, "userComfort");
            return (Criteria) this;
        }

        public Criteria andUserComfortBetween(String value1, String value2) {
            addCriterion("user_comfort between", value1, value2, "userComfort");
            return (Criteria) this;
        }

        public Criteria andUserComfortNotBetween(String value1, String value2) {
            addCriterion("user_comfort not between", value1, value2, "userComfort");
            return (Criteria) this;
        }

        public Criteria andUserSafeIsNull() {
            addCriterion("user_safe is null");
            return (Criteria) this;
        }

        public Criteria andUserSafeIsNotNull() {
            addCriterion("user_safe is not null");
            return (Criteria) this;
        }

        public Criteria andUserSafeEqualTo(String value) {
            addCriterion("user_safe =", value, "userSafe");
            return (Criteria) this;
        }

        public Criteria andUserSafeNotEqualTo(String value) {
            addCriterion("user_safe <>", value, "userSafe");
            return (Criteria) this;
        }

        public Criteria andUserSafeGreaterThan(String value) {
            addCriterion("user_safe >", value, "userSafe");
            return (Criteria) this;
        }

        public Criteria andUserSafeGreaterThanOrEqualTo(String value) {
            addCriterion("user_safe >=", value, "userSafe");
            return (Criteria) this;
        }

        public Criteria andUserSafeLessThan(String value) {
            addCriterion("user_safe <", value, "userSafe");
            return (Criteria) this;
        }

        public Criteria andUserSafeLessThanOrEqualTo(String value) {
            addCriterion("user_safe <=", value, "userSafe");
            return (Criteria) this;
        }

        public Criteria andUserSafeLike(String value) {
            addCriterion("user_safe like", value, "userSafe");
            return (Criteria) this;
        }

        public Criteria andUserSafeNotLike(String value) {
            addCriterion("user_safe not like", value, "userSafe");
            return (Criteria) this;
        }

        public Criteria andUserSafeIn(List<String> values) {
            addCriterion("user_safe in", values, "userSafe");
            return (Criteria) this;
        }

        public Criteria andUserSafeNotIn(List<String> values) {
            addCriterion("user_safe not in", values, "userSafe");
            return (Criteria) this;
        }

        public Criteria andUserSafeBetween(String value1, String value2) {
            addCriterion("user_safe between", value1, value2, "userSafe");
            return (Criteria) this;
        }

        public Criteria andUserSafeNotBetween(String value1, String value2) {
            addCriterion("user_safe not between", value1, value2, "userSafe");
            return (Criteria) this;
        }

        public Criteria andUserCostIsNull() {
            addCriterion("user_cost is null");
            return (Criteria) this;
        }

        public Criteria andUserCostIsNotNull() {
            addCriterion("user_cost is not null");
            return (Criteria) this;
        }

        public Criteria andUserCostEqualTo(String value) {
            addCriterion("user_cost =", value, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostNotEqualTo(String value) {
            addCriterion("user_cost <>", value, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostGreaterThan(String value) {
            addCriterion("user_cost >", value, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostGreaterThanOrEqualTo(String value) {
            addCriterion("user_cost >=", value, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostLessThan(String value) {
            addCriterion("user_cost <", value, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostLessThanOrEqualTo(String value) {
            addCriterion("user_cost <=", value, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostLike(String value) {
            addCriterion("user_cost like", value, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostNotLike(String value) {
            addCriterion("user_cost not like", value, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostIn(List<String> values) {
            addCriterion("user_cost in", values, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostNotIn(List<String> values) {
            addCriterion("user_cost not in", values, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostBetween(String value1, String value2) {
            addCriterion("user_cost between", value1, value2, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserCostNotBetween(String value1, String value2) {
            addCriterion("user_cost not between", value1, value2, "userCost");
            return (Criteria) this;
        }

        public Criteria andUserMinIsNull() {
            addCriterion("user_min is null");
            return (Criteria) this;
        }

        public Criteria andUserMinIsNotNull() {
            addCriterion("user_min is not null");
            return (Criteria) this;
        }

        public Criteria andUserMinEqualTo(String value) {
            addCriterion("user_min =", value, "userMin");
            return (Criteria) this;
        }

        public Criteria andUserMinNotEqualTo(String value) {
            addCriterion("user_min <>", value, "userMin");
            return (Criteria) this;
        }

        public Criteria andUserMinGreaterThan(String value) {
            addCriterion("user_min >", value, "userMin");
            return (Criteria) this;
        }

        public Criteria andUserMinGreaterThanOrEqualTo(String value) {
            addCriterion("user_min >=", value, "userMin");
            return (Criteria) this;
        }

        public Criteria andUserMinLessThan(String value) {
            addCriterion("user_min <", value, "userMin");
            return (Criteria) this;
        }

        public Criteria andUserMinLessThanOrEqualTo(String value) {
            addCriterion("user_min <=", value, "userMin");
            return (Criteria) this;
        }

        public Criteria andUserMinLike(String value) {
            addCriterion("user_min like", value, "userMin");
            return (Criteria) this;
        }

        public Criteria andUserMinNotLike(String value) {
            addCriterion("user_min not like", value, "userMin");
            return (Criteria) this;
        }

        public Criteria andUserMinIn(List<String> values) {
            addCriterion("user_min in", values, "userMin");
            return (Criteria) this;
        }

        public Criteria andUserMinNotIn(List<String> values) {
            addCriterion("user_min not in", values, "userMin");
            return (Criteria) this;
        }

        public Criteria andUserMinBetween(String value1, String value2) {
            addCriterion("user_min between", value1, value2, "userMin");
            return (Criteria) this;
        }

        public Criteria andUserMinNotBetween(String value1, String value2) {
            addCriterion("user_min not between", value1, value2, "userMin");
            return (Criteria) this;
        }

        public Criteria andUserMaxIsNull() {
            addCriterion("user_max is null");
            return (Criteria) this;
        }

        public Criteria andUserMaxIsNotNull() {
            addCriterion("user_max is not null");
            return (Criteria) this;
        }

        public Criteria andUserMaxEqualTo(String value) {
            addCriterion("user_max =", value, "userMax");
            return (Criteria) this;
        }

        public Criteria andUserMaxNotEqualTo(String value) {
            addCriterion("user_max <>", value, "userMax");
            return (Criteria) this;
        }

        public Criteria andUserMaxGreaterThan(String value) {
            addCriterion("user_max >", value, "userMax");
            return (Criteria) this;
        }

        public Criteria andUserMaxGreaterThanOrEqualTo(String value) {
            addCriterion("user_max >=", value, "userMax");
            return (Criteria) this;
        }

        public Criteria andUserMaxLessThan(String value) {
            addCriterion("user_max <", value, "userMax");
            return (Criteria) this;
        }

        public Criteria andUserMaxLessThanOrEqualTo(String value) {
            addCriterion("user_max <=", value, "userMax");
            return (Criteria) this;
        }

        public Criteria andUserMaxLike(String value) {
            addCriterion("user_max like", value, "userMax");
            return (Criteria) this;
        }

        public Criteria andUserMaxNotLike(String value) {
            addCriterion("user_max not like", value, "userMax");
            return (Criteria) this;
        }

        public Criteria andUserMaxIn(List<String> values) {
            addCriterion("user_max in", values, "userMax");
            return (Criteria) this;
        }

        public Criteria andUserMaxNotIn(List<String> values) {
            addCriterion("user_max not in", values, "userMax");
            return (Criteria) this;
        }

        public Criteria andUserMaxBetween(String value1, String value2) {
            addCriterion("user_max between", value1, value2, "userMax");
            return (Criteria) this;
        }

        public Criteria andUserMaxNotBetween(String value1, String value2) {
            addCriterion("user_max not between", value1, value2, "userMax");
            return (Criteria) this;
        }

        public Criteria andUserPtimeIsNull() {
            addCriterion("user_ptime is null");
            return (Criteria) this;
        }

        public Criteria andUserPtimeIsNotNull() {
            addCriterion("user_ptime is not null");
            return (Criteria) this;
        }

        public Criteria andUserPtimeEqualTo(String value) {
            addCriterion("user_ptime =", value, "userPtime");
            return (Criteria) this;
        }

        public Criteria andUserPtimeNotEqualTo(String value) {
            addCriterion("user_ptime <>", value, "userPtime");
            return (Criteria) this;
        }

        public Criteria andUserPtimeGreaterThan(String value) {
            addCriterion("user_ptime >", value, "userPtime");
            return (Criteria) this;
        }

        public Criteria andUserPtimeGreaterThanOrEqualTo(String value) {
            addCriterion("user_ptime >=", value, "userPtime");
            return (Criteria) this;
        }

        public Criteria andUserPtimeLessThan(String value) {
            addCriterion("user_ptime <", value, "userPtime");
            return (Criteria) this;
        }

        public Criteria andUserPtimeLessThanOrEqualTo(String value) {
            addCriterion("user_ptime <=", value, "userPtime");
            return (Criteria) this;
        }

        public Criteria andUserPtimeLike(String value) {
            addCriterion("user_ptime like", value, "userPtime");
            return (Criteria) this;
        }

        public Criteria andUserPtimeNotLike(String value) {
            addCriterion("user_ptime not like", value, "userPtime");
            return (Criteria) this;
        }

        public Criteria andUserPtimeIn(List<String> values) {
            addCriterion("user_ptime in", values, "userPtime");
            return (Criteria) this;
        }

        public Criteria andUserPtimeNotIn(List<String> values) {
            addCriterion("user_ptime not in", values, "userPtime");
            return (Criteria) this;
        }

        public Criteria andUserPtimeBetween(String value1, String value2) {
            addCriterion("user_ptime between", value1, value2, "userPtime");
            return (Criteria) this;
        }

        public Criteria andUserPtimeNotBetween(String value1, String value2) {
            addCriterion("user_ptime not between", value1, value2, "userPtime");
            return (Criteria) this;
        }

        public Criteria andUserCarIsNull() {
            addCriterion("user_car is null");
            return (Criteria) this;
        }

        public Criteria andUserCarIsNotNull() {
            addCriterion("user_car is not null");
            return (Criteria) this;
        }

        public Criteria andUserCarEqualTo(String value) {
            addCriterion("user_car =", value, "userCar");
            return (Criteria) this;
        }

        public Criteria andUserCarNotEqualTo(String value) {
            addCriterion("user_car <>", value, "userCar");
            return (Criteria) this;
        }

        public Criteria andUserCarGreaterThan(String value) {
            addCriterion("user_car >", value, "userCar");
            return (Criteria) this;
        }

        public Criteria andUserCarGreaterThanOrEqualTo(String value) {
            addCriterion("user_car >=", value, "userCar");
            return (Criteria) this;
        }

        public Criteria andUserCarLessThan(String value) {
            addCriterion("user_car <", value, "userCar");
            return (Criteria) this;
        }

        public Criteria andUserCarLessThanOrEqualTo(String value) {
            addCriterion("user_car <=", value, "userCar");
            return (Criteria) this;
        }

        public Criteria andUserCarLike(String value) {
            addCriterion("user_car like", value, "userCar");
            return (Criteria) this;
        }

        public Criteria andUserCarNotLike(String value) {
            addCriterion("user_car not like", value, "userCar");
            return (Criteria) this;
        }

        public Criteria andUserCarIn(List<String> values) {
            addCriterion("user_car in", values, "userCar");
            return (Criteria) this;
        }

        public Criteria andUserCarNotIn(List<String> values) {
            addCriterion("user_car not in", values, "userCar");
            return (Criteria) this;
        }

        public Criteria andUserCarBetween(String value1, String value2) {
            addCriterion("user_car between", value1, value2, "userCar");
            return (Criteria) this;
        }

        public Criteria andUserCarNotBetween(String value1, String value2) {
            addCriterion("user_car not between", value1, value2, "userCar");
            return (Criteria) this;
        }

        public Criteria andChooseCarIsNull() {
            addCriterion("choose_car is null");
            return (Criteria) this;
        }

        public Criteria andChooseCarIsNotNull() {
            addCriterion("choose_car is not null");
            return (Criteria) this;
        }

        public Criteria andChooseCarEqualTo(String value) {
            addCriterion("choose_car =", value, "chooseCar");
            return (Criteria) this;
        }

        public Criteria andChooseCarNotEqualTo(String value) {
            addCriterion("choose_car <>", value, "chooseCar");
            return (Criteria) this;
        }

        public Criteria andChooseCarGreaterThan(String value) {
            addCriterion("choose_car >", value, "chooseCar");
            return (Criteria) this;
        }

        public Criteria andChooseCarGreaterThanOrEqualTo(String value) {
            addCriterion("choose_car >=", value, "chooseCar");
            return (Criteria) this;
        }

        public Criteria andChooseCarLessThan(String value) {
            addCriterion("choose_car <", value, "chooseCar");
            return (Criteria) this;
        }

        public Criteria andChooseCarLessThanOrEqualTo(String value) {
            addCriterion("choose_car <=", value, "chooseCar");
            return (Criteria) this;
        }

        public Criteria andChooseCarLike(String value) {
            addCriterion("choose_car like", value, "chooseCar");
            return (Criteria) this;
        }

        public Criteria andChooseCarNotLike(String value) {
            addCriterion("choose_car not like", value, "chooseCar");
            return (Criteria) this;
        }

        public Criteria andChooseCarIn(List<String> values) {
            addCriterion("choose_car in", values, "chooseCar");
            return (Criteria) this;
        }

        public Criteria andChooseCarNotIn(List<String> values) {
            addCriterion("choose_car not in", values, "chooseCar");
            return (Criteria) this;
        }

        public Criteria andChooseCarBetween(String value1, String value2) {
            addCriterion("choose_car between", value1, value2, "chooseCar");
            return (Criteria) this;
        }

        public Criteria andChooseCarNotBetween(String value1, String value2) {
            addCriterion("choose_car not between", value1, value2, "chooseCar");
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