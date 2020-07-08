package cn.marblog.bwcar.pojo;

import java.util.ArrayList;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
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

        public Criteria andThumbPicIsNull() {
            addCriterion("thumb_pic is null");
            return (Criteria) this;
        }

        public Criteria andThumbPicIsNotNull() {
            addCriterion("thumb_pic is not null");
            return (Criteria) this;
        }

        public Criteria andThumbPicEqualTo(String value) {
            addCriterion("thumb_pic =", value, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicNotEqualTo(String value) {
            addCriterion("thumb_pic <>", value, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicGreaterThan(String value) {
            addCriterion("thumb_pic >", value, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicGreaterThanOrEqualTo(String value) {
            addCriterion("thumb_pic >=", value, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicLessThan(String value) {
            addCriterion("thumb_pic <", value, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicLessThanOrEqualTo(String value) {
            addCriterion("thumb_pic <=", value, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicLike(String value) {
            addCriterion("thumb_pic like", value, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicNotLike(String value) {
            addCriterion("thumb_pic not like", value, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicIn(List<String> values) {
            addCriterion("thumb_pic in", values, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicNotIn(List<String> values) {
            addCriterion("thumb_pic not in", values, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicBetween(String value1, String value2) {
            addCriterion("thumb_pic between", value1, value2, "thumbPic");
            return (Criteria) this;
        }

        public Criteria andThumbPicNotBetween(String value1, String value2) {
            addCriterion("thumb_pic not between", value1, value2, "thumbPic");
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

        public Criteria andPreviewUrlIsNull() {
            addCriterion("preview_url is null");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlIsNotNull() {
            addCriterion("preview_url is not null");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlEqualTo(String value) {
            addCriterion("preview_url =", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlNotEqualTo(String value) {
            addCriterion("preview_url <>", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlGreaterThan(String value) {
            addCriterion("preview_url >", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlGreaterThanOrEqualTo(String value) {
            addCriterion("preview_url >=", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlLessThan(String value) {
            addCriterion("preview_url <", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlLessThanOrEqualTo(String value) {
            addCriterion("preview_url <=", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlLike(String value) {
            addCriterion("preview_url like", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlNotLike(String value) {
            addCriterion("preview_url not like", value, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlIn(List<String> values) {
            addCriterion("preview_url in", values, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlNotIn(List<String> values) {
            addCriterion("preview_url not in", values, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlBetween(String value1, String value2) {
            addCriterion("preview_url between", value1, value2, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andPreviewUrlNotBetween(String value1, String value2) {
            addCriterion("preview_url not between", value1, value2, "previewUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIsNull() {
            addCriterion("qrcode_url is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIsNotNull() {
            addCriterion("qrcode_url is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlEqualTo(String value) {
            addCriterion("qrcode_url =", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotEqualTo(String value) {
            addCriterion("qrcode_url <>", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlGreaterThan(String value) {
            addCriterion("qrcode_url >", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("qrcode_url >=", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLessThan(String value) {
            addCriterion("qrcode_url <", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLessThanOrEqualTo(String value) {
            addCriterion("qrcode_url <=", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlLike(String value) {
            addCriterion("qrcode_url like", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotLike(String value) {
            addCriterion("qrcode_url not like", value, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlIn(List<String> values) {
            addCriterion("qrcode_url in", values, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotIn(List<String> values) {
            addCriterion("qrcode_url not in", values, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlBetween(String value1, String value2) {
            addCriterion("qrcode_url between", value1, value2, "qrcodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrcodeUrlNotBetween(String value1, String value2) {
            addCriterion("qrcode_url not between", value1, value2, "qrcodeUrl");
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

        public Criteria andCommentCountIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Integer value) {
            addCriterion("comment_count =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Integer value) {
            addCriterion("comment_count <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Integer value) {
            addCriterion("comment_count >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_count >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Integer value) {
            addCriterion("comment_count <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("comment_count <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Integer> values) {
            addCriterion("comment_count in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Integer> values) {
            addCriterion("comment_count not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("comment_count between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_count not between", value1, value2, "commentCount");
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

        public Criteria andCreateUnameIsNull() {
            addCriterion("create_uname is null");
            return (Criteria) this;
        }

        public Criteria andCreateUnameIsNotNull() {
            addCriterion("create_uname is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUnameEqualTo(String value) {
            addCriterion("create_uname =", value, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameNotEqualTo(String value) {
            addCriterion("create_uname <>", value, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameGreaterThan(String value) {
            addCriterion("create_uname >", value, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameGreaterThanOrEqualTo(String value) {
            addCriterion("create_uname >=", value, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameLessThan(String value) {
            addCriterion("create_uname <", value, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameLessThanOrEqualTo(String value) {
            addCriterion("create_uname <=", value, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameLike(String value) {
            addCriterion("create_uname like", value, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameNotLike(String value) {
            addCriterion("create_uname not like", value, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameIn(List<String> values) {
            addCriterion("create_uname in", values, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameNotIn(List<String> values) {
            addCriterion("create_uname not in", values, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameBetween(String value1, String value2) {
            addCriterion("create_uname between", value1, value2, "createUname");
            return (Criteria) this;
        }

        public Criteria andCreateUnameNotBetween(String value1, String value2) {
            addCriterion("create_uname not between", value1, value2, "createUname");
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

        public Criteria andSubmitUidIsNull() {
            addCriterion("submit_uid is null");
            return (Criteria) this;
        }

        public Criteria andSubmitUidIsNotNull() {
            addCriterion("submit_uid is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitUidEqualTo(Integer value) {
            addCriterion("submit_uid =", value, "submitUid");
            return (Criteria) this;
        }

        public Criteria andSubmitUidNotEqualTo(Integer value) {
            addCriterion("submit_uid <>", value, "submitUid");
            return (Criteria) this;
        }

        public Criteria andSubmitUidGreaterThan(Integer value) {
            addCriterion("submit_uid >", value, "submitUid");
            return (Criteria) this;
        }

        public Criteria andSubmitUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("submit_uid >=", value, "submitUid");
            return (Criteria) this;
        }

        public Criteria andSubmitUidLessThan(Integer value) {
            addCriterion("submit_uid <", value, "submitUid");
            return (Criteria) this;
        }

        public Criteria andSubmitUidLessThanOrEqualTo(Integer value) {
            addCriterion("submit_uid <=", value, "submitUid");
            return (Criteria) this;
        }

        public Criteria andSubmitUidIn(List<Integer> values) {
            addCriterion("submit_uid in", values, "submitUid");
            return (Criteria) this;
        }

        public Criteria andSubmitUidNotIn(List<Integer> values) {
            addCriterion("submit_uid not in", values, "submitUid");
            return (Criteria) this;
        }

        public Criteria andSubmitUidBetween(Integer value1, Integer value2) {
            addCriterion("submit_uid between", value1, value2, "submitUid");
            return (Criteria) this;
        }

        public Criteria andSubmitUidNotBetween(Integer value1, Integer value2) {
            addCriterion("submit_uid not between", value1, value2, "submitUid");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNull() {
            addCriterion("submit_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Long value) {
            addCriterion("submit_time =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Long value) {
            addCriterion("submit_time <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Long value) {
            addCriterion("submit_time >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("submit_time >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Long value) {
            addCriterion("submit_time <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Long value) {
            addCriterion("submit_time <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Long> values) {
            addCriterion("submit_time in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Long> values) {
            addCriterion("submit_time not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Long value1, Long value2) {
            addCriterion("submit_time between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Long value1, Long value2) {
            addCriterion("submit_time not between", value1, value2, "submitTime");
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

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateOrderIsNull() {
            addCriterion("state_order is null");
            return (Criteria) this;
        }

        public Criteria andStateOrderIsNotNull() {
            addCriterion("state_order is not null");
            return (Criteria) this;
        }

        public Criteria andStateOrderEqualTo(Integer value) {
            addCriterion("state_order =", value, "stateOrder");
            return (Criteria) this;
        }

        public Criteria andStateOrderNotEqualTo(Integer value) {
            addCriterion("state_order <>", value, "stateOrder");
            return (Criteria) this;
        }

        public Criteria andStateOrderGreaterThan(Integer value) {
            addCriterion("state_order >", value, "stateOrder");
            return (Criteria) this;
        }

        public Criteria andStateOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("state_order >=", value, "stateOrder");
            return (Criteria) this;
        }

        public Criteria andStateOrderLessThan(Integer value) {
            addCriterion("state_order <", value, "stateOrder");
            return (Criteria) this;
        }

        public Criteria andStateOrderLessThanOrEqualTo(Integer value) {
            addCriterion("state_order <=", value, "stateOrder");
            return (Criteria) this;
        }

        public Criteria andStateOrderIn(List<Integer> values) {
            addCriterion("state_order in", values, "stateOrder");
            return (Criteria) this;
        }

        public Criteria andStateOrderNotIn(List<Integer> values) {
            addCriterion("state_order not in", values, "stateOrder");
            return (Criteria) this;
        }

        public Criteria andStateOrderBetween(Integer value1, Integer value2) {
            addCriterion("state_order between", value1, value2, "stateOrder");
            return (Criteria) this;
        }

        public Criteria andStateOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("state_order not between", value1, value2, "stateOrder");
            return (Criteria) this;
        }

        public Criteria andLastAuditUidIsNull() {
            addCriterion("last_audit_uid is null");
            return (Criteria) this;
        }

        public Criteria andLastAuditUidIsNotNull() {
            addCriterion("last_audit_uid is not null");
            return (Criteria) this;
        }

        public Criteria andLastAuditUidEqualTo(Integer value) {
            addCriterion("last_audit_uid =", value, "lastAuditUid");
            return (Criteria) this;
        }

        public Criteria andLastAuditUidNotEqualTo(Integer value) {
            addCriterion("last_audit_uid <>", value, "lastAuditUid");
            return (Criteria) this;
        }

        public Criteria andLastAuditUidGreaterThan(Integer value) {
            addCriterion("last_audit_uid >", value, "lastAuditUid");
            return (Criteria) this;
        }

        public Criteria andLastAuditUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_audit_uid >=", value, "lastAuditUid");
            return (Criteria) this;
        }

        public Criteria andLastAuditUidLessThan(Integer value) {
            addCriterion("last_audit_uid <", value, "lastAuditUid");
            return (Criteria) this;
        }

        public Criteria andLastAuditUidLessThanOrEqualTo(Integer value) {
            addCriterion("last_audit_uid <=", value, "lastAuditUid");
            return (Criteria) this;
        }

        public Criteria andLastAuditUidIn(List<Integer> values) {
            addCriterion("last_audit_uid in", values, "lastAuditUid");
            return (Criteria) this;
        }

        public Criteria andLastAuditUidNotIn(List<Integer> values) {
            addCriterion("last_audit_uid not in", values, "lastAuditUid");
            return (Criteria) this;
        }

        public Criteria andLastAuditUidBetween(Integer value1, Integer value2) {
            addCriterion("last_audit_uid between", value1, value2, "lastAuditUid");
            return (Criteria) this;
        }

        public Criteria andLastAuditUidNotBetween(Integer value1, Integer value2) {
            addCriterion("last_audit_uid not between", value1, value2, "lastAuditUid");
            return (Criteria) this;
        }

        public Criteria andLastAuditUsernameIsNull() {
            addCriterion("last_audit_username is null");
            return (Criteria) this;
        }

        public Criteria andLastAuditUsernameIsNotNull() {
            addCriterion("last_audit_username is not null");
            return (Criteria) this;
        }

        public Criteria andLastAuditUsernameEqualTo(String value) {
            addCriterion("last_audit_username =", value, "lastAuditUsername");
            return (Criteria) this;
        }

        public Criteria andLastAuditUsernameNotEqualTo(String value) {
            addCriterion("last_audit_username <>", value, "lastAuditUsername");
            return (Criteria) this;
        }

        public Criteria andLastAuditUsernameGreaterThan(String value) {
            addCriterion("last_audit_username >", value, "lastAuditUsername");
            return (Criteria) this;
        }

        public Criteria andLastAuditUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("last_audit_username >=", value, "lastAuditUsername");
            return (Criteria) this;
        }

        public Criteria andLastAuditUsernameLessThan(String value) {
            addCriterion("last_audit_username <", value, "lastAuditUsername");
            return (Criteria) this;
        }

        public Criteria andLastAuditUsernameLessThanOrEqualTo(String value) {
            addCriterion("last_audit_username <=", value, "lastAuditUsername");
            return (Criteria) this;
        }

        public Criteria andLastAuditUsernameLike(String value) {
            addCriterion("last_audit_username like", value, "lastAuditUsername");
            return (Criteria) this;
        }

        public Criteria andLastAuditUsernameNotLike(String value) {
            addCriterion("last_audit_username not like", value, "lastAuditUsername");
            return (Criteria) this;
        }

        public Criteria andLastAuditUsernameIn(List<String> values) {
            addCriterion("last_audit_username in", values, "lastAuditUsername");
            return (Criteria) this;
        }

        public Criteria andLastAuditUsernameNotIn(List<String> values) {
            addCriterion("last_audit_username not in", values, "lastAuditUsername");
            return (Criteria) this;
        }

        public Criteria andLastAuditUsernameBetween(String value1, String value2) {
            addCriterion("last_audit_username between", value1, value2, "lastAuditUsername");
            return (Criteria) this;
        }

        public Criteria andLastAuditUsernameNotBetween(String value1, String value2) {
            addCriterion("last_audit_username not between", value1, value2, "lastAuditUsername");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeIsNull() {
            addCriterion("last_audit_time is null");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeIsNotNull() {
            addCriterion("last_audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeEqualTo(Long value) {
            addCriterion("last_audit_time =", value, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeNotEqualTo(Long value) {
            addCriterion("last_audit_time <>", value, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeGreaterThan(Long value) {
            addCriterion("last_audit_time >", value, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("last_audit_time >=", value, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeLessThan(Long value) {
            addCriterion("last_audit_time <", value, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeLessThanOrEqualTo(Long value) {
            addCriterion("last_audit_time <=", value, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeIn(List<Long> values) {
            addCriterion("last_audit_time in", values, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeNotIn(List<Long> values) {
            addCriterion("last_audit_time not in", values, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeBetween(Long value1, Long value2) {
            addCriterion("last_audit_time between", value1, value2, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastAuditTimeNotBetween(Long value1, Long value2) {
            addCriterion("last_audit_time not between", value1, value2, "lastAuditTime");
            return (Criteria) this;
        }

        public Criteria andLastRejectReasonIsNull() {
            addCriterion("last_reject_reason is null");
            return (Criteria) this;
        }

        public Criteria andLastRejectReasonIsNotNull() {
            addCriterion("last_reject_reason is not null");
            return (Criteria) this;
        }

        public Criteria andLastRejectReasonEqualTo(String value) {
            addCriterion("last_reject_reason =", value, "lastRejectReason");
            return (Criteria) this;
        }

        public Criteria andLastRejectReasonNotEqualTo(String value) {
            addCriterion("last_reject_reason <>", value, "lastRejectReason");
            return (Criteria) this;
        }

        public Criteria andLastRejectReasonGreaterThan(String value) {
            addCriterion("last_reject_reason >", value, "lastRejectReason");
            return (Criteria) this;
        }

        public Criteria andLastRejectReasonGreaterThanOrEqualTo(String value) {
            addCriterion("last_reject_reason >=", value, "lastRejectReason");
            return (Criteria) this;
        }

        public Criteria andLastRejectReasonLessThan(String value) {
            addCriterion("last_reject_reason <", value, "lastRejectReason");
            return (Criteria) this;
        }

        public Criteria andLastRejectReasonLessThanOrEqualTo(String value) {
            addCriterion("last_reject_reason <=", value, "lastRejectReason");
            return (Criteria) this;
        }

        public Criteria andLastRejectReasonLike(String value) {
            addCriterion("last_reject_reason like", value, "lastRejectReason");
            return (Criteria) this;
        }

        public Criteria andLastRejectReasonNotLike(String value) {
            addCriterion("last_reject_reason not like", value, "lastRejectReason");
            return (Criteria) this;
        }

        public Criteria andLastRejectReasonIn(List<String> values) {
            addCriterion("last_reject_reason in", values, "lastRejectReason");
            return (Criteria) this;
        }

        public Criteria andLastRejectReasonNotIn(List<String> values) {
            addCriterion("last_reject_reason not in", values, "lastRejectReason");
            return (Criteria) this;
        }

        public Criteria andLastRejectReasonBetween(String value1, String value2) {
            addCriterion("last_reject_reason between", value1, value2, "lastRejectReason");
            return (Criteria) this;
        }

        public Criteria andLastRejectReasonNotBetween(String value1, String value2) {
            addCriterion("last_reject_reason not between", value1, value2, "lastRejectReason");
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

        public Criteria andPublishUidIsNull() {
            addCriterion("publish_uid is null");
            return (Criteria) this;
        }

        public Criteria andPublishUidIsNotNull() {
            addCriterion("publish_uid is not null");
            return (Criteria) this;
        }

        public Criteria andPublishUidEqualTo(Integer value) {
            addCriterion("publish_uid =", value, "publishUid");
            return (Criteria) this;
        }

        public Criteria andPublishUidNotEqualTo(Integer value) {
            addCriterion("publish_uid <>", value, "publishUid");
            return (Criteria) this;
        }

        public Criteria andPublishUidGreaterThan(Integer value) {
            addCriterion("publish_uid >", value, "publishUid");
            return (Criteria) this;
        }

        public Criteria andPublishUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_uid >=", value, "publishUid");
            return (Criteria) this;
        }

        public Criteria andPublishUidLessThan(Integer value) {
            addCriterion("publish_uid <", value, "publishUid");
            return (Criteria) this;
        }

        public Criteria andPublishUidLessThanOrEqualTo(Integer value) {
            addCriterion("publish_uid <=", value, "publishUid");
            return (Criteria) this;
        }

        public Criteria andPublishUidIn(List<Integer> values) {
            addCriterion("publish_uid in", values, "publishUid");
            return (Criteria) this;
        }

        public Criteria andPublishUidNotIn(List<Integer> values) {
            addCriterion("publish_uid not in", values, "publishUid");
            return (Criteria) this;
        }

        public Criteria andPublishUidBetween(Integer value1, Integer value2) {
            addCriterion("publish_uid between", value1, value2, "publishUid");
            return (Criteria) this;
        }

        public Criteria andPublishUidNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_uid not between", value1, value2, "publishUid");
            return (Criteria) this;
        }

        public Criteria andPublishUnameIsNull() {
            addCriterion("publish_uname is null");
            return (Criteria) this;
        }

        public Criteria andPublishUnameIsNotNull() {
            addCriterion("publish_uname is not null");
            return (Criteria) this;
        }

        public Criteria andPublishUnameEqualTo(String value) {
            addCriterion("publish_uname =", value, "publishUname");
            return (Criteria) this;
        }

        public Criteria andPublishUnameNotEqualTo(String value) {
            addCriterion("publish_uname <>", value, "publishUname");
            return (Criteria) this;
        }

        public Criteria andPublishUnameGreaterThan(String value) {
            addCriterion("publish_uname >", value, "publishUname");
            return (Criteria) this;
        }

        public Criteria andPublishUnameGreaterThanOrEqualTo(String value) {
            addCriterion("publish_uname >=", value, "publishUname");
            return (Criteria) this;
        }

        public Criteria andPublishUnameLessThan(String value) {
            addCriterion("publish_uname <", value, "publishUname");
            return (Criteria) this;
        }

        public Criteria andPublishUnameLessThanOrEqualTo(String value) {
            addCriterion("publish_uname <=", value, "publishUname");
            return (Criteria) this;
        }

        public Criteria andPublishUnameLike(String value) {
            addCriterion("publish_uname like", value, "publishUname");
            return (Criteria) this;
        }

        public Criteria andPublishUnameNotLike(String value) {
            addCriterion("publish_uname not like", value, "publishUname");
            return (Criteria) this;
        }

        public Criteria andPublishUnameIn(List<String> values) {
            addCriterion("publish_uname in", values, "publishUname");
            return (Criteria) this;
        }

        public Criteria andPublishUnameNotIn(List<String> values) {
            addCriterion("publish_uname not in", values, "publishUname");
            return (Criteria) this;
        }

        public Criteria andPublishUnameBetween(String value1, String value2) {
            addCriterion("publish_uname between", value1, value2, "publishUname");
            return (Criteria) this;
        }

        public Criteria andPublishUnameNotBetween(String value1, String value2) {
            addCriterion("publish_uname not between", value1, value2, "publishUname");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Long value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Long value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Long value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Long value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Long value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Long> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Long> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Long value1, Long value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Long value1, Long value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andUnpublishUidIsNull() {
            addCriterion("unpublish_uid is null");
            return (Criteria) this;
        }

        public Criteria andUnpublishUidIsNotNull() {
            addCriterion("unpublish_uid is not null");
            return (Criteria) this;
        }

        public Criteria andUnpublishUidEqualTo(Integer value) {
            addCriterion("unpublish_uid =", value, "unpublishUid");
            return (Criteria) this;
        }

        public Criteria andUnpublishUidNotEqualTo(Integer value) {
            addCriterion("unpublish_uid <>", value, "unpublishUid");
            return (Criteria) this;
        }

        public Criteria andUnpublishUidGreaterThan(Integer value) {
            addCriterion("unpublish_uid >", value, "unpublishUid");
            return (Criteria) this;
        }

        public Criteria andUnpublishUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("unpublish_uid >=", value, "unpublishUid");
            return (Criteria) this;
        }

        public Criteria andUnpublishUidLessThan(Integer value) {
            addCriterion("unpublish_uid <", value, "unpublishUid");
            return (Criteria) this;
        }

        public Criteria andUnpublishUidLessThanOrEqualTo(Integer value) {
            addCriterion("unpublish_uid <=", value, "unpublishUid");
            return (Criteria) this;
        }

        public Criteria andUnpublishUidIn(List<Integer> values) {
            addCriterion("unpublish_uid in", values, "unpublishUid");
            return (Criteria) this;
        }

        public Criteria andUnpublishUidNotIn(List<Integer> values) {
            addCriterion("unpublish_uid not in", values, "unpublishUid");
            return (Criteria) this;
        }

        public Criteria andUnpublishUidBetween(Integer value1, Integer value2) {
            addCriterion("unpublish_uid between", value1, value2, "unpublishUid");
            return (Criteria) this;
        }

        public Criteria andUnpublishUidNotBetween(Integer value1, Integer value2) {
            addCriterion("unpublish_uid not between", value1, value2, "unpublishUid");
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

        public Criteria andUnpublishReasonIsNull() {
            addCriterion("unpublish_reason is null");
            return (Criteria) this;
        }

        public Criteria andUnpublishReasonIsNotNull() {
            addCriterion("unpublish_reason is not null");
            return (Criteria) this;
        }

        public Criteria andUnpublishReasonEqualTo(String value) {
            addCriterion("unpublish_reason =", value, "unpublishReason");
            return (Criteria) this;
        }

        public Criteria andUnpublishReasonNotEqualTo(String value) {
            addCriterion("unpublish_reason <>", value, "unpublishReason");
            return (Criteria) this;
        }

        public Criteria andUnpublishReasonGreaterThan(String value) {
            addCriterion("unpublish_reason >", value, "unpublishReason");
            return (Criteria) this;
        }

        public Criteria andUnpublishReasonGreaterThanOrEqualTo(String value) {
            addCriterion("unpublish_reason >=", value, "unpublishReason");
            return (Criteria) this;
        }

        public Criteria andUnpublishReasonLessThan(String value) {
            addCriterion("unpublish_reason <", value, "unpublishReason");
            return (Criteria) this;
        }

        public Criteria andUnpublishReasonLessThanOrEqualTo(String value) {
            addCriterion("unpublish_reason <=", value, "unpublishReason");
            return (Criteria) this;
        }

        public Criteria andUnpublishReasonLike(String value) {
            addCriterion("unpublish_reason like", value, "unpublishReason");
            return (Criteria) this;
        }

        public Criteria andUnpublishReasonNotLike(String value) {
            addCriterion("unpublish_reason not like", value, "unpublishReason");
            return (Criteria) this;
        }

        public Criteria andUnpublishReasonIn(List<String> values) {
            addCriterion("unpublish_reason in", values, "unpublishReason");
            return (Criteria) this;
        }

        public Criteria andUnpublishReasonNotIn(List<String> values) {
            addCriterion("unpublish_reason not in", values, "unpublishReason");
            return (Criteria) this;
        }

        public Criteria andUnpublishReasonBetween(String value1, String value2) {
            addCriterion("unpublish_reason between", value1, value2, "unpublishReason");
            return (Criteria) this;
        }

        public Criteria andUnpublishReasonNotBetween(String value1, String value2) {
            addCriterion("unpublish_reason not between", value1, value2, "unpublishReason");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUidIsNull() {
            addCriterion("last_update_uid is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUidIsNotNull() {
            addCriterion("last_update_uid is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUidEqualTo(Integer value) {
            addCriterion("last_update_uid =", value, "lastUpdateUid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUidNotEqualTo(Integer value) {
            addCriterion("last_update_uid <>", value, "lastUpdateUid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUidGreaterThan(Integer value) {
            addCriterion("last_update_uid >", value, "lastUpdateUid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_update_uid >=", value, "lastUpdateUid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUidLessThan(Integer value) {
            addCriterion("last_update_uid <", value, "lastUpdateUid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUidLessThanOrEqualTo(Integer value) {
            addCriterion("last_update_uid <=", value, "lastUpdateUid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUidIn(List<Integer> values) {
            addCriterion("last_update_uid in", values, "lastUpdateUid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUidNotIn(List<Integer> values) {
            addCriterion("last_update_uid not in", values, "lastUpdateUid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUidBetween(Integer value1, Integer value2) {
            addCriterion("last_update_uid between", value1, value2, "lastUpdateUid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUidNotBetween(Integer value1, Integer value2) {
            addCriterion("last_update_uid not between", value1, value2, "lastUpdateUid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUnameIsNull() {
            addCriterion("last_update_uname is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUnameIsNotNull() {
            addCriterion("last_update_uname is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUnameEqualTo(String value) {
            addCriterion("last_update_uname =", value, "lastUpdateUname");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUnameNotEqualTo(String value) {
            addCriterion("last_update_uname <>", value, "lastUpdateUname");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUnameGreaterThan(String value) {
            addCriterion("last_update_uname >", value, "lastUpdateUname");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUnameGreaterThanOrEqualTo(String value) {
            addCriterion("last_update_uname >=", value, "lastUpdateUname");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUnameLessThan(String value) {
            addCriterion("last_update_uname <", value, "lastUpdateUname");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUnameLessThanOrEqualTo(String value) {
            addCriterion("last_update_uname <=", value, "lastUpdateUname");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUnameLike(String value) {
            addCriterion("last_update_uname like", value, "lastUpdateUname");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUnameNotLike(String value) {
            addCriterion("last_update_uname not like", value, "lastUpdateUname");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUnameIn(List<String> values) {
            addCriterion("last_update_uname in", values, "lastUpdateUname");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUnameNotIn(List<String> values) {
            addCriterion("last_update_uname not in", values, "lastUpdateUname");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUnameBetween(String value1, String value2) {
            addCriterion("last_update_uname between", value1, value2, "lastUpdateUname");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUnameNotBetween(String value1, String value2) {
            addCriterion("last_update_uname not between", value1, value2, "lastUpdateUname");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Long value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Long value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Long value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Long value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Long> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Long> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
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

        public Criteria andSeoDescriptionIsNull() {
            addCriterion("seo_description is null");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionIsNotNull() {
            addCriterion("seo_description is not null");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionEqualTo(String value) {
            addCriterion("seo_description =", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotEqualTo(String value) {
            addCriterion("seo_description <>", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionGreaterThan(String value) {
            addCriterion("seo_description >", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("seo_description >=", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLessThan(String value) {
            addCriterion("seo_description <", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLessThanOrEqualTo(String value) {
            addCriterion("seo_description <=", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLike(String value) {
            addCriterion("seo_description like", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotLike(String value) {
            addCriterion("seo_description not like", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionIn(List<String> values) {
            addCriterion("seo_description in", values, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotIn(List<String> values) {
            addCriterion("seo_description not in", values, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionBetween(String value1, String value2) {
            addCriterion("seo_description between", value1, value2, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotBetween(String value1, String value2) {
            addCriterion("seo_description not between", value1, value2, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andAllowUpIsNull() {
            addCriterion("allow_up is null");
            return (Criteria) this;
        }

        public Criteria andAllowUpIsNotNull() {
            addCriterion("allow_up is not null");
            return (Criteria) this;
        }

        public Criteria andAllowUpEqualTo(Byte value) {
            addCriterion("allow_up =", value, "allowUp");
            return (Criteria) this;
        }

        public Criteria andAllowUpNotEqualTo(Byte value) {
            addCriterion("allow_up <>", value, "allowUp");
            return (Criteria) this;
        }

        public Criteria andAllowUpGreaterThan(Byte value) {
            addCriterion("allow_up >", value, "allowUp");
            return (Criteria) this;
        }

        public Criteria andAllowUpGreaterThanOrEqualTo(Byte value) {
            addCriterion("allow_up >=", value, "allowUp");
            return (Criteria) this;
        }

        public Criteria andAllowUpLessThan(Byte value) {
            addCriterion("allow_up <", value, "allowUp");
            return (Criteria) this;
        }

        public Criteria andAllowUpLessThanOrEqualTo(Byte value) {
            addCriterion("allow_up <=", value, "allowUp");
            return (Criteria) this;
        }

        public Criteria andAllowUpIn(List<Byte> values) {
            addCriterion("allow_up in", values, "allowUp");
            return (Criteria) this;
        }

        public Criteria andAllowUpNotIn(List<Byte> values) {
            addCriterion("allow_up not in", values, "allowUp");
            return (Criteria) this;
        }

        public Criteria andAllowUpBetween(Byte value1, Byte value2) {
            addCriterion("allow_up between", value1, value2, "allowUp");
            return (Criteria) this;
        }

        public Criteria andAllowUpNotBetween(Byte value1, Byte value2) {
            addCriterion("allow_up not between", value1, value2, "allowUp");
            return (Criteria) this;
        }

        public Criteria andAllowFavIsNull() {
            addCriterion("allow_fav is null");
            return (Criteria) this;
        }

        public Criteria andAllowFavIsNotNull() {
            addCriterion("allow_fav is not null");
            return (Criteria) this;
        }

        public Criteria andAllowFavEqualTo(Byte value) {
            addCriterion("allow_fav =", value, "allowFav");
            return (Criteria) this;
        }

        public Criteria andAllowFavNotEqualTo(Byte value) {
            addCriterion("allow_fav <>", value, "allowFav");
            return (Criteria) this;
        }

        public Criteria andAllowFavGreaterThan(Byte value) {
            addCriterion("allow_fav >", value, "allowFav");
            return (Criteria) this;
        }

        public Criteria andAllowFavGreaterThanOrEqualTo(Byte value) {
            addCriterion("allow_fav >=", value, "allowFav");
            return (Criteria) this;
        }

        public Criteria andAllowFavLessThan(Byte value) {
            addCriterion("allow_fav <", value, "allowFav");
            return (Criteria) this;
        }

        public Criteria andAllowFavLessThanOrEqualTo(Byte value) {
            addCriterion("allow_fav <=", value, "allowFav");
            return (Criteria) this;
        }

        public Criteria andAllowFavIn(List<Byte> values) {
            addCriterion("allow_fav in", values, "allowFav");
            return (Criteria) this;
        }

        public Criteria andAllowFavNotIn(List<Byte> values) {
            addCriterion("allow_fav not in", values, "allowFav");
            return (Criteria) this;
        }

        public Criteria andAllowFavBetween(Byte value1, Byte value2) {
            addCriterion("allow_fav between", value1, value2, "allowFav");
            return (Criteria) this;
        }

        public Criteria andAllowFavNotBetween(Byte value1, Byte value2) {
            addCriterion("allow_fav not between", value1, value2, "allowFav");
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