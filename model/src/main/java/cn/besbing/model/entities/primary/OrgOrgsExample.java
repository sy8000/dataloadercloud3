package cn.besbing.model.entities.primary;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrgOrgsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrgOrgsExample() {
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

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCountryzoneIsNull() {
            addCriterion("COUNTRYZONE is null");
            return (Criteria) this;
        }

        public Criteria andCountryzoneIsNotNull() {
            addCriterion("COUNTRYZONE is not null");
            return (Criteria) this;
        }

        public Criteria andCountryzoneEqualTo(String value) {
            addCriterion("COUNTRYZONE =", value, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneNotEqualTo(String value) {
            addCriterion("COUNTRYZONE <>", value, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneGreaterThan(String value) {
            addCriterion("COUNTRYZONE >", value, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRYZONE >=", value, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneLessThan(String value) {
            addCriterion("COUNTRYZONE <", value, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneLessThanOrEqualTo(String value) {
            addCriterion("COUNTRYZONE <=", value, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneLike(String value) {
            addCriterion("COUNTRYZONE like", value, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneNotLike(String value) {
            addCriterion("COUNTRYZONE not like", value, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneIn(List<String> values) {
            addCriterion("COUNTRYZONE in", values, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneNotIn(List<String> values) {
            addCriterion("COUNTRYZONE not in", values, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneBetween(String value1, String value2) {
            addCriterion("COUNTRYZONE between", value1, value2, "countryzone");
            return (Criteria) this;
        }

        public Criteria andCountryzoneNotBetween(String value1, String value2) {
            addCriterion("COUNTRYZONE not between", value1, value2, "countryzone");
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

        public Criteria andDef1IsNull() {
            addCriterion("DEF1 is null");
            return (Criteria) this;
        }

        public Criteria andDef1IsNotNull() {
            addCriterion("DEF1 is not null");
            return (Criteria) this;
        }

        public Criteria andDef1EqualTo(String value) {
            addCriterion("DEF1 =", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotEqualTo(String value) {
            addCriterion("DEF1 <>", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThan(String value) {
            addCriterion("DEF1 >", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThanOrEqualTo(String value) {
            addCriterion("DEF1 >=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThan(String value) {
            addCriterion("DEF1 <", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThanOrEqualTo(String value) {
            addCriterion("DEF1 <=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Like(String value) {
            addCriterion("DEF1 like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotLike(String value) {
            addCriterion("DEF1 not like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1In(List<String> values) {
            addCriterion("DEF1 in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotIn(List<String> values) {
            addCriterion("DEF1 not in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Between(String value1, String value2) {
            addCriterion("DEF1 between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotBetween(String value1, String value2) {
            addCriterion("DEF1 not between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef10IsNull() {
            addCriterion("DEF10 is null");
            return (Criteria) this;
        }

        public Criteria andDef10IsNotNull() {
            addCriterion("DEF10 is not null");
            return (Criteria) this;
        }

        public Criteria andDef10EqualTo(String value) {
            addCriterion("DEF10 =", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotEqualTo(String value) {
            addCriterion("DEF10 <>", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10GreaterThan(String value) {
            addCriterion("DEF10 >", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10GreaterThanOrEqualTo(String value) {
            addCriterion("DEF10 >=", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10LessThan(String value) {
            addCriterion("DEF10 <", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10LessThanOrEqualTo(String value) {
            addCriterion("DEF10 <=", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10Like(String value) {
            addCriterion("DEF10 like", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotLike(String value) {
            addCriterion("DEF10 not like", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10In(List<String> values) {
            addCriterion("DEF10 in", values, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotIn(List<String> values) {
            addCriterion("DEF10 not in", values, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10Between(String value1, String value2) {
            addCriterion("DEF10 between", value1, value2, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotBetween(String value1, String value2) {
            addCriterion("DEF10 not between", value1, value2, "def10");
            return (Criteria) this;
        }

        public Criteria andDef11IsNull() {
            addCriterion("DEF11 is null");
            return (Criteria) this;
        }

        public Criteria andDef11IsNotNull() {
            addCriterion("DEF11 is not null");
            return (Criteria) this;
        }

        public Criteria andDef11EqualTo(String value) {
            addCriterion("DEF11 =", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11NotEqualTo(String value) {
            addCriterion("DEF11 <>", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11GreaterThan(String value) {
            addCriterion("DEF11 >", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11GreaterThanOrEqualTo(String value) {
            addCriterion("DEF11 >=", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11LessThan(String value) {
            addCriterion("DEF11 <", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11LessThanOrEqualTo(String value) {
            addCriterion("DEF11 <=", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11Like(String value) {
            addCriterion("DEF11 like", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11NotLike(String value) {
            addCriterion("DEF11 not like", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11In(List<String> values) {
            addCriterion("DEF11 in", values, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11NotIn(List<String> values) {
            addCriterion("DEF11 not in", values, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11Between(String value1, String value2) {
            addCriterion("DEF11 between", value1, value2, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11NotBetween(String value1, String value2) {
            addCriterion("DEF11 not between", value1, value2, "def11");
            return (Criteria) this;
        }

        public Criteria andDef12IsNull() {
            addCriterion("DEF12 is null");
            return (Criteria) this;
        }

        public Criteria andDef12IsNotNull() {
            addCriterion("DEF12 is not null");
            return (Criteria) this;
        }

        public Criteria andDef12EqualTo(String value) {
            addCriterion("DEF12 =", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12NotEqualTo(String value) {
            addCriterion("DEF12 <>", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12GreaterThan(String value) {
            addCriterion("DEF12 >", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12GreaterThanOrEqualTo(String value) {
            addCriterion("DEF12 >=", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12LessThan(String value) {
            addCriterion("DEF12 <", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12LessThanOrEqualTo(String value) {
            addCriterion("DEF12 <=", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12Like(String value) {
            addCriterion("DEF12 like", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12NotLike(String value) {
            addCriterion("DEF12 not like", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12In(List<String> values) {
            addCriterion("DEF12 in", values, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12NotIn(List<String> values) {
            addCriterion("DEF12 not in", values, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12Between(String value1, String value2) {
            addCriterion("DEF12 between", value1, value2, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12NotBetween(String value1, String value2) {
            addCriterion("DEF12 not between", value1, value2, "def12");
            return (Criteria) this;
        }

        public Criteria andDef13IsNull() {
            addCriterion("DEF13 is null");
            return (Criteria) this;
        }

        public Criteria andDef13IsNotNull() {
            addCriterion("DEF13 is not null");
            return (Criteria) this;
        }

        public Criteria andDef13EqualTo(String value) {
            addCriterion("DEF13 =", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13NotEqualTo(String value) {
            addCriterion("DEF13 <>", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13GreaterThan(String value) {
            addCriterion("DEF13 >", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13GreaterThanOrEqualTo(String value) {
            addCriterion("DEF13 >=", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13LessThan(String value) {
            addCriterion("DEF13 <", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13LessThanOrEqualTo(String value) {
            addCriterion("DEF13 <=", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13Like(String value) {
            addCriterion("DEF13 like", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13NotLike(String value) {
            addCriterion("DEF13 not like", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13In(List<String> values) {
            addCriterion("DEF13 in", values, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13NotIn(List<String> values) {
            addCriterion("DEF13 not in", values, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13Between(String value1, String value2) {
            addCriterion("DEF13 between", value1, value2, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13NotBetween(String value1, String value2) {
            addCriterion("DEF13 not between", value1, value2, "def13");
            return (Criteria) this;
        }

        public Criteria andDef14IsNull() {
            addCriterion("DEF14 is null");
            return (Criteria) this;
        }

        public Criteria andDef14IsNotNull() {
            addCriterion("DEF14 is not null");
            return (Criteria) this;
        }

        public Criteria andDef14EqualTo(String value) {
            addCriterion("DEF14 =", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14NotEqualTo(String value) {
            addCriterion("DEF14 <>", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14GreaterThan(String value) {
            addCriterion("DEF14 >", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14GreaterThanOrEqualTo(String value) {
            addCriterion("DEF14 >=", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14LessThan(String value) {
            addCriterion("DEF14 <", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14LessThanOrEqualTo(String value) {
            addCriterion("DEF14 <=", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14Like(String value) {
            addCriterion("DEF14 like", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14NotLike(String value) {
            addCriterion("DEF14 not like", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14In(List<String> values) {
            addCriterion("DEF14 in", values, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14NotIn(List<String> values) {
            addCriterion("DEF14 not in", values, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14Between(String value1, String value2) {
            addCriterion("DEF14 between", value1, value2, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14NotBetween(String value1, String value2) {
            addCriterion("DEF14 not between", value1, value2, "def14");
            return (Criteria) this;
        }

        public Criteria andDef15IsNull() {
            addCriterion("DEF15 is null");
            return (Criteria) this;
        }

        public Criteria andDef15IsNotNull() {
            addCriterion("DEF15 is not null");
            return (Criteria) this;
        }

        public Criteria andDef15EqualTo(String value) {
            addCriterion("DEF15 =", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15NotEqualTo(String value) {
            addCriterion("DEF15 <>", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15GreaterThan(String value) {
            addCriterion("DEF15 >", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15GreaterThanOrEqualTo(String value) {
            addCriterion("DEF15 >=", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15LessThan(String value) {
            addCriterion("DEF15 <", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15LessThanOrEqualTo(String value) {
            addCriterion("DEF15 <=", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15Like(String value) {
            addCriterion("DEF15 like", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15NotLike(String value) {
            addCriterion("DEF15 not like", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15In(List<String> values) {
            addCriterion("DEF15 in", values, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15NotIn(List<String> values) {
            addCriterion("DEF15 not in", values, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15Between(String value1, String value2) {
            addCriterion("DEF15 between", value1, value2, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15NotBetween(String value1, String value2) {
            addCriterion("DEF15 not between", value1, value2, "def15");
            return (Criteria) this;
        }

        public Criteria andDef16IsNull() {
            addCriterion("DEF16 is null");
            return (Criteria) this;
        }

        public Criteria andDef16IsNotNull() {
            addCriterion("DEF16 is not null");
            return (Criteria) this;
        }

        public Criteria andDef16EqualTo(String value) {
            addCriterion("DEF16 =", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16NotEqualTo(String value) {
            addCriterion("DEF16 <>", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16GreaterThan(String value) {
            addCriterion("DEF16 >", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16GreaterThanOrEqualTo(String value) {
            addCriterion("DEF16 >=", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16LessThan(String value) {
            addCriterion("DEF16 <", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16LessThanOrEqualTo(String value) {
            addCriterion("DEF16 <=", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16Like(String value) {
            addCriterion("DEF16 like", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16NotLike(String value) {
            addCriterion("DEF16 not like", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16In(List<String> values) {
            addCriterion("DEF16 in", values, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16NotIn(List<String> values) {
            addCriterion("DEF16 not in", values, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16Between(String value1, String value2) {
            addCriterion("DEF16 between", value1, value2, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16NotBetween(String value1, String value2) {
            addCriterion("DEF16 not between", value1, value2, "def16");
            return (Criteria) this;
        }

        public Criteria andDef17IsNull() {
            addCriterion("DEF17 is null");
            return (Criteria) this;
        }

        public Criteria andDef17IsNotNull() {
            addCriterion("DEF17 is not null");
            return (Criteria) this;
        }

        public Criteria andDef17EqualTo(String value) {
            addCriterion("DEF17 =", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17NotEqualTo(String value) {
            addCriterion("DEF17 <>", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17GreaterThan(String value) {
            addCriterion("DEF17 >", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17GreaterThanOrEqualTo(String value) {
            addCriterion("DEF17 >=", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17LessThan(String value) {
            addCriterion("DEF17 <", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17LessThanOrEqualTo(String value) {
            addCriterion("DEF17 <=", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17Like(String value) {
            addCriterion("DEF17 like", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17NotLike(String value) {
            addCriterion("DEF17 not like", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17In(List<String> values) {
            addCriterion("DEF17 in", values, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17NotIn(List<String> values) {
            addCriterion("DEF17 not in", values, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17Between(String value1, String value2) {
            addCriterion("DEF17 between", value1, value2, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17NotBetween(String value1, String value2) {
            addCriterion("DEF17 not between", value1, value2, "def17");
            return (Criteria) this;
        }

        public Criteria andDef18IsNull() {
            addCriterion("DEF18 is null");
            return (Criteria) this;
        }

        public Criteria andDef18IsNotNull() {
            addCriterion("DEF18 is not null");
            return (Criteria) this;
        }

        public Criteria andDef18EqualTo(String value) {
            addCriterion("DEF18 =", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18NotEqualTo(String value) {
            addCriterion("DEF18 <>", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18GreaterThan(String value) {
            addCriterion("DEF18 >", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18GreaterThanOrEqualTo(String value) {
            addCriterion("DEF18 >=", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18LessThan(String value) {
            addCriterion("DEF18 <", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18LessThanOrEqualTo(String value) {
            addCriterion("DEF18 <=", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18Like(String value) {
            addCriterion("DEF18 like", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18NotLike(String value) {
            addCriterion("DEF18 not like", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18In(List<String> values) {
            addCriterion("DEF18 in", values, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18NotIn(List<String> values) {
            addCriterion("DEF18 not in", values, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18Between(String value1, String value2) {
            addCriterion("DEF18 between", value1, value2, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18NotBetween(String value1, String value2) {
            addCriterion("DEF18 not between", value1, value2, "def18");
            return (Criteria) this;
        }

        public Criteria andDef19IsNull() {
            addCriterion("DEF19 is null");
            return (Criteria) this;
        }

        public Criteria andDef19IsNotNull() {
            addCriterion("DEF19 is not null");
            return (Criteria) this;
        }

        public Criteria andDef19EqualTo(String value) {
            addCriterion("DEF19 =", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19NotEqualTo(String value) {
            addCriterion("DEF19 <>", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19GreaterThan(String value) {
            addCriterion("DEF19 >", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19GreaterThanOrEqualTo(String value) {
            addCriterion("DEF19 >=", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19LessThan(String value) {
            addCriterion("DEF19 <", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19LessThanOrEqualTo(String value) {
            addCriterion("DEF19 <=", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19Like(String value) {
            addCriterion("DEF19 like", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19NotLike(String value) {
            addCriterion("DEF19 not like", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19In(List<String> values) {
            addCriterion("DEF19 in", values, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19NotIn(List<String> values) {
            addCriterion("DEF19 not in", values, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19Between(String value1, String value2) {
            addCriterion("DEF19 between", value1, value2, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19NotBetween(String value1, String value2) {
            addCriterion("DEF19 not between", value1, value2, "def19");
            return (Criteria) this;
        }

        public Criteria andDef2IsNull() {
            addCriterion("DEF2 is null");
            return (Criteria) this;
        }

        public Criteria andDef2IsNotNull() {
            addCriterion("DEF2 is not null");
            return (Criteria) this;
        }

        public Criteria andDef2EqualTo(String value) {
            addCriterion("DEF2 =", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotEqualTo(String value) {
            addCriterion("DEF2 <>", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThan(String value) {
            addCriterion("DEF2 >", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThanOrEqualTo(String value) {
            addCriterion("DEF2 >=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThan(String value) {
            addCriterion("DEF2 <", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThanOrEqualTo(String value) {
            addCriterion("DEF2 <=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Like(String value) {
            addCriterion("DEF2 like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotLike(String value) {
            addCriterion("DEF2 not like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2In(List<String> values) {
            addCriterion("DEF2 in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotIn(List<String> values) {
            addCriterion("DEF2 not in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Between(String value1, String value2) {
            addCriterion("DEF2 between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotBetween(String value1, String value2) {
            addCriterion("DEF2 not between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef20IsNull() {
            addCriterion("DEF20 is null");
            return (Criteria) this;
        }

        public Criteria andDef20IsNotNull() {
            addCriterion("DEF20 is not null");
            return (Criteria) this;
        }

        public Criteria andDef20EqualTo(String value) {
            addCriterion("DEF20 =", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20NotEqualTo(String value) {
            addCriterion("DEF20 <>", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20GreaterThan(String value) {
            addCriterion("DEF20 >", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20GreaterThanOrEqualTo(String value) {
            addCriterion("DEF20 >=", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20LessThan(String value) {
            addCriterion("DEF20 <", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20LessThanOrEqualTo(String value) {
            addCriterion("DEF20 <=", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20Like(String value) {
            addCriterion("DEF20 like", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20NotLike(String value) {
            addCriterion("DEF20 not like", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20In(List<String> values) {
            addCriterion("DEF20 in", values, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20NotIn(List<String> values) {
            addCriterion("DEF20 not in", values, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20Between(String value1, String value2) {
            addCriterion("DEF20 between", value1, value2, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20NotBetween(String value1, String value2) {
            addCriterion("DEF20 not between", value1, value2, "def20");
            return (Criteria) this;
        }

        public Criteria andDef3IsNull() {
            addCriterion("DEF3 is null");
            return (Criteria) this;
        }

        public Criteria andDef3IsNotNull() {
            addCriterion("DEF3 is not null");
            return (Criteria) this;
        }

        public Criteria andDef3EqualTo(String value) {
            addCriterion("DEF3 =", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotEqualTo(String value) {
            addCriterion("DEF3 <>", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThan(String value) {
            addCriterion("DEF3 >", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThanOrEqualTo(String value) {
            addCriterion("DEF3 >=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThan(String value) {
            addCriterion("DEF3 <", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThanOrEqualTo(String value) {
            addCriterion("DEF3 <=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Like(String value) {
            addCriterion("DEF3 like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotLike(String value) {
            addCriterion("DEF3 not like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3In(List<String> values) {
            addCriterion("DEF3 in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotIn(List<String> values) {
            addCriterion("DEF3 not in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Between(String value1, String value2) {
            addCriterion("DEF3 between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotBetween(String value1, String value2) {
            addCriterion("DEF3 not between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef4IsNull() {
            addCriterion("DEF4 is null");
            return (Criteria) this;
        }

        public Criteria andDef4IsNotNull() {
            addCriterion("DEF4 is not null");
            return (Criteria) this;
        }

        public Criteria andDef4EqualTo(String value) {
            addCriterion("DEF4 =", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotEqualTo(String value) {
            addCriterion("DEF4 <>", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThan(String value) {
            addCriterion("DEF4 >", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThanOrEqualTo(String value) {
            addCriterion("DEF4 >=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThan(String value) {
            addCriterion("DEF4 <", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThanOrEqualTo(String value) {
            addCriterion("DEF4 <=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Like(String value) {
            addCriterion("DEF4 like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotLike(String value) {
            addCriterion("DEF4 not like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4In(List<String> values) {
            addCriterion("DEF4 in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotIn(List<String> values) {
            addCriterion("DEF4 not in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Between(String value1, String value2) {
            addCriterion("DEF4 between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotBetween(String value1, String value2) {
            addCriterion("DEF4 not between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef5IsNull() {
            addCriterion("DEF5 is null");
            return (Criteria) this;
        }

        public Criteria andDef5IsNotNull() {
            addCriterion("DEF5 is not null");
            return (Criteria) this;
        }

        public Criteria andDef5EqualTo(String value) {
            addCriterion("DEF5 =", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotEqualTo(String value) {
            addCriterion("DEF5 <>", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThan(String value) {
            addCriterion("DEF5 >", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThanOrEqualTo(String value) {
            addCriterion("DEF5 >=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThan(String value) {
            addCriterion("DEF5 <", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThanOrEqualTo(String value) {
            addCriterion("DEF5 <=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5Like(String value) {
            addCriterion("DEF5 like", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotLike(String value) {
            addCriterion("DEF5 not like", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5In(List<String> values) {
            addCriterion("DEF5 in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotIn(List<String> values) {
            addCriterion("DEF5 not in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5Between(String value1, String value2) {
            addCriterion("DEF5 between", value1, value2, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotBetween(String value1, String value2) {
            addCriterion("DEF5 not between", value1, value2, "def5");
            return (Criteria) this;
        }

        public Criteria andDef6IsNull() {
            addCriterion("DEF6 is null");
            return (Criteria) this;
        }

        public Criteria andDef6IsNotNull() {
            addCriterion("DEF6 is not null");
            return (Criteria) this;
        }

        public Criteria andDef6EqualTo(String value) {
            addCriterion("DEF6 =", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotEqualTo(String value) {
            addCriterion("DEF6 <>", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6GreaterThan(String value) {
            addCriterion("DEF6 >", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6GreaterThanOrEqualTo(String value) {
            addCriterion("DEF6 >=", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6LessThan(String value) {
            addCriterion("DEF6 <", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6LessThanOrEqualTo(String value) {
            addCriterion("DEF6 <=", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6Like(String value) {
            addCriterion("DEF6 like", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotLike(String value) {
            addCriterion("DEF6 not like", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6In(List<String> values) {
            addCriterion("DEF6 in", values, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotIn(List<String> values) {
            addCriterion("DEF6 not in", values, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6Between(String value1, String value2) {
            addCriterion("DEF6 between", value1, value2, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotBetween(String value1, String value2) {
            addCriterion("DEF6 not between", value1, value2, "def6");
            return (Criteria) this;
        }

        public Criteria andDef7IsNull() {
            addCriterion("DEF7 is null");
            return (Criteria) this;
        }

        public Criteria andDef7IsNotNull() {
            addCriterion("DEF7 is not null");
            return (Criteria) this;
        }

        public Criteria andDef7EqualTo(String value) {
            addCriterion("DEF7 =", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotEqualTo(String value) {
            addCriterion("DEF7 <>", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7GreaterThan(String value) {
            addCriterion("DEF7 >", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7GreaterThanOrEqualTo(String value) {
            addCriterion("DEF7 >=", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7LessThan(String value) {
            addCriterion("DEF7 <", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7LessThanOrEqualTo(String value) {
            addCriterion("DEF7 <=", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7Like(String value) {
            addCriterion("DEF7 like", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotLike(String value) {
            addCriterion("DEF7 not like", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7In(List<String> values) {
            addCriterion("DEF7 in", values, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotIn(List<String> values) {
            addCriterion("DEF7 not in", values, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7Between(String value1, String value2) {
            addCriterion("DEF7 between", value1, value2, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotBetween(String value1, String value2) {
            addCriterion("DEF7 not between", value1, value2, "def7");
            return (Criteria) this;
        }

        public Criteria andDef8IsNull() {
            addCriterion("DEF8 is null");
            return (Criteria) this;
        }

        public Criteria andDef8IsNotNull() {
            addCriterion("DEF8 is not null");
            return (Criteria) this;
        }

        public Criteria andDef8EqualTo(String value) {
            addCriterion("DEF8 =", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotEqualTo(String value) {
            addCriterion("DEF8 <>", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8GreaterThan(String value) {
            addCriterion("DEF8 >", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8GreaterThanOrEqualTo(String value) {
            addCriterion("DEF8 >=", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8LessThan(String value) {
            addCriterion("DEF8 <", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8LessThanOrEqualTo(String value) {
            addCriterion("DEF8 <=", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8Like(String value) {
            addCriterion("DEF8 like", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotLike(String value) {
            addCriterion("DEF8 not like", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8In(List<String> values) {
            addCriterion("DEF8 in", values, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotIn(List<String> values) {
            addCriterion("DEF8 not in", values, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8Between(String value1, String value2) {
            addCriterion("DEF8 between", value1, value2, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotBetween(String value1, String value2) {
            addCriterion("DEF8 not between", value1, value2, "def8");
            return (Criteria) this;
        }

        public Criteria andDef9IsNull() {
            addCriterion("DEF9 is null");
            return (Criteria) this;
        }

        public Criteria andDef9IsNotNull() {
            addCriterion("DEF9 is not null");
            return (Criteria) this;
        }

        public Criteria andDef9EqualTo(String value) {
            addCriterion("DEF9 =", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotEqualTo(String value) {
            addCriterion("DEF9 <>", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9GreaterThan(String value) {
            addCriterion("DEF9 >", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9GreaterThanOrEqualTo(String value) {
            addCriterion("DEF9 >=", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9LessThan(String value) {
            addCriterion("DEF9 <", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9LessThanOrEqualTo(String value) {
            addCriterion("DEF9 <=", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9Like(String value) {
            addCriterion("DEF9 like", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotLike(String value) {
            addCriterion("DEF9 not like", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9In(List<String> values) {
            addCriterion("DEF9 in", values, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotIn(List<String> values) {
            addCriterion("DEF9 not in", values, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9Between(String value1, String value2) {
            addCriterion("DEF9 between", value1, value2, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotBetween(String value1, String value2) {
            addCriterion("DEF9 not between", value1, value2, "def9");
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

        public Criteria andInnercodeIsNull() {
            addCriterion("INNERCODE is null");
            return (Criteria) this;
        }

        public Criteria andInnercodeIsNotNull() {
            addCriterion("INNERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andInnercodeEqualTo(String value) {
            addCriterion("INNERCODE =", value, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeNotEqualTo(String value) {
            addCriterion("INNERCODE <>", value, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeGreaterThan(String value) {
            addCriterion("INNERCODE >", value, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeGreaterThanOrEqualTo(String value) {
            addCriterion("INNERCODE >=", value, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeLessThan(String value) {
            addCriterion("INNERCODE <", value, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeLessThanOrEqualTo(String value) {
            addCriterion("INNERCODE <=", value, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeLike(String value) {
            addCriterion("INNERCODE like", value, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeNotLike(String value) {
            addCriterion("INNERCODE not like", value, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeIn(List<String> values) {
            addCriterion("INNERCODE in", values, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeNotIn(List<String> values) {
            addCriterion("INNERCODE not in", values, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeBetween(String value1, String value2) {
            addCriterion("INNERCODE between", value1, value2, "innercode");
            return (Criteria) this;
        }

        public Criteria andInnercodeNotBetween(String value1, String value2) {
            addCriterion("INNERCODE not between", value1, value2, "innercode");
            return (Criteria) this;
        }

        public Criteria andIsbusinessunitIsNull() {
            addCriterion("ISBUSINESSUNIT is null");
            return (Criteria) this;
        }

        public Criteria andIsbusinessunitIsNotNull() {
            addCriterion("ISBUSINESSUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsbusinessunitEqualTo(String value) {
            addCriterion("ISBUSINESSUNIT =", value, "isbusinessunit");
            return (Criteria) this;
        }

        public Criteria andIsbusinessunitNotEqualTo(String value) {
            addCriterion("ISBUSINESSUNIT <>", value, "isbusinessunit");
            return (Criteria) this;
        }

        public Criteria andIsbusinessunitGreaterThan(String value) {
            addCriterion("ISBUSINESSUNIT >", value, "isbusinessunit");
            return (Criteria) this;
        }

        public Criteria andIsbusinessunitGreaterThanOrEqualTo(String value) {
            addCriterion("ISBUSINESSUNIT >=", value, "isbusinessunit");
            return (Criteria) this;
        }

        public Criteria andIsbusinessunitLessThan(String value) {
            addCriterion("ISBUSINESSUNIT <", value, "isbusinessunit");
            return (Criteria) this;
        }

        public Criteria andIsbusinessunitLessThanOrEqualTo(String value) {
            addCriterion("ISBUSINESSUNIT <=", value, "isbusinessunit");
            return (Criteria) this;
        }

        public Criteria andIsbusinessunitLike(String value) {
            addCriterion("ISBUSINESSUNIT like", value, "isbusinessunit");
            return (Criteria) this;
        }

        public Criteria andIsbusinessunitNotLike(String value) {
            addCriterion("ISBUSINESSUNIT not like", value, "isbusinessunit");
            return (Criteria) this;
        }

        public Criteria andIsbusinessunitIn(List<String> values) {
            addCriterion("ISBUSINESSUNIT in", values, "isbusinessunit");
            return (Criteria) this;
        }

        public Criteria andIsbusinessunitNotIn(List<String> values) {
            addCriterion("ISBUSINESSUNIT not in", values, "isbusinessunit");
            return (Criteria) this;
        }

        public Criteria andIsbusinessunitBetween(String value1, String value2) {
            addCriterion("ISBUSINESSUNIT between", value1, value2, "isbusinessunit");
            return (Criteria) this;
        }

        public Criteria andIsbusinessunitNotBetween(String value1, String value2) {
            addCriterion("ISBUSINESSUNIT not between", value1, value2, "isbusinessunit");
            return (Criteria) this;
        }

        public Criteria andIslastversionIsNull() {
            addCriterion("ISLASTVERSION is null");
            return (Criteria) this;
        }

        public Criteria andIslastversionIsNotNull() {
            addCriterion("ISLASTVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andIslastversionEqualTo(String value) {
            addCriterion("ISLASTVERSION =", value, "islastversion");
            return (Criteria) this;
        }

        public Criteria andIslastversionNotEqualTo(String value) {
            addCriterion("ISLASTVERSION <>", value, "islastversion");
            return (Criteria) this;
        }

        public Criteria andIslastversionGreaterThan(String value) {
            addCriterion("ISLASTVERSION >", value, "islastversion");
            return (Criteria) this;
        }

        public Criteria andIslastversionGreaterThanOrEqualTo(String value) {
            addCriterion("ISLASTVERSION >=", value, "islastversion");
            return (Criteria) this;
        }

        public Criteria andIslastversionLessThan(String value) {
            addCriterion("ISLASTVERSION <", value, "islastversion");
            return (Criteria) this;
        }

        public Criteria andIslastversionLessThanOrEqualTo(String value) {
            addCriterion("ISLASTVERSION <=", value, "islastversion");
            return (Criteria) this;
        }

        public Criteria andIslastversionLike(String value) {
            addCriterion("ISLASTVERSION like", value, "islastversion");
            return (Criteria) this;
        }

        public Criteria andIslastversionNotLike(String value) {
            addCriterion("ISLASTVERSION not like", value, "islastversion");
            return (Criteria) this;
        }

        public Criteria andIslastversionIn(List<String> values) {
            addCriterion("ISLASTVERSION in", values, "islastversion");
            return (Criteria) this;
        }

        public Criteria andIslastversionNotIn(List<String> values) {
            addCriterion("ISLASTVERSION not in", values, "islastversion");
            return (Criteria) this;
        }

        public Criteria andIslastversionBetween(String value1, String value2) {
            addCriterion("ISLASTVERSION between", value1, value2, "islastversion");
            return (Criteria) this;
        }

        public Criteria andIslastversionNotBetween(String value1, String value2) {
            addCriterion("ISLASTVERSION not between", value1, value2, "islastversion");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMnecodeIsNull() {
            addCriterion("MNECODE is null");
            return (Criteria) this;
        }

        public Criteria andMnecodeIsNotNull() {
            addCriterion("MNECODE is not null");
            return (Criteria) this;
        }

        public Criteria andMnecodeEqualTo(String value) {
            addCriterion("MNECODE =", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeNotEqualTo(String value) {
            addCriterion("MNECODE <>", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeGreaterThan(String value) {
            addCriterion("MNECODE >", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeGreaterThanOrEqualTo(String value) {
            addCriterion("MNECODE >=", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeLessThan(String value) {
            addCriterion("MNECODE <", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeLessThanOrEqualTo(String value) {
            addCriterion("MNECODE <=", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeLike(String value) {
            addCriterion("MNECODE like", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeNotLike(String value) {
            addCriterion("MNECODE not like", value, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeIn(List<String> values) {
            addCriterion("MNECODE in", values, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeNotIn(List<String> values) {
            addCriterion("MNECODE not in", values, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeBetween(String value1, String value2) {
            addCriterion("MNECODE between", value1, value2, "mnecode");
            return (Criteria) this;
        }

        public Criteria andMnecodeNotBetween(String value1, String value2) {
            addCriterion("MNECODE not between", value1, value2, "mnecode");
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andName2IsNull() {
            addCriterion("NAME2 is null");
            return (Criteria) this;
        }

        public Criteria andName2IsNotNull() {
            addCriterion("NAME2 is not null");
            return (Criteria) this;
        }

        public Criteria andName2EqualTo(String value) {
            addCriterion("NAME2 =", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2NotEqualTo(String value) {
            addCriterion("NAME2 <>", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2GreaterThan(String value) {
            addCriterion("NAME2 >", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2GreaterThanOrEqualTo(String value) {
            addCriterion("NAME2 >=", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2LessThan(String value) {
            addCriterion("NAME2 <", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2LessThanOrEqualTo(String value) {
            addCriterion("NAME2 <=", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2Like(String value) {
            addCriterion("NAME2 like", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2NotLike(String value) {
            addCriterion("NAME2 not like", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2In(List<String> values) {
            addCriterion("NAME2 in", values, "name2");
            return (Criteria) this;
        }

        public Criteria andName2NotIn(List<String> values) {
            addCriterion("NAME2 not in", values, "name2");
            return (Criteria) this;
        }

        public Criteria andName2Between(String value1, String value2) {
            addCriterion("NAME2 between", value1, value2, "name2");
            return (Criteria) this;
        }

        public Criteria andName2NotBetween(String value1, String value2) {
            addCriterion("NAME2 not between", value1, value2, "name2");
            return (Criteria) this;
        }

        public Criteria andName3IsNull() {
            addCriterion("NAME3 is null");
            return (Criteria) this;
        }

        public Criteria andName3IsNotNull() {
            addCriterion("NAME3 is not null");
            return (Criteria) this;
        }

        public Criteria andName3EqualTo(String value) {
            addCriterion("NAME3 =", value, "name3");
            return (Criteria) this;
        }

        public Criteria andName3NotEqualTo(String value) {
            addCriterion("NAME3 <>", value, "name3");
            return (Criteria) this;
        }

        public Criteria andName3GreaterThan(String value) {
            addCriterion("NAME3 >", value, "name3");
            return (Criteria) this;
        }

        public Criteria andName3GreaterThanOrEqualTo(String value) {
            addCriterion("NAME3 >=", value, "name3");
            return (Criteria) this;
        }

        public Criteria andName3LessThan(String value) {
            addCriterion("NAME3 <", value, "name3");
            return (Criteria) this;
        }

        public Criteria andName3LessThanOrEqualTo(String value) {
            addCriterion("NAME3 <=", value, "name3");
            return (Criteria) this;
        }

        public Criteria andName3Like(String value) {
            addCriterion("NAME3 like", value, "name3");
            return (Criteria) this;
        }

        public Criteria andName3NotLike(String value) {
            addCriterion("NAME3 not like", value, "name3");
            return (Criteria) this;
        }

        public Criteria andName3In(List<String> values) {
            addCriterion("NAME3 in", values, "name3");
            return (Criteria) this;
        }

        public Criteria andName3NotIn(List<String> values) {
            addCriterion("NAME3 not in", values, "name3");
            return (Criteria) this;
        }

        public Criteria andName3Between(String value1, String value2) {
            addCriterion("NAME3 between", value1, value2, "name3");
            return (Criteria) this;
        }

        public Criteria andName3NotBetween(String value1, String value2) {
            addCriterion("NAME3 not between", value1, value2, "name3");
            return (Criteria) this;
        }

        public Criteria andName4IsNull() {
            addCriterion("NAME4 is null");
            return (Criteria) this;
        }

        public Criteria andName4IsNotNull() {
            addCriterion("NAME4 is not null");
            return (Criteria) this;
        }

        public Criteria andName4EqualTo(String value) {
            addCriterion("NAME4 =", value, "name4");
            return (Criteria) this;
        }

        public Criteria andName4NotEqualTo(String value) {
            addCriterion("NAME4 <>", value, "name4");
            return (Criteria) this;
        }

        public Criteria andName4GreaterThan(String value) {
            addCriterion("NAME4 >", value, "name4");
            return (Criteria) this;
        }

        public Criteria andName4GreaterThanOrEqualTo(String value) {
            addCriterion("NAME4 >=", value, "name4");
            return (Criteria) this;
        }

        public Criteria andName4LessThan(String value) {
            addCriterion("NAME4 <", value, "name4");
            return (Criteria) this;
        }

        public Criteria andName4LessThanOrEqualTo(String value) {
            addCriterion("NAME4 <=", value, "name4");
            return (Criteria) this;
        }

        public Criteria andName4Like(String value) {
            addCriterion("NAME4 like", value, "name4");
            return (Criteria) this;
        }

        public Criteria andName4NotLike(String value) {
            addCriterion("NAME4 not like", value, "name4");
            return (Criteria) this;
        }

        public Criteria andName4In(List<String> values) {
            addCriterion("NAME4 in", values, "name4");
            return (Criteria) this;
        }

        public Criteria andName4NotIn(List<String> values) {
            addCriterion("NAME4 not in", values, "name4");
            return (Criteria) this;
        }

        public Criteria andName4Between(String value1, String value2) {
            addCriterion("NAME4 between", value1, value2, "name4");
            return (Criteria) this;
        }

        public Criteria andName4NotBetween(String value1, String value2) {
            addCriterion("NAME4 not between", value1, value2, "name4");
            return (Criteria) this;
        }

        public Criteria andName5IsNull() {
            addCriterion("NAME5 is null");
            return (Criteria) this;
        }

        public Criteria andName5IsNotNull() {
            addCriterion("NAME5 is not null");
            return (Criteria) this;
        }

        public Criteria andName5EqualTo(String value) {
            addCriterion("NAME5 =", value, "name5");
            return (Criteria) this;
        }

        public Criteria andName5NotEqualTo(String value) {
            addCriterion("NAME5 <>", value, "name5");
            return (Criteria) this;
        }

        public Criteria andName5GreaterThan(String value) {
            addCriterion("NAME5 >", value, "name5");
            return (Criteria) this;
        }

        public Criteria andName5GreaterThanOrEqualTo(String value) {
            addCriterion("NAME5 >=", value, "name5");
            return (Criteria) this;
        }

        public Criteria andName5LessThan(String value) {
            addCriterion("NAME5 <", value, "name5");
            return (Criteria) this;
        }

        public Criteria andName5LessThanOrEqualTo(String value) {
            addCriterion("NAME5 <=", value, "name5");
            return (Criteria) this;
        }

        public Criteria andName5Like(String value) {
            addCriterion("NAME5 like", value, "name5");
            return (Criteria) this;
        }

        public Criteria andName5NotLike(String value) {
            addCriterion("NAME5 not like", value, "name5");
            return (Criteria) this;
        }

        public Criteria andName5In(List<String> values) {
            addCriterion("NAME5 in", values, "name5");
            return (Criteria) this;
        }

        public Criteria andName5NotIn(List<String> values) {
            addCriterion("NAME5 not in", values, "name5");
            return (Criteria) this;
        }

        public Criteria andName5Between(String value1, String value2) {
            addCriterion("NAME5 between", value1, value2, "name5");
            return (Criteria) this;
        }

        public Criteria andName5NotBetween(String value1, String value2) {
            addCriterion("NAME5 not between", value1, value2, "name5");
            return (Criteria) this;
        }

        public Criteria andName6IsNull() {
            addCriterion("NAME6 is null");
            return (Criteria) this;
        }

        public Criteria andName6IsNotNull() {
            addCriterion("NAME6 is not null");
            return (Criteria) this;
        }

        public Criteria andName6EqualTo(String value) {
            addCriterion("NAME6 =", value, "name6");
            return (Criteria) this;
        }

        public Criteria andName6NotEqualTo(String value) {
            addCriterion("NAME6 <>", value, "name6");
            return (Criteria) this;
        }

        public Criteria andName6GreaterThan(String value) {
            addCriterion("NAME6 >", value, "name6");
            return (Criteria) this;
        }

        public Criteria andName6GreaterThanOrEqualTo(String value) {
            addCriterion("NAME6 >=", value, "name6");
            return (Criteria) this;
        }

        public Criteria andName6LessThan(String value) {
            addCriterion("NAME6 <", value, "name6");
            return (Criteria) this;
        }

        public Criteria andName6LessThanOrEqualTo(String value) {
            addCriterion("NAME6 <=", value, "name6");
            return (Criteria) this;
        }

        public Criteria andName6Like(String value) {
            addCriterion("NAME6 like", value, "name6");
            return (Criteria) this;
        }

        public Criteria andName6NotLike(String value) {
            addCriterion("NAME6 not like", value, "name6");
            return (Criteria) this;
        }

        public Criteria andName6In(List<String> values) {
            addCriterion("NAME6 in", values, "name6");
            return (Criteria) this;
        }

        public Criteria andName6NotIn(List<String> values) {
            addCriterion("NAME6 not in", values, "name6");
            return (Criteria) this;
        }

        public Criteria andName6Between(String value1, String value2) {
            addCriterion("NAME6 between", value1, value2, "name6");
            return (Criteria) this;
        }

        public Criteria andName6NotBetween(String value1, String value2) {
            addCriterion("NAME6 not between", value1, value2, "name6");
            return (Criteria) this;
        }

        public Criteria andNcindustryIsNull() {
            addCriterion("NCINDUSTRY is null");
            return (Criteria) this;
        }

        public Criteria andNcindustryIsNotNull() {
            addCriterion("NCINDUSTRY is not null");
            return (Criteria) this;
        }

        public Criteria andNcindustryEqualTo(String value) {
            addCriterion("NCINDUSTRY =", value, "ncindustry");
            return (Criteria) this;
        }

        public Criteria andNcindustryNotEqualTo(String value) {
            addCriterion("NCINDUSTRY <>", value, "ncindustry");
            return (Criteria) this;
        }

        public Criteria andNcindustryGreaterThan(String value) {
            addCriterion("NCINDUSTRY >", value, "ncindustry");
            return (Criteria) this;
        }

        public Criteria andNcindustryGreaterThanOrEqualTo(String value) {
            addCriterion("NCINDUSTRY >=", value, "ncindustry");
            return (Criteria) this;
        }

        public Criteria andNcindustryLessThan(String value) {
            addCriterion("NCINDUSTRY <", value, "ncindustry");
            return (Criteria) this;
        }

        public Criteria andNcindustryLessThanOrEqualTo(String value) {
            addCriterion("NCINDUSTRY <=", value, "ncindustry");
            return (Criteria) this;
        }

        public Criteria andNcindustryLike(String value) {
            addCriterion("NCINDUSTRY like", value, "ncindustry");
            return (Criteria) this;
        }

        public Criteria andNcindustryNotLike(String value) {
            addCriterion("NCINDUSTRY not like", value, "ncindustry");
            return (Criteria) this;
        }

        public Criteria andNcindustryIn(List<String> values) {
            addCriterion("NCINDUSTRY in", values, "ncindustry");
            return (Criteria) this;
        }

        public Criteria andNcindustryNotIn(List<String> values) {
            addCriterion("NCINDUSTRY not in", values, "ncindustry");
            return (Criteria) this;
        }

        public Criteria andNcindustryBetween(String value1, String value2) {
            addCriterion("NCINDUSTRY between", value1, value2, "ncindustry");
            return (Criteria) this;
        }

        public Criteria andNcindustryNotBetween(String value1, String value2) {
            addCriterion("NCINDUSTRY not between", value1, value2, "ncindustry");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeIsNull() {
            addCriterion("ORGANIZATIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeIsNotNull() {
            addCriterion("ORGANIZATIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeEqualTo(String value) {
            addCriterion("ORGANIZATIONCODE =", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotEqualTo(String value) {
            addCriterion("ORGANIZATIONCODE <>", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeGreaterThan(String value) {
            addCriterion("ORGANIZATIONCODE >", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONCODE >=", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLessThan(String value) {
            addCriterion("ORGANIZATIONCODE <", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONCODE <=", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLike(String value) {
            addCriterion("ORGANIZATIONCODE like", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotLike(String value) {
            addCriterion("ORGANIZATIONCODE not like", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeIn(List<String> values) {
            addCriterion("ORGANIZATIONCODE in", values, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotIn(List<String> values) {
            addCriterion("ORGANIZATIONCODE not in", values, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONCODE between", value1, value2, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONCODE not between", value1, value2, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrgtype1IsNull() {
            addCriterion("ORGTYPE1 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype1IsNotNull() {
            addCriterion("ORGTYPE1 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype1EqualTo(String value) {
            addCriterion("ORGTYPE1 =", value, "orgtype1");
            return (Criteria) this;
        }

        public Criteria andOrgtype1NotEqualTo(String value) {
            addCriterion("ORGTYPE1 <>", value, "orgtype1");
            return (Criteria) this;
        }

        public Criteria andOrgtype1GreaterThan(String value) {
            addCriterion("ORGTYPE1 >", value, "orgtype1");
            return (Criteria) this;
        }

        public Criteria andOrgtype1GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE1 >=", value, "orgtype1");
            return (Criteria) this;
        }

        public Criteria andOrgtype1LessThan(String value) {
            addCriterion("ORGTYPE1 <", value, "orgtype1");
            return (Criteria) this;
        }

        public Criteria andOrgtype1LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE1 <=", value, "orgtype1");
            return (Criteria) this;
        }

        public Criteria andOrgtype1Like(String value) {
            addCriterion("ORGTYPE1 like", value, "orgtype1");
            return (Criteria) this;
        }

        public Criteria andOrgtype1NotLike(String value) {
            addCriterion("ORGTYPE1 not like", value, "orgtype1");
            return (Criteria) this;
        }

        public Criteria andOrgtype1In(List<String> values) {
            addCriterion("ORGTYPE1 in", values, "orgtype1");
            return (Criteria) this;
        }

        public Criteria andOrgtype1NotIn(List<String> values) {
            addCriterion("ORGTYPE1 not in", values, "orgtype1");
            return (Criteria) this;
        }

        public Criteria andOrgtype1Between(String value1, String value2) {
            addCriterion("ORGTYPE1 between", value1, value2, "orgtype1");
            return (Criteria) this;
        }

        public Criteria andOrgtype1NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE1 not between", value1, value2, "orgtype1");
            return (Criteria) this;
        }

        public Criteria andOrgtype10IsNull() {
            addCriterion("ORGTYPE10 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype10IsNotNull() {
            addCriterion("ORGTYPE10 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype10EqualTo(String value) {
            addCriterion("ORGTYPE10 =", value, "orgtype10");
            return (Criteria) this;
        }

        public Criteria andOrgtype10NotEqualTo(String value) {
            addCriterion("ORGTYPE10 <>", value, "orgtype10");
            return (Criteria) this;
        }

        public Criteria andOrgtype10GreaterThan(String value) {
            addCriterion("ORGTYPE10 >", value, "orgtype10");
            return (Criteria) this;
        }

        public Criteria andOrgtype10GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE10 >=", value, "orgtype10");
            return (Criteria) this;
        }

        public Criteria andOrgtype10LessThan(String value) {
            addCriterion("ORGTYPE10 <", value, "orgtype10");
            return (Criteria) this;
        }

        public Criteria andOrgtype10LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE10 <=", value, "orgtype10");
            return (Criteria) this;
        }

        public Criteria andOrgtype10Like(String value) {
            addCriterion("ORGTYPE10 like", value, "orgtype10");
            return (Criteria) this;
        }

        public Criteria andOrgtype10NotLike(String value) {
            addCriterion("ORGTYPE10 not like", value, "orgtype10");
            return (Criteria) this;
        }

        public Criteria andOrgtype10In(List<String> values) {
            addCriterion("ORGTYPE10 in", values, "orgtype10");
            return (Criteria) this;
        }

        public Criteria andOrgtype10NotIn(List<String> values) {
            addCriterion("ORGTYPE10 not in", values, "orgtype10");
            return (Criteria) this;
        }

        public Criteria andOrgtype10Between(String value1, String value2) {
            addCriterion("ORGTYPE10 between", value1, value2, "orgtype10");
            return (Criteria) this;
        }

        public Criteria andOrgtype10NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE10 not between", value1, value2, "orgtype10");
            return (Criteria) this;
        }

        public Criteria andOrgtype11IsNull() {
            addCriterion("ORGTYPE11 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype11IsNotNull() {
            addCriterion("ORGTYPE11 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype11EqualTo(String value) {
            addCriterion("ORGTYPE11 =", value, "orgtype11");
            return (Criteria) this;
        }

        public Criteria andOrgtype11NotEqualTo(String value) {
            addCriterion("ORGTYPE11 <>", value, "orgtype11");
            return (Criteria) this;
        }

        public Criteria andOrgtype11GreaterThan(String value) {
            addCriterion("ORGTYPE11 >", value, "orgtype11");
            return (Criteria) this;
        }

        public Criteria andOrgtype11GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE11 >=", value, "orgtype11");
            return (Criteria) this;
        }

        public Criteria andOrgtype11LessThan(String value) {
            addCriterion("ORGTYPE11 <", value, "orgtype11");
            return (Criteria) this;
        }

        public Criteria andOrgtype11LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE11 <=", value, "orgtype11");
            return (Criteria) this;
        }

        public Criteria andOrgtype11Like(String value) {
            addCriterion("ORGTYPE11 like", value, "orgtype11");
            return (Criteria) this;
        }

        public Criteria andOrgtype11NotLike(String value) {
            addCriterion("ORGTYPE11 not like", value, "orgtype11");
            return (Criteria) this;
        }

        public Criteria andOrgtype11In(List<String> values) {
            addCriterion("ORGTYPE11 in", values, "orgtype11");
            return (Criteria) this;
        }

        public Criteria andOrgtype11NotIn(List<String> values) {
            addCriterion("ORGTYPE11 not in", values, "orgtype11");
            return (Criteria) this;
        }

        public Criteria andOrgtype11Between(String value1, String value2) {
            addCriterion("ORGTYPE11 between", value1, value2, "orgtype11");
            return (Criteria) this;
        }

        public Criteria andOrgtype11NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE11 not between", value1, value2, "orgtype11");
            return (Criteria) this;
        }

        public Criteria andOrgtype12IsNull() {
            addCriterion("ORGTYPE12 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype12IsNotNull() {
            addCriterion("ORGTYPE12 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype12EqualTo(String value) {
            addCriterion("ORGTYPE12 =", value, "orgtype12");
            return (Criteria) this;
        }

        public Criteria andOrgtype12NotEqualTo(String value) {
            addCriterion("ORGTYPE12 <>", value, "orgtype12");
            return (Criteria) this;
        }

        public Criteria andOrgtype12GreaterThan(String value) {
            addCriterion("ORGTYPE12 >", value, "orgtype12");
            return (Criteria) this;
        }

        public Criteria andOrgtype12GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE12 >=", value, "orgtype12");
            return (Criteria) this;
        }

        public Criteria andOrgtype12LessThan(String value) {
            addCriterion("ORGTYPE12 <", value, "orgtype12");
            return (Criteria) this;
        }

        public Criteria andOrgtype12LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE12 <=", value, "orgtype12");
            return (Criteria) this;
        }

        public Criteria andOrgtype12Like(String value) {
            addCriterion("ORGTYPE12 like", value, "orgtype12");
            return (Criteria) this;
        }

        public Criteria andOrgtype12NotLike(String value) {
            addCriterion("ORGTYPE12 not like", value, "orgtype12");
            return (Criteria) this;
        }

        public Criteria andOrgtype12In(List<String> values) {
            addCriterion("ORGTYPE12 in", values, "orgtype12");
            return (Criteria) this;
        }

        public Criteria andOrgtype12NotIn(List<String> values) {
            addCriterion("ORGTYPE12 not in", values, "orgtype12");
            return (Criteria) this;
        }

        public Criteria andOrgtype12Between(String value1, String value2) {
            addCriterion("ORGTYPE12 between", value1, value2, "orgtype12");
            return (Criteria) this;
        }

        public Criteria andOrgtype12NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE12 not between", value1, value2, "orgtype12");
            return (Criteria) this;
        }

        public Criteria andOrgtype13IsNull() {
            addCriterion("ORGTYPE13 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype13IsNotNull() {
            addCriterion("ORGTYPE13 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype13EqualTo(String value) {
            addCriterion("ORGTYPE13 =", value, "orgtype13");
            return (Criteria) this;
        }

        public Criteria andOrgtype13NotEqualTo(String value) {
            addCriterion("ORGTYPE13 <>", value, "orgtype13");
            return (Criteria) this;
        }

        public Criteria andOrgtype13GreaterThan(String value) {
            addCriterion("ORGTYPE13 >", value, "orgtype13");
            return (Criteria) this;
        }

        public Criteria andOrgtype13GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE13 >=", value, "orgtype13");
            return (Criteria) this;
        }

        public Criteria andOrgtype13LessThan(String value) {
            addCriterion("ORGTYPE13 <", value, "orgtype13");
            return (Criteria) this;
        }

        public Criteria andOrgtype13LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE13 <=", value, "orgtype13");
            return (Criteria) this;
        }

        public Criteria andOrgtype13Like(String value) {
            addCriterion("ORGTYPE13 like", value, "orgtype13");
            return (Criteria) this;
        }

        public Criteria andOrgtype13NotLike(String value) {
            addCriterion("ORGTYPE13 not like", value, "orgtype13");
            return (Criteria) this;
        }

        public Criteria andOrgtype13In(List<String> values) {
            addCriterion("ORGTYPE13 in", values, "orgtype13");
            return (Criteria) this;
        }

        public Criteria andOrgtype13NotIn(List<String> values) {
            addCriterion("ORGTYPE13 not in", values, "orgtype13");
            return (Criteria) this;
        }

        public Criteria andOrgtype13Between(String value1, String value2) {
            addCriterion("ORGTYPE13 between", value1, value2, "orgtype13");
            return (Criteria) this;
        }

        public Criteria andOrgtype13NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE13 not between", value1, value2, "orgtype13");
            return (Criteria) this;
        }

        public Criteria andOrgtype14IsNull() {
            addCriterion("ORGTYPE14 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype14IsNotNull() {
            addCriterion("ORGTYPE14 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype14EqualTo(String value) {
            addCriterion("ORGTYPE14 =", value, "orgtype14");
            return (Criteria) this;
        }

        public Criteria andOrgtype14NotEqualTo(String value) {
            addCriterion("ORGTYPE14 <>", value, "orgtype14");
            return (Criteria) this;
        }

        public Criteria andOrgtype14GreaterThan(String value) {
            addCriterion("ORGTYPE14 >", value, "orgtype14");
            return (Criteria) this;
        }

        public Criteria andOrgtype14GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE14 >=", value, "orgtype14");
            return (Criteria) this;
        }

        public Criteria andOrgtype14LessThan(String value) {
            addCriterion("ORGTYPE14 <", value, "orgtype14");
            return (Criteria) this;
        }

        public Criteria andOrgtype14LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE14 <=", value, "orgtype14");
            return (Criteria) this;
        }

        public Criteria andOrgtype14Like(String value) {
            addCriterion("ORGTYPE14 like", value, "orgtype14");
            return (Criteria) this;
        }

        public Criteria andOrgtype14NotLike(String value) {
            addCriterion("ORGTYPE14 not like", value, "orgtype14");
            return (Criteria) this;
        }

        public Criteria andOrgtype14In(List<String> values) {
            addCriterion("ORGTYPE14 in", values, "orgtype14");
            return (Criteria) this;
        }

        public Criteria andOrgtype14NotIn(List<String> values) {
            addCriterion("ORGTYPE14 not in", values, "orgtype14");
            return (Criteria) this;
        }

        public Criteria andOrgtype14Between(String value1, String value2) {
            addCriterion("ORGTYPE14 between", value1, value2, "orgtype14");
            return (Criteria) this;
        }

        public Criteria andOrgtype14NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE14 not between", value1, value2, "orgtype14");
            return (Criteria) this;
        }

        public Criteria andOrgtype15IsNull() {
            addCriterion("ORGTYPE15 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype15IsNotNull() {
            addCriterion("ORGTYPE15 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype15EqualTo(String value) {
            addCriterion("ORGTYPE15 =", value, "orgtype15");
            return (Criteria) this;
        }

        public Criteria andOrgtype15NotEqualTo(String value) {
            addCriterion("ORGTYPE15 <>", value, "orgtype15");
            return (Criteria) this;
        }

        public Criteria andOrgtype15GreaterThan(String value) {
            addCriterion("ORGTYPE15 >", value, "orgtype15");
            return (Criteria) this;
        }

        public Criteria andOrgtype15GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE15 >=", value, "orgtype15");
            return (Criteria) this;
        }

        public Criteria andOrgtype15LessThan(String value) {
            addCriterion("ORGTYPE15 <", value, "orgtype15");
            return (Criteria) this;
        }

        public Criteria andOrgtype15LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE15 <=", value, "orgtype15");
            return (Criteria) this;
        }

        public Criteria andOrgtype15Like(String value) {
            addCriterion("ORGTYPE15 like", value, "orgtype15");
            return (Criteria) this;
        }

        public Criteria andOrgtype15NotLike(String value) {
            addCriterion("ORGTYPE15 not like", value, "orgtype15");
            return (Criteria) this;
        }

        public Criteria andOrgtype15In(List<String> values) {
            addCriterion("ORGTYPE15 in", values, "orgtype15");
            return (Criteria) this;
        }

        public Criteria andOrgtype15NotIn(List<String> values) {
            addCriterion("ORGTYPE15 not in", values, "orgtype15");
            return (Criteria) this;
        }

        public Criteria andOrgtype15Between(String value1, String value2) {
            addCriterion("ORGTYPE15 between", value1, value2, "orgtype15");
            return (Criteria) this;
        }

        public Criteria andOrgtype15NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE15 not between", value1, value2, "orgtype15");
            return (Criteria) this;
        }

        public Criteria andOrgtype16IsNull() {
            addCriterion("ORGTYPE16 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype16IsNotNull() {
            addCriterion("ORGTYPE16 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype16EqualTo(String value) {
            addCriterion("ORGTYPE16 =", value, "orgtype16");
            return (Criteria) this;
        }

        public Criteria andOrgtype16NotEqualTo(String value) {
            addCriterion("ORGTYPE16 <>", value, "orgtype16");
            return (Criteria) this;
        }

        public Criteria andOrgtype16GreaterThan(String value) {
            addCriterion("ORGTYPE16 >", value, "orgtype16");
            return (Criteria) this;
        }

        public Criteria andOrgtype16GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE16 >=", value, "orgtype16");
            return (Criteria) this;
        }

        public Criteria andOrgtype16LessThan(String value) {
            addCriterion("ORGTYPE16 <", value, "orgtype16");
            return (Criteria) this;
        }

        public Criteria andOrgtype16LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE16 <=", value, "orgtype16");
            return (Criteria) this;
        }

        public Criteria andOrgtype16Like(String value) {
            addCriterion("ORGTYPE16 like", value, "orgtype16");
            return (Criteria) this;
        }

        public Criteria andOrgtype16NotLike(String value) {
            addCriterion("ORGTYPE16 not like", value, "orgtype16");
            return (Criteria) this;
        }

        public Criteria andOrgtype16In(List<String> values) {
            addCriterion("ORGTYPE16 in", values, "orgtype16");
            return (Criteria) this;
        }

        public Criteria andOrgtype16NotIn(List<String> values) {
            addCriterion("ORGTYPE16 not in", values, "orgtype16");
            return (Criteria) this;
        }

        public Criteria andOrgtype16Between(String value1, String value2) {
            addCriterion("ORGTYPE16 between", value1, value2, "orgtype16");
            return (Criteria) this;
        }

        public Criteria andOrgtype16NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE16 not between", value1, value2, "orgtype16");
            return (Criteria) this;
        }

        public Criteria andOrgtype17IsNull() {
            addCriterion("ORGTYPE17 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype17IsNotNull() {
            addCriterion("ORGTYPE17 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype17EqualTo(String value) {
            addCriterion("ORGTYPE17 =", value, "orgtype17");
            return (Criteria) this;
        }

        public Criteria andOrgtype17NotEqualTo(String value) {
            addCriterion("ORGTYPE17 <>", value, "orgtype17");
            return (Criteria) this;
        }

        public Criteria andOrgtype17GreaterThan(String value) {
            addCriterion("ORGTYPE17 >", value, "orgtype17");
            return (Criteria) this;
        }

        public Criteria andOrgtype17GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE17 >=", value, "orgtype17");
            return (Criteria) this;
        }

        public Criteria andOrgtype17LessThan(String value) {
            addCriterion("ORGTYPE17 <", value, "orgtype17");
            return (Criteria) this;
        }

        public Criteria andOrgtype17LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE17 <=", value, "orgtype17");
            return (Criteria) this;
        }

        public Criteria andOrgtype17Like(String value) {
            addCriterion("ORGTYPE17 like", value, "orgtype17");
            return (Criteria) this;
        }

        public Criteria andOrgtype17NotLike(String value) {
            addCriterion("ORGTYPE17 not like", value, "orgtype17");
            return (Criteria) this;
        }

        public Criteria andOrgtype17In(List<String> values) {
            addCriterion("ORGTYPE17 in", values, "orgtype17");
            return (Criteria) this;
        }

        public Criteria andOrgtype17NotIn(List<String> values) {
            addCriterion("ORGTYPE17 not in", values, "orgtype17");
            return (Criteria) this;
        }

        public Criteria andOrgtype17Between(String value1, String value2) {
            addCriterion("ORGTYPE17 between", value1, value2, "orgtype17");
            return (Criteria) this;
        }

        public Criteria andOrgtype17NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE17 not between", value1, value2, "orgtype17");
            return (Criteria) this;
        }

        public Criteria andOrgtype18IsNull() {
            addCriterion("ORGTYPE18 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype18IsNotNull() {
            addCriterion("ORGTYPE18 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype18EqualTo(String value) {
            addCriterion("ORGTYPE18 =", value, "orgtype18");
            return (Criteria) this;
        }

        public Criteria andOrgtype18NotEqualTo(String value) {
            addCriterion("ORGTYPE18 <>", value, "orgtype18");
            return (Criteria) this;
        }

        public Criteria andOrgtype18GreaterThan(String value) {
            addCriterion("ORGTYPE18 >", value, "orgtype18");
            return (Criteria) this;
        }

        public Criteria andOrgtype18GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE18 >=", value, "orgtype18");
            return (Criteria) this;
        }

        public Criteria andOrgtype18LessThan(String value) {
            addCriterion("ORGTYPE18 <", value, "orgtype18");
            return (Criteria) this;
        }

        public Criteria andOrgtype18LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE18 <=", value, "orgtype18");
            return (Criteria) this;
        }

        public Criteria andOrgtype18Like(String value) {
            addCriterion("ORGTYPE18 like", value, "orgtype18");
            return (Criteria) this;
        }

        public Criteria andOrgtype18NotLike(String value) {
            addCriterion("ORGTYPE18 not like", value, "orgtype18");
            return (Criteria) this;
        }

        public Criteria andOrgtype18In(List<String> values) {
            addCriterion("ORGTYPE18 in", values, "orgtype18");
            return (Criteria) this;
        }

        public Criteria andOrgtype18NotIn(List<String> values) {
            addCriterion("ORGTYPE18 not in", values, "orgtype18");
            return (Criteria) this;
        }

        public Criteria andOrgtype18Between(String value1, String value2) {
            addCriterion("ORGTYPE18 between", value1, value2, "orgtype18");
            return (Criteria) this;
        }

        public Criteria andOrgtype18NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE18 not between", value1, value2, "orgtype18");
            return (Criteria) this;
        }

        public Criteria andOrgtype19IsNull() {
            addCriterion("ORGTYPE19 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype19IsNotNull() {
            addCriterion("ORGTYPE19 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype19EqualTo(String value) {
            addCriterion("ORGTYPE19 =", value, "orgtype19");
            return (Criteria) this;
        }

        public Criteria andOrgtype19NotEqualTo(String value) {
            addCriterion("ORGTYPE19 <>", value, "orgtype19");
            return (Criteria) this;
        }

        public Criteria andOrgtype19GreaterThan(String value) {
            addCriterion("ORGTYPE19 >", value, "orgtype19");
            return (Criteria) this;
        }

        public Criteria andOrgtype19GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE19 >=", value, "orgtype19");
            return (Criteria) this;
        }

        public Criteria andOrgtype19LessThan(String value) {
            addCriterion("ORGTYPE19 <", value, "orgtype19");
            return (Criteria) this;
        }

        public Criteria andOrgtype19LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE19 <=", value, "orgtype19");
            return (Criteria) this;
        }

        public Criteria andOrgtype19Like(String value) {
            addCriterion("ORGTYPE19 like", value, "orgtype19");
            return (Criteria) this;
        }

        public Criteria andOrgtype19NotLike(String value) {
            addCriterion("ORGTYPE19 not like", value, "orgtype19");
            return (Criteria) this;
        }

        public Criteria andOrgtype19In(List<String> values) {
            addCriterion("ORGTYPE19 in", values, "orgtype19");
            return (Criteria) this;
        }

        public Criteria andOrgtype19NotIn(List<String> values) {
            addCriterion("ORGTYPE19 not in", values, "orgtype19");
            return (Criteria) this;
        }

        public Criteria andOrgtype19Between(String value1, String value2) {
            addCriterion("ORGTYPE19 between", value1, value2, "orgtype19");
            return (Criteria) this;
        }

        public Criteria andOrgtype19NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE19 not between", value1, value2, "orgtype19");
            return (Criteria) this;
        }

        public Criteria andOrgtype2IsNull() {
            addCriterion("ORGTYPE2 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype2IsNotNull() {
            addCriterion("ORGTYPE2 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype2EqualTo(String value) {
            addCriterion("ORGTYPE2 =", value, "orgtype2");
            return (Criteria) this;
        }

        public Criteria andOrgtype2NotEqualTo(String value) {
            addCriterion("ORGTYPE2 <>", value, "orgtype2");
            return (Criteria) this;
        }

        public Criteria andOrgtype2GreaterThan(String value) {
            addCriterion("ORGTYPE2 >", value, "orgtype2");
            return (Criteria) this;
        }

        public Criteria andOrgtype2GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE2 >=", value, "orgtype2");
            return (Criteria) this;
        }

        public Criteria andOrgtype2LessThan(String value) {
            addCriterion("ORGTYPE2 <", value, "orgtype2");
            return (Criteria) this;
        }

        public Criteria andOrgtype2LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE2 <=", value, "orgtype2");
            return (Criteria) this;
        }

        public Criteria andOrgtype2Like(String value) {
            addCriterion("ORGTYPE2 like", value, "orgtype2");
            return (Criteria) this;
        }

        public Criteria andOrgtype2NotLike(String value) {
            addCriterion("ORGTYPE2 not like", value, "orgtype2");
            return (Criteria) this;
        }

        public Criteria andOrgtype2In(List<String> values) {
            addCriterion("ORGTYPE2 in", values, "orgtype2");
            return (Criteria) this;
        }

        public Criteria andOrgtype2NotIn(List<String> values) {
            addCriterion("ORGTYPE2 not in", values, "orgtype2");
            return (Criteria) this;
        }

        public Criteria andOrgtype2Between(String value1, String value2) {
            addCriterion("ORGTYPE2 between", value1, value2, "orgtype2");
            return (Criteria) this;
        }

        public Criteria andOrgtype2NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE2 not between", value1, value2, "orgtype2");
            return (Criteria) this;
        }

        public Criteria andOrgtype20IsNull() {
            addCriterion("ORGTYPE20 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype20IsNotNull() {
            addCriterion("ORGTYPE20 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype20EqualTo(String value) {
            addCriterion("ORGTYPE20 =", value, "orgtype20");
            return (Criteria) this;
        }

        public Criteria andOrgtype20NotEqualTo(String value) {
            addCriterion("ORGTYPE20 <>", value, "orgtype20");
            return (Criteria) this;
        }

        public Criteria andOrgtype20GreaterThan(String value) {
            addCriterion("ORGTYPE20 >", value, "orgtype20");
            return (Criteria) this;
        }

        public Criteria andOrgtype20GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE20 >=", value, "orgtype20");
            return (Criteria) this;
        }

        public Criteria andOrgtype20LessThan(String value) {
            addCriterion("ORGTYPE20 <", value, "orgtype20");
            return (Criteria) this;
        }

        public Criteria andOrgtype20LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE20 <=", value, "orgtype20");
            return (Criteria) this;
        }

        public Criteria andOrgtype20Like(String value) {
            addCriterion("ORGTYPE20 like", value, "orgtype20");
            return (Criteria) this;
        }

        public Criteria andOrgtype20NotLike(String value) {
            addCriterion("ORGTYPE20 not like", value, "orgtype20");
            return (Criteria) this;
        }

        public Criteria andOrgtype20In(List<String> values) {
            addCriterion("ORGTYPE20 in", values, "orgtype20");
            return (Criteria) this;
        }

        public Criteria andOrgtype20NotIn(List<String> values) {
            addCriterion("ORGTYPE20 not in", values, "orgtype20");
            return (Criteria) this;
        }

        public Criteria andOrgtype20Between(String value1, String value2) {
            addCriterion("ORGTYPE20 between", value1, value2, "orgtype20");
            return (Criteria) this;
        }

        public Criteria andOrgtype20NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE20 not between", value1, value2, "orgtype20");
            return (Criteria) this;
        }

        public Criteria andOrgtype21IsNull() {
            addCriterion("ORGTYPE21 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype21IsNotNull() {
            addCriterion("ORGTYPE21 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype21EqualTo(String value) {
            addCriterion("ORGTYPE21 =", value, "orgtype21");
            return (Criteria) this;
        }

        public Criteria andOrgtype21NotEqualTo(String value) {
            addCriterion("ORGTYPE21 <>", value, "orgtype21");
            return (Criteria) this;
        }

        public Criteria andOrgtype21GreaterThan(String value) {
            addCriterion("ORGTYPE21 >", value, "orgtype21");
            return (Criteria) this;
        }

        public Criteria andOrgtype21GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE21 >=", value, "orgtype21");
            return (Criteria) this;
        }

        public Criteria andOrgtype21LessThan(String value) {
            addCriterion("ORGTYPE21 <", value, "orgtype21");
            return (Criteria) this;
        }

        public Criteria andOrgtype21LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE21 <=", value, "orgtype21");
            return (Criteria) this;
        }

        public Criteria andOrgtype21Like(String value) {
            addCriterion("ORGTYPE21 like", value, "orgtype21");
            return (Criteria) this;
        }

        public Criteria andOrgtype21NotLike(String value) {
            addCriterion("ORGTYPE21 not like", value, "orgtype21");
            return (Criteria) this;
        }

        public Criteria andOrgtype21In(List<String> values) {
            addCriterion("ORGTYPE21 in", values, "orgtype21");
            return (Criteria) this;
        }

        public Criteria andOrgtype21NotIn(List<String> values) {
            addCriterion("ORGTYPE21 not in", values, "orgtype21");
            return (Criteria) this;
        }

        public Criteria andOrgtype21Between(String value1, String value2) {
            addCriterion("ORGTYPE21 between", value1, value2, "orgtype21");
            return (Criteria) this;
        }

        public Criteria andOrgtype21NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE21 not between", value1, value2, "orgtype21");
            return (Criteria) this;
        }

        public Criteria andOrgtype22IsNull() {
            addCriterion("ORGTYPE22 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype22IsNotNull() {
            addCriterion("ORGTYPE22 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype22EqualTo(String value) {
            addCriterion("ORGTYPE22 =", value, "orgtype22");
            return (Criteria) this;
        }

        public Criteria andOrgtype22NotEqualTo(String value) {
            addCriterion("ORGTYPE22 <>", value, "orgtype22");
            return (Criteria) this;
        }

        public Criteria andOrgtype22GreaterThan(String value) {
            addCriterion("ORGTYPE22 >", value, "orgtype22");
            return (Criteria) this;
        }

        public Criteria andOrgtype22GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE22 >=", value, "orgtype22");
            return (Criteria) this;
        }

        public Criteria andOrgtype22LessThan(String value) {
            addCriterion("ORGTYPE22 <", value, "orgtype22");
            return (Criteria) this;
        }

        public Criteria andOrgtype22LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE22 <=", value, "orgtype22");
            return (Criteria) this;
        }

        public Criteria andOrgtype22Like(String value) {
            addCriterion("ORGTYPE22 like", value, "orgtype22");
            return (Criteria) this;
        }

        public Criteria andOrgtype22NotLike(String value) {
            addCriterion("ORGTYPE22 not like", value, "orgtype22");
            return (Criteria) this;
        }

        public Criteria andOrgtype22In(List<String> values) {
            addCriterion("ORGTYPE22 in", values, "orgtype22");
            return (Criteria) this;
        }

        public Criteria andOrgtype22NotIn(List<String> values) {
            addCriterion("ORGTYPE22 not in", values, "orgtype22");
            return (Criteria) this;
        }

        public Criteria andOrgtype22Between(String value1, String value2) {
            addCriterion("ORGTYPE22 between", value1, value2, "orgtype22");
            return (Criteria) this;
        }

        public Criteria andOrgtype22NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE22 not between", value1, value2, "orgtype22");
            return (Criteria) this;
        }

        public Criteria andOrgtype23IsNull() {
            addCriterion("ORGTYPE23 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype23IsNotNull() {
            addCriterion("ORGTYPE23 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype23EqualTo(String value) {
            addCriterion("ORGTYPE23 =", value, "orgtype23");
            return (Criteria) this;
        }

        public Criteria andOrgtype23NotEqualTo(String value) {
            addCriterion("ORGTYPE23 <>", value, "orgtype23");
            return (Criteria) this;
        }

        public Criteria andOrgtype23GreaterThan(String value) {
            addCriterion("ORGTYPE23 >", value, "orgtype23");
            return (Criteria) this;
        }

        public Criteria andOrgtype23GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE23 >=", value, "orgtype23");
            return (Criteria) this;
        }

        public Criteria andOrgtype23LessThan(String value) {
            addCriterion("ORGTYPE23 <", value, "orgtype23");
            return (Criteria) this;
        }

        public Criteria andOrgtype23LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE23 <=", value, "orgtype23");
            return (Criteria) this;
        }

        public Criteria andOrgtype23Like(String value) {
            addCriterion("ORGTYPE23 like", value, "orgtype23");
            return (Criteria) this;
        }

        public Criteria andOrgtype23NotLike(String value) {
            addCriterion("ORGTYPE23 not like", value, "orgtype23");
            return (Criteria) this;
        }

        public Criteria andOrgtype23In(List<String> values) {
            addCriterion("ORGTYPE23 in", values, "orgtype23");
            return (Criteria) this;
        }

        public Criteria andOrgtype23NotIn(List<String> values) {
            addCriterion("ORGTYPE23 not in", values, "orgtype23");
            return (Criteria) this;
        }

        public Criteria andOrgtype23Between(String value1, String value2) {
            addCriterion("ORGTYPE23 between", value1, value2, "orgtype23");
            return (Criteria) this;
        }

        public Criteria andOrgtype23NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE23 not between", value1, value2, "orgtype23");
            return (Criteria) this;
        }

        public Criteria andOrgtype24IsNull() {
            addCriterion("ORGTYPE24 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype24IsNotNull() {
            addCriterion("ORGTYPE24 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype24EqualTo(String value) {
            addCriterion("ORGTYPE24 =", value, "orgtype24");
            return (Criteria) this;
        }

        public Criteria andOrgtype24NotEqualTo(String value) {
            addCriterion("ORGTYPE24 <>", value, "orgtype24");
            return (Criteria) this;
        }

        public Criteria andOrgtype24GreaterThan(String value) {
            addCriterion("ORGTYPE24 >", value, "orgtype24");
            return (Criteria) this;
        }

        public Criteria andOrgtype24GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE24 >=", value, "orgtype24");
            return (Criteria) this;
        }

        public Criteria andOrgtype24LessThan(String value) {
            addCriterion("ORGTYPE24 <", value, "orgtype24");
            return (Criteria) this;
        }

        public Criteria andOrgtype24LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE24 <=", value, "orgtype24");
            return (Criteria) this;
        }

        public Criteria andOrgtype24Like(String value) {
            addCriterion("ORGTYPE24 like", value, "orgtype24");
            return (Criteria) this;
        }

        public Criteria andOrgtype24NotLike(String value) {
            addCriterion("ORGTYPE24 not like", value, "orgtype24");
            return (Criteria) this;
        }

        public Criteria andOrgtype24In(List<String> values) {
            addCriterion("ORGTYPE24 in", values, "orgtype24");
            return (Criteria) this;
        }

        public Criteria andOrgtype24NotIn(List<String> values) {
            addCriterion("ORGTYPE24 not in", values, "orgtype24");
            return (Criteria) this;
        }

        public Criteria andOrgtype24Between(String value1, String value2) {
            addCriterion("ORGTYPE24 between", value1, value2, "orgtype24");
            return (Criteria) this;
        }

        public Criteria andOrgtype24NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE24 not between", value1, value2, "orgtype24");
            return (Criteria) this;
        }

        public Criteria andOrgtype25IsNull() {
            addCriterion("ORGTYPE25 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype25IsNotNull() {
            addCriterion("ORGTYPE25 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype25EqualTo(String value) {
            addCriterion("ORGTYPE25 =", value, "orgtype25");
            return (Criteria) this;
        }

        public Criteria andOrgtype25NotEqualTo(String value) {
            addCriterion("ORGTYPE25 <>", value, "orgtype25");
            return (Criteria) this;
        }

        public Criteria andOrgtype25GreaterThan(String value) {
            addCriterion("ORGTYPE25 >", value, "orgtype25");
            return (Criteria) this;
        }

        public Criteria andOrgtype25GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE25 >=", value, "orgtype25");
            return (Criteria) this;
        }

        public Criteria andOrgtype25LessThan(String value) {
            addCriterion("ORGTYPE25 <", value, "orgtype25");
            return (Criteria) this;
        }

        public Criteria andOrgtype25LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE25 <=", value, "orgtype25");
            return (Criteria) this;
        }

        public Criteria andOrgtype25Like(String value) {
            addCriterion("ORGTYPE25 like", value, "orgtype25");
            return (Criteria) this;
        }

        public Criteria andOrgtype25NotLike(String value) {
            addCriterion("ORGTYPE25 not like", value, "orgtype25");
            return (Criteria) this;
        }

        public Criteria andOrgtype25In(List<String> values) {
            addCriterion("ORGTYPE25 in", values, "orgtype25");
            return (Criteria) this;
        }

        public Criteria andOrgtype25NotIn(List<String> values) {
            addCriterion("ORGTYPE25 not in", values, "orgtype25");
            return (Criteria) this;
        }

        public Criteria andOrgtype25Between(String value1, String value2) {
            addCriterion("ORGTYPE25 between", value1, value2, "orgtype25");
            return (Criteria) this;
        }

        public Criteria andOrgtype25NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE25 not between", value1, value2, "orgtype25");
            return (Criteria) this;
        }

        public Criteria andOrgtype26IsNull() {
            addCriterion("ORGTYPE26 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype26IsNotNull() {
            addCriterion("ORGTYPE26 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype26EqualTo(String value) {
            addCriterion("ORGTYPE26 =", value, "orgtype26");
            return (Criteria) this;
        }

        public Criteria andOrgtype26NotEqualTo(String value) {
            addCriterion("ORGTYPE26 <>", value, "orgtype26");
            return (Criteria) this;
        }

        public Criteria andOrgtype26GreaterThan(String value) {
            addCriterion("ORGTYPE26 >", value, "orgtype26");
            return (Criteria) this;
        }

        public Criteria andOrgtype26GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE26 >=", value, "orgtype26");
            return (Criteria) this;
        }

        public Criteria andOrgtype26LessThan(String value) {
            addCriterion("ORGTYPE26 <", value, "orgtype26");
            return (Criteria) this;
        }

        public Criteria andOrgtype26LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE26 <=", value, "orgtype26");
            return (Criteria) this;
        }

        public Criteria andOrgtype26Like(String value) {
            addCriterion("ORGTYPE26 like", value, "orgtype26");
            return (Criteria) this;
        }

        public Criteria andOrgtype26NotLike(String value) {
            addCriterion("ORGTYPE26 not like", value, "orgtype26");
            return (Criteria) this;
        }

        public Criteria andOrgtype26In(List<String> values) {
            addCriterion("ORGTYPE26 in", values, "orgtype26");
            return (Criteria) this;
        }

        public Criteria andOrgtype26NotIn(List<String> values) {
            addCriterion("ORGTYPE26 not in", values, "orgtype26");
            return (Criteria) this;
        }

        public Criteria andOrgtype26Between(String value1, String value2) {
            addCriterion("ORGTYPE26 between", value1, value2, "orgtype26");
            return (Criteria) this;
        }

        public Criteria andOrgtype26NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE26 not between", value1, value2, "orgtype26");
            return (Criteria) this;
        }

        public Criteria andOrgtype27IsNull() {
            addCriterion("ORGTYPE27 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype27IsNotNull() {
            addCriterion("ORGTYPE27 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype27EqualTo(String value) {
            addCriterion("ORGTYPE27 =", value, "orgtype27");
            return (Criteria) this;
        }

        public Criteria andOrgtype27NotEqualTo(String value) {
            addCriterion("ORGTYPE27 <>", value, "orgtype27");
            return (Criteria) this;
        }

        public Criteria andOrgtype27GreaterThan(String value) {
            addCriterion("ORGTYPE27 >", value, "orgtype27");
            return (Criteria) this;
        }

        public Criteria andOrgtype27GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE27 >=", value, "orgtype27");
            return (Criteria) this;
        }

        public Criteria andOrgtype27LessThan(String value) {
            addCriterion("ORGTYPE27 <", value, "orgtype27");
            return (Criteria) this;
        }

        public Criteria andOrgtype27LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE27 <=", value, "orgtype27");
            return (Criteria) this;
        }

        public Criteria andOrgtype27Like(String value) {
            addCriterion("ORGTYPE27 like", value, "orgtype27");
            return (Criteria) this;
        }

        public Criteria andOrgtype27NotLike(String value) {
            addCriterion("ORGTYPE27 not like", value, "orgtype27");
            return (Criteria) this;
        }

        public Criteria andOrgtype27In(List<String> values) {
            addCriterion("ORGTYPE27 in", values, "orgtype27");
            return (Criteria) this;
        }

        public Criteria andOrgtype27NotIn(List<String> values) {
            addCriterion("ORGTYPE27 not in", values, "orgtype27");
            return (Criteria) this;
        }

        public Criteria andOrgtype27Between(String value1, String value2) {
            addCriterion("ORGTYPE27 between", value1, value2, "orgtype27");
            return (Criteria) this;
        }

        public Criteria andOrgtype27NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE27 not between", value1, value2, "orgtype27");
            return (Criteria) this;
        }

        public Criteria andOrgtype28IsNull() {
            addCriterion("ORGTYPE28 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype28IsNotNull() {
            addCriterion("ORGTYPE28 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype28EqualTo(String value) {
            addCriterion("ORGTYPE28 =", value, "orgtype28");
            return (Criteria) this;
        }

        public Criteria andOrgtype28NotEqualTo(String value) {
            addCriterion("ORGTYPE28 <>", value, "orgtype28");
            return (Criteria) this;
        }

        public Criteria andOrgtype28GreaterThan(String value) {
            addCriterion("ORGTYPE28 >", value, "orgtype28");
            return (Criteria) this;
        }

        public Criteria andOrgtype28GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE28 >=", value, "orgtype28");
            return (Criteria) this;
        }

        public Criteria andOrgtype28LessThan(String value) {
            addCriterion("ORGTYPE28 <", value, "orgtype28");
            return (Criteria) this;
        }

        public Criteria andOrgtype28LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE28 <=", value, "orgtype28");
            return (Criteria) this;
        }

        public Criteria andOrgtype28Like(String value) {
            addCriterion("ORGTYPE28 like", value, "orgtype28");
            return (Criteria) this;
        }

        public Criteria andOrgtype28NotLike(String value) {
            addCriterion("ORGTYPE28 not like", value, "orgtype28");
            return (Criteria) this;
        }

        public Criteria andOrgtype28In(List<String> values) {
            addCriterion("ORGTYPE28 in", values, "orgtype28");
            return (Criteria) this;
        }

        public Criteria andOrgtype28NotIn(List<String> values) {
            addCriterion("ORGTYPE28 not in", values, "orgtype28");
            return (Criteria) this;
        }

        public Criteria andOrgtype28Between(String value1, String value2) {
            addCriterion("ORGTYPE28 between", value1, value2, "orgtype28");
            return (Criteria) this;
        }

        public Criteria andOrgtype28NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE28 not between", value1, value2, "orgtype28");
            return (Criteria) this;
        }

        public Criteria andOrgtype29IsNull() {
            addCriterion("ORGTYPE29 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype29IsNotNull() {
            addCriterion("ORGTYPE29 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype29EqualTo(String value) {
            addCriterion("ORGTYPE29 =", value, "orgtype29");
            return (Criteria) this;
        }

        public Criteria andOrgtype29NotEqualTo(String value) {
            addCriterion("ORGTYPE29 <>", value, "orgtype29");
            return (Criteria) this;
        }

        public Criteria andOrgtype29GreaterThan(String value) {
            addCriterion("ORGTYPE29 >", value, "orgtype29");
            return (Criteria) this;
        }

        public Criteria andOrgtype29GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE29 >=", value, "orgtype29");
            return (Criteria) this;
        }

        public Criteria andOrgtype29LessThan(String value) {
            addCriterion("ORGTYPE29 <", value, "orgtype29");
            return (Criteria) this;
        }

        public Criteria andOrgtype29LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE29 <=", value, "orgtype29");
            return (Criteria) this;
        }

        public Criteria andOrgtype29Like(String value) {
            addCriterion("ORGTYPE29 like", value, "orgtype29");
            return (Criteria) this;
        }

        public Criteria andOrgtype29NotLike(String value) {
            addCriterion("ORGTYPE29 not like", value, "orgtype29");
            return (Criteria) this;
        }

        public Criteria andOrgtype29In(List<String> values) {
            addCriterion("ORGTYPE29 in", values, "orgtype29");
            return (Criteria) this;
        }

        public Criteria andOrgtype29NotIn(List<String> values) {
            addCriterion("ORGTYPE29 not in", values, "orgtype29");
            return (Criteria) this;
        }

        public Criteria andOrgtype29Between(String value1, String value2) {
            addCriterion("ORGTYPE29 between", value1, value2, "orgtype29");
            return (Criteria) this;
        }

        public Criteria andOrgtype29NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE29 not between", value1, value2, "orgtype29");
            return (Criteria) this;
        }

        public Criteria andOrgtype3IsNull() {
            addCriterion("ORGTYPE3 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype3IsNotNull() {
            addCriterion("ORGTYPE3 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype3EqualTo(String value) {
            addCriterion("ORGTYPE3 =", value, "orgtype3");
            return (Criteria) this;
        }

        public Criteria andOrgtype3NotEqualTo(String value) {
            addCriterion("ORGTYPE3 <>", value, "orgtype3");
            return (Criteria) this;
        }

        public Criteria andOrgtype3GreaterThan(String value) {
            addCriterion("ORGTYPE3 >", value, "orgtype3");
            return (Criteria) this;
        }

        public Criteria andOrgtype3GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE3 >=", value, "orgtype3");
            return (Criteria) this;
        }

        public Criteria andOrgtype3LessThan(String value) {
            addCriterion("ORGTYPE3 <", value, "orgtype3");
            return (Criteria) this;
        }

        public Criteria andOrgtype3LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE3 <=", value, "orgtype3");
            return (Criteria) this;
        }

        public Criteria andOrgtype3Like(String value) {
            addCriterion("ORGTYPE3 like", value, "orgtype3");
            return (Criteria) this;
        }

        public Criteria andOrgtype3NotLike(String value) {
            addCriterion("ORGTYPE3 not like", value, "orgtype3");
            return (Criteria) this;
        }

        public Criteria andOrgtype3In(List<String> values) {
            addCriterion("ORGTYPE3 in", values, "orgtype3");
            return (Criteria) this;
        }

        public Criteria andOrgtype3NotIn(List<String> values) {
            addCriterion("ORGTYPE3 not in", values, "orgtype3");
            return (Criteria) this;
        }

        public Criteria andOrgtype3Between(String value1, String value2) {
            addCriterion("ORGTYPE3 between", value1, value2, "orgtype3");
            return (Criteria) this;
        }

        public Criteria andOrgtype3NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE3 not between", value1, value2, "orgtype3");
            return (Criteria) this;
        }

        public Criteria andOrgtype30IsNull() {
            addCriterion("ORGTYPE30 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype30IsNotNull() {
            addCriterion("ORGTYPE30 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype30EqualTo(String value) {
            addCriterion("ORGTYPE30 =", value, "orgtype30");
            return (Criteria) this;
        }

        public Criteria andOrgtype30NotEqualTo(String value) {
            addCriterion("ORGTYPE30 <>", value, "orgtype30");
            return (Criteria) this;
        }

        public Criteria andOrgtype30GreaterThan(String value) {
            addCriterion("ORGTYPE30 >", value, "orgtype30");
            return (Criteria) this;
        }

        public Criteria andOrgtype30GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE30 >=", value, "orgtype30");
            return (Criteria) this;
        }

        public Criteria andOrgtype30LessThan(String value) {
            addCriterion("ORGTYPE30 <", value, "orgtype30");
            return (Criteria) this;
        }

        public Criteria andOrgtype30LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE30 <=", value, "orgtype30");
            return (Criteria) this;
        }

        public Criteria andOrgtype30Like(String value) {
            addCriterion("ORGTYPE30 like", value, "orgtype30");
            return (Criteria) this;
        }

        public Criteria andOrgtype30NotLike(String value) {
            addCriterion("ORGTYPE30 not like", value, "orgtype30");
            return (Criteria) this;
        }

        public Criteria andOrgtype30In(List<String> values) {
            addCriterion("ORGTYPE30 in", values, "orgtype30");
            return (Criteria) this;
        }

        public Criteria andOrgtype30NotIn(List<String> values) {
            addCriterion("ORGTYPE30 not in", values, "orgtype30");
            return (Criteria) this;
        }

        public Criteria andOrgtype30Between(String value1, String value2) {
            addCriterion("ORGTYPE30 between", value1, value2, "orgtype30");
            return (Criteria) this;
        }

        public Criteria andOrgtype30NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE30 not between", value1, value2, "orgtype30");
            return (Criteria) this;
        }

        public Criteria andOrgtype31IsNull() {
            addCriterion("ORGTYPE31 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype31IsNotNull() {
            addCriterion("ORGTYPE31 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype31EqualTo(String value) {
            addCriterion("ORGTYPE31 =", value, "orgtype31");
            return (Criteria) this;
        }

        public Criteria andOrgtype31NotEqualTo(String value) {
            addCriterion("ORGTYPE31 <>", value, "orgtype31");
            return (Criteria) this;
        }

        public Criteria andOrgtype31GreaterThan(String value) {
            addCriterion("ORGTYPE31 >", value, "orgtype31");
            return (Criteria) this;
        }

        public Criteria andOrgtype31GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE31 >=", value, "orgtype31");
            return (Criteria) this;
        }

        public Criteria andOrgtype31LessThan(String value) {
            addCriterion("ORGTYPE31 <", value, "orgtype31");
            return (Criteria) this;
        }

        public Criteria andOrgtype31LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE31 <=", value, "orgtype31");
            return (Criteria) this;
        }

        public Criteria andOrgtype31Like(String value) {
            addCriterion("ORGTYPE31 like", value, "orgtype31");
            return (Criteria) this;
        }

        public Criteria andOrgtype31NotLike(String value) {
            addCriterion("ORGTYPE31 not like", value, "orgtype31");
            return (Criteria) this;
        }

        public Criteria andOrgtype31In(List<String> values) {
            addCriterion("ORGTYPE31 in", values, "orgtype31");
            return (Criteria) this;
        }

        public Criteria andOrgtype31NotIn(List<String> values) {
            addCriterion("ORGTYPE31 not in", values, "orgtype31");
            return (Criteria) this;
        }

        public Criteria andOrgtype31Between(String value1, String value2) {
            addCriterion("ORGTYPE31 between", value1, value2, "orgtype31");
            return (Criteria) this;
        }

        public Criteria andOrgtype31NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE31 not between", value1, value2, "orgtype31");
            return (Criteria) this;
        }

        public Criteria andOrgtype32IsNull() {
            addCriterion("ORGTYPE32 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype32IsNotNull() {
            addCriterion("ORGTYPE32 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype32EqualTo(String value) {
            addCriterion("ORGTYPE32 =", value, "orgtype32");
            return (Criteria) this;
        }

        public Criteria andOrgtype32NotEqualTo(String value) {
            addCriterion("ORGTYPE32 <>", value, "orgtype32");
            return (Criteria) this;
        }

        public Criteria andOrgtype32GreaterThan(String value) {
            addCriterion("ORGTYPE32 >", value, "orgtype32");
            return (Criteria) this;
        }

        public Criteria andOrgtype32GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE32 >=", value, "orgtype32");
            return (Criteria) this;
        }

        public Criteria andOrgtype32LessThan(String value) {
            addCriterion("ORGTYPE32 <", value, "orgtype32");
            return (Criteria) this;
        }

        public Criteria andOrgtype32LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE32 <=", value, "orgtype32");
            return (Criteria) this;
        }

        public Criteria andOrgtype32Like(String value) {
            addCriterion("ORGTYPE32 like", value, "orgtype32");
            return (Criteria) this;
        }

        public Criteria andOrgtype32NotLike(String value) {
            addCriterion("ORGTYPE32 not like", value, "orgtype32");
            return (Criteria) this;
        }

        public Criteria andOrgtype32In(List<String> values) {
            addCriterion("ORGTYPE32 in", values, "orgtype32");
            return (Criteria) this;
        }

        public Criteria andOrgtype32NotIn(List<String> values) {
            addCriterion("ORGTYPE32 not in", values, "orgtype32");
            return (Criteria) this;
        }

        public Criteria andOrgtype32Between(String value1, String value2) {
            addCriterion("ORGTYPE32 between", value1, value2, "orgtype32");
            return (Criteria) this;
        }

        public Criteria andOrgtype32NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE32 not between", value1, value2, "orgtype32");
            return (Criteria) this;
        }

        public Criteria andOrgtype33IsNull() {
            addCriterion("ORGTYPE33 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype33IsNotNull() {
            addCriterion("ORGTYPE33 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype33EqualTo(String value) {
            addCriterion("ORGTYPE33 =", value, "orgtype33");
            return (Criteria) this;
        }

        public Criteria andOrgtype33NotEqualTo(String value) {
            addCriterion("ORGTYPE33 <>", value, "orgtype33");
            return (Criteria) this;
        }

        public Criteria andOrgtype33GreaterThan(String value) {
            addCriterion("ORGTYPE33 >", value, "orgtype33");
            return (Criteria) this;
        }

        public Criteria andOrgtype33GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE33 >=", value, "orgtype33");
            return (Criteria) this;
        }

        public Criteria andOrgtype33LessThan(String value) {
            addCriterion("ORGTYPE33 <", value, "orgtype33");
            return (Criteria) this;
        }

        public Criteria andOrgtype33LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE33 <=", value, "orgtype33");
            return (Criteria) this;
        }

        public Criteria andOrgtype33Like(String value) {
            addCriterion("ORGTYPE33 like", value, "orgtype33");
            return (Criteria) this;
        }

        public Criteria andOrgtype33NotLike(String value) {
            addCriterion("ORGTYPE33 not like", value, "orgtype33");
            return (Criteria) this;
        }

        public Criteria andOrgtype33In(List<String> values) {
            addCriterion("ORGTYPE33 in", values, "orgtype33");
            return (Criteria) this;
        }

        public Criteria andOrgtype33NotIn(List<String> values) {
            addCriterion("ORGTYPE33 not in", values, "orgtype33");
            return (Criteria) this;
        }

        public Criteria andOrgtype33Between(String value1, String value2) {
            addCriterion("ORGTYPE33 between", value1, value2, "orgtype33");
            return (Criteria) this;
        }

        public Criteria andOrgtype33NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE33 not between", value1, value2, "orgtype33");
            return (Criteria) this;
        }

        public Criteria andOrgtype34IsNull() {
            addCriterion("ORGTYPE34 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype34IsNotNull() {
            addCriterion("ORGTYPE34 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype34EqualTo(String value) {
            addCriterion("ORGTYPE34 =", value, "orgtype34");
            return (Criteria) this;
        }

        public Criteria andOrgtype34NotEqualTo(String value) {
            addCriterion("ORGTYPE34 <>", value, "orgtype34");
            return (Criteria) this;
        }

        public Criteria andOrgtype34GreaterThan(String value) {
            addCriterion("ORGTYPE34 >", value, "orgtype34");
            return (Criteria) this;
        }

        public Criteria andOrgtype34GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE34 >=", value, "orgtype34");
            return (Criteria) this;
        }

        public Criteria andOrgtype34LessThan(String value) {
            addCriterion("ORGTYPE34 <", value, "orgtype34");
            return (Criteria) this;
        }

        public Criteria andOrgtype34LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE34 <=", value, "orgtype34");
            return (Criteria) this;
        }

        public Criteria andOrgtype34Like(String value) {
            addCriterion("ORGTYPE34 like", value, "orgtype34");
            return (Criteria) this;
        }

        public Criteria andOrgtype34NotLike(String value) {
            addCriterion("ORGTYPE34 not like", value, "orgtype34");
            return (Criteria) this;
        }

        public Criteria andOrgtype34In(List<String> values) {
            addCriterion("ORGTYPE34 in", values, "orgtype34");
            return (Criteria) this;
        }

        public Criteria andOrgtype34NotIn(List<String> values) {
            addCriterion("ORGTYPE34 not in", values, "orgtype34");
            return (Criteria) this;
        }

        public Criteria andOrgtype34Between(String value1, String value2) {
            addCriterion("ORGTYPE34 between", value1, value2, "orgtype34");
            return (Criteria) this;
        }

        public Criteria andOrgtype34NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE34 not between", value1, value2, "orgtype34");
            return (Criteria) this;
        }

        public Criteria andOrgtype35IsNull() {
            addCriterion("ORGTYPE35 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype35IsNotNull() {
            addCriterion("ORGTYPE35 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype35EqualTo(String value) {
            addCriterion("ORGTYPE35 =", value, "orgtype35");
            return (Criteria) this;
        }

        public Criteria andOrgtype35NotEqualTo(String value) {
            addCriterion("ORGTYPE35 <>", value, "orgtype35");
            return (Criteria) this;
        }

        public Criteria andOrgtype35GreaterThan(String value) {
            addCriterion("ORGTYPE35 >", value, "orgtype35");
            return (Criteria) this;
        }

        public Criteria andOrgtype35GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE35 >=", value, "orgtype35");
            return (Criteria) this;
        }

        public Criteria andOrgtype35LessThan(String value) {
            addCriterion("ORGTYPE35 <", value, "orgtype35");
            return (Criteria) this;
        }

        public Criteria andOrgtype35LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE35 <=", value, "orgtype35");
            return (Criteria) this;
        }

        public Criteria andOrgtype35Like(String value) {
            addCriterion("ORGTYPE35 like", value, "orgtype35");
            return (Criteria) this;
        }

        public Criteria andOrgtype35NotLike(String value) {
            addCriterion("ORGTYPE35 not like", value, "orgtype35");
            return (Criteria) this;
        }

        public Criteria andOrgtype35In(List<String> values) {
            addCriterion("ORGTYPE35 in", values, "orgtype35");
            return (Criteria) this;
        }

        public Criteria andOrgtype35NotIn(List<String> values) {
            addCriterion("ORGTYPE35 not in", values, "orgtype35");
            return (Criteria) this;
        }

        public Criteria andOrgtype35Between(String value1, String value2) {
            addCriterion("ORGTYPE35 between", value1, value2, "orgtype35");
            return (Criteria) this;
        }

        public Criteria andOrgtype35NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE35 not between", value1, value2, "orgtype35");
            return (Criteria) this;
        }

        public Criteria andOrgtype36IsNull() {
            addCriterion("ORGTYPE36 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype36IsNotNull() {
            addCriterion("ORGTYPE36 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype36EqualTo(String value) {
            addCriterion("ORGTYPE36 =", value, "orgtype36");
            return (Criteria) this;
        }

        public Criteria andOrgtype36NotEqualTo(String value) {
            addCriterion("ORGTYPE36 <>", value, "orgtype36");
            return (Criteria) this;
        }

        public Criteria andOrgtype36GreaterThan(String value) {
            addCriterion("ORGTYPE36 >", value, "orgtype36");
            return (Criteria) this;
        }

        public Criteria andOrgtype36GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE36 >=", value, "orgtype36");
            return (Criteria) this;
        }

        public Criteria andOrgtype36LessThan(String value) {
            addCriterion("ORGTYPE36 <", value, "orgtype36");
            return (Criteria) this;
        }

        public Criteria andOrgtype36LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE36 <=", value, "orgtype36");
            return (Criteria) this;
        }

        public Criteria andOrgtype36Like(String value) {
            addCriterion("ORGTYPE36 like", value, "orgtype36");
            return (Criteria) this;
        }

        public Criteria andOrgtype36NotLike(String value) {
            addCriterion("ORGTYPE36 not like", value, "orgtype36");
            return (Criteria) this;
        }

        public Criteria andOrgtype36In(List<String> values) {
            addCriterion("ORGTYPE36 in", values, "orgtype36");
            return (Criteria) this;
        }

        public Criteria andOrgtype36NotIn(List<String> values) {
            addCriterion("ORGTYPE36 not in", values, "orgtype36");
            return (Criteria) this;
        }

        public Criteria andOrgtype36Between(String value1, String value2) {
            addCriterion("ORGTYPE36 between", value1, value2, "orgtype36");
            return (Criteria) this;
        }

        public Criteria andOrgtype36NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE36 not between", value1, value2, "orgtype36");
            return (Criteria) this;
        }

        public Criteria andOrgtype37IsNull() {
            addCriterion("ORGTYPE37 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype37IsNotNull() {
            addCriterion("ORGTYPE37 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype37EqualTo(String value) {
            addCriterion("ORGTYPE37 =", value, "orgtype37");
            return (Criteria) this;
        }

        public Criteria andOrgtype37NotEqualTo(String value) {
            addCriterion("ORGTYPE37 <>", value, "orgtype37");
            return (Criteria) this;
        }

        public Criteria andOrgtype37GreaterThan(String value) {
            addCriterion("ORGTYPE37 >", value, "orgtype37");
            return (Criteria) this;
        }

        public Criteria andOrgtype37GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE37 >=", value, "orgtype37");
            return (Criteria) this;
        }

        public Criteria andOrgtype37LessThan(String value) {
            addCriterion("ORGTYPE37 <", value, "orgtype37");
            return (Criteria) this;
        }

        public Criteria andOrgtype37LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE37 <=", value, "orgtype37");
            return (Criteria) this;
        }

        public Criteria andOrgtype37Like(String value) {
            addCriterion("ORGTYPE37 like", value, "orgtype37");
            return (Criteria) this;
        }

        public Criteria andOrgtype37NotLike(String value) {
            addCriterion("ORGTYPE37 not like", value, "orgtype37");
            return (Criteria) this;
        }

        public Criteria andOrgtype37In(List<String> values) {
            addCriterion("ORGTYPE37 in", values, "orgtype37");
            return (Criteria) this;
        }

        public Criteria andOrgtype37NotIn(List<String> values) {
            addCriterion("ORGTYPE37 not in", values, "orgtype37");
            return (Criteria) this;
        }

        public Criteria andOrgtype37Between(String value1, String value2) {
            addCriterion("ORGTYPE37 between", value1, value2, "orgtype37");
            return (Criteria) this;
        }

        public Criteria andOrgtype37NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE37 not between", value1, value2, "orgtype37");
            return (Criteria) this;
        }

        public Criteria andOrgtype38IsNull() {
            addCriterion("ORGTYPE38 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype38IsNotNull() {
            addCriterion("ORGTYPE38 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype38EqualTo(String value) {
            addCriterion("ORGTYPE38 =", value, "orgtype38");
            return (Criteria) this;
        }

        public Criteria andOrgtype38NotEqualTo(String value) {
            addCriterion("ORGTYPE38 <>", value, "orgtype38");
            return (Criteria) this;
        }

        public Criteria andOrgtype38GreaterThan(String value) {
            addCriterion("ORGTYPE38 >", value, "orgtype38");
            return (Criteria) this;
        }

        public Criteria andOrgtype38GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE38 >=", value, "orgtype38");
            return (Criteria) this;
        }

        public Criteria andOrgtype38LessThan(String value) {
            addCriterion("ORGTYPE38 <", value, "orgtype38");
            return (Criteria) this;
        }

        public Criteria andOrgtype38LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE38 <=", value, "orgtype38");
            return (Criteria) this;
        }

        public Criteria andOrgtype38Like(String value) {
            addCriterion("ORGTYPE38 like", value, "orgtype38");
            return (Criteria) this;
        }

        public Criteria andOrgtype38NotLike(String value) {
            addCriterion("ORGTYPE38 not like", value, "orgtype38");
            return (Criteria) this;
        }

        public Criteria andOrgtype38In(List<String> values) {
            addCriterion("ORGTYPE38 in", values, "orgtype38");
            return (Criteria) this;
        }

        public Criteria andOrgtype38NotIn(List<String> values) {
            addCriterion("ORGTYPE38 not in", values, "orgtype38");
            return (Criteria) this;
        }

        public Criteria andOrgtype38Between(String value1, String value2) {
            addCriterion("ORGTYPE38 between", value1, value2, "orgtype38");
            return (Criteria) this;
        }

        public Criteria andOrgtype38NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE38 not between", value1, value2, "orgtype38");
            return (Criteria) this;
        }

        public Criteria andOrgtype39IsNull() {
            addCriterion("ORGTYPE39 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype39IsNotNull() {
            addCriterion("ORGTYPE39 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype39EqualTo(String value) {
            addCriterion("ORGTYPE39 =", value, "orgtype39");
            return (Criteria) this;
        }

        public Criteria andOrgtype39NotEqualTo(String value) {
            addCriterion("ORGTYPE39 <>", value, "orgtype39");
            return (Criteria) this;
        }

        public Criteria andOrgtype39GreaterThan(String value) {
            addCriterion("ORGTYPE39 >", value, "orgtype39");
            return (Criteria) this;
        }

        public Criteria andOrgtype39GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE39 >=", value, "orgtype39");
            return (Criteria) this;
        }

        public Criteria andOrgtype39LessThan(String value) {
            addCriterion("ORGTYPE39 <", value, "orgtype39");
            return (Criteria) this;
        }

        public Criteria andOrgtype39LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE39 <=", value, "orgtype39");
            return (Criteria) this;
        }

        public Criteria andOrgtype39Like(String value) {
            addCriterion("ORGTYPE39 like", value, "orgtype39");
            return (Criteria) this;
        }

        public Criteria andOrgtype39NotLike(String value) {
            addCriterion("ORGTYPE39 not like", value, "orgtype39");
            return (Criteria) this;
        }

        public Criteria andOrgtype39In(List<String> values) {
            addCriterion("ORGTYPE39 in", values, "orgtype39");
            return (Criteria) this;
        }

        public Criteria andOrgtype39NotIn(List<String> values) {
            addCriterion("ORGTYPE39 not in", values, "orgtype39");
            return (Criteria) this;
        }

        public Criteria andOrgtype39Between(String value1, String value2) {
            addCriterion("ORGTYPE39 between", value1, value2, "orgtype39");
            return (Criteria) this;
        }

        public Criteria andOrgtype39NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE39 not between", value1, value2, "orgtype39");
            return (Criteria) this;
        }

        public Criteria andOrgtype4IsNull() {
            addCriterion("ORGTYPE4 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype4IsNotNull() {
            addCriterion("ORGTYPE4 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype4EqualTo(String value) {
            addCriterion("ORGTYPE4 =", value, "orgtype4");
            return (Criteria) this;
        }

        public Criteria andOrgtype4NotEqualTo(String value) {
            addCriterion("ORGTYPE4 <>", value, "orgtype4");
            return (Criteria) this;
        }

        public Criteria andOrgtype4GreaterThan(String value) {
            addCriterion("ORGTYPE4 >", value, "orgtype4");
            return (Criteria) this;
        }

        public Criteria andOrgtype4GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE4 >=", value, "orgtype4");
            return (Criteria) this;
        }

        public Criteria andOrgtype4LessThan(String value) {
            addCriterion("ORGTYPE4 <", value, "orgtype4");
            return (Criteria) this;
        }

        public Criteria andOrgtype4LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE4 <=", value, "orgtype4");
            return (Criteria) this;
        }

        public Criteria andOrgtype4Like(String value) {
            addCriterion("ORGTYPE4 like", value, "orgtype4");
            return (Criteria) this;
        }

        public Criteria andOrgtype4NotLike(String value) {
            addCriterion("ORGTYPE4 not like", value, "orgtype4");
            return (Criteria) this;
        }

        public Criteria andOrgtype4In(List<String> values) {
            addCriterion("ORGTYPE4 in", values, "orgtype4");
            return (Criteria) this;
        }

        public Criteria andOrgtype4NotIn(List<String> values) {
            addCriterion("ORGTYPE4 not in", values, "orgtype4");
            return (Criteria) this;
        }

        public Criteria andOrgtype4Between(String value1, String value2) {
            addCriterion("ORGTYPE4 between", value1, value2, "orgtype4");
            return (Criteria) this;
        }

        public Criteria andOrgtype4NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE4 not between", value1, value2, "orgtype4");
            return (Criteria) this;
        }

        public Criteria andOrgtype40IsNull() {
            addCriterion("ORGTYPE40 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype40IsNotNull() {
            addCriterion("ORGTYPE40 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype40EqualTo(String value) {
            addCriterion("ORGTYPE40 =", value, "orgtype40");
            return (Criteria) this;
        }

        public Criteria andOrgtype40NotEqualTo(String value) {
            addCriterion("ORGTYPE40 <>", value, "orgtype40");
            return (Criteria) this;
        }

        public Criteria andOrgtype40GreaterThan(String value) {
            addCriterion("ORGTYPE40 >", value, "orgtype40");
            return (Criteria) this;
        }

        public Criteria andOrgtype40GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE40 >=", value, "orgtype40");
            return (Criteria) this;
        }

        public Criteria andOrgtype40LessThan(String value) {
            addCriterion("ORGTYPE40 <", value, "orgtype40");
            return (Criteria) this;
        }

        public Criteria andOrgtype40LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE40 <=", value, "orgtype40");
            return (Criteria) this;
        }

        public Criteria andOrgtype40Like(String value) {
            addCriterion("ORGTYPE40 like", value, "orgtype40");
            return (Criteria) this;
        }

        public Criteria andOrgtype40NotLike(String value) {
            addCriterion("ORGTYPE40 not like", value, "orgtype40");
            return (Criteria) this;
        }

        public Criteria andOrgtype40In(List<String> values) {
            addCriterion("ORGTYPE40 in", values, "orgtype40");
            return (Criteria) this;
        }

        public Criteria andOrgtype40NotIn(List<String> values) {
            addCriterion("ORGTYPE40 not in", values, "orgtype40");
            return (Criteria) this;
        }

        public Criteria andOrgtype40Between(String value1, String value2) {
            addCriterion("ORGTYPE40 between", value1, value2, "orgtype40");
            return (Criteria) this;
        }

        public Criteria andOrgtype40NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE40 not between", value1, value2, "orgtype40");
            return (Criteria) this;
        }

        public Criteria andOrgtype41IsNull() {
            addCriterion("ORGTYPE41 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype41IsNotNull() {
            addCriterion("ORGTYPE41 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype41EqualTo(String value) {
            addCriterion("ORGTYPE41 =", value, "orgtype41");
            return (Criteria) this;
        }

        public Criteria andOrgtype41NotEqualTo(String value) {
            addCriterion("ORGTYPE41 <>", value, "orgtype41");
            return (Criteria) this;
        }

        public Criteria andOrgtype41GreaterThan(String value) {
            addCriterion("ORGTYPE41 >", value, "orgtype41");
            return (Criteria) this;
        }

        public Criteria andOrgtype41GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE41 >=", value, "orgtype41");
            return (Criteria) this;
        }

        public Criteria andOrgtype41LessThan(String value) {
            addCriterion("ORGTYPE41 <", value, "orgtype41");
            return (Criteria) this;
        }

        public Criteria andOrgtype41LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE41 <=", value, "orgtype41");
            return (Criteria) this;
        }

        public Criteria andOrgtype41Like(String value) {
            addCriterion("ORGTYPE41 like", value, "orgtype41");
            return (Criteria) this;
        }

        public Criteria andOrgtype41NotLike(String value) {
            addCriterion("ORGTYPE41 not like", value, "orgtype41");
            return (Criteria) this;
        }

        public Criteria andOrgtype41In(List<String> values) {
            addCriterion("ORGTYPE41 in", values, "orgtype41");
            return (Criteria) this;
        }

        public Criteria andOrgtype41NotIn(List<String> values) {
            addCriterion("ORGTYPE41 not in", values, "orgtype41");
            return (Criteria) this;
        }

        public Criteria andOrgtype41Between(String value1, String value2) {
            addCriterion("ORGTYPE41 between", value1, value2, "orgtype41");
            return (Criteria) this;
        }

        public Criteria andOrgtype41NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE41 not between", value1, value2, "orgtype41");
            return (Criteria) this;
        }

        public Criteria andOrgtype42IsNull() {
            addCriterion("ORGTYPE42 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype42IsNotNull() {
            addCriterion("ORGTYPE42 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype42EqualTo(String value) {
            addCriterion("ORGTYPE42 =", value, "orgtype42");
            return (Criteria) this;
        }

        public Criteria andOrgtype42NotEqualTo(String value) {
            addCriterion("ORGTYPE42 <>", value, "orgtype42");
            return (Criteria) this;
        }

        public Criteria andOrgtype42GreaterThan(String value) {
            addCriterion("ORGTYPE42 >", value, "orgtype42");
            return (Criteria) this;
        }

        public Criteria andOrgtype42GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE42 >=", value, "orgtype42");
            return (Criteria) this;
        }

        public Criteria andOrgtype42LessThan(String value) {
            addCriterion("ORGTYPE42 <", value, "orgtype42");
            return (Criteria) this;
        }

        public Criteria andOrgtype42LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE42 <=", value, "orgtype42");
            return (Criteria) this;
        }

        public Criteria andOrgtype42Like(String value) {
            addCriterion("ORGTYPE42 like", value, "orgtype42");
            return (Criteria) this;
        }

        public Criteria andOrgtype42NotLike(String value) {
            addCriterion("ORGTYPE42 not like", value, "orgtype42");
            return (Criteria) this;
        }

        public Criteria andOrgtype42In(List<String> values) {
            addCriterion("ORGTYPE42 in", values, "orgtype42");
            return (Criteria) this;
        }

        public Criteria andOrgtype42NotIn(List<String> values) {
            addCriterion("ORGTYPE42 not in", values, "orgtype42");
            return (Criteria) this;
        }

        public Criteria andOrgtype42Between(String value1, String value2) {
            addCriterion("ORGTYPE42 between", value1, value2, "orgtype42");
            return (Criteria) this;
        }

        public Criteria andOrgtype42NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE42 not between", value1, value2, "orgtype42");
            return (Criteria) this;
        }

        public Criteria andOrgtype43IsNull() {
            addCriterion("ORGTYPE43 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype43IsNotNull() {
            addCriterion("ORGTYPE43 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype43EqualTo(String value) {
            addCriterion("ORGTYPE43 =", value, "orgtype43");
            return (Criteria) this;
        }

        public Criteria andOrgtype43NotEqualTo(String value) {
            addCriterion("ORGTYPE43 <>", value, "orgtype43");
            return (Criteria) this;
        }

        public Criteria andOrgtype43GreaterThan(String value) {
            addCriterion("ORGTYPE43 >", value, "orgtype43");
            return (Criteria) this;
        }

        public Criteria andOrgtype43GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE43 >=", value, "orgtype43");
            return (Criteria) this;
        }

        public Criteria andOrgtype43LessThan(String value) {
            addCriterion("ORGTYPE43 <", value, "orgtype43");
            return (Criteria) this;
        }

        public Criteria andOrgtype43LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE43 <=", value, "orgtype43");
            return (Criteria) this;
        }

        public Criteria andOrgtype43Like(String value) {
            addCriterion("ORGTYPE43 like", value, "orgtype43");
            return (Criteria) this;
        }

        public Criteria andOrgtype43NotLike(String value) {
            addCriterion("ORGTYPE43 not like", value, "orgtype43");
            return (Criteria) this;
        }

        public Criteria andOrgtype43In(List<String> values) {
            addCriterion("ORGTYPE43 in", values, "orgtype43");
            return (Criteria) this;
        }

        public Criteria andOrgtype43NotIn(List<String> values) {
            addCriterion("ORGTYPE43 not in", values, "orgtype43");
            return (Criteria) this;
        }

        public Criteria andOrgtype43Between(String value1, String value2) {
            addCriterion("ORGTYPE43 between", value1, value2, "orgtype43");
            return (Criteria) this;
        }

        public Criteria andOrgtype43NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE43 not between", value1, value2, "orgtype43");
            return (Criteria) this;
        }

        public Criteria andOrgtype44IsNull() {
            addCriterion("ORGTYPE44 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype44IsNotNull() {
            addCriterion("ORGTYPE44 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype44EqualTo(String value) {
            addCriterion("ORGTYPE44 =", value, "orgtype44");
            return (Criteria) this;
        }

        public Criteria andOrgtype44NotEqualTo(String value) {
            addCriterion("ORGTYPE44 <>", value, "orgtype44");
            return (Criteria) this;
        }

        public Criteria andOrgtype44GreaterThan(String value) {
            addCriterion("ORGTYPE44 >", value, "orgtype44");
            return (Criteria) this;
        }

        public Criteria andOrgtype44GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE44 >=", value, "orgtype44");
            return (Criteria) this;
        }

        public Criteria andOrgtype44LessThan(String value) {
            addCriterion("ORGTYPE44 <", value, "orgtype44");
            return (Criteria) this;
        }

        public Criteria andOrgtype44LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE44 <=", value, "orgtype44");
            return (Criteria) this;
        }

        public Criteria andOrgtype44Like(String value) {
            addCriterion("ORGTYPE44 like", value, "orgtype44");
            return (Criteria) this;
        }

        public Criteria andOrgtype44NotLike(String value) {
            addCriterion("ORGTYPE44 not like", value, "orgtype44");
            return (Criteria) this;
        }

        public Criteria andOrgtype44In(List<String> values) {
            addCriterion("ORGTYPE44 in", values, "orgtype44");
            return (Criteria) this;
        }

        public Criteria andOrgtype44NotIn(List<String> values) {
            addCriterion("ORGTYPE44 not in", values, "orgtype44");
            return (Criteria) this;
        }

        public Criteria andOrgtype44Between(String value1, String value2) {
            addCriterion("ORGTYPE44 between", value1, value2, "orgtype44");
            return (Criteria) this;
        }

        public Criteria andOrgtype44NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE44 not between", value1, value2, "orgtype44");
            return (Criteria) this;
        }

        public Criteria andOrgtype45IsNull() {
            addCriterion("ORGTYPE45 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype45IsNotNull() {
            addCriterion("ORGTYPE45 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype45EqualTo(String value) {
            addCriterion("ORGTYPE45 =", value, "orgtype45");
            return (Criteria) this;
        }

        public Criteria andOrgtype45NotEqualTo(String value) {
            addCriterion("ORGTYPE45 <>", value, "orgtype45");
            return (Criteria) this;
        }

        public Criteria andOrgtype45GreaterThan(String value) {
            addCriterion("ORGTYPE45 >", value, "orgtype45");
            return (Criteria) this;
        }

        public Criteria andOrgtype45GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE45 >=", value, "orgtype45");
            return (Criteria) this;
        }

        public Criteria andOrgtype45LessThan(String value) {
            addCriterion("ORGTYPE45 <", value, "orgtype45");
            return (Criteria) this;
        }

        public Criteria andOrgtype45LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE45 <=", value, "orgtype45");
            return (Criteria) this;
        }

        public Criteria andOrgtype45Like(String value) {
            addCriterion("ORGTYPE45 like", value, "orgtype45");
            return (Criteria) this;
        }

        public Criteria andOrgtype45NotLike(String value) {
            addCriterion("ORGTYPE45 not like", value, "orgtype45");
            return (Criteria) this;
        }

        public Criteria andOrgtype45In(List<String> values) {
            addCriterion("ORGTYPE45 in", values, "orgtype45");
            return (Criteria) this;
        }

        public Criteria andOrgtype45NotIn(List<String> values) {
            addCriterion("ORGTYPE45 not in", values, "orgtype45");
            return (Criteria) this;
        }

        public Criteria andOrgtype45Between(String value1, String value2) {
            addCriterion("ORGTYPE45 between", value1, value2, "orgtype45");
            return (Criteria) this;
        }

        public Criteria andOrgtype45NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE45 not between", value1, value2, "orgtype45");
            return (Criteria) this;
        }

        public Criteria andOrgtype46IsNull() {
            addCriterion("ORGTYPE46 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype46IsNotNull() {
            addCriterion("ORGTYPE46 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype46EqualTo(String value) {
            addCriterion("ORGTYPE46 =", value, "orgtype46");
            return (Criteria) this;
        }

        public Criteria andOrgtype46NotEqualTo(String value) {
            addCriterion("ORGTYPE46 <>", value, "orgtype46");
            return (Criteria) this;
        }

        public Criteria andOrgtype46GreaterThan(String value) {
            addCriterion("ORGTYPE46 >", value, "orgtype46");
            return (Criteria) this;
        }

        public Criteria andOrgtype46GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE46 >=", value, "orgtype46");
            return (Criteria) this;
        }

        public Criteria andOrgtype46LessThan(String value) {
            addCriterion("ORGTYPE46 <", value, "orgtype46");
            return (Criteria) this;
        }

        public Criteria andOrgtype46LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE46 <=", value, "orgtype46");
            return (Criteria) this;
        }

        public Criteria andOrgtype46Like(String value) {
            addCriterion("ORGTYPE46 like", value, "orgtype46");
            return (Criteria) this;
        }

        public Criteria andOrgtype46NotLike(String value) {
            addCriterion("ORGTYPE46 not like", value, "orgtype46");
            return (Criteria) this;
        }

        public Criteria andOrgtype46In(List<String> values) {
            addCriterion("ORGTYPE46 in", values, "orgtype46");
            return (Criteria) this;
        }

        public Criteria andOrgtype46NotIn(List<String> values) {
            addCriterion("ORGTYPE46 not in", values, "orgtype46");
            return (Criteria) this;
        }

        public Criteria andOrgtype46Between(String value1, String value2) {
            addCriterion("ORGTYPE46 between", value1, value2, "orgtype46");
            return (Criteria) this;
        }

        public Criteria andOrgtype46NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE46 not between", value1, value2, "orgtype46");
            return (Criteria) this;
        }

        public Criteria andOrgtype47IsNull() {
            addCriterion("ORGTYPE47 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype47IsNotNull() {
            addCriterion("ORGTYPE47 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype47EqualTo(String value) {
            addCriterion("ORGTYPE47 =", value, "orgtype47");
            return (Criteria) this;
        }

        public Criteria andOrgtype47NotEqualTo(String value) {
            addCriterion("ORGTYPE47 <>", value, "orgtype47");
            return (Criteria) this;
        }

        public Criteria andOrgtype47GreaterThan(String value) {
            addCriterion("ORGTYPE47 >", value, "orgtype47");
            return (Criteria) this;
        }

        public Criteria andOrgtype47GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE47 >=", value, "orgtype47");
            return (Criteria) this;
        }

        public Criteria andOrgtype47LessThan(String value) {
            addCriterion("ORGTYPE47 <", value, "orgtype47");
            return (Criteria) this;
        }

        public Criteria andOrgtype47LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE47 <=", value, "orgtype47");
            return (Criteria) this;
        }

        public Criteria andOrgtype47Like(String value) {
            addCriterion("ORGTYPE47 like", value, "orgtype47");
            return (Criteria) this;
        }

        public Criteria andOrgtype47NotLike(String value) {
            addCriterion("ORGTYPE47 not like", value, "orgtype47");
            return (Criteria) this;
        }

        public Criteria andOrgtype47In(List<String> values) {
            addCriterion("ORGTYPE47 in", values, "orgtype47");
            return (Criteria) this;
        }

        public Criteria andOrgtype47NotIn(List<String> values) {
            addCriterion("ORGTYPE47 not in", values, "orgtype47");
            return (Criteria) this;
        }

        public Criteria andOrgtype47Between(String value1, String value2) {
            addCriterion("ORGTYPE47 between", value1, value2, "orgtype47");
            return (Criteria) this;
        }

        public Criteria andOrgtype47NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE47 not between", value1, value2, "orgtype47");
            return (Criteria) this;
        }

        public Criteria andOrgtype48IsNull() {
            addCriterion("ORGTYPE48 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype48IsNotNull() {
            addCriterion("ORGTYPE48 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype48EqualTo(String value) {
            addCriterion("ORGTYPE48 =", value, "orgtype48");
            return (Criteria) this;
        }

        public Criteria andOrgtype48NotEqualTo(String value) {
            addCriterion("ORGTYPE48 <>", value, "orgtype48");
            return (Criteria) this;
        }

        public Criteria andOrgtype48GreaterThan(String value) {
            addCriterion("ORGTYPE48 >", value, "orgtype48");
            return (Criteria) this;
        }

        public Criteria andOrgtype48GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE48 >=", value, "orgtype48");
            return (Criteria) this;
        }

        public Criteria andOrgtype48LessThan(String value) {
            addCriterion("ORGTYPE48 <", value, "orgtype48");
            return (Criteria) this;
        }

        public Criteria andOrgtype48LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE48 <=", value, "orgtype48");
            return (Criteria) this;
        }

        public Criteria andOrgtype48Like(String value) {
            addCriterion("ORGTYPE48 like", value, "orgtype48");
            return (Criteria) this;
        }

        public Criteria andOrgtype48NotLike(String value) {
            addCriterion("ORGTYPE48 not like", value, "orgtype48");
            return (Criteria) this;
        }

        public Criteria andOrgtype48In(List<String> values) {
            addCriterion("ORGTYPE48 in", values, "orgtype48");
            return (Criteria) this;
        }

        public Criteria andOrgtype48NotIn(List<String> values) {
            addCriterion("ORGTYPE48 not in", values, "orgtype48");
            return (Criteria) this;
        }

        public Criteria andOrgtype48Between(String value1, String value2) {
            addCriterion("ORGTYPE48 between", value1, value2, "orgtype48");
            return (Criteria) this;
        }

        public Criteria andOrgtype48NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE48 not between", value1, value2, "orgtype48");
            return (Criteria) this;
        }

        public Criteria andOrgtype49IsNull() {
            addCriterion("ORGTYPE49 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype49IsNotNull() {
            addCriterion("ORGTYPE49 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype49EqualTo(String value) {
            addCriterion("ORGTYPE49 =", value, "orgtype49");
            return (Criteria) this;
        }

        public Criteria andOrgtype49NotEqualTo(String value) {
            addCriterion("ORGTYPE49 <>", value, "orgtype49");
            return (Criteria) this;
        }

        public Criteria andOrgtype49GreaterThan(String value) {
            addCriterion("ORGTYPE49 >", value, "orgtype49");
            return (Criteria) this;
        }

        public Criteria andOrgtype49GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE49 >=", value, "orgtype49");
            return (Criteria) this;
        }

        public Criteria andOrgtype49LessThan(String value) {
            addCriterion("ORGTYPE49 <", value, "orgtype49");
            return (Criteria) this;
        }

        public Criteria andOrgtype49LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE49 <=", value, "orgtype49");
            return (Criteria) this;
        }

        public Criteria andOrgtype49Like(String value) {
            addCriterion("ORGTYPE49 like", value, "orgtype49");
            return (Criteria) this;
        }

        public Criteria andOrgtype49NotLike(String value) {
            addCriterion("ORGTYPE49 not like", value, "orgtype49");
            return (Criteria) this;
        }

        public Criteria andOrgtype49In(List<String> values) {
            addCriterion("ORGTYPE49 in", values, "orgtype49");
            return (Criteria) this;
        }

        public Criteria andOrgtype49NotIn(List<String> values) {
            addCriterion("ORGTYPE49 not in", values, "orgtype49");
            return (Criteria) this;
        }

        public Criteria andOrgtype49Between(String value1, String value2) {
            addCriterion("ORGTYPE49 between", value1, value2, "orgtype49");
            return (Criteria) this;
        }

        public Criteria andOrgtype49NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE49 not between", value1, value2, "orgtype49");
            return (Criteria) this;
        }

        public Criteria andOrgtype5IsNull() {
            addCriterion("ORGTYPE5 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype5IsNotNull() {
            addCriterion("ORGTYPE5 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype5EqualTo(String value) {
            addCriterion("ORGTYPE5 =", value, "orgtype5");
            return (Criteria) this;
        }

        public Criteria andOrgtype5NotEqualTo(String value) {
            addCriterion("ORGTYPE5 <>", value, "orgtype5");
            return (Criteria) this;
        }

        public Criteria andOrgtype5GreaterThan(String value) {
            addCriterion("ORGTYPE5 >", value, "orgtype5");
            return (Criteria) this;
        }

        public Criteria andOrgtype5GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE5 >=", value, "orgtype5");
            return (Criteria) this;
        }

        public Criteria andOrgtype5LessThan(String value) {
            addCriterion("ORGTYPE5 <", value, "orgtype5");
            return (Criteria) this;
        }

        public Criteria andOrgtype5LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE5 <=", value, "orgtype5");
            return (Criteria) this;
        }

        public Criteria andOrgtype5Like(String value) {
            addCriterion("ORGTYPE5 like", value, "orgtype5");
            return (Criteria) this;
        }

        public Criteria andOrgtype5NotLike(String value) {
            addCriterion("ORGTYPE5 not like", value, "orgtype5");
            return (Criteria) this;
        }

        public Criteria andOrgtype5In(List<String> values) {
            addCriterion("ORGTYPE5 in", values, "orgtype5");
            return (Criteria) this;
        }

        public Criteria andOrgtype5NotIn(List<String> values) {
            addCriterion("ORGTYPE5 not in", values, "orgtype5");
            return (Criteria) this;
        }

        public Criteria andOrgtype5Between(String value1, String value2) {
            addCriterion("ORGTYPE5 between", value1, value2, "orgtype5");
            return (Criteria) this;
        }

        public Criteria andOrgtype5NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE5 not between", value1, value2, "orgtype5");
            return (Criteria) this;
        }

        public Criteria andOrgtype50IsNull() {
            addCriterion("ORGTYPE50 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype50IsNotNull() {
            addCriterion("ORGTYPE50 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype50EqualTo(String value) {
            addCriterion("ORGTYPE50 =", value, "orgtype50");
            return (Criteria) this;
        }

        public Criteria andOrgtype50NotEqualTo(String value) {
            addCriterion("ORGTYPE50 <>", value, "orgtype50");
            return (Criteria) this;
        }

        public Criteria andOrgtype50GreaterThan(String value) {
            addCriterion("ORGTYPE50 >", value, "orgtype50");
            return (Criteria) this;
        }

        public Criteria andOrgtype50GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE50 >=", value, "orgtype50");
            return (Criteria) this;
        }

        public Criteria andOrgtype50LessThan(String value) {
            addCriterion("ORGTYPE50 <", value, "orgtype50");
            return (Criteria) this;
        }

        public Criteria andOrgtype50LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE50 <=", value, "orgtype50");
            return (Criteria) this;
        }

        public Criteria andOrgtype50Like(String value) {
            addCriterion("ORGTYPE50 like", value, "orgtype50");
            return (Criteria) this;
        }

        public Criteria andOrgtype50NotLike(String value) {
            addCriterion("ORGTYPE50 not like", value, "orgtype50");
            return (Criteria) this;
        }

        public Criteria andOrgtype50In(List<String> values) {
            addCriterion("ORGTYPE50 in", values, "orgtype50");
            return (Criteria) this;
        }

        public Criteria andOrgtype50NotIn(List<String> values) {
            addCriterion("ORGTYPE50 not in", values, "orgtype50");
            return (Criteria) this;
        }

        public Criteria andOrgtype50Between(String value1, String value2) {
            addCriterion("ORGTYPE50 between", value1, value2, "orgtype50");
            return (Criteria) this;
        }

        public Criteria andOrgtype50NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE50 not between", value1, value2, "orgtype50");
            return (Criteria) this;
        }

        public Criteria andOrgtype6IsNull() {
            addCriterion("ORGTYPE6 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype6IsNotNull() {
            addCriterion("ORGTYPE6 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype6EqualTo(String value) {
            addCriterion("ORGTYPE6 =", value, "orgtype6");
            return (Criteria) this;
        }

        public Criteria andOrgtype6NotEqualTo(String value) {
            addCriterion("ORGTYPE6 <>", value, "orgtype6");
            return (Criteria) this;
        }

        public Criteria andOrgtype6GreaterThan(String value) {
            addCriterion("ORGTYPE6 >", value, "orgtype6");
            return (Criteria) this;
        }

        public Criteria andOrgtype6GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE6 >=", value, "orgtype6");
            return (Criteria) this;
        }

        public Criteria andOrgtype6LessThan(String value) {
            addCriterion("ORGTYPE6 <", value, "orgtype6");
            return (Criteria) this;
        }

        public Criteria andOrgtype6LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE6 <=", value, "orgtype6");
            return (Criteria) this;
        }

        public Criteria andOrgtype6Like(String value) {
            addCriterion("ORGTYPE6 like", value, "orgtype6");
            return (Criteria) this;
        }

        public Criteria andOrgtype6NotLike(String value) {
            addCriterion("ORGTYPE6 not like", value, "orgtype6");
            return (Criteria) this;
        }

        public Criteria andOrgtype6In(List<String> values) {
            addCriterion("ORGTYPE6 in", values, "orgtype6");
            return (Criteria) this;
        }

        public Criteria andOrgtype6NotIn(List<String> values) {
            addCriterion("ORGTYPE6 not in", values, "orgtype6");
            return (Criteria) this;
        }

        public Criteria andOrgtype6Between(String value1, String value2) {
            addCriterion("ORGTYPE6 between", value1, value2, "orgtype6");
            return (Criteria) this;
        }

        public Criteria andOrgtype6NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE6 not between", value1, value2, "orgtype6");
            return (Criteria) this;
        }

        public Criteria andOrgtype7IsNull() {
            addCriterion("ORGTYPE7 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype7IsNotNull() {
            addCriterion("ORGTYPE7 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype7EqualTo(String value) {
            addCriterion("ORGTYPE7 =", value, "orgtype7");
            return (Criteria) this;
        }

        public Criteria andOrgtype7NotEqualTo(String value) {
            addCriterion("ORGTYPE7 <>", value, "orgtype7");
            return (Criteria) this;
        }

        public Criteria andOrgtype7GreaterThan(String value) {
            addCriterion("ORGTYPE7 >", value, "orgtype7");
            return (Criteria) this;
        }

        public Criteria andOrgtype7GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE7 >=", value, "orgtype7");
            return (Criteria) this;
        }

        public Criteria andOrgtype7LessThan(String value) {
            addCriterion("ORGTYPE7 <", value, "orgtype7");
            return (Criteria) this;
        }

        public Criteria andOrgtype7LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE7 <=", value, "orgtype7");
            return (Criteria) this;
        }

        public Criteria andOrgtype7Like(String value) {
            addCriterion("ORGTYPE7 like", value, "orgtype7");
            return (Criteria) this;
        }

        public Criteria andOrgtype7NotLike(String value) {
            addCriterion("ORGTYPE7 not like", value, "orgtype7");
            return (Criteria) this;
        }

        public Criteria andOrgtype7In(List<String> values) {
            addCriterion("ORGTYPE7 in", values, "orgtype7");
            return (Criteria) this;
        }

        public Criteria andOrgtype7NotIn(List<String> values) {
            addCriterion("ORGTYPE7 not in", values, "orgtype7");
            return (Criteria) this;
        }

        public Criteria andOrgtype7Between(String value1, String value2) {
            addCriterion("ORGTYPE7 between", value1, value2, "orgtype7");
            return (Criteria) this;
        }

        public Criteria andOrgtype7NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE7 not between", value1, value2, "orgtype7");
            return (Criteria) this;
        }

        public Criteria andOrgtype8IsNull() {
            addCriterion("ORGTYPE8 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype8IsNotNull() {
            addCriterion("ORGTYPE8 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype8EqualTo(String value) {
            addCriterion("ORGTYPE8 =", value, "orgtype8");
            return (Criteria) this;
        }

        public Criteria andOrgtype8NotEqualTo(String value) {
            addCriterion("ORGTYPE8 <>", value, "orgtype8");
            return (Criteria) this;
        }

        public Criteria andOrgtype8GreaterThan(String value) {
            addCriterion("ORGTYPE8 >", value, "orgtype8");
            return (Criteria) this;
        }

        public Criteria andOrgtype8GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE8 >=", value, "orgtype8");
            return (Criteria) this;
        }

        public Criteria andOrgtype8LessThan(String value) {
            addCriterion("ORGTYPE8 <", value, "orgtype8");
            return (Criteria) this;
        }

        public Criteria andOrgtype8LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE8 <=", value, "orgtype8");
            return (Criteria) this;
        }

        public Criteria andOrgtype8Like(String value) {
            addCriterion("ORGTYPE8 like", value, "orgtype8");
            return (Criteria) this;
        }

        public Criteria andOrgtype8NotLike(String value) {
            addCriterion("ORGTYPE8 not like", value, "orgtype8");
            return (Criteria) this;
        }

        public Criteria andOrgtype8In(List<String> values) {
            addCriterion("ORGTYPE8 in", values, "orgtype8");
            return (Criteria) this;
        }

        public Criteria andOrgtype8NotIn(List<String> values) {
            addCriterion("ORGTYPE8 not in", values, "orgtype8");
            return (Criteria) this;
        }

        public Criteria andOrgtype8Between(String value1, String value2) {
            addCriterion("ORGTYPE8 between", value1, value2, "orgtype8");
            return (Criteria) this;
        }

        public Criteria andOrgtype8NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE8 not between", value1, value2, "orgtype8");
            return (Criteria) this;
        }

        public Criteria andOrgtype9IsNull() {
            addCriterion("ORGTYPE9 is null");
            return (Criteria) this;
        }

        public Criteria andOrgtype9IsNotNull() {
            addCriterion("ORGTYPE9 is not null");
            return (Criteria) this;
        }

        public Criteria andOrgtype9EqualTo(String value) {
            addCriterion("ORGTYPE9 =", value, "orgtype9");
            return (Criteria) this;
        }

        public Criteria andOrgtype9NotEqualTo(String value) {
            addCriterion("ORGTYPE9 <>", value, "orgtype9");
            return (Criteria) this;
        }

        public Criteria andOrgtype9GreaterThan(String value) {
            addCriterion("ORGTYPE9 >", value, "orgtype9");
            return (Criteria) this;
        }

        public Criteria andOrgtype9GreaterThanOrEqualTo(String value) {
            addCriterion("ORGTYPE9 >=", value, "orgtype9");
            return (Criteria) this;
        }

        public Criteria andOrgtype9LessThan(String value) {
            addCriterion("ORGTYPE9 <", value, "orgtype9");
            return (Criteria) this;
        }

        public Criteria andOrgtype9LessThanOrEqualTo(String value) {
            addCriterion("ORGTYPE9 <=", value, "orgtype9");
            return (Criteria) this;
        }

        public Criteria andOrgtype9Like(String value) {
            addCriterion("ORGTYPE9 like", value, "orgtype9");
            return (Criteria) this;
        }

        public Criteria andOrgtype9NotLike(String value) {
            addCriterion("ORGTYPE9 not like", value, "orgtype9");
            return (Criteria) this;
        }

        public Criteria andOrgtype9In(List<String> values) {
            addCriterion("ORGTYPE9 in", values, "orgtype9");
            return (Criteria) this;
        }

        public Criteria andOrgtype9NotIn(List<String> values) {
            addCriterion("ORGTYPE9 not in", values, "orgtype9");
            return (Criteria) this;
        }

        public Criteria andOrgtype9Between(String value1, String value2) {
            addCriterion("ORGTYPE9 between", value1, value2, "orgtype9");
            return (Criteria) this;
        }

        public Criteria andOrgtype9NotBetween(String value1, String value2) {
            addCriterion("ORGTYPE9 not between", value1, value2, "orgtype9");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgIsNull() {
            addCriterion("PK_FATHERORG is null");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgIsNotNull() {
            addCriterion("PK_FATHERORG is not null");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgEqualTo(String value) {
            addCriterion("PK_FATHERORG =", value, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgNotEqualTo(String value) {
            addCriterion("PK_FATHERORG <>", value, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgGreaterThan(String value) {
            addCriterion("PK_FATHERORG >", value, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgGreaterThanOrEqualTo(String value) {
            addCriterion("PK_FATHERORG >=", value, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgLessThan(String value) {
            addCriterion("PK_FATHERORG <", value, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgLessThanOrEqualTo(String value) {
            addCriterion("PK_FATHERORG <=", value, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgLike(String value) {
            addCriterion("PK_FATHERORG like", value, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgNotLike(String value) {
            addCriterion("PK_FATHERORG not like", value, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgIn(List<String> values) {
            addCriterion("PK_FATHERORG in", values, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgNotIn(List<String> values) {
            addCriterion("PK_FATHERORG not in", values, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgBetween(String value1, String value2) {
            addCriterion("PK_FATHERORG between", value1, value2, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFatherorgNotBetween(String value1, String value2) {
            addCriterion("PK_FATHERORG not between", value1, value2, "pkFatherorg");
            return (Criteria) this;
        }

        public Criteria andPkFormatIsNull() {
            addCriterion("PK_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andPkFormatIsNotNull() {
            addCriterion("PK_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andPkFormatEqualTo(String value) {
            addCriterion("PK_FORMAT =", value, "pkFormat");
            return (Criteria) this;
        }

        public Criteria andPkFormatNotEqualTo(String value) {
            addCriterion("PK_FORMAT <>", value, "pkFormat");
            return (Criteria) this;
        }

        public Criteria andPkFormatGreaterThan(String value) {
            addCriterion("PK_FORMAT >", value, "pkFormat");
            return (Criteria) this;
        }

        public Criteria andPkFormatGreaterThanOrEqualTo(String value) {
            addCriterion("PK_FORMAT >=", value, "pkFormat");
            return (Criteria) this;
        }

        public Criteria andPkFormatLessThan(String value) {
            addCriterion("PK_FORMAT <", value, "pkFormat");
            return (Criteria) this;
        }

        public Criteria andPkFormatLessThanOrEqualTo(String value) {
            addCriterion("PK_FORMAT <=", value, "pkFormat");
            return (Criteria) this;
        }

        public Criteria andPkFormatLike(String value) {
            addCriterion("PK_FORMAT like", value, "pkFormat");
            return (Criteria) this;
        }

        public Criteria andPkFormatNotLike(String value) {
            addCriterion("PK_FORMAT not like", value, "pkFormat");
            return (Criteria) this;
        }

        public Criteria andPkFormatIn(List<String> values) {
            addCriterion("PK_FORMAT in", values, "pkFormat");
            return (Criteria) this;
        }

        public Criteria andPkFormatNotIn(List<String> values) {
            addCriterion("PK_FORMAT not in", values, "pkFormat");
            return (Criteria) this;
        }

        public Criteria andPkFormatBetween(String value1, String value2) {
            addCriterion("PK_FORMAT between", value1, value2, "pkFormat");
            return (Criteria) this;
        }

        public Criteria andPkFormatNotBetween(String value1, String value2) {
            addCriterion("PK_FORMAT not between", value1, value2, "pkFormat");
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

        public Criteria andPkOwnorgIsNull() {
            addCriterion("PK_OWNORG is null");
            return (Criteria) this;
        }

        public Criteria andPkOwnorgIsNotNull() {
            addCriterion("PK_OWNORG is not null");
            return (Criteria) this;
        }

        public Criteria andPkOwnorgEqualTo(String value) {
            addCriterion("PK_OWNORG =", value, "pkOwnorg");
            return (Criteria) this;
        }

        public Criteria andPkOwnorgNotEqualTo(String value) {
            addCriterion("PK_OWNORG <>", value, "pkOwnorg");
            return (Criteria) this;
        }

        public Criteria andPkOwnorgGreaterThan(String value) {
            addCriterion("PK_OWNORG >", value, "pkOwnorg");
            return (Criteria) this;
        }

        public Criteria andPkOwnorgGreaterThanOrEqualTo(String value) {
            addCriterion("PK_OWNORG >=", value, "pkOwnorg");
            return (Criteria) this;
        }

        public Criteria andPkOwnorgLessThan(String value) {
            addCriterion("PK_OWNORG <", value, "pkOwnorg");
            return (Criteria) this;
        }

        public Criteria andPkOwnorgLessThanOrEqualTo(String value) {
            addCriterion("PK_OWNORG <=", value, "pkOwnorg");
            return (Criteria) this;
        }

        public Criteria andPkOwnorgLike(String value) {
            addCriterion("PK_OWNORG like", value, "pkOwnorg");
            return (Criteria) this;
        }

        public Criteria andPkOwnorgNotLike(String value) {
            addCriterion("PK_OWNORG not like", value, "pkOwnorg");
            return (Criteria) this;
        }

        public Criteria andPkOwnorgIn(List<String> values) {
            addCriterion("PK_OWNORG in", values, "pkOwnorg");
            return (Criteria) this;
        }

        public Criteria andPkOwnorgNotIn(List<String> values) {
            addCriterion("PK_OWNORG not in", values, "pkOwnorg");
            return (Criteria) this;
        }

        public Criteria andPkOwnorgBetween(String value1, String value2) {
            addCriterion("PK_OWNORG between", value1, value2, "pkOwnorg");
            return (Criteria) this;
        }

        public Criteria andPkOwnorgNotBetween(String value1, String value2) {
            addCriterion("PK_OWNORG not between", value1, value2, "pkOwnorg");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneIsNull() {
            addCriterion("PK_TIMEZONE is null");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneIsNotNull() {
            addCriterion("PK_TIMEZONE is not null");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneEqualTo(String value) {
            addCriterion("PK_TIMEZONE =", value, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneNotEqualTo(String value) {
            addCriterion("PK_TIMEZONE <>", value, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneGreaterThan(String value) {
            addCriterion("PK_TIMEZONE >", value, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneGreaterThanOrEqualTo(String value) {
            addCriterion("PK_TIMEZONE >=", value, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneLessThan(String value) {
            addCriterion("PK_TIMEZONE <", value, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneLessThanOrEqualTo(String value) {
            addCriterion("PK_TIMEZONE <=", value, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneLike(String value) {
            addCriterion("PK_TIMEZONE like", value, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneNotLike(String value) {
            addCriterion("PK_TIMEZONE not like", value, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneIn(List<String> values) {
            addCriterion("PK_TIMEZONE in", values, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneNotIn(List<String> values) {
            addCriterion("PK_TIMEZONE not in", values, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneBetween(String value1, String value2) {
            addCriterion("PK_TIMEZONE between", value1, value2, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkTimezoneNotBetween(String value1, String value2) {
            addCriterion("PK_TIMEZONE not between", value1, value2, "pkTimezone");
            return (Criteria) this;
        }

        public Criteria andPkVidIsNull() {
            addCriterion("PK_VID is null");
            return (Criteria) this;
        }

        public Criteria andPkVidIsNotNull() {
            addCriterion("PK_VID is not null");
            return (Criteria) this;
        }

        public Criteria andPkVidEqualTo(String value) {
            addCriterion("PK_VID =", value, "pkVid");
            return (Criteria) this;
        }

        public Criteria andPkVidNotEqualTo(String value) {
            addCriterion("PK_VID <>", value, "pkVid");
            return (Criteria) this;
        }

        public Criteria andPkVidGreaterThan(String value) {
            addCriterion("PK_VID >", value, "pkVid");
            return (Criteria) this;
        }

        public Criteria andPkVidGreaterThanOrEqualTo(String value) {
            addCriterion("PK_VID >=", value, "pkVid");
            return (Criteria) this;
        }

        public Criteria andPkVidLessThan(String value) {
            addCriterion("PK_VID <", value, "pkVid");
            return (Criteria) this;
        }

        public Criteria andPkVidLessThanOrEqualTo(String value) {
            addCriterion("PK_VID <=", value, "pkVid");
            return (Criteria) this;
        }

        public Criteria andPkVidLike(String value) {
            addCriterion("PK_VID like", value, "pkVid");
            return (Criteria) this;
        }

        public Criteria andPkVidNotLike(String value) {
            addCriterion("PK_VID not like", value, "pkVid");
            return (Criteria) this;
        }

        public Criteria andPkVidIn(List<String> values) {
            addCriterion("PK_VID in", values, "pkVid");
            return (Criteria) this;
        }

        public Criteria andPkVidNotIn(List<String> values) {
            addCriterion("PK_VID not in", values, "pkVid");
            return (Criteria) this;
        }

        public Criteria andPkVidBetween(String value1, String value2) {
            addCriterion("PK_VID between", value1, value2, "pkVid");
            return (Criteria) this;
        }

        public Criteria andPkVidNotBetween(String value1, String value2) {
            addCriterion("PK_VID not between", value1, value2, "pkVid");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("PRINCIPAL is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("PRINCIPAL is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(String value) {
            addCriterion("PRINCIPAL =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(String value) {
            addCriterion("PRINCIPAL <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(String value) {
            addCriterion("PRINCIPAL >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(String value) {
            addCriterion("PRINCIPAL <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLike(String value) {
            addCriterion("PRINCIPAL like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotLike(String value) {
            addCriterion("PRINCIPAL not like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<String> values) {
            addCriterion("PRINCIPAL in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<String> values) {
            addCriterion("PRINCIPAL not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(String value1, String value2) {
            addCriterion("PRINCIPAL between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(String value1, String value2) {
            addCriterion("PRINCIPAL not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNull() {
            addCriterion("SHORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNotNull() {
            addCriterion("SHORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameEqualTo(String value) {
            addCriterion("SHORTNAME =", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotEqualTo(String value) {
            addCriterion("SHORTNAME <>", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThan(String value) {
            addCriterion("SHORTNAME >", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("SHORTNAME >=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThan(String value) {
            addCriterion("SHORTNAME <", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThanOrEqualTo(String value) {
            addCriterion("SHORTNAME <=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLike(String value) {
            addCriterion("SHORTNAME like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotLike(String value) {
            addCriterion("SHORTNAME not like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameIn(List<String> values) {
            addCriterion("SHORTNAME in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotIn(List<String> values) {
            addCriterion("SHORTNAME not in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameBetween(String value1, String value2) {
            addCriterion("SHORTNAME between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotBetween(String value1, String value2) {
            addCriterion("SHORTNAME not between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortname2IsNull() {
            addCriterion("SHORTNAME2 is null");
            return (Criteria) this;
        }

        public Criteria andShortname2IsNotNull() {
            addCriterion("SHORTNAME2 is not null");
            return (Criteria) this;
        }

        public Criteria andShortname2EqualTo(String value) {
            addCriterion("SHORTNAME2 =", value, "shortname2");
            return (Criteria) this;
        }

        public Criteria andShortname2NotEqualTo(String value) {
            addCriterion("SHORTNAME2 <>", value, "shortname2");
            return (Criteria) this;
        }

        public Criteria andShortname2GreaterThan(String value) {
            addCriterion("SHORTNAME2 >", value, "shortname2");
            return (Criteria) this;
        }

        public Criteria andShortname2GreaterThanOrEqualTo(String value) {
            addCriterion("SHORTNAME2 >=", value, "shortname2");
            return (Criteria) this;
        }

        public Criteria andShortname2LessThan(String value) {
            addCriterion("SHORTNAME2 <", value, "shortname2");
            return (Criteria) this;
        }

        public Criteria andShortname2LessThanOrEqualTo(String value) {
            addCriterion("SHORTNAME2 <=", value, "shortname2");
            return (Criteria) this;
        }

        public Criteria andShortname2Like(String value) {
            addCriterion("SHORTNAME2 like", value, "shortname2");
            return (Criteria) this;
        }

        public Criteria andShortname2NotLike(String value) {
            addCriterion("SHORTNAME2 not like", value, "shortname2");
            return (Criteria) this;
        }

        public Criteria andShortname2In(List<String> values) {
            addCriterion("SHORTNAME2 in", values, "shortname2");
            return (Criteria) this;
        }

        public Criteria andShortname2NotIn(List<String> values) {
            addCriterion("SHORTNAME2 not in", values, "shortname2");
            return (Criteria) this;
        }

        public Criteria andShortname2Between(String value1, String value2) {
            addCriterion("SHORTNAME2 between", value1, value2, "shortname2");
            return (Criteria) this;
        }

        public Criteria andShortname2NotBetween(String value1, String value2) {
            addCriterion("SHORTNAME2 not between", value1, value2, "shortname2");
            return (Criteria) this;
        }

        public Criteria andShortname3IsNull() {
            addCriterion("SHORTNAME3 is null");
            return (Criteria) this;
        }

        public Criteria andShortname3IsNotNull() {
            addCriterion("SHORTNAME3 is not null");
            return (Criteria) this;
        }

        public Criteria andShortname3EqualTo(String value) {
            addCriterion("SHORTNAME3 =", value, "shortname3");
            return (Criteria) this;
        }

        public Criteria andShortname3NotEqualTo(String value) {
            addCriterion("SHORTNAME3 <>", value, "shortname3");
            return (Criteria) this;
        }

        public Criteria andShortname3GreaterThan(String value) {
            addCriterion("SHORTNAME3 >", value, "shortname3");
            return (Criteria) this;
        }

        public Criteria andShortname3GreaterThanOrEqualTo(String value) {
            addCriterion("SHORTNAME3 >=", value, "shortname3");
            return (Criteria) this;
        }

        public Criteria andShortname3LessThan(String value) {
            addCriterion("SHORTNAME3 <", value, "shortname3");
            return (Criteria) this;
        }

        public Criteria andShortname3LessThanOrEqualTo(String value) {
            addCriterion("SHORTNAME3 <=", value, "shortname3");
            return (Criteria) this;
        }

        public Criteria andShortname3Like(String value) {
            addCriterion("SHORTNAME3 like", value, "shortname3");
            return (Criteria) this;
        }

        public Criteria andShortname3NotLike(String value) {
            addCriterion("SHORTNAME3 not like", value, "shortname3");
            return (Criteria) this;
        }

        public Criteria andShortname3In(List<String> values) {
            addCriterion("SHORTNAME3 in", values, "shortname3");
            return (Criteria) this;
        }

        public Criteria andShortname3NotIn(List<String> values) {
            addCriterion("SHORTNAME3 not in", values, "shortname3");
            return (Criteria) this;
        }

        public Criteria andShortname3Between(String value1, String value2) {
            addCriterion("SHORTNAME3 between", value1, value2, "shortname3");
            return (Criteria) this;
        }

        public Criteria andShortname3NotBetween(String value1, String value2) {
            addCriterion("SHORTNAME3 not between", value1, value2, "shortname3");
            return (Criteria) this;
        }

        public Criteria andShortname4IsNull() {
            addCriterion("SHORTNAME4 is null");
            return (Criteria) this;
        }

        public Criteria andShortname4IsNotNull() {
            addCriterion("SHORTNAME4 is not null");
            return (Criteria) this;
        }

        public Criteria andShortname4EqualTo(String value) {
            addCriterion("SHORTNAME4 =", value, "shortname4");
            return (Criteria) this;
        }

        public Criteria andShortname4NotEqualTo(String value) {
            addCriterion("SHORTNAME4 <>", value, "shortname4");
            return (Criteria) this;
        }

        public Criteria andShortname4GreaterThan(String value) {
            addCriterion("SHORTNAME4 >", value, "shortname4");
            return (Criteria) this;
        }

        public Criteria andShortname4GreaterThanOrEqualTo(String value) {
            addCriterion("SHORTNAME4 >=", value, "shortname4");
            return (Criteria) this;
        }

        public Criteria andShortname4LessThan(String value) {
            addCriterion("SHORTNAME4 <", value, "shortname4");
            return (Criteria) this;
        }

        public Criteria andShortname4LessThanOrEqualTo(String value) {
            addCriterion("SHORTNAME4 <=", value, "shortname4");
            return (Criteria) this;
        }

        public Criteria andShortname4Like(String value) {
            addCriterion("SHORTNAME4 like", value, "shortname4");
            return (Criteria) this;
        }

        public Criteria andShortname4NotLike(String value) {
            addCriterion("SHORTNAME4 not like", value, "shortname4");
            return (Criteria) this;
        }

        public Criteria andShortname4In(List<String> values) {
            addCriterion("SHORTNAME4 in", values, "shortname4");
            return (Criteria) this;
        }

        public Criteria andShortname4NotIn(List<String> values) {
            addCriterion("SHORTNAME4 not in", values, "shortname4");
            return (Criteria) this;
        }

        public Criteria andShortname4Between(String value1, String value2) {
            addCriterion("SHORTNAME4 between", value1, value2, "shortname4");
            return (Criteria) this;
        }

        public Criteria andShortname4NotBetween(String value1, String value2) {
            addCriterion("SHORTNAME4 not between", value1, value2, "shortname4");
            return (Criteria) this;
        }

        public Criteria andShortname5IsNull() {
            addCriterion("SHORTNAME5 is null");
            return (Criteria) this;
        }

        public Criteria andShortname5IsNotNull() {
            addCriterion("SHORTNAME5 is not null");
            return (Criteria) this;
        }

        public Criteria andShortname5EqualTo(String value) {
            addCriterion("SHORTNAME5 =", value, "shortname5");
            return (Criteria) this;
        }

        public Criteria andShortname5NotEqualTo(String value) {
            addCriterion("SHORTNAME5 <>", value, "shortname5");
            return (Criteria) this;
        }

        public Criteria andShortname5GreaterThan(String value) {
            addCriterion("SHORTNAME5 >", value, "shortname5");
            return (Criteria) this;
        }

        public Criteria andShortname5GreaterThanOrEqualTo(String value) {
            addCriterion("SHORTNAME5 >=", value, "shortname5");
            return (Criteria) this;
        }

        public Criteria andShortname5LessThan(String value) {
            addCriterion("SHORTNAME5 <", value, "shortname5");
            return (Criteria) this;
        }

        public Criteria andShortname5LessThanOrEqualTo(String value) {
            addCriterion("SHORTNAME5 <=", value, "shortname5");
            return (Criteria) this;
        }

        public Criteria andShortname5Like(String value) {
            addCriterion("SHORTNAME5 like", value, "shortname5");
            return (Criteria) this;
        }

        public Criteria andShortname5NotLike(String value) {
            addCriterion("SHORTNAME5 not like", value, "shortname5");
            return (Criteria) this;
        }

        public Criteria andShortname5In(List<String> values) {
            addCriterion("SHORTNAME5 in", values, "shortname5");
            return (Criteria) this;
        }

        public Criteria andShortname5NotIn(List<String> values) {
            addCriterion("SHORTNAME5 not in", values, "shortname5");
            return (Criteria) this;
        }

        public Criteria andShortname5Between(String value1, String value2) {
            addCriterion("SHORTNAME5 between", value1, value2, "shortname5");
            return (Criteria) this;
        }

        public Criteria andShortname5NotBetween(String value1, String value2) {
            addCriterion("SHORTNAME5 not between", value1, value2, "shortname5");
            return (Criteria) this;
        }

        public Criteria andShortname6IsNull() {
            addCriterion("SHORTNAME6 is null");
            return (Criteria) this;
        }

        public Criteria andShortname6IsNotNull() {
            addCriterion("SHORTNAME6 is not null");
            return (Criteria) this;
        }

        public Criteria andShortname6EqualTo(String value) {
            addCriterion("SHORTNAME6 =", value, "shortname6");
            return (Criteria) this;
        }

        public Criteria andShortname6NotEqualTo(String value) {
            addCriterion("SHORTNAME6 <>", value, "shortname6");
            return (Criteria) this;
        }

        public Criteria andShortname6GreaterThan(String value) {
            addCriterion("SHORTNAME6 >", value, "shortname6");
            return (Criteria) this;
        }

        public Criteria andShortname6GreaterThanOrEqualTo(String value) {
            addCriterion("SHORTNAME6 >=", value, "shortname6");
            return (Criteria) this;
        }

        public Criteria andShortname6LessThan(String value) {
            addCriterion("SHORTNAME6 <", value, "shortname6");
            return (Criteria) this;
        }

        public Criteria andShortname6LessThanOrEqualTo(String value) {
            addCriterion("SHORTNAME6 <=", value, "shortname6");
            return (Criteria) this;
        }

        public Criteria andShortname6Like(String value) {
            addCriterion("SHORTNAME6 like", value, "shortname6");
            return (Criteria) this;
        }

        public Criteria andShortname6NotLike(String value) {
            addCriterion("SHORTNAME6 not like", value, "shortname6");
            return (Criteria) this;
        }

        public Criteria andShortname6In(List<String> values) {
            addCriterion("SHORTNAME6 in", values, "shortname6");
            return (Criteria) this;
        }

        public Criteria andShortname6NotIn(List<String> values) {
            addCriterion("SHORTNAME6 not in", values, "shortname6");
            return (Criteria) this;
        }

        public Criteria andShortname6Between(String value1, String value2) {
            addCriterion("SHORTNAME6 between", value1, value2, "shortname6");
            return (Criteria) this;
        }

        public Criteria andShortname6NotBetween(String value1, String value2) {
            addCriterion("SHORTNAME6 not between", value1, value2, "shortname6");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
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

        public Criteria andVenddateIsNull() {
            addCriterion("VENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andVenddateIsNotNull() {
            addCriterion("VENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andVenddateEqualTo(String value) {
            addCriterion("VENDDATE =", value, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateNotEqualTo(String value) {
            addCriterion("VENDDATE <>", value, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateGreaterThan(String value) {
            addCriterion("VENDDATE >", value, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateGreaterThanOrEqualTo(String value) {
            addCriterion("VENDDATE >=", value, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateLessThan(String value) {
            addCriterion("VENDDATE <", value, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateLessThanOrEqualTo(String value) {
            addCriterion("VENDDATE <=", value, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateLike(String value) {
            addCriterion("VENDDATE like", value, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateNotLike(String value) {
            addCriterion("VENDDATE not like", value, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateIn(List<String> values) {
            addCriterion("VENDDATE in", values, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateNotIn(List<String> values) {
            addCriterion("VENDDATE not in", values, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateBetween(String value1, String value2) {
            addCriterion("VENDDATE between", value1, value2, "venddate");
            return (Criteria) this;
        }

        public Criteria andVenddateNotBetween(String value1, String value2) {
            addCriterion("VENDDATE not between", value1, value2, "venddate");
            return (Criteria) this;
        }

        public Criteria andVnameIsNull() {
            addCriterion("VNAME is null");
            return (Criteria) this;
        }

        public Criteria andVnameIsNotNull() {
            addCriterion("VNAME is not null");
            return (Criteria) this;
        }

        public Criteria andVnameEqualTo(String value) {
            addCriterion("VNAME =", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotEqualTo(String value) {
            addCriterion("VNAME <>", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThan(String value) {
            addCriterion("VNAME >", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThanOrEqualTo(String value) {
            addCriterion("VNAME >=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThan(String value) {
            addCriterion("VNAME <", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThanOrEqualTo(String value) {
            addCriterion("VNAME <=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLike(String value) {
            addCriterion("VNAME like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotLike(String value) {
            addCriterion("VNAME not like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameIn(List<String> values) {
            addCriterion("VNAME in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotIn(List<String> values) {
            addCriterion("VNAME not in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameBetween(String value1, String value2) {
            addCriterion("VNAME between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotBetween(String value1, String value2) {
            addCriterion("VNAME not between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVname2IsNull() {
            addCriterion("VNAME2 is null");
            return (Criteria) this;
        }

        public Criteria andVname2IsNotNull() {
            addCriterion("VNAME2 is not null");
            return (Criteria) this;
        }

        public Criteria andVname2EqualTo(String value) {
            addCriterion("VNAME2 =", value, "vname2");
            return (Criteria) this;
        }

        public Criteria andVname2NotEqualTo(String value) {
            addCriterion("VNAME2 <>", value, "vname2");
            return (Criteria) this;
        }

        public Criteria andVname2GreaterThan(String value) {
            addCriterion("VNAME2 >", value, "vname2");
            return (Criteria) this;
        }

        public Criteria andVname2GreaterThanOrEqualTo(String value) {
            addCriterion("VNAME2 >=", value, "vname2");
            return (Criteria) this;
        }

        public Criteria andVname2LessThan(String value) {
            addCriterion("VNAME2 <", value, "vname2");
            return (Criteria) this;
        }

        public Criteria andVname2LessThanOrEqualTo(String value) {
            addCriterion("VNAME2 <=", value, "vname2");
            return (Criteria) this;
        }

        public Criteria andVname2Like(String value) {
            addCriterion("VNAME2 like", value, "vname2");
            return (Criteria) this;
        }

        public Criteria andVname2NotLike(String value) {
            addCriterion("VNAME2 not like", value, "vname2");
            return (Criteria) this;
        }

        public Criteria andVname2In(List<String> values) {
            addCriterion("VNAME2 in", values, "vname2");
            return (Criteria) this;
        }

        public Criteria andVname2NotIn(List<String> values) {
            addCriterion("VNAME2 not in", values, "vname2");
            return (Criteria) this;
        }

        public Criteria andVname2Between(String value1, String value2) {
            addCriterion("VNAME2 between", value1, value2, "vname2");
            return (Criteria) this;
        }

        public Criteria andVname2NotBetween(String value1, String value2) {
            addCriterion("VNAME2 not between", value1, value2, "vname2");
            return (Criteria) this;
        }

        public Criteria andVname3IsNull() {
            addCriterion("VNAME3 is null");
            return (Criteria) this;
        }

        public Criteria andVname3IsNotNull() {
            addCriterion("VNAME3 is not null");
            return (Criteria) this;
        }

        public Criteria andVname3EqualTo(String value) {
            addCriterion("VNAME3 =", value, "vname3");
            return (Criteria) this;
        }

        public Criteria andVname3NotEqualTo(String value) {
            addCriterion("VNAME3 <>", value, "vname3");
            return (Criteria) this;
        }

        public Criteria andVname3GreaterThan(String value) {
            addCriterion("VNAME3 >", value, "vname3");
            return (Criteria) this;
        }

        public Criteria andVname3GreaterThanOrEqualTo(String value) {
            addCriterion("VNAME3 >=", value, "vname3");
            return (Criteria) this;
        }

        public Criteria andVname3LessThan(String value) {
            addCriterion("VNAME3 <", value, "vname3");
            return (Criteria) this;
        }

        public Criteria andVname3LessThanOrEqualTo(String value) {
            addCriterion("VNAME3 <=", value, "vname3");
            return (Criteria) this;
        }

        public Criteria andVname3Like(String value) {
            addCriterion("VNAME3 like", value, "vname3");
            return (Criteria) this;
        }

        public Criteria andVname3NotLike(String value) {
            addCriterion("VNAME3 not like", value, "vname3");
            return (Criteria) this;
        }

        public Criteria andVname3In(List<String> values) {
            addCriterion("VNAME3 in", values, "vname3");
            return (Criteria) this;
        }

        public Criteria andVname3NotIn(List<String> values) {
            addCriterion("VNAME3 not in", values, "vname3");
            return (Criteria) this;
        }

        public Criteria andVname3Between(String value1, String value2) {
            addCriterion("VNAME3 between", value1, value2, "vname3");
            return (Criteria) this;
        }

        public Criteria andVname3NotBetween(String value1, String value2) {
            addCriterion("VNAME3 not between", value1, value2, "vname3");
            return (Criteria) this;
        }

        public Criteria andVname4IsNull() {
            addCriterion("VNAME4 is null");
            return (Criteria) this;
        }

        public Criteria andVname4IsNotNull() {
            addCriterion("VNAME4 is not null");
            return (Criteria) this;
        }

        public Criteria andVname4EqualTo(String value) {
            addCriterion("VNAME4 =", value, "vname4");
            return (Criteria) this;
        }

        public Criteria andVname4NotEqualTo(String value) {
            addCriterion("VNAME4 <>", value, "vname4");
            return (Criteria) this;
        }

        public Criteria andVname4GreaterThan(String value) {
            addCriterion("VNAME4 >", value, "vname4");
            return (Criteria) this;
        }

        public Criteria andVname4GreaterThanOrEqualTo(String value) {
            addCriterion("VNAME4 >=", value, "vname4");
            return (Criteria) this;
        }

        public Criteria andVname4LessThan(String value) {
            addCriterion("VNAME4 <", value, "vname4");
            return (Criteria) this;
        }

        public Criteria andVname4LessThanOrEqualTo(String value) {
            addCriterion("VNAME4 <=", value, "vname4");
            return (Criteria) this;
        }

        public Criteria andVname4Like(String value) {
            addCriterion("VNAME4 like", value, "vname4");
            return (Criteria) this;
        }

        public Criteria andVname4NotLike(String value) {
            addCriterion("VNAME4 not like", value, "vname4");
            return (Criteria) this;
        }

        public Criteria andVname4In(List<String> values) {
            addCriterion("VNAME4 in", values, "vname4");
            return (Criteria) this;
        }

        public Criteria andVname4NotIn(List<String> values) {
            addCriterion("VNAME4 not in", values, "vname4");
            return (Criteria) this;
        }

        public Criteria andVname4Between(String value1, String value2) {
            addCriterion("VNAME4 between", value1, value2, "vname4");
            return (Criteria) this;
        }

        public Criteria andVname4NotBetween(String value1, String value2) {
            addCriterion("VNAME4 not between", value1, value2, "vname4");
            return (Criteria) this;
        }

        public Criteria andVname5IsNull() {
            addCriterion("VNAME5 is null");
            return (Criteria) this;
        }

        public Criteria andVname5IsNotNull() {
            addCriterion("VNAME5 is not null");
            return (Criteria) this;
        }

        public Criteria andVname5EqualTo(String value) {
            addCriterion("VNAME5 =", value, "vname5");
            return (Criteria) this;
        }

        public Criteria andVname5NotEqualTo(String value) {
            addCriterion("VNAME5 <>", value, "vname5");
            return (Criteria) this;
        }

        public Criteria andVname5GreaterThan(String value) {
            addCriterion("VNAME5 >", value, "vname5");
            return (Criteria) this;
        }

        public Criteria andVname5GreaterThanOrEqualTo(String value) {
            addCriterion("VNAME5 >=", value, "vname5");
            return (Criteria) this;
        }

        public Criteria andVname5LessThan(String value) {
            addCriterion("VNAME5 <", value, "vname5");
            return (Criteria) this;
        }

        public Criteria andVname5LessThanOrEqualTo(String value) {
            addCriterion("VNAME5 <=", value, "vname5");
            return (Criteria) this;
        }

        public Criteria andVname5Like(String value) {
            addCriterion("VNAME5 like", value, "vname5");
            return (Criteria) this;
        }

        public Criteria andVname5NotLike(String value) {
            addCriterion("VNAME5 not like", value, "vname5");
            return (Criteria) this;
        }

        public Criteria andVname5In(List<String> values) {
            addCriterion("VNAME5 in", values, "vname5");
            return (Criteria) this;
        }

        public Criteria andVname5NotIn(List<String> values) {
            addCriterion("VNAME5 not in", values, "vname5");
            return (Criteria) this;
        }

        public Criteria andVname5Between(String value1, String value2) {
            addCriterion("VNAME5 between", value1, value2, "vname5");
            return (Criteria) this;
        }

        public Criteria andVname5NotBetween(String value1, String value2) {
            addCriterion("VNAME5 not between", value1, value2, "vname5");
            return (Criteria) this;
        }

        public Criteria andVname6IsNull() {
            addCriterion("VNAME6 is null");
            return (Criteria) this;
        }

        public Criteria andVname6IsNotNull() {
            addCriterion("VNAME6 is not null");
            return (Criteria) this;
        }

        public Criteria andVname6EqualTo(String value) {
            addCriterion("VNAME6 =", value, "vname6");
            return (Criteria) this;
        }

        public Criteria andVname6NotEqualTo(String value) {
            addCriterion("VNAME6 <>", value, "vname6");
            return (Criteria) this;
        }

        public Criteria andVname6GreaterThan(String value) {
            addCriterion("VNAME6 >", value, "vname6");
            return (Criteria) this;
        }

        public Criteria andVname6GreaterThanOrEqualTo(String value) {
            addCriterion("VNAME6 >=", value, "vname6");
            return (Criteria) this;
        }

        public Criteria andVname6LessThan(String value) {
            addCriterion("VNAME6 <", value, "vname6");
            return (Criteria) this;
        }

        public Criteria andVname6LessThanOrEqualTo(String value) {
            addCriterion("VNAME6 <=", value, "vname6");
            return (Criteria) this;
        }

        public Criteria andVname6Like(String value) {
            addCriterion("VNAME6 like", value, "vname6");
            return (Criteria) this;
        }

        public Criteria andVname6NotLike(String value) {
            addCriterion("VNAME6 not like", value, "vname6");
            return (Criteria) this;
        }

        public Criteria andVname6In(List<String> values) {
            addCriterion("VNAME6 in", values, "vname6");
            return (Criteria) this;
        }

        public Criteria andVname6NotIn(List<String> values) {
            addCriterion("VNAME6 not in", values, "vname6");
            return (Criteria) this;
        }

        public Criteria andVname6Between(String value1, String value2) {
            addCriterion("VNAME6 between", value1, value2, "vname6");
            return (Criteria) this;
        }

        public Criteria andVname6NotBetween(String value1, String value2) {
            addCriterion("VNAME6 not between", value1, value2, "vname6");
            return (Criteria) this;
        }

        public Criteria andVnoIsNull() {
            addCriterion("VNO is null");
            return (Criteria) this;
        }

        public Criteria andVnoIsNotNull() {
            addCriterion("VNO is not null");
            return (Criteria) this;
        }

        public Criteria andVnoEqualTo(String value) {
            addCriterion("VNO =", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoNotEqualTo(String value) {
            addCriterion("VNO <>", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoGreaterThan(String value) {
            addCriterion("VNO >", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoGreaterThanOrEqualTo(String value) {
            addCriterion("VNO >=", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoLessThan(String value) {
            addCriterion("VNO <", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoLessThanOrEqualTo(String value) {
            addCriterion("VNO <=", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoLike(String value) {
            addCriterion("VNO like", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoNotLike(String value) {
            addCriterion("VNO not like", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoIn(List<String> values) {
            addCriterion("VNO in", values, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoNotIn(List<String> values) {
            addCriterion("VNO not in", values, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoBetween(String value1, String value2) {
            addCriterion("VNO between", value1, value2, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoNotBetween(String value1, String value2) {
            addCriterion("VNO not between", value1, value2, "vno");
            return (Criteria) this;
        }

        public Criteria andVstartdateIsNull() {
            addCriterion("VSTARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andVstartdateIsNotNull() {
            addCriterion("VSTARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andVstartdateEqualTo(String value) {
            addCriterion("VSTARTDATE =", value, "vstartdate");
            return (Criteria) this;
        }

        public Criteria andVstartdateNotEqualTo(String value) {
            addCriterion("VSTARTDATE <>", value, "vstartdate");
            return (Criteria) this;
        }

        public Criteria andVstartdateGreaterThan(String value) {
            addCriterion("VSTARTDATE >", value, "vstartdate");
            return (Criteria) this;
        }

        public Criteria andVstartdateGreaterThanOrEqualTo(String value) {
            addCriterion("VSTARTDATE >=", value, "vstartdate");
            return (Criteria) this;
        }

        public Criteria andVstartdateLessThan(String value) {
            addCriterion("VSTARTDATE <", value, "vstartdate");
            return (Criteria) this;
        }

        public Criteria andVstartdateLessThanOrEqualTo(String value) {
            addCriterion("VSTARTDATE <=", value, "vstartdate");
            return (Criteria) this;
        }

        public Criteria andVstartdateLike(String value) {
            addCriterion("VSTARTDATE like", value, "vstartdate");
            return (Criteria) this;
        }

        public Criteria andVstartdateNotLike(String value) {
            addCriterion("VSTARTDATE not like", value, "vstartdate");
            return (Criteria) this;
        }

        public Criteria andVstartdateIn(List<String> values) {
            addCriterion("VSTARTDATE in", values, "vstartdate");
            return (Criteria) this;
        }

        public Criteria andVstartdateNotIn(List<String> values) {
            addCriterion("VSTARTDATE not in", values, "vstartdate");
            return (Criteria) this;
        }

        public Criteria andVstartdateBetween(String value1, String value2) {
            addCriterion("VSTARTDATE between", value1, value2, "vstartdate");
            return (Criteria) this;
        }

        public Criteria andVstartdateNotBetween(String value1, String value2) {
            addCriterion("VSTARTDATE not between", value1, value2, "vstartdate");
            return (Criteria) this;
        }

        public Criteria andChargeleaderIsNull() {
            addCriterion("CHARGELEADER is null");
            return (Criteria) this;
        }

        public Criteria andChargeleaderIsNotNull() {
            addCriterion("CHARGELEADER is not null");
            return (Criteria) this;
        }

        public Criteria andChargeleaderEqualTo(String value) {
            addCriterion("CHARGELEADER =", value, "chargeleader");
            return (Criteria) this;
        }

        public Criteria andChargeleaderNotEqualTo(String value) {
            addCriterion("CHARGELEADER <>", value, "chargeleader");
            return (Criteria) this;
        }

        public Criteria andChargeleaderGreaterThan(String value) {
            addCriterion("CHARGELEADER >", value, "chargeleader");
            return (Criteria) this;
        }

        public Criteria andChargeleaderGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGELEADER >=", value, "chargeleader");
            return (Criteria) this;
        }

        public Criteria andChargeleaderLessThan(String value) {
            addCriterion("CHARGELEADER <", value, "chargeleader");
            return (Criteria) this;
        }

        public Criteria andChargeleaderLessThanOrEqualTo(String value) {
            addCriterion("CHARGELEADER <=", value, "chargeleader");
            return (Criteria) this;
        }

        public Criteria andChargeleaderLike(String value) {
            addCriterion("CHARGELEADER like", value, "chargeleader");
            return (Criteria) this;
        }

        public Criteria andChargeleaderNotLike(String value) {
            addCriterion("CHARGELEADER not like", value, "chargeleader");
            return (Criteria) this;
        }

        public Criteria andChargeleaderIn(List<String> values) {
            addCriterion("CHARGELEADER in", values, "chargeleader");
            return (Criteria) this;
        }

        public Criteria andChargeleaderNotIn(List<String> values) {
            addCriterion("CHARGELEADER not in", values, "chargeleader");
            return (Criteria) this;
        }

        public Criteria andChargeleaderBetween(String value1, String value2) {
            addCriterion("CHARGELEADER between", value1, value2, "chargeleader");
            return (Criteria) this;
        }

        public Criteria andChargeleaderNotBetween(String value1, String value2) {
            addCriterion("CHARGELEADER not between", value1, value2, "chargeleader");
            return (Criteria) this;
        }

        public Criteria andEntitytypeIsNull() {
            addCriterion("ENTITYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andEntitytypeIsNotNull() {
            addCriterion("ENTITYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEntitytypeEqualTo(String value) {
            addCriterion("ENTITYTYPE =", value, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeNotEqualTo(String value) {
            addCriterion("ENTITYTYPE <>", value, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeGreaterThan(String value) {
            addCriterion("ENTITYTYPE >", value, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITYTYPE >=", value, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeLessThan(String value) {
            addCriterion("ENTITYTYPE <", value, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeLessThanOrEqualTo(String value) {
            addCriterion("ENTITYTYPE <=", value, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeLike(String value) {
            addCriterion("ENTITYTYPE like", value, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeNotLike(String value) {
            addCriterion("ENTITYTYPE not like", value, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeIn(List<String> values) {
            addCriterion("ENTITYTYPE in", values, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeNotIn(List<String> values) {
            addCriterion("ENTITYTYPE not in", values, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeBetween(String value1, String value2) {
            addCriterion("ENTITYTYPE between", value1, value2, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeNotBetween(String value1, String value2) {
            addCriterion("ENTITYTYPE not between", value1, value2, "entitytype");
            return (Criteria) this;
        }

        public Criteria andIsbalanceunitIsNull() {
            addCriterion("ISBALANCEUNIT is null");
            return (Criteria) this;
        }

        public Criteria andIsbalanceunitIsNotNull() {
            addCriterion("ISBALANCEUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsbalanceunitEqualTo(String value) {
            addCriterion("ISBALANCEUNIT =", value, "isbalanceunit");
            return (Criteria) this;
        }

        public Criteria andIsbalanceunitNotEqualTo(String value) {
            addCriterion("ISBALANCEUNIT <>", value, "isbalanceunit");
            return (Criteria) this;
        }

        public Criteria andIsbalanceunitGreaterThan(String value) {
            addCriterion("ISBALANCEUNIT >", value, "isbalanceunit");
            return (Criteria) this;
        }

        public Criteria andIsbalanceunitGreaterThanOrEqualTo(String value) {
            addCriterion("ISBALANCEUNIT >=", value, "isbalanceunit");
            return (Criteria) this;
        }

        public Criteria andIsbalanceunitLessThan(String value) {
            addCriterion("ISBALANCEUNIT <", value, "isbalanceunit");
            return (Criteria) this;
        }

        public Criteria andIsbalanceunitLessThanOrEqualTo(String value) {
            addCriterion("ISBALANCEUNIT <=", value, "isbalanceunit");
            return (Criteria) this;
        }

        public Criteria andIsbalanceunitLike(String value) {
            addCriterion("ISBALANCEUNIT like", value, "isbalanceunit");
            return (Criteria) this;
        }

        public Criteria andIsbalanceunitNotLike(String value) {
            addCriterion("ISBALANCEUNIT not like", value, "isbalanceunit");
            return (Criteria) this;
        }

        public Criteria andIsbalanceunitIn(List<String> values) {
            addCriterion("ISBALANCEUNIT in", values, "isbalanceunit");
            return (Criteria) this;
        }

        public Criteria andIsbalanceunitNotIn(List<String> values) {
            addCriterion("ISBALANCEUNIT not in", values, "isbalanceunit");
            return (Criteria) this;
        }

        public Criteria andIsbalanceunitBetween(String value1, String value2) {
            addCriterion("ISBALANCEUNIT between", value1, value2, "isbalanceunit");
            return (Criteria) this;
        }

        public Criteria andIsbalanceunitNotBetween(String value1, String value2) {
            addCriterion("ISBALANCEUNIT not between", value1, value2, "isbalanceunit");
            return (Criteria) this;
        }

        public Criteria andIsretailIsNull() {
            addCriterion("ISRETAIL is null");
            return (Criteria) this;
        }

        public Criteria andIsretailIsNotNull() {
            addCriterion("ISRETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andIsretailEqualTo(String value) {
            addCriterion("ISRETAIL =", value, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailNotEqualTo(String value) {
            addCriterion("ISRETAIL <>", value, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailGreaterThan(String value) {
            addCriterion("ISRETAIL >", value, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailGreaterThanOrEqualTo(String value) {
            addCriterion("ISRETAIL >=", value, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailLessThan(String value) {
            addCriterion("ISRETAIL <", value, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailLessThanOrEqualTo(String value) {
            addCriterion("ISRETAIL <=", value, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailLike(String value) {
            addCriterion("ISRETAIL like", value, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailNotLike(String value) {
            addCriterion("ISRETAIL not like", value, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailIn(List<String> values) {
            addCriterion("ISRETAIL in", values, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailNotIn(List<String> values) {
            addCriterion("ISRETAIL not in", values, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailBetween(String value1, String value2) {
            addCriterion("ISRETAIL between", value1, value2, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailNotBetween(String value1, String value2) {
            addCriterion("ISRETAIL not between", value1, value2, "isretail");
            return (Criteria) this;
        }

        public Criteria andPkAccperiodschemeIsNull() {
            addCriterion("PK_ACCPERIODSCHEME is null");
            return (Criteria) this;
        }

        public Criteria andPkAccperiodschemeIsNotNull() {
            addCriterion("PK_ACCPERIODSCHEME is not null");
            return (Criteria) this;
        }

        public Criteria andPkAccperiodschemeEqualTo(String value) {
            addCriterion("PK_ACCPERIODSCHEME =", value, "pkAccperiodscheme");
            return (Criteria) this;
        }

        public Criteria andPkAccperiodschemeNotEqualTo(String value) {
            addCriterion("PK_ACCPERIODSCHEME <>", value, "pkAccperiodscheme");
            return (Criteria) this;
        }

        public Criteria andPkAccperiodschemeGreaterThan(String value) {
            addCriterion("PK_ACCPERIODSCHEME >", value, "pkAccperiodscheme");
            return (Criteria) this;
        }

        public Criteria andPkAccperiodschemeGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ACCPERIODSCHEME >=", value, "pkAccperiodscheme");
            return (Criteria) this;
        }

        public Criteria andPkAccperiodschemeLessThan(String value) {
            addCriterion("PK_ACCPERIODSCHEME <", value, "pkAccperiodscheme");
            return (Criteria) this;
        }

        public Criteria andPkAccperiodschemeLessThanOrEqualTo(String value) {
            addCriterion("PK_ACCPERIODSCHEME <=", value, "pkAccperiodscheme");
            return (Criteria) this;
        }

        public Criteria andPkAccperiodschemeLike(String value) {
            addCriterion("PK_ACCPERIODSCHEME like", value, "pkAccperiodscheme");
            return (Criteria) this;
        }

        public Criteria andPkAccperiodschemeNotLike(String value) {
            addCriterion("PK_ACCPERIODSCHEME not like", value, "pkAccperiodscheme");
            return (Criteria) this;
        }

        public Criteria andPkAccperiodschemeIn(List<String> values) {
            addCriterion("PK_ACCPERIODSCHEME in", values, "pkAccperiodscheme");
            return (Criteria) this;
        }

        public Criteria andPkAccperiodschemeNotIn(List<String> values) {
            addCriterion("PK_ACCPERIODSCHEME not in", values, "pkAccperiodscheme");
            return (Criteria) this;
        }

        public Criteria andPkAccperiodschemeBetween(String value1, String value2) {
            addCriterion("PK_ACCPERIODSCHEME between", value1, value2, "pkAccperiodscheme");
            return (Criteria) this;
        }

        public Criteria andPkAccperiodschemeNotBetween(String value1, String value2) {
            addCriterion("PK_ACCPERIODSCHEME not between", value1, value2, "pkAccperiodscheme");
            return (Criteria) this;
        }

        public Criteria andPkControlareaIsNull() {
            addCriterion("PK_CONTROLAREA is null");
            return (Criteria) this;
        }

        public Criteria andPkControlareaIsNotNull() {
            addCriterion("PK_CONTROLAREA is not null");
            return (Criteria) this;
        }

        public Criteria andPkControlareaEqualTo(String value) {
            addCriterion("PK_CONTROLAREA =", value, "pkControlarea");
            return (Criteria) this;
        }

        public Criteria andPkControlareaNotEqualTo(String value) {
            addCriterion("PK_CONTROLAREA <>", value, "pkControlarea");
            return (Criteria) this;
        }

        public Criteria andPkControlareaGreaterThan(String value) {
            addCriterion("PK_CONTROLAREA >", value, "pkControlarea");
            return (Criteria) this;
        }

        public Criteria andPkControlareaGreaterThanOrEqualTo(String value) {
            addCriterion("PK_CONTROLAREA >=", value, "pkControlarea");
            return (Criteria) this;
        }

        public Criteria andPkControlareaLessThan(String value) {
            addCriterion("PK_CONTROLAREA <", value, "pkControlarea");
            return (Criteria) this;
        }

        public Criteria andPkControlareaLessThanOrEqualTo(String value) {
            addCriterion("PK_CONTROLAREA <=", value, "pkControlarea");
            return (Criteria) this;
        }

        public Criteria andPkControlareaLike(String value) {
            addCriterion("PK_CONTROLAREA like", value, "pkControlarea");
            return (Criteria) this;
        }

        public Criteria andPkControlareaNotLike(String value) {
            addCriterion("PK_CONTROLAREA not like", value, "pkControlarea");
            return (Criteria) this;
        }

        public Criteria andPkControlareaIn(List<String> values) {
            addCriterion("PK_CONTROLAREA in", values, "pkControlarea");
            return (Criteria) this;
        }

        public Criteria andPkControlareaNotIn(List<String> values) {
            addCriterion("PK_CONTROLAREA not in", values, "pkControlarea");
            return (Criteria) this;
        }

        public Criteria andPkControlareaBetween(String value1, String value2) {
            addCriterion("PK_CONTROLAREA between", value1, value2, "pkControlarea");
            return (Criteria) this;
        }

        public Criteria andPkControlareaNotBetween(String value1, String value2) {
            addCriterion("PK_CONTROLAREA not between", value1, value2, "pkControlarea");
            return (Criteria) this;
        }

        public Criteria andPkCorpIsNull() {
            addCriterion("PK_CORP is null");
            return (Criteria) this;
        }

        public Criteria andPkCorpIsNotNull() {
            addCriterion("PK_CORP is not null");
            return (Criteria) this;
        }

        public Criteria andPkCorpEqualTo(String value) {
            addCriterion("PK_CORP =", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpNotEqualTo(String value) {
            addCriterion("PK_CORP <>", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpGreaterThan(String value) {
            addCriterion("PK_CORP >", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpGreaterThanOrEqualTo(String value) {
            addCriterion("PK_CORP >=", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpLessThan(String value) {
            addCriterion("PK_CORP <", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpLessThanOrEqualTo(String value) {
            addCriterion("PK_CORP <=", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpLike(String value) {
            addCriterion("PK_CORP like", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpNotLike(String value) {
            addCriterion("PK_CORP not like", value, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpIn(List<String> values) {
            addCriterion("PK_CORP in", values, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpNotIn(List<String> values) {
            addCriterion("PK_CORP not in", values, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpBetween(String value1, String value2) {
            addCriterion("PK_CORP between", value1, value2, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCorpNotBetween(String value1, String value2) {
            addCriterion("PK_CORP not between", value1, value2, "pkCorp");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeIsNull() {
            addCriterion("PK_CURRTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeIsNotNull() {
            addCriterion("PK_CURRTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeEqualTo(String value) {
            addCriterion("PK_CURRTYPE =", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeNotEqualTo(String value) {
            addCriterion("PK_CURRTYPE <>", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeGreaterThan(String value) {
            addCriterion("PK_CURRTYPE >", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeGreaterThanOrEqualTo(String value) {
            addCriterion("PK_CURRTYPE >=", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeLessThan(String value) {
            addCriterion("PK_CURRTYPE <", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeLessThanOrEqualTo(String value) {
            addCriterion("PK_CURRTYPE <=", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeLike(String value) {
            addCriterion("PK_CURRTYPE like", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeNotLike(String value) {
            addCriterion("PK_CURRTYPE not like", value, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeIn(List<String> values) {
            addCriterion("PK_CURRTYPE in", values, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeNotIn(List<String> values) {
            addCriterion("PK_CURRTYPE not in", values, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeBetween(String value1, String value2) {
            addCriterion("PK_CURRTYPE between", value1, value2, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkCurrtypeNotBetween(String value1, String value2) {
            addCriterion("PK_CURRTYPE not between", value1, value2, "pkCurrtype");
            return (Criteria) this;
        }

        public Criteria andPkExrateschemeIsNull() {
            addCriterion("PK_EXRATESCHEME is null");
            return (Criteria) this;
        }

        public Criteria andPkExrateschemeIsNotNull() {
            addCriterion("PK_EXRATESCHEME is not null");
            return (Criteria) this;
        }

        public Criteria andPkExrateschemeEqualTo(String value) {
            addCriterion("PK_EXRATESCHEME =", value, "pkExratescheme");
            return (Criteria) this;
        }

        public Criteria andPkExrateschemeNotEqualTo(String value) {
            addCriterion("PK_EXRATESCHEME <>", value, "pkExratescheme");
            return (Criteria) this;
        }

        public Criteria andPkExrateschemeGreaterThan(String value) {
            addCriterion("PK_EXRATESCHEME >", value, "pkExratescheme");
            return (Criteria) this;
        }

        public Criteria andPkExrateschemeGreaterThanOrEqualTo(String value) {
            addCriterion("PK_EXRATESCHEME >=", value, "pkExratescheme");
            return (Criteria) this;
        }

        public Criteria andPkExrateschemeLessThan(String value) {
            addCriterion("PK_EXRATESCHEME <", value, "pkExratescheme");
            return (Criteria) this;
        }

        public Criteria andPkExrateschemeLessThanOrEqualTo(String value) {
            addCriterion("PK_EXRATESCHEME <=", value, "pkExratescheme");
            return (Criteria) this;
        }

        public Criteria andPkExrateschemeLike(String value) {
            addCriterion("PK_EXRATESCHEME like", value, "pkExratescheme");
            return (Criteria) this;
        }

        public Criteria andPkExrateschemeNotLike(String value) {
            addCriterion("PK_EXRATESCHEME not like", value, "pkExratescheme");
            return (Criteria) this;
        }

        public Criteria andPkExrateschemeIn(List<String> values) {
            addCriterion("PK_EXRATESCHEME in", values, "pkExratescheme");
            return (Criteria) this;
        }

        public Criteria andPkExrateschemeNotIn(List<String> values) {
            addCriterion("PK_EXRATESCHEME not in", values, "pkExratescheme");
            return (Criteria) this;
        }

        public Criteria andPkExrateschemeBetween(String value1, String value2) {
            addCriterion("PK_EXRATESCHEME between", value1, value2, "pkExratescheme");
            return (Criteria) this;
        }

        public Criteria andPkExrateschemeNotBetween(String value1, String value2) {
            addCriterion("PK_EXRATESCHEME not between", value1, value2, "pkExratescheme");
            return (Criteria) this;
        }

        public Criteria andReportconfirmIsNull() {
            addCriterion("REPORTCONFIRM is null");
            return (Criteria) this;
        }

        public Criteria andReportconfirmIsNotNull() {
            addCriterion("REPORTCONFIRM is not null");
            return (Criteria) this;
        }

        public Criteria andReportconfirmEqualTo(String value) {
            addCriterion("REPORTCONFIRM =", value, "reportconfirm");
            return (Criteria) this;
        }

        public Criteria andReportconfirmNotEqualTo(String value) {
            addCriterion("REPORTCONFIRM <>", value, "reportconfirm");
            return (Criteria) this;
        }

        public Criteria andReportconfirmGreaterThan(String value) {
            addCriterion("REPORTCONFIRM >", value, "reportconfirm");
            return (Criteria) this;
        }

        public Criteria andReportconfirmGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTCONFIRM >=", value, "reportconfirm");
            return (Criteria) this;
        }

        public Criteria andReportconfirmLessThan(String value) {
            addCriterion("REPORTCONFIRM <", value, "reportconfirm");
            return (Criteria) this;
        }

        public Criteria andReportconfirmLessThanOrEqualTo(String value) {
            addCriterion("REPORTCONFIRM <=", value, "reportconfirm");
            return (Criteria) this;
        }

        public Criteria andReportconfirmLike(String value) {
            addCriterion("REPORTCONFIRM like", value, "reportconfirm");
            return (Criteria) this;
        }

        public Criteria andReportconfirmNotLike(String value) {
            addCriterion("REPORTCONFIRM not like", value, "reportconfirm");
            return (Criteria) this;
        }

        public Criteria andReportconfirmIn(List<String> values) {
            addCriterion("REPORTCONFIRM in", values, "reportconfirm");
            return (Criteria) this;
        }

        public Criteria andReportconfirmNotIn(List<String> values) {
            addCriterion("REPORTCONFIRM not in", values, "reportconfirm");
            return (Criteria) this;
        }

        public Criteria andReportconfirmBetween(String value1, String value2) {
            addCriterion("REPORTCONFIRM between", value1, value2, "reportconfirm");
            return (Criteria) this;
        }

        public Criteria andReportconfirmNotBetween(String value1, String value2) {
            addCriterion("REPORTCONFIRM not between", value1, value2, "reportconfirm");
            return (Criteria) this;
        }

        public Criteria andWorkcalendarIsNull() {
            addCriterion("WORKCALENDAR is null");
            return (Criteria) this;
        }

        public Criteria andWorkcalendarIsNotNull() {
            addCriterion("WORKCALENDAR is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcalendarEqualTo(String value) {
            addCriterion("WORKCALENDAR =", value, "workcalendar");
            return (Criteria) this;
        }

        public Criteria andWorkcalendarNotEqualTo(String value) {
            addCriterion("WORKCALENDAR <>", value, "workcalendar");
            return (Criteria) this;
        }

        public Criteria andWorkcalendarGreaterThan(String value) {
            addCriterion("WORKCALENDAR >", value, "workcalendar");
            return (Criteria) this;
        }

        public Criteria andWorkcalendarGreaterThanOrEqualTo(String value) {
            addCriterion("WORKCALENDAR >=", value, "workcalendar");
            return (Criteria) this;
        }

        public Criteria andWorkcalendarLessThan(String value) {
            addCriterion("WORKCALENDAR <", value, "workcalendar");
            return (Criteria) this;
        }

        public Criteria andWorkcalendarLessThanOrEqualTo(String value) {
            addCriterion("WORKCALENDAR <=", value, "workcalendar");
            return (Criteria) this;
        }

        public Criteria andWorkcalendarLike(String value) {
            addCriterion("WORKCALENDAR like", value, "workcalendar");
            return (Criteria) this;
        }

        public Criteria andWorkcalendarNotLike(String value) {
            addCriterion("WORKCALENDAR not like", value, "workcalendar");
            return (Criteria) this;
        }

        public Criteria andWorkcalendarIn(List<String> values) {
            addCriterion("WORKCALENDAR in", values, "workcalendar");
            return (Criteria) this;
        }

        public Criteria andWorkcalendarNotIn(List<String> values) {
            addCriterion("WORKCALENDAR not in", values, "workcalendar");
            return (Criteria) this;
        }

        public Criteria andWorkcalendarBetween(String value1, String value2) {
            addCriterion("WORKCALENDAR between", value1, value2, "workcalendar");
            return (Criteria) this;
        }

        public Criteria andWorkcalendarNotBetween(String value1, String value2) {
            addCriterion("WORKCALENDAR not between", value1, value2, "workcalendar");
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