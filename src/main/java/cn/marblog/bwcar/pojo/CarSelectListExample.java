package cn.marblog.bwcar.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarSelectListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarSelectListExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBakIsNull() {
            addCriterion("car_type_bak is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeBakIsNotNull() {
            addCriterion("car_type_bak is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeBakEqualTo(Boolean value) {
            addCriterion("car_type_bak =", value, "carTypeBak");
            return (Criteria) this;
        }

        public Criteria andCarTypeBakNotEqualTo(Boolean value) {
            addCriterion("car_type_bak <>", value, "carTypeBak");
            return (Criteria) this;
        }

        public Criteria andCarTypeBakGreaterThan(Boolean value) {
            addCriterion("car_type_bak >", value, "carTypeBak");
            return (Criteria) this;
        }

        public Criteria andCarTypeBakGreaterThanOrEqualTo(Boolean value) {
            addCriterion("car_type_bak >=", value, "carTypeBak");
            return (Criteria) this;
        }

        public Criteria andCarTypeBakLessThan(Boolean value) {
            addCriterion("car_type_bak <", value, "carTypeBak");
            return (Criteria) this;
        }

        public Criteria andCarTypeBakLessThanOrEqualTo(Boolean value) {
            addCriterion("car_type_bak <=", value, "carTypeBak");
            return (Criteria) this;
        }

        public Criteria andCarTypeBakIn(List<Boolean> values) {
            addCriterion("car_type_bak in", values, "carTypeBak");
            return (Criteria) this;
        }

        public Criteria andCarTypeBakNotIn(List<Boolean> values) {
            addCriterion("car_type_bak not in", values, "carTypeBak");
            return (Criteria) this;
        }

        public Criteria andCarTypeBakBetween(Boolean value1, Boolean value2) {
            addCriterion("car_type_bak between", value1, value2, "carTypeBak");
            return (Criteria) this;
        }

        public Criteria andCarTypeBakNotBetween(Boolean value1, Boolean value2) {
            addCriterion("car_type_bak not between", value1, value2, "carTypeBak");
            return (Criteria) this;
        }

        public Criteria andMsrpMinIsNull() {
            addCriterion("msrp_min is null");
            return (Criteria) this;
        }

        public Criteria andMsrpMinIsNotNull() {
            addCriterion("msrp_min is not null");
            return (Criteria) this;
        }

        public Criteria andMsrpMinEqualTo(BigDecimal value) {
            addCriterion("msrp_min =", value, "msrpMin");
            return (Criteria) this;
        }

        public Criteria andMsrpMinNotEqualTo(BigDecimal value) {
            addCriterion("msrp_min <>", value, "msrpMin");
            return (Criteria) this;
        }

        public Criteria andMsrpMinGreaterThan(BigDecimal value) {
            addCriterion("msrp_min >", value, "msrpMin");
            return (Criteria) this;
        }

        public Criteria andMsrpMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("msrp_min >=", value, "msrpMin");
            return (Criteria) this;
        }

        public Criteria andMsrpMinLessThan(BigDecimal value) {
            addCriterion("msrp_min <", value, "msrpMin");
            return (Criteria) this;
        }

        public Criteria andMsrpMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("msrp_min <=", value, "msrpMin");
            return (Criteria) this;
        }

        public Criteria andMsrpMinIn(List<BigDecimal> values) {
            addCriterion("msrp_min in", values, "msrpMin");
            return (Criteria) this;
        }

        public Criteria andMsrpMinNotIn(List<BigDecimal> values) {
            addCriterion("msrp_min not in", values, "msrpMin");
            return (Criteria) this;
        }

        public Criteria andMsrpMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("msrp_min between", value1, value2, "msrpMin");
            return (Criteria) this;
        }

        public Criteria andMsrpMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("msrp_min not between", value1, value2, "msrpMin");
            return (Criteria) this;
        }

        public Criteria andMsrpMaxIsNull() {
            addCriterion("msrp_max is null");
            return (Criteria) this;
        }

        public Criteria andMsrpMaxIsNotNull() {
            addCriterion("msrp_max is not null");
            return (Criteria) this;
        }

        public Criteria andMsrpMaxEqualTo(BigDecimal value) {
            addCriterion("msrp_max =", value, "msrpMax");
            return (Criteria) this;
        }

        public Criteria andMsrpMaxNotEqualTo(BigDecimal value) {
            addCriterion("msrp_max <>", value, "msrpMax");
            return (Criteria) this;
        }

        public Criteria andMsrpMaxGreaterThan(BigDecimal value) {
            addCriterion("msrp_max >", value, "msrpMax");
            return (Criteria) this;
        }

        public Criteria andMsrpMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("msrp_max >=", value, "msrpMax");
            return (Criteria) this;
        }

        public Criteria andMsrpMaxLessThan(BigDecimal value) {
            addCriterion("msrp_max <", value, "msrpMax");
            return (Criteria) this;
        }

        public Criteria andMsrpMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("msrp_max <=", value, "msrpMax");
            return (Criteria) this;
        }

        public Criteria andMsrpMaxIn(List<BigDecimal> values) {
            addCriterion("msrp_max in", values, "msrpMax");
            return (Criteria) this;
        }

        public Criteria andMsrpMaxNotIn(List<BigDecimal> values) {
            addCriterion("msrp_max not in", values, "msrpMax");
            return (Criteria) this;
        }

        public Criteria andMsrpMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("msrp_max between", value1, value2, "msrpMax");
            return (Criteria) this;
        }

        public Criteria andMsrpMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("msrp_max not between", value1, value2, "msrpMax");
            return (Criteria) this;
        }

        public Criteria andCountryTypeIsNull() {
            addCriterion("country_type is null");
            return (Criteria) this;
        }

        public Criteria andCountryTypeIsNotNull() {
            addCriterion("country_type is not null");
            return (Criteria) this;
        }

        public Criteria andCountryTypeEqualTo(Boolean value) {
            addCriterion("country_type =", value, "countryType");
            return (Criteria) this;
        }

        public Criteria andCountryTypeNotEqualTo(Boolean value) {
            addCriterion("country_type <>", value, "countryType");
            return (Criteria) this;
        }

        public Criteria andCountryTypeGreaterThan(Boolean value) {
            addCriterion("country_type >", value, "countryType");
            return (Criteria) this;
        }

        public Criteria andCountryTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("country_type >=", value, "countryType");
            return (Criteria) this;
        }

        public Criteria andCountryTypeLessThan(Boolean value) {
            addCriterion("country_type <", value, "countryType");
            return (Criteria) this;
        }

        public Criteria andCountryTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("country_type <=", value, "countryType");
            return (Criteria) this;
        }

        public Criteria andCountryTypeIn(List<Boolean> values) {
            addCriterion("country_type in", values, "countryType");
            return (Criteria) this;
        }

        public Criteria andCountryTypeNotIn(List<Boolean> values) {
            addCriterion("country_type not in", values, "countryType");
            return (Criteria) this;
        }

        public Criteria andCountryTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("country_type between", value1, value2, "countryType");
            return (Criteria) this;
        }

        public Criteria andCountryTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("country_type not between", value1, value2, "countryType");
            return (Criteria) this;
        }

        public Criteria andCountryStdIsNull() {
            addCriterion("country_std is null");
            return (Criteria) this;
        }

        public Criteria andCountryStdIsNotNull() {
            addCriterion("country_std is not null");
            return (Criteria) this;
        }

        public Criteria andCountryStdEqualTo(Boolean value) {
            addCriterion("country_std =", value, "countryStd");
            return (Criteria) this;
        }

        public Criteria andCountryStdNotEqualTo(Boolean value) {
            addCriterion("country_std <>", value, "countryStd");
            return (Criteria) this;
        }

        public Criteria andCountryStdGreaterThan(Boolean value) {
            addCriterion("country_std >", value, "countryStd");
            return (Criteria) this;
        }

        public Criteria andCountryStdGreaterThanOrEqualTo(Boolean value) {
            addCriterion("country_std >=", value, "countryStd");
            return (Criteria) this;
        }

        public Criteria andCountryStdLessThan(Boolean value) {
            addCriterion("country_std <", value, "countryStd");
            return (Criteria) this;
        }

        public Criteria andCountryStdLessThanOrEqualTo(Boolean value) {
            addCriterion("country_std <=", value, "countryStd");
            return (Criteria) this;
        }

        public Criteria andCountryStdIn(List<Boolean> values) {
            addCriterion("country_std in", values, "countryStd");
            return (Criteria) this;
        }

        public Criteria andCountryStdNotIn(List<Boolean> values) {
            addCriterion("country_std not in", values, "countryStd");
            return (Criteria) this;
        }

        public Criteria andCountryStdBetween(Boolean value1, Boolean value2) {
            addCriterion("country_std between", value1, value2, "countryStd");
            return (Criteria) this;
        }

        public Criteria andCountryStdNotBetween(Boolean value1, Boolean value2) {
            addCriterion("country_std not between", value1, value2, "countryStd");
            return (Criteria) this;
        }

        public Criteria andSpaceStdIsNull() {
            addCriterion("space_std is null");
            return (Criteria) this;
        }

        public Criteria andSpaceStdIsNotNull() {
            addCriterion("space_std is not null");
            return (Criteria) this;
        }

        public Criteria andSpaceStdEqualTo(BigDecimal value) {
            addCriterion("space_std =", value, "spaceStd");
            return (Criteria) this;
        }

        public Criteria andSpaceStdNotEqualTo(BigDecimal value) {
            addCriterion("space_std <>", value, "spaceStd");
            return (Criteria) this;
        }

        public Criteria andSpaceStdGreaterThan(BigDecimal value) {
            addCriterion("space_std >", value, "spaceStd");
            return (Criteria) this;
        }

        public Criteria andSpaceStdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("space_std >=", value, "spaceStd");
            return (Criteria) this;
        }

        public Criteria andSpaceStdLessThan(BigDecimal value) {
            addCriterion("space_std <", value, "spaceStd");
            return (Criteria) this;
        }

        public Criteria andSpaceStdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("space_std <=", value, "spaceStd");
            return (Criteria) this;
        }

        public Criteria andSpaceStdIn(List<BigDecimal> values) {
            addCriterion("space_std in", values, "spaceStd");
            return (Criteria) this;
        }

        public Criteria andSpaceStdNotIn(List<BigDecimal> values) {
            addCriterion("space_std not in", values, "spaceStd");
            return (Criteria) this;
        }

        public Criteria andSpaceStdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("space_std between", value1, value2, "spaceStd");
            return (Criteria) this;
        }

        public Criteria andSpaceStdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("space_std not between", value1, value2, "spaceStd");
            return (Criteria) this;
        }

        public Criteria andPowerStdIsNull() {
            addCriterion("power_std is null");
            return (Criteria) this;
        }

        public Criteria andPowerStdIsNotNull() {
            addCriterion("power_std is not null");
            return (Criteria) this;
        }

        public Criteria andPowerStdEqualTo(BigDecimal value) {
            addCriterion("power_std =", value, "powerStd");
            return (Criteria) this;
        }

        public Criteria andPowerStdNotEqualTo(BigDecimal value) {
            addCriterion("power_std <>", value, "powerStd");
            return (Criteria) this;
        }

        public Criteria andPowerStdGreaterThan(BigDecimal value) {
            addCriterion("power_std >", value, "powerStd");
            return (Criteria) this;
        }

        public Criteria andPowerStdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("power_std >=", value, "powerStd");
            return (Criteria) this;
        }

        public Criteria andPowerStdLessThan(BigDecimal value) {
            addCriterion("power_std <", value, "powerStd");
            return (Criteria) this;
        }

        public Criteria andPowerStdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("power_std <=", value, "powerStd");
            return (Criteria) this;
        }

        public Criteria andPowerStdIn(List<BigDecimal> values) {
            addCriterion("power_std in", values, "powerStd");
            return (Criteria) this;
        }

        public Criteria andPowerStdNotIn(List<BigDecimal> values) {
            addCriterion("power_std not in", values, "powerStd");
            return (Criteria) this;
        }

        public Criteria andPowerStdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("power_std between", value1, value2, "powerStd");
            return (Criteria) this;
        }

        public Criteria andPowerStdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("power_std not between", value1, value2, "powerStd");
            return (Criteria) this;
        }

        public Criteria andComfortStdIsNull() {
            addCriterion("comfort_std is null");
            return (Criteria) this;
        }

        public Criteria andComfortStdIsNotNull() {
            addCriterion("comfort_std is not null");
            return (Criteria) this;
        }

        public Criteria andComfortStdEqualTo(BigDecimal value) {
            addCriterion("comfort_std =", value, "comfortStd");
            return (Criteria) this;
        }

        public Criteria andComfortStdNotEqualTo(BigDecimal value) {
            addCriterion("comfort_std <>", value, "comfortStd");
            return (Criteria) this;
        }

        public Criteria andComfortStdGreaterThan(BigDecimal value) {
            addCriterion("comfort_std >", value, "comfortStd");
            return (Criteria) this;
        }

        public Criteria andComfortStdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("comfort_std >=", value, "comfortStd");
            return (Criteria) this;
        }

        public Criteria andComfortStdLessThan(BigDecimal value) {
            addCriterion("comfort_std <", value, "comfortStd");
            return (Criteria) this;
        }

        public Criteria andComfortStdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("comfort_std <=", value, "comfortStd");
            return (Criteria) this;
        }

        public Criteria andComfortStdIn(List<BigDecimal> values) {
            addCriterion("comfort_std in", values, "comfortStd");
            return (Criteria) this;
        }

        public Criteria andComfortStdNotIn(List<BigDecimal> values) {
            addCriterion("comfort_std not in", values, "comfortStd");
            return (Criteria) this;
        }

        public Criteria andComfortStdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("comfort_std between", value1, value2, "comfortStd");
            return (Criteria) this;
        }

        public Criteria andComfortStdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("comfort_std not between", value1, value2, "comfortStd");
            return (Criteria) this;
        }

        public Criteria andCostStdIsNull() {
            addCriterion("cost_std is null");
            return (Criteria) this;
        }

        public Criteria andCostStdIsNotNull() {
            addCriterion("cost_std is not null");
            return (Criteria) this;
        }

        public Criteria andCostStdEqualTo(BigDecimal value) {
            addCriterion("cost_std =", value, "costStd");
            return (Criteria) this;
        }

        public Criteria andCostStdNotEqualTo(BigDecimal value) {
            addCriterion("cost_std <>", value, "costStd");
            return (Criteria) this;
        }

        public Criteria andCostStdGreaterThan(BigDecimal value) {
            addCriterion("cost_std >", value, "costStd");
            return (Criteria) this;
        }

        public Criteria andCostStdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_std >=", value, "costStd");
            return (Criteria) this;
        }

        public Criteria andCostStdLessThan(BigDecimal value) {
            addCriterion("cost_std <", value, "costStd");
            return (Criteria) this;
        }

        public Criteria andCostStdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_std <=", value, "costStd");
            return (Criteria) this;
        }

        public Criteria andCostStdIn(List<BigDecimal> values) {
            addCriterion("cost_std in", values, "costStd");
            return (Criteria) this;
        }

        public Criteria andCostStdNotIn(List<BigDecimal> values) {
            addCriterion("cost_std not in", values, "costStd");
            return (Criteria) this;
        }

        public Criteria andCostStdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_std between", value1, value2, "costStd");
            return (Criteria) this;
        }

        public Criteria andCostStdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_std not between", value1, value2, "costStd");
            return (Criteria) this;
        }

        public Criteria andSafeStdIsNull() {
            addCriterion("safe_std is null");
            return (Criteria) this;
        }

        public Criteria andSafeStdIsNotNull() {
            addCriterion("safe_std is not null");
            return (Criteria) this;
        }

        public Criteria andSafeStdEqualTo(BigDecimal value) {
            addCriterion("safe_std =", value, "safeStd");
            return (Criteria) this;
        }

        public Criteria andSafeStdNotEqualTo(BigDecimal value) {
            addCriterion("safe_std <>", value, "safeStd");
            return (Criteria) this;
        }

        public Criteria andSafeStdGreaterThan(BigDecimal value) {
            addCriterion("safe_std >", value, "safeStd");
            return (Criteria) this;
        }

        public Criteria andSafeStdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("safe_std >=", value, "safeStd");
            return (Criteria) this;
        }

        public Criteria andSafeStdLessThan(BigDecimal value) {
            addCriterion("safe_std <", value, "safeStd");
            return (Criteria) this;
        }

        public Criteria andSafeStdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("safe_std <=", value, "safeStd");
            return (Criteria) this;
        }

        public Criteria andSafeStdIn(List<BigDecimal> values) {
            addCriterion("safe_std in", values, "safeStd");
            return (Criteria) this;
        }

        public Criteria andSafeStdNotIn(List<BigDecimal> values) {
            addCriterion("safe_std not in", values, "safeStd");
            return (Criteria) this;
        }

        public Criteria andSafeStdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("safe_std between", value1, value2, "safeStd");
            return (Criteria) this;
        }

        public Criteria andSafeStdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("safe_std not between", value1, value2, "safeStd");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Integer value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Integer value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Integer value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Integer value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Integer> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Integer> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Integer value1, Integer value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_id not between", value1, value2, "carId");
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