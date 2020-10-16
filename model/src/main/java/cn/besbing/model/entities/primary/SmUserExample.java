package cn.besbing.model.entities.primary;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SmUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmUserExample() {
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

        public Criteria andCuseridIsNull() {
            addCriterion("CUSERID is null");
            return (Criteria) this;
        }

        public Criteria andCuseridIsNotNull() {
            addCriterion("CUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andCuseridEqualTo(String value) {
            addCriterion("CUSERID =", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridNotEqualTo(String value) {
            addCriterion("CUSERID <>", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridGreaterThan(String value) {
            addCriterion("CUSERID >", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridGreaterThanOrEqualTo(String value) {
            addCriterion("CUSERID >=", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridLessThan(String value) {
            addCriterion("CUSERID <", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridLessThanOrEqualTo(String value) {
            addCriterion("CUSERID <=", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridLike(String value) {
            addCriterion("CUSERID like", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridNotLike(String value) {
            addCriterion("CUSERID not like", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridIn(List<String> values) {
            addCriterion("CUSERID in", values, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridNotIn(List<String> values) {
            addCriterion("CUSERID not in", values, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridBetween(String value1, String value2) {
            addCriterion("CUSERID between", value1, value2, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridNotBetween(String value1, String value2) {
            addCriterion("CUSERID not between", value1, value2, "cuserid");
            return (Criteria) this;
        }

        public Criteria andAbledateIsNull() {
            addCriterion("ABLEDATE is null");
            return (Criteria) this;
        }

        public Criteria andAbledateIsNotNull() {
            addCriterion("ABLEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAbledateEqualTo(String value) {
            addCriterion("ABLEDATE =", value, "abledate");
            return (Criteria) this;
        }

        public Criteria andAbledateNotEqualTo(String value) {
            addCriterion("ABLEDATE <>", value, "abledate");
            return (Criteria) this;
        }

        public Criteria andAbledateGreaterThan(String value) {
            addCriterion("ABLEDATE >", value, "abledate");
            return (Criteria) this;
        }

        public Criteria andAbledateGreaterThanOrEqualTo(String value) {
            addCriterion("ABLEDATE >=", value, "abledate");
            return (Criteria) this;
        }

        public Criteria andAbledateLessThan(String value) {
            addCriterion("ABLEDATE <", value, "abledate");
            return (Criteria) this;
        }

        public Criteria andAbledateLessThanOrEqualTo(String value) {
            addCriterion("ABLEDATE <=", value, "abledate");
            return (Criteria) this;
        }

        public Criteria andAbledateLike(String value) {
            addCriterion("ABLEDATE like", value, "abledate");
            return (Criteria) this;
        }

        public Criteria andAbledateNotLike(String value) {
            addCriterion("ABLEDATE not like", value, "abledate");
            return (Criteria) this;
        }

        public Criteria andAbledateIn(List<String> values) {
            addCriterion("ABLEDATE in", values, "abledate");
            return (Criteria) this;
        }

        public Criteria andAbledateNotIn(List<String> values) {
            addCriterion("ABLEDATE not in", values, "abledate");
            return (Criteria) this;
        }

        public Criteria andAbledateBetween(String value1, String value2) {
            addCriterion("ABLEDATE between", value1, value2, "abledate");
            return (Criteria) this;
        }

        public Criteria andAbledateNotBetween(String value1, String value2) {
            addCriterion("ABLEDATE not between", value1, value2, "abledate");
            return (Criteria) this;
        }

        public Criteria andBaseDocTypeIsNull() {
            addCriterion("BASE_DOC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBaseDocTypeIsNotNull() {
            addCriterion("BASE_DOC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBaseDocTypeEqualTo(BigDecimal value) {
            addCriterion("BASE_DOC_TYPE =", value, "baseDocType");
            return (Criteria) this;
        }

        public Criteria andBaseDocTypeNotEqualTo(BigDecimal value) {
            addCriterion("BASE_DOC_TYPE <>", value, "baseDocType");
            return (Criteria) this;
        }

        public Criteria andBaseDocTypeGreaterThan(BigDecimal value) {
            addCriterion("BASE_DOC_TYPE >", value, "baseDocType");
            return (Criteria) this;
        }

        public Criteria andBaseDocTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_DOC_TYPE >=", value, "baseDocType");
            return (Criteria) this;
        }

        public Criteria andBaseDocTypeLessThan(BigDecimal value) {
            addCriterion("BASE_DOC_TYPE <", value, "baseDocType");
            return (Criteria) this;
        }

        public Criteria andBaseDocTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_DOC_TYPE <=", value, "baseDocType");
            return (Criteria) this;
        }

        public Criteria andBaseDocTypeIn(List<BigDecimal> values) {
            addCriterion("BASE_DOC_TYPE in", values, "baseDocType");
            return (Criteria) this;
        }

        public Criteria andBaseDocTypeNotIn(List<BigDecimal> values) {
            addCriterion("BASE_DOC_TYPE not in", values, "baseDocType");
            return (Criteria) this;
        }

        public Criteria andBaseDocTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_DOC_TYPE between", value1, value2, "baseDocType");
            return (Criteria) this;
        }

        public Criteria andBaseDocTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_DOC_TYPE not between", value1, value2, "baseDocType");
            return (Criteria) this;
        }

        public Criteria andContentlangIsNull() {
            addCriterion("CONTENTLANG is null");
            return (Criteria) this;
        }

        public Criteria andContentlangIsNotNull() {
            addCriterion("CONTENTLANG is not null");
            return (Criteria) this;
        }

        public Criteria andContentlangEqualTo(String value) {
            addCriterion("CONTENTLANG =", value, "contentlang");
            return (Criteria) this;
        }

        public Criteria andContentlangNotEqualTo(String value) {
            addCriterion("CONTENTLANG <>", value, "contentlang");
            return (Criteria) this;
        }

        public Criteria andContentlangGreaterThan(String value) {
            addCriterion("CONTENTLANG >", value, "contentlang");
            return (Criteria) this;
        }

        public Criteria andContentlangGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENTLANG >=", value, "contentlang");
            return (Criteria) this;
        }

        public Criteria andContentlangLessThan(String value) {
            addCriterion("CONTENTLANG <", value, "contentlang");
            return (Criteria) this;
        }

        public Criteria andContentlangLessThanOrEqualTo(String value) {
            addCriterion("CONTENTLANG <=", value, "contentlang");
            return (Criteria) this;
        }

        public Criteria andContentlangLike(String value) {
            addCriterion("CONTENTLANG like", value, "contentlang");
            return (Criteria) this;
        }

        public Criteria andContentlangNotLike(String value) {
            addCriterion("CONTENTLANG not like", value, "contentlang");
            return (Criteria) this;
        }

        public Criteria andContentlangIn(List<String> values) {
            addCriterion("CONTENTLANG in", values, "contentlang");
            return (Criteria) this;
        }

        public Criteria andContentlangNotIn(List<String> values) {
            addCriterion("CONTENTLANG not in", values, "contentlang");
            return (Criteria) this;
        }

        public Criteria andContentlangBetween(String value1, String value2) {
            addCriterion("CONTENTLANG between", value1, value2, "contentlang");
            return (Criteria) this;
        }

        public Criteria andContentlangNotBetween(String value1, String value2) {
            addCriterion("CONTENTLANG not between", value1, value2, "contentlang");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("CREATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("CREATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(String value) {
            addCriterion("CREATIONTIME =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(String value) {
            addCriterion("CREATIONTIME <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(String value) {
            addCriterion("CREATIONTIME >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATIONTIME >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(String value) {
            addCriterion("CREATIONTIME <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(String value) {
            addCriterion("CREATIONTIME <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLike(String value) {
            addCriterion("CREATIONTIME like", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotLike(String value) {
            addCriterion("CREATIONTIME not like", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<String> values) {
            addCriterion("CREATIONTIME in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<String> values) {
            addCriterion("CREATIONTIME not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(String value1, String value2) {
            addCriterion("CREATIONTIME between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(String value1, String value2) {
            addCriterion("CREATIONTIME not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andDataoriginflagIsNull() {
            addCriterion("DATAORIGINFLAG is null");
            return (Criteria) this;
        }

        public Criteria andDataoriginflagIsNotNull() {
            addCriterion("DATAORIGINFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDataoriginflagEqualTo(BigDecimal value) {
            addCriterion("DATAORIGINFLAG =", value, "dataoriginflag");
            return (Criteria) this;
        }

        public Criteria andDataoriginflagNotEqualTo(BigDecimal value) {
            addCriterion("DATAORIGINFLAG <>", value, "dataoriginflag");
            return (Criteria) this;
        }

        public Criteria andDataoriginflagGreaterThan(BigDecimal value) {
            addCriterion("DATAORIGINFLAG >", value, "dataoriginflag");
            return (Criteria) this;
        }

        public Criteria andDataoriginflagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DATAORIGINFLAG >=", value, "dataoriginflag");
            return (Criteria) this;
        }

        public Criteria andDataoriginflagLessThan(BigDecimal value) {
            addCriterion("DATAORIGINFLAG <", value, "dataoriginflag");
            return (Criteria) this;
        }

        public Criteria andDataoriginflagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DATAORIGINFLAG <=", value, "dataoriginflag");
            return (Criteria) this;
        }

        public Criteria andDataoriginflagIn(List<BigDecimal> values) {
            addCriterion("DATAORIGINFLAG in", values, "dataoriginflag");
            return (Criteria) this;
        }

        public Criteria andDataoriginflagNotIn(List<BigDecimal> values) {
            addCriterion("DATAORIGINFLAG not in", values, "dataoriginflag");
            return (Criteria) this;
        }

        public Criteria andDataoriginflagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DATAORIGINFLAG between", value1, value2, "dataoriginflag");
            return (Criteria) this;
        }

        public Criteria andDataoriginflagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DATAORIGINFLAG not between", value1, value2, "dataoriginflag");
            return (Criteria) this;
        }

        public Criteria andDisabledateIsNull() {
            addCriterion("DISABLEDATE is null");
            return (Criteria) this;
        }

        public Criteria andDisabledateIsNotNull() {
            addCriterion("DISABLEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledateEqualTo(String value) {
            addCriterion("DISABLEDATE =", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateNotEqualTo(String value) {
            addCriterion("DISABLEDATE <>", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateGreaterThan(String value) {
            addCriterion("DISABLEDATE >", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateGreaterThanOrEqualTo(String value) {
            addCriterion("DISABLEDATE >=", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateLessThan(String value) {
            addCriterion("DISABLEDATE <", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateLessThanOrEqualTo(String value) {
            addCriterion("DISABLEDATE <=", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateLike(String value) {
            addCriterion("DISABLEDATE like", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateNotLike(String value) {
            addCriterion("DISABLEDATE not like", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateIn(List<String> values) {
            addCriterion("DISABLEDATE in", values, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateNotIn(List<String> values) {
            addCriterion("DISABLEDATE not in", values, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateBetween(String value1, String value2) {
            addCriterion("DISABLEDATE between", value1, value2, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateNotBetween(String value1, String value2) {
            addCriterion("DISABLEDATE not between", value1, value2, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDrIsNull() {
            addCriterion("DR is null");
            return (Criteria) this;
        }

        public Criteria andDrIsNotNull() {
            addCriterion("DR is not null");
            return (Criteria) this;
        }

        public Criteria andDrEqualTo(Long value) {
            addCriterion("DR =", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotEqualTo(Long value) {
            addCriterion("DR <>", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThan(Long value) {
            addCriterion("DR >", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThanOrEqualTo(Long value) {
            addCriterion("DR >=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThan(Long value) {
            addCriterion("DR <", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThanOrEqualTo(Long value) {
            addCriterion("DR <=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrIn(List<Long> values) {
            addCriterion("DR in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotIn(List<Long> values) {
            addCriterion("DR not in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrBetween(Long value1, Long value2) {
            addCriterion("DR between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotBetween(Long value1, Long value2) {
            addCriterion("DR not between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEnablestateIsNull() {
            addCriterion("ENABLESTATE is null");
            return (Criteria) this;
        }

        public Criteria andEnablestateIsNotNull() {
            addCriterion("ENABLESTATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnablestateEqualTo(BigDecimal value) {
            addCriterion("ENABLESTATE =", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotEqualTo(BigDecimal value) {
            addCriterion("ENABLESTATE <>", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateGreaterThan(BigDecimal value) {
            addCriterion("ENABLESTATE >", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ENABLESTATE >=", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateLessThan(BigDecimal value) {
            addCriterion("ENABLESTATE <", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ENABLESTATE <=", value, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateIn(List<BigDecimal> values) {
            addCriterion("ENABLESTATE in", values, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotIn(List<BigDecimal> values) {
            addCriterion("ENABLESTATE not in", values, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENABLESTATE between", value1, value2, "enablestate");
            return (Criteria) this;
        }

        public Criteria andEnablestateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENABLESTATE not between", value1, value2, "enablestate");
            return (Criteria) this;
        }

        public Criteria andFormatIsNull() {
            addCriterion("FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andFormatIsNotNull() {
            addCriterion("FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andFormatEqualTo(String value) {
            addCriterion("FORMAT =", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotEqualTo(String value) {
            addCriterion("FORMAT <>", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatGreaterThan(String value) {
            addCriterion("FORMAT >", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatGreaterThanOrEqualTo(String value) {
            addCriterion("FORMAT >=", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLessThan(String value) {
            addCriterion("FORMAT <", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLessThanOrEqualTo(String value) {
            addCriterion("FORMAT <=", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLike(String value) {
            addCriterion("FORMAT like", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotLike(String value) {
            addCriterion("FORMAT not like", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatIn(List<String> values) {
            addCriterion("FORMAT in", values, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotIn(List<String> values) {
            addCriterion("FORMAT not in", values, "format");
            return (Criteria) this;
        }

        public Criteria andFormatBetween(String value1, String value2) {
            addCriterion("FORMAT between", value1, value2, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotBetween(String value1, String value2) {
            addCriterion("FORMAT not between", value1, value2, "format");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeIsNull() {
            addCriterion("IDENTITYVERIFYCODE is null");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeIsNotNull() {
            addCriterion("IDENTITYVERIFYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeEqualTo(String value) {
            addCriterion("IDENTITYVERIFYCODE =", value, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeNotEqualTo(String value) {
            addCriterion("IDENTITYVERIFYCODE <>", value, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeGreaterThan(String value) {
            addCriterion("IDENTITYVERIFYCODE >", value, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTITYVERIFYCODE >=", value, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeLessThan(String value) {
            addCriterion("IDENTITYVERIFYCODE <", value, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeLessThanOrEqualTo(String value) {
            addCriterion("IDENTITYVERIFYCODE <=", value, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeLike(String value) {
            addCriterion("IDENTITYVERIFYCODE like", value, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeNotLike(String value) {
            addCriterion("IDENTITYVERIFYCODE not like", value, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeIn(List<String> values) {
            addCriterion("IDENTITYVERIFYCODE in", values, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeNotIn(List<String> values) {
            addCriterion("IDENTITYVERIFYCODE not in", values, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeBetween(String value1, String value2) {
            addCriterion("IDENTITYVERIFYCODE between", value1, value2, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIdentityverifycodeNotBetween(String value1, String value2) {
            addCriterion("IDENTITYVERIFYCODE not between", value1, value2, "identityverifycode");
            return (Criteria) this;
        }

        public Criteria andIscaIsNull() {
            addCriterion("ISCA is null");
            return (Criteria) this;
        }

        public Criteria andIscaIsNotNull() {
            addCriterion("ISCA is not null");
            return (Criteria) this;
        }

        public Criteria andIscaEqualTo(String value) {
            addCriterion("ISCA =", value, "isca");
            return (Criteria) this;
        }

        public Criteria andIscaNotEqualTo(String value) {
            addCriterion("ISCA <>", value, "isca");
            return (Criteria) this;
        }

        public Criteria andIscaGreaterThan(String value) {
            addCriterion("ISCA >", value, "isca");
            return (Criteria) this;
        }

        public Criteria andIscaGreaterThanOrEqualTo(String value) {
            addCriterion("ISCA >=", value, "isca");
            return (Criteria) this;
        }

        public Criteria andIscaLessThan(String value) {
            addCriterion("ISCA <", value, "isca");
            return (Criteria) this;
        }

        public Criteria andIscaLessThanOrEqualTo(String value) {
            addCriterion("ISCA <=", value, "isca");
            return (Criteria) this;
        }

        public Criteria andIscaLike(String value) {
            addCriterion("ISCA like", value, "isca");
            return (Criteria) this;
        }

        public Criteria andIscaNotLike(String value) {
            addCriterion("ISCA not like", value, "isca");
            return (Criteria) this;
        }

        public Criteria andIscaIn(List<String> values) {
            addCriterion("ISCA in", values, "isca");
            return (Criteria) this;
        }

        public Criteria andIscaNotIn(List<String> values) {
            addCriterion("ISCA not in", values, "isca");
            return (Criteria) this;
        }

        public Criteria andIscaBetween(String value1, String value2) {
            addCriterion("ISCA between", value1, value2, "isca");
            return (Criteria) this;
        }

        public Criteria andIscaNotBetween(String value1, String value2) {
            addCriterion("ISCA not between", value1, value2, "isca");
            return (Criteria) this;
        }

        public Criteria andIslockedIsNull() {
            addCriterion("ISLOCKED is null");
            return (Criteria) this;
        }

        public Criteria andIslockedIsNotNull() {
            addCriterion("ISLOCKED is not null");
            return (Criteria) this;
        }

        public Criteria andIslockedEqualTo(String value) {
            addCriterion("ISLOCKED =", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotEqualTo(String value) {
            addCriterion("ISLOCKED <>", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedGreaterThan(String value) {
            addCriterion("ISLOCKED >", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedGreaterThanOrEqualTo(String value) {
            addCriterion("ISLOCKED >=", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedLessThan(String value) {
            addCriterion("ISLOCKED <", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedLessThanOrEqualTo(String value) {
            addCriterion("ISLOCKED <=", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedLike(String value) {
            addCriterion("ISLOCKED like", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotLike(String value) {
            addCriterion("ISLOCKED not like", value, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedIn(List<String> values) {
            addCriterion("ISLOCKED in", values, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotIn(List<String> values) {
            addCriterion("ISLOCKED not in", values, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedBetween(String value1, String value2) {
            addCriterion("ISLOCKED between", value1, value2, "islocked");
            return (Criteria) this;
        }

        public Criteria andIslockedNotBetween(String value1, String value2) {
            addCriterion("ISLOCKED not between", value1, value2, "islocked");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNull() {
            addCriterion("MODIFIEDTIME is null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNotNull() {
            addCriterion("MODIFIEDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeEqualTo(String value) {
            addCriterion("MODIFIEDTIME =", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotEqualTo(String value) {
            addCriterion("MODIFIEDTIME <>", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThan(String value) {
            addCriterion("MODIFIEDTIME >", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIEDTIME >=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThan(String value) {
            addCriterion("MODIFIEDTIME <", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThanOrEqualTo(String value) {
            addCriterion("MODIFIEDTIME <=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLike(String value) {
            addCriterion("MODIFIEDTIME like", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotLike(String value) {
            addCriterion("MODIFIEDTIME not like", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIn(List<String> values) {
            addCriterion("MODIFIEDTIME in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotIn(List<String> values) {
            addCriterion("MODIFIEDTIME not in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeBetween(String value1, String value2) {
            addCriterion("MODIFIEDTIME between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotBetween(String value1, String value2) {
            addCriterion("MODIFIEDTIME not between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("MODIFIER =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("MODIFIER <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("MODIFIER >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIER >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("MODIFIER <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("MODIFIER <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("MODIFIER like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("MODIFIER not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("MODIFIER in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("MODIFIER not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("MODIFIER between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("MODIFIER not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andPkBaseDocIsNull() {
            addCriterion("PK_BASE_DOC is null");
            return (Criteria) this;
        }

        public Criteria andPkBaseDocIsNotNull() {
            addCriterion("PK_BASE_DOC is not null");
            return (Criteria) this;
        }

        public Criteria andPkBaseDocEqualTo(String value) {
            addCriterion("PK_BASE_DOC =", value, "pkBaseDoc");
            return (Criteria) this;
        }

        public Criteria andPkBaseDocNotEqualTo(String value) {
            addCriterion("PK_BASE_DOC <>", value, "pkBaseDoc");
            return (Criteria) this;
        }

        public Criteria andPkBaseDocGreaterThan(String value) {
            addCriterion("PK_BASE_DOC >", value, "pkBaseDoc");
            return (Criteria) this;
        }

        public Criteria andPkBaseDocGreaterThanOrEqualTo(String value) {
            addCriterion("PK_BASE_DOC >=", value, "pkBaseDoc");
            return (Criteria) this;
        }

        public Criteria andPkBaseDocLessThan(String value) {
            addCriterion("PK_BASE_DOC <", value, "pkBaseDoc");
            return (Criteria) this;
        }

        public Criteria andPkBaseDocLessThanOrEqualTo(String value) {
            addCriterion("PK_BASE_DOC <=", value, "pkBaseDoc");
            return (Criteria) this;
        }

        public Criteria andPkBaseDocLike(String value) {
            addCriterion("PK_BASE_DOC like", value, "pkBaseDoc");
            return (Criteria) this;
        }

        public Criteria andPkBaseDocNotLike(String value) {
            addCriterion("PK_BASE_DOC not like", value, "pkBaseDoc");
            return (Criteria) this;
        }

        public Criteria andPkBaseDocIn(List<String> values) {
            addCriterion("PK_BASE_DOC in", values, "pkBaseDoc");
            return (Criteria) this;
        }

        public Criteria andPkBaseDocNotIn(List<String> values) {
            addCriterion("PK_BASE_DOC not in", values, "pkBaseDoc");
            return (Criteria) this;
        }

        public Criteria andPkBaseDocBetween(String value1, String value2) {
            addCriterion("PK_BASE_DOC between", value1, value2, "pkBaseDoc");
            return (Criteria) this;
        }

        public Criteria andPkBaseDocNotBetween(String value1, String value2) {
            addCriterion("PK_BASE_DOC not between", value1, value2, "pkBaseDoc");
            return (Criteria) this;
        }

        public Criteria andPkCustomerIsNull() {
            addCriterion("PK_CUSTOMER is null");
            return (Criteria) this;
        }

        public Criteria andPkCustomerIsNotNull() {
            addCriterion("PK_CUSTOMER is not null");
            return (Criteria) this;
        }

        public Criteria andPkCustomerEqualTo(String value) {
            addCriterion("PK_CUSTOMER =", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerNotEqualTo(String value) {
            addCriterion("PK_CUSTOMER <>", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerGreaterThan(String value) {
            addCriterion("PK_CUSTOMER >", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("PK_CUSTOMER >=", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerLessThan(String value) {
            addCriterion("PK_CUSTOMER <", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerLessThanOrEqualTo(String value) {
            addCriterion("PK_CUSTOMER <=", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerLike(String value) {
            addCriterion("PK_CUSTOMER like", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerNotLike(String value) {
            addCriterion("PK_CUSTOMER not like", value, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerIn(List<String> values) {
            addCriterion("PK_CUSTOMER in", values, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerNotIn(List<String> values) {
            addCriterion("PK_CUSTOMER not in", values, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerBetween(String value1, String value2) {
            addCriterion("PK_CUSTOMER between", value1, value2, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkCustomerNotBetween(String value1, String value2) {
            addCriterion("PK_CUSTOMER not between", value1, value2, "pkCustomer");
            return (Criteria) this;
        }

        public Criteria andPkGroupIsNull() {
            addCriterion("PK_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andPkGroupIsNotNull() {
            addCriterion("PK_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andPkGroupEqualTo(String value) {
            addCriterion("PK_GROUP =", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotEqualTo(String value) {
            addCriterion("PK_GROUP <>", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupGreaterThan(String value) {
            addCriterion("PK_GROUP >", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupGreaterThanOrEqualTo(String value) {
            addCriterion("PK_GROUP >=", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupLessThan(String value) {
            addCriterion("PK_GROUP <", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupLessThanOrEqualTo(String value) {
            addCriterion("PK_GROUP <=", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupLike(String value) {
            addCriterion("PK_GROUP like", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotLike(String value) {
            addCriterion("PK_GROUP not like", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupIn(List<String> values) {
            addCriterion("PK_GROUP in", values, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotIn(List<String> values) {
            addCriterion("PK_GROUP not in", values, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupBetween(String value1, String value2) {
            addCriterion("PK_GROUP between", value1, value2, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotBetween(String value1, String value2) {
            addCriterion("PK_GROUP not between", value1, value2, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkOrgIsNull() {
            addCriterion("PK_ORG is null");
            return (Criteria) this;
        }

        public Criteria andPkOrgIsNotNull() {
            addCriterion("PK_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andPkOrgEqualTo(String value) {
            addCriterion("PK_ORG =", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotEqualTo(String value) {
            addCriterion("PK_ORG <>", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgGreaterThan(String value) {
            addCriterion("PK_ORG >", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ORG >=", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLessThan(String value) {
            addCriterion("PK_ORG <", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLessThanOrEqualTo(String value) {
            addCriterion("PK_ORG <=", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLike(String value) {
            addCriterion("PK_ORG like", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotLike(String value) {
            addCriterion("PK_ORG not like", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgIn(List<String> values) {
            addCriterion("PK_ORG in", values, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotIn(List<String> values) {
            addCriterion("PK_ORG not in", values, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgBetween(String value1, String value2) {
            addCriterion("PK_ORG between", value1, value2, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotBetween(String value1, String value2) {
            addCriterion("PK_ORG not between", value1, value2, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkPsndocIsNull() {
            addCriterion("PK_PSNDOC is null");
            return (Criteria) this;
        }

        public Criteria andPkPsndocIsNotNull() {
            addCriterion("PK_PSNDOC is not null");
            return (Criteria) this;
        }

        public Criteria andPkPsndocEqualTo(String value) {
            addCriterion("PK_PSNDOC =", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocNotEqualTo(String value) {
            addCriterion("PK_PSNDOC <>", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocGreaterThan(String value) {
            addCriterion("PK_PSNDOC >", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocGreaterThanOrEqualTo(String value) {
            addCriterion("PK_PSNDOC >=", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocLessThan(String value) {
            addCriterion("PK_PSNDOC <", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocLessThanOrEqualTo(String value) {
            addCriterion("PK_PSNDOC <=", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocLike(String value) {
            addCriterion("PK_PSNDOC like", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocNotLike(String value) {
            addCriterion("PK_PSNDOC not like", value, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocIn(List<String> values) {
            addCriterion("PK_PSNDOC in", values, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocNotIn(List<String> values) {
            addCriterion("PK_PSNDOC not in", values, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocBetween(String value1, String value2) {
            addCriterion("PK_PSNDOC between", value1, value2, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkPsndocNotBetween(String value1, String value2) {
            addCriterion("PK_PSNDOC not between", value1, value2, "pkPsndoc");
            return (Criteria) this;
        }

        public Criteria andPkSupplierIsNull() {
            addCriterion("PK_SUPPLIER is null");
            return (Criteria) this;
        }

        public Criteria andPkSupplierIsNotNull() {
            addCriterion("PK_SUPPLIER is not null");
            return (Criteria) this;
        }

        public Criteria andPkSupplierEqualTo(String value) {
            addCriterion("PK_SUPPLIER =", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierNotEqualTo(String value) {
            addCriterion("PK_SUPPLIER <>", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierGreaterThan(String value) {
            addCriterion("PK_SUPPLIER >", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("PK_SUPPLIER >=", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierLessThan(String value) {
            addCriterion("PK_SUPPLIER <", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierLessThanOrEqualTo(String value) {
            addCriterion("PK_SUPPLIER <=", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierLike(String value) {
            addCriterion("PK_SUPPLIER like", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierNotLike(String value) {
            addCriterion("PK_SUPPLIER not like", value, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierIn(List<String> values) {
            addCriterion("PK_SUPPLIER in", values, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierNotIn(List<String> values) {
            addCriterion("PK_SUPPLIER not in", values, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierBetween(String value1, String value2) {
            addCriterion("PK_SUPPLIER between", value1, value2, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkSupplierNotBetween(String value1, String value2) {
            addCriterion("PK_SUPPLIER not between", value1, value2, "pkSupplier");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupforcreateIsNull() {
            addCriterion("PK_USERGROUPFORCREATE is null");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupforcreateIsNotNull() {
            addCriterion("PK_USERGROUPFORCREATE is not null");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupforcreateEqualTo(String value) {
            addCriterion("PK_USERGROUPFORCREATE =", value, "pkUsergroupforcreate");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupforcreateNotEqualTo(String value) {
            addCriterion("PK_USERGROUPFORCREATE <>", value, "pkUsergroupforcreate");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupforcreateGreaterThan(String value) {
            addCriterion("PK_USERGROUPFORCREATE >", value, "pkUsergroupforcreate");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupforcreateGreaterThanOrEqualTo(String value) {
            addCriterion("PK_USERGROUPFORCREATE >=", value, "pkUsergroupforcreate");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupforcreateLessThan(String value) {
            addCriterion("PK_USERGROUPFORCREATE <", value, "pkUsergroupforcreate");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupforcreateLessThanOrEqualTo(String value) {
            addCriterion("PK_USERGROUPFORCREATE <=", value, "pkUsergroupforcreate");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupforcreateLike(String value) {
            addCriterion("PK_USERGROUPFORCREATE like", value, "pkUsergroupforcreate");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupforcreateNotLike(String value) {
            addCriterion("PK_USERGROUPFORCREATE not like", value, "pkUsergroupforcreate");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupforcreateIn(List<String> values) {
            addCriterion("PK_USERGROUPFORCREATE in", values, "pkUsergroupforcreate");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupforcreateNotIn(List<String> values) {
            addCriterion("PK_USERGROUPFORCREATE not in", values, "pkUsergroupforcreate");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupforcreateBetween(String value1, String value2) {
            addCriterion("PK_USERGROUPFORCREATE between", value1, value2, "pkUsergroupforcreate");
            return (Criteria) this;
        }

        public Criteria andPkUsergroupforcreateNotBetween(String value1, String value2) {
            addCriterion("PK_USERGROUPFORCREATE not between", value1, value2, "pkUsergroupforcreate");
            return (Criteria) this;
        }

        public Criteria andPwdlevelcodeIsNull() {
            addCriterion("PWDLEVELCODE is null");
            return (Criteria) this;
        }

        public Criteria andPwdlevelcodeIsNotNull() {
            addCriterion("PWDLEVELCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPwdlevelcodeEqualTo(String value) {
            addCriterion("PWDLEVELCODE =", value, "pwdlevelcode");
            return (Criteria) this;
        }

        public Criteria andPwdlevelcodeNotEqualTo(String value) {
            addCriterion("PWDLEVELCODE <>", value, "pwdlevelcode");
            return (Criteria) this;
        }

        public Criteria andPwdlevelcodeGreaterThan(String value) {
            addCriterion("PWDLEVELCODE >", value, "pwdlevelcode");
            return (Criteria) this;
        }

        public Criteria andPwdlevelcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PWDLEVELCODE >=", value, "pwdlevelcode");
            return (Criteria) this;
        }

        public Criteria andPwdlevelcodeLessThan(String value) {
            addCriterion("PWDLEVELCODE <", value, "pwdlevelcode");
            return (Criteria) this;
        }

        public Criteria andPwdlevelcodeLessThanOrEqualTo(String value) {
            addCriterion("PWDLEVELCODE <=", value, "pwdlevelcode");
            return (Criteria) this;
        }

        public Criteria andPwdlevelcodeLike(String value) {
            addCriterion("PWDLEVELCODE like", value, "pwdlevelcode");
            return (Criteria) this;
        }

        public Criteria andPwdlevelcodeNotLike(String value) {
            addCriterion("PWDLEVELCODE not like", value, "pwdlevelcode");
            return (Criteria) this;
        }

        public Criteria andPwdlevelcodeIn(List<String> values) {
            addCriterion("PWDLEVELCODE in", values, "pwdlevelcode");
            return (Criteria) this;
        }

        public Criteria andPwdlevelcodeNotIn(List<String> values) {
            addCriterion("PWDLEVELCODE not in", values, "pwdlevelcode");
            return (Criteria) this;
        }

        public Criteria andPwdlevelcodeBetween(String value1, String value2) {
            addCriterion("PWDLEVELCODE between", value1, value2, "pwdlevelcode");
            return (Criteria) this;
        }

        public Criteria andPwdlevelcodeNotBetween(String value1, String value2) {
            addCriterion("PWDLEVELCODE not between", value1, value2, "pwdlevelcode");
            return (Criteria) this;
        }

        public Criteria andPwdparamIsNull() {
            addCriterion("PWDPARAM is null");
            return (Criteria) this;
        }

        public Criteria andPwdparamIsNotNull() {
            addCriterion("PWDPARAM is not null");
            return (Criteria) this;
        }

        public Criteria andPwdparamEqualTo(String value) {
            addCriterion("PWDPARAM =", value, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamNotEqualTo(String value) {
            addCriterion("PWDPARAM <>", value, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamGreaterThan(String value) {
            addCriterion("PWDPARAM >", value, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamGreaterThanOrEqualTo(String value) {
            addCriterion("PWDPARAM >=", value, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamLessThan(String value) {
            addCriterion("PWDPARAM <", value, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamLessThanOrEqualTo(String value) {
            addCriterion("PWDPARAM <=", value, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamLike(String value) {
            addCriterion("PWDPARAM like", value, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamNotLike(String value) {
            addCriterion("PWDPARAM not like", value, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamIn(List<String> values) {
            addCriterion("PWDPARAM in", values, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamNotIn(List<String> values) {
            addCriterion("PWDPARAM not in", values, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamBetween(String value1, String value2) {
            addCriterion("PWDPARAM between", value1, value2, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andPwdparamNotBetween(String value1, String value2) {
            addCriterion("PWDPARAM not between", value1, value2, "pwdparam");
            return (Criteria) this;
        }

        public Criteria andSystypeIsNull() {
            addCriterion("SYSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSystypeIsNotNull() {
            addCriterion("SYSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSystypeEqualTo(String value) {
            addCriterion("SYSTYPE =", value, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeNotEqualTo(String value) {
            addCriterion("SYSTYPE <>", value, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeGreaterThan(String value) {
            addCriterion("SYSTYPE >", value, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTYPE >=", value, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeLessThan(String value) {
            addCriterion("SYSTYPE <", value, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeLessThanOrEqualTo(String value) {
            addCriterion("SYSTYPE <=", value, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeLike(String value) {
            addCriterion("SYSTYPE like", value, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeNotLike(String value) {
            addCriterion("SYSTYPE not like", value, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeIn(List<String> values) {
            addCriterion("SYSTYPE in", values, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeNotIn(List<String> values) {
            addCriterion("SYSTYPE not in", values, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeBetween(String value1, String value2) {
            addCriterion("SYSTYPE between", value1, value2, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeNotBetween(String value1, String value2) {
            addCriterion("SYSTYPE not between", value1, value2, "systype");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("TS is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("TS is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(String value) {
            addCriterion("TS =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(String value) {
            addCriterion("TS <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(String value) {
            addCriterion("TS >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(String value) {
            addCriterion("TS >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(String value) {
            addCriterion("TS <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(String value) {
            addCriterion("TS <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLike(String value) {
            addCriterion("TS like", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotLike(String value) {
            addCriterion("TS not like", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<String> values) {
            addCriterion("TS in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<String> values) {
            addCriterion("TS not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(String value1, String value2) {
            addCriterion("TS between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(String value1, String value2) {
            addCriterion("TS not between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("USER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("USER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("USER_CODE =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("USER_CODE <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("USER_CODE >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CODE >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("USER_CODE <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_CODE <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("USER_CODE like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("USER_CODE not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("USER_CODE in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("USER_CODE not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("USER_CODE between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("USER_CODE not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeQIsNull() {
            addCriterion("USER_CODE_Q is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeQIsNotNull() {
            addCriterion("USER_CODE_Q is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeQEqualTo(String value) {
            addCriterion("USER_CODE_Q =", value, "userCodeQ");
            return (Criteria) this;
        }

        public Criteria andUserCodeQNotEqualTo(String value) {
            addCriterion("USER_CODE_Q <>", value, "userCodeQ");
            return (Criteria) this;
        }

        public Criteria andUserCodeQGreaterThan(String value) {
            addCriterion("USER_CODE_Q >", value, "userCodeQ");
            return (Criteria) this;
        }

        public Criteria andUserCodeQGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CODE_Q >=", value, "userCodeQ");
            return (Criteria) this;
        }

        public Criteria andUserCodeQLessThan(String value) {
            addCriterion("USER_CODE_Q <", value, "userCodeQ");
            return (Criteria) this;
        }

        public Criteria andUserCodeQLessThanOrEqualTo(String value) {
            addCriterion("USER_CODE_Q <=", value, "userCodeQ");
            return (Criteria) this;
        }

        public Criteria andUserCodeQLike(String value) {
            addCriterion("USER_CODE_Q like", value, "userCodeQ");
            return (Criteria) this;
        }

        public Criteria andUserCodeQNotLike(String value) {
            addCriterion("USER_CODE_Q not like", value, "userCodeQ");
            return (Criteria) this;
        }

        public Criteria andUserCodeQIn(List<String> values) {
            addCriterion("USER_CODE_Q in", values, "userCodeQ");
            return (Criteria) this;
        }

        public Criteria andUserCodeQNotIn(List<String> values) {
            addCriterion("USER_CODE_Q not in", values, "userCodeQ");
            return (Criteria) this;
        }

        public Criteria andUserCodeQBetween(String value1, String value2) {
            addCriterion("USER_CODE_Q between", value1, value2, "userCodeQ");
            return (Criteria) this;
        }

        public Criteria andUserCodeQNotBetween(String value1, String value2) {
            addCriterion("USER_CODE_Q not between", value1, value2, "userCodeQ");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserName2IsNull() {
            addCriterion("USER_NAME2 is null");
            return (Criteria) this;
        }

        public Criteria andUserName2IsNotNull() {
            addCriterion("USER_NAME2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserName2EqualTo(String value) {
            addCriterion("USER_NAME2 =", value, "userName2");
            return (Criteria) this;
        }

        public Criteria andUserName2NotEqualTo(String value) {
            addCriterion("USER_NAME2 <>", value, "userName2");
            return (Criteria) this;
        }

        public Criteria andUserName2GreaterThan(String value) {
            addCriterion("USER_NAME2 >", value, "userName2");
            return (Criteria) this;
        }

        public Criteria andUserName2GreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME2 >=", value, "userName2");
            return (Criteria) this;
        }

        public Criteria andUserName2LessThan(String value) {
            addCriterion("USER_NAME2 <", value, "userName2");
            return (Criteria) this;
        }

        public Criteria andUserName2LessThanOrEqualTo(String value) {
            addCriterion("USER_NAME2 <=", value, "userName2");
            return (Criteria) this;
        }

        public Criteria andUserName2Like(String value) {
            addCriterion("USER_NAME2 like", value, "userName2");
            return (Criteria) this;
        }

        public Criteria andUserName2NotLike(String value) {
            addCriterion("USER_NAME2 not like", value, "userName2");
            return (Criteria) this;
        }

        public Criteria andUserName2In(List<String> values) {
            addCriterion("USER_NAME2 in", values, "userName2");
            return (Criteria) this;
        }

        public Criteria andUserName2NotIn(List<String> values) {
            addCriterion("USER_NAME2 not in", values, "userName2");
            return (Criteria) this;
        }

        public Criteria andUserName2Between(String value1, String value2) {
            addCriterion("USER_NAME2 between", value1, value2, "userName2");
            return (Criteria) this;
        }

        public Criteria andUserName2NotBetween(String value1, String value2) {
            addCriterion("USER_NAME2 not between", value1, value2, "userName2");
            return (Criteria) this;
        }

        public Criteria andUserName3IsNull() {
            addCriterion("USER_NAME3 is null");
            return (Criteria) this;
        }

        public Criteria andUserName3IsNotNull() {
            addCriterion("USER_NAME3 is not null");
            return (Criteria) this;
        }

        public Criteria andUserName3EqualTo(String value) {
            addCriterion("USER_NAME3 =", value, "userName3");
            return (Criteria) this;
        }

        public Criteria andUserName3NotEqualTo(String value) {
            addCriterion("USER_NAME3 <>", value, "userName3");
            return (Criteria) this;
        }

        public Criteria andUserName3GreaterThan(String value) {
            addCriterion("USER_NAME3 >", value, "userName3");
            return (Criteria) this;
        }

        public Criteria andUserName3GreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME3 >=", value, "userName3");
            return (Criteria) this;
        }

        public Criteria andUserName3LessThan(String value) {
            addCriterion("USER_NAME3 <", value, "userName3");
            return (Criteria) this;
        }

        public Criteria andUserName3LessThanOrEqualTo(String value) {
            addCriterion("USER_NAME3 <=", value, "userName3");
            return (Criteria) this;
        }

        public Criteria andUserName3Like(String value) {
            addCriterion("USER_NAME3 like", value, "userName3");
            return (Criteria) this;
        }

        public Criteria andUserName3NotLike(String value) {
            addCriterion("USER_NAME3 not like", value, "userName3");
            return (Criteria) this;
        }

        public Criteria andUserName3In(List<String> values) {
            addCriterion("USER_NAME3 in", values, "userName3");
            return (Criteria) this;
        }

        public Criteria andUserName3NotIn(List<String> values) {
            addCriterion("USER_NAME3 not in", values, "userName3");
            return (Criteria) this;
        }

        public Criteria andUserName3Between(String value1, String value2) {
            addCriterion("USER_NAME3 between", value1, value2, "userName3");
            return (Criteria) this;
        }

        public Criteria andUserName3NotBetween(String value1, String value2) {
            addCriterion("USER_NAME3 not between", value1, value2, "userName3");
            return (Criteria) this;
        }

        public Criteria andUserName4IsNull() {
            addCriterion("USER_NAME4 is null");
            return (Criteria) this;
        }

        public Criteria andUserName4IsNotNull() {
            addCriterion("USER_NAME4 is not null");
            return (Criteria) this;
        }

        public Criteria andUserName4EqualTo(String value) {
            addCriterion("USER_NAME4 =", value, "userName4");
            return (Criteria) this;
        }

        public Criteria andUserName4NotEqualTo(String value) {
            addCriterion("USER_NAME4 <>", value, "userName4");
            return (Criteria) this;
        }

        public Criteria andUserName4GreaterThan(String value) {
            addCriterion("USER_NAME4 >", value, "userName4");
            return (Criteria) this;
        }

        public Criteria andUserName4GreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME4 >=", value, "userName4");
            return (Criteria) this;
        }

        public Criteria andUserName4LessThan(String value) {
            addCriterion("USER_NAME4 <", value, "userName4");
            return (Criteria) this;
        }

        public Criteria andUserName4LessThanOrEqualTo(String value) {
            addCriterion("USER_NAME4 <=", value, "userName4");
            return (Criteria) this;
        }

        public Criteria andUserName4Like(String value) {
            addCriterion("USER_NAME4 like", value, "userName4");
            return (Criteria) this;
        }

        public Criteria andUserName4NotLike(String value) {
            addCriterion("USER_NAME4 not like", value, "userName4");
            return (Criteria) this;
        }

        public Criteria andUserName4In(List<String> values) {
            addCriterion("USER_NAME4 in", values, "userName4");
            return (Criteria) this;
        }

        public Criteria andUserName4NotIn(List<String> values) {
            addCriterion("USER_NAME4 not in", values, "userName4");
            return (Criteria) this;
        }

        public Criteria andUserName4Between(String value1, String value2) {
            addCriterion("USER_NAME4 between", value1, value2, "userName4");
            return (Criteria) this;
        }

        public Criteria andUserName4NotBetween(String value1, String value2) {
            addCriterion("USER_NAME4 not between", value1, value2, "userName4");
            return (Criteria) this;
        }

        public Criteria andUserName5IsNull() {
            addCriterion("USER_NAME5 is null");
            return (Criteria) this;
        }

        public Criteria andUserName5IsNotNull() {
            addCriterion("USER_NAME5 is not null");
            return (Criteria) this;
        }

        public Criteria andUserName5EqualTo(String value) {
            addCriterion("USER_NAME5 =", value, "userName5");
            return (Criteria) this;
        }

        public Criteria andUserName5NotEqualTo(String value) {
            addCriterion("USER_NAME5 <>", value, "userName5");
            return (Criteria) this;
        }

        public Criteria andUserName5GreaterThan(String value) {
            addCriterion("USER_NAME5 >", value, "userName5");
            return (Criteria) this;
        }

        public Criteria andUserName5GreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME5 >=", value, "userName5");
            return (Criteria) this;
        }

        public Criteria andUserName5LessThan(String value) {
            addCriterion("USER_NAME5 <", value, "userName5");
            return (Criteria) this;
        }

        public Criteria andUserName5LessThanOrEqualTo(String value) {
            addCriterion("USER_NAME5 <=", value, "userName5");
            return (Criteria) this;
        }

        public Criteria andUserName5Like(String value) {
            addCriterion("USER_NAME5 like", value, "userName5");
            return (Criteria) this;
        }

        public Criteria andUserName5NotLike(String value) {
            addCriterion("USER_NAME5 not like", value, "userName5");
            return (Criteria) this;
        }

        public Criteria andUserName5In(List<String> values) {
            addCriterion("USER_NAME5 in", values, "userName5");
            return (Criteria) this;
        }

        public Criteria andUserName5NotIn(List<String> values) {
            addCriterion("USER_NAME5 not in", values, "userName5");
            return (Criteria) this;
        }

        public Criteria andUserName5Between(String value1, String value2) {
            addCriterion("USER_NAME5 between", value1, value2, "userName5");
            return (Criteria) this;
        }

        public Criteria andUserName5NotBetween(String value1, String value2) {
            addCriterion("USER_NAME5 not between", value1, value2, "userName5");
            return (Criteria) this;
        }

        public Criteria andUserName6IsNull() {
            addCriterion("USER_NAME6 is null");
            return (Criteria) this;
        }

        public Criteria andUserName6IsNotNull() {
            addCriterion("USER_NAME6 is not null");
            return (Criteria) this;
        }

        public Criteria andUserName6EqualTo(String value) {
            addCriterion("USER_NAME6 =", value, "userName6");
            return (Criteria) this;
        }

        public Criteria andUserName6NotEqualTo(String value) {
            addCriterion("USER_NAME6 <>", value, "userName6");
            return (Criteria) this;
        }

        public Criteria andUserName6GreaterThan(String value) {
            addCriterion("USER_NAME6 >", value, "userName6");
            return (Criteria) this;
        }

        public Criteria andUserName6GreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME6 >=", value, "userName6");
            return (Criteria) this;
        }

        public Criteria andUserName6LessThan(String value) {
            addCriterion("USER_NAME6 <", value, "userName6");
            return (Criteria) this;
        }

        public Criteria andUserName6LessThanOrEqualTo(String value) {
            addCriterion("USER_NAME6 <=", value, "userName6");
            return (Criteria) this;
        }

        public Criteria andUserName6Like(String value) {
            addCriterion("USER_NAME6 like", value, "userName6");
            return (Criteria) this;
        }

        public Criteria andUserName6NotLike(String value) {
            addCriterion("USER_NAME6 not like", value, "userName6");
            return (Criteria) this;
        }

        public Criteria andUserName6In(List<String> values) {
            addCriterion("USER_NAME6 in", values, "userName6");
            return (Criteria) this;
        }

        public Criteria andUserName6NotIn(List<String> values) {
            addCriterion("USER_NAME6 not in", values, "userName6");
            return (Criteria) this;
        }

        public Criteria andUserName6Between(String value1, String value2) {
            addCriterion("USER_NAME6 between", value1, value2, "userName6");
            return (Criteria) this;
        }

        public Criteria andUserName6NotBetween(String value1, String value2) {
            addCriterion("USER_NAME6 not between", value1, value2, "userName6");
            return (Criteria) this;
        }

        public Criteria andUserNoteIsNull() {
            addCriterion("USER_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andUserNoteIsNotNull() {
            addCriterion("USER_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoteEqualTo(String value) {
            addCriterion("USER_NOTE =", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotEqualTo(String value) {
            addCriterion("USER_NOTE <>", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteGreaterThan(String value) {
            addCriterion("USER_NOTE >", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NOTE >=", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteLessThan(String value) {
            addCriterion("USER_NOTE <", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteLessThanOrEqualTo(String value) {
            addCriterion("USER_NOTE <=", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteLike(String value) {
            addCriterion("USER_NOTE like", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotLike(String value) {
            addCriterion("USER_NOTE not like", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteIn(List<String> values) {
            addCriterion("USER_NOTE in", values, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotIn(List<String> values) {
            addCriterion("USER_NOTE not in", values, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteBetween(String value1, String value2) {
            addCriterion("USER_NOTE between", value1, value2, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotBetween(String value1, String value2) {
            addCriterion("USER_NOTE not between", value1, value2, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("USER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("USER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("USER_PASSWORD =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("USER_PASSWORD <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("USER_PASSWORD >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("USER_PASSWORD <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("USER_PASSWORD like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("USER_PASSWORD not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("USER_PASSWORD in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("USER_PASSWORD not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(BigDecimal value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(BigDecimal value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(BigDecimal value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(BigDecimal value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<BigDecimal> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<BigDecimal> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
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