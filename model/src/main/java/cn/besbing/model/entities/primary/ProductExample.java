package cn.besbing.model.entities.primary;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("VERSION not between", value1, value2, "version");
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

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCostFactorIsNull() {
            addCriterion("COST_FACTOR is null");
            return (Criteria) this;
        }

        public Criteria andCostFactorIsNotNull() {
            addCriterion("COST_FACTOR is not null");
            return (Criteria) this;
        }

        public Criteria andCostFactorEqualTo(BigDecimal value) {
            addCriterion("COST_FACTOR =", value, "costFactor");
            return (Criteria) this;
        }

        public Criteria andCostFactorNotEqualTo(BigDecimal value) {
            addCriterion("COST_FACTOR <>", value, "costFactor");
            return (Criteria) this;
        }

        public Criteria andCostFactorGreaterThan(BigDecimal value) {
            addCriterion("COST_FACTOR >", value, "costFactor");
            return (Criteria) this;
        }

        public Criteria andCostFactorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_FACTOR >=", value, "costFactor");
            return (Criteria) this;
        }

        public Criteria andCostFactorLessThan(BigDecimal value) {
            addCriterion("COST_FACTOR <", value, "costFactor");
            return (Criteria) this;
        }

        public Criteria andCostFactorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_FACTOR <=", value, "costFactor");
            return (Criteria) this;
        }

        public Criteria andCostFactorIn(List<BigDecimal> values) {
            addCriterion("COST_FACTOR in", values, "costFactor");
            return (Criteria) this;
        }

        public Criteria andCostFactorNotIn(List<BigDecimal> values) {
            addCriterion("COST_FACTOR not in", values, "costFactor");
            return (Criteria) this;
        }

        public Criteria andCostFactorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_FACTOR between", value1, value2, "costFactor");
            return (Criteria) this;
        }

        public Criteria andCostFactorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_FACTOR not between", value1, value2, "costFactor");
            return (Criteria) this;
        }

        public Criteria andChangedOnIsNull() {
            addCriterion("CHANGED_ON is null");
            return (Criteria) this;
        }

        public Criteria andChangedOnIsNotNull() {
            addCriterion("CHANGED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andChangedOnEqualTo(Date value) {
            addCriterionForJDBCDate("CHANGED_ON =", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("CHANGED_ON <>", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnGreaterThan(Date value) {
            addCriterionForJDBCDate("CHANGED_ON >", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHANGED_ON >=", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnLessThan(Date value) {
            addCriterionForJDBCDate("CHANGED_ON <", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHANGED_ON <=", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnIn(List<Date> values) {
            addCriterionForJDBCDate("CHANGED_ON in", values, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("CHANGED_ON not in", values, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHANGED_ON between", value1, value2, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHANGED_ON not between", value1, value2, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedByIsNull() {
            addCriterion("CHANGED_BY is null");
            return (Criteria) this;
        }

        public Criteria andChangedByIsNotNull() {
            addCriterion("CHANGED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andChangedByEqualTo(String value) {
            addCriterion("CHANGED_BY =", value, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByNotEqualTo(String value) {
            addCriterion("CHANGED_BY <>", value, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByGreaterThan(String value) {
            addCriterion("CHANGED_BY >", value, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGED_BY >=", value, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByLessThan(String value) {
            addCriterion("CHANGED_BY <", value, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByLessThanOrEqualTo(String value) {
            addCriterion("CHANGED_BY <=", value, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByLike(String value) {
            addCriterion("CHANGED_BY like", value, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByNotLike(String value) {
            addCriterion("CHANGED_BY not like", value, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByIn(List<String> values) {
            addCriterion("CHANGED_BY in", values, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByNotIn(List<String> values) {
            addCriterion("CHANGED_BY not in", values, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByBetween(String value1, String value2) {
            addCriterion("CHANGED_BY between", value1, value2, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByNotBetween(String value1, String value2) {
            addCriterion("CHANGED_BY not between", value1, value2, "changedBy");
            return (Criteria) this;
        }

        public Criteria andRemovedIsNull() {
            addCriterion("REMOVED is null");
            return (Criteria) this;
        }

        public Criteria andRemovedIsNotNull() {
            addCriterion("REMOVED is not null");
            return (Criteria) this;
        }

        public Criteria andRemovedEqualTo(String value) {
            addCriterion("REMOVED =", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedNotEqualTo(String value) {
            addCriterion("REMOVED <>", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedGreaterThan(String value) {
            addCriterion("REMOVED >", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedGreaterThanOrEqualTo(String value) {
            addCriterion("REMOVED >=", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedLessThan(String value) {
            addCriterion("REMOVED <", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedLessThanOrEqualTo(String value) {
            addCriterion("REMOVED <=", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedLike(String value) {
            addCriterion("REMOVED like", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedNotLike(String value) {
            addCriterion("REMOVED not like", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedIn(List<String> values) {
            addCriterion("REMOVED in", values, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedNotIn(List<String> values) {
            addCriterion("REMOVED not in", values, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedBetween(String value1, String value2) {
            addCriterion("REMOVED between", value1, value2, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedNotBetween(String value1, String value2) {
            addCriterion("REMOVED not between", value1, value2, "removed");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("GROUP_NAME =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("GROUP_NAME <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("GROUP_NAME >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("GROUP_NAME <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("GROUP_NAME like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("GROUP_NAME not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("GROUP_NAME in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("GROUP_NAME not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("GROUP_NAME between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("GROUP_NAME not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andExtLinkIsNull() {
            addCriterion("EXT_LINK is null");
            return (Criteria) this;
        }

        public Criteria andExtLinkIsNotNull() {
            addCriterion("EXT_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andExtLinkEqualTo(String value) {
            addCriterion("EXT_LINK =", value, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkNotEqualTo(String value) {
            addCriterion("EXT_LINK <>", value, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkGreaterThan(String value) {
            addCriterion("EXT_LINK >", value, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkGreaterThanOrEqualTo(String value) {
            addCriterion("EXT_LINK >=", value, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkLessThan(String value) {
            addCriterion("EXT_LINK <", value, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkLessThanOrEqualTo(String value) {
            addCriterion("EXT_LINK <=", value, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkLike(String value) {
            addCriterion("EXT_LINK like", value, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkNotLike(String value) {
            addCriterion("EXT_LINK not like", value, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkIn(List<String> values) {
            addCriterion("EXT_LINK in", values, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkNotIn(List<String> values) {
            addCriterion("EXT_LINK not in", values, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkBetween(String value1, String value2) {
            addCriterion("EXT_LINK between", value1, value2, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkNotBetween(String value1, String value2) {
            addCriterion("EXT_LINK not between", value1, value2, "extLink");
            return (Criteria) this;
        }

        public Criteria andTestListIsNull() {
            addCriterion("TEST_LIST is null");
            return (Criteria) this;
        }

        public Criteria andTestListIsNotNull() {
            addCriterion("TEST_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andTestListEqualTo(String value) {
            addCriterion("TEST_LIST =", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListNotEqualTo(String value) {
            addCriterion("TEST_LIST <>", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListGreaterThan(String value) {
            addCriterion("TEST_LIST >", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_LIST >=", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListLessThan(String value) {
            addCriterion("TEST_LIST <", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListLessThanOrEqualTo(String value) {
            addCriterion("TEST_LIST <=", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListLike(String value) {
            addCriterion("TEST_LIST like", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListNotLike(String value) {
            addCriterion("TEST_LIST not like", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListIn(List<String> values) {
            addCriterion("TEST_LIST in", values, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListNotIn(List<String> values) {
            addCriterion("TEST_LIST not in", values, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListBetween(String value1, String value2) {
            addCriterion("TEST_LIST between", value1, value2, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListNotBetween(String value1, String value2) {
            addCriterion("TEST_LIST not between", value1, value2, "testList");
            return (Criteria) this;
        }

        public Criteria andFullTestFreqIsNull() {
            addCriterion("FULL_TEST_FREQ is null");
            return (Criteria) this;
        }

        public Criteria andFullTestFreqIsNotNull() {
            addCriterion("FULL_TEST_FREQ is not null");
            return (Criteria) this;
        }

        public Criteria andFullTestFreqEqualTo(Long value) {
            addCriterion("FULL_TEST_FREQ =", value, "fullTestFreq");
            return (Criteria) this;
        }

        public Criteria andFullTestFreqNotEqualTo(Long value) {
            addCriterion("FULL_TEST_FREQ <>", value, "fullTestFreq");
            return (Criteria) this;
        }

        public Criteria andFullTestFreqGreaterThan(Long value) {
            addCriterion("FULL_TEST_FREQ >", value, "fullTestFreq");
            return (Criteria) this;
        }

        public Criteria andFullTestFreqGreaterThanOrEqualTo(Long value) {
            addCriterion("FULL_TEST_FREQ >=", value, "fullTestFreq");
            return (Criteria) this;
        }

        public Criteria andFullTestFreqLessThan(Long value) {
            addCriterion("FULL_TEST_FREQ <", value, "fullTestFreq");
            return (Criteria) this;
        }

        public Criteria andFullTestFreqLessThanOrEqualTo(Long value) {
            addCriterion("FULL_TEST_FREQ <=", value, "fullTestFreq");
            return (Criteria) this;
        }

        public Criteria andFullTestFreqIn(List<Long> values) {
            addCriterion("FULL_TEST_FREQ in", values, "fullTestFreq");
            return (Criteria) this;
        }

        public Criteria andFullTestFreqNotIn(List<Long> values) {
            addCriterion("FULL_TEST_FREQ not in", values, "fullTestFreq");
            return (Criteria) this;
        }

        public Criteria andFullTestFreqBetween(Long value1, Long value2) {
            addCriterion("FULL_TEST_FREQ between", value1, value2, "fullTestFreq");
            return (Criteria) this;
        }

        public Criteria andFullTestFreqNotBetween(Long value1, Long value2) {
            addCriterion("FULL_TEST_FREQ not between", value1, value2, "fullTestFreq");
            return (Criteria) this;
        }

        public Criteria andLotsToGoIsNull() {
            addCriterion("LOTS_TO_GO is null");
            return (Criteria) this;
        }

        public Criteria andLotsToGoIsNotNull() {
            addCriterion("LOTS_TO_GO is not null");
            return (Criteria) this;
        }

        public Criteria andLotsToGoEqualTo(Long value) {
            addCriterion("LOTS_TO_GO =", value, "lotsToGo");
            return (Criteria) this;
        }

        public Criteria andLotsToGoNotEqualTo(Long value) {
            addCriterion("LOTS_TO_GO <>", value, "lotsToGo");
            return (Criteria) this;
        }

        public Criteria andLotsToGoGreaterThan(Long value) {
            addCriterion("LOTS_TO_GO >", value, "lotsToGo");
            return (Criteria) this;
        }

        public Criteria andLotsToGoGreaterThanOrEqualTo(Long value) {
            addCriterion("LOTS_TO_GO >=", value, "lotsToGo");
            return (Criteria) this;
        }

        public Criteria andLotsToGoLessThan(Long value) {
            addCriterion("LOTS_TO_GO <", value, "lotsToGo");
            return (Criteria) this;
        }

        public Criteria andLotsToGoLessThanOrEqualTo(Long value) {
            addCriterion("LOTS_TO_GO <=", value, "lotsToGo");
            return (Criteria) this;
        }

        public Criteria andLotsToGoIn(List<Long> values) {
            addCriterion("LOTS_TO_GO in", values, "lotsToGo");
            return (Criteria) this;
        }

        public Criteria andLotsToGoNotIn(List<Long> values) {
            addCriterion("LOTS_TO_GO not in", values, "lotsToGo");
            return (Criteria) this;
        }

        public Criteria andLotsToGoBetween(Long value1, Long value2) {
            addCriterion("LOTS_TO_GO between", value1, value2, "lotsToGo");
            return (Criteria) this;
        }

        public Criteria andLotsToGoNotBetween(Long value1, Long value2) {
            addCriterion("LOTS_TO_GO not between", value1, value2, "lotsToGo");
            return (Criteria) this;
        }

        public Criteria andReportFormatIsNull() {
            addCriterion("REPORT_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andReportFormatIsNotNull() {
            addCriterion("REPORT_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andReportFormatEqualTo(String value) {
            addCriterion("REPORT_FORMAT =", value, "reportFormat");
            return (Criteria) this;
        }

        public Criteria andReportFormatNotEqualTo(String value) {
            addCriterion("REPORT_FORMAT <>", value, "reportFormat");
            return (Criteria) this;
        }

        public Criteria andReportFormatGreaterThan(String value) {
            addCriterion("REPORT_FORMAT >", value, "reportFormat");
            return (Criteria) this;
        }

        public Criteria andReportFormatGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_FORMAT >=", value, "reportFormat");
            return (Criteria) this;
        }

        public Criteria andReportFormatLessThan(String value) {
            addCriterion("REPORT_FORMAT <", value, "reportFormat");
            return (Criteria) this;
        }

        public Criteria andReportFormatLessThanOrEqualTo(String value) {
            addCriterion("REPORT_FORMAT <=", value, "reportFormat");
            return (Criteria) this;
        }

        public Criteria andReportFormatLike(String value) {
            addCriterion("REPORT_FORMAT like", value, "reportFormat");
            return (Criteria) this;
        }

        public Criteria andReportFormatNotLike(String value) {
            addCriterion("REPORT_FORMAT not like", value, "reportFormat");
            return (Criteria) this;
        }

        public Criteria andReportFormatIn(List<String> values) {
            addCriterion("REPORT_FORMAT in", values, "reportFormat");
            return (Criteria) this;
        }

        public Criteria andReportFormatNotIn(List<String> values) {
            addCriterion("REPORT_FORMAT not in", values, "reportFormat");
            return (Criteria) this;
        }

        public Criteria andReportFormatBetween(String value1, String value2) {
            addCriterion("REPORT_FORMAT between", value1, value2, "reportFormat");
            return (Criteria) this;
        }

        public Criteria andReportFormatNotBetween(String value1, String value2) {
            addCriterion("REPORT_FORMAT not between", value1, value2, "reportFormat");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("ACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("ACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(String value) {
            addCriterion("ACTIVE =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(String value) {
            addCriterion("ACTIVE <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(String value) {
            addCriterion("ACTIVE >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVE >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(String value) {
            addCriterion("ACTIVE <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(String value) {
            addCriterion("ACTIVE <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLike(String value) {
            addCriterion("ACTIVE like", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotLike(String value) {
            addCriterion("ACTIVE not like", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<String> values) {
            addCriterion("ACTIVE in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<String> values) {
            addCriterion("ACTIVE not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(String value1, String value2) {
            addCriterion("ACTIVE between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(String value1, String value2) {
            addCriterion("ACTIVE not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andSamplePlanIsNull() {
            addCriterion("SAMPLE_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andSamplePlanIsNotNull() {
            addCriterion("SAMPLE_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andSamplePlanEqualTo(String value) {
            addCriterion("SAMPLE_PLAN =", value, "samplePlan");
            return (Criteria) this;
        }

        public Criteria andSamplePlanNotEqualTo(String value) {
            addCriterion("SAMPLE_PLAN <>", value, "samplePlan");
            return (Criteria) this;
        }

        public Criteria andSamplePlanGreaterThan(String value) {
            addCriterion("SAMPLE_PLAN >", value, "samplePlan");
            return (Criteria) this;
        }

        public Criteria andSamplePlanGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_PLAN >=", value, "samplePlan");
            return (Criteria) this;
        }

        public Criteria andSamplePlanLessThan(String value) {
            addCriterion("SAMPLE_PLAN <", value, "samplePlan");
            return (Criteria) this;
        }

        public Criteria andSamplePlanLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_PLAN <=", value, "samplePlan");
            return (Criteria) this;
        }

        public Criteria andSamplePlanLike(String value) {
            addCriterion("SAMPLE_PLAN like", value, "samplePlan");
            return (Criteria) this;
        }

        public Criteria andSamplePlanNotLike(String value) {
            addCriterion("SAMPLE_PLAN not like", value, "samplePlan");
            return (Criteria) this;
        }

        public Criteria andSamplePlanIn(List<String> values) {
            addCriterion("SAMPLE_PLAN in", values, "samplePlan");
            return (Criteria) this;
        }

        public Criteria andSamplePlanNotIn(List<String> values) {
            addCriterion("SAMPLE_PLAN not in", values, "samplePlan");
            return (Criteria) this;
        }

        public Criteria andSamplePlanBetween(String value1, String value2) {
            addCriterion("SAMPLE_PLAN between", value1, value2, "samplePlan");
            return (Criteria) this;
        }

        public Criteria andSamplePlanNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_PLAN not between", value1, value2, "samplePlan");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIsNull() {
            addCriterion("EFFECTIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIsNotNull() {
            addCriterion("EFFECTIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateEqualTo(Date value) {
            addCriterionForJDBCDate("EFFECTIVE_DATE =", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("EFFECTIVE_DATE <>", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("EFFECTIVE_DATE >", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EFFECTIVE_DATE >=", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateLessThan(Date value) {
            addCriterionForJDBCDate("EFFECTIVE_DATE <", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EFFECTIVE_DATE <=", value, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateIn(List<Date> values) {
            addCriterionForJDBCDate("EFFECTIVE_DATE in", values, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("EFFECTIVE_DATE not in", values, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EFFECTIVE_DATE between", value1, value2, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EFFECTIVE_DATE not between", value1, value2, "effectiveDate");
            return (Criteria) this;
        }

        public Criteria andApprovedIsNull() {
            addCriterion("APPROVED is null");
            return (Criteria) this;
        }

        public Criteria andApprovedIsNotNull() {
            addCriterion("APPROVED is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedEqualTo(String value) {
            addCriterion("APPROVED =", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedNotEqualTo(String value) {
            addCriterion("APPROVED <>", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedGreaterThan(String value) {
            addCriterion("APPROVED >", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVED >=", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedLessThan(String value) {
            addCriterion("APPROVED <", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedLessThanOrEqualTo(String value) {
            addCriterion("APPROVED <=", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedLike(String value) {
            addCriterion("APPROVED like", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedNotLike(String value) {
            addCriterion("APPROVED not like", value, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedIn(List<String> values) {
            addCriterion("APPROVED in", values, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedNotIn(List<String> values) {
            addCriterion("APPROVED not in", values, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedBetween(String value1, String value2) {
            addCriterion("APPROVED between", value1, value2, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovedNotBetween(String value1, String value2) {
            addCriterion("APPROVED not between", value1, value2, "approved");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupIsNull() {
            addCriterion("APPROVAL_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupIsNotNull() {
            addCriterion("APPROVAL_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupEqualTo(String value) {
            addCriterion("APPROVAL_GROUP =", value, "approvalGroup");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupNotEqualTo(String value) {
            addCriterion("APPROVAL_GROUP <>", value, "approvalGroup");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupGreaterThan(String value) {
            addCriterion("APPROVAL_GROUP >", value, "approvalGroup");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVAL_GROUP >=", value, "approvalGroup");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupLessThan(String value) {
            addCriterion("APPROVAL_GROUP <", value, "approvalGroup");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupLessThanOrEqualTo(String value) {
            addCriterion("APPROVAL_GROUP <=", value, "approvalGroup");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupLike(String value) {
            addCriterion("APPROVAL_GROUP like", value, "approvalGroup");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupNotLike(String value) {
            addCriterion("APPROVAL_GROUP not like", value, "approvalGroup");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupIn(List<String> values) {
            addCriterion("APPROVAL_GROUP in", values, "approvalGroup");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupNotIn(List<String> values) {
            addCriterion("APPROVAL_GROUP not in", values, "approvalGroup");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupBetween(String value1, String value2) {
            addCriterion("APPROVAL_GROUP between", value1, value2, "approvalGroup");
            return (Criteria) this;
        }

        public Criteria andApprovalGroupNotBetween(String value1, String value2) {
            addCriterion("APPROVAL_GROUP not between", value1, value2, "approvalGroup");
            return (Criteria) this;
        }

        public Criteria andReadyForApprovalIsNull() {
            addCriterion("READY_FOR_APPROVAL is null");
            return (Criteria) this;
        }

        public Criteria andReadyForApprovalIsNotNull() {
            addCriterion("READY_FOR_APPROVAL is not null");
            return (Criteria) this;
        }

        public Criteria andReadyForApprovalEqualTo(String value) {
            addCriterion("READY_FOR_APPROVAL =", value, "readyForApproval");
            return (Criteria) this;
        }

        public Criteria andReadyForApprovalNotEqualTo(String value) {
            addCriterion("READY_FOR_APPROVAL <>", value, "readyForApproval");
            return (Criteria) this;
        }

        public Criteria andReadyForApprovalGreaterThan(String value) {
            addCriterion("READY_FOR_APPROVAL >", value, "readyForApproval");
            return (Criteria) this;
        }

        public Criteria andReadyForApprovalGreaterThanOrEqualTo(String value) {
            addCriterion("READY_FOR_APPROVAL >=", value, "readyForApproval");
            return (Criteria) this;
        }

        public Criteria andReadyForApprovalLessThan(String value) {
            addCriterion("READY_FOR_APPROVAL <", value, "readyForApproval");
            return (Criteria) this;
        }

        public Criteria andReadyForApprovalLessThanOrEqualTo(String value) {
            addCriterion("READY_FOR_APPROVAL <=", value, "readyForApproval");
            return (Criteria) this;
        }

        public Criteria andReadyForApprovalLike(String value) {
            addCriterion("READY_FOR_APPROVAL like", value, "readyForApproval");
            return (Criteria) this;
        }

        public Criteria andReadyForApprovalNotLike(String value) {
            addCriterion("READY_FOR_APPROVAL not like", value, "readyForApproval");
            return (Criteria) this;
        }

        public Criteria andReadyForApprovalIn(List<String> values) {
            addCriterion("READY_FOR_APPROVAL in", values, "readyForApproval");
            return (Criteria) this;
        }

        public Criteria andReadyForApprovalNotIn(List<String> values) {
            addCriterion("READY_FOR_APPROVAL not in", values, "readyForApproval");
            return (Criteria) this;
        }

        public Criteria andReadyForApprovalBetween(String value1, String value2) {
            addCriterion("READY_FOR_APPROVAL between", value1, value2, "readyForApproval");
            return (Criteria) this;
        }

        public Criteria andReadyForApprovalNotBetween(String value1, String value2) {
            addCriterion("READY_FOR_APPROVAL not between", value1, value2, "readyForApproval");
            return (Criteria) this;
        }

        public Criteria andApprovalIdIsNull() {
            addCriterion("APPROVAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andApprovalIdIsNotNull() {
            addCriterion("APPROVAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalIdEqualTo(Long value) {
            addCriterion("APPROVAL_ID =", value, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdNotEqualTo(Long value) {
            addCriterion("APPROVAL_ID <>", value, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdGreaterThan(Long value) {
            addCriterion("APPROVAL_ID >", value, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdGreaterThanOrEqualTo(Long value) {
            addCriterion("APPROVAL_ID >=", value, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdLessThan(Long value) {
            addCriterion("APPROVAL_ID <", value, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdLessThanOrEqualTo(Long value) {
            addCriterion("APPROVAL_ID <=", value, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdIn(List<Long> values) {
            addCriterion("APPROVAL_ID in", values, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdNotIn(List<Long> values) {
            addCriterion("APPROVAL_ID not in", values, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdBetween(Long value1, Long value2) {
            addCriterion("APPROVAL_ID between", value1, value2, "approvalId");
            return (Criteria) this;
        }

        public Criteria andApprovalIdNotBetween(Long value1, Long value2) {
            addCriterion("APPROVAL_ID not between", value1, value2, "approvalId");
            return (Criteria) this;
        }

        public Criteria andTemplateIsNull() {
            addCriterion("TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIsNotNull() {
            addCriterion("TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateEqualTo(String value) {
            addCriterion("TEMPLATE =", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotEqualTo(String value) {
            addCriterion("TEMPLATE <>", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThan(String value) {
            addCriterion("TEMPLATE >", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE >=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThan(String value) {
            addCriterion("TEMPLATE <", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE <=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLike(String value) {
            addCriterion("TEMPLATE like", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotLike(String value) {
            addCriterion("TEMPLATE not like", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateIn(List<String> values) {
            addCriterion("TEMPLATE in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotIn(List<String> values) {
            addCriterion("TEMPLATE not in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateBetween(String value1, String value2) {
            addCriterion("TEMPLATE between", value1, value2, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE not between", value1, value2, "template");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateIsNull() {
            addCriterion("GRADE_TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateIsNotNull() {
            addCriterion("GRADE_TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateEqualTo(String value) {
            addCriterion("GRADE_TEMPLATE =", value, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNotEqualTo(String value) {
            addCriterion("GRADE_TEMPLATE <>", value, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateGreaterThan(String value) {
            addCriterion("GRADE_TEMPLATE >", value, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE_TEMPLATE >=", value, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateLessThan(String value) {
            addCriterion("GRADE_TEMPLATE <", value, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateLessThanOrEqualTo(String value) {
            addCriterion("GRADE_TEMPLATE <=", value, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateLike(String value) {
            addCriterion("GRADE_TEMPLATE like", value, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNotLike(String value) {
            addCriterion("GRADE_TEMPLATE not like", value, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateIn(List<String> values) {
            addCriterion("GRADE_TEMPLATE in", values, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNotIn(List<String> values) {
            addCriterion("GRADE_TEMPLATE not in", values, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateBetween(String value1, String value2) {
            addCriterion("GRADE_TEMPLATE between", value1, value2, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andGradeTemplateNotBetween(String value1, String value2) {
            addCriterion("GRADE_TEMPLATE not between", value1, value2, "gradeTemplate");
            return (Criteria) this;
        }

        public Criteria andStageTemplateIsNull() {
            addCriterion("STAGE_TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andStageTemplateIsNotNull() {
            addCriterion("STAGE_TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andStageTemplateEqualTo(String value) {
            addCriterion("STAGE_TEMPLATE =", value, "stageTemplate");
            return (Criteria) this;
        }

        public Criteria andStageTemplateNotEqualTo(String value) {
            addCriterion("STAGE_TEMPLATE <>", value, "stageTemplate");
            return (Criteria) this;
        }

        public Criteria andStageTemplateGreaterThan(String value) {
            addCriterion("STAGE_TEMPLATE >", value, "stageTemplate");
            return (Criteria) this;
        }

        public Criteria andStageTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE_TEMPLATE >=", value, "stageTemplate");
            return (Criteria) this;
        }

        public Criteria andStageTemplateLessThan(String value) {
            addCriterion("STAGE_TEMPLATE <", value, "stageTemplate");
            return (Criteria) this;
        }

        public Criteria andStageTemplateLessThanOrEqualTo(String value) {
            addCriterion("STAGE_TEMPLATE <=", value, "stageTemplate");
            return (Criteria) this;
        }

        public Criteria andStageTemplateLike(String value) {
            addCriterion("STAGE_TEMPLATE like", value, "stageTemplate");
            return (Criteria) this;
        }

        public Criteria andStageTemplateNotLike(String value) {
            addCriterion("STAGE_TEMPLATE not like", value, "stageTemplate");
            return (Criteria) this;
        }

        public Criteria andStageTemplateIn(List<String> values) {
            addCriterion("STAGE_TEMPLATE in", values, "stageTemplate");
            return (Criteria) this;
        }

        public Criteria andStageTemplateNotIn(List<String> values) {
            addCriterion("STAGE_TEMPLATE not in", values, "stageTemplate");
            return (Criteria) this;
        }

        public Criteria andStageTemplateBetween(String value1, String value2) {
            addCriterion("STAGE_TEMPLATE between", value1, value2, "stageTemplate");
            return (Criteria) this;
        }

        public Criteria andStageTemplateNotBetween(String value1, String value2) {
            addCriterion("STAGE_TEMPLATE not between", value1, value2, "stageTemplate");
            return (Criteria) this;
        }

        public Criteria andNumericSpecTempIsNull() {
            addCriterion("NUMERIC_SPEC_TEMP is null");
            return (Criteria) this;
        }

        public Criteria andNumericSpecTempIsNotNull() {
            addCriterion("NUMERIC_SPEC_TEMP is not null");
            return (Criteria) this;
        }

        public Criteria andNumericSpecTempEqualTo(String value) {
            addCriterion("NUMERIC_SPEC_TEMP =", value, "numericSpecTemp");
            return (Criteria) this;
        }

        public Criteria andNumericSpecTempNotEqualTo(String value) {
            addCriterion("NUMERIC_SPEC_TEMP <>", value, "numericSpecTemp");
            return (Criteria) this;
        }

        public Criteria andNumericSpecTempGreaterThan(String value) {
            addCriterion("NUMERIC_SPEC_TEMP >", value, "numericSpecTemp");
            return (Criteria) this;
        }

        public Criteria andNumericSpecTempGreaterThanOrEqualTo(String value) {
            addCriterion("NUMERIC_SPEC_TEMP >=", value, "numericSpecTemp");
            return (Criteria) this;
        }

        public Criteria andNumericSpecTempLessThan(String value) {
            addCriterion("NUMERIC_SPEC_TEMP <", value, "numericSpecTemp");
            return (Criteria) this;
        }

        public Criteria andNumericSpecTempLessThanOrEqualTo(String value) {
            addCriterion("NUMERIC_SPEC_TEMP <=", value, "numericSpecTemp");
            return (Criteria) this;
        }

        public Criteria andNumericSpecTempLike(String value) {
            addCriterion("NUMERIC_SPEC_TEMP like", value, "numericSpecTemp");
            return (Criteria) this;
        }

        public Criteria andNumericSpecTempNotLike(String value) {
            addCriterion("NUMERIC_SPEC_TEMP not like", value, "numericSpecTemp");
            return (Criteria) this;
        }

        public Criteria andNumericSpecTempIn(List<String> values) {
            addCriterion("NUMERIC_SPEC_TEMP in", values, "numericSpecTemp");
            return (Criteria) this;
        }

        public Criteria andNumericSpecTempNotIn(List<String> values) {
            addCriterion("NUMERIC_SPEC_TEMP not in", values, "numericSpecTemp");
            return (Criteria) this;
        }

        public Criteria andNumericSpecTempBetween(String value1, String value2) {
            addCriterion("NUMERIC_SPEC_TEMP between", value1, value2, "numericSpecTemp");
            return (Criteria) this;
        }

        public Criteria andNumericSpecTempNotBetween(String value1, String value2) {
            addCriterion("NUMERIC_SPEC_TEMP not between", value1, value2, "numericSpecTemp");
            return (Criteria) this;
        }

        public Criteria andTextSpecTempIsNull() {
            addCriterion("TEXT_SPEC_TEMP is null");
            return (Criteria) this;
        }

        public Criteria andTextSpecTempIsNotNull() {
            addCriterion("TEXT_SPEC_TEMP is not null");
            return (Criteria) this;
        }

        public Criteria andTextSpecTempEqualTo(String value) {
            addCriterion("TEXT_SPEC_TEMP =", value, "textSpecTemp");
            return (Criteria) this;
        }

        public Criteria andTextSpecTempNotEqualTo(String value) {
            addCriterion("TEXT_SPEC_TEMP <>", value, "textSpecTemp");
            return (Criteria) this;
        }

        public Criteria andTextSpecTempGreaterThan(String value) {
            addCriterion("TEXT_SPEC_TEMP >", value, "textSpecTemp");
            return (Criteria) this;
        }

        public Criteria andTextSpecTempGreaterThanOrEqualTo(String value) {
            addCriterion("TEXT_SPEC_TEMP >=", value, "textSpecTemp");
            return (Criteria) this;
        }

        public Criteria andTextSpecTempLessThan(String value) {
            addCriterion("TEXT_SPEC_TEMP <", value, "textSpecTemp");
            return (Criteria) this;
        }

        public Criteria andTextSpecTempLessThanOrEqualTo(String value) {
            addCriterion("TEXT_SPEC_TEMP <=", value, "textSpecTemp");
            return (Criteria) this;
        }

        public Criteria andTextSpecTempLike(String value) {
            addCriterion("TEXT_SPEC_TEMP like", value, "textSpecTemp");
            return (Criteria) this;
        }

        public Criteria andTextSpecTempNotLike(String value) {
            addCriterion("TEXT_SPEC_TEMP not like", value, "textSpecTemp");
            return (Criteria) this;
        }

        public Criteria andTextSpecTempIn(List<String> values) {
            addCriterion("TEXT_SPEC_TEMP in", values, "textSpecTemp");
            return (Criteria) this;
        }

        public Criteria andTextSpecTempNotIn(List<String> values) {
            addCriterion("TEXT_SPEC_TEMP not in", values, "textSpecTemp");
            return (Criteria) this;
        }

        public Criteria andTextSpecTempBetween(String value1, String value2) {
            addCriterion("TEXT_SPEC_TEMP between", value1, value2, "textSpecTemp");
            return (Criteria) this;
        }

        public Criteria andTextSpecTempNotBetween(String value1, String value2) {
            addCriterion("TEXT_SPEC_TEMP not between", value1, value2, "textSpecTemp");
            return (Criteria) this;
        }

        public Criteria andFormulaSpecTempIsNull() {
            addCriterion("FORMULA_SPEC_TEMP is null");
            return (Criteria) this;
        }

        public Criteria andFormulaSpecTempIsNotNull() {
            addCriterion("FORMULA_SPEC_TEMP is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaSpecTempEqualTo(String value) {
            addCriterion("FORMULA_SPEC_TEMP =", value, "formulaSpecTemp");
            return (Criteria) this;
        }

        public Criteria andFormulaSpecTempNotEqualTo(String value) {
            addCriterion("FORMULA_SPEC_TEMP <>", value, "formulaSpecTemp");
            return (Criteria) this;
        }

        public Criteria andFormulaSpecTempGreaterThan(String value) {
            addCriterion("FORMULA_SPEC_TEMP >", value, "formulaSpecTemp");
            return (Criteria) this;
        }

        public Criteria andFormulaSpecTempGreaterThanOrEqualTo(String value) {
            addCriterion("FORMULA_SPEC_TEMP >=", value, "formulaSpecTemp");
            return (Criteria) this;
        }

        public Criteria andFormulaSpecTempLessThan(String value) {
            addCriterion("FORMULA_SPEC_TEMP <", value, "formulaSpecTemp");
            return (Criteria) this;
        }

        public Criteria andFormulaSpecTempLessThanOrEqualTo(String value) {
            addCriterion("FORMULA_SPEC_TEMP <=", value, "formulaSpecTemp");
            return (Criteria) this;
        }

        public Criteria andFormulaSpecTempLike(String value) {
            addCriterion("FORMULA_SPEC_TEMP like", value, "formulaSpecTemp");
            return (Criteria) this;
        }

        public Criteria andFormulaSpecTempNotLike(String value) {
            addCriterion("FORMULA_SPEC_TEMP not like", value, "formulaSpecTemp");
            return (Criteria) this;
        }

        public Criteria andFormulaSpecTempIn(List<String> values) {
            addCriterion("FORMULA_SPEC_TEMP in", values, "formulaSpecTemp");
            return (Criteria) this;
        }

        public Criteria andFormulaSpecTempNotIn(List<String> values) {
            addCriterion("FORMULA_SPEC_TEMP not in", values, "formulaSpecTemp");
            return (Criteria) this;
        }

        public Criteria andFormulaSpecTempBetween(String value1, String value2) {
            addCriterion("FORMULA_SPEC_TEMP between", value1, value2, "formulaSpecTemp");
            return (Criteria) this;
        }

        public Criteria andFormulaSpecTempNotBetween(String value1, String value2) {
            addCriterion("FORMULA_SPEC_TEMP not between", value1, value2, "formulaSpecTemp");
            return (Criteria) this;
        }

        public Criteria andSpcSpecTempIsNull() {
            addCriterion("SPC_SPEC_TEMP is null");
            return (Criteria) this;
        }

        public Criteria andSpcSpecTempIsNotNull() {
            addCriterion("SPC_SPEC_TEMP is not null");
            return (Criteria) this;
        }

        public Criteria andSpcSpecTempEqualTo(String value) {
            addCriterion("SPC_SPEC_TEMP =", value, "spcSpecTemp");
            return (Criteria) this;
        }

        public Criteria andSpcSpecTempNotEqualTo(String value) {
            addCriterion("SPC_SPEC_TEMP <>", value, "spcSpecTemp");
            return (Criteria) this;
        }

        public Criteria andSpcSpecTempGreaterThan(String value) {
            addCriterion("SPC_SPEC_TEMP >", value, "spcSpecTemp");
            return (Criteria) this;
        }

        public Criteria andSpcSpecTempGreaterThanOrEqualTo(String value) {
            addCriterion("SPC_SPEC_TEMP >=", value, "spcSpecTemp");
            return (Criteria) this;
        }

        public Criteria andSpcSpecTempLessThan(String value) {
            addCriterion("SPC_SPEC_TEMP <", value, "spcSpecTemp");
            return (Criteria) this;
        }

        public Criteria andSpcSpecTempLessThanOrEqualTo(String value) {
            addCriterion("SPC_SPEC_TEMP <=", value, "spcSpecTemp");
            return (Criteria) this;
        }

        public Criteria andSpcSpecTempLike(String value) {
            addCriterion("SPC_SPEC_TEMP like", value, "spcSpecTemp");
            return (Criteria) this;
        }

        public Criteria andSpcSpecTempNotLike(String value) {
            addCriterion("SPC_SPEC_TEMP not like", value, "spcSpecTemp");
            return (Criteria) this;
        }

        public Criteria andSpcSpecTempIn(List<String> values) {
            addCriterion("SPC_SPEC_TEMP in", values, "spcSpecTemp");
            return (Criteria) this;
        }

        public Criteria andSpcSpecTempNotIn(List<String> values) {
            addCriterion("SPC_SPEC_TEMP not in", values, "spcSpecTemp");
            return (Criteria) this;
        }

        public Criteria andSpcSpecTempBetween(String value1, String value2) {
            addCriterion("SPC_SPEC_TEMP between", value1, value2, "spcSpecTemp");
            return (Criteria) this;
        }

        public Criteria andSpcSpecTempNotBetween(String value1, String value2) {
            addCriterion("SPC_SPEC_TEMP not between", value1, value2, "spcSpecTemp");
            return (Criteria) this;
        }

        public Criteria andReportedSpecTempIsNull() {
            addCriterion("REPORTED_SPEC_TEMP is null");
            return (Criteria) this;
        }

        public Criteria andReportedSpecTempIsNotNull() {
            addCriterion("REPORTED_SPEC_TEMP is not null");
            return (Criteria) this;
        }

        public Criteria andReportedSpecTempEqualTo(String value) {
            addCriterion("REPORTED_SPEC_TEMP =", value, "reportedSpecTemp");
            return (Criteria) this;
        }

        public Criteria andReportedSpecTempNotEqualTo(String value) {
            addCriterion("REPORTED_SPEC_TEMP <>", value, "reportedSpecTemp");
            return (Criteria) this;
        }

        public Criteria andReportedSpecTempGreaterThan(String value) {
            addCriterion("REPORTED_SPEC_TEMP >", value, "reportedSpecTemp");
            return (Criteria) this;
        }

        public Criteria andReportedSpecTempGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTED_SPEC_TEMP >=", value, "reportedSpecTemp");
            return (Criteria) this;
        }

        public Criteria andReportedSpecTempLessThan(String value) {
            addCriterion("REPORTED_SPEC_TEMP <", value, "reportedSpecTemp");
            return (Criteria) this;
        }

        public Criteria andReportedSpecTempLessThanOrEqualTo(String value) {
            addCriterion("REPORTED_SPEC_TEMP <=", value, "reportedSpecTemp");
            return (Criteria) this;
        }

        public Criteria andReportedSpecTempLike(String value) {
            addCriterion("REPORTED_SPEC_TEMP like", value, "reportedSpecTemp");
            return (Criteria) this;
        }

        public Criteria andReportedSpecTempNotLike(String value) {
            addCriterion("REPORTED_SPEC_TEMP not like", value, "reportedSpecTemp");
            return (Criteria) this;
        }

        public Criteria andReportedSpecTempIn(List<String> values) {
            addCriterion("REPORTED_SPEC_TEMP in", values, "reportedSpecTemp");
            return (Criteria) this;
        }

        public Criteria andReportedSpecTempNotIn(List<String> values) {
            addCriterion("REPORTED_SPEC_TEMP not in", values, "reportedSpecTemp");
            return (Criteria) this;
        }

        public Criteria andReportedSpecTempBetween(String value1, String value2) {
            addCriterion("REPORTED_SPEC_TEMP between", value1, value2, "reportedSpecTemp");
            return (Criteria) this;
        }

        public Criteria andReportedSpecTempNotBetween(String value1, String value2) {
            addCriterion("REPORTED_SPEC_TEMP not between", value1, value2, "reportedSpecTemp");
            return (Criteria) this;
        }

        public Criteria andSignedIsNull() {
            addCriterion("SIGNED is null");
            return (Criteria) this;
        }

        public Criteria andSignedIsNotNull() {
            addCriterion("SIGNED is not null");
            return (Criteria) this;
        }

        public Criteria andSignedEqualTo(String value) {
            addCriterion("SIGNED =", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedNotEqualTo(String value) {
            addCriterion("SIGNED <>", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedGreaterThan(String value) {
            addCriterion("SIGNED >", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNED >=", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedLessThan(String value) {
            addCriterion("SIGNED <", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedLessThanOrEqualTo(String value) {
            addCriterion("SIGNED <=", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedLike(String value) {
            addCriterion("SIGNED like", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedNotLike(String value) {
            addCriterion("SIGNED not like", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedIn(List<String> values) {
            addCriterion("SIGNED in", values, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedNotIn(List<String> values) {
            addCriterion("SIGNED not in", values, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedBetween(String value1, String value2) {
            addCriterion("SIGNED between", value1, value2, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedNotBetween(String value1, String value2) {
            addCriterion("SIGNED not between", value1, value2, "signed");
            return (Criteria) this;
        }

        public Criteria andRecordSetIsNull() {
            addCriterion("RECORD_SET is null");
            return (Criteria) this;
        }

        public Criteria andRecordSetIsNotNull() {
            addCriterion("RECORD_SET is not null");
            return (Criteria) this;
        }

        public Criteria andRecordSetEqualTo(String value) {
            addCriterion("RECORD_SET =", value, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetNotEqualTo(String value) {
            addCriterion("RECORD_SET <>", value, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetGreaterThan(String value) {
            addCriterion("RECORD_SET >", value, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_SET >=", value, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetLessThan(String value) {
            addCriterion("RECORD_SET <", value, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetLessThanOrEqualTo(String value) {
            addCriterion("RECORD_SET <=", value, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetLike(String value) {
            addCriterion("RECORD_SET like", value, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetNotLike(String value) {
            addCriterion("RECORD_SET not like", value, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetIn(List<String> values) {
            addCriterion("RECORD_SET in", values, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetNotIn(List<String> values) {
            addCriterion("RECORD_SET not in", values, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetBetween(String value1, String value2) {
            addCriterion("RECORD_SET between", value1, value2, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetNotBetween(String value1, String value2) {
            addCriterion("RECORD_SET not between", value1, value2, "recordSet");
            return (Criteria) this;
        }

        public Criteria andTCustomerIsNull() {
            addCriterion("T_CUSTOMER is null");
            return (Criteria) this;
        }

        public Criteria andTCustomerIsNotNull() {
            addCriterion("T_CUSTOMER is not null");
            return (Criteria) this;
        }

        public Criteria andTCustomerEqualTo(String value) {
            addCriterion("T_CUSTOMER =", value, "tCustomer");
            return (Criteria) this;
        }

        public Criteria andTCustomerNotEqualTo(String value) {
            addCriterion("T_CUSTOMER <>", value, "tCustomer");
            return (Criteria) this;
        }

        public Criteria andTCustomerGreaterThan(String value) {
            addCriterion("T_CUSTOMER >", value, "tCustomer");
            return (Criteria) this;
        }

        public Criteria andTCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("T_CUSTOMER >=", value, "tCustomer");
            return (Criteria) this;
        }

        public Criteria andTCustomerLessThan(String value) {
            addCriterion("T_CUSTOMER <", value, "tCustomer");
            return (Criteria) this;
        }

        public Criteria andTCustomerLessThanOrEqualTo(String value) {
            addCriterion("T_CUSTOMER <=", value, "tCustomer");
            return (Criteria) this;
        }

        public Criteria andTCustomerLike(String value) {
            addCriterion("T_CUSTOMER like", value, "tCustomer");
            return (Criteria) this;
        }

        public Criteria andTCustomerNotLike(String value) {
            addCriterion("T_CUSTOMER not like", value, "tCustomer");
            return (Criteria) this;
        }

        public Criteria andTCustomerIn(List<String> values) {
            addCriterion("T_CUSTOMER in", values, "tCustomer");
            return (Criteria) this;
        }

        public Criteria andTCustomerNotIn(List<String> values) {
            addCriterion("T_CUSTOMER not in", values, "tCustomer");
            return (Criteria) this;
        }

        public Criteria andTCustomerBetween(String value1, String value2) {
            addCriterion("T_CUSTOMER between", value1, value2, "tCustomer");
            return (Criteria) this;
        }

        public Criteria andTCustomerNotBetween(String value1, String value2) {
            addCriterion("T_CUSTOMER not between", value1, value2, "tCustomer");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1IsNull() {
            addCriterion("C_PROD_TYPE_C1 is null");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1IsNotNull() {
            addCriterion("C_PROD_TYPE_C1 is not null");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1EqualTo(String value) {
            addCriterion("C_PROD_TYPE_C1 =", value, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1NotEqualTo(String value) {
            addCriterion("C_PROD_TYPE_C1 <>", value, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1GreaterThan(String value) {
            addCriterion("C_PROD_TYPE_C1 >", value, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1GreaterThanOrEqualTo(String value) {
            addCriterion("C_PROD_TYPE_C1 >=", value, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1LessThan(String value) {
            addCriterion("C_PROD_TYPE_C1 <", value, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1LessThanOrEqualTo(String value) {
            addCriterion("C_PROD_TYPE_C1 <=", value, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1Like(String value) {
            addCriterion("C_PROD_TYPE_C1 like", value, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1NotLike(String value) {
            addCriterion("C_PROD_TYPE_C1 not like", value, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1In(List<String> values) {
            addCriterion("C_PROD_TYPE_C1 in", values, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1NotIn(List<String> values) {
            addCriterion("C_PROD_TYPE_C1 not in", values, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1Between(String value1, String value2) {
            addCriterion("C_PROD_TYPE_C1 between", value1, value2, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1NotBetween(String value1, String value2) {
            addCriterion("C_PROD_TYPE_C1 not between", value1, value2, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactIsNull() {
            addCriterion("C_ALLOWED_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactIsNotNull() {
            addCriterion("C_ALLOWED_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactEqualTo(String value) {
            addCriterion("C_ALLOWED_CONTACT =", value, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactNotEqualTo(String value) {
            addCriterion("C_ALLOWED_CONTACT <>", value, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactGreaterThan(String value) {
            addCriterion("C_ALLOWED_CONTACT >", value, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactGreaterThanOrEqualTo(String value) {
            addCriterion("C_ALLOWED_CONTACT >=", value, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactLessThan(String value) {
            addCriterion("C_ALLOWED_CONTACT <", value, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactLessThanOrEqualTo(String value) {
            addCriterion("C_ALLOWED_CONTACT <=", value, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactLike(String value) {
            addCriterion("C_ALLOWED_CONTACT like", value, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactNotLike(String value) {
            addCriterion("C_ALLOWED_CONTACT not like", value, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactIn(List<String> values) {
            addCriterion("C_ALLOWED_CONTACT in", values, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactNotIn(List<String> values) {
            addCriterion("C_ALLOWED_CONTACT not in", values, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactBetween(String value1, String value2) {
            addCriterion("C_ALLOWED_CONTACT between", value1, value2, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactNotBetween(String value1, String value2) {
            addCriterion("C_ALLOWED_CONTACT not between", value1, value2, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCParaConditionIsNull() {
            addCriterion("C_PARA_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andCParaConditionIsNotNull() {
            addCriterion("C_PARA_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andCParaConditionEqualTo(String value) {
            addCriterion("C_PARA_CONDITION =", value, "cParaCondition");
            return (Criteria) this;
        }

        public Criteria andCParaConditionNotEqualTo(String value) {
            addCriterion("C_PARA_CONDITION <>", value, "cParaCondition");
            return (Criteria) this;
        }

        public Criteria andCParaConditionGreaterThan(String value) {
            addCriterion("C_PARA_CONDITION >", value, "cParaCondition");
            return (Criteria) this;
        }

        public Criteria andCParaConditionGreaterThanOrEqualTo(String value) {
            addCriterion("C_PARA_CONDITION >=", value, "cParaCondition");
            return (Criteria) this;
        }

        public Criteria andCParaConditionLessThan(String value) {
            addCriterion("C_PARA_CONDITION <", value, "cParaCondition");
            return (Criteria) this;
        }

        public Criteria andCParaConditionLessThanOrEqualTo(String value) {
            addCriterion("C_PARA_CONDITION <=", value, "cParaCondition");
            return (Criteria) this;
        }

        public Criteria andCParaConditionLike(String value) {
            addCriterion("C_PARA_CONDITION like", value, "cParaCondition");
            return (Criteria) this;
        }

        public Criteria andCParaConditionNotLike(String value) {
            addCriterion("C_PARA_CONDITION not like", value, "cParaCondition");
            return (Criteria) this;
        }

        public Criteria andCParaConditionIn(List<String> values) {
            addCriterion("C_PARA_CONDITION in", values, "cParaCondition");
            return (Criteria) this;
        }

        public Criteria andCParaConditionNotIn(List<String> values) {
            addCriterion("C_PARA_CONDITION not in", values, "cParaCondition");
            return (Criteria) this;
        }

        public Criteria andCParaConditionBetween(String value1, String value2) {
            addCriterion("C_PARA_CONDITION between", value1, value2, "cParaCondition");
            return (Criteria) this;
        }

        public Criteria andCParaConditionNotBetween(String value1, String value2) {
            addCriterion("C_PARA_CONDITION not between", value1, value2, "cParaCondition");
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