package cn.marblog.bwcar.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarModelExample() {
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

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andMakeIdIsNull() {
            addCriterion("make_id is null");
            return (Criteria) this;
        }

        public Criteria andMakeIdIsNotNull() {
            addCriterion("make_id is not null");
            return (Criteria) this;
        }

        public Criteria andMakeIdEqualTo(Integer value) {
            addCriterion("make_id =", value, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdNotEqualTo(Integer value) {
            addCriterion("make_id <>", value, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdGreaterThan(Integer value) {
            addCriterion("make_id >", value, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("make_id >=", value, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdLessThan(Integer value) {
            addCriterion("make_id <", value, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdLessThanOrEqualTo(Integer value) {
            addCriterion("make_id <=", value, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdIn(List<Integer> values) {
            addCriterion("make_id in", values, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdNotIn(List<Integer> values) {
            addCriterion("make_id not in", values, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdBetween(Integer value1, Integer value2) {
            addCriterion("make_id between", value1, value2, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("make_id not between", value1, value2, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeNameIsNull() {
            addCriterion("make_name is null");
            return (Criteria) this;
        }

        public Criteria andMakeNameIsNotNull() {
            addCriterion("make_name is not null");
            return (Criteria) this;
        }

        public Criteria andMakeNameEqualTo(String value) {
            addCriterion("make_name =", value, "makeName");
            return (Criteria) this;
        }

        public Criteria andMakeNameNotEqualTo(String value) {
            addCriterion("make_name <>", value, "makeName");
            return (Criteria) this;
        }

        public Criteria andMakeNameGreaterThan(String value) {
            addCriterion("make_name >", value, "makeName");
            return (Criteria) this;
        }

        public Criteria andMakeNameGreaterThanOrEqualTo(String value) {
            addCriterion("make_name >=", value, "makeName");
            return (Criteria) this;
        }

        public Criteria andMakeNameLessThan(String value) {
            addCriterion("make_name <", value, "makeName");
            return (Criteria) this;
        }

        public Criteria andMakeNameLessThanOrEqualTo(String value) {
            addCriterion("make_name <=", value, "makeName");
            return (Criteria) this;
        }

        public Criteria andMakeNameLike(String value) {
            addCriterion("make_name like", value, "makeName");
            return (Criteria) this;
        }

        public Criteria andMakeNameNotLike(String value) {
            addCriterion("make_name not like", value, "makeName");
            return (Criteria) this;
        }

        public Criteria andMakeNameIn(List<String> values) {
            addCriterion("make_name in", values, "makeName");
            return (Criteria) this;
        }

        public Criteria andMakeNameNotIn(List<String> values) {
            addCriterion("make_name not in", values, "makeName");
            return (Criteria) this;
        }

        public Criteria andMakeNameBetween(String value1, String value2) {
            addCriterion("make_name between", value1, value2, "makeName");
            return (Criteria) this;
        }

        public Criteria andMakeNameNotBetween(String value1, String value2) {
            addCriterion("make_name not between", value1, value2, "makeName");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNull() {
            addCriterion("display_name is null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNotNull() {
            addCriterion("display_name is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameEqualTo(String value) {
            addCriterion("display_name =", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotEqualTo(String value) {
            addCriterion("display_name <>", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThan(String value) {
            addCriterion("display_name >", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("display_name >=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThan(String value) {
            addCriterion("display_name <", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("display_name <=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLike(String value) {
            addCriterion("display_name like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotLike(String value) {
            addCriterion("display_name not like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIn(List<String> values) {
            addCriterion("display_name in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotIn(List<String> values) {
            addCriterion("display_name not in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameBetween(String value1, String value2) {
            addCriterion("display_name between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotBetween(String value1, String value2) {
            addCriterion("display_name not between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andOtherNameIsNull() {
            addCriterion("other_name is null");
            return (Criteria) this;
        }

        public Criteria andOtherNameIsNotNull() {
            addCriterion("other_name is not null");
            return (Criteria) this;
        }

        public Criteria andOtherNameEqualTo(String value) {
            addCriterion("other_name =", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameNotEqualTo(String value) {
            addCriterion("other_name <>", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameGreaterThan(String value) {
            addCriterion("other_name >", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameGreaterThanOrEqualTo(String value) {
            addCriterion("other_name >=", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameLessThan(String value) {
            addCriterion("other_name <", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameLessThanOrEqualTo(String value) {
            addCriterion("other_name <=", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameLike(String value) {
            addCriterion("other_name like", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameNotLike(String value) {
            addCriterion("other_name not like", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameIn(List<String> values) {
            addCriterion("other_name in", values, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameNotIn(List<String> values) {
            addCriterion("other_name not in", values, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameBetween(String value1, String value2) {
            addCriterion("other_name between", value1, value2, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameNotBetween(String value1, String value2) {
            addCriterion("other_name not between", value1, value2, "otherName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIsNull() {
            addCriterion("english_name is null");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIsNotNull() {
            addCriterion("english_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishNameEqualTo(String value) {
            addCriterion("english_name =", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotEqualTo(String value) {
            addCriterion("english_name <>", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameGreaterThan(String value) {
            addCriterion("english_name >", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("english_name >=", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLessThan(String value) {
            addCriterion("english_name <", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("english_name <=", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLike(String value) {
            addCriterion("english_name like", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotLike(String value) {
            addCriterion("english_name not like", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIn(List<String> values) {
            addCriterion("english_name in", values, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotIn(List<String> values) {
            addCriterion("english_name not in", values, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameBetween(String value1, String value2) {
            addCriterion("english_name between", value1, value2, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotBetween(String value1, String value2) {
            addCriterion("english_name not between", value1, value2, "englishName");
            return (Criteria) this;
        }

        public Criteria andCountryClassIsNull() {
            addCriterion("country_class is null");
            return (Criteria) this;
        }

        public Criteria andCountryClassIsNotNull() {
            addCriterion("country_class is not null");
            return (Criteria) this;
        }

        public Criteria andCountryClassEqualTo(Integer value) {
            addCriterion("country_class =", value, "countryClass");
            return (Criteria) this;
        }

        public Criteria andCountryClassNotEqualTo(Integer value) {
            addCriterion("country_class <>", value, "countryClass");
            return (Criteria) this;
        }

        public Criteria andCountryClassGreaterThan(Integer value) {
            addCriterion("country_class >", value, "countryClass");
            return (Criteria) this;
        }

        public Criteria andCountryClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("country_class >=", value, "countryClass");
            return (Criteria) this;
        }

        public Criteria andCountryClassLessThan(Integer value) {
            addCriterion("country_class <", value, "countryClass");
            return (Criteria) this;
        }

        public Criteria andCountryClassLessThanOrEqualTo(Integer value) {
            addCriterion("country_class <=", value, "countryClass");
            return (Criteria) this;
        }

        public Criteria andCountryClassIn(List<Integer> values) {
            addCriterion("country_class in", values, "countryClass");
            return (Criteria) this;
        }

        public Criteria andCountryClassNotIn(List<Integer> values) {
            addCriterion("country_class not in", values, "countryClass");
            return (Criteria) this;
        }

        public Criteria andCountryClassBetween(Integer value1, Integer value2) {
            addCriterion("country_class between", value1, value2, "countryClass");
            return (Criteria) this;
        }

        public Criteria andCountryClassNotBetween(Integer value1, Integer value2) {
            addCriterion("country_class not between", value1, value2, "countryClass");
            return (Criteria) this;
        }

        public Criteria andCountryClassNameIsNull() {
            addCriterion("country_class_name is null");
            return (Criteria) this;
        }

        public Criteria andCountryClassNameIsNotNull() {
            addCriterion("country_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountryClassNameEqualTo(String value) {
            addCriterion("country_class_name =", value, "countryClassName");
            return (Criteria) this;
        }

        public Criteria andCountryClassNameNotEqualTo(String value) {
            addCriterion("country_class_name <>", value, "countryClassName");
            return (Criteria) this;
        }

        public Criteria andCountryClassNameGreaterThan(String value) {
            addCriterion("country_class_name >", value, "countryClassName");
            return (Criteria) this;
        }

        public Criteria andCountryClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("country_class_name >=", value, "countryClassName");
            return (Criteria) this;
        }

        public Criteria andCountryClassNameLessThan(String value) {
            addCriterion("country_class_name <", value, "countryClassName");
            return (Criteria) this;
        }

        public Criteria andCountryClassNameLessThanOrEqualTo(String value) {
            addCriterion("country_class_name <=", value, "countryClassName");
            return (Criteria) this;
        }

        public Criteria andCountryClassNameLike(String value) {
            addCriterion("country_class_name like", value, "countryClassName");
            return (Criteria) this;
        }

        public Criteria andCountryClassNameNotLike(String value) {
            addCriterion("country_class_name not like", value, "countryClassName");
            return (Criteria) this;
        }

        public Criteria andCountryClassNameIn(List<String> values) {
            addCriterion("country_class_name in", values, "countryClassName");
            return (Criteria) this;
        }

        public Criteria andCountryClassNameNotIn(List<String> values) {
            addCriterion("country_class_name not in", values, "countryClassName");
            return (Criteria) this;
        }

        public Criteria andCountryClassNameBetween(String value1, String value2) {
            addCriterion("country_class_name between", value1, value2, "countryClassName");
            return (Criteria) this;
        }

        public Criteria andCountryClassNameNotBetween(String value1, String value2) {
            addCriterion("country_class_name not between", value1, value2, "countryClassName");
            return (Criteria) this;
        }

        public Criteria andBodyFormIsNull() {
            addCriterion("body_form is null");
            return (Criteria) this;
        }

        public Criteria andBodyFormIsNotNull() {
            addCriterion("body_form is not null");
            return (Criteria) this;
        }

        public Criteria andBodyFormEqualTo(Integer value) {
            addCriterion("body_form =", value, "bodyForm");
            return (Criteria) this;
        }

        public Criteria andBodyFormNotEqualTo(Integer value) {
            addCriterion("body_form <>", value, "bodyForm");
            return (Criteria) this;
        }

        public Criteria andBodyFormGreaterThan(Integer value) {
            addCriterion("body_form >", value, "bodyForm");
            return (Criteria) this;
        }

        public Criteria andBodyFormGreaterThanOrEqualTo(Integer value) {
            addCriterion("body_form >=", value, "bodyForm");
            return (Criteria) this;
        }

        public Criteria andBodyFormLessThan(Integer value) {
            addCriterion("body_form <", value, "bodyForm");
            return (Criteria) this;
        }

        public Criteria andBodyFormLessThanOrEqualTo(Integer value) {
            addCriterion("body_form <=", value, "bodyForm");
            return (Criteria) this;
        }

        public Criteria andBodyFormIn(List<Integer> values) {
            addCriterion("body_form in", values, "bodyForm");
            return (Criteria) this;
        }

        public Criteria andBodyFormNotIn(List<Integer> values) {
            addCriterion("body_form not in", values, "bodyForm");
            return (Criteria) this;
        }

        public Criteria andBodyFormBetween(Integer value1, Integer value2) {
            addCriterion("body_form between", value1, value2, "bodyForm");
            return (Criteria) this;
        }

        public Criteria andBodyFormNotBetween(Integer value1, Integer value2) {
            addCriterion("body_form not between", value1, value2, "bodyForm");
            return (Criteria) this;
        }

        public Criteria andBodyFormNameIsNull() {
            addCriterion("body_form_name is null");
            return (Criteria) this;
        }

        public Criteria andBodyFormNameIsNotNull() {
            addCriterion("body_form_name is not null");
            return (Criteria) this;
        }

        public Criteria andBodyFormNameEqualTo(String value) {
            addCriterion("body_form_name =", value, "bodyFormName");
            return (Criteria) this;
        }

        public Criteria andBodyFormNameNotEqualTo(String value) {
            addCriterion("body_form_name <>", value, "bodyFormName");
            return (Criteria) this;
        }

        public Criteria andBodyFormNameGreaterThan(String value) {
            addCriterion("body_form_name >", value, "bodyFormName");
            return (Criteria) this;
        }

        public Criteria andBodyFormNameGreaterThanOrEqualTo(String value) {
            addCriterion("body_form_name >=", value, "bodyFormName");
            return (Criteria) this;
        }

        public Criteria andBodyFormNameLessThan(String value) {
            addCriterion("body_form_name <", value, "bodyFormName");
            return (Criteria) this;
        }

        public Criteria andBodyFormNameLessThanOrEqualTo(String value) {
            addCriterion("body_form_name <=", value, "bodyFormName");
            return (Criteria) this;
        }

        public Criteria andBodyFormNameLike(String value) {
            addCriterion("body_form_name like", value, "bodyFormName");
            return (Criteria) this;
        }

        public Criteria andBodyFormNameNotLike(String value) {
            addCriterion("body_form_name not like", value, "bodyFormName");
            return (Criteria) this;
        }

        public Criteria andBodyFormNameIn(List<String> values) {
            addCriterion("body_form_name in", values, "bodyFormName");
            return (Criteria) this;
        }

        public Criteria andBodyFormNameNotIn(List<String> values) {
            addCriterion("body_form_name not in", values, "bodyFormName");
            return (Criteria) this;
        }

        public Criteria andBodyFormNameBetween(String value1, String value2) {
            addCriterion("body_form_name between", value1, value2, "bodyFormName");
            return (Criteria) this;
        }

        public Criteria andBodyFormNameNotBetween(String value1, String value2) {
            addCriterion("body_form_name not between", value1, value2, "bodyFormName");
            return (Criteria) this;
        }

        public Criteria andPriceLowIsNull() {
            addCriterion("price_low is null");
            return (Criteria) this;
        }

        public Criteria andPriceLowIsNotNull() {
            addCriterion("price_low is not null");
            return (Criteria) this;
        }

        public Criteria andPriceLowEqualTo(BigDecimal value) {
            addCriterion("price_low =", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowNotEqualTo(BigDecimal value) {
            addCriterion("price_low <>", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowGreaterThan(BigDecimal value) {
            addCriterion("price_low >", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_low >=", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowLessThan(BigDecimal value) {
            addCriterion("price_low <", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_low <=", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowIn(List<BigDecimal> values) {
            addCriterion("price_low in", values, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowNotIn(List<BigDecimal> values) {
            addCriterion("price_low not in", values, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_low between", value1, value2, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_low not between", value1, value2, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceHighIsNull() {
            addCriterion("price_high is null");
            return (Criteria) this;
        }

        public Criteria andPriceHighIsNotNull() {
            addCriterion("price_high is not null");
            return (Criteria) this;
        }

        public Criteria andPriceHighEqualTo(BigDecimal value) {
            addCriterion("price_high =", value, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighNotEqualTo(BigDecimal value) {
            addCriterion("price_high <>", value, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighGreaterThan(BigDecimal value) {
            addCriterion("price_high >", value, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price_high >=", value, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighLessThan(BigDecimal value) {
            addCriterion("price_high <", value, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price_high <=", value, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighIn(List<BigDecimal> values) {
            addCriterion("price_high in", values, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighNotIn(List<BigDecimal> values) {
            addCriterion("price_high not in", values, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_high between", value1, value2, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andPriceHighNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price_high not between", value1, value2, "priceHigh");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNameIsNull() {
            addCriterion("level_name is null");
            return (Criteria) this;
        }

        public Criteria andLevelNameIsNotNull() {
            addCriterion("level_name is not null");
            return (Criteria) this;
        }

        public Criteria andLevelNameEqualTo(String value) {
            addCriterion("level_name =", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotEqualTo(String value) {
            addCriterion("level_name <>", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThan(String value) {
            addCriterion("level_name >", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("level_name >=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThan(String value) {
            addCriterion("level_name <", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThanOrEqualTo(String value) {
            addCriterion("level_name <=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLike(String value) {
            addCriterion("level_name like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotLike(String value) {
            addCriterion("level_name not like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameIn(List<String> values) {
            addCriterion("level_name in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotIn(List<String> values) {
            addCriterion("level_name not in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameBetween(String value1, String value2) {
            addCriterion("level_name between", value1, value2, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotBetween(String value1, String value2) {
            addCriterion("level_name not between", value1, value2, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelSecondIsNull() {
            addCriterion("level_second is null");
            return (Criteria) this;
        }

        public Criteria andLevelSecondIsNotNull() {
            addCriterion("level_second is not null");
            return (Criteria) this;
        }

        public Criteria andLevelSecondEqualTo(Integer value) {
            addCriterion("level_second =", value, "levelSecond");
            return (Criteria) this;
        }

        public Criteria andLevelSecondNotEqualTo(Integer value) {
            addCriterion("level_second <>", value, "levelSecond");
            return (Criteria) this;
        }

        public Criteria andLevelSecondGreaterThan(Integer value) {
            addCriterion("level_second >", value, "levelSecond");
            return (Criteria) this;
        }

        public Criteria andLevelSecondGreaterThanOrEqualTo(Integer value) {
            addCriterion("level_second >=", value, "levelSecond");
            return (Criteria) this;
        }

        public Criteria andLevelSecondLessThan(Integer value) {
            addCriterion("level_second <", value, "levelSecond");
            return (Criteria) this;
        }

        public Criteria andLevelSecondLessThanOrEqualTo(Integer value) {
            addCriterion("level_second <=", value, "levelSecond");
            return (Criteria) this;
        }

        public Criteria andLevelSecondIn(List<Integer> values) {
            addCriterion("level_second in", values, "levelSecond");
            return (Criteria) this;
        }

        public Criteria andLevelSecondNotIn(List<Integer> values) {
            addCriterion("level_second not in", values, "levelSecond");
            return (Criteria) this;
        }

        public Criteria andLevelSecondBetween(Integer value1, Integer value2) {
            addCriterion("level_second between", value1, value2, "levelSecond");
            return (Criteria) this;
        }

        public Criteria andLevelSecondNotBetween(Integer value1, Integer value2) {
            addCriterion("level_second not between", value1, value2, "levelSecond");
            return (Criteria) this;
        }

        public Criteria andLevelSecondNameIsNull() {
            addCriterion("level_second_name is null");
            return (Criteria) this;
        }

        public Criteria andLevelSecondNameIsNotNull() {
            addCriterion("level_second_name is not null");
            return (Criteria) this;
        }

        public Criteria andLevelSecondNameEqualTo(String value) {
            addCriterion("level_second_name =", value, "levelSecondName");
            return (Criteria) this;
        }

        public Criteria andLevelSecondNameNotEqualTo(String value) {
            addCriterion("level_second_name <>", value, "levelSecondName");
            return (Criteria) this;
        }

        public Criteria andLevelSecondNameGreaterThan(String value) {
            addCriterion("level_second_name >", value, "levelSecondName");
            return (Criteria) this;
        }

        public Criteria andLevelSecondNameGreaterThanOrEqualTo(String value) {
            addCriterion("level_second_name >=", value, "levelSecondName");
            return (Criteria) this;
        }

        public Criteria andLevelSecondNameLessThan(String value) {
            addCriterion("level_second_name <", value, "levelSecondName");
            return (Criteria) this;
        }

        public Criteria andLevelSecondNameLessThanOrEqualTo(String value) {
            addCriterion("level_second_name <=", value, "levelSecondName");
            return (Criteria) this;
        }

        public Criteria andLevelSecondNameLike(String value) {
            addCriterion("level_second_name like", value, "levelSecondName");
            return (Criteria) this;
        }

        public Criteria andLevelSecondNameNotLike(String value) {
            addCriterion("level_second_name not like", value, "levelSecondName");
            return (Criteria) this;
        }

        public Criteria andLevelSecondNameIn(List<String> values) {
            addCriterion("level_second_name in", values, "levelSecondName");
            return (Criteria) this;
        }

        public Criteria andLevelSecondNameNotIn(List<String> values) {
            addCriterion("level_second_name not in", values, "levelSecondName");
            return (Criteria) this;
        }

        public Criteria andLevelSecondNameBetween(String value1, String value2) {
            addCriterion("level_second_name between", value1, value2, "levelSecondName");
            return (Criteria) this;
        }

        public Criteria andLevelSecondNameNotBetween(String value1, String value2) {
            addCriterion("level_second_name not between", value1, value2, "levelSecondName");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNull() {
            addCriterion("sale_status is null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNotNull() {
            addCriterion("sale_status is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusEqualTo(Byte value) {
            addCriterion("sale_status =", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotEqualTo(Byte value) {
            addCriterion("sale_status <>", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThan(Byte value) {
            addCriterion("sale_status >", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sale_status >=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThan(Byte value) {
            addCriterion("sale_status <", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThanOrEqualTo(Byte value) {
            addCriterion("sale_status <=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIn(List<Byte> values) {
            addCriterion("sale_status in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotIn(List<Byte> values) {
            addCriterion("sale_status not in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusBetween(Byte value1, Byte value2) {
            addCriterion("sale_status between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("sale_status not between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andAllSpellIsNull() {
            addCriterion("all_spell is null");
            return (Criteria) this;
        }

        public Criteria andAllSpellIsNotNull() {
            addCriterion("all_spell is not null");
            return (Criteria) this;
        }

        public Criteria andAllSpellEqualTo(String value) {
            addCriterion("all_spell =", value, "allSpell");
            return (Criteria) this;
        }

        public Criteria andAllSpellNotEqualTo(String value) {
            addCriterion("all_spell <>", value, "allSpell");
            return (Criteria) this;
        }

        public Criteria andAllSpellGreaterThan(String value) {
            addCriterion("all_spell >", value, "allSpell");
            return (Criteria) this;
        }

        public Criteria andAllSpellGreaterThanOrEqualTo(String value) {
            addCriterion("all_spell >=", value, "allSpell");
            return (Criteria) this;
        }

        public Criteria andAllSpellLessThan(String value) {
            addCriterion("all_spell <", value, "allSpell");
            return (Criteria) this;
        }

        public Criteria andAllSpellLessThanOrEqualTo(String value) {
            addCriterion("all_spell <=", value, "allSpell");
            return (Criteria) this;
        }

        public Criteria andAllSpellLike(String value) {
            addCriterion("all_spell like", value, "allSpell");
            return (Criteria) this;
        }

        public Criteria andAllSpellNotLike(String value) {
            addCriterion("all_spell not like", value, "allSpell");
            return (Criteria) this;
        }

        public Criteria andAllSpellIn(List<String> values) {
            addCriterion("all_spell in", values, "allSpell");
            return (Criteria) this;
        }

        public Criteria andAllSpellNotIn(List<String> values) {
            addCriterion("all_spell not in", values, "allSpell");
            return (Criteria) this;
        }

        public Criteria andAllSpellBetween(String value1, String value2) {
            addCriterion("all_spell between", value1, value2, "allSpell");
            return (Criteria) this;
        }

        public Criteria andAllSpellNotBetween(String value1, String value2) {
            addCriterion("all_spell not between", value1, value2, "allSpell");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Integer value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Integer value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Integer value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Integer value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Integer> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Integer> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNull() {
            addCriterion("country_name is null");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNotNull() {
            addCriterion("country_name is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNameEqualTo(String value) {
            addCriterion("country_name =", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotEqualTo(String value) {
            addCriterion("country_name <>", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThan(String value) {
            addCriterion("country_name >", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("country_name >=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThan(String value) {
            addCriterion("country_name <", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThanOrEqualTo(String value) {
            addCriterion("country_name <=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLike(String value) {
            addCriterion("country_name like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotLike(String value) {
            addCriterion("country_name not like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIn(List<String> values) {
            addCriterion("country_name in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotIn(List<String> values) {
            addCriterion("country_name not in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameBetween(String value1, String value2) {
            addCriterion("country_name between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotBetween(String value1, String value2) {
            addCriterion("country_name not between", value1, value2, "countryName");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIsNull() {
            addCriterion("sync_time is null");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIsNotNull() {
            addCriterion("sync_time is not null");
            return (Criteria) this;
        }

        public Criteria andSyncTimeEqualTo(Long value) {
            addCriterion("sync_time =", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotEqualTo(Long value) {
            addCriterion("sync_time <>", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeGreaterThan(Long value) {
            addCriterion("sync_time >", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("sync_time >=", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLessThan(Long value) {
            addCriterion("sync_time <", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLessThanOrEqualTo(Long value) {
            addCriterion("sync_time <=", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIn(List<Long> values) {
            addCriterion("sync_time in", values, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotIn(List<Long> values) {
            addCriterion("sync_time not in", values, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeBetween(Long value1, Long value2) {
            addCriterion("sync_time between", value1, value2, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotBetween(Long value1, Long value2) {
            addCriterion("sync_time not between", value1, value2, "syncTime");
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