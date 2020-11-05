package cn.besbing.model.entities.primary;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StorageLocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StorageLocationExample() {
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

        public Criteria andLocationNumberIsNull() {
            addCriterion("LOCATION_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andLocationNumberIsNotNull() {
            addCriterion("LOCATION_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andLocationNumberEqualTo(Long value) {
            addCriterion("LOCATION_NUMBER =", value, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberNotEqualTo(Long value) {
            addCriterion("LOCATION_NUMBER <>", value, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberGreaterThan(Long value) {
            addCriterion("LOCATION_NUMBER >", value, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("LOCATION_NUMBER >=", value, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberLessThan(Long value) {
            addCriterion("LOCATION_NUMBER <", value, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberLessThanOrEqualTo(Long value) {
            addCriterion("LOCATION_NUMBER <=", value, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberIn(List<Long> values) {
            addCriterion("LOCATION_NUMBER in", values, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberNotIn(List<Long> values) {
            addCriterion("LOCATION_NUMBER not in", values, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberBetween(Long value1, Long value2) {
            addCriterion("LOCATION_NUMBER between", value1, value2, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberNotBetween(Long value1, Long value2) {
            addCriterion("LOCATION_NUMBER not between", value1, value2, "locationNumber");
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

        public Criteria andParentLocationIsNull() {
            addCriterion("PARENT_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andParentLocationIsNotNull() {
            addCriterion("PARENT_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andParentLocationEqualTo(Long value) {
            addCriterion("PARENT_LOCATION =", value, "parentLocation");
            return (Criteria) this;
        }

        public Criteria andParentLocationNotEqualTo(Long value) {
            addCriterion("PARENT_LOCATION <>", value, "parentLocation");
            return (Criteria) this;
        }

        public Criteria andParentLocationGreaterThan(Long value) {
            addCriterion("PARENT_LOCATION >", value, "parentLocation");
            return (Criteria) this;
        }

        public Criteria andParentLocationGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION >=", value, "parentLocation");
            return (Criteria) this;
        }

        public Criteria andParentLocationLessThan(Long value) {
            addCriterion("PARENT_LOCATION <", value, "parentLocation");
            return (Criteria) this;
        }

        public Criteria andParentLocationLessThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION <=", value, "parentLocation");
            return (Criteria) this;
        }

        public Criteria andParentLocationIn(List<Long> values) {
            addCriterion("PARENT_LOCATION in", values, "parentLocation");
            return (Criteria) this;
        }

        public Criteria andParentLocationNotIn(List<Long> values) {
            addCriterion("PARENT_LOCATION not in", values, "parentLocation");
            return (Criteria) this;
        }

        public Criteria andParentLocationBetween(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION between", value1, value2, "parentLocation");
            return (Criteria) this;
        }

        public Criteria andParentLocationNotBetween(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION not between", value1, value2, "parentLocation");
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

        public Criteria andDisplayedIsNull() {
            addCriterion("DISPLAYED is null");
            return (Criteria) this;
        }

        public Criteria andDisplayedIsNotNull() {
            addCriterion("DISPLAYED is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayedEqualTo(String value) {
            addCriterion("DISPLAYED =", value, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedNotEqualTo(String value) {
            addCriterion("DISPLAYED <>", value, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedGreaterThan(String value) {
            addCriterion("DISPLAYED >", value, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedGreaterThanOrEqualTo(String value) {
            addCriterion("DISPLAYED >=", value, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedLessThan(String value) {
            addCriterion("DISPLAYED <", value, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedLessThanOrEqualTo(String value) {
            addCriterion("DISPLAYED <=", value, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedLike(String value) {
            addCriterion("DISPLAYED like", value, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedNotLike(String value) {
            addCriterion("DISPLAYED not like", value, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedIn(List<String> values) {
            addCriterion("DISPLAYED in", values, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedNotIn(List<String> values) {
            addCriterion("DISPLAYED not in", values, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedBetween(String value1, String value2) {
            addCriterion("DISPLAYED between", value1, value2, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedNotBetween(String value1, String value2) {
            addCriterion("DISPLAYED not between", value1, value2, "displayed");
            return (Criteria) this;
        }

        public Criteria andCapacityTotalIsNull() {
            addCriterion("CAPACITY_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andCapacityTotalIsNotNull() {
            addCriterion("CAPACITY_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityTotalEqualTo(Long value) {
            addCriterion("CAPACITY_TOTAL =", value, "capacityTotal");
            return (Criteria) this;
        }

        public Criteria andCapacityTotalNotEqualTo(Long value) {
            addCriterion("CAPACITY_TOTAL <>", value, "capacityTotal");
            return (Criteria) this;
        }

        public Criteria andCapacityTotalGreaterThan(Long value) {
            addCriterion("CAPACITY_TOTAL >", value, "capacityTotal");
            return (Criteria) this;
        }

        public Criteria andCapacityTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("CAPACITY_TOTAL >=", value, "capacityTotal");
            return (Criteria) this;
        }

        public Criteria andCapacityTotalLessThan(Long value) {
            addCriterion("CAPACITY_TOTAL <", value, "capacityTotal");
            return (Criteria) this;
        }

        public Criteria andCapacityTotalLessThanOrEqualTo(Long value) {
            addCriterion("CAPACITY_TOTAL <=", value, "capacityTotal");
            return (Criteria) this;
        }

        public Criteria andCapacityTotalIn(List<Long> values) {
            addCriterion("CAPACITY_TOTAL in", values, "capacityTotal");
            return (Criteria) this;
        }

        public Criteria andCapacityTotalNotIn(List<Long> values) {
            addCriterion("CAPACITY_TOTAL not in", values, "capacityTotal");
            return (Criteria) this;
        }

        public Criteria andCapacityTotalBetween(Long value1, Long value2) {
            addCriterion("CAPACITY_TOTAL between", value1, value2, "capacityTotal");
            return (Criteria) this;
        }

        public Criteria andCapacityTotalNotBetween(Long value1, Long value2) {
            addCriterion("CAPACITY_TOTAL not between", value1, value2, "capacityTotal");
            return (Criteria) this;
        }

        public Criteria andCapacityUsedIsNull() {
            addCriterion("CAPACITY_USED is null");
            return (Criteria) this;
        }

        public Criteria andCapacityUsedIsNotNull() {
            addCriterion("CAPACITY_USED is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityUsedEqualTo(Long value) {
            addCriterion("CAPACITY_USED =", value, "capacityUsed");
            return (Criteria) this;
        }

        public Criteria andCapacityUsedNotEqualTo(Long value) {
            addCriterion("CAPACITY_USED <>", value, "capacityUsed");
            return (Criteria) this;
        }

        public Criteria andCapacityUsedGreaterThan(Long value) {
            addCriterion("CAPACITY_USED >", value, "capacityUsed");
            return (Criteria) this;
        }

        public Criteria andCapacityUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("CAPACITY_USED >=", value, "capacityUsed");
            return (Criteria) this;
        }

        public Criteria andCapacityUsedLessThan(Long value) {
            addCriterion("CAPACITY_USED <", value, "capacityUsed");
            return (Criteria) this;
        }

        public Criteria andCapacityUsedLessThanOrEqualTo(Long value) {
            addCriterion("CAPACITY_USED <=", value, "capacityUsed");
            return (Criteria) this;
        }

        public Criteria andCapacityUsedIn(List<Long> values) {
            addCriterion("CAPACITY_USED in", values, "capacityUsed");
            return (Criteria) this;
        }

        public Criteria andCapacityUsedNotIn(List<Long> values) {
            addCriterion("CAPACITY_USED not in", values, "capacityUsed");
            return (Criteria) this;
        }

        public Criteria andCapacityUsedBetween(Long value1, Long value2) {
            addCriterion("CAPACITY_USED between", value1, value2, "capacityUsed");
            return (Criteria) this;
        }

        public Criteria andCapacityUsedNotBetween(Long value1, Long value2) {
            addCriterion("CAPACITY_USED not between", value1, value2, "capacityUsed");
            return (Criteria) this;
        }

        public Criteria andCapacityReservedIsNull() {
            addCriterion("CAPACITY_RESERVED is null");
            return (Criteria) this;
        }

        public Criteria andCapacityReservedIsNotNull() {
            addCriterion("CAPACITY_RESERVED is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityReservedEqualTo(Long value) {
            addCriterion("CAPACITY_RESERVED =", value, "capacityReserved");
            return (Criteria) this;
        }

        public Criteria andCapacityReservedNotEqualTo(Long value) {
            addCriterion("CAPACITY_RESERVED <>", value, "capacityReserved");
            return (Criteria) this;
        }

        public Criteria andCapacityReservedGreaterThan(Long value) {
            addCriterion("CAPACITY_RESERVED >", value, "capacityReserved");
            return (Criteria) this;
        }

        public Criteria andCapacityReservedGreaterThanOrEqualTo(Long value) {
            addCriterion("CAPACITY_RESERVED >=", value, "capacityReserved");
            return (Criteria) this;
        }

        public Criteria andCapacityReservedLessThan(Long value) {
            addCriterion("CAPACITY_RESERVED <", value, "capacityReserved");
            return (Criteria) this;
        }

        public Criteria andCapacityReservedLessThanOrEqualTo(Long value) {
            addCriterion("CAPACITY_RESERVED <=", value, "capacityReserved");
            return (Criteria) this;
        }

        public Criteria andCapacityReservedIn(List<Long> values) {
            addCriterion("CAPACITY_RESERVED in", values, "capacityReserved");
            return (Criteria) this;
        }

        public Criteria andCapacityReservedNotIn(List<Long> values) {
            addCriterion("CAPACITY_RESERVED not in", values, "capacityReserved");
            return (Criteria) this;
        }

        public Criteria andCapacityReservedBetween(Long value1, Long value2) {
            addCriterion("CAPACITY_RESERVED between", value1, value2, "capacityReserved");
            return (Criteria) this;
        }

        public Criteria andCapacityReservedNotBetween(Long value1, Long value2) {
            addCriterion("CAPACITY_RESERVED not between", value1, value2, "capacityReserved");
            return (Criteria) this;
        }

        public Criteria andCapacityAvailableIsNull() {
            addCriterion("CAPACITY_AVAILABLE is null");
            return (Criteria) this;
        }

        public Criteria andCapacityAvailableIsNotNull() {
            addCriterion("CAPACITY_AVAILABLE is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityAvailableEqualTo(Long value) {
            addCriterion("CAPACITY_AVAILABLE =", value, "capacityAvailable");
            return (Criteria) this;
        }

        public Criteria andCapacityAvailableNotEqualTo(Long value) {
            addCriterion("CAPACITY_AVAILABLE <>", value, "capacityAvailable");
            return (Criteria) this;
        }

        public Criteria andCapacityAvailableGreaterThan(Long value) {
            addCriterion("CAPACITY_AVAILABLE >", value, "capacityAvailable");
            return (Criteria) this;
        }

        public Criteria andCapacityAvailableGreaterThanOrEqualTo(Long value) {
            addCriterion("CAPACITY_AVAILABLE >=", value, "capacityAvailable");
            return (Criteria) this;
        }

        public Criteria andCapacityAvailableLessThan(Long value) {
            addCriterion("CAPACITY_AVAILABLE <", value, "capacityAvailable");
            return (Criteria) this;
        }

        public Criteria andCapacityAvailableLessThanOrEqualTo(Long value) {
            addCriterion("CAPACITY_AVAILABLE <=", value, "capacityAvailable");
            return (Criteria) this;
        }

        public Criteria andCapacityAvailableIn(List<Long> values) {
            addCriterion("CAPACITY_AVAILABLE in", values, "capacityAvailable");
            return (Criteria) this;
        }

        public Criteria andCapacityAvailableNotIn(List<Long> values) {
            addCriterion("CAPACITY_AVAILABLE not in", values, "capacityAvailable");
            return (Criteria) this;
        }

        public Criteria andCapacityAvailableBetween(Long value1, Long value2) {
            addCriterion("CAPACITY_AVAILABLE between", value1, value2, "capacityAvailable");
            return (Criteria) this;
        }

        public Criteria andCapacityAvailableNotBetween(Long value1, Long value2) {
            addCriterion("CAPACITY_AVAILABLE not between", value1, value2, "capacityAvailable");
            return (Criteria) this;
        }

        public Criteria andXIsNull() {
            addCriterion("X is null");
            return (Criteria) this;
        }

        public Criteria andXIsNotNull() {
            addCriterion("X is not null");
            return (Criteria) this;
        }

        public Criteria andXEqualTo(Long value) {
            addCriterion("X =", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotEqualTo(Long value) {
            addCriterion("X <>", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThan(Long value) {
            addCriterion("X >", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThanOrEqualTo(Long value) {
            addCriterion("X >=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThan(Long value) {
            addCriterion("X <", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThanOrEqualTo(Long value) {
            addCriterion("X <=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXIn(List<Long> values) {
            addCriterion("X in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXNotIn(List<Long> values) {
            addCriterion("X not in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXBetween(Long value1, Long value2) {
            addCriterion("X between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andXNotBetween(Long value1, Long value2) {
            addCriterion("X not between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andYIsNull() {
            addCriterion("Y is null");
            return (Criteria) this;
        }

        public Criteria andYIsNotNull() {
            addCriterion("Y is not null");
            return (Criteria) this;
        }

        public Criteria andYEqualTo(Long value) {
            addCriterion("Y =", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotEqualTo(Long value) {
            addCriterion("Y <>", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThan(Long value) {
            addCriterion("Y >", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThanOrEqualTo(Long value) {
            addCriterion("Y >=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThan(Long value) {
            addCriterion("Y <", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThanOrEqualTo(Long value) {
            addCriterion("Y <=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYIn(List<Long> values) {
            addCriterion("Y in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYNotIn(List<Long> values) {
            addCriterion("Y not in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYBetween(Long value1, Long value2) {
            addCriterion("Y between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYNotBetween(Long value1, Long value2) {
            addCriterion("Y not between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andObjectClassIsNull() {
            addCriterion("OBJECT_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andObjectClassIsNotNull() {
            addCriterion("OBJECT_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andObjectClassEqualTo(String value) {
            addCriterion("OBJECT_CLASS =", value, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassNotEqualTo(String value) {
            addCriterion("OBJECT_CLASS <>", value, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassGreaterThan(String value) {
            addCriterion("OBJECT_CLASS >", value, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_CLASS >=", value, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassLessThan(String value) {
            addCriterion("OBJECT_CLASS <", value, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_CLASS <=", value, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassLike(String value) {
            addCriterion("OBJECT_CLASS like", value, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassNotLike(String value) {
            addCriterion("OBJECT_CLASS not like", value, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassIn(List<String> values) {
            addCriterion("OBJECT_CLASS in", values, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassNotIn(List<String> values) {
            addCriterion("OBJECT_CLASS not in", values, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassBetween(String value1, String value2) {
            addCriterion("OBJECT_CLASS between", value1, value2, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectClassNotBetween(String value1, String value2) {
            addCriterion("OBJECT_CLASS not between", value1, value2, "objectClass");
            return (Criteria) this;
        }

        public Criteria andObjectIdIsNull() {
            addCriterion("OBJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andObjectIdIsNotNull() {
            addCriterion("OBJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andObjectIdEqualTo(Long value) {
            addCriterion("OBJECT_ID =", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotEqualTo(Long value) {
            addCriterion("OBJECT_ID <>", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdGreaterThan(Long value) {
            addCriterion("OBJECT_ID >", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OBJECT_ID >=", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdLessThan(Long value) {
            addCriterion("OBJECT_ID <", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdLessThanOrEqualTo(Long value) {
            addCriterion("OBJECT_ID <=", value, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdIn(List<Long> values) {
            addCriterion("OBJECT_ID in", values, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotIn(List<Long> values) {
            addCriterion("OBJECT_ID not in", values, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdBetween(Long value1, Long value2) {
            addCriterion("OBJECT_ID between", value1, value2, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectIdNotBetween(Long value1, Long value2) {
            addCriterion("OBJECT_ID not between", value1, value2, "objectId");
            return (Criteria) this;
        }

        public Criteria andObjectNameIsNull() {
            addCriterion("OBJECT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andObjectNameIsNotNull() {
            addCriterion("OBJECT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andObjectNameEqualTo(String value) {
            addCriterion("OBJECT_NAME =", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotEqualTo(String value) {
            addCriterion("OBJECT_NAME <>", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameGreaterThan(String value) {
            addCriterion("OBJECT_NAME >", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_NAME >=", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLessThan(String value) {
            addCriterion("OBJECT_NAME <", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_NAME <=", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLike(String value) {
            addCriterion("OBJECT_NAME like", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotLike(String value) {
            addCriterion("OBJECT_NAME not like", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameIn(List<String> values) {
            addCriterion("OBJECT_NAME in", values, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotIn(List<String> values) {
            addCriterion("OBJECT_NAME not in", values, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameBetween(String value1, String value2) {
            addCriterion("OBJECT_NAME between", value1, value2, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotBetween(String value1, String value2) {
            addCriterion("OBJECT_NAME not between", value1, value2, "objectName");
            return (Criteria) this;
        }

        public Criteria andMovableIsNull() {
            addCriterion("MOVABLE is null");
            return (Criteria) this;
        }

        public Criteria andMovableIsNotNull() {
            addCriterion("MOVABLE is not null");
            return (Criteria) this;
        }

        public Criteria andMovableEqualTo(String value) {
            addCriterion("MOVABLE =", value, "movable");
            return (Criteria) this;
        }

        public Criteria andMovableNotEqualTo(String value) {
            addCriterion("MOVABLE <>", value, "movable");
            return (Criteria) this;
        }

        public Criteria andMovableGreaterThan(String value) {
            addCriterion("MOVABLE >", value, "movable");
            return (Criteria) this;
        }

        public Criteria andMovableGreaterThanOrEqualTo(String value) {
            addCriterion("MOVABLE >=", value, "movable");
            return (Criteria) this;
        }

        public Criteria andMovableLessThan(String value) {
            addCriterion("MOVABLE <", value, "movable");
            return (Criteria) this;
        }

        public Criteria andMovableLessThanOrEqualTo(String value) {
            addCriterion("MOVABLE <=", value, "movable");
            return (Criteria) this;
        }

        public Criteria andMovableLike(String value) {
            addCriterion("MOVABLE like", value, "movable");
            return (Criteria) this;
        }

        public Criteria andMovableNotLike(String value) {
            addCriterion("MOVABLE not like", value, "movable");
            return (Criteria) this;
        }

        public Criteria andMovableIn(List<String> values) {
            addCriterion("MOVABLE in", values, "movable");
            return (Criteria) this;
        }

        public Criteria andMovableNotIn(List<String> values) {
            addCriterion("MOVABLE not in", values, "movable");
            return (Criteria) this;
        }

        public Criteria andMovableBetween(String value1, String value2) {
            addCriterion("MOVABLE between", value1, value2, "movable");
            return (Criteria) this;
        }

        public Criteria andMovableNotBetween(String value1, String value2) {
            addCriterion("MOVABLE not between", value1, value2, "movable");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andReservedByIsNull() {
            addCriterion("RESERVED_BY is null");
            return (Criteria) this;
        }

        public Criteria andReservedByIsNotNull() {
            addCriterion("RESERVED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andReservedByEqualTo(String value) {
            addCriterion("RESERVED_BY =", value, "reservedBy");
            return (Criteria) this;
        }

        public Criteria andReservedByNotEqualTo(String value) {
            addCriterion("RESERVED_BY <>", value, "reservedBy");
            return (Criteria) this;
        }

        public Criteria andReservedByGreaterThan(String value) {
            addCriterion("RESERVED_BY >", value, "reservedBy");
            return (Criteria) this;
        }

        public Criteria andReservedByGreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED_BY >=", value, "reservedBy");
            return (Criteria) this;
        }

        public Criteria andReservedByLessThan(String value) {
            addCriterion("RESERVED_BY <", value, "reservedBy");
            return (Criteria) this;
        }

        public Criteria andReservedByLessThanOrEqualTo(String value) {
            addCriterion("RESERVED_BY <=", value, "reservedBy");
            return (Criteria) this;
        }

        public Criteria andReservedByLike(String value) {
            addCriterion("RESERVED_BY like", value, "reservedBy");
            return (Criteria) this;
        }

        public Criteria andReservedByNotLike(String value) {
            addCriterion("RESERVED_BY not like", value, "reservedBy");
            return (Criteria) this;
        }

        public Criteria andReservedByIn(List<String> values) {
            addCriterion("RESERVED_BY in", values, "reservedBy");
            return (Criteria) this;
        }

        public Criteria andReservedByNotIn(List<String> values) {
            addCriterion("RESERVED_BY not in", values, "reservedBy");
            return (Criteria) this;
        }

        public Criteria andReservedByBetween(String value1, String value2) {
            addCriterion("RESERVED_BY between", value1, value2, "reservedBy");
            return (Criteria) this;
        }

        public Criteria andReservedByNotBetween(String value1, String value2) {
            addCriterion("RESERVED_BY not between", value1, value2, "reservedBy");
            return (Criteria) this;
        }

        public Criteria andReservedOnIsNull() {
            addCriterion("RESERVED_ON is null");
            return (Criteria) this;
        }

        public Criteria andReservedOnIsNotNull() {
            addCriterion("RESERVED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andReservedOnEqualTo(Date value) {
            addCriterionForJDBCDate("RESERVED_ON =", value, "reservedOn");
            return (Criteria) this;
        }

        public Criteria andReservedOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("RESERVED_ON <>", value, "reservedOn");
            return (Criteria) this;
        }

        public Criteria andReservedOnGreaterThan(Date value) {
            addCriterionForJDBCDate("RESERVED_ON >", value, "reservedOn");
            return (Criteria) this;
        }

        public Criteria andReservedOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RESERVED_ON >=", value, "reservedOn");
            return (Criteria) this;
        }

        public Criteria andReservedOnLessThan(Date value) {
            addCriterionForJDBCDate("RESERVED_ON <", value, "reservedOn");
            return (Criteria) this;
        }

        public Criteria andReservedOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RESERVED_ON <=", value, "reservedOn");
            return (Criteria) this;
        }

        public Criteria andReservedOnIn(List<Date> values) {
            addCriterionForJDBCDate("RESERVED_ON in", values, "reservedOn");
            return (Criteria) this;
        }

        public Criteria andReservedOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("RESERVED_ON not in", values, "reservedOn");
            return (Criteria) this;
        }

        public Criteria andReservedOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RESERVED_ON between", value1, value2, "reservedOn");
            return (Criteria) this;
        }

        public Criteria andReservedOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RESERVED_ON not between", value1, value2, "reservedOn");
            return (Criteria) this;
        }

        public Criteria andReservedForIsNull() {
            addCriterion("RESERVED_FOR is null");
            return (Criteria) this;
        }

        public Criteria andReservedForIsNotNull() {
            addCriterion("RESERVED_FOR is not null");
            return (Criteria) this;
        }

        public Criteria andReservedForEqualTo(String value) {
            addCriterion("RESERVED_FOR =", value, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForNotEqualTo(String value) {
            addCriterion("RESERVED_FOR <>", value, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForGreaterThan(String value) {
            addCriterion("RESERVED_FOR >", value, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForGreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED_FOR >=", value, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForLessThan(String value) {
            addCriterion("RESERVED_FOR <", value, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForLessThanOrEqualTo(String value) {
            addCriterion("RESERVED_FOR <=", value, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForLike(String value) {
            addCriterion("RESERVED_FOR like", value, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForNotLike(String value) {
            addCriterion("RESERVED_FOR not like", value, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForIn(List<String> values) {
            addCriterion("RESERVED_FOR in", values, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForNotIn(List<String> values) {
            addCriterion("RESERVED_FOR not in", values, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForBetween(String value1, String value2) {
            addCriterion("RESERVED_FOR between", value1, value2, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForNotBetween(String value1, String value2) {
            addCriterion("RESERVED_FOR not between", value1, value2, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andFragmentationIsNull() {
            addCriterion("FRAGMENTATION is null");
            return (Criteria) this;
        }

        public Criteria andFragmentationIsNotNull() {
            addCriterion("FRAGMENTATION is not null");
            return (Criteria) this;
        }

        public Criteria andFragmentationEqualTo(Long value) {
            addCriterion("FRAGMENTATION =", value, "fragmentation");
            return (Criteria) this;
        }

        public Criteria andFragmentationNotEqualTo(Long value) {
            addCriterion("FRAGMENTATION <>", value, "fragmentation");
            return (Criteria) this;
        }

        public Criteria andFragmentationGreaterThan(Long value) {
            addCriterion("FRAGMENTATION >", value, "fragmentation");
            return (Criteria) this;
        }

        public Criteria andFragmentationGreaterThanOrEqualTo(Long value) {
            addCriterion("FRAGMENTATION >=", value, "fragmentation");
            return (Criteria) this;
        }

        public Criteria andFragmentationLessThan(Long value) {
            addCriterion("FRAGMENTATION <", value, "fragmentation");
            return (Criteria) this;
        }

        public Criteria andFragmentationLessThanOrEqualTo(Long value) {
            addCriterion("FRAGMENTATION <=", value, "fragmentation");
            return (Criteria) this;
        }

        public Criteria andFragmentationIn(List<Long> values) {
            addCriterion("FRAGMENTATION in", values, "fragmentation");
            return (Criteria) this;
        }

        public Criteria andFragmentationNotIn(List<Long> values) {
            addCriterion("FRAGMENTATION not in", values, "fragmentation");
            return (Criteria) this;
        }

        public Criteria andFragmentationBetween(Long value1, Long value2) {
            addCriterion("FRAGMENTATION between", value1, value2, "fragmentation");
            return (Criteria) this;
        }

        public Criteria andFragmentationNotBetween(Long value1, Long value2) {
            addCriterion("FRAGMENTATION not between", value1, value2, "fragmentation");
            return (Criteria) this;
        }

        public Criteria andLargestOpenBlockIsNull() {
            addCriterion("LARGEST_OPEN_BLOCK is null");
            return (Criteria) this;
        }

        public Criteria andLargestOpenBlockIsNotNull() {
            addCriterion("LARGEST_OPEN_BLOCK is not null");
            return (Criteria) this;
        }

        public Criteria andLargestOpenBlockEqualTo(Long value) {
            addCriterion("LARGEST_OPEN_BLOCK =", value, "largestOpenBlock");
            return (Criteria) this;
        }

        public Criteria andLargestOpenBlockNotEqualTo(Long value) {
            addCriterion("LARGEST_OPEN_BLOCK <>", value, "largestOpenBlock");
            return (Criteria) this;
        }

        public Criteria andLargestOpenBlockGreaterThan(Long value) {
            addCriterion("LARGEST_OPEN_BLOCK >", value, "largestOpenBlock");
            return (Criteria) this;
        }

        public Criteria andLargestOpenBlockGreaterThanOrEqualTo(Long value) {
            addCriterion("LARGEST_OPEN_BLOCK >=", value, "largestOpenBlock");
            return (Criteria) this;
        }

        public Criteria andLargestOpenBlockLessThan(Long value) {
            addCriterion("LARGEST_OPEN_BLOCK <", value, "largestOpenBlock");
            return (Criteria) this;
        }

        public Criteria andLargestOpenBlockLessThanOrEqualTo(Long value) {
            addCriterion("LARGEST_OPEN_BLOCK <=", value, "largestOpenBlock");
            return (Criteria) this;
        }

        public Criteria andLargestOpenBlockIn(List<Long> values) {
            addCriterion("LARGEST_OPEN_BLOCK in", values, "largestOpenBlock");
            return (Criteria) this;
        }

        public Criteria andLargestOpenBlockNotIn(List<Long> values) {
            addCriterion("LARGEST_OPEN_BLOCK not in", values, "largestOpenBlock");
            return (Criteria) this;
        }

        public Criteria andLargestOpenBlockBetween(Long value1, Long value2) {
            addCriterion("LARGEST_OPEN_BLOCK between", value1, value2, "largestOpenBlock");
            return (Criteria) this;
        }

        public Criteria andLargestOpenBlockNotBetween(Long value1, Long value2) {
            addCriterion("LARGEST_OPEN_BLOCK not between", value1, value2, "largestOpenBlock");
            return (Criteria) this;
        }

        public Criteria andConditionIsNull() {
            addCriterion("CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andConditionIsNotNull() {
            addCriterion("CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andConditionEqualTo(String value) {
            addCriterion("CONDITION =", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotEqualTo(String value) {
            addCriterion("CONDITION <>", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionGreaterThan(String value) {
            addCriterion("CONDITION >", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionGreaterThanOrEqualTo(String value) {
            addCriterion("CONDITION >=", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLessThan(String value) {
            addCriterion("CONDITION <", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLessThanOrEqualTo(String value) {
            addCriterion("CONDITION <=", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLike(String value) {
            addCriterion("CONDITION like", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotLike(String value) {
            addCriterion("CONDITION not like", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionIn(List<String> values) {
            addCriterion("CONDITION in", values, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotIn(List<String> values) {
            addCriterion("CONDITION not in", values, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionBetween(String value1, String value2) {
            addCriterion("CONDITION between", value1, value2, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotBetween(String value1, String value2) {
            addCriterion("CONDITION not between", value1, value2, "condition");
            return (Criteria) this;
        }

        public Criteria andParentTemplateIsNull() {
            addCriterion("PARENT_TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andParentTemplateIsNotNull() {
            addCriterion("PARENT_TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andParentTemplateEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE =", value, "parentTemplate");
            return (Criteria) this;
        }

        public Criteria andParentTemplateNotEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE <>", value, "parentTemplate");
            return (Criteria) this;
        }

        public Criteria andParentTemplateGreaterThan(String value) {
            addCriterion("PARENT_TEMPLATE >", value, "parentTemplate");
            return (Criteria) this;
        }

        public Criteria andParentTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE >=", value, "parentTemplate");
            return (Criteria) this;
        }

        public Criteria andParentTemplateLessThan(String value) {
            addCriterion("PARENT_TEMPLATE <", value, "parentTemplate");
            return (Criteria) this;
        }

        public Criteria andParentTemplateLessThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE <=", value, "parentTemplate");
            return (Criteria) this;
        }

        public Criteria andParentTemplateLike(String value) {
            addCriterion("PARENT_TEMPLATE like", value, "parentTemplate");
            return (Criteria) this;
        }

        public Criteria andParentTemplateNotLike(String value) {
            addCriterion("PARENT_TEMPLATE not like", value, "parentTemplate");
            return (Criteria) this;
        }

        public Criteria andParentTemplateIn(List<String> values) {
            addCriterion("PARENT_TEMPLATE in", values, "parentTemplate");
            return (Criteria) this;
        }

        public Criteria andParentTemplateNotIn(List<String> values) {
            addCriterion("PARENT_TEMPLATE not in", values, "parentTemplate");
            return (Criteria) this;
        }

        public Criteria andParentTemplateBetween(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE between", value1, value2, "parentTemplate");
            return (Criteria) this;
        }

        public Criteria andParentTemplateNotBetween(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE not between", value1, value2, "parentTemplate");
            return (Criteria) this;
        }

        public Criteria andParentTemplate2IsNull() {
            addCriterion("PARENT_TEMPLATE_2 is null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate2IsNotNull() {
            addCriterion("PARENT_TEMPLATE_2 is not null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate2EqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_2 =", value, "parentTemplate2");
            return (Criteria) this;
        }

        public Criteria andParentTemplate2NotEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_2 <>", value, "parentTemplate2");
            return (Criteria) this;
        }

        public Criteria andParentTemplate2GreaterThan(String value) {
            addCriterion("PARENT_TEMPLATE_2 >", value, "parentTemplate2");
            return (Criteria) this;
        }

        public Criteria andParentTemplate2GreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_2 >=", value, "parentTemplate2");
            return (Criteria) this;
        }

        public Criteria andParentTemplate2LessThan(String value) {
            addCriterion("PARENT_TEMPLATE_2 <", value, "parentTemplate2");
            return (Criteria) this;
        }

        public Criteria andParentTemplate2LessThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_2 <=", value, "parentTemplate2");
            return (Criteria) this;
        }

        public Criteria andParentTemplate2Like(String value) {
            addCriterion("PARENT_TEMPLATE_2 like", value, "parentTemplate2");
            return (Criteria) this;
        }

        public Criteria andParentTemplate2NotLike(String value) {
            addCriterion("PARENT_TEMPLATE_2 not like", value, "parentTemplate2");
            return (Criteria) this;
        }

        public Criteria andParentTemplate2In(List<String> values) {
            addCriterion("PARENT_TEMPLATE_2 in", values, "parentTemplate2");
            return (Criteria) this;
        }

        public Criteria andParentTemplate2NotIn(List<String> values) {
            addCriterion("PARENT_TEMPLATE_2 not in", values, "parentTemplate2");
            return (Criteria) this;
        }

        public Criteria andParentTemplate2Between(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_2 between", value1, value2, "parentTemplate2");
            return (Criteria) this;
        }

        public Criteria andParentTemplate2NotBetween(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_2 not between", value1, value2, "parentTemplate2");
            return (Criteria) this;
        }

        public Criteria andParentTemplate3IsNull() {
            addCriterion("PARENT_TEMPLATE_3 is null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate3IsNotNull() {
            addCriterion("PARENT_TEMPLATE_3 is not null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate3EqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_3 =", value, "parentTemplate3");
            return (Criteria) this;
        }

        public Criteria andParentTemplate3NotEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_3 <>", value, "parentTemplate3");
            return (Criteria) this;
        }

        public Criteria andParentTemplate3GreaterThan(String value) {
            addCriterion("PARENT_TEMPLATE_3 >", value, "parentTemplate3");
            return (Criteria) this;
        }

        public Criteria andParentTemplate3GreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_3 >=", value, "parentTemplate3");
            return (Criteria) this;
        }

        public Criteria andParentTemplate3LessThan(String value) {
            addCriterion("PARENT_TEMPLATE_3 <", value, "parentTemplate3");
            return (Criteria) this;
        }

        public Criteria andParentTemplate3LessThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_3 <=", value, "parentTemplate3");
            return (Criteria) this;
        }

        public Criteria andParentTemplate3Like(String value) {
            addCriterion("PARENT_TEMPLATE_3 like", value, "parentTemplate3");
            return (Criteria) this;
        }

        public Criteria andParentTemplate3NotLike(String value) {
            addCriterion("PARENT_TEMPLATE_3 not like", value, "parentTemplate3");
            return (Criteria) this;
        }

        public Criteria andParentTemplate3In(List<String> values) {
            addCriterion("PARENT_TEMPLATE_3 in", values, "parentTemplate3");
            return (Criteria) this;
        }

        public Criteria andParentTemplate3NotIn(List<String> values) {
            addCriterion("PARENT_TEMPLATE_3 not in", values, "parentTemplate3");
            return (Criteria) this;
        }

        public Criteria andParentTemplate3Between(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_3 between", value1, value2, "parentTemplate3");
            return (Criteria) this;
        }

        public Criteria andParentTemplate3NotBetween(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_3 not between", value1, value2, "parentTemplate3");
            return (Criteria) this;
        }

        public Criteria andParentTemplate4IsNull() {
            addCriterion("PARENT_TEMPLATE_4 is null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate4IsNotNull() {
            addCriterion("PARENT_TEMPLATE_4 is not null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate4EqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_4 =", value, "parentTemplate4");
            return (Criteria) this;
        }

        public Criteria andParentTemplate4NotEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_4 <>", value, "parentTemplate4");
            return (Criteria) this;
        }

        public Criteria andParentTemplate4GreaterThan(String value) {
            addCriterion("PARENT_TEMPLATE_4 >", value, "parentTemplate4");
            return (Criteria) this;
        }

        public Criteria andParentTemplate4GreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_4 >=", value, "parentTemplate4");
            return (Criteria) this;
        }

        public Criteria andParentTemplate4LessThan(String value) {
            addCriterion("PARENT_TEMPLATE_4 <", value, "parentTemplate4");
            return (Criteria) this;
        }

        public Criteria andParentTemplate4LessThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_4 <=", value, "parentTemplate4");
            return (Criteria) this;
        }

        public Criteria andParentTemplate4Like(String value) {
            addCriterion("PARENT_TEMPLATE_4 like", value, "parentTemplate4");
            return (Criteria) this;
        }

        public Criteria andParentTemplate4NotLike(String value) {
            addCriterion("PARENT_TEMPLATE_4 not like", value, "parentTemplate4");
            return (Criteria) this;
        }

        public Criteria andParentTemplate4In(List<String> values) {
            addCriterion("PARENT_TEMPLATE_4 in", values, "parentTemplate4");
            return (Criteria) this;
        }

        public Criteria andParentTemplate4NotIn(List<String> values) {
            addCriterion("PARENT_TEMPLATE_4 not in", values, "parentTemplate4");
            return (Criteria) this;
        }

        public Criteria andParentTemplate4Between(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_4 between", value1, value2, "parentTemplate4");
            return (Criteria) this;
        }

        public Criteria andParentTemplate4NotBetween(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_4 not between", value1, value2, "parentTemplate4");
            return (Criteria) this;
        }

        public Criteria andParentTemplate5IsNull() {
            addCriterion("PARENT_TEMPLATE_5 is null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate5IsNotNull() {
            addCriterion("PARENT_TEMPLATE_5 is not null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate5EqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_5 =", value, "parentTemplate5");
            return (Criteria) this;
        }

        public Criteria andParentTemplate5NotEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_5 <>", value, "parentTemplate5");
            return (Criteria) this;
        }

        public Criteria andParentTemplate5GreaterThan(String value) {
            addCriterion("PARENT_TEMPLATE_5 >", value, "parentTemplate5");
            return (Criteria) this;
        }

        public Criteria andParentTemplate5GreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_5 >=", value, "parentTemplate5");
            return (Criteria) this;
        }

        public Criteria andParentTemplate5LessThan(String value) {
            addCriterion("PARENT_TEMPLATE_5 <", value, "parentTemplate5");
            return (Criteria) this;
        }

        public Criteria andParentTemplate5LessThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_5 <=", value, "parentTemplate5");
            return (Criteria) this;
        }

        public Criteria andParentTemplate5Like(String value) {
            addCriterion("PARENT_TEMPLATE_5 like", value, "parentTemplate5");
            return (Criteria) this;
        }

        public Criteria andParentTemplate5NotLike(String value) {
            addCriterion("PARENT_TEMPLATE_5 not like", value, "parentTemplate5");
            return (Criteria) this;
        }

        public Criteria andParentTemplate5In(List<String> values) {
            addCriterion("PARENT_TEMPLATE_5 in", values, "parentTemplate5");
            return (Criteria) this;
        }

        public Criteria andParentTemplate5NotIn(List<String> values) {
            addCriterion("PARENT_TEMPLATE_5 not in", values, "parentTemplate5");
            return (Criteria) this;
        }

        public Criteria andParentTemplate5Between(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_5 between", value1, value2, "parentTemplate5");
            return (Criteria) this;
        }

        public Criteria andParentTemplate5NotBetween(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_5 not between", value1, value2, "parentTemplate5");
            return (Criteria) this;
        }

        public Criteria andParentTemplate6IsNull() {
            addCriterion("PARENT_TEMPLATE_6 is null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate6IsNotNull() {
            addCriterion("PARENT_TEMPLATE_6 is not null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate6EqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_6 =", value, "parentTemplate6");
            return (Criteria) this;
        }

        public Criteria andParentTemplate6NotEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_6 <>", value, "parentTemplate6");
            return (Criteria) this;
        }

        public Criteria andParentTemplate6GreaterThan(String value) {
            addCriterion("PARENT_TEMPLATE_6 >", value, "parentTemplate6");
            return (Criteria) this;
        }

        public Criteria andParentTemplate6GreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_6 >=", value, "parentTemplate6");
            return (Criteria) this;
        }

        public Criteria andParentTemplate6LessThan(String value) {
            addCriterion("PARENT_TEMPLATE_6 <", value, "parentTemplate6");
            return (Criteria) this;
        }

        public Criteria andParentTemplate6LessThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_6 <=", value, "parentTemplate6");
            return (Criteria) this;
        }

        public Criteria andParentTemplate6Like(String value) {
            addCriterion("PARENT_TEMPLATE_6 like", value, "parentTemplate6");
            return (Criteria) this;
        }

        public Criteria andParentTemplate6NotLike(String value) {
            addCriterion("PARENT_TEMPLATE_6 not like", value, "parentTemplate6");
            return (Criteria) this;
        }

        public Criteria andParentTemplate6In(List<String> values) {
            addCriterion("PARENT_TEMPLATE_6 in", values, "parentTemplate6");
            return (Criteria) this;
        }

        public Criteria andParentTemplate6NotIn(List<String> values) {
            addCriterion("PARENT_TEMPLATE_6 not in", values, "parentTemplate6");
            return (Criteria) this;
        }

        public Criteria andParentTemplate6Between(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_6 between", value1, value2, "parentTemplate6");
            return (Criteria) this;
        }

        public Criteria andParentTemplate6NotBetween(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_6 not between", value1, value2, "parentTemplate6");
            return (Criteria) this;
        }

        public Criteria andParentTemplate7IsNull() {
            addCriterion("PARENT_TEMPLATE_7 is null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate7IsNotNull() {
            addCriterion("PARENT_TEMPLATE_7 is not null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate7EqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_7 =", value, "parentTemplate7");
            return (Criteria) this;
        }

        public Criteria andParentTemplate7NotEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_7 <>", value, "parentTemplate7");
            return (Criteria) this;
        }

        public Criteria andParentTemplate7GreaterThan(String value) {
            addCriterion("PARENT_TEMPLATE_7 >", value, "parentTemplate7");
            return (Criteria) this;
        }

        public Criteria andParentTemplate7GreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_7 >=", value, "parentTemplate7");
            return (Criteria) this;
        }

        public Criteria andParentTemplate7LessThan(String value) {
            addCriterion("PARENT_TEMPLATE_7 <", value, "parentTemplate7");
            return (Criteria) this;
        }

        public Criteria andParentTemplate7LessThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_7 <=", value, "parentTemplate7");
            return (Criteria) this;
        }

        public Criteria andParentTemplate7Like(String value) {
            addCriterion("PARENT_TEMPLATE_7 like", value, "parentTemplate7");
            return (Criteria) this;
        }

        public Criteria andParentTemplate7NotLike(String value) {
            addCriterion("PARENT_TEMPLATE_7 not like", value, "parentTemplate7");
            return (Criteria) this;
        }

        public Criteria andParentTemplate7In(List<String> values) {
            addCriterion("PARENT_TEMPLATE_7 in", values, "parentTemplate7");
            return (Criteria) this;
        }

        public Criteria andParentTemplate7NotIn(List<String> values) {
            addCriterion("PARENT_TEMPLATE_7 not in", values, "parentTemplate7");
            return (Criteria) this;
        }

        public Criteria andParentTemplate7Between(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_7 between", value1, value2, "parentTemplate7");
            return (Criteria) this;
        }

        public Criteria andParentTemplate7NotBetween(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_7 not between", value1, value2, "parentTemplate7");
            return (Criteria) this;
        }

        public Criteria andParentTemplate8IsNull() {
            addCriterion("PARENT_TEMPLATE_8 is null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate8IsNotNull() {
            addCriterion("PARENT_TEMPLATE_8 is not null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate8EqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_8 =", value, "parentTemplate8");
            return (Criteria) this;
        }

        public Criteria andParentTemplate8NotEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_8 <>", value, "parentTemplate8");
            return (Criteria) this;
        }

        public Criteria andParentTemplate8GreaterThan(String value) {
            addCriterion("PARENT_TEMPLATE_8 >", value, "parentTemplate8");
            return (Criteria) this;
        }

        public Criteria andParentTemplate8GreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_8 >=", value, "parentTemplate8");
            return (Criteria) this;
        }

        public Criteria andParentTemplate8LessThan(String value) {
            addCriterion("PARENT_TEMPLATE_8 <", value, "parentTemplate8");
            return (Criteria) this;
        }

        public Criteria andParentTemplate8LessThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_8 <=", value, "parentTemplate8");
            return (Criteria) this;
        }

        public Criteria andParentTemplate8Like(String value) {
            addCriterion("PARENT_TEMPLATE_8 like", value, "parentTemplate8");
            return (Criteria) this;
        }

        public Criteria andParentTemplate8NotLike(String value) {
            addCriterion("PARENT_TEMPLATE_8 not like", value, "parentTemplate8");
            return (Criteria) this;
        }

        public Criteria andParentTemplate8In(List<String> values) {
            addCriterion("PARENT_TEMPLATE_8 in", values, "parentTemplate8");
            return (Criteria) this;
        }

        public Criteria andParentTemplate8NotIn(List<String> values) {
            addCriterion("PARENT_TEMPLATE_8 not in", values, "parentTemplate8");
            return (Criteria) this;
        }

        public Criteria andParentTemplate8Between(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_8 between", value1, value2, "parentTemplate8");
            return (Criteria) this;
        }

        public Criteria andParentTemplate8NotBetween(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_8 not between", value1, value2, "parentTemplate8");
            return (Criteria) this;
        }

        public Criteria andParentTemplate9IsNull() {
            addCriterion("PARENT_TEMPLATE_9 is null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate9IsNotNull() {
            addCriterion("PARENT_TEMPLATE_9 is not null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate9EqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_9 =", value, "parentTemplate9");
            return (Criteria) this;
        }

        public Criteria andParentTemplate9NotEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_9 <>", value, "parentTemplate9");
            return (Criteria) this;
        }

        public Criteria andParentTemplate9GreaterThan(String value) {
            addCriterion("PARENT_TEMPLATE_9 >", value, "parentTemplate9");
            return (Criteria) this;
        }

        public Criteria andParentTemplate9GreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_9 >=", value, "parentTemplate9");
            return (Criteria) this;
        }

        public Criteria andParentTemplate9LessThan(String value) {
            addCriterion("PARENT_TEMPLATE_9 <", value, "parentTemplate9");
            return (Criteria) this;
        }

        public Criteria andParentTemplate9LessThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_9 <=", value, "parentTemplate9");
            return (Criteria) this;
        }

        public Criteria andParentTemplate9Like(String value) {
            addCriterion("PARENT_TEMPLATE_9 like", value, "parentTemplate9");
            return (Criteria) this;
        }

        public Criteria andParentTemplate9NotLike(String value) {
            addCriterion("PARENT_TEMPLATE_9 not like", value, "parentTemplate9");
            return (Criteria) this;
        }

        public Criteria andParentTemplate9In(List<String> values) {
            addCriterion("PARENT_TEMPLATE_9 in", values, "parentTemplate9");
            return (Criteria) this;
        }

        public Criteria andParentTemplate9NotIn(List<String> values) {
            addCriterion("PARENT_TEMPLATE_9 not in", values, "parentTemplate9");
            return (Criteria) this;
        }

        public Criteria andParentTemplate9Between(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_9 between", value1, value2, "parentTemplate9");
            return (Criteria) this;
        }

        public Criteria andParentTemplate9NotBetween(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_9 not between", value1, value2, "parentTemplate9");
            return (Criteria) this;
        }

        public Criteria andParentTemplate10IsNull() {
            addCriterion("PARENT_TEMPLATE_10 is null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate10IsNotNull() {
            addCriterion("PARENT_TEMPLATE_10 is not null");
            return (Criteria) this;
        }

        public Criteria andParentTemplate10EqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_10 =", value, "parentTemplate10");
            return (Criteria) this;
        }

        public Criteria andParentTemplate10NotEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_10 <>", value, "parentTemplate10");
            return (Criteria) this;
        }

        public Criteria andParentTemplate10GreaterThan(String value) {
            addCriterion("PARENT_TEMPLATE_10 >", value, "parentTemplate10");
            return (Criteria) this;
        }

        public Criteria andParentTemplate10GreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_10 >=", value, "parentTemplate10");
            return (Criteria) this;
        }

        public Criteria andParentTemplate10LessThan(String value) {
            addCriterion("PARENT_TEMPLATE_10 <", value, "parentTemplate10");
            return (Criteria) this;
        }

        public Criteria andParentTemplate10LessThanOrEqualTo(String value) {
            addCriterion("PARENT_TEMPLATE_10 <=", value, "parentTemplate10");
            return (Criteria) this;
        }

        public Criteria andParentTemplate10Like(String value) {
            addCriterion("PARENT_TEMPLATE_10 like", value, "parentTemplate10");
            return (Criteria) this;
        }

        public Criteria andParentTemplate10NotLike(String value) {
            addCriterion("PARENT_TEMPLATE_10 not like", value, "parentTemplate10");
            return (Criteria) this;
        }

        public Criteria andParentTemplate10In(List<String> values) {
            addCriterion("PARENT_TEMPLATE_10 in", values, "parentTemplate10");
            return (Criteria) this;
        }

        public Criteria andParentTemplate10NotIn(List<String> values) {
            addCriterion("PARENT_TEMPLATE_10 not in", values, "parentTemplate10");
            return (Criteria) this;
        }

        public Criteria andParentTemplate10Between(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_10 between", value1, value2, "parentTemplate10");
            return (Criteria) this;
        }

        public Criteria andParentTemplate10NotBetween(String value1, String value2) {
            addCriterion("PARENT_TEMPLATE_10 not between", value1, value2, "parentTemplate10");
            return (Criteria) this;
        }

        public Criteria andParentLocation2IsNull() {
            addCriterion("PARENT_LOCATION_2 is null");
            return (Criteria) this;
        }

        public Criteria andParentLocation2IsNotNull() {
            addCriterion("PARENT_LOCATION_2 is not null");
            return (Criteria) this;
        }

        public Criteria andParentLocation2EqualTo(Long value) {
            addCriterion("PARENT_LOCATION_2 =", value, "parentLocation2");
            return (Criteria) this;
        }

        public Criteria andParentLocation2NotEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_2 <>", value, "parentLocation2");
            return (Criteria) this;
        }

        public Criteria andParentLocation2GreaterThan(Long value) {
            addCriterion("PARENT_LOCATION_2 >", value, "parentLocation2");
            return (Criteria) this;
        }

        public Criteria andParentLocation2GreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_2 >=", value, "parentLocation2");
            return (Criteria) this;
        }

        public Criteria andParentLocation2LessThan(Long value) {
            addCriterion("PARENT_LOCATION_2 <", value, "parentLocation2");
            return (Criteria) this;
        }

        public Criteria andParentLocation2LessThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_2 <=", value, "parentLocation2");
            return (Criteria) this;
        }

        public Criteria andParentLocation2In(List<Long> values) {
            addCriterion("PARENT_LOCATION_2 in", values, "parentLocation2");
            return (Criteria) this;
        }

        public Criteria andParentLocation2NotIn(List<Long> values) {
            addCriterion("PARENT_LOCATION_2 not in", values, "parentLocation2");
            return (Criteria) this;
        }

        public Criteria andParentLocation2Between(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_2 between", value1, value2, "parentLocation2");
            return (Criteria) this;
        }

        public Criteria andParentLocation2NotBetween(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_2 not between", value1, value2, "parentLocation2");
            return (Criteria) this;
        }

        public Criteria andParentLocation3IsNull() {
            addCriterion("PARENT_LOCATION_3 is null");
            return (Criteria) this;
        }

        public Criteria andParentLocation3IsNotNull() {
            addCriterion("PARENT_LOCATION_3 is not null");
            return (Criteria) this;
        }

        public Criteria andParentLocation3EqualTo(Long value) {
            addCriterion("PARENT_LOCATION_3 =", value, "parentLocation3");
            return (Criteria) this;
        }

        public Criteria andParentLocation3NotEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_3 <>", value, "parentLocation3");
            return (Criteria) this;
        }

        public Criteria andParentLocation3GreaterThan(Long value) {
            addCriterion("PARENT_LOCATION_3 >", value, "parentLocation3");
            return (Criteria) this;
        }

        public Criteria andParentLocation3GreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_3 >=", value, "parentLocation3");
            return (Criteria) this;
        }

        public Criteria andParentLocation3LessThan(Long value) {
            addCriterion("PARENT_LOCATION_3 <", value, "parentLocation3");
            return (Criteria) this;
        }

        public Criteria andParentLocation3LessThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_3 <=", value, "parentLocation3");
            return (Criteria) this;
        }

        public Criteria andParentLocation3In(List<Long> values) {
            addCriterion("PARENT_LOCATION_3 in", values, "parentLocation3");
            return (Criteria) this;
        }

        public Criteria andParentLocation3NotIn(List<Long> values) {
            addCriterion("PARENT_LOCATION_3 not in", values, "parentLocation3");
            return (Criteria) this;
        }

        public Criteria andParentLocation3Between(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_3 between", value1, value2, "parentLocation3");
            return (Criteria) this;
        }

        public Criteria andParentLocation3NotBetween(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_3 not between", value1, value2, "parentLocation3");
            return (Criteria) this;
        }

        public Criteria andParentLocation4IsNull() {
            addCriterion("PARENT_LOCATION_4 is null");
            return (Criteria) this;
        }

        public Criteria andParentLocation4IsNotNull() {
            addCriterion("PARENT_LOCATION_4 is not null");
            return (Criteria) this;
        }

        public Criteria andParentLocation4EqualTo(Long value) {
            addCriterion("PARENT_LOCATION_4 =", value, "parentLocation4");
            return (Criteria) this;
        }

        public Criteria andParentLocation4NotEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_4 <>", value, "parentLocation4");
            return (Criteria) this;
        }

        public Criteria andParentLocation4GreaterThan(Long value) {
            addCriterion("PARENT_LOCATION_4 >", value, "parentLocation4");
            return (Criteria) this;
        }

        public Criteria andParentLocation4GreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_4 >=", value, "parentLocation4");
            return (Criteria) this;
        }

        public Criteria andParentLocation4LessThan(Long value) {
            addCriterion("PARENT_LOCATION_4 <", value, "parentLocation4");
            return (Criteria) this;
        }

        public Criteria andParentLocation4LessThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_4 <=", value, "parentLocation4");
            return (Criteria) this;
        }

        public Criteria andParentLocation4In(List<Long> values) {
            addCriterion("PARENT_LOCATION_4 in", values, "parentLocation4");
            return (Criteria) this;
        }

        public Criteria andParentLocation4NotIn(List<Long> values) {
            addCriterion("PARENT_LOCATION_4 not in", values, "parentLocation4");
            return (Criteria) this;
        }

        public Criteria andParentLocation4Between(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_4 between", value1, value2, "parentLocation4");
            return (Criteria) this;
        }

        public Criteria andParentLocation4NotBetween(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_4 not between", value1, value2, "parentLocation4");
            return (Criteria) this;
        }

        public Criteria andParentLocation5IsNull() {
            addCriterion("PARENT_LOCATION_5 is null");
            return (Criteria) this;
        }

        public Criteria andParentLocation5IsNotNull() {
            addCriterion("PARENT_LOCATION_5 is not null");
            return (Criteria) this;
        }

        public Criteria andParentLocation5EqualTo(Long value) {
            addCriterion("PARENT_LOCATION_5 =", value, "parentLocation5");
            return (Criteria) this;
        }

        public Criteria andParentLocation5NotEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_5 <>", value, "parentLocation5");
            return (Criteria) this;
        }

        public Criteria andParentLocation5GreaterThan(Long value) {
            addCriterion("PARENT_LOCATION_5 >", value, "parentLocation5");
            return (Criteria) this;
        }

        public Criteria andParentLocation5GreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_5 >=", value, "parentLocation5");
            return (Criteria) this;
        }

        public Criteria andParentLocation5LessThan(Long value) {
            addCriterion("PARENT_LOCATION_5 <", value, "parentLocation5");
            return (Criteria) this;
        }

        public Criteria andParentLocation5LessThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_5 <=", value, "parentLocation5");
            return (Criteria) this;
        }

        public Criteria andParentLocation5In(List<Long> values) {
            addCriterion("PARENT_LOCATION_5 in", values, "parentLocation5");
            return (Criteria) this;
        }

        public Criteria andParentLocation5NotIn(List<Long> values) {
            addCriterion("PARENT_LOCATION_5 not in", values, "parentLocation5");
            return (Criteria) this;
        }

        public Criteria andParentLocation5Between(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_5 between", value1, value2, "parentLocation5");
            return (Criteria) this;
        }

        public Criteria andParentLocation5NotBetween(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_5 not between", value1, value2, "parentLocation5");
            return (Criteria) this;
        }

        public Criteria andParentLocation6IsNull() {
            addCriterion("PARENT_LOCATION_6 is null");
            return (Criteria) this;
        }

        public Criteria andParentLocation6IsNotNull() {
            addCriterion("PARENT_LOCATION_6 is not null");
            return (Criteria) this;
        }

        public Criteria andParentLocation6EqualTo(Long value) {
            addCriterion("PARENT_LOCATION_6 =", value, "parentLocation6");
            return (Criteria) this;
        }

        public Criteria andParentLocation6NotEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_6 <>", value, "parentLocation6");
            return (Criteria) this;
        }

        public Criteria andParentLocation6GreaterThan(Long value) {
            addCriterion("PARENT_LOCATION_6 >", value, "parentLocation6");
            return (Criteria) this;
        }

        public Criteria andParentLocation6GreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_6 >=", value, "parentLocation6");
            return (Criteria) this;
        }

        public Criteria andParentLocation6LessThan(Long value) {
            addCriterion("PARENT_LOCATION_6 <", value, "parentLocation6");
            return (Criteria) this;
        }

        public Criteria andParentLocation6LessThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_6 <=", value, "parentLocation6");
            return (Criteria) this;
        }

        public Criteria andParentLocation6In(List<Long> values) {
            addCriterion("PARENT_LOCATION_6 in", values, "parentLocation6");
            return (Criteria) this;
        }

        public Criteria andParentLocation6NotIn(List<Long> values) {
            addCriterion("PARENT_LOCATION_6 not in", values, "parentLocation6");
            return (Criteria) this;
        }

        public Criteria andParentLocation6Between(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_6 between", value1, value2, "parentLocation6");
            return (Criteria) this;
        }

        public Criteria andParentLocation6NotBetween(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_6 not between", value1, value2, "parentLocation6");
            return (Criteria) this;
        }

        public Criteria andParentLocation7IsNull() {
            addCriterion("PARENT_LOCATION_7 is null");
            return (Criteria) this;
        }

        public Criteria andParentLocation7IsNotNull() {
            addCriterion("PARENT_LOCATION_7 is not null");
            return (Criteria) this;
        }

        public Criteria andParentLocation7EqualTo(Long value) {
            addCriterion("PARENT_LOCATION_7 =", value, "parentLocation7");
            return (Criteria) this;
        }

        public Criteria andParentLocation7NotEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_7 <>", value, "parentLocation7");
            return (Criteria) this;
        }

        public Criteria andParentLocation7GreaterThan(Long value) {
            addCriterion("PARENT_LOCATION_7 >", value, "parentLocation7");
            return (Criteria) this;
        }

        public Criteria andParentLocation7GreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_7 >=", value, "parentLocation7");
            return (Criteria) this;
        }

        public Criteria andParentLocation7LessThan(Long value) {
            addCriterion("PARENT_LOCATION_7 <", value, "parentLocation7");
            return (Criteria) this;
        }

        public Criteria andParentLocation7LessThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_7 <=", value, "parentLocation7");
            return (Criteria) this;
        }

        public Criteria andParentLocation7In(List<Long> values) {
            addCriterion("PARENT_LOCATION_7 in", values, "parentLocation7");
            return (Criteria) this;
        }

        public Criteria andParentLocation7NotIn(List<Long> values) {
            addCriterion("PARENT_LOCATION_7 not in", values, "parentLocation7");
            return (Criteria) this;
        }

        public Criteria andParentLocation7Between(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_7 between", value1, value2, "parentLocation7");
            return (Criteria) this;
        }

        public Criteria andParentLocation7NotBetween(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_7 not between", value1, value2, "parentLocation7");
            return (Criteria) this;
        }

        public Criteria andParentLocation8IsNull() {
            addCriterion("PARENT_LOCATION_8 is null");
            return (Criteria) this;
        }

        public Criteria andParentLocation8IsNotNull() {
            addCriterion("PARENT_LOCATION_8 is not null");
            return (Criteria) this;
        }

        public Criteria andParentLocation8EqualTo(Long value) {
            addCriterion("PARENT_LOCATION_8 =", value, "parentLocation8");
            return (Criteria) this;
        }

        public Criteria andParentLocation8NotEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_8 <>", value, "parentLocation8");
            return (Criteria) this;
        }

        public Criteria andParentLocation8GreaterThan(Long value) {
            addCriterion("PARENT_LOCATION_8 >", value, "parentLocation8");
            return (Criteria) this;
        }

        public Criteria andParentLocation8GreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_8 >=", value, "parentLocation8");
            return (Criteria) this;
        }

        public Criteria andParentLocation8LessThan(Long value) {
            addCriterion("PARENT_LOCATION_8 <", value, "parentLocation8");
            return (Criteria) this;
        }

        public Criteria andParentLocation8LessThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_8 <=", value, "parentLocation8");
            return (Criteria) this;
        }

        public Criteria andParentLocation8In(List<Long> values) {
            addCriterion("PARENT_LOCATION_8 in", values, "parentLocation8");
            return (Criteria) this;
        }

        public Criteria andParentLocation8NotIn(List<Long> values) {
            addCriterion("PARENT_LOCATION_8 not in", values, "parentLocation8");
            return (Criteria) this;
        }

        public Criteria andParentLocation8Between(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_8 between", value1, value2, "parentLocation8");
            return (Criteria) this;
        }

        public Criteria andParentLocation8NotBetween(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_8 not between", value1, value2, "parentLocation8");
            return (Criteria) this;
        }

        public Criteria andParentLocation9IsNull() {
            addCriterion("PARENT_LOCATION_9 is null");
            return (Criteria) this;
        }

        public Criteria andParentLocation9IsNotNull() {
            addCriterion("PARENT_LOCATION_9 is not null");
            return (Criteria) this;
        }

        public Criteria andParentLocation9EqualTo(Long value) {
            addCriterion("PARENT_LOCATION_9 =", value, "parentLocation9");
            return (Criteria) this;
        }

        public Criteria andParentLocation9NotEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_9 <>", value, "parentLocation9");
            return (Criteria) this;
        }

        public Criteria andParentLocation9GreaterThan(Long value) {
            addCriterion("PARENT_LOCATION_9 >", value, "parentLocation9");
            return (Criteria) this;
        }

        public Criteria andParentLocation9GreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_9 >=", value, "parentLocation9");
            return (Criteria) this;
        }

        public Criteria andParentLocation9LessThan(Long value) {
            addCriterion("PARENT_LOCATION_9 <", value, "parentLocation9");
            return (Criteria) this;
        }

        public Criteria andParentLocation9LessThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_9 <=", value, "parentLocation9");
            return (Criteria) this;
        }

        public Criteria andParentLocation9In(List<Long> values) {
            addCriterion("PARENT_LOCATION_9 in", values, "parentLocation9");
            return (Criteria) this;
        }

        public Criteria andParentLocation9NotIn(List<Long> values) {
            addCriterion("PARENT_LOCATION_9 not in", values, "parentLocation9");
            return (Criteria) this;
        }

        public Criteria andParentLocation9Between(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_9 between", value1, value2, "parentLocation9");
            return (Criteria) this;
        }

        public Criteria andParentLocation9NotBetween(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_9 not between", value1, value2, "parentLocation9");
            return (Criteria) this;
        }

        public Criteria andParentLocation10IsNull() {
            addCriterion("PARENT_LOCATION_10 is null");
            return (Criteria) this;
        }

        public Criteria andParentLocation10IsNotNull() {
            addCriterion("PARENT_LOCATION_10 is not null");
            return (Criteria) this;
        }

        public Criteria andParentLocation10EqualTo(Long value) {
            addCriterion("PARENT_LOCATION_10 =", value, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10NotEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_10 <>", value, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10GreaterThan(Long value) {
            addCriterion("PARENT_LOCATION_10 >", value, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10GreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_10 >=", value, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10LessThan(Long value) {
            addCriterion("PARENT_LOCATION_10 <", value, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10LessThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_10 <=", value, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10In(List<Long> values) {
            addCriterion("PARENT_LOCATION_10 in", values, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10NotIn(List<Long> values) {
            addCriterion("PARENT_LOCATION_10 not in", values, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10Between(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_10 between", value1, value2, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10NotBetween(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_10 not between", value1, value2, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andLocationTypeIsNull() {
            addCriterion("LOCATION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLocationTypeIsNotNull() {
            addCriterion("LOCATION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLocationTypeEqualTo(String value) {
            addCriterion("LOCATION_TYPE =", value, "locationType");
            return (Criteria) this;
        }

        public Criteria andLocationTypeNotEqualTo(String value) {
            addCriterion("LOCATION_TYPE <>", value, "locationType");
            return (Criteria) this;
        }

        public Criteria andLocationTypeGreaterThan(String value) {
            addCriterion("LOCATION_TYPE >", value, "locationType");
            return (Criteria) this;
        }

        public Criteria andLocationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION_TYPE >=", value, "locationType");
            return (Criteria) this;
        }

        public Criteria andLocationTypeLessThan(String value) {
            addCriterion("LOCATION_TYPE <", value, "locationType");
            return (Criteria) this;
        }

        public Criteria andLocationTypeLessThanOrEqualTo(String value) {
            addCriterion("LOCATION_TYPE <=", value, "locationType");
            return (Criteria) this;
        }

        public Criteria andLocationTypeLike(String value) {
            addCriterion("LOCATION_TYPE like", value, "locationType");
            return (Criteria) this;
        }

        public Criteria andLocationTypeNotLike(String value) {
            addCriterion("LOCATION_TYPE not like", value, "locationType");
            return (Criteria) this;
        }

        public Criteria andLocationTypeIn(List<String> values) {
            addCriterion("LOCATION_TYPE in", values, "locationType");
            return (Criteria) this;
        }

        public Criteria andLocationTypeNotIn(List<String> values) {
            addCriterion("LOCATION_TYPE not in", values, "locationType");
            return (Criteria) this;
        }

        public Criteria andLocationTypeBetween(String value1, String value2) {
            addCriterion("LOCATION_TYPE between", value1, value2, "locationType");
            return (Criteria) this;
        }

        public Criteria andLocationTypeNotBetween(String value1, String value2) {
            addCriterion("LOCATION_TYPE not between", value1, value2, "locationType");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("ORDER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("ORDER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(Long value) {
            addCriterion("ORDER_NUMBER =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(Long value) {
            addCriterion("ORDER_NUMBER <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(Long value) {
            addCriterion("ORDER_NUMBER >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_NUMBER >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(Long value) {
            addCriterion("ORDER_NUMBER <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_NUMBER <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<Long> values) {
            addCriterion("ORDER_NUMBER in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<Long> values) {
            addCriterion("ORDER_NUMBER not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(Long value1, Long value2) {
            addCriterion("ORDER_NUMBER between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_NUMBER not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andReserveUntilIsNull() {
            addCriterion("RESERVE_UNTIL is null");
            return (Criteria) this;
        }

        public Criteria andReserveUntilIsNotNull() {
            addCriterion("RESERVE_UNTIL is not null");
            return (Criteria) this;
        }

        public Criteria andReserveUntilEqualTo(Date value) {
            addCriterionForJDBCDate("RESERVE_UNTIL =", value, "reserveUntil");
            return (Criteria) this;
        }

        public Criteria andReserveUntilNotEqualTo(Date value) {
            addCriterionForJDBCDate("RESERVE_UNTIL <>", value, "reserveUntil");
            return (Criteria) this;
        }

        public Criteria andReserveUntilGreaterThan(Date value) {
            addCriterionForJDBCDate("RESERVE_UNTIL >", value, "reserveUntil");
            return (Criteria) this;
        }

        public Criteria andReserveUntilGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RESERVE_UNTIL >=", value, "reserveUntil");
            return (Criteria) this;
        }

        public Criteria andReserveUntilLessThan(Date value) {
            addCriterionForJDBCDate("RESERVE_UNTIL <", value, "reserveUntil");
            return (Criteria) this;
        }

        public Criteria andReserveUntilLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RESERVE_UNTIL <=", value, "reserveUntil");
            return (Criteria) this;
        }

        public Criteria andReserveUntilIn(List<Date> values) {
            addCriterionForJDBCDate("RESERVE_UNTIL in", values, "reserveUntil");
            return (Criteria) this;
        }

        public Criteria andReserveUntilNotIn(List<Date> values) {
            addCriterionForJDBCDate("RESERVE_UNTIL not in", values, "reserveUntil");
            return (Criteria) this;
        }

        public Criteria andReserveUntilBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RESERVE_UNTIL between", value1, value2, "reserveUntil");
            return (Criteria) this;
        }

        public Criteria andReserveUntilNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RESERVE_UNTIL not between", value1, value2, "reserveUntil");
            return (Criteria) this;
        }

        public Criteria andHierarchyIsNull() {
            addCriterion("HIERARCHY is null");
            return (Criteria) this;
        }

        public Criteria andHierarchyIsNotNull() {
            addCriterion("HIERARCHY is not null");
            return (Criteria) this;
        }

        public Criteria andHierarchyEqualTo(String value) {
            addCriterion("HIERARCHY =", value, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyNotEqualTo(String value) {
            addCriterion("HIERARCHY <>", value, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyGreaterThan(String value) {
            addCriterion("HIERARCHY >", value, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyGreaterThanOrEqualTo(String value) {
            addCriterion("HIERARCHY >=", value, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyLessThan(String value) {
            addCriterion("HIERARCHY <", value, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyLessThanOrEqualTo(String value) {
            addCriterion("HIERARCHY <=", value, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyLike(String value) {
            addCriterion("HIERARCHY like", value, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyNotLike(String value) {
            addCriterion("HIERARCHY not like", value, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyIn(List<String> values) {
            addCriterion("HIERARCHY in", values, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyNotIn(List<String> values) {
            addCriterion("HIERARCHY not in", values, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyBetween(String value1, String value2) {
            addCriterion("HIERARCHY between", value1, value2, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyNotBetween(String value1, String value2) {
            addCriterion("HIERARCHY not between", value1, value2, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andStorageTemplateIsNull() {
            addCriterion("STORAGE_TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andStorageTemplateIsNotNull() {
            addCriterion("STORAGE_TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andStorageTemplateEqualTo(String value) {
            addCriterion("STORAGE_TEMPLATE =", value, "storageTemplate");
            return (Criteria) this;
        }

        public Criteria andStorageTemplateNotEqualTo(String value) {
            addCriterion("STORAGE_TEMPLATE <>", value, "storageTemplate");
            return (Criteria) this;
        }

        public Criteria andStorageTemplateGreaterThan(String value) {
            addCriterion("STORAGE_TEMPLATE >", value, "storageTemplate");
            return (Criteria) this;
        }

        public Criteria andStorageTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGE_TEMPLATE >=", value, "storageTemplate");
            return (Criteria) this;
        }

        public Criteria andStorageTemplateLessThan(String value) {
            addCriterion("STORAGE_TEMPLATE <", value, "storageTemplate");
            return (Criteria) this;
        }

        public Criteria andStorageTemplateLessThanOrEqualTo(String value) {
            addCriterion("STORAGE_TEMPLATE <=", value, "storageTemplate");
            return (Criteria) this;
        }

        public Criteria andStorageTemplateLike(String value) {
            addCriterion("STORAGE_TEMPLATE like", value, "storageTemplate");
            return (Criteria) this;
        }

        public Criteria andStorageTemplateNotLike(String value) {
            addCriterion("STORAGE_TEMPLATE not like", value, "storageTemplate");
            return (Criteria) this;
        }

        public Criteria andStorageTemplateIn(List<String> values) {
            addCriterion("STORAGE_TEMPLATE in", values, "storageTemplate");
            return (Criteria) this;
        }

        public Criteria andStorageTemplateNotIn(List<String> values) {
            addCriterion("STORAGE_TEMPLATE not in", values, "storageTemplate");
            return (Criteria) this;
        }

        public Criteria andStorageTemplateBetween(String value1, String value2) {
            addCriterion("STORAGE_TEMPLATE between", value1, value2, "storageTemplate");
            return (Criteria) this;
        }

        public Criteria andStorageTemplateNotBetween(String value1, String value2) {
            addCriterion("STORAGE_TEMPLATE not between", value1, value2, "storageTemplate");
            return (Criteria) this;
        }

        public Criteria andMovingIsNull() {
            addCriterion("MOVING is null");
            return (Criteria) this;
        }

        public Criteria andMovingIsNotNull() {
            addCriterion("MOVING is not null");
            return (Criteria) this;
        }

        public Criteria andMovingEqualTo(String value) {
            addCriterion("MOVING =", value, "moving");
            return (Criteria) this;
        }

        public Criteria andMovingNotEqualTo(String value) {
            addCriterion("MOVING <>", value, "moving");
            return (Criteria) this;
        }

        public Criteria andMovingGreaterThan(String value) {
            addCriterion("MOVING >", value, "moving");
            return (Criteria) this;
        }

        public Criteria andMovingGreaterThanOrEqualTo(String value) {
            addCriterion("MOVING >=", value, "moving");
            return (Criteria) this;
        }

        public Criteria andMovingLessThan(String value) {
            addCriterion("MOVING <", value, "moving");
            return (Criteria) this;
        }

        public Criteria andMovingLessThanOrEqualTo(String value) {
            addCriterion("MOVING <=", value, "moving");
            return (Criteria) this;
        }

        public Criteria andMovingLike(String value) {
            addCriterion("MOVING like", value, "moving");
            return (Criteria) this;
        }

        public Criteria andMovingNotLike(String value) {
            addCriterion("MOVING not like", value, "moving");
            return (Criteria) this;
        }

        public Criteria andMovingIn(List<String> values) {
            addCriterion("MOVING in", values, "moving");
            return (Criteria) this;
        }

        public Criteria andMovingNotIn(List<String> values) {
            addCriterion("MOVING not in", values, "moving");
            return (Criteria) this;
        }

        public Criteria andMovingBetween(String value1, String value2) {
            addCriterion("MOVING between", value1, value2, "moving");
            return (Criteria) this;
        }

        public Criteria andMovingNotBetween(String value1, String value2) {
            addCriterion("MOVING not between", value1, value2, "moving");
            return (Criteria) this;
        }

        public Criteria andBitmapNameIsNull() {
            addCriterion("BITMAP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBitmapNameIsNotNull() {
            addCriterion("BITMAP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBitmapNameEqualTo(String value) {
            addCriterion("BITMAP_NAME =", value, "bitmapName");
            return (Criteria) this;
        }

        public Criteria andBitmapNameNotEqualTo(String value) {
            addCriterion("BITMAP_NAME <>", value, "bitmapName");
            return (Criteria) this;
        }

        public Criteria andBitmapNameGreaterThan(String value) {
            addCriterion("BITMAP_NAME >", value, "bitmapName");
            return (Criteria) this;
        }

        public Criteria andBitmapNameGreaterThanOrEqualTo(String value) {
            addCriterion("BITMAP_NAME >=", value, "bitmapName");
            return (Criteria) this;
        }

        public Criteria andBitmapNameLessThan(String value) {
            addCriterion("BITMAP_NAME <", value, "bitmapName");
            return (Criteria) this;
        }

        public Criteria andBitmapNameLessThanOrEqualTo(String value) {
            addCriterion("BITMAP_NAME <=", value, "bitmapName");
            return (Criteria) this;
        }

        public Criteria andBitmapNameLike(String value) {
            addCriterion("BITMAP_NAME like", value, "bitmapName");
            return (Criteria) this;
        }

        public Criteria andBitmapNameNotLike(String value) {
            addCriterion("BITMAP_NAME not like", value, "bitmapName");
            return (Criteria) this;
        }

        public Criteria andBitmapNameIn(List<String> values) {
            addCriterion("BITMAP_NAME in", values, "bitmapName");
            return (Criteria) this;
        }

        public Criteria andBitmapNameNotIn(List<String> values) {
            addCriterion("BITMAP_NAME not in", values, "bitmapName");
            return (Criteria) this;
        }

        public Criteria andBitmapNameBetween(String value1, String value2) {
            addCriterion("BITMAP_NAME between", value1, value2, "bitmapName");
            return (Criteria) this;
        }

        public Criteria andBitmapNameNotBetween(String value1, String value2) {
            addCriterion("BITMAP_NAME not between", value1, value2, "bitmapName");
            return (Criteria) this;
        }

        public Criteria andLabelMaskIsNull() {
            addCriterion("LABEL_MASK is null");
            return (Criteria) this;
        }

        public Criteria andLabelMaskIsNotNull() {
            addCriterion("LABEL_MASK is not null");
            return (Criteria) this;
        }

        public Criteria andLabelMaskEqualTo(String value) {
            addCriterion("LABEL_MASK =", value, "labelMask");
            return (Criteria) this;
        }

        public Criteria andLabelMaskNotEqualTo(String value) {
            addCriterion("LABEL_MASK <>", value, "labelMask");
            return (Criteria) this;
        }

        public Criteria andLabelMaskGreaterThan(String value) {
            addCriterion("LABEL_MASK >", value, "labelMask");
            return (Criteria) this;
        }

        public Criteria andLabelMaskGreaterThanOrEqualTo(String value) {
            addCriterion("LABEL_MASK >=", value, "labelMask");
            return (Criteria) this;
        }

        public Criteria andLabelMaskLessThan(String value) {
            addCriterion("LABEL_MASK <", value, "labelMask");
            return (Criteria) this;
        }

        public Criteria andLabelMaskLessThanOrEqualTo(String value) {
            addCriterion("LABEL_MASK <=", value, "labelMask");
            return (Criteria) this;
        }

        public Criteria andLabelMaskLike(String value) {
            addCriterion("LABEL_MASK like", value, "labelMask");
            return (Criteria) this;
        }

        public Criteria andLabelMaskNotLike(String value) {
            addCriterion("LABEL_MASK not like", value, "labelMask");
            return (Criteria) this;
        }

        public Criteria andLabelMaskIn(List<String> values) {
            addCriterion("LABEL_MASK in", values, "labelMask");
            return (Criteria) this;
        }

        public Criteria andLabelMaskNotIn(List<String> values) {
            addCriterion("LABEL_MASK not in", values, "labelMask");
            return (Criteria) this;
        }

        public Criteria andLabelMaskBetween(String value1, String value2) {
            addCriterion("LABEL_MASK between", value1, value2, "labelMask");
            return (Criteria) this;
        }

        public Criteria andLabelMaskNotBetween(String value1, String value2) {
            addCriterion("LABEL_MASK not between", value1, value2, "labelMask");
            return (Criteria) this;
        }

        public Criteria andEstimatedCapacityIsNull() {
            addCriterion("ESTIMATED_CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedCapacityIsNotNull() {
            addCriterion("ESTIMATED_CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedCapacityEqualTo(String value) {
            addCriterion("ESTIMATED_CAPACITY =", value, "estimatedCapacity");
            return (Criteria) this;
        }

        public Criteria andEstimatedCapacityNotEqualTo(String value) {
            addCriterion("ESTIMATED_CAPACITY <>", value, "estimatedCapacity");
            return (Criteria) this;
        }

        public Criteria andEstimatedCapacityGreaterThan(String value) {
            addCriterion("ESTIMATED_CAPACITY >", value, "estimatedCapacity");
            return (Criteria) this;
        }

        public Criteria andEstimatedCapacityGreaterThanOrEqualTo(String value) {
            addCriterion("ESTIMATED_CAPACITY >=", value, "estimatedCapacity");
            return (Criteria) this;
        }

        public Criteria andEstimatedCapacityLessThan(String value) {
            addCriterion("ESTIMATED_CAPACITY <", value, "estimatedCapacity");
            return (Criteria) this;
        }

        public Criteria andEstimatedCapacityLessThanOrEqualTo(String value) {
            addCriterion("ESTIMATED_CAPACITY <=", value, "estimatedCapacity");
            return (Criteria) this;
        }

        public Criteria andEstimatedCapacityLike(String value) {
            addCriterion("ESTIMATED_CAPACITY like", value, "estimatedCapacity");
            return (Criteria) this;
        }

        public Criteria andEstimatedCapacityNotLike(String value) {
            addCriterion("ESTIMATED_CAPACITY not like", value, "estimatedCapacity");
            return (Criteria) this;
        }

        public Criteria andEstimatedCapacityIn(List<String> values) {
            addCriterion("ESTIMATED_CAPACITY in", values, "estimatedCapacity");
            return (Criteria) this;
        }

        public Criteria andEstimatedCapacityNotIn(List<String> values) {
            addCriterion("ESTIMATED_CAPACITY not in", values, "estimatedCapacity");
            return (Criteria) this;
        }

        public Criteria andEstimatedCapacityBetween(String value1, String value2) {
            addCriterion("ESTIMATED_CAPACITY between", value1, value2, "estimatedCapacity");
            return (Criteria) this;
        }

        public Criteria andEstimatedCapacityNotBetween(String value1, String value2) {
            addCriterion("ESTIMATED_CAPACITY not between", value1, value2, "estimatedCapacity");
            return (Criteria) this;
        }

        public Criteria andCLabIsNull() {
            addCriterion("C_LAB is null");
            return (Criteria) this;
        }

        public Criteria andCLabIsNotNull() {
            addCriterion("C_LAB is not null");
            return (Criteria) this;
        }

        public Criteria andCLabEqualTo(String value) {
            addCriterion("C_LAB =", value, "cLab");
            return (Criteria) this;
        }

        public Criteria andCLabNotEqualTo(String value) {
            addCriterion("C_LAB <>", value, "cLab");
            return (Criteria) this;
        }

        public Criteria andCLabGreaterThan(String value) {
            addCriterion("C_LAB >", value, "cLab");
            return (Criteria) this;
        }

        public Criteria andCLabGreaterThanOrEqualTo(String value) {
            addCriterion("C_LAB >=", value, "cLab");
            return (Criteria) this;
        }

        public Criteria andCLabLessThan(String value) {
            addCriterion("C_LAB <", value, "cLab");
            return (Criteria) this;
        }

        public Criteria andCLabLessThanOrEqualTo(String value) {
            addCriterion("C_LAB <=", value, "cLab");
            return (Criteria) this;
        }

        public Criteria andCLabLike(String value) {
            addCriterion("C_LAB like", value, "cLab");
            return (Criteria) this;
        }

        public Criteria andCLabNotLike(String value) {
            addCriterion("C_LAB not like", value, "cLab");
            return (Criteria) this;
        }

        public Criteria andCLabIn(List<String> values) {
            addCriterion("C_LAB in", values, "cLab");
            return (Criteria) this;
        }

        public Criteria andCLabNotIn(List<String> values) {
            addCriterion("C_LAB not in", values, "cLab");
            return (Criteria) this;
        }

        public Criteria andCLabBetween(String value1, String value2) {
            addCriterion("C_LAB between", value1, value2, "cLab");
            return (Criteria) this;
        }

        public Criteria andCLabNotBetween(String value1, String value2) {
            addCriterion("C_LAB not between", value1, value2, "cLab");
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