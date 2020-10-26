package cn.besbing.model.entities.primary;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andTemplateVersionIsNull() {
            addCriterion("TEMPLATE_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andTemplateVersionIsNotNull() {
            addCriterion("TEMPLATE_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateVersionEqualTo(Long value) {
            addCriterion("TEMPLATE_VERSION =", value, "templateVersion");
            return (Criteria) this;
        }

        public Criteria andTemplateVersionNotEqualTo(Long value) {
            addCriterion("TEMPLATE_VERSION <>", value, "templateVersion");
            return (Criteria) this;
        }

        public Criteria andTemplateVersionGreaterThan(Long value) {
            addCriterion("TEMPLATE_VERSION >", value, "templateVersion");
            return (Criteria) this;
        }

        public Criteria andTemplateVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("TEMPLATE_VERSION >=", value, "templateVersion");
            return (Criteria) this;
        }

        public Criteria andTemplateVersionLessThan(Long value) {
            addCriterion("TEMPLATE_VERSION <", value, "templateVersion");
            return (Criteria) this;
        }

        public Criteria andTemplateVersionLessThanOrEqualTo(Long value) {
            addCriterion("TEMPLATE_VERSION <=", value, "templateVersion");
            return (Criteria) this;
        }

        public Criteria andTemplateVersionIn(List<Long> values) {
            addCriterion("TEMPLATE_VERSION in", values, "templateVersion");
            return (Criteria) this;
        }

        public Criteria andTemplateVersionNotIn(List<Long> values) {
            addCriterion("TEMPLATE_VERSION not in", values, "templateVersion");
            return (Criteria) this;
        }

        public Criteria andTemplateVersionBetween(Long value1, Long value2) {
            addCriterion("TEMPLATE_VERSION between", value1, value2, "templateVersion");
            return (Criteria) this;
        }

        public Criteria andTemplateVersionNotBetween(Long value1, Long value2) {
            addCriterion("TEMPLATE_VERSION not between", value1, value2, "templateVersion");
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

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
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

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
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

        public Criteria andOldStatusIsNull() {
            addCriterion("OLD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOldStatusIsNotNull() {
            addCriterion("OLD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOldStatusEqualTo(String value) {
            addCriterion("OLD_STATUS =", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusNotEqualTo(String value) {
            addCriterion("OLD_STATUS <>", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusGreaterThan(String value) {
            addCriterion("OLD_STATUS >", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_STATUS >=", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusLessThan(String value) {
            addCriterion("OLD_STATUS <", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusLessThanOrEqualTo(String value) {
            addCriterion("OLD_STATUS <=", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusLike(String value) {
            addCriterion("OLD_STATUS like", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusNotLike(String value) {
            addCriterion("OLD_STATUS not like", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusIn(List<String> values) {
            addCriterion("OLD_STATUS in", values, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusNotIn(List<String> values) {
            addCriterion("OLD_STATUS not in", values, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusBetween(String value1, String value2) {
            addCriterion("OLD_STATUS between", value1, value2, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusNotBetween(String value1, String value2) {
            addCriterion("OLD_STATUS not between", value1, value2, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNull() {
            addCriterion("DATE_CREATED is null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNotNull() {
            addCriterion("DATE_CREATED is not null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_CREATED =", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_CREATED <>", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE_CREATED >", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_CREATED >=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThan(Date value) {
            addCriterionForJDBCDate("DATE_CREATED <", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_CREATED <=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_CREATED in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_CREATED not in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_CREATED between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_CREATED not between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateReceivedIsNull() {
            addCriterion("DATE_RECEIVED is null");
            return (Criteria) this;
        }

        public Criteria andDateReceivedIsNotNull() {
            addCriterion("DATE_RECEIVED is not null");
            return (Criteria) this;
        }

        public Criteria andDateReceivedEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_RECEIVED =", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_RECEIVED <>", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE_RECEIVED >", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_RECEIVED >=", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedLessThan(Date value) {
            addCriterionForJDBCDate("DATE_RECEIVED <", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_RECEIVED <=", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_RECEIVED in", values, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_RECEIVED not in", values, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_RECEIVED between", value1, value2, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_RECEIVED not between", value1, value2, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateStartedIsNull() {
            addCriterion("DATE_STARTED is null");
            return (Criteria) this;
        }

        public Criteria andDateStartedIsNotNull() {
            addCriterion("DATE_STARTED is not null");
            return (Criteria) this;
        }

        public Criteria andDateStartedEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_STARTED =", value, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_STARTED <>", value, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE_STARTED >", value, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_STARTED >=", value, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedLessThan(Date value) {
            addCriterionForJDBCDate("DATE_STARTED <", value, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_STARTED <=", value, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_STARTED in", values, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_STARTED not in", values, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_STARTED between", value1, value2, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_STARTED not between", value1, value2, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedIsNull() {
            addCriterion("DATE_COMPLETED is null");
            return (Criteria) this;
        }

        public Criteria andDateCompletedIsNotNull() {
            addCriterion("DATE_COMPLETED is not null");
            return (Criteria) this;
        }

        public Criteria andDateCompletedEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_COMPLETED =", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_COMPLETED <>", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE_COMPLETED >", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_COMPLETED >=", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedLessThan(Date value) {
            addCriterionForJDBCDate("DATE_COMPLETED <", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_COMPLETED <=", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_COMPLETED in", values, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_COMPLETED not in", values, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_COMPLETED between", value1, value2, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_COMPLETED not between", value1, value2, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateReviewedIsNull() {
            addCriterion("DATE_REVIEWED is null");
            return (Criteria) this;
        }

        public Criteria andDateReviewedIsNotNull() {
            addCriterion("DATE_REVIEWED is not null");
            return (Criteria) this;
        }

        public Criteria andDateReviewedEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_REVIEWED =", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_REVIEWED <>", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE_REVIEWED >", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_REVIEWED >=", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedLessThan(Date value) {
            addCriterionForJDBCDate("DATE_REVIEWED <", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_REVIEWED <=", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_REVIEWED in", values, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_REVIEWED not in", values, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_REVIEWED between", value1, value2, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_REVIEWED not between", value1, value2, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedIsNull() {
            addCriterion("DATE_UPDATED is null");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedIsNotNull() {
            addCriterion("DATE_UPDATED is not null");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_UPDATED =", value, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_UPDATED <>", value, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE_UPDATED >", value, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_UPDATED >=", value, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedLessThan(Date value) {
            addCriterionForJDBCDate("DATE_UPDATED <", value, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_UPDATED <=", value, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_UPDATED in", values, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_UPDATED not in", values, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_UPDATED between", value1, value2, "dateUpdated");
            return (Criteria) this;
        }

        public Criteria andDateUpdatedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_UPDATED not between", value1, value2, "dateUpdated");
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

        public Criteria andCustomerIsNull() {
            addCriterion("CUSTOMER is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("CUSTOMER is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("CUSTOMER =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("CUSTOMER <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("CUSTOMER >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("CUSTOMER <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("CUSTOMER like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("CUSTOMER not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("CUSTOMER in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("CUSTOMER not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("CUSTOMER between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerContactIsNull() {
            addCriterion("CUSTOMER_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactIsNotNull() {
            addCriterion("CUSTOMER_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEqualTo(String value) {
            addCriterion("CUSTOMER_CONTACT =", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNotEqualTo(String value) {
            addCriterion("CUSTOMER_CONTACT <>", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactGreaterThan(String value) {
            addCriterion("CUSTOMER_CONTACT >", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CONTACT >=", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactLessThan(String value) {
            addCriterion("CUSTOMER_CONTACT <", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CONTACT <=", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactLike(String value) {
            addCriterion("CUSTOMER_CONTACT like", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNotLike(String value) {
            addCriterion("CUSTOMER_CONTACT not like", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactIn(List<String> values) {
            addCriterion("CUSTOMER_CONTACT in", values, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNotIn(List<String> values) {
            addCriterion("CUSTOMER_CONTACT not in", values, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CONTACT between", value1, value2, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CONTACT not between", value1, value2, "customerContact");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("OWNER is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("OWNER =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("OWNER <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("OWNER >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("OWNER <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("OWNER <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("OWNER like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("OWNER not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("OWNER in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("OWNER not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("OWNER between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("OWNER not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CREATED_BY like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CREATED_BY not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andNumSamplesIsNull() {
            addCriterion("NUM_SAMPLES is null");
            return (Criteria) this;
        }

        public Criteria andNumSamplesIsNotNull() {
            addCriterion("NUM_SAMPLES is not null");
            return (Criteria) this;
        }

        public Criteria andNumSamplesEqualTo(Long value) {
            addCriterion("NUM_SAMPLES =", value, "numSamples");
            return (Criteria) this;
        }

        public Criteria andNumSamplesNotEqualTo(Long value) {
            addCriterion("NUM_SAMPLES <>", value, "numSamples");
            return (Criteria) this;
        }

        public Criteria andNumSamplesGreaterThan(Long value) {
            addCriterion("NUM_SAMPLES >", value, "numSamples");
            return (Criteria) this;
        }

        public Criteria andNumSamplesGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_SAMPLES >=", value, "numSamples");
            return (Criteria) this;
        }

        public Criteria andNumSamplesLessThan(Long value) {
            addCriterion("NUM_SAMPLES <", value, "numSamples");
            return (Criteria) this;
        }

        public Criteria andNumSamplesLessThanOrEqualTo(Long value) {
            addCriterion("NUM_SAMPLES <=", value, "numSamples");
            return (Criteria) this;
        }

        public Criteria andNumSamplesIn(List<Long> values) {
            addCriterion("NUM_SAMPLES in", values, "numSamples");
            return (Criteria) this;
        }

        public Criteria andNumSamplesNotIn(List<Long> values) {
            addCriterion("NUM_SAMPLES not in", values, "numSamples");
            return (Criteria) this;
        }

        public Criteria andNumSamplesBetween(Long value1, Long value2) {
            addCriterion("NUM_SAMPLES between", value1, value2, "numSamples");
            return (Criteria) this;
        }

        public Criteria andNumSamplesNotBetween(Long value1, Long value2) {
            addCriterion("NUM_SAMPLES not between", value1, value2, "numSamples");
            return (Criteria) this;
        }

        public Criteria andNumUIsNull() {
            addCriterion("NUM_U is null");
            return (Criteria) this;
        }

        public Criteria andNumUIsNotNull() {
            addCriterion("NUM_U is not null");
            return (Criteria) this;
        }

        public Criteria andNumUEqualTo(Long value) {
            addCriterion("NUM_U =", value, "numU");
            return (Criteria) this;
        }

        public Criteria andNumUNotEqualTo(Long value) {
            addCriterion("NUM_U <>", value, "numU");
            return (Criteria) this;
        }

        public Criteria andNumUGreaterThan(Long value) {
            addCriterion("NUM_U >", value, "numU");
            return (Criteria) this;
        }

        public Criteria andNumUGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_U >=", value, "numU");
            return (Criteria) this;
        }

        public Criteria andNumULessThan(Long value) {
            addCriterion("NUM_U <", value, "numU");
            return (Criteria) this;
        }

        public Criteria andNumULessThanOrEqualTo(Long value) {
            addCriterion("NUM_U <=", value, "numU");
            return (Criteria) this;
        }

        public Criteria andNumUIn(List<Long> values) {
            addCriterion("NUM_U in", values, "numU");
            return (Criteria) this;
        }

        public Criteria andNumUNotIn(List<Long> values) {
            addCriterion("NUM_U not in", values, "numU");
            return (Criteria) this;
        }

        public Criteria andNumUBetween(Long value1, Long value2) {
            addCriterion("NUM_U between", value1, value2, "numU");
            return (Criteria) this;
        }

        public Criteria andNumUNotBetween(Long value1, Long value2) {
            addCriterion("NUM_U not between", value1, value2, "numU");
            return (Criteria) this;
        }

        public Criteria andNumIIsNull() {
            addCriterion("NUM_I is null");
            return (Criteria) this;
        }

        public Criteria andNumIIsNotNull() {
            addCriterion("NUM_I is not null");
            return (Criteria) this;
        }

        public Criteria andNumIEqualTo(Long value) {
            addCriterion("NUM_I =", value, "numI");
            return (Criteria) this;
        }

        public Criteria andNumINotEqualTo(Long value) {
            addCriterion("NUM_I <>", value, "numI");
            return (Criteria) this;
        }

        public Criteria andNumIGreaterThan(Long value) {
            addCriterion("NUM_I >", value, "numI");
            return (Criteria) this;
        }

        public Criteria andNumIGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_I >=", value, "numI");
            return (Criteria) this;
        }

        public Criteria andNumILessThan(Long value) {
            addCriterion("NUM_I <", value, "numI");
            return (Criteria) this;
        }

        public Criteria andNumILessThanOrEqualTo(Long value) {
            addCriterion("NUM_I <=", value, "numI");
            return (Criteria) this;
        }

        public Criteria andNumIIn(List<Long> values) {
            addCriterion("NUM_I in", values, "numI");
            return (Criteria) this;
        }

        public Criteria andNumINotIn(List<Long> values) {
            addCriterion("NUM_I not in", values, "numI");
            return (Criteria) this;
        }

        public Criteria andNumIBetween(Long value1, Long value2) {
            addCriterion("NUM_I between", value1, value2, "numI");
            return (Criteria) this;
        }

        public Criteria andNumINotBetween(Long value1, Long value2) {
            addCriterion("NUM_I not between", value1, value2, "numI");
            return (Criteria) this;
        }

        public Criteria andNumPIsNull() {
            addCriterion("NUM_P is null");
            return (Criteria) this;
        }

        public Criteria andNumPIsNotNull() {
            addCriterion("NUM_P is not null");
            return (Criteria) this;
        }

        public Criteria andNumPEqualTo(Long value) {
            addCriterion("NUM_P =", value, "numP");
            return (Criteria) this;
        }

        public Criteria andNumPNotEqualTo(Long value) {
            addCriterion("NUM_P <>", value, "numP");
            return (Criteria) this;
        }

        public Criteria andNumPGreaterThan(Long value) {
            addCriterion("NUM_P >", value, "numP");
            return (Criteria) this;
        }

        public Criteria andNumPGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_P >=", value, "numP");
            return (Criteria) this;
        }

        public Criteria andNumPLessThan(Long value) {
            addCriterion("NUM_P <", value, "numP");
            return (Criteria) this;
        }

        public Criteria andNumPLessThanOrEqualTo(Long value) {
            addCriterion("NUM_P <=", value, "numP");
            return (Criteria) this;
        }

        public Criteria andNumPIn(List<Long> values) {
            addCriterion("NUM_P in", values, "numP");
            return (Criteria) this;
        }

        public Criteria andNumPNotIn(List<Long> values) {
            addCriterion("NUM_P not in", values, "numP");
            return (Criteria) this;
        }

        public Criteria andNumPBetween(Long value1, Long value2) {
            addCriterion("NUM_P between", value1, value2, "numP");
            return (Criteria) this;
        }

        public Criteria andNumPNotBetween(Long value1, Long value2) {
            addCriterion("NUM_P not between", value1, value2, "numP");
            return (Criteria) this;
        }

        public Criteria andNumCIsNull() {
            addCriterion("NUM_C is null");
            return (Criteria) this;
        }

        public Criteria andNumCIsNotNull() {
            addCriterion("NUM_C is not null");
            return (Criteria) this;
        }

        public Criteria andNumCEqualTo(Long value) {
            addCriterion("NUM_C =", value, "numC");
            return (Criteria) this;
        }

        public Criteria andNumCNotEqualTo(Long value) {
            addCriterion("NUM_C <>", value, "numC");
            return (Criteria) this;
        }

        public Criteria andNumCGreaterThan(Long value) {
            addCriterion("NUM_C >", value, "numC");
            return (Criteria) this;
        }

        public Criteria andNumCGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_C >=", value, "numC");
            return (Criteria) this;
        }

        public Criteria andNumCLessThan(Long value) {
            addCriterion("NUM_C <", value, "numC");
            return (Criteria) this;
        }

        public Criteria andNumCLessThanOrEqualTo(Long value) {
            addCriterion("NUM_C <=", value, "numC");
            return (Criteria) this;
        }

        public Criteria andNumCIn(List<Long> values) {
            addCriterion("NUM_C in", values, "numC");
            return (Criteria) this;
        }

        public Criteria andNumCNotIn(List<Long> values) {
            addCriterion("NUM_C not in", values, "numC");
            return (Criteria) this;
        }

        public Criteria andNumCBetween(Long value1, Long value2) {
            addCriterion("NUM_C between", value1, value2, "numC");
            return (Criteria) this;
        }

        public Criteria andNumCNotBetween(Long value1, Long value2) {
            addCriterion("NUM_C not between", value1, value2, "numC");
            return (Criteria) this;
        }

        public Criteria andNumAIsNull() {
            addCriterion("NUM_A is null");
            return (Criteria) this;
        }

        public Criteria andNumAIsNotNull() {
            addCriterion("NUM_A is not null");
            return (Criteria) this;
        }

        public Criteria andNumAEqualTo(Long value) {
            addCriterion("NUM_A =", value, "numA");
            return (Criteria) this;
        }

        public Criteria andNumANotEqualTo(Long value) {
            addCriterion("NUM_A <>", value, "numA");
            return (Criteria) this;
        }

        public Criteria andNumAGreaterThan(Long value) {
            addCriterion("NUM_A >", value, "numA");
            return (Criteria) this;
        }

        public Criteria andNumAGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_A >=", value, "numA");
            return (Criteria) this;
        }

        public Criteria andNumALessThan(Long value) {
            addCriterion("NUM_A <", value, "numA");
            return (Criteria) this;
        }

        public Criteria andNumALessThanOrEqualTo(Long value) {
            addCriterion("NUM_A <=", value, "numA");
            return (Criteria) this;
        }

        public Criteria andNumAIn(List<Long> values) {
            addCriterion("NUM_A in", values, "numA");
            return (Criteria) this;
        }

        public Criteria andNumANotIn(List<Long> values) {
            addCriterion("NUM_A not in", values, "numA");
            return (Criteria) this;
        }

        public Criteria andNumABetween(Long value1, Long value2) {
            addCriterion("NUM_A between", value1, value2, "numA");
            return (Criteria) this;
        }

        public Criteria andNumANotBetween(Long value1, Long value2) {
            addCriterion("NUM_A not between", value1, value2, "numA");
            return (Criteria) this;
        }

        public Criteria andNumRIsNull() {
            addCriterion("NUM_R is null");
            return (Criteria) this;
        }

        public Criteria andNumRIsNotNull() {
            addCriterion("NUM_R is not null");
            return (Criteria) this;
        }

        public Criteria andNumREqualTo(Long value) {
            addCriterion("NUM_R =", value, "numR");
            return (Criteria) this;
        }

        public Criteria andNumRNotEqualTo(Long value) {
            addCriterion("NUM_R <>", value, "numR");
            return (Criteria) this;
        }

        public Criteria andNumRGreaterThan(Long value) {
            addCriterion("NUM_R >", value, "numR");
            return (Criteria) this;
        }

        public Criteria andNumRGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_R >=", value, "numR");
            return (Criteria) this;
        }

        public Criteria andNumRLessThan(Long value) {
            addCriterion("NUM_R <", value, "numR");
            return (Criteria) this;
        }

        public Criteria andNumRLessThanOrEqualTo(Long value) {
            addCriterion("NUM_R <=", value, "numR");
            return (Criteria) this;
        }

        public Criteria andNumRIn(List<Long> values) {
            addCriterion("NUM_R in", values, "numR");
            return (Criteria) this;
        }

        public Criteria andNumRNotIn(List<Long> values) {
            addCriterion("NUM_R not in", values, "numR");
            return (Criteria) this;
        }

        public Criteria andNumRBetween(Long value1, Long value2) {
            addCriterion("NUM_R between", value1, value2, "numR");
            return (Criteria) this;
        }

        public Criteria andNumRNotBetween(Long value1, Long value2) {
            addCriterion("NUM_R not between", value1, value2, "numR");
            return (Criteria) this;
        }

        public Criteria andNumXIsNull() {
            addCriterion("NUM_X is null");
            return (Criteria) this;
        }

        public Criteria andNumXIsNotNull() {
            addCriterion("NUM_X is not null");
            return (Criteria) this;
        }

        public Criteria andNumXEqualTo(Long value) {
            addCriterion("NUM_X =", value, "numX");
            return (Criteria) this;
        }

        public Criteria andNumXNotEqualTo(Long value) {
            addCriterion("NUM_X <>", value, "numX");
            return (Criteria) this;
        }

        public Criteria andNumXGreaterThan(Long value) {
            addCriterion("NUM_X >", value, "numX");
            return (Criteria) this;
        }

        public Criteria andNumXGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_X >=", value, "numX");
            return (Criteria) this;
        }

        public Criteria andNumXLessThan(Long value) {
            addCriterion("NUM_X <", value, "numX");
            return (Criteria) this;
        }

        public Criteria andNumXLessThanOrEqualTo(Long value) {
            addCriterion("NUM_X <=", value, "numX");
            return (Criteria) this;
        }

        public Criteria andNumXIn(List<Long> values) {
            addCriterion("NUM_X in", values, "numX");
            return (Criteria) this;
        }

        public Criteria andNumXNotIn(List<Long> values) {
            addCriterion("NUM_X not in", values, "numX");
            return (Criteria) this;
        }

        public Criteria andNumXBetween(Long value1, Long value2) {
            addCriterion("NUM_X between", value1, value2, "numX");
            return (Criteria) this;
        }

        public Criteria andNumXNotBetween(Long value1, Long value2) {
            addCriterion("NUM_X not between", value1, value2, "numX");
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

        public Criteria andClosedIsNull() {
            addCriterion("CLOSED is null");
            return (Criteria) this;
        }

        public Criteria andClosedIsNotNull() {
            addCriterion("CLOSED is not null");
            return (Criteria) this;
        }

        public Criteria andClosedEqualTo(String value) {
            addCriterion("CLOSED =", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedNotEqualTo(String value) {
            addCriterion("CLOSED <>", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedGreaterThan(String value) {
            addCriterion("CLOSED >", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedGreaterThanOrEqualTo(String value) {
            addCriterion("CLOSED >=", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedLessThan(String value) {
            addCriterion("CLOSED <", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedLessThanOrEqualTo(String value) {
            addCriterion("CLOSED <=", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedLike(String value) {
            addCriterion("CLOSED like", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedNotLike(String value) {
            addCriterion("CLOSED not like", value, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedIn(List<String> values) {
            addCriterion("CLOSED in", values, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedNotIn(List<String> values) {
            addCriterion("CLOSED not in", values, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedBetween(String value1, String value2) {
            addCriterion("CLOSED between", value1, value2, "closed");
            return (Criteria) this;
        }

        public Criteria andClosedNotBetween(String value1, String value2) {
            addCriterion("CLOSED not between", value1, value2, "closed");
            return (Criteria) this;
        }

        public Criteria andSampleTemplateIsNull() {
            addCriterion("SAMPLE_TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andSampleTemplateIsNotNull() {
            addCriterion("SAMPLE_TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andSampleTemplateEqualTo(String value) {
            addCriterion("SAMPLE_TEMPLATE =", value, "sampleTemplate");
            return (Criteria) this;
        }

        public Criteria andSampleTemplateNotEqualTo(String value) {
            addCriterion("SAMPLE_TEMPLATE <>", value, "sampleTemplate");
            return (Criteria) this;
        }

        public Criteria andSampleTemplateGreaterThan(String value) {
            addCriterion("SAMPLE_TEMPLATE >", value, "sampleTemplate");
            return (Criteria) this;
        }

        public Criteria andSampleTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_TEMPLATE >=", value, "sampleTemplate");
            return (Criteria) this;
        }

        public Criteria andSampleTemplateLessThan(String value) {
            addCriterion("SAMPLE_TEMPLATE <", value, "sampleTemplate");
            return (Criteria) this;
        }

        public Criteria andSampleTemplateLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_TEMPLATE <=", value, "sampleTemplate");
            return (Criteria) this;
        }

        public Criteria andSampleTemplateLike(String value) {
            addCriterion("SAMPLE_TEMPLATE like", value, "sampleTemplate");
            return (Criteria) this;
        }

        public Criteria andSampleTemplateNotLike(String value) {
            addCriterion("SAMPLE_TEMPLATE not like", value, "sampleTemplate");
            return (Criteria) this;
        }

        public Criteria andSampleTemplateIn(List<String> values) {
            addCriterion("SAMPLE_TEMPLATE in", values, "sampleTemplate");
            return (Criteria) this;
        }

        public Criteria andSampleTemplateNotIn(List<String> values) {
            addCriterion("SAMPLE_TEMPLATE not in", values, "sampleTemplate");
            return (Criteria) this;
        }

        public Criteria andSampleTemplateBetween(String value1, String value2) {
            addCriterion("SAMPLE_TEMPLATE between", value1, value2, "sampleTemplate");
            return (Criteria) this;
        }

        public Criteria andSampleTemplateNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_TEMPLATE not between", value1, value2, "sampleTemplate");
            return (Criteria) this;
        }

        public Criteria andConclusionIsNull() {
            addCriterion("CONCLUSION is null");
            return (Criteria) this;
        }

        public Criteria andConclusionIsNotNull() {
            addCriterion("CONCLUSION is not null");
            return (Criteria) this;
        }

        public Criteria andConclusionEqualTo(String value) {
            addCriterion("CONCLUSION =", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotEqualTo(String value) {
            addCriterion("CONCLUSION <>", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionGreaterThan(String value) {
            addCriterion("CONCLUSION >", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionGreaterThanOrEqualTo(String value) {
            addCriterion("CONCLUSION >=", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLessThan(String value) {
            addCriterion("CONCLUSION <", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLessThanOrEqualTo(String value) {
            addCriterion("CONCLUSION <=", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLike(String value) {
            addCriterion("CONCLUSION like", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotLike(String value) {
            addCriterion("CONCLUSION not like", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionIn(List<String> values) {
            addCriterion("CONCLUSION in", values, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotIn(List<String> values) {
            addCriterion("CONCLUSION not in", values, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionBetween(String value1, String value2) {
            addCriterion("CONCLUSION between", value1, value2, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotBetween(String value1, String value2) {
            addCriterion("CONCLUSION not between", value1, value2, "conclusion");
            return (Criteria) this;
        }

        public Criteria andProductIsNull() {
            addCriterion("PRODUCT is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("PRODUCT is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(String value) {
            addCriterion("PRODUCT =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(String value) {
            addCriterion("PRODUCT <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(String value) {
            addCriterion("PRODUCT >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(String value) {
            addCriterion("PRODUCT <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLike(String value) {
            addCriterion("PRODUCT like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotLike(String value) {
            addCriterion("PRODUCT not like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<String> values) {
            addCriterion("PRODUCT in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<String> values) {
            addCriterion("PRODUCT not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(String value1, String value2) {
            addCriterion("PRODUCT between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(String value1, String value2) {
            addCriterion("PRODUCT not between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andStabilityIsNull() {
            addCriterion("STABILITY is null");
            return (Criteria) this;
        }

        public Criteria andStabilityIsNotNull() {
            addCriterion("STABILITY is not null");
            return (Criteria) this;
        }

        public Criteria andStabilityEqualTo(String value) {
            addCriterion("STABILITY =", value, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityNotEqualTo(String value) {
            addCriterion("STABILITY <>", value, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityGreaterThan(String value) {
            addCriterion("STABILITY >", value, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityGreaterThanOrEqualTo(String value) {
            addCriterion("STABILITY >=", value, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityLessThan(String value) {
            addCriterion("STABILITY <", value, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityLessThanOrEqualTo(String value) {
            addCriterion("STABILITY <=", value, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityLike(String value) {
            addCriterion("STABILITY like", value, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityNotLike(String value) {
            addCriterion("STABILITY not like", value, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityIn(List<String> values) {
            addCriterion("STABILITY in", values, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityNotIn(List<String> values) {
            addCriterion("STABILITY not in", values, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityBetween(String value1, String value2) {
            addCriterion("STABILITY between", value1, value2, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityNotBetween(String value1, String value2) {
            addCriterion("STABILITY not between", value1, value2, "stability");
            return (Criteria) this;
        }

        public Criteria andChargeCodeIsNull() {
            addCriterion("CHARGE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andChargeCodeIsNotNull() {
            addCriterion("CHARGE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andChargeCodeEqualTo(String value) {
            addCriterion("CHARGE_CODE =", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeNotEqualTo(String value) {
            addCriterion("CHARGE_CODE <>", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeGreaterThan(String value) {
            addCriterion("CHARGE_CODE >", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGE_CODE >=", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeLessThan(String value) {
            addCriterion("CHARGE_CODE <", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeLessThanOrEqualTo(String value) {
            addCriterion("CHARGE_CODE <=", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeLike(String value) {
            addCriterion("CHARGE_CODE like", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeNotLike(String value) {
            addCriterion("CHARGE_CODE not like", value, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeIn(List<String> values) {
            addCriterion("CHARGE_CODE in", values, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeNotIn(List<String> values) {
            addCriterion("CHARGE_CODE not in", values, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeBetween(String value1, String value2) {
            addCriterion("CHARGE_CODE between", value1, value2, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andChargeCodeNotBetween(String value1, String value2) {
            addCriterion("CHARGE_CODE not between", value1, value2, "chargeCode");
            return (Criteria) this;
        }

        public Criteria andUseGroupLoginIsNull() {
            addCriterion("USE_GROUP_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andUseGroupLoginIsNotNull() {
            addCriterion("USE_GROUP_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andUseGroupLoginEqualTo(String value) {
            addCriterion("USE_GROUP_LOGIN =", value, "useGroupLogin");
            return (Criteria) this;
        }

        public Criteria andUseGroupLoginNotEqualTo(String value) {
            addCriterion("USE_GROUP_LOGIN <>", value, "useGroupLogin");
            return (Criteria) this;
        }

        public Criteria andUseGroupLoginGreaterThan(String value) {
            addCriterion("USE_GROUP_LOGIN >", value, "useGroupLogin");
            return (Criteria) this;
        }

        public Criteria andUseGroupLoginGreaterThanOrEqualTo(String value) {
            addCriterion("USE_GROUP_LOGIN >=", value, "useGroupLogin");
            return (Criteria) this;
        }

        public Criteria andUseGroupLoginLessThan(String value) {
            addCriterion("USE_GROUP_LOGIN <", value, "useGroupLogin");
            return (Criteria) this;
        }

        public Criteria andUseGroupLoginLessThanOrEqualTo(String value) {
            addCriterion("USE_GROUP_LOGIN <=", value, "useGroupLogin");
            return (Criteria) this;
        }

        public Criteria andUseGroupLoginLike(String value) {
            addCriterion("USE_GROUP_LOGIN like", value, "useGroupLogin");
            return (Criteria) this;
        }

        public Criteria andUseGroupLoginNotLike(String value) {
            addCriterion("USE_GROUP_LOGIN not like", value, "useGroupLogin");
            return (Criteria) this;
        }

        public Criteria andUseGroupLoginIn(List<String> values) {
            addCriterion("USE_GROUP_LOGIN in", values, "useGroupLogin");
            return (Criteria) this;
        }

        public Criteria andUseGroupLoginNotIn(List<String> values) {
            addCriterion("USE_GROUP_LOGIN not in", values, "useGroupLogin");
            return (Criteria) this;
        }

        public Criteria andUseGroupLoginBetween(String value1, String value2) {
            addCriterion("USE_GROUP_LOGIN between", value1, value2, "useGroupLogin");
            return (Criteria) this;
        }

        public Criteria andUseGroupLoginNotBetween(String value1, String value2) {
            addCriterion("USE_GROUP_LOGIN not between", value1, value2, "useGroupLogin");
            return (Criteria) this;
        }

        public Criteria andBatchTemplateIsNull() {
            addCriterion("BATCH_TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andBatchTemplateIsNotNull() {
            addCriterion("BATCH_TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andBatchTemplateEqualTo(String value) {
            addCriterion("BATCH_TEMPLATE =", value, "batchTemplate");
            return (Criteria) this;
        }

        public Criteria andBatchTemplateNotEqualTo(String value) {
            addCriterion("BATCH_TEMPLATE <>", value, "batchTemplate");
            return (Criteria) this;
        }

        public Criteria andBatchTemplateGreaterThan(String value) {
            addCriterion("BATCH_TEMPLATE >", value, "batchTemplate");
            return (Criteria) this;
        }

        public Criteria andBatchTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_TEMPLATE >=", value, "batchTemplate");
            return (Criteria) this;
        }

        public Criteria andBatchTemplateLessThan(String value) {
            addCriterion("BATCH_TEMPLATE <", value, "batchTemplate");
            return (Criteria) this;
        }

        public Criteria andBatchTemplateLessThanOrEqualTo(String value) {
            addCriterion("BATCH_TEMPLATE <=", value, "batchTemplate");
            return (Criteria) this;
        }

        public Criteria andBatchTemplateLike(String value) {
            addCriterion("BATCH_TEMPLATE like", value, "batchTemplate");
            return (Criteria) this;
        }

        public Criteria andBatchTemplateNotLike(String value) {
            addCriterion("BATCH_TEMPLATE not like", value, "batchTemplate");
            return (Criteria) this;
        }

        public Criteria andBatchTemplateIn(List<String> values) {
            addCriterion("BATCH_TEMPLATE in", values, "batchTemplate");
            return (Criteria) this;
        }

        public Criteria andBatchTemplateNotIn(List<String> values) {
            addCriterion("BATCH_TEMPLATE not in", values, "batchTemplate");
            return (Criteria) this;
        }

        public Criteria andBatchTemplateBetween(String value1, String value2) {
            addCriterion("BATCH_TEMPLATE between", value1, value2, "batchTemplate");
            return (Criteria) this;
        }

        public Criteria andBatchTemplateNotBetween(String value1, String value2) {
            addCriterion("BATCH_TEMPLATE not between", value1, value2, "batchTemplate");
            return (Criteria) this;
        }

        public Criteria andUseGridLoginIsNull() {
            addCriterion("USE_GRID_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andUseGridLoginIsNotNull() {
            addCriterion("USE_GRID_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andUseGridLoginEqualTo(String value) {
            addCriterion("USE_GRID_LOGIN =", value, "useGridLogin");
            return (Criteria) this;
        }

        public Criteria andUseGridLoginNotEqualTo(String value) {
            addCriterion("USE_GRID_LOGIN <>", value, "useGridLogin");
            return (Criteria) this;
        }

        public Criteria andUseGridLoginGreaterThan(String value) {
            addCriterion("USE_GRID_LOGIN >", value, "useGridLogin");
            return (Criteria) this;
        }

        public Criteria andUseGridLoginGreaterThanOrEqualTo(String value) {
            addCriterion("USE_GRID_LOGIN >=", value, "useGridLogin");
            return (Criteria) this;
        }

        public Criteria andUseGridLoginLessThan(String value) {
            addCriterion("USE_GRID_LOGIN <", value, "useGridLogin");
            return (Criteria) this;
        }

        public Criteria andUseGridLoginLessThanOrEqualTo(String value) {
            addCriterion("USE_GRID_LOGIN <=", value, "useGridLogin");
            return (Criteria) this;
        }

        public Criteria andUseGridLoginLike(String value) {
            addCriterion("USE_GRID_LOGIN like", value, "useGridLogin");
            return (Criteria) this;
        }

        public Criteria andUseGridLoginNotLike(String value) {
            addCriterion("USE_GRID_LOGIN not like", value, "useGridLogin");
            return (Criteria) this;
        }

        public Criteria andUseGridLoginIn(List<String> values) {
            addCriterion("USE_GRID_LOGIN in", values, "useGridLogin");
            return (Criteria) this;
        }

        public Criteria andUseGridLoginNotIn(List<String> values) {
            addCriterion("USE_GRID_LOGIN not in", values, "useGridLogin");
            return (Criteria) this;
        }

        public Criteria andUseGridLoginBetween(String value1, String value2) {
            addCriterion("USE_GRID_LOGIN between", value1, value2, "useGridLogin");
            return (Criteria) this;
        }

        public Criteria andUseGridLoginNotBetween(String value1, String value2) {
            addCriterion("USE_GRID_LOGIN not between", value1, value2, "useGridLogin");
            return (Criteria) this;
        }

        public Criteria andCustomerTemplateIsNull() {
            addCriterion("CUSTOMER_TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTemplateIsNotNull() {
            addCriterion("CUSTOMER_TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTemplateEqualTo(String value) {
            addCriterion("CUSTOMER_TEMPLATE =", value, "customerTemplate");
            return (Criteria) this;
        }

        public Criteria andCustomerTemplateNotEqualTo(String value) {
            addCriterion("CUSTOMER_TEMPLATE <>", value, "customerTemplate");
            return (Criteria) this;
        }

        public Criteria andCustomerTemplateGreaterThan(String value) {
            addCriterion("CUSTOMER_TEMPLATE >", value, "customerTemplate");
            return (Criteria) this;
        }

        public Criteria andCustomerTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TEMPLATE >=", value, "customerTemplate");
            return (Criteria) this;
        }

        public Criteria andCustomerTemplateLessThan(String value) {
            addCriterion("CUSTOMER_TEMPLATE <", value, "customerTemplate");
            return (Criteria) this;
        }

        public Criteria andCustomerTemplateLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TEMPLATE <=", value, "customerTemplate");
            return (Criteria) this;
        }

        public Criteria andCustomerTemplateLike(String value) {
            addCriterion("CUSTOMER_TEMPLATE like", value, "customerTemplate");
            return (Criteria) this;
        }

        public Criteria andCustomerTemplateNotLike(String value) {
            addCriterion("CUSTOMER_TEMPLATE not like", value, "customerTemplate");
            return (Criteria) this;
        }

        public Criteria andCustomerTemplateIn(List<String> values) {
            addCriterion("CUSTOMER_TEMPLATE in", values, "customerTemplate");
            return (Criteria) this;
        }

        public Criteria andCustomerTemplateNotIn(List<String> values) {
            addCriterion("CUSTOMER_TEMPLATE not in", values, "customerTemplate");
            return (Criteria) this;
        }

        public Criteria andCustomerTemplateBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TEMPLATE between", value1, value2, "customerTemplate");
            return (Criteria) this;
        }

        public Criteria andCustomerTemplateNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TEMPLATE not between", value1, value2, "customerTemplate");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationIsNull() {
            addCriterion("OWNER_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationIsNotNull() {
            addCriterion("OWNER_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationEqualTo(String value) {
            addCriterion("OWNER_LOCATION =", value, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationNotEqualTo(String value) {
            addCriterion("OWNER_LOCATION <>", value, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationGreaterThan(String value) {
            addCriterion("OWNER_LOCATION >", value, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_LOCATION >=", value, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationLessThan(String value) {
            addCriterion("OWNER_LOCATION <", value, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationLessThanOrEqualTo(String value) {
            addCriterion("OWNER_LOCATION <=", value, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationLike(String value) {
            addCriterion("OWNER_LOCATION like", value, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationNotLike(String value) {
            addCriterion("OWNER_LOCATION not like", value, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationIn(List<String> values) {
            addCriterion("OWNER_LOCATION in", values, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationNotIn(List<String> values) {
            addCriterion("OWNER_LOCATION not in", values, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationBetween(String value1, String value2) {
            addCriterion("OWNER_LOCATION between", value1, value2, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andOwnerLocationNotBetween(String value1, String value2) {
            addCriterion("OWNER_LOCATION not between", value1, value2, "ownerLocation");
            return (Criteria) this;
        }

        public Criteria andAliquotIsNull() {
            addCriterion("ALIQUOT is null");
            return (Criteria) this;
        }

        public Criteria andAliquotIsNotNull() {
            addCriterion("ALIQUOT is not null");
            return (Criteria) this;
        }

        public Criteria andAliquotEqualTo(String value) {
            addCriterion("ALIQUOT =", value, "aliquot");
            return (Criteria) this;
        }

        public Criteria andAliquotNotEqualTo(String value) {
            addCriterion("ALIQUOT <>", value, "aliquot");
            return (Criteria) this;
        }

        public Criteria andAliquotGreaterThan(String value) {
            addCriterion("ALIQUOT >", value, "aliquot");
            return (Criteria) this;
        }

        public Criteria andAliquotGreaterThanOrEqualTo(String value) {
            addCriterion("ALIQUOT >=", value, "aliquot");
            return (Criteria) this;
        }

        public Criteria andAliquotLessThan(String value) {
            addCriterion("ALIQUOT <", value, "aliquot");
            return (Criteria) this;
        }

        public Criteria andAliquotLessThanOrEqualTo(String value) {
            addCriterion("ALIQUOT <=", value, "aliquot");
            return (Criteria) this;
        }

        public Criteria andAliquotLike(String value) {
            addCriterion("ALIQUOT like", value, "aliquot");
            return (Criteria) this;
        }

        public Criteria andAliquotNotLike(String value) {
            addCriterion("ALIQUOT not like", value, "aliquot");
            return (Criteria) this;
        }

        public Criteria andAliquotIn(List<String> values) {
            addCriterion("ALIQUOT in", values, "aliquot");
            return (Criteria) this;
        }

        public Criteria andAliquotNotIn(List<String> values) {
            addCriterion("ALIQUOT not in", values, "aliquot");
            return (Criteria) this;
        }

        public Criteria andAliquotBetween(String value1, String value2) {
            addCriterion("ALIQUOT between", value1, value2, "aliquot");
            return (Criteria) this;
        }

        public Criteria andAliquotNotBetween(String value1, String value2) {
            addCriterion("ALIQUOT not between", value1, value2, "aliquot");
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

        public Criteria andTCertificationIsNull() {
            addCriterion("T_CERTIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andTCertificationIsNotNull() {
            addCriterion("T_CERTIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andTCertificationEqualTo(String value) {
            addCriterion("T_CERTIFICATION =", value, "tCertification");
            return (Criteria) this;
        }

        public Criteria andTCertificationNotEqualTo(String value) {
            addCriterion("T_CERTIFICATION <>", value, "tCertification");
            return (Criteria) this;
        }

        public Criteria andTCertificationGreaterThan(String value) {
            addCriterion("T_CERTIFICATION >", value, "tCertification");
            return (Criteria) this;
        }

        public Criteria andTCertificationGreaterThanOrEqualTo(String value) {
            addCriterion("T_CERTIFICATION >=", value, "tCertification");
            return (Criteria) this;
        }

        public Criteria andTCertificationLessThan(String value) {
            addCriterion("T_CERTIFICATION <", value, "tCertification");
            return (Criteria) this;
        }

        public Criteria andTCertificationLessThanOrEqualTo(String value) {
            addCriterion("T_CERTIFICATION <=", value, "tCertification");
            return (Criteria) this;
        }

        public Criteria andTCertificationLike(String value) {
            addCriterion("T_CERTIFICATION like", value, "tCertification");
            return (Criteria) this;
        }

        public Criteria andTCertificationNotLike(String value) {
            addCriterion("T_CERTIFICATION not like", value, "tCertification");
            return (Criteria) this;
        }

        public Criteria andTCertificationIn(List<String> values) {
            addCriterion("T_CERTIFICATION in", values, "tCertification");
            return (Criteria) this;
        }

        public Criteria andTCertificationNotIn(List<String> values) {
            addCriterion("T_CERTIFICATION not in", values, "tCertification");
            return (Criteria) this;
        }

        public Criteria andTCertificationBetween(String value1, String value2) {
            addCriterion("T_CERTIFICATION between", value1, value2, "tCertification");
            return (Criteria) this;
        }

        public Criteria andTCertificationNotBetween(String value1, String value2) {
            addCriterion("T_CERTIFICATION not between", value1, value2, "tCertification");
            return (Criteria) this;
        }

        public Criteria andTClosedByIsNull() {
            addCriterion("T_CLOSED_BY is null");
            return (Criteria) this;
        }

        public Criteria andTClosedByIsNotNull() {
            addCriterion("T_CLOSED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andTClosedByEqualTo(String value) {
            addCriterion("T_CLOSED_BY =", value, "tClosedBy");
            return (Criteria) this;
        }

        public Criteria andTClosedByNotEqualTo(String value) {
            addCriterion("T_CLOSED_BY <>", value, "tClosedBy");
            return (Criteria) this;
        }

        public Criteria andTClosedByGreaterThan(String value) {
            addCriterion("T_CLOSED_BY >", value, "tClosedBy");
            return (Criteria) this;
        }

        public Criteria andTClosedByGreaterThanOrEqualTo(String value) {
            addCriterion("T_CLOSED_BY >=", value, "tClosedBy");
            return (Criteria) this;
        }

        public Criteria andTClosedByLessThan(String value) {
            addCriterion("T_CLOSED_BY <", value, "tClosedBy");
            return (Criteria) this;
        }

        public Criteria andTClosedByLessThanOrEqualTo(String value) {
            addCriterion("T_CLOSED_BY <=", value, "tClosedBy");
            return (Criteria) this;
        }

        public Criteria andTClosedByLike(String value) {
            addCriterion("T_CLOSED_BY like", value, "tClosedBy");
            return (Criteria) this;
        }

        public Criteria andTClosedByNotLike(String value) {
            addCriterion("T_CLOSED_BY not like", value, "tClosedBy");
            return (Criteria) this;
        }

        public Criteria andTClosedByIn(List<String> values) {
            addCriterion("T_CLOSED_BY in", values, "tClosedBy");
            return (Criteria) this;
        }

        public Criteria andTClosedByNotIn(List<String> values) {
            addCriterion("T_CLOSED_BY not in", values, "tClosedBy");
            return (Criteria) this;
        }

        public Criteria andTClosedByBetween(String value1, String value2) {
            addCriterion("T_CLOSED_BY between", value1, value2, "tClosedBy");
            return (Criteria) this;
        }

        public Criteria andTClosedByNotBetween(String value1, String value2) {
            addCriterion("T_CLOSED_BY not between", value1, value2, "tClosedBy");
            return (Criteria) this;
        }

        public Criteria andTClosedOnIsNull() {
            addCriterion("T_CLOSED_ON is null");
            return (Criteria) this;
        }

        public Criteria andTClosedOnIsNotNull() {
            addCriterion("T_CLOSED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andTClosedOnEqualTo(Date value) {
            addCriterionForJDBCDate("T_CLOSED_ON =", value, "tClosedOn");
            return (Criteria) this;
        }

        public Criteria andTClosedOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_CLOSED_ON <>", value, "tClosedOn");
            return (Criteria) this;
        }

        public Criteria andTClosedOnGreaterThan(Date value) {
            addCriterionForJDBCDate("T_CLOSED_ON >", value, "tClosedOn");
            return (Criteria) this;
        }

        public Criteria andTClosedOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_CLOSED_ON >=", value, "tClosedOn");
            return (Criteria) this;
        }

        public Criteria andTClosedOnLessThan(Date value) {
            addCriterionForJDBCDate("T_CLOSED_ON <", value, "tClosedOn");
            return (Criteria) this;
        }

        public Criteria andTClosedOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_CLOSED_ON <=", value, "tClosedOn");
            return (Criteria) this;
        }

        public Criteria andTClosedOnIn(List<Date> values) {
            addCriterionForJDBCDate("T_CLOSED_ON in", values, "tClosedOn");
            return (Criteria) this;
        }

        public Criteria andTClosedOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_CLOSED_ON not in", values, "tClosedOn");
            return (Criteria) this;
        }

        public Criteria andTClosedOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_CLOSED_ON between", value1, value2, "tClosedOn");
            return (Criteria) this;
        }

        public Criteria andTClosedOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_CLOSED_ON not between", value1, value2, "tClosedOn");
            return (Criteria) this;
        }

        public Criteria andTCoaCommentIsNull() {
            addCriterion("T_COA_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andTCoaCommentIsNotNull() {
            addCriterion("T_COA_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andTCoaCommentEqualTo(Long value) {
            addCriterion("T_COA_COMMENT =", value, "tCoaComment");
            return (Criteria) this;
        }

        public Criteria andTCoaCommentNotEqualTo(Long value) {
            addCriterion("T_COA_COMMENT <>", value, "tCoaComment");
            return (Criteria) this;
        }

        public Criteria andTCoaCommentGreaterThan(Long value) {
            addCriterion("T_COA_COMMENT >", value, "tCoaComment");
            return (Criteria) this;
        }

        public Criteria andTCoaCommentGreaterThanOrEqualTo(Long value) {
            addCriterion("T_COA_COMMENT >=", value, "tCoaComment");
            return (Criteria) this;
        }

        public Criteria andTCoaCommentLessThan(Long value) {
            addCriterion("T_COA_COMMENT <", value, "tCoaComment");
            return (Criteria) this;
        }

        public Criteria andTCoaCommentLessThanOrEqualTo(Long value) {
            addCriterion("T_COA_COMMENT <=", value, "tCoaComment");
            return (Criteria) this;
        }

        public Criteria andTCoaCommentIn(List<Long> values) {
            addCriterion("T_COA_COMMENT in", values, "tCoaComment");
            return (Criteria) this;
        }

        public Criteria andTCoaCommentNotIn(List<Long> values) {
            addCriterion("T_COA_COMMENT not in", values, "tCoaComment");
            return (Criteria) this;
        }

        public Criteria andTCoaCommentBetween(Long value1, Long value2) {
            addCriterion("T_COA_COMMENT between", value1, value2, "tCoaComment");
            return (Criteria) this;
        }

        public Criteria andTCoaCommentNotBetween(Long value1, Long value2) {
            addCriterion("T_COA_COMMENT not between", value1, value2, "tCoaComment");
            return (Criteria) this;
        }

        public Criteria andTCoaTemplateIsNull() {
            addCriterion("T_COA_TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andTCoaTemplateIsNotNull() {
            addCriterion("T_COA_TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andTCoaTemplateEqualTo(String value) {
            addCriterion("T_COA_TEMPLATE =", value, "tCoaTemplate");
            return (Criteria) this;
        }

        public Criteria andTCoaTemplateNotEqualTo(String value) {
            addCriterion("T_COA_TEMPLATE <>", value, "tCoaTemplate");
            return (Criteria) this;
        }

        public Criteria andTCoaTemplateGreaterThan(String value) {
            addCriterion("T_COA_TEMPLATE >", value, "tCoaTemplate");
            return (Criteria) this;
        }

        public Criteria andTCoaTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("T_COA_TEMPLATE >=", value, "tCoaTemplate");
            return (Criteria) this;
        }

        public Criteria andTCoaTemplateLessThan(String value) {
            addCriterion("T_COA_TEMPLATE <", value, "tCoaTemplate");
            return (Criteria) this;
        }

        public Criteria andTCoaTemplateLessThanOrEqualTo(String value) {
            addCriterion("T_COA_TEMPLATE <=", value, "tCoaTemplate");
            return (Criteria) this;
        }

        public Criteria andTCoaTemplateLike(String value) {
            addCriterion("T_COA_TEMPLATE like", value, "tCoaTemplate");
            return (Criteria) this;
        }

        public Criteria andTCoaTemplateNotLike(String value) {
            addCriterion("T_COA_TEMPLATE not like", value, "tCoaTemplate");
            return (Criteria) this;
        }

        public Criteria andTCoaTemplateIn(List<String> values) {
            addCriterion("T_COA_TEMPLATE in", values, "tCoaTemplate");
            return (Criteria) this;
        }

        public Criteria andTCoaTemplateNotIn(List<String> values) {
            addCriterion("T_COA_TEMPLATE not in", values, "tCoaTemplate");
            return (Criteria) this;
        }

        public Criteria andTCoaTemplateBetween(String value1, String value2) {
            addCriterion("T_COA_TEMPLATE between", value1, value2, "tCoaTemplate");
            return (Criteria) this;
        }

        public Criteria andTCoaTemplateNotBetween(String value1, String value2) {
            addCriterion("T_COA_TEMPLATE not between", value1, value2, "tCoaTemplate");
            return (Criteria) this;
        }

        public Criteria andTContractNumberIsNull() {
            addCriterion("T_CONTRACT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTContractNumberIsNotNull() {
            addCriterion("T_CONTRACT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTContractNumberEqualTo(String value) {
            addCriterion("T_CONTRACT_NUMBER =", value, "tContractNumber");
            return (Criteria) this;
        }

        public Criteria andTContractNumberNotEqualTo(String value) {
            addCriterion("T_CONTRACT_NUMBER <>", value, "tContractNumber");
            return (Criteria) this;
        }

        public Criteria andTContractNumberGreaterThan(String value) {
            addCriterion("T_CONTRACT_NUMBER >", value, "tContractNumber");
            return (Criteria) this;
        }

        public Criteria andTContractNumberGreaterThanOrEqualTo(String value) {
            addCriterion("T_CONTRACT_NUMBER >=", value, "tContractNumber");
            return (Criteria) this;
        }

        public Criteria andTContractNumberLessThan(String value) {
            addCriterion("T_CONTRACT_NUMBER <", value, "tContractNumber");
            return (Criteria) this;
        }

        public Criteria andTContractNumberLessThanOrEqualTo(String value) {
            addCriterion("T_CONTRACT_NUMBER <=", value, "tContractNumber");
            return (Criteria) this;
        }

        public Criteria andTContractNumberLike(String value) {
            addCriterion("T_CONTRACT_NUMBER like", value, "tContractNumber");
            return (Criteria) this;
        }

        public Criteria andTContractNumberNotLike(String value) {
            addCriterion("T_CONTRACT_NUMBER not like", value, "tContractNumber");
            return (Criteria) this;
        }

        public Criteria andTContractNumberIn(List<String> values) {
            addCriterion("T_CONTRACT_NUMBER in", values, "tContractNumber");
            return (Criteria) this;
        }

        public Criteria andTContractNumberNotIn(List<String> values) {
            addCriterion("T_CONTRACT_NUMBER not in", values, "tContractNumber");
            return (Criteria) this;
        }

        public Criteria andTContractNumberBetween(String value1, String value2) {
            addCriterion("T_CONTRACT_NUMBER between", value1, value2, "tContractNumber");
            return (Criteria) this;
        }

        public Criteria andTContractNumberNotBetween(String value1, String value2) {
            addCriterion("T_CONTRACT_NUMBER not between", value1, value2, "tContractNumber");
            return (Criteria) this;
        }

        public Criteria andTCopyTemplateIsNull() {
            addCriterion("T_COPY_TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andTCopyTemplateIsNotNull() {
            addCriterion("T_COPY_TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andTCopyTemplateEqualTo(String value) {
            addCriterion("T_COPY_TEMPLATE =", value, "tCopyTemplate");
            return (Criteria) this;
        }

        public Criteria andTCopyTemplateNotEqualTo(String value) {
            addCriterion("T_COPY_TEMPLATE <>", value, "tCopyTemplate");
            return (Criteria) this;
        }

        public Criteria andTCopyTemplateGreaterThan(String value) {
            addCriterion("T_COPY_TEMPLATE >", value, "tCopyTemplate");
            return (Criteria) this;
        }

        public Criteria andTCopyTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("T_COPY_TEMPLATE >=", value, "tCopyTemplate");
            return (Criteria) this;
        }

        public Criteria andTCopyTemplateLessThan(String value) {
            addCriterion("T_COPY_TEMPLATE <", value, "tCopyTemplate");
            return (Criteria) this;
        }

        public Criteria andTCopyTemplateLessThanOrEqualTo(String value) {
            addCriterion("T_COPY_TEMPLATE <=", value, "tCopyTemplate");
            return (Criteria) this;
        }

        public Criteria andTCopyTemplateLike(String value) {
            addCriterion("T_COPY_TEMPLATE like", value, "tCopyTemplate");
            return (Criteria) this;
        }

        public Criteria andTCopyTemplateNotLike(String value) {
            addCriterion("T_COPY_TEMPLATE not like", value, "tCopyTemplate");
            return (Criteria) this;
        }

        public Criteria andTCopyTemplateIn(List<String> values) {
            addCriterion("T_COPY_TEMPLATE in", values, "tCopyTemplate");
            return (Criteria) this;
        }

        public Criteria andTCopyTemplateNotIn(List<String> values) {
            addCriterion("T_COPY_TEMPLATE not in", values, "tCopyTemplate");
            return (Criteria) this;
        }

        public Criteria andTCopyTemplateBetween(String value1, String value2) {
            addCriterion("T_COPY_TEMPLATE between", value1, value2, "tCopyTemplate");
            return (Criteria) this;
        }

        public Criteria andTCopyTemplateNotBetween(String value1, String value2) {
            addCriterion("T_COPY_TEMPLATE not between", value1, value2, "tCopyTemplate");
            return (Criteria) this;
        }

        public Criteria andTCustManifestIsNull() {
            addCriterion("T_CUST_MANIFEST is null");
            return (Criteria) this;
        }

        public Criteria andTCustManifestIsNotNull() {
            addCriterion("T_CUST_MANIFEST is not null");
            return (Criteria) this;
        }

        public Criteria andTCustManifestEqualTo(String value) {
            addCriterion("T_CUST_MANIFEST =", value, "tCustManifest");
            return (Criteria) this;
        }

        public Criteria andTCustManifestNotEqualTo(String value) {
            addCriterion("T_CUST_MANIFEST <>", value, "tCustManifest");
            return (Criteria) this;
        }

        public Criteria andTCustManifestGreaterThan(String value) {
            addCriterion("T_CUST_MANIFEST >", value, "tCustManifest");
            return (Criteria) this;
        }

        public Criteria andTCustManifestGreaterThanOrEqualTo(String value) {
            addCriterion("T_CUST_MANIFEST >=", value, "tCustManifest");
            return (Criteria) this;
        }

        public Criteria andTCustManifestLessThan(String value) {
            addCriterion("T_CUST_MANIFEST <", value, "tCustManifest");
            return (Criteria) this;
        }

        public Criteria andTCustManifestLessThanOrEqualTo(String value) {
            addCriterion("T_CUST_MANIFEST <=", value, "tCustManifest");
            return (Criteria) this;
        }

        public Criteria andTCustManifestLike(String value) {
            addCriterion("T_CUST_MANIFEST like", value, "tCustManifest");
            return (Criteria) this;
        }

        public Criteria andTCustManifestNotLike(String value) {
            addCriterion("T_CUST_MANIFEST not like", value, "tCustManifest");
            return (Criteria) this;
        }

        public Criteria andTCustManifestIn(List<String> values) {
            addCriterion("T_CUST_MANIFEST in", values, "tCustManifest");
            return (Criteria) this;
        }

        public Criteria andTCustManifestNotIn(List<String> values) {
            addCriterion("T_CUST_MANIFEST not in", values, "tCustManifest");
            return (Criteria) this;
        }

        public Criteria andTCustManifestBetween(String value1, String value2) {
            addCriterion("T_CUST_MANIFEST between", value1, value2, "tCustManifest");
            return (Criteria) this;
        }

        public Criteria andTCustManifestNotBetween(String value1, String value2) {
            addCriterion("T_CUST_MANIFEST not between", value1, value2, "tCustManifest");
            return (Criteria) this;
        }

        public Criteria andTCustomerGroupIsNull() {
            addCriterion("T_CUSTOMER_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andTCustomerGroupIsNotNull() {
            addCriterion("T_CUSTOMER_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andTCustomerGroupEqualTo(String value) {
            addCriterion("T_CUSTOMER_GROUP =", value, "tCustomerGroup");
            return (Criteria) this;
        }

        public Criteria andTCustomerGroupNotEqualTo(String value) {
            addCriterion("T_CUSTOMER_GROUP <>", value, "tCustomerGroup");
            return (Criteria) this;
        }

        public Criteria andTCustomerGroupGreaterThan(String value) {
            addCriterion("T_CUSTOMER_GROUP >", value, "tCustomerGroup");
            return (Criteria) this;
        }

        public Criteria andTCustomerGroupGreaterThanOrEqualTo(String value) {
            addCriterion("T_CUSTOMER_GROUP >=", value, "tCustomerGroup");
            return (Criteria) this;
        }

        public Criteria andTCustomerGroupLessThan(String value) {
            addCriterion("T_CUSTOMER_GROUP <", value, "tCustomerGroup");
            return (Criteria) this;
        }

        public Criteria andTCustomerGroupLessThanOrEqualTo(String value) {
            addCriterion("T_CUSTOMER_GROUP <=", value, "tCustomerGroup");
            return (Criteria) this;
        }

        public Criteria andTCustomerGroupLike(String value) {
            addCriterion("T_CUSTOMER_GROUP like", value, "tCustomerGroup");
            return (Criteria) this;
        }

        public Criteria andTCustomerGroupNotLike(String value) {
            addCriterion("T_CUSTOMER_GROUP not like", value, "tCustomerGroup");
            return (Criteria) this;
        }

        public Criteria andTCustomerGroupIn(List<String> values) {
            addCriterion("T_CUSTOMER_GROUP in", values, "tCustomerGroup");
            return (Criteria) this;
        }

        public Criteria andTCustomerGroupNotIn(List<String> values) {
            addCriterion("T_CUSTOMER_GROUP not in", values, "tCustomerGroup");
            return (Criteria) this;
        }

        public Criteria andTCustomerGroupBetween(String value1, String value2) {
            addCriterion("T_CUSTOMER_GROUP between", value1, value2, "tCustomerGroup");
            return (Criteria) this;
        }

        public Criteria andTCustomerGroupNotBetween(String value1, String value2) {
            addCriterion("T_CUSTOMER_GROUP not between", value1, value2, "tCustomerGroup");
            return (Criteria) this;
        }

        public Criteria andTInvoiceNumberIsNull() {
            addCriterion("T_INVOICE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTInvoiceNumberIsNotNull() {
            addCriterion("T_INVOICE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTInvoiceNumberEqualTo(Long value) {
            addCriterion("T_INVOICE_NUMBER =", value, "tInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTInvoiceNumberNotEqualTo(Long value) {
            addCriterion("T_INVOICE_NUMBER <>", value, "tInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTInvoiceNumberGreaterThan(Long value) {
            addCriterion("T_INVOICE_NUMBER >", value, "tInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTInvoiceNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("T_INVOICE_NUMBER >=", value, "tInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTInvoiceNumberLessThan(Long value) {
            addCriterion("T_INVOICE_NUMBER <", value, "tInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTInvoiceNumberLessThanOrEqualTo(Long value) {
            addCriterion("T_INVOICE_NUMBER <=", value, "tInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTInvoiceNumberIn(List<Long> values) {
            addCriterion("T_INVOICE_NUMBER in", values, "tInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTInvoiceNumberNotIn(List<Long> values) {
            addCriterion("T_INVOICE_NUMBER not in", values, "tInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTInvoiceNumberBetween(Long value1, Long value2) {
            addCriterion("T_INVOICE_NUMBER between", value1, value2, "tInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTInvoiceNumberNotBetween(Long value1, Long value2) {
            addCriterion("T_INVOICE_NUMBER not between", value1, value2, "tInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifReqdIsNull() {
            addCriterion("T_LOGIN_VERIF_REQD is null");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifReqdIsNotNull() {
            addCriterion("T_LOGIN_VERIF_REQD is not null");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifReqdEqualTo(String value) {
            addCriterion("T_LOGIN_VERIF_REQD =", value, "tLoginVerifReqd");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifReqdNotEqualTo(String value) {
            addCriterion("T_LOGIN_VERIF_REQD <>", value, "tLoginVerifReqd");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifReqdGreaterThan(String value) {
            addCriterion("T_LOGIN_VERIF_REQD >", value, "tLoginVerifReqd");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifReqdGreaterThanOrEqualTo(String value) {
            addCriterion("T_LOGIN_VERIF_REQD >=", value, "tLoginVerifReqd");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifReqdLessThan(String value) {
            addCriterion("T_LOGIN_VERIF_REQD <", value, "tLoginVerifReqd");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifReqdLessThanOrEqualTo(String value) {
            addCriterion("T_LOGIN_VERIF_REQD <=", value, "tLoginVerifReqd");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifReqdLike(String value) {
            addCriterion("T_LOGIN_VERIF_REQD like", value, "tLoginVerifReqd");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifReqdNotLike(String value) {
            addCriterion("T_LOGIN_VERIF_REQD not like", value, "tLoginVerifReqd");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifReqdIn(List<String> values) {
            addCriterion("T_LOGIN_VERIF_REQD in", values, "tLoginVerifReqd");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifReqdNotIn(List<String> values) {
            addCriterion("T_LOGIN_VERIF_REQD not in", values, "tLoginVerifReqd");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifReqdBetween(String value1, String value2) {
            addCriterion("T_LOGIN_VERIF_REQD between", value1, value2, "tLoginVerifReqd");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifReqdNotBetween(String value1, String value2) {
            addCriterion("T_LOGIN_VERIF_REQD not between", value1, value2, "tLoginVerifReqd");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedIsNull() {
            addCriterion("T_LOGIN_VERIFIED is null");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedIsNotNull() {
            addCriterion("T_LOGIN_VERIFIED is not null");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedEqualTo(String value) {
            addCriterion("T_LOGIN_VERIFIED =", value, "tLoginVerified");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedNotEqualTo(String value) {
            addCriterion("T_LOGIN_VERIFIED <>", value, "tLoginVerified");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedGreaterThan(String value) {
            addCriterion("T_LOGIN_VERIFIED >", value, "tLoginVerified");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedGreaterThanOrEqualTo(String value) {
            addCriterion("T_LOGIN_VERIFIED >=", value, "tLoginVerified");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedLessThan(String value) {
            addCriterion("T_LOGIN_VERIFIED <", value, "tLoginVerified");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedLessThanOrEqualTo(String value) {
            addCriterion("T_LOGIN_VERIFIED <=", value, "tLoginVerified");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedLike(String value) {
            addCriterion("T_LOGIN_VERIFIED like", value, "tLoginVerified");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedNotLike(String value) {
            addCriterion("T_LOGIN_VERIFIED not like", value, "tLoginVerified");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedIn(List<String> values) {
            addCriterion("T_LOGIN_VERIFIED in", values, "tLoginVerified");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedNotIn(List<String> values) {
            addCriterion("T_LOGIN_VERIFIED not in", values, "tLoginVerified");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedBetween(String value1, String value2) {
            addCriterion("T_LOGIN_VERIFIED between", value1, value2, "tLoginVerified");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedNotBetween(String value1, String value2) {
            addCriterion("T_LOGIN_VERIFIED not between", value1, value2, "tLoginVerified");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedByIsNull() {
            addCriterion("T_LOGIN_VERIFIED_BY is null");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedByIsNotNull() {
            addCriterion("T_LOGIN_VERIFIED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedByEqualTo(String value) {
            addCriterion("T_LOGIN_VERIFIED_BY =", value, "tLoginVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedByNotEqualTo(String value) {
            addCriterion("T_LOGIN_VERIFIED_BY <>", value, "tLoginVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedByGreaterThan(String value) {
            addCriterion("T_LOGIN_VERIFIED_BY >", value, "tLoginVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedByGreaterThanOrEqualTo(String value) {
            addCriterion("T_LOGIN_VERIFIED_BY >=", value, "tLoginVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedByLessThan(String value) {
            addCriterion("T_LOGIN_VERIFIED_BY <", value, "tLoginVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedByLessThanOrEqualTo(String value) {
            addCriterion("T_LOGIN_VERIFIED_BY <=", value, "tLoginVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedByLike(String value) {
            addCriterion("T_LOGIN_VERIFIED_BY like", value, "tLoginVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedByNotLike(String value) {
            addCriterion("T_LOGIN_VERIFIED_BY not like", value, "tLoginVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedByIn(List<String> values) {
            addCriterion("T_LOGIN_VERIFIED_BY in", values, "tLoginVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedByNotIn(List<String> values) {
            addCriterion("T_LOGIN_VERIFIED_BY not in", values, "tLoginVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedByBetween(String value1, String value2) {
            addCriterion("T_LOGIN_VERIFIED_BY between", value1, value2, "tLoginVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedByNotBetween(String value1, String value2) {
            addCriterion("T_LOGIN_VERIFIED_BY not between", value1, value2, "tLoginVerifiedBy");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedOnIsNull() {
            addCriterion("T_LOGIN_VERIFIED_ON is null");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedOnIsNotNull() {
            addCriterion("T_LOGIN_VERIFIED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedOnEqualTo(Date value) {
            addCriterionForJDBCDate("T_LOGIN_VERIFIED_ON =", value, "tLoginVerifiedOn");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_LOGIN_VERIFIED_ON <>", value, "tLoginVerifiedOn");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedOnGreaterThan(Date value) {
            addCriterionForJDBCDate("T_LOGIN_VERIFIED_ON >", value, "tLoginVerifiedOn");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_LOGIN_VERIFIED_ON >=", value, "tLoginVerifiedOn");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedOnLessThan(Date value) {
            addCriterionForJDBCDate("T_LOGIN_VERIFIED_ON <", value, "tLoginVerifiedOn");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_LOGIN_VERIFIED_ON <=", value, "tLoginVerifiedOn");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedOnIn(List<Date> values) {
            addCriterionForJDBCDate("T_LOGIN_VERIFIED_ON in", values, "tLoginVerifiedOn");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_LOGIN_VERIFIED_ON not in", values, "tLoginVerifiedOn");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_LOGIN_VERIFIED_ON between", value1, value2, "tLoginVerifiedOn");
            return (Criteria) this;
        }

        public Criteria andTLoginVerifiedOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_LOGIN_VERIFIED_ON not between", value1, value2, "tLoginVerifiedOn");
            return (Criteria) this;
        }

        public Criteria andTNoteIsNull() {
            addCriterion("T_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andTNoteIsNotNull() {
            addCriterion("T_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andTNoteEqualTo(Long value) {
            addCriterion("T_NOTE =", value, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteNotEqualTo(Long value) {
            addCriterion("T_NOTE <>", value, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteGreaterThan(Long value) {
            addCriterion("T_NOTE >", value, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteGreaterThanOrEqualTo(Long value) {
            addCriterion("T_NOTE >=", value, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteLessThan(Long value) {
            addCriterion("T_NOTE <", value, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteLessThanOrEqualTo(Long value) {
            addCriterion("T_NOTE <=", value, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteIn(List<Long> values) {
            addCriterion("T_NOTE in", values, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteNotIn(List<Long> values) {
            addCriterion("T_NOTE not in", values, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteBetween(Long value1, Long value2) {
            addCriterion("T_NOTE between", value1, value2, "tNote");
            return (Criteria) this;
        }

        public Criteria andTNoteNotBetween(Long value1, Long value2) {
            addCriterion("T_NOTE not between", value1, value2, "tNote");
            return (Criteria) this;
        }

        public Criteria andTPoNumberIsNull() {
            addCriterion("T_PO_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTPoNumberIsNotNull() {
            addCriterion("T_PO_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTPoNumberEqualTo(String value) {
            addCriterion("T_PO_NUMBER =", value, "tPoNumber");
            return (Criteria) this;
        }

        public Criteria andTPoNumberNotEqualTo(String value) {
            addCriterion("T_PO_NUMBER <>", value, "tPoNumber");
            return (Criteria) this;
        }

        public Criteria andTPoNumberGreaterThan(String value) {
            addCriterion("T_PO_NUMBER >", value, "tPoNumber");
            return (Criteria) this;
        }

        public Criteria andTPoNumberGreaterThanOrEqualTo(String value) {
            addCriterion("T_PO_NUMBER >=", value, "tPoNumber");
            return (Criteria) this;
        }

        public Criteria andTPoNumberLessThan(String value) {
            addCriterion("T_PO_NUMBER <", value, "tPoNumber");
            return (Criteria) this;
        }

        public Criteria andTPoNumberLessThanOrEqualTo(String value) {
            addCriterion("T_PO_NUMBER <=", value, "tPoNumber");
            return (Criteria) this;
        }

        public Criteria andTPoNumberLike(String value) {
            addCriterion("T_PO_NUMBER like", value, "tPoNumber");
            return (Criteria) this;
        }

        public Criteria andTPoNumberNotLike(String value) {
            addCriterion("T_PO_NUMBER not like", value, "tPoNumber");
            return (Criteria) this;
        }

        public Criteria andTPoNumberIn(List<String> values) {
            addCriterion("T_PO_NUMBER in", values, "tPoNumber");
            return (Criteria) this;
        }

        public Criteria andTPoNumberNotIn(List<String> values) {
            addCriterion("T_PO_NUMBER not in", values, "tPoNumber");
            return (Criteria) this;
        }

        public Criteria andTPoNumberBetween(String value1, String value2) {
            addCriterion("T_PO_NUMBER between", value1, value2, "tPoNumber");
            return (Criteria) this;
        }

        public Criteria andTPoNumberNotBetween(String value1, String value2) {
            addCriterion("T_PO_NUMBER not between", value1, value2, "tPoNumber");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerIsNull() {
            addCriterion("T_SOURCE_CUSTOMER is null");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerIsNotNull() {
            addCriterion("T_SOURCE_CUSTOMER is not null");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerEqualTo(String value) {
            addCriterion("T_SOURCE_CUSTOMER =", value, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerNotEqualTo(String value) {
            addCriterion("T_SOURCE_CUSTOMER <>", value, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerGreaterThan(String value) {
            addCriterion("T_SOURCE_CUSTOMER >", value, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("T_SOURCE_CUSTOMER >=", value, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerLessThan(String value) {
            addCriterion("T_SOURCE_CUSTOMER <", value, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerLessThanOrEqualTo(String value) {
            addCriterion("T_SOURCE_CUSTOMER <=", value, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerLike(String value) {
            addCriterion("T_SOURCE_CUSTOMER like", value, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerNotLike(String value) {
            addCriterion("T_SOURCE_CUSTOMER not like", value, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerIn(List<String> values) {
            addCriterion("T_SOURCE_CUSTOMER in", values, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerNotIn(List<String> values) {
            addCriterion("T_SOURCE_CUSTOMER not in", values, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerBetween(String value1, String value2) {
            addCriterion("T_SOURCE_CUSTOMER between", value1, value2, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerNotBetween(String value1, String value2) {
            addCriterion("T_SOURCE_CUSTOMER not between", value1, value2, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTPreInvoiceNumberIsNull() {
            addCriterion("T_PRE_INVOICE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTPreInvoiceNumberIsNotNull() {
            addCriterion("T_PRE_INVOICE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTPreInvoiceNumberEqualTo(Long value) {
            addCriterion("T_PRE_INVOICE_NUMBER =", value, "tPreInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTPreInvoiceNumberNotEqualTo(Long value) {
            addCriterion("T_PRE_INVOICE_NUMBER <>", value, "tPreInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTPreInvoiceNumberGreaterThan(Long value) {
            addCriterion("T_PRE_INVOICE_NUMBER >", value, "tPreInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTPreInvoiceNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("T_PRE_INVOICE_NUMBER >=", value, "tPreInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTPreInvoiceNumberLessThan(Long value) {
            addCriterion("T_PRE_INVOICE_NUMBER <", value, "tPreInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTPreInvoiceNumberLessThanOrEqualTo(Long value) {
            addCriterion("T_PRE_INVOICE_NUMBER <=", value, "tPreInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTPreInvoiceNumberIn(List<Long> values) {
            addCriterion("T_PRE_INVOICE_NUMBER in", values, "tPreInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTPreInvoiceNumberNotIn(List<Long> values) {
            addCriterion("T_PRE_INVOICE_NUMBER not in", values, "tPreInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTPreInvoiceNumberBetween(Long value1, Long value2) {
            addCriterion("T_PRE_INVOICE_NUMBER between", value1, value2, "tPreInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTPreInvoiceNumberNotBetween(Long value1, Long value2) {
            addCriterion("T_PRE_INVOICE_NUMBER not between", value1, value2, "tPreInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumberIsNull() {
            addCriterion("C_PHONE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumberIsNotNull() {
            addCriterion("C_PHONE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumberEqualTo(String value) {
            addCriterion("C_PHONE_NUMBER =", value, "cPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumberNotEqualTo(String value) {
            addCriterion("C_PHONE_NUMBER <>", value, "cPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumberGreaterThan(String value) {
            addCriterion("C_PHONE_NUMBER >", value, "cPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("C_PHONE_NUMBER >=", value, "cPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumberLessThan(String value) {
            addCriterion("C_PHONE_NUMBER <", value, "cPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("C_PHONE_NUMBER <=", value, "cPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumberLike(String value) {
            addCriterion("C_PHONE_NUMBER like", value, "cPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumberNotLike(String value) {
            addCriterion("C_PHONE_NUMBER not like", value, "cPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumberIn(List<String> values) {
            addCriterion("C_PHONE_NUMBER in", values, "cPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumberNotIn(List<String> values) {
            addCriterion("C_PHONE_NUMBER not in", values, "cPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumberBetween(String value1, String value2) {
            addCriterion("C_PHONE_NUMBER between", value1, value2, "cPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("C_PHONE_NUMBER not between", value1, value2, "cPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCEmailAddressIsNull() {
            addCriterion("C_EMAIL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCEmailAddressIsNotNull() {
            addCriterion("C_EMAIL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCEmailAddressEqualTo(String value) {
            addCriterion("C_EMAIL_ADDRESS =", value, "cEmailAddress");
            return (Criteria) this;
        }

        public Criteria andCEmailAddressNotEqualTo(String value) {
            addCriterion("C_EMAIL_ADDRESS <>", value, "cEmailAddress");
            return (Criteria) this;
        }

        public Criteria andCEmailAddressGreaterThan(String value) {
            addCriterion("C_EMAIL_ADDRESS >", value, "cEmailAddress");
            return (Criteria) this;
        }

        public Criteria andCEmailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("C_EMAIL_ADDRESS >=", value, "cEmailAddress");
            return (Criteria) this;
        }

        public Criteria andCEmailAddressLessThan(String value) {
            addCriterion("C_EMAIL_ADDRESS <", value, "cEmailAddress");
            return (Criteria) this;
        }

        public Criteria andCEmailAddressLessThanOrEqualTo(String value) {
            addCriterion("C_EMAIL_ADDRESS <=", value, "cEmailAddress");
            return (Criteria) this;
        }

        public Criteria andCEmailAddressLike(String value) {
            addCriterion("C_EMAIL_ADDRESS like", value, "cEmailAddress");
            return (Criteria) this;
        }

        public Criteria andCEmailAddressNotLike(String value) {
            addCriterion("C_EMAIL_ADDRESS not like", value, "cEmailAddress");
            return (Criteria) this;
        }

        public Criteria andCEmailAddressIn(List<String> values) {
            addCriterion("C_EMAIL_ADDRESS in", values, "cEmailAddress");
            return (Criteria) this;
        }

        public Criteria andCEmailAddressNotIn(List<String> values) {
            addCriterion("C_EMAIL_ADDRESS not in", values, "cEmailAddress");
            return (Criteria) this;
        }

        public Criteria andCEmailAddressBetween(String value1, String value2) {
            addCriterion("C_EMAIL_ADDRESS between", value1, value2, "cEmailAddress");
            return (Criteria) this;
        }

        public Criteria andCEmailAddressNotBetween(String value1, String value2) {
            addCriterion("C_EMAIL_ADDRESS not between", value1, value2, "cEmailAddress");
            return (Criteria) this;
        }

        public Criteria andCProductTypeIsNull() {
            addCriterion("C_PRODUCT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCProductTypeIsNotNull() {
            addCriterion("C_PRODUCT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCProductTypeEqualTo(String value) {
            addCriterion("C_PRODUCT_TYPE =", value, "cProductType");
            return (Criteria) this;
        }

        public Criteria andCProductTypeNotEqualTo(String value) {
            addCriterion("C_PRODUCT_TYPE <>", value, "cProductType");
            return (Criteria) this;
        }

        public Criteria andCProductTypeGreaterThan(String value) {
            addCriterion("C_PRODUCT_TYPE >", value, "cProductType");
            return (Criteria) this;
        }

        public Criteria andCProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_PRODUCT_TYPE >=", value, "cProductType");
            return (Criteria) this;
        }

        public Criteria andCProductTypeLessThan(String value) {
            addCriterion("C_PRODUCT_TYPE <", value, "cProductType");
            return (Criteria) this;
        }

        public Criteria andCProductTypeLessThanOrEqualTo(String value) {
            addCriterion("C_PRODUCT_TYPE <=", value, "cProductType");
            return (Criteria) this;
        }

        public Criteria andCProductTypeLike(String value) {
            addCriterion("C_PRODUCT_TYPE like", value, "cProductType");
            return (Criteria) this;
        }

        public Criteria andCProductTypeNotLike(String value) {
            addCriterion("C_PRODUCT_TYPE not like", value, "cProductType");
            return (Criteria) this;
        }

        public Criteria andCProductTypeIn(List<String> values) {
            addCriterion("C_PRODUCT_TYPE in", values, "cProductType");
            return (Criteria) this;
        }

        public Criteria andCProductTypeNotIn(List<String> values) {
            addCriterion("C_PRODUCT_TYPE not in", values, "cProductType");
            return (Criteria) this;
        }

        public Criteria andCProductTypeBetween(String value1, String value2) {
            addCriterion("C_PRODUCT_TYPE between", value1, value2, "cProductType");
            return (Criteria) this;
        }

        public Criteria andCProductTypeNotBetween(String value1, String value2) {
            addCriterion("C_PRODUCT_TYPE not between", value1, value2, "cProductType");
            return (Criteria) this;
        }

        public Criteria andCApplyTypeIsNull() {
            addCriterion("C_APPLY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCApplyTypeIsNotNull() {
            addCriterion("C_APPLY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCApplyTypeEqualTo(String value) {
            addCriterion("C_APPLY_TYPE =", value, "cApplyType");
            return (Criteria) this;
        }

        public Criteria andCApplyTypeNotEqualTo(String value) {
            addCriterion("C_APPLY_TYPE <>", value, "cApplyType");
            return (Criteria) this;
        }

        public Criteria andCApplyTypeGreaterThan(String value) {
            addCriterion("C_APPLY_TYPE >", value, "cApplyType");
            return (Criteria) this;
        }

        public Criteria andCApplyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_APPLY_TYPE >=", value, "cApplyType");
            return (Criteria) this;
        }

        public Criteria andCApplyTypeLessThan(String value) {
            addCriterion("C_APPLY_TYPE <", value, "cApplyType");
            return (Criteria) this;
        }

        public Criteria andCApplyTypeLessThanOrEqualTo(String value) {
            addCriterion("C_APPLY_TYPE <=", value, "cApplyType");
            return (Criteria) this;
        }

        public Criteria andCApplyTypeLike(String value) {
            addCriterion("C_APPLY_TYPE like", value, "cApplyType");
            return (Criteria) this;
        }

        public Criteria andCApplyTypeNotLike(String value) {
            addCriterion("C_APPLY_TYPE not like", value, "cApplyType");
            return (Criteria) this;
        }

        public Criteria andCApplyTypeIn(List<String> values) {
            addCriterion("C_APPLY_TYPE in", values, "cApplyType");
            return (Criteria) this;
        }

        public Criteria andCApplyTypeNotIn(List<String> values) {
            addCriterion("C_APPLY_TYPE not in", values, "cApplyType");
            return (Criteria) this;
        }

        public Criteria andCApplyTypeBetween(String value1, String value2) {
            addCriterion("C_APPLY_TYPE between", value1, value2, "cApplyType");
            return (Criteria) this;
        }

        public Criteria andCApplyTypeNotBetween(String value1, String value2) {
            addCriterion("C_APPLY_TYPE not between", value1, value2, "cApplyType");
            return (Criteria) this;
        }

        public Criteria andCRetainHandleIsNull() {
            addCriterion("C_RETAIN_HANDLE is null");
            return (Criteria) this;
        }

        public Criteria andCRetainHandleIsNotNull() {
            addCriterion("C_RETAIN_HANDLE is not null");
            return (Criteria) this;
        }

        public Criteria andCRetainHandleEqualTo(String value) {
            addCriterion("C_RETAIN_HANDLE =", value, "cRetainHandle");
            return (Criteria) this;
        }

        public Criteria andCRetainHandleNotEqualTo(String value) {
            addCriterion("C_RETAIN_HANDLE <>", value, "cRetainHandle");
            return (Criteria) this;
        }

        public Criteria andCRetainHandleGreaterThan(String value) {
            addCriterion("C_RETAIN_HANDLE >", value, "cRetainHandle");
            return (Criteria) this;
        }

        public Criteria andCRetainHandleGreaterThanOrEqualTo(String value) {
            addCriterion("C_RETAIN_HANDLE >=", value, "cRetainHandle");
            return (Criteria) this;
        }

        public Criteria andCRetainHandleLessThan(String value) {
            addCriterion("C_RETAIN_HANDLE <", value, "cRetainHandle");
            return (Criteria) this;
        }

        public Criteria andCRetainHandleLessThanOrEqualTo(String value) {
            addCriterion("C_RETAIN_HANDLE <=", value, "cRetainHandle");
            return (Criteria) this;
        }

        public Criteria andCRetainHandleLike(String value) {
            addCriterion("C_RETAIN_HANDLE like", value, "cRetainHandle");
            return (Criteria) this;
        }

        public Criteria andCRetainHandleNotLike(String value) {
            addCriterion("C_RETAIN_HANDLE not like", value, "cRetainHandle");
            return (Criteria) this;
        }

        public Criteria andCRetainHandleIn(List<String> values) {
            addCriterion("C_RETAIN_HANDLE in", values, "cRetainHandle");
            return (Criteria) this;
        }

        public Criteria andCRetainHandleNotIn(List<String> values) {
            addCriterion("C_RETAIN_HANDLE not in", values, "cRetainHandle");
            return (Criteria) this;
        }

        public Criteria andCRetainHandleBetween(String value1, String value2) {
            addCriterion("C_RETAIN_HANDLE between", value1, value2, "cRetainHandle");
            return (Criteria) this;
        }

        public Criteria andCRetainHandleNotBetween(String value1, String value2) {
            addCriterion("C_RETAIN_HANDLE not between", value1, value2, "cRetainHandle");
            return (Criteria) this;
        }

        public Criteria andCCoaLanguageIsNull() {
            addCriterion("C_COA_LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andCCoaLanguageIsNotNull() {
            addCriterion("C_COA_LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCCoaLanguageEqualTo(String value) {
            addCriterion("C_COA_LANGUAGE =", value, "cCoaLanguage");
            return (Criteria) this;
        }

        public Criteria andCCoaLanguageNotEqualTo(String value) {
            addCriterion("C_COA_LANGUAGE <>", value, "cCoaLanguage");
            return (Criteria) this;
        }

        public Criteria andCCoaLanguageGreaterThan(String value) {
            addCriterion("C_COA_LANGUAGE >", value, "cCoaLanguage");
            return (Criteria) this;
        }

        public Criteria andCCoaLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("C_COA_LANGUAGE >=", value, "cCoaLanguage");
            return (Criteria) this;
        }

        public Criteria andCCoaLanguageLessThan(String value) {
            addCriterion("C_COA_LANGUAGE <", value, "cCoaLanguage");
            return (Criteria) this;
        }

        public Criteria andCCoaLanguageLessThanOrEqualTo(String value) {
            addCriterion("C_COA_LANGUAGE <=", value, "cCoaLanguage");
            return (Criteria) this;
        }

        public Criteria andCCoaLanguageLike(String value) {
            addCriterion("C_COA_LANGUAGE like", value, "cCoaLanguage");
            return (Criteria) this;
        }

        public Criteria andCCoaLanguageNotLike(String value) {
            addCriterion("C_COA_LANGUAGE not like", value, "cCoaLanguage");
            return (Criteria) this;
        }

        public Criteria andCCoaLanguageIn(List<String> values) {
            addCriterion("C_COA_LANGUAGE in", values, "cCoaLanguage");
            return (Criteria) this;
        }

        public Criteria andCCoaLanguageNotIn(List<String> values) {
            addCriterion("C_COA_LANGUAGE not in", values, "cCoaLanguage");
            return (Criteria) this;
        }

        public Criteria andCCoaLanguageBetween(String value1, String value2) {
            addCriterion("C_COA_LANGUAGE between", value1, value2, "cCoaLanguage");
            return (Criteria) this;
        }

        public Criteria andCCoaLanguageNotBetween(String value1, String value2) {
            addCriterion("C_COA_LANGUAGE not between", value1, value2, "cCoaLanguage");
            return (Criteria) this;
        }

        public Criteria andCCoaFormatIsNull() {
            addCriterion("C_COA_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andCCoaFormatIsNotNull() {
            addCriterion("C_COA_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andCCoaFormatEqualTo(String value) {
            addCriterion("C_COA_FORMAT =", value, "cCoaFormat");
            return (Criteria) this;
        }

        public Criteria andCCoaFormatNotEqualTo(String value) {
            addCriterion("C_COA_FORMAT <>", value, "cCoaFormat");
            return (Criteria) this;
        }

        public Criteria andCCoaFormatGreaterThan(String value) {
            addCriterion("C_COA_FORMAT >", value, "cCoaFormat");
            return (Criteria) this;
        }

        public Criteria andCCoaFormatGreaterThanOrEqualTo(String value) {
            addCriterion("C_COA_FORMAT >=", value, "cCoaFormat");
            return (Criteria) this;
        }

        public Criteria andCCoaFormatLessThan(String value) {
            addCriterion("C_COA_FORMAT <", value, "cCoaFormat");
            return (Criteria) this;
        }

        public Criteria andCCoaFormatLessThanOrEqualTo(String value) {
            addCriterion("C_COA_FORMAT <=", value, "cCoaFormat");
            return (Criteria) this;
        }

        public Criteria andCCoaFormatLike(String value) {
            addCriterion("C_COA_FORMAT like", value, "cCoaFormat");
            return (Criteria) this;
        }

        public Criteria andCCoaFormatNotLike(String value) {
            addCriterion("C_COA_FORMAT not like", value, "cCoaFormat");
            return (Criteria) this;
        }

        public Criteria andCCoaFormatIn(List<String> values) {
            addCriterion("C_COA_FORMAT in", values, "cCoaFormat");
            return (Criteria) this;
        }

        public Criteria andCCoaFormatNotIn(List<String> values) {
            addCriterion("C_COA_FORMAT not in", values, "cCoaFormat");
            return (Criteria) this;
        }

        public Criteria andCCoaFormatBetween(String value1, String value2) {
            addCriterion("C_COA_FORMAT between", value1, value2, "cCoaFormat");
            return (Criteria) this;
        }

        public Criteria andCCoaFormatNotBetween(String value1, String value2) {
            addCriterion("C_COA_FORMAT not between", value1, value2, "cCoaFormat");
            return (Criteria) this;
        }

        public Criteria andCNeedMessageIsNull() {
            addCriterion("C_NEED_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andCNeedMessageIsNotNull() {
            addCriterion("C_NEED_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCNeedMessageEqualTo(String value) {
            addCriterion("C_NEED_MESSAGE =", value, "cNeedMessage");
            return (Criteria) this;
        }

        public Criteria andCNeedMessageNotEqualTo(String value) {
            addCriterion("C_NEED_MESSAGE <>", value, "cNeedMessage");
            return (Criteria) this;
        }

        public Criteria andCNeedMessageGreaterThan(String value) {
            addCriterion("C_NEED_MESSAGE >", value, "cNeedMessage");
            return (Criteria) this;
        }

        public Criteria andCNeedMessageGreaterThanOrEqualTo(String value) {
            addCriterion("C_NEED_MESSAGE >=", value, "cNeedMessage");
            return (Criteria) this;
        }

        public Criteria andCNeedMessageLessThan(String value) {
            addCriterion("C_NEED_MESSAGE <", value, "cNeedMessage");
            return (Criteria) this;
        }

        public Criteria andCNeedMessageLessThanOrEqualTo(String value) {
            addCriterion("C_NEED_MESSAGE <=", value, "cNeedMessage");
            return (Criteria) this;
        }

        public Criteria andCNeedMessageLike(String value) {
            addCriterion("C_NEED_MESSAGE like", value, "cNeedMessage");
            return (Criteria) this;
        }

        public Criteria andCNeedMessageNotLike(String value) {
            addCriterion("C_NEED_MESSAGE not like", value, "cNeedMessage");
            return (Criteria) this;
        }

        public Criteria andCNeedMessageIn(List<String> values) {
            addCriterion("C_NEED_MESSAGE in", values, "cNeedMessage");
            return (Criteria) this;
        }

        public Criteria andCNeedMessageNotIn(List<String> values) {
            addCriterion("C_NEED_MESSAGE not in", values, "cNeedMessage");
            return (Criteria) this;
        }

        public Criteria andCNeedMessageBetween(String value1, String value2) {
            addCriterion("C_NEED_MESSAGE between", value1, value2, "cNeedMessage");
            return (Criteria) this;
        }

        public Criteria andCNeedMessageNotBetween(String value1, String value2) {
            addCriterion("C_NEED_MESSAGE not between", value1, value2, "cNeedMessage");
            return (Criteria) this;
        }

        public Criteria andCTestPurposeIsNull() {
            addCriterion("C_TEST_PURPOSE is null");
            return (Criteria) this;
        }

        public Criteria andCTestPurposeIsNotNull() {
            addCriterion("C_TEST_PURPOSE is not null");
            return (Criteria) this;
        }

        public Criteria andCTestPurposeEqualTo(String value) {
            addCriterion("C_TEST_PURPOSE =", value, "cTestPurpose");
            return (Criteria) this;
        }

        public Criteria andCTestPurposeNotEqualTo(String value) {
            addCriterion("C_TEST_PURPOSE <>", value, "cTestPurpose");
            return (Criteria) this;
        }

        public Criteria andCTestPurposeGreaterThan(String value) {
            addCriterion("C_TEST_PURPOSE >", value, "cTestPurpose");
            return (Criteria) this;
        }

        public Criteria andCTestPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("C_TEST_PURPOSE >=", value, "cTestPurpose");
            return (Criteria) this;
        }

        public Criteria andCTestPurposeLessThan(String value) {
            addCriterion("C_TEST_PURPOSE <", value, "cTestPurpose");
            return (Criteria) this;
        }

        public Criteria andCTestPurposeLessThanOrEqualTo(String value) {
            addCriterion("C_TEST_PURPOSE <=", value, "cTestPurpose");
            return (Criteria) this;
        }

        public Criteria andCTestPurposeLike(String value) {
            addCriterion("C_TEST_PURPOSE like", value, "cTestPurpose");
            return (Criteria) this;
        }

        public Criteria andCTestPurposeNotLike(String value) {
            addCriterion("C_TEST_PURPOSE not like", value, "cTestPurpose");
            return (Criteria) this;
        }

        public Criteria andCTestPurposeIn(List<String> values) {
            addCriterion("C_TEST_PURPOSE in", values, "cTestPurpose");
            return (Criteria) this;
        }

        public Criteria andCTestPurposeNotIn(List<String> values) {
            addCriterion("C_TEST_PURPOSE not in", values, "cTestPurpose");
            return (Criteria) this;
        }

        public Criteria andCTestPurposeBetween(String value1, String value2) {
            addCriterion("C_TEST_PURPOSE between", value1, value2, "cTestPurpose");
            return (Criteria) this;
        }

        public Criteria andCTestPurposeNotBetween(String value1, String value2) {
            addCriterion("C_TEST_PURPOSE not between", value1, value2, "cTestPurpose");
            return (Criteria) this;
        }

        public Criteria andCProductPropertyIsNull() {
            addCriterion("C_PRODUCT_PROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andCProductPropertyIsNotNull() {
            addCriterion("C_PRODUCT_PROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andCProductPropertyEqualTo(String value) {
            addCriterion("C_PRODUCT_PROPERTY =", value, "cProductProperty");
            return (Criteria) this;
        }

        public Criteria andCProductPropertyNotEqualTo(String value) {
            addCriterion("C_PRODUCT_PROPERTY <>", value, "cProductProperty");
            return (Criteria) this;
        }

        public Criteria andCProductPropertyGreaterThan(String value) {
            addCriterion("C_PRODUCT_PROPERTY >", value, "cProductProperty");
            return (Criteria) this;
        }

        public Criteria andCProductPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("C_PRODUCT_PROPERTY >=", value, "cProductProperty");
            return (Criteria) this;
        }

        public Criteria andCProductPropertyLessThan(String value) {
            addCriterion("C_PRODUCT_PROPERTY <", value, "cProductProperty");
            return (Criteria) this;
        }

        public Criteria andCProductPropertyLessThanOrEqualTo(String value) {
            addCriterion("C_PRODUCT_PROPERTY <=", value, "cProductProperty");
            return (Criteria) this;
        }

        public Criteria andCProductPropertyLike(String value) {
            addCriterion("C_PRODUCT_PROPERTY like", value, "cProductProperty");
            return (Criteria) this;
        }

        public Criteria andCProductPropertyNotLike(String value) {
            addCriterion("C_PRODUCT_PROPERTY not like", value, "cProductProperty");
            return (Criteria) this;
        }

        public Criteria andCProductPropertyIn(List<String> values) {
            addCriterion("C_PRODUCT_PROPERTY in", values, "cProductProperty");
            return (Criteria) this;
        }

        public Criteria andCProductPropertyNotIn(List<String> values) {
            addCriterion("C_PRODUCT_PROPERTY not in", values, "cProductProperty");
            return (Criteria) this;
        }

        public Criteria andCProductPropertyBetween(String value1, String value2) {
            addCriterion("C_PRODUCT_PROPERTY between", value1, value2, "cProductProperty");
            return (Criteria) this;
        }

        public Criteria andCProductPropertyNotBetween(String value1, String value2) {
            addCriterion("C_PRODUCT_PROPERTY not between", value1, value2, "cProductProperty");
            return (Criteria) this;
        }

        public Criteria andCTerminalClientIsNull() {
            addCriterion("C_TERMINAL_CLIENT is null");
            return (Criteria) this;
        }

        public Criteria andCTerminalClientIsNotNull() {
            addCriterion("C_TERMINAL_CLIENT is not null");
            return (Criteria) this;
        }

        public Criteria andCTerminalClientEqualTo(String value) {
            addCriterion("C_TERMINAL_CLIENT =", value, "cTerminalClient");
            return (Criteria) this;
        }

        public Criteria andCTerminalClientNotEqualTo(String value) {
            addCriterion("C_TERMINAL_CLIENT <>", value, "cTerminalClient");
            return (Criteria) this;
        }

        public Criteria andCTerminalClientGreaterThan(String value) {
            addCriterion("C_TERMINAL_CLIENT >", value, "cTerminalClient");
            return (Criteria) this;
        }

        public Criteria andCTerminalClientGreaterThanOrEqualTo(String value) {
            addCriterion("C_TERMINAL_CLIENT >=", value, "cTerminalClient");
            return (Criteria) this;
        }

        public Criteria andCTerminalClientLessThan(String value) {
            addCriterion("C_TERMINAL_CLIENT <", value, "cTerminalClient");
            return (Criteria) this;
        }

        public Criteria andCTerminalClientLessThanOrEqualTo(String value) {
            addCriterion("C_TERMINAL_CLIENT <=", value, "cTerminalClient");
            return (Criteria) this;
        }

        public Criteria andCTerminalClientLike(String value) {
            addCriterion("C_TERMINAL_CLIENT like", value, "cTerminalClient");
            return (Criteria) this;
        }

        public Criteria andCTerminalClientNotLike(String value) {
            addCriterion("C_TERMINAL_CLIENT not like", value, "cTerminalClient");
            return (Criteria) this;
        }

        public Criteria andCTerminalClientIn(List<String> values) {
            addCriterion("C_TERMINAL_CLIENT in", values, "cTerminalClient");
            return (Criteria) this;
        }

        public Criteria andCTerminalClientNotIn(List<String> values) {
            addCriterion("C_TERMINAL_CLIENT not in", values, "cTerminalClient");
            return (Criteria) this;
        }

        public Criteria andCTerminalClientBetween(String value1, String value2) {
            addCriterion("C_TERMINAL_CLIENT between", value1, value2, "cTerminalClient");
            return (Criteria) this;
        }

        public Criteria andCTerminalClientNotBetween(String value1, String value2) {
            addCriterion("C_TERMINAL_CLIENT not between", value1, value2, "cTerminalClient");
            return (Criteria) this;
        }

        public Criteria andCClientTypeIsNull() {
            addCriterion("C_CLIENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCClientTypeIsNotNull() {
            addCriterion("C_CLIENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCClientTypeEqualTo(String value) {
            addCriterion("C_CLIENT_TYPE =", value, "cClientType");
            return (Criteria) this;
        }

        public Criteria andCClientTypeNotEqualTo(String value) {
            addCriterion("C_CLIENT_TYPE <>", value, "cClientType");
            return (Criteria) this;
        }

        public Criteria andCClientTypeGreaterThan(String value) {
            addCriterion("C_CLIENT_TYPE >", value, "cClientType");
            return (Criteria) this;
        }

        public Criteria andCClientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_CLIENT_TYPE >=", value, "cClientType");
            return (Criteria) this;
        }

        public Criteria andCClientTypeLessThan(String value) {
            addCriterion("C_CLIENT_TYPE <", value, "cClientType");
            return (Criteria) this;
        }

        public Criteria andCClientTypeLessThanOrEqualTo(String value) {
            addCriterion("C_CLIENT_TYPE <=", value, "cClientType");
            return (Criteria) this;
        }

        public Criteria andCClientTypeLike(String value) {
            addCriterion("C_CLIENT_TYPE like", value, "cClientType");
            return (Criteria) this;
        }

        public Criteria andCClientTypeNotLike(String value) {
            addCriterion("C_CLIENT_TYPE not like", value, "cClientType");
            return (Criteria) this;
        }

        public Criteria andCClientTypeIn(List<String> values) {
            addCriterion("C_CLIENT_TYPE in", values, "cClientType");
            return (Criteria) this;
        }

        public Criteria andCClientTypeNotIn(List<String> values) {
            addCriterion("C_CLIENT_TYPE not in", values, "cClientType");
            return (Criteria) this;
        }

        public Criteria andCClientTypeBetween(String value1, String value2) {
            addCriterion("C_CLIENT_TYPE between", value1, value2, "cClientType");
            return (Criteria) this;
        }

        public Criteria andCClientTypeNotBetween(String value1, String value2) {
            addCriterion("C_CLIENT_TYPE not between", value1, value2, "cClientType");
            return (Criteria) this;
        }

        public Criteria andCProductRequirementIsNull() {
            addCriterion("C_PRODUCT_REQUIREMENT is null");
            return (Criteria) this;
        }

        public Criteria andCProductRequirementIsNotNull() {
            addCriterion("C_PRODUCT_REQUIREMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCProductRequirementEqualTo(String value) {
            addCriterion("C_PRODUCT_REQUIREMENT =", value, "cProductRequirement");
            return (Criteria) this;
        }

        public Criteria andCProductRequirementNotEqualTo(String value) {
            addCriterion("C_PRODUCT_REQUIREMENT <>", value, "cProductRequirement");
            return (Criteria) this;
        }

        public Criteria andCProductRequirementGreaterThan(String value) {
            addCriterion("C_PRODUCT_REQUIREMENT >", value, "cProductRequirement");
            return (Criteria) this;
        }

        public Criteria andCProductRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("C_PRODUCT_REQUIREMENT >=", value, "cProductRequirement");
            return (Criteria) this;
        }

        public Criteria andCProductRequirementLessThan(String value) {
            addCriterion("C_PRODUCT_REQUIREMENT <", value, "cProductRequirement");
            return (Criteria) this;
        }

        public Criteria andCProductRequirementLessThanOrEqualTo(String value) {
            addCriterion("C_PRODUCT_REQUIREMENT <=", value, "cProductRequirement");
            return (Criteria) this;
        }

        public Criteria andCProductRequirementLike(String value) {
            addCriterion("C_PRODUCT_REQUIREMENT like", value, "cProductRequirement");
            return (Criteria) this;
        }

        public Criteria andCProductRequirementNotLike(String value) {
            addCriterion("C_PRODUCT_REQUIREMENT not like", value, "cProductRequirement");
            return (Criteria) this;
        }

        public Criteria andCProductRequirementIn(List<String> values) {
            addCriterion("C_PRODUCT_REQUIREMENT in", values, "cProductRequirement");
            return (Criteria) this;
        }

        public Criteria andCProductRequirementNotIn(List<String> values) {
            addCriterion("C_PRODUCT_REQUIREMENT not in", values, "cProductRequirement");
            return (Criteria) this;
        }

        public Criteria andCProductRequirementBetween(String value1, String value2) {
            addCriterion("C_PRODUCT_REQUIREMENT between", value1, value2, "cProductRequirement");
            return (Criteria) this;
        }

        public Criteria andCProductRequirementNotBetween(String value1, String value2) {
            addCriterion("C_PRODUCT_REQUIREMENT not between", value1, value2, "cProductRequirement");
            return (Criteria) this;
        }

        public Criteria andCIdentificationTypeIsNull() {
            addCriterion("C_IDENTIFICATION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCIdentificationTypeIsNotNull() {
            addCriterion("C_IDENTIFICATION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCIdentificationTypeEqualTo(String value) {
            addCriterion("C_IDENTIFICATION_TYPE =", value, "cIdentificationType");
            return (Criteria) this;
        }

        public Criteria andCIdentificationTypeNotEqualTo(String value) {
            addCriterion("C_IDENTIFICATION_TYPE <>", value, "cIdentificationType");
            return (Criteria) this;
        }

        public Criteria andCIdentificationTypeGreaterThan(String value) {
            addCriterion("C_IDENTIFICATION_TYPE >", value, "cIdentificationType");
            return (Criteria) this;
        }

        public Criteria andCIdentificationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_IDENTIFICATION_TYPE >=", value, "cIdentificationType");
            return (Criteria) this;
        }

        public Criteria andCIdentificationTypeLessThan(String value) {
            addCriterion("C_IDENTIFICATION_TYPE <", value, "cIdentificationType");
            return (Criteria) this;
        }

        public Criteria andCIdentificationTypeLessThanOrEqualTo(String value) {
            addCriterion("C_IDENTIFICATION_TYPE <=", value, "cIdentificationType");
            return (Criteria) this;
        }

        public Criteria andCIdentificationTypeLike(String value) {
            addCriterion("C_IDENTIFICATION_TYPE like", value, "cIdentificationType");
            return (Criteria) this;
        }

        public Criteria andCIdentificationTypeNotLike(String value) {
            addCriterion("C_IDENTIFICATION_TYPE not like", value, "cIdentificationType");
            return (Criteria) this;
        }

        public Criteria andCIdentificationTypeIn(List<String> values) {
            addCriterion("C_IDENTIFICATION_TYPE in", values, "cIdentificationType");
            return (Criteria) this;
        }

        public Criteria andCIdentificationTypeNotIn(List<String> values) {
            addCriterion("C_IDENTIFICATION_TYPE not in", values, "cIdentificationType");
            return (Criteria) this;
        }

        public Criteria andCIdentificationTypeBetween(String value1, String value2) {
            addCriterion("C_IDENTIFICATION_TYPE between", value1, value2, "cIdentificationType");
            return (Criteria) this;
        }

        public Criteria andCIdentificationTypeNotBetween(String value1, String value2) {
            addCriterion("C_IDENTIFICATION_TYPE not between", value1, value2, "cIdentificationType");
            return (Criteria) this;
        }

        public Criteria andCCheckingPropertyIsNull() {
            addCriterion("C_CHECKING_PROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andCCheckingPropertyIsNotNull() {
            addCriterion("C_CHECKING_PROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andCCheckingPropertyEqualTo(String value) {
            addCriterion("C_CHECKING_PROPERTY =", value, "cCheckingProperty");
            return (Criteria) this;
        }

        public Criteria andCCheckingPropertyNotEqualTo(String value) {
            addCriterion("C_CHECKING_PROPERTY <>", value, "cCheckingProperty");
            return (Criteria) this;
        }

        public Criteria andCCheckingPropertyGreaterThan(String value) {
            addCriterion("C_CHECKING_PROPERTY >", value, "cCheckingProperty");
            return (Criteria) this;
        }

        public Criteria andCCheckingPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("C_CHECKING_PROPERTY >=", value, "cCheckingProperty");
            return (Criteria) this;
        }

        public Criteria andCCheckingPropertyLessThan(String value) {
            addCriterion("C_CHECKING_PROPERTY <", value, "cCheckingProperty");
            return (Criteria) this;
        }

        public Criteria andCCheckingPropertyLessThanOrEqualTo(String value) {
            addCriterion("C_CHECKING_PROPERTY <=", value, "cCheckingProperty");
            return (Criteria) this;
        }

        public Criteria andCCheckingPropertyLike(String value) {
            addCriterion("C_CHECKING_PROPERTY like", value, "cCheckingProperty");
            return (Criteria) this;
        }

        public Criteria andCCheckingPropertyNotLike(String value) {
            addCriterion("C_CHECKING_PROPERTY not like", value, "cCheckingProperty");
            return (Criteria) this;
        }

        public Criteria andCCheckingPropertyIn(List<String> values) {
            addCriterion("C_CHECKING_PROPERTY in", values, "cCheckingProperty");
            return (Criteria) this;
        }

        public Criteria andCCheckingPropertyNotIn(List<String> values) {
            addCriterion("C_CHECKING_PROPERTY not in", values, "cCheckingProperty");
            return (Criteria) this;
        }

        public Criteria andCCheckingPropertyBetween(String value1, String value2) {
            addCriterion("C_CHECKING_PROPERTY between", value1, value2, "cCheckingProperty");
            return (Criteria) this;
        }

        public Criteria andCCheckingPropertyNotBetween(String value1, String value2) {
            addCriterion("C_CHECKING_PROPERTY not between", value1, value2, "cCheckingProperty");
            return (Criteria) this;
        }

        public Criteria andCProductLineIsNull() {
            addCriterion("C_PRODUCT_LINE is null");
            return (Criteria) this;
        }

        public Criteria andCProductLineIsNotNull() {
            addCriterion("C_PRODUCT_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andCProductLineEqualTo(String value) {
            addCriterion("C_PRODUCT_LINE =", value, "cProductLine");
            return (Criteria) this;
        }

        public Criteria andCProductLineNotEqualTo(String value) {
            addCriterion("C_PRODUCT_LINE <>", value, "cProductLine");
            return (Criteria) this;
        }

        public Criteria andCProductLineGreaterThan(String value) {
            addCriterion("C_PRODUCT_LINE >", value, "cProductLine");
            return (Criteria) this;
        }

        public Criteria andCProductLineGreaterThanOrEqualTo(String value) {
            addCriterion("C_PRODUCT_LINE >=", value, "cProductLine");
            return (Criteria) this;
        }

        public Criteria andCProductLineLessThan(String value) {
            addCriterion("C_PRODUCT_LINE <", value, "cProductLine");
            return (Criteria) this;
        }

        public Criteria andCProductLineLessThanOrEqualTo(String value) {
            addCriterion("C_PRODUCT_LINE <=", value, "cProductLine");
            return (Criteria) this;
        }

        public Criteria andCProductLineLike(String value) {
            addCriterion("C_PRODUCT_LINE like", value, "cProductLine");
            return (Criteria) this;
        }

        public Criteria andCProductLineNotLike(String value) {
            addCriterion("C_PRODUCT_LINE not like", value, "cProductLine");
            return (Criteria) this;
        }

        public Criteria andCProductLineIn(List<String> values) {
            addCriterion("C_PRODUCT_LINE in", values, "cProductLine");
            return (Criteria) this;
        }

        public Criteria andCProductLineNotIn(List<String> values) {
            addCriterion("C_PRODUCT_LINE not in", values, "cProductLine");
            return (Criteria) this;
        }

        public Criteria andCProductLineBetween(String value1, String value2) {
            addCriterion("C_PRODUCT_LINE between", value1, value2, "cProductLine");
            return (Criteria) this;
        }

        public Criteria andCProductLineNotBetween(String value1, String value2) {
            addCriterion("C_PRODUCT_LINE not between", value1, value2, "cProductLine");
            return (Criteria) this;
        }

        public Criteria andCProductDateIsNull() {
            addCriterion("C_PRODUCT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCProductDateIsNotNull() {
            addCriterion("C_PRODUCT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCProductDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_PRODUCT_DATE =", value, "cProductDate");
            return (Criteria) this;
        }

        public Criteria andCProductDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_PRODUCT_DATE <>", value, "cProductDate");
            return (Criteria) this;
        }

        public Criteria andCProductDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_PRODUCT_DATE >", value, "cProductDate");
            return (Criteria) this;
        }

        public Criteria andCProductDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_PRODUCT_DATE >=", value, "cProductDate");
            return (Criteria) this;
        }

        public Criteria andCProductDateLessThan(Date value) {
            addCriterionForJDBCDate("C_PRODUCT_DATE <", value, "cProductDate");
            return (Criteria) this;
        }

        public Criteria andCProductDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_PRODUCT_DATE <=", value, "cProductDate");
            return (Criteria) this;
        }

        public Criteria andCProductDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_PRODUCT_DATE in", values, "cProductDate");
            return (Criteria) this;
        }

        public Criteria andCProductDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_PRODUCT_DATE not in", values, "cProductDate");
            return (Criteria) this;
        }

        public Criteria andCProductDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_PRODUCT_DATE between", value1, value2, "cProductDate");
            return (Criteria) this;
        }

        public Criteria andCProductDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_PRODUCT_DATE not between", value1, value2, "cProductDate");
            return (Criteria) this;
        }

        public Criteria andCBatchSerialIsNull() {
            addCriterion("C_BATCH_SERIAL is null");
            return (Criteria) this;
        }

        public Criteria andCBatchSerialIsNotNull() {
            addCriterion("C_BATCH_SERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andCBatchSerialEqualTo(String value) {
            addCriterion("C_BATCH_SERIAL =", value, "cBatchSerial");
            return (Criteria) this;
        }

        public Criteria andCBatchSerialNotEqualTo(String value) {
            addCriterion("C_BATCH_SERIAL <>", value, "cBatchSerial");
            return (Criteria) this;
        }

        public Criteria andCBatchSerialGreaterThan(String value) {
            addCriterion("C_BATCH_SERIAL >", value, "cBatchSerial");
            return (Criteria) this;
        }

        public Criteria andCBatchSerialGreaterThanOrEqualTo(String value) {
            addCriterion("C_BATCH_SERIAL >=", value, "cBatchSerial");
            return (Criteria) this;
        }

        public Criteria andCBatchSerialLessThan(String value) {
            addCriterion("C_BATCH_SERIAL <", value, "cBatchSerial");
            return (Criteria) this;
        }

        public Criteria andCBatchSerialLessThanOrEqualTo(String value) {
            addCriterion("C_BATCH_SERIAL <=", value, "cBatchSerial");
            return (Criteria) this;
        }

        public Criteria andCBatchSerialLike(String value) {
            addCriterion("C_BATCH_SERIAL like", value, "cBatchSerial");
            return (Criteria) this;
        }

        public Criteria andCBatchSerialNotLike(String value) {
            addCriterion("C_BATCH_SERIAL not like", value, "cBatchSerial");
            return (Criteria) this;
        }

        public Criteria andCBatchSerialIn(List<String> values) {
            addCriterion("C_BATCH_SERIAL in", values, "cBatchSerial");
            return (Criteria) this;
        }

        public Criteria andCBatchSerialNotIn(List<String> values) {
            addCriterion("C_BATCH_SERIAL not in", values, "cBatchSerial");
            return (Criteria) this;
        }

        public Criteria andCBatchSerialBetween(String value1, String value2) {
            addCriterion("C_BATCH_SERIAL between", value1, value2, "cBatchSerial");
            return (Criteria) this;
        }

        public Criteria andCBatchSerialNotBetween(String value1, String value2) {
            addCriterion("C_BATCH_SERIAL not between", value1, value2, "cBatchSerial");
            return (Criteria) this;
        }

        public Criteria andCBatchNumberIsNull() {
            addCriterion("C_BATCH_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCBatchNumberIsNotNull() {
            addCriterion("C_BATCH_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCBatchNumberEqualTo(Long value) {
            addCriterion("C_BATCH_NUMBER =", value, "cBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCBatchNumberNotEqualTo(Long value) {
            addCriterion("C_BATCH_NUMBER <>", value, "cBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCBatchNumberGreaterThan(Long value) {
            addCriterion("C_BATCH_NUMBER >", value, "cBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCBatchNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("C_BATCH_NUMBER >=", value, "cBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCBatchNumberLessThan(Long value) {
            addCriterion("C_BATCH_NUMBER <", value, "cBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCBatchNumberLessThanOrEqualTo(Long value) {
            addCriterion("C_BATCH_NUMBER <=", value, "cBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCBatchNumberIn(List<Long> values) {
            addCriterion("C_BATCH_NUMBER in", values, "cBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCBatchNumberNotIn(List<Long> values) {
            addCriterion("C_BATCH_NUMBER not in", values, "cBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCBatchNumberBetween(Long value1, Long value2) {
            addCriterion("C_BATCH_NUMBER between", value1, value2, "cBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCBatchNumberNotBetween(Long value1, Long value2) {
            addCriterion("C_BATCH_NUMBER not between", value1, value2, "cBatchNumber");
            return (Criteria) this;
        }

        public Criteria andCCertificationTypeIsNull() {
            addCriterion("C_CERTIFICATION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCCertificationTypeIsNotNull() {
            addCriterion("C_CERTIFICATION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCCertificationTypeEqualTo(String value) {
            addCriterion("C_CERTIFICATION_TYPE =", value, "cCertificationType");
            return (Criteria) this;
        }

        public Criteria andCCertificationTypeNotEqualTo(String value) {
            addCriterion("C_CERTIFICATION_TYPE <>", value, "cCertificationType");
            return (Criteria) this;
        }

        public Criteria andCCertificationTypeGreaterThan(String value) {
            addCriterion("C_CERTIFICATION_TYPE >", value, "cCertificationType");
            return (Criteria) this;
        }

        public Criteria andCCertificationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_CERTIFICATION_TYPE >=", value, "cCertificationType");
            return (Criteria) this;
        }

        public Criteria andCCertificationTypeLessThan(String value) {
            addCriterion("C_CERTIFICATION_TYPE <", value, "cCertificationType");
            return (Criteria) this;
        }

        public Criteria andCCertificationTypeLessThanOrEqualTo(String value) {
            addCriterion("C_CERTIFICATION_TYPE <=", value, "cCertificationType");
            return (Criteria) this;
        }

        public Criteria andCCertificationTypeLike(String value) {
            addCriterion("C_CERTIFICATION_TYPE like", value, "cCertificationType");
            return (Criteria) this;
        }

        public Criteria andCCertificationTypeNotLike(String value) {
            addCriterion("C_CERTIFICATION_TYPE not like", value, "cCertificationType");
            return (Criteria) this;
        }

        public Criteria andCCertificationTypeIn(List<String> values) {
            addCriterion("C_CERTIFICATION_TYPE in", values, "cCertificationType");
            return (Criteria) this;
        }

        public Criteria andCCertificationTypeNotIn(List<String> values) {
            addCriterion("C_CERTIFICATION_TYPE not in", values, "cCertificationType");
            return (Criteria) this;
        }

        public Criteria andCCertificationTypeBetween(String value1, String value2) {
            addCriterion("C_CERTIFICATION_TYPE between", value1, value2, "cCertificationType");
            return (Criteria) this;
        }

        public Criteria andCCertificationTypeNotBetween(String value1, String value2) {
            addCriterion("C_CERTIFICATION_TYPE not between", value1, value2, "cCertificationType");
            return (Criteria) this;
        }

        public Criteria andCItemNumberIsNull() {
            addCriterion("C_ITEM_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCItemNumberIsNotNull() {
            addCriterion("C_ITEM_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCItemNumberEqualTo(String value) {
            addCriterion("C_ITEM_NUMBER =", value, "cItemNumber");
            return (Criteria) this;
        }

        public Criteria andCItemNumberNotEqualTo(String value) {
            addCriterion("C_ITEM_NUMBER <>", value, "cItemNumber");
            return (Criteria) this;
        }

        public Criteria andCItemNumberGreaterThan(String value) {
            addCriterion("C_ITEM_NUMBER >", value, "cItemNumber");
            return (Criteria) this;
        }

        public Criteria andCItemNumberGreaterThanOrEqualTo(String value) {
            addCriterion("C_ITEM_NUMBER >=", value, "cItemNumber");
            return (Criteria) this;
        }

        public Criteria andCItemNumberLessThan(String value) {
            addCriterion("C_ITEM_NUMBER <", value, "cItemNumber");
            return (Criteria) this;
        }

        public Criteria andCItemNumberLessThanOrEqualTo(String value) {
            addCriterion("C_ITEM_NUMBER <=", value, "cItemNumber");
            return (Criteria) this;
        }

        public Criteria andCItemNumberLike(String value) {
            addCriterion("C_ITEM_NUMBER like", value, "cItemNumber");
            return (Criteria) this;
        }

        public Criteria andCItemNumberNotLike(String value) {
            addCriterion("C_ITEM_NUMBER not like", value, "cItemNumber");
            return (Criteria) this;
        }

        public Criteria andCItemNumberIn(List<String> values) {
            addCriterion("C_ITEM_NUMBER in", values, "cItemNumber");
            return (Criteria) this;
        }

        public Criteria andCItemNumberNotIn(List<String> values) {
            addCriterion("C_ITEM_NUMBER not in", values, "cItemNumber");
            return (Criteria) this;
        }

        public Criteria andCItemNumberBetween(String value1, String value2) {
            addCriterion("C_ITEM_NUMBER between", value1, value2, "cItemNumber");
            return (Criteria) this;
        }

        public Criteria andCItemNumberNotBetween(String value1, String value2) {
            addCriterion("C_ITEM_NUMBER not between", value1, value2, "cItemNumber");
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

        public Criteria andApprovalRoutingIsNull() {
            addCriterion("APPROVAL_ROUTING is null");
            return (Criteria) this;
        }

        public Criteria andApprovalRoutingIsNotNull() {
            addCriterion("APPROVAL_ROUTING is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalRoutingEqualTo(String value) {
            addCriterion("APPROVAL_ROUTING =", value, "approvalRouting");
            return (Criteria) this;
        }

        public Criteria andApprovalRoutingNotEqualTo(String value) {
            addCriterion("APPROVAL_ROUTING <>", value, "approvalRouting");
            return (Criteria) this;
        }

        public Criteria andApprovalRoutingGreaterThan(String value) {
            addCriterion("APPROVAL_ROUTING >", value, "approvalRouting");
            return (Criteria) this;
        }

        public Criteria andApprovalRoutingGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVAL_ROUTING >=", value, "approvalRouting");
            return (Criteria) this;
        }

        public Criteria andApprovalRoutingLessThan(String value) {
            addCriterion("APPROVAL_ROUTING <", value, "approvalRouting");
            return (Criteria) this;
        }

        public Criteria andApprovalRoutingLessThanOrEqualTo(String value) {
            addCriterion("APPROVAL_ROUTING <=", value, "approvalRouting");
            return (Criteria) this;
        }

        public Criteria andApprovalRoutingLike(String value) {
            addCriterion("APPROVAL_ROUTING like", value, "approvalRouting");
            return (Criteria) this;
        }

        public Criteria andApprovalRoutingNotLike(String value) {
            addCriterion("APPROVAL_ROUTING not like", value, "approvalRouting");
            return (Criteria) this;
        }

        public Criteria andApprovalRoutingIn(List<String> values) {
            addCriterion("APPROVAL_ROUTING in", values, "approvalRouting");
            return (Criteria) this;
        }

        public Criteria andApprovalRoutingNotIn(List<String> values) {
            addCriterion("APPROVAL_ROUTING not in", values, "approvalRouting");
            return (Criteria) this;
        }

        public Criteria andApprovalRoutingBetween(String value1, String value2) {
            addCriterion("APPROVAL_ROUTING between", value1, value2, "approvalRouting");
            return (Criteria) this;
        }

        public Criteria andApprovalRoutingNotBetween(String value1, String value2) {
            addCriterion("APPROVAL_ROUTING not between", value1, value2, "approvalRouting");
            return (Criteria) this;
        }

        public Criteria andCQuotesIsNull() {
            addCriterion("C_QUOTES is null");
            return (Criteria) this;
        }

        public Criteria andCQuotesIsNotNull() {
            addCriterion("C_QUOTES is not null");
            return (Criteria) this;
        }

        public Criteria andCQuotesEqualTo(String value) {
            addCriterion("C_QUOTES =", value, "cQuotes");
            return (Criteria) this;
        }

        public Criteria andCQuotesNotEqualTo(String value) {
            addCriterion("C_QUOTES <>", value, "cQuotes");
            return (Criteria) this;
        }

        public Criteria andCQuotesGreaterThan(String value) {
            addCriterion("C_QUOTES >", value, "cQuotes");
            return (Criteria) this;
        }

        public Criteria andCQuotesGreaterThanOrEqualTo(String value) {
            addCriterion("C_QUOTES >=", value, "cQuotes");
            return (Criteria) this;
        }

        public Criteria andCQuotesLessThan(String value) {
            addCriterion("C_QUOTES <", value, "cQuotes");
            return (Criteria) this;
        }

        public Criteria andCQuotesLessThanOrEqualTo(String value) {
            addCriterion("C_QUOTES <=", value, "cQuotes");
            return (Criteria) this;
        }

        public Criteria andCQuotesLike(String value) {
            addCriterion("C_QUOTES like", value, "cQuotes");
            return (Criteria) this;
        }

        public Criteria andCQuotesNotLike(String value) {
            addCriterion("C_QUOTES not like", value, "cQuotes");
            return (Criteria) this;
        }

        public Criteria andCQuotesIn(List<String> values) {
            addCriterion("C_QUOTES in", values, "cQuotes");
            return (Criteria) this;
        }

        public Criteria andCQuotesNotIn(List<String> values) {
            addCriterion("C_QUOTES not in", values, "cQuotes");
            return (Criteria) this;
        }

        public Criteria andCQuotesBetween(String value1, String value2) {
            addCriterion("C_QUOTES between", value1, value2, "cQuotes");
            return (Criteria) this;
        }

        public Criteria andCQuotesNotBetween(String value1, String value2) {
            addCriterion("C_QUOTES not between", value1, value2, "cQuotes");
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

        public Criteria andCProdTypeC2IsNull() {
            addCriterion("C_PROD_TYPE_C2 is null");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC2IsNotNull() {
            addCriterion("C_PROD_TYPE_C2 is not null");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC2EqualTo(String value) {
            addCriterion("C_PROD_TYPE_C2 =", value, "cProdTypeC2");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC2NotEqualTo(String value) {
            addCriterion("C_PROD_TYPE_C2 <>", value, "cProdTypeC2");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC2GreaterThan(String value) {
            addCriterion("C_PROD_TYPE_C2 >", value, "cProdTypeC2");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC2GreaterThanOrEqualTo(String value) {
            addCriterion("C_PROD_TYPE_C2 >=", value, "cProdTypeC2");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC2LessThan(String value) {
            addCriterion("C_PROD_TYPE_C2 <", value, "cProdTypeC2");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC2LessThanOrEqualTo(String value) {
            addCriterion("C_PROD_TYPE_C2 <=", value, "cProdTypeC2");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC2Like(String value) {
            addCriterion("C_PROD_TYPE_C2 like", value, "cProdTypeC2");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC2NotLike(String value) {
            addCriterion("C_PROD_TYPE_C2 not like", value, "cProdTypeC2");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC2In(List<String> values) {
            addCriterion("C_PROD_TYPE_C2 in", values, "cProdTypeC2");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC2NotIn(List<String> values) {
            addCriterion("C_PROD_TYPE_C2 not in", values, "cProdTypeC2");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC2Between(String value1, String value2) {
            addCriterion("C_PROD_TYPE_C2 between", value1, value2, "cProdTypeC2");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC2NotBetween(String value1, String value2) {
            addCriterion("C_PROD_TYPE_C2 not between", value1, value2, "cProdTypeC2");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedIsNull() {
            addCriterion("C_QUOTES_CREATED is null");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedIsNotNull() {
            addCriterion("C_QUOTES_CREATED is not null");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedEqualTo(String value) {
            addCriterion("C_QUOTES_CREATED =", value, "cQuotesCreated");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedNotEqualTo(String value) {
            addCriterion("C_QUOTES_CREATED <>", value, "cQuotesCreated");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedGreaterThan(String value) {
            addCriterion("C_QUOTES_CREATED >", value, "cQuotesCreated");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedGreaterThanOrEqualTo(String value) {
            addCriterion("C_QUOTES_CREATED >=", value, "cQuotesCreated");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedLessThan(String value) {
            addCriterion("C_QUOTES_CREATED <", value, "cQuotesCreated");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedLessThanOrEqualTo(String value) {
            addCriterion("C_QUOTES_CREATED <=", value, "cQuotesCreated");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedLike(String value) {
            addCriterion("C_QUOTES_CREATED like", value, "cQuotesCreated");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedNotLike(String value) {
            addCriterion("C_QUOTES_CREATED not like", value, "cQuotesCreated");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedIn(List<String> values) {
            addCriterion("C_QUOTES_CREATED in", values, "cQuotesCreated");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedNotIn(List<String> values) {
            addCriterion("C_QUOTES_CREATED not in", values, "cQuotesCreated");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedBetween(String value1, String value2) {
            addCriterion("C_QUOTES_CREATED between", value1, value2, "cQuotesCreated");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedNotBetween(String value1, String value2) {
            addCriterion("C_QUOTES_CREATED not between", value1, value2, "cQuotesCreated");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedOnIsNull() {
            addCriterion("C_QUOTES_CREATED_ON is null");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedOnIsNotNull() {
            addCriterion("C_QUOTES_CREATED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedOnEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTES_CREATED_ON =", value, "cQuotesCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTES_CREATED_ON <>", value, "cQuotesCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedOnGreaterThan(Date value) {
            addCriterionForJDBCDate("C_QUOTES_CREATED_ON >", value, "cQuotesCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTES_CREATED_ON >=", value, "cQuotesCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedOnLessThan(Date value) {
            addCriterionForJDBCDate("C_QUOTES_CREATED_ON <", value, "cQuotesCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTES_CREATED_ON <=", value, "cQuotesCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedOnIn(List<Date> values) {
            addCriterionForJDBCDate("C_QUOTES_CREATED_ON in", values, "cQuotesCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_QUOTES_CREATED_ON not in", values, "cQuotesCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_QUOTES_CREATED_ON between", value1, value2, "cQuotesCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_QUOTES_CREATED_ON not between", value1, value2, "cQuotesCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedByIsNull() {
            addCriterion("C_QUOTES_CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedByIsNotNull() {
            addCriterion("C_QUOTES_CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedByEqualTo(String value) {
            addCriterion("C_QUOTES_CREATED_BY =", value, "cQuotesCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedByNotEqualTo(String value) {
            addCriterion("C_QUOTES_CREATED_BY <>", value, "cQuotesCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedByGreaterThan(String value) {
            addCriterion("C_QUOTES_CREATED_BY >", value, "cQuotesCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("C_QUOTES_CREATED_BY >=", value, "cQuotesCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedByLessThan(String value) {
            addCriterion("C_QUOTES_CREATED_BY <", value, "cQuotesCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedByLessThanOrEqualTo(String value) {
            addCriterion("C_QUOTES_CREATED_BY <=", value, "cQuotesCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedByLike(String value) {
            addCriterion("C_QUOTES_CREATED_BY like", value, "cQuotesCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedByNotLike(String value) {
            addCriterion("C_QUOTES_CREATED_BY not like", value, "cQuotesCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedByIn(List<String> values) {
            addCriterion("C_QUOTES_CREATED_BY in", values, "cQuotesCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedByNotIn(List<String> values) {
            addCriterion("C_QUOTES_CREATED_BY not in", values, "cQuotesCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedByBetween(String value1, String value2) {
            addCriterion("C_QUOTES_CREATED_BY between", value1, value2, "cQuotesCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesCreatedByNotBetween(String value1, String value2) {
            addCriterion("C_QUOTES_CREATED_BY not between", value1, value2, "cQuotesCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedIsNull() {
            addCriterion("C_QUOTES_VERIFYED is null");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedIsNotNull() {
            addCriterion("C_QUOTES_VERIFYED is not null");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedEqualTo(String value) {
            addCriterion("C_QUOTES_VERIFYED =", value, "cQuotesVerifyed");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedNotEqualTo(String value) {
            addCriterion("C_QUOTES_VERIFYED <>", value, "cQuotesVerifyed");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedGreaterThan(String value) {
            addCriterion("C_QUOTES_VERIFYED >", value, "cQuotesVerifyed");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedGreaterThanOrEqualTo(String value) {
            addCriterion("C_QUOTES_VERIFYED >=", value, "cQuotesVerifyed");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedLessThan(String value) {
            addCriterion("C_QUOTES_VERIFYED <", value, "cQuotesVerifyed");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedLessThanOrEqualTo(String value) {
            addCriterion("C_QUOTES_VERIFYED <=", value, "cQuotesVerifyed");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedLike(String value) {
            addCriterion("C_QUOTES_VERIFYED like", value, "cQuotesVerifyed");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedNotLike(String value) {
            addCriterion("C_QUOTES_VERIFYED not like", value, "cQuotesVerifyed");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedIn(List<String> values) {
            addCriterion("C_QUOTES_VERIFYED in", values, "cQuotesVerifyed");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedNotIn(List<String> values) {
            addCriterion("C_QUOTES_VERIFYED not in", values, "cQuotesVerifyed");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedBetween(String value1, String value2) {
            addCriterion("C_QUOTES_VERIFYED between", value1, value2, "cQuotesVerifyed");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedNotBetween(String value1, String value2) {
            addCriterion("C_QUOTES_VERIFYED not between", value1, value2, "cQuotesVerifyed");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedOnIsNull() {
            addCriterion("C_QUOTES_VERIFYED_ON is null");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedOnIsNotNull() {
            addCriterion("C_QUOTES_VERIFYED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedOnEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTES_VERIFYED_ON =", value, "cQuotesVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTES_VERIFYED_ON <>", value, "cQuotesVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedOnGreaterThan(Date value) {
            addCriterionForJDBCDate("C_QUOTES_VERIFYED_ON >", value, "cQuotesVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTES_VERIFYED_ON >=", value, "cQuotesVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedOnLessThan(Date value) {
            addCriterionForJDBCDate("C_QUOTES_VERIFYED_ON <", value, "cQuotesVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTES_VERIFYED_ON <=", value, "cQuotesVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedOnIn(List<Date> values) {
            addCriterionForJDBCDate("C_QUOTES_VERIFYED_ON in", values, "cQuotesVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_QUOTES_VERIFYED_ON not in", values, "cQuotesVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_QUOTES_VERIFYED_ON between", value1, value2, "cQuotesVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_QUOTES_VERIFYED_ON not between", value1, value2, "cQuotesVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedByIsNull() {
            addCriterion("C_QUOTES_VERIFYED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedByIsNotNull() {
            addCriterion("C_QUOTES_VERIFYED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedByEqualTo(String value) {
            addCriterion("C_QUOTES_VERIFYED_BY =", value, "cQuotesVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedByNotEqualTo(String value) {
            addCriterion("C_QUOTES_VERIFYED_BY <>", value, "cQuotesVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedByGreaterThan(String value) {
            addCriterion("C_QUOTES_VERIFYED_BY >", value, "cQuotesVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedByGreaterThanOrEqualTo(String value) {
            addCriterion("C_QUOTES_VERIFYED_BY >=", value, "cQuotesVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedByLessThan(String value) {
            addCriterion("C_QUOTES_VERIFYED_BY <", value, "cQuotesVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedByLessThanOrEqualTo(String value) {
            addCriterion("C_QUOTES_VERIFYED_BY <=", value, "cQuotesVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedByLike(String value) {
            addCriterion("C_QUOTES_VERIFYED_BY like", value, "cQuotesVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedByNotLike(String value) {
            addCriterion("C_QUOTES_VERIFYED_BY not like", value, "cQuotesVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedByIn(List<String> values) {
            addCriterion("C_QUOTES_VERIFYED_BY in", values, "cQuotesVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedByNotIn(List<String> values) {
            addCriterion("C_QUOTES_VERIFYED_BY not in", values, "cQuotesVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedByBetween(String value1, String value2) {
            addCriterion("C_QUOTES_VERIFYED_BY between", value1, value2, "cQuotesVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesVerifyedByNotBetween(String value1, String value2) {
            addCriterion("C_QUOTES_VERIFYED_BY not between", value1, value2, "cQuotesVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedByIsNull() {
            addCriterion("C_RPT_AUTHORIZED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedByIsNotNull() {
            addCriterion("C_RPT_AUTHORIZED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedByEqualTo(String value) {
            addCriterion("C_RPT_AUTHORIZED_BY =", value, "cRptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedByNotEqualTo(String value) {
            addCriterion("C_RPT_AUTHORIZED_BY <>", value, "cRptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedByGreaterThan(String value) {
            addCriterion("C_RPT_AUTHORIZED_BY >", value, "cRptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedByGreaterThanOrEqualTo(String value) {
            addCriterion("C_RPT_AUTHORIZED_BY >=", value, "cRptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedByLessThan(String value) {
            addCriterion("C_RPT_AUTHORIZED_BY <", value, "cRptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedByLessThanOrEqualTo(String value) {
            addCriterion("C_RPT_AUTHORIZED_BY <=", value, "cRptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedByLike(String value) {
            addCriterion("C_RPT_AUTHORIZED_BY like", value, "cRptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedByNotLike(String value) {
            addCriterion("C_RPT_AUTHORIZED_BY not like", value, "cRptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedByIn(List<String> values) {
            addCriterion("C_RPT_AUTHORIZED_BY in", values, "cRptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedByNotIn(List<String> values) {
            addCriterion("C_RPT_AUTHORIZED_BY not in", values, "cRptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedByBetween(String value1, String value2) {
            addCriterion("C_RPT_AUTHORIZED_BY between", value1, value2, "cRptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedByNotBetween(String value1, String value2) {
            addCriterion("C_RPT_AUTHORIZED_BY not between", value1, value2, "cRptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedOnIsNull() {
            addCriterion("C_RPT_AUTHORIZED_ON is null");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedOnIsNotNull() {
            addCriterion("C_RPT_AUTHORIZED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedOnEqualTo(Date value) {
            addCriterionForJDBCDate("C_RPT_AUTHORIZED_ON =", value, "cRptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_RPT_AUTHORIZED_ON <>", value, "cRptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedOnGreaterThan(Date value) {
            addCriterionForJDBCDate("C_RPT_AUTHORIZED_ON >", value, "cRptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_RPT_AUTHORIZED_ON >=", value, "cRptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedOnLessThan(Date value) {
            addCriterionForJDBCDate("C_RPT_AUTHORIZED_ON <", value, "cRptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_RPT_AUTHORIZED_ON <=", value, "cRptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedOnIn(List<Date> values) {
            addCriterionForJDBCDate("C_RPT_AUTHORIZED_ON in", values, "cRptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_RPT_AUTHORIZED_ON not in", values, "cRptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_RPT_AUTHORIZED_ON between", value1, value2, "cRptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_RPT_AUTHORIZED_ON not between", value1, value2, "cRptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andCPriorityLevelIsNull() {
            addCriterion("C_PRIORITY_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCPriorityLevelIsNotNull() {
            addCriterion("C_PRIORITY_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCPriorityLevelEqualTo(Long value) {
            addCriterion("C_PRIORITY_LEVEL =", value, "cPriorityLevel");
            return (Criteria) this;
        }

        public Criteria andCPriorityLevelNotEqualTo(Long value) {
            addCriterion("C_PRIORITY_LEVEL <>", value, "cPriorityLevel");
            return (Criteria) this;
        }

        public Criteria andCPriorityLevelGreaterThan(Long value) {
            addCriterion("C_PRIORITY_LEVEL >", value, "cPriorityLevel");
            return (Criteria) this;
        }

        public Criteria andCPriorityLevelGreaterThanOrEqualTo(Long value) {
            addCriterion("C_PRIORITY_LEVEL >=", value, "cPriorityLevel");
            return (Criteria) this;
        }

        public Criteria andCPriorityLevelLessThan(Long value) {
            addCriterion("C_PRIORITY_LEVEL <", value, "cPriorityLevel");
            return (Criteria) this;
        }

        public Criteria andCPriorityLevelLessThanOrEqualTo(Long value) {
            addCriterion("C_PRIORITY_LEVEL <=", value, "cPriorityLevel");
            return (Criteria) this;
        }

        public Criteria andCPriorityLevelIn(List<Long> values) {
            addCriterion("C_PRIORITY_LEVEL in", values, "cPriorityLevel");
            return (Criteria) this;
        }

        public Criteria andCPriorityLevelNotIn(List<Long> values) {
            addCriterion("C_PRIORITY_LEVEL not in", values, "cPriorityLevel");
            return (Criteria) this;
        }

        public Criteria andCPriorityLevelBetween(Long value1, Long value2) {
            addCriterion("C_PRIORITY_LEVEL between", value1, value2, "cPriorityLevel");
            return (Criteria) this;
        }

        public Criteria andCPriorityLevelNotBetween(Long value1, Long value2) {
            addCriterion("C_PRIORITY_LEVEL not between", value1, value2, "cPriorityLevel");
            return (Criteria) this;
        }

        public Criteria andCUserDepartmentIsNull() {
            addCriterion("C_USER_DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andCUserDepartmentIsNotNull() {
            addCriterion("C_USER_DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCUserDepartmentEqualTo(String value) {
            addCriterion("C_USER_DEPARTMENT =", value, "cUserDepartment");
            return (Criteria) this;
        }

        public Criteria andCUserDepartmentNotEqualTo(String value) {
            addCriterion("C_USER_DEPARTMENT <>", value, "cUserDepartment");
            return (Criteria) this;
        }

        public Criteria andCUserDepartmentGreaterThan(String value) {
            addCriterion("C_USER_DEPARTMENT >", value, "cUserDepartment");
            return (Criteria) this;
        }

        public Criteria andCUserDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("C_USER_DEPARTMENT >=", value, "cUserDepartment");
            return (Criteria) this;
        }

        public Criteria andCUserDepartmentLessThan(String value) {
            addCriterion("C_USER_DEPARTMENT <", value, "cUserDepartment");
            return (Criteria) this;
        }

        public Criteria andCUserDepartmentLessThanOrEqualTo(String value) {
            addCriterion("C_USER_DEPARTMENT <=", value, "cUserDepartment");
            return (Criteria) this;
        }

        public Criteria andCUserDepartmentLike(String value) {
            addCriterion("C_USER_DEPARTMENT like", value, "cUserDepartment");
            return (Criteria) this;
        }

        public Criteria andCUserDepartmentNotLike(String value) {
            addCriterion("C_USER_DEPARTMENT not like", value, "cUserDepartment");
            return (Criteria) this;
        }

        public Criteria andCUserDepartmentIn(List<String> values) {
            addCriterion("C_USER_DEPARTMENT in", values, "cUserDepartment");
            return (Criteria) this;
        }

        public Criteria andCUserDepartmentNotIn(List<String> values) {
            addCriterion("C_USER_DEPARTMENT not in", values, "cUserDepartment");
            return (Criteria) this;
        }

        public Criteria andCUserDepartmentBetween(String value1, String value2) {
            addCriterion("C_USER_DEPARTMENT between", value1, value2, "cUserDepartment");
            return (Criteria) this;
        }

        public Criteria andCUserDepartmentNotBetween(String value1, String value2) {
            addCriterion("C_USER_DEPARTMENT not between", value1, value2, "cUserDepartment");
            return (Criteria) this;
        }

        public Criteria andCMailLabApprovalIsNull() {
            addCriterion("C_MAIL_LAB_APPROVAL is null");
            return (Criteria) this;
        }

        public Criteria andCMailLabApprovalIsNotNull() {
            addCriterion("C_MAIL_LAB_APPROVAL is not null");
            return (Criteria) this;
        }

        public Criteria andCMailLabApprovalEqualTo(String value) {
            addCriterion("C_MAIL_LAB_APPROVAL =", value, "cMailLabApproval");
            return (Criteria) this;
        }

        public Criteria andCMailLabApprovalNotEqualTo(String value) {
            addCriterion("C_MAIL_LAB_APPROVAL <>", value, "cMailLabApproval");
            return (Criteria) this;
        }

        public Criteria andCMailLabApprovalGreaterThan(String value) {
            addCriterion("C_MAIL_LAB_APPROVAL >", value, "cMailLabApproval");
            return (Criteria) this;
        }

        public Criteria andCMailLabApprovalGreaterThanOrEqualTo(String value) {
            addCriterion("C_MAIL_LAB_APPROVAL >=", value, "cMailLabApproval");
            return (Criteria) this;
        }

        public Criteria andCMailLabApprovalLessThan(String value) {
            addCriterion("C_MAIL_LAB_APPROVAL <", value, "cMailLabApproval");
            return (Criteria) this;
        }

        public Criteria andCMailLabApprovalLessThanOrEqualTo(String value) {
            addCriterion("C_MAIL_LAB_APPROVAL <=", value, "cMailLabApproval");
            return (Criteria) this;
        }

        public Criteria andCMailLabApprovalLike(String value) {
            addCriterion("C_MAIL_LAB_APPROVAL like", value, "cMailLabApproval");
            return (Criteria) this;
        }

        public Criteria andCMailLabApprovalNotLike(String value) {
            addCriterion("C_MAIL_LAB_APPROVAL not like", value, "cMailLabApproval");
            return (Criteria) this;
        }

        public Criteria andCMailLabApprovalIn(List<String> values) {
            addCriterion("C_MAIL_LAB_APPROVAL in", values, "cMailLabApproval");
            return (Criteria) this;
        }

        public Criteria andCMailLabApprovalNotIn(List<String> values) {
            addCriterion("C_MAIL_LAB_APPROVAL not in", values, "cMailLabApproval");
            return (Criteria) this;
        }

        public Criteria andCMailLabApprovalBetween(String value1, String value2) {
            addCriterion("C_MAIL_LAB_APPROVAL between", value1, value2, "cMailLabApproval");
            return (Criteria) this;
        }

        public Criteria andCMailLabApprovalNotBetween(String value1, String value2) {
            addCriterion("C_MAIL_LAB_APPROVAL not between", value1, value2, "cMailLabApproval");
            return (Criteria) this;
        }

        public Criteria andCMailTaskStartIsNull() {
            addCriterion("C_MAIL_TASK_START is null");
            return (Criteria) this;
        }

        public Criteria andCMailTaskStartIsNotNull() {
            addCriterion("C_MAIL_TASK_START is not null");
            return (Criteria) this;
        }

        public Criteria andCMailTaskStartEqualTo(String value) {
            addCriterion("C_MAIL_TASK_START =", value, "cMailTaskStart");
            return (Criteria) this;
        }

        public Criteria andCMailTaskStartNotEqualTo(String value) {
            addCriterion("C_MAIL_TASK_START <>", value, "cMailTaskStart");
            return (Criteria) this;
        }

        public Criteria andCMailTaskStartGreaterThan(String value) {
            addCriterion("C_MAIL_TASK_START >", value, "cMailTaskStart");
            return (Criteria) this;
        }

        public Criteria andCMailTaskStartGreaterThanOrEqualTo(String value) {
            addCriterion("C_MAIL_TASK_START >=", value, "cMailTaskStart");
            return (Criteria) this;
        }

        public Criteria andCMailTaskStartLessThan(String value) {
            addCriterion("C_MAIL_TASK_START <", value, "cMailTaskStart");
            return (Criteria) this;
        }

        public Criteria andCMailTaskStartLessThanOrEqualTo(String value) {
            addCriterion("C_MAIL_TASK_START <=", value, "cMailTaskStart");
            return (Criteria) this;
        }

        public Criteria andCMailTaskStartLike(String value) {
            addCriterion("C_MAIL_TASK_START like", value, "cMailTaskStart");
            return (Criteria) this;
        }

        public Criteria andCMailTaskStartNotLike(String value) {
            addCriterion("C_MAIL_TASK_START not like", value, "cMailTaskStart");
            return (Criteria) this;
        }

        public Criteria andCMailTaskStartIn(List<String> values) {
            addCriterion("C_MAIL_TASK_START in", values, "cMailTaskStart");
            return (Criteria) this;
        }

        public Criteria andCMailTaskStartNotIn(List<String> values) {
            addCriterion("C_MAIL_TASK_START not in", values, "cMailTaskStart");
            return (Criteria) this;
        }

        public Criteria andCMailTaskStartBetween(String value1, String value2) {
            addCriterion("C_MAIL_TASK_START between", value1, value2, "cMailTaskStart");
            return (Criteria) this;
        }

        public Criteria andCMailTaskStartNotBetween(String value1, String value2) {
            addCriterion("C_MAIL_TASK_START not between", value1, value2, "cMailTaskStart");
            return (Criteria) this;
        }

        public Criteria andCMailTaskEndIsNull() {
            addCriterion("C_MAIL_TASK_END is null");
            return (Criteria) this;
        }

        public Criteria andCMailTaskEndIsNotNull() {
            addCriterion("C_MAIL_TASK_END is not null");
            return (Criteria) this;
        }

        public Criteria andCMailTaskEndEqualTo(String value) {
            addCriterion("C_MAIL_TASK_END =", value, "cMailTaskEnd");
            return (Criteria) this;
        }

        public Criteria andCMailTaskEndNotEqualTo(String value) {
            addCriterion("C_MAIL_TASK_END <>", value, "cMailTaskEnd");
            return (Criteria) this;
        }

        public Criteria andCMailTaskEndGreaterThan(String value) {
            addCriterion("C_MAIL_TASK_END >", value, "cMailTaskEnd");
            return (Criteria) this;
        }

        public Criteria andCMailTaskEndGreaterThanOrEqualTo(String value) {
            addCriterion("C_MAIL_TASK_END >=", value, "cMailTaskEnd");
            return (Criteria) this;
        }

        public Criteria andCMailTaskEndLessThan(String value) {
            addCriterion("C_MAIL_TASK_END <", value, "cMailTaskEnd");
            return (Criteria) this;
        }

        public Criteria andCMailTaskEndLessThanOrEqualTo(String value) {
            addCriterion("C_MAIL_TASK_END <=", value, "cMailTaskEnd");
            return (Criteria) this;
        }

        public Criteria andCMailTaskEndLike(String value) {
            addCriterion("C_MAIL_TASK_END like", value, "cMailTaskEnd");
            return (Criteria) this;
        }

        public Criteria andCMailTaskEndNotLike(String value) {
            addCriterion("C_MAIL_TASK_END not like", value, "cMailTaskEnd");
            return (Criteria) this;
        }

        public Criteria andCMailTaskEndIn(List<String> values) {
            addCriterion("C_MAIL_TASK_END in", values, "cMailTaskEnd");
            return (Criteria) this;
        }

        public Criteria andCMailTaskEndNotIn(List<String> values) {
            addCriterion("C_MAIL_TASK_END not in", values, "cMailTaskEnd");
            return (Criteria) this;
        }

        public Criteria andCMailTaskEndBetween(String value1, String value2) {
            addCriterion("C_MAIL_TASK_END between", value1, value2, "cMailTaskEnd");
            return (Criteria) this;
        }

        public Criteria andCMailTaskEndNotBetween(String value1, String value2) {
            addCriterion("C_MAIL_TASK_END not between", value1, value2, "cMailTaskEnd");
            return (Criteria) this;
        }

        public Criteria andCMailCoaSignIsNull() {
            addCriterion("C_MAIL_COA_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andCMailCoaSignIsNotNull() {
            addCriterion("C_MAIL_COA_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andCMailCoaSignEqualTo(String value) {
            addCriterion("C_MAIL_COA_SIGN =", value, "cMailCoaSign");
            return (Criteria) this;
        }

        public Criteria andCMailCoaSignNotEqualTo(String value) {
            addCriterion("C_MAIL_COA_SIGN <>", value, "cMailCoaSign");
            return (Criteria) this;
        }

        public Criteria andCMailCoaSignGreaterThan(String value) {
            addCriterion("C_MAIL_COA_SIGN >", value, "cMailCoaSign");
            return (Criteria) this;
        }

        public Criteria andCMailCoaSignGreaterThanOrEqualTo(String value) {
            addCriterion("C_MAIL_COA_SIGN >=", value, "cMailCoaSign");
            return (Criteria) this;
        }

        public Criteria andCMailCoaSignLessThan(String value) {
            addCriterion("C_MAIL_COA_SIGN <", value, "cMailCoaSign");
            return (Criteria) this;
        }

        public Criteria andCMailCoaSignLessThanOrEqualTo(String value) {
            addCriterion("C_MAIL_COA_SIGN <=", value, "cMailCoaSign");
            return (Criteria) this;
        }

        public Criteria andCMailCoaSignLike(String value) {
            addCriterion("C_MAIL_COA_SIGN like", value, "cMailCoaSign");
            return (Criteria) this;
        }

        public Criteria andCMailCoaSignNotLike(String value) {
            addCriterion("C_MAIL_COA_SIGN not like", value, "cMailCoaSign");
            return (Criteria) this;
        }

        public Criteria andCMailCoaSignIn(List<String> values) {
            addCriterion("C_MAIL_COA_SIGN in", values, "cMailCoaSign");
            return (Criteria) this;
        }

        public Criteria andCMailCoaSignNotIn(List<String> values) {
            addCriterion("C_MAIL_COA_SIGN not in", values, "cMailCoaSign");
            return (Criteria) this;
        }

        public Criteria andCMailCoaSignBetween(String value1, String value2) {
            addCriterion("C_MAIL_COA_SIGN between", value1, value2, "cMailCoaSign");
            return (Criteria) this;
        }

        public Criteria andCMailCoaSignNotBetween(String value1, String value2) {
            addCriterion("C_MAIL_COA_SIGN not between", value1, value2, "cMailCoaSign");
            return (Criteria) this;
        }

        public Criteria andCIsTemplateIsNull() {
            addCriterion("C_IS_TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andCIsTemplateIsNotNull() {
            addCriterion("C_IS_TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andCIsTemplateEqualTo(String value) {
            addCriterion("C_IS_TEMPLATE =", value, "cIsTemplate");
            return (Criteria) this;
        }

        public Criteria andCIsTemplateNotEqualTo(String value) {
            addCriterion("C_IS_TEMPLATE <>", value, "cIsTemplate");
            return (Criteria) this;
        }

        public Criteria andCIsTemplateGreaterThan(String value) {
            addCriterion("C_IS_TEMPLATE >", value, "cIsTemplate");
            return (Criteria) this;
        }

        public Criteria andCIsTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("C_IS_TEMPLATE >=", value, "cIsTemplate");
            return (Criteria) this;
        }

        public Criteria andCIsTemplateLessThan(String value) {
            addCriterion("C_IS_TEMPLATE <", value, "cIsTemplate");
            return (Criteria) this;
        }

        public Criteria andCIsTemplateLessThanOrEqualTo(String value) {
            addCriterion("C_IS_TEMPLATE <=", value, "cIsTemplate");
            return (Criteria) this;
        }

        public Criteria andCIsTemplateLike(String value) {
            addCriterion("C_IS_TEMPLATE like", value, "cIsTemplate");
            return (Criteria) this;
        }

        public Criteria andCIsTemplateNotLike(String value) {
            addCriterion("C_IS_TEMPLATE not like", value, "cIsTemplate");
            return (Criteria) this;
        }

        public Criteria andCIsTemplateIn(List<String> values) {
            addCriterion("C_IS_TEMPLATE in", values, "cIsTemplate");
            return (Criteria) this;
        }

        public Criteria andCIsTemplateNotIn(List<String> values) {
            addCriterion("C_IS_TEMPLATE not in", values, "cIsTemplate");
            return (Criteria) this;
        }

        public Criteria andCIsTemplateBetween(String value1, String value2) {
            addCriterion("C_IS_TEMPLATE between", value1, value2, "cIsTemplate");
            return (Criteria) this;
        }

        public Criteria andCIsTemplateNotBetween(String value1, String value2) {
            addCriterion("C_IS_TEMPLATE not between", value1, value2, "cIsTemplate");
            return (Criteria) this;
        }

        public Criteria andCTotalChargeIsNull() {
            addCriterion("C_TOTAL_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andCTotalChargeIsNotNull() {
            addCriterion("C_TOTAL_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andCTotalChargeEqualTo(BigDecimal value) {
            addCriterion("C_TOTAL_CHARGE =", value, "cTotalCharge");
            return (Criteria) this;
        }

        public Criteria andCTotalChargeNotEqualTo(BigDecimal value) {
            addCriterion("C_TOTAL_CHARGE <>", value, "cTotalCharge");
            return (Criteria) this;
        }

        public Criteria andCTotalChargeGreaterThan(BigDecimal value) {
            addCriterion("C_TOTAL_CHARGE >", value, "cTotalCharge");
            return (Criteria) this;
        }

        public Criteria andCTotalChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("C_TOTAL_CHARGE >=", value, "cTotalCharge");
            return (Criteria) this;
        }

        public Criteria andCTotalChargeLessThan(BigDecimal value) {
            addCriterion("C_TOTAL_CHARGE <", value, "cTotalCharge");
            return (Criteria) this;
        }

        public Criteria andCTotalChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("C_TOTAL_CHARGE <=", value, "cTotalCharge");
            return (Criteria) this;
        }

        public Criteria andCTotalChargeIn(List<BigDecimal> values) {
            addCriterion("C_TOTAL_CHARGE in", values, "cTotalCharge");
            return (Criteria) this;
        }

        public Criteria andCTotalChargeNotIn(List<BigDecimal> values) {
            addCriterion("C_TOTAL_CHARGE not in", values, "cTotalCharge");
            return (Criteria) this;
        }

        public Criteria andCTotalChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("C_TOTAL_CHARGE between", value1, value2, "cTotalCharge");
            return (Criteria) this;
        }

        public Criteria andCTotalChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("C_TOTAL_CHARGE not between", value1, value2, "cTotalCharge");
            return (Criteria) this;
        }

        public Criteria andHasAnswerSetIsNull() {
            addCriterion("HAS_ANSWER_SET is null");
            return (Criteria) this;
        }

        public Criteria andHasAnswerSetIsNotNull() {
            addCriterion("HAS_ANSWER_SET is not null");
            return (Criteria) this;
        }

        public Criteria andHasAnswerSetEqualTo(String value) {
            addCriterion("HAS_ANSWER_SET =", value, "hasAnswerSet");
            return (Criteria) this;
        }

        public Criteria andHasAnswerSetNotEqualTo(String value) {
            addCriterion("HAS_ANSWER_SET <>", value, "hasAnswerSet");
            return (Criteria) this;
        }

        public Criteria andHasAnswerSetGreaterThan(String value) {
            addCriterion("HAS_ANSWER_SET >", value, "hasAnswerSet");
            return (Criteria) this;
        }

        public Criteria andHasAnswerSetGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_ANSWER_SET >=", value, "hasAnswerSet");
            return (Criteria) this;
        }

        public Criteria andHasAnswerSetLessThan(String value) {
            addCriterion("HAS_ANSWER_SET <", value, "hasAnswerSet");
            return (Criteria) this;
        }

        public Criteria andHasAnswerSetLessThanOrEqualTo(String value) {
            addCriterion("HAS_ANSWER_SET <=", value, "hasAnswerSet");
            return (Criteria) this;
        }

        public Criteria andHasAnswerSetLike(String value) {
            addCriterion("HAS_ANSWER_SET like", value, "hasAnswerSet");
            return (Criteria) this;
        }

        public Criteria andHasAnswerSetNotLike(String value) {
            addCriterion("HAS_ANSWER_SET not like", value, "hasAnswerSet");
            return (Criteria) this;
        }

        public Criteria andHasAnswerSetIn(List<String> values) {
            addCriterion("HAS_ANSWER_SET in", values, "hasAnswerSet");
            return (Criteria) this;
        }

        public Criteria andHasAnswerSetNotIn(List<String> values) {
            addCriterion("HAS_ANSWER_SET not in", values, "hasAnswerSet");
            return (Criteria) this;
        }

        public Criteria andHasAnswerSetBetween(String value1, String value2) {
            addCriterion("HAS_ANSWER_SET between", value1, value2, "hasAnswerSet");
            return (Criteria) this;
        }

        public Criteria andHasAnswerSetNotBetween(String value1, String value2) {
            addCriterion("HAS_ANSWER_SET not between", value1, value2, "hasAnswerSet");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedIsNull() {
            addCriterion("C_RPT_AUTHORIZED is null");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedIsNotNull() {
            addCriterion("C_RPT_AUTHORIZED is not null");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedEqualTo(String value) {
            addCriterion("C_RPT_AUTHORIZED =", value, "cRptAuthorized");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedNotEqualTo(String value) {
            addCriterion("C_RPT_AUTHORIZED <>", value, "cRptAuthorized");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedGreaterThan(String value) {
            addCriterion("C_RPT_AUTHORIZED >", value, "cRptAuthorized");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedGreaterThanOrEqualTo(String value) {
            addCriterion("C_RPT_AUTHORIZED >=", value, "cRptAuthorized");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedLessThan(String value) {
            addCriterion("C_RPT_AUTHORIZED <", value, "cRptAuthorized");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedLessThanOrEqualTo(String value) {
            addCriterion("C_RPT_AUTHORIZED <=", value, "cRptAuthorized");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedLike(String value) {
            addCriterion("C_RPT_AUTHORIZED like", value, "cRptAuthorized");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedNotLike(String value) {
            addCriterion("C_RPT_AUTHORIZED not like", value, "cRptAuthorized");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedIn(List<String> values) {
            addCriterion("C_RPT_AUTHORIZED in", values, "cRptAuthorized");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedNotIn(List<String> values) {
            addCriterion("C_RPT_AUTHORIZED not in", values, "cRptAuthorized");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedBetween(String value1, String value2) {
            addCriterion("C_RPT_AUTHORIZED between", value1, value2, "cRptAuthorized");
            return (Criteria) this;
        }

        public Criteria andCRptAuthorizedNotBetween(String value1, String value2) {
            addCriterion("C_RPT_AUTHORIZED not between", value1, value2, "cRptAuthorized");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedIsNull() {
            addCriterion("C_INVOICE_CREATED is null");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedIsNotNull() {
            addCriterion("C_INVOICE_CREATED is not null");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedEqualTo(String value) {
            addCriterion("C_INVOICE_CREATED =", value, "cInvoiceCreated");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedNotEqualTo(String value) {
            addCriterion("C_INVOICE_CREATED <>", value, "cInvoiceCreated");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedGreaterThan(String value) {
            addCriterion("C_INVOICE_CREATED >", value, "cInvoiceCreated");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedGreaterThanOrEqualTo(String value) {
            addCriterion("C_INVOICE_CREATED >=", value, "cInvoiceCreated");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedLessThan(String value) {
            addCriterion("C_INVOICE_CREATED <", value, "cInvoiceCreated");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedLessThanOrEqualTo(String value) {
            addCriterion("C_INVOICE_CREATED <=", value, "cInvoiceCreated");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedLike(String value) {
            addCriterion("C_INVOICE_CREATED like", value, "cInvoiceCreated");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedNotLike(String value) {
            addCriterion("C_INVOICE_CREATED not like", value, "cInvoiceCreated");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedIn(List<String> values) {
            addCriterion("C_INVOICE_CREATED in", values, "cInvoiceCreated");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedNotIn(List<String> values) {
            addCriterion("C_INVOICE_CREATED not in", values, "cInvoiceCreated");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedBetween(String value1, String value2) {
            addCriterion("C_INVOICE_CREATED between", value1, value2, "cInvoiceCreated");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedNotBetween(String value1, String value2) {
            addCriterion("C_INVOICE_CREATED not between", value1, value2, "cInvoiceCreated");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedOnIsNull() {
            addCriterion("C_INVOICE_CREATED_ON is null");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedOnIsNotNull() {
            addCriterion("C_INVOICE_CREATED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedOnEqualTo(Date value) {
            addCriterionForJDBCDate("C_INVOICE_CREATED_ON =", value, "cInvoiceCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_INVOICE_CREATED_ON <>", value, "cInvoiceCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedOnGreaterThan(Date value) {
            addCriterionForJDBCDate("C_INVOICE_CREATED_ON >", value, "cInvoiceCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_INVOICE_CREATED_ON >=", value, "cInvoiceCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedOnLessThan(Date value) {
            addCriterionForJDBCDate("C_INVOICE_CREATED_ON <", value, "cInvoiceCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_INVOICE_CREATED_ON <=", value, "cInvoiceCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedOnIn(List<Date> values) {
            addCriterionForJDBCDate("C_INVOICE_CREATED_ON in", values, "cInvoiceCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_INVOICE_CREATED_ON not in", values, "cInvoiceCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_INVOICE_CREATED_ON between", value1, value2, "cInvoiceCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_INVOICE_CREATED_ON not between", value1, value2, "cInvoiceCreatedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedByIsNull() {
            addCriterion("C_INVOICE_CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedByIsNotNull() {
            addCriterion("C_INVOICE_CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedByEqualTo(String value) {
            addCriterion("C_INVOICE_CREATED_BY =", value, "cInvoiceCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedByNotEqualTo(String value) {
            addCriterion("C_INVOICE_CREATED_BY <>", value, "cInvoiceCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedByGreaterThan(String value) {
            addCriterion("C_INVOICE_CREATED_BY >", value, "cInvoiceCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("C_INVOICE_CREATED_BY >=", value, "cInvoiceCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedByLessThan(String value) {
            addCriterion("C_INVOICE_CREATED_BY <", value, "cInvoiceCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedByLessThanOrEqualTo(String value) {
            addCriterion("C_INVOICE_CREATED_BY <=", value, "cInvoiceCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedByLike(String value) {
            addCriterion("C_INVOICE_CREATED_BY like", value, "cInvoiceCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedByNotLike(String value) {
            addCriterion("C_INVOICE_CREATED_BY not like", value, "cInvoiceCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedByIn(List<String> values) {
            addCriterion("C_INVOICE_CREATED_BY in", values, "cInvoiceCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedByNotIn(List<String> values) {
            addCriterion("C_INVOICE_CREATED_BY not in", values, "cInvoiceCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedByBetween(String value1, String value2) {
            addCriterion("C_INVOICE_CREATED_BY between", value1, value2, "cInvoiceCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceCreatedByNotBetween(String value1, String value2) {
            addCriterion("C_INVOICE_CREATED_BY not between", value1, value2, "cInvoiceCreatedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedIsNull() {
            addCriterion("C_INVOICE_VERIFYED is null");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedIsNotNull() {
            addCriterion("C_INVOICE_VERIFYED is not null");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedEqualTo(String value) {
            addCriterion("C_INVOICE_VERIFYED =", value, "cInvoiceVerifyed");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedNotEqualTo(String value) {
            addCriterion("C_INVOICE_VERIFYED <>", value, "cInvoiceVerifyed");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedGreaterThan(String value) {
            addCriterion("C_INVOICE_VERIFYED >", value, "cInvoiceVerifyed");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedGreaterThanOrEqualTo(String value) {
            addCriterion("C_INVOICE_VERIFYED >=", value, "cInvoiceVerifyed");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedLessThan(String value) {
            addCriterion("C_INVOICE_VERIFYED <", value, "cInvoiceVerifyed");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedLessThanOrEqualTo(String value) {
            addCriterion("C_INVOICE_VERIFYED <=", value, "cInvoiceVerifyed");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedLike(String value) {
            addCriterion("C_INVOICE_VERIFYED like", value, "cInvoiceVerifyed");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedNotLike(String value) {
            addCriterion("C_INVOICE_VERIFYED not like", value, "cInvoiceVerifyed");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedIn(List<String> values) {
            addCriterion("C_INVOICE_VERIFYED in", values, "cInvoiceVerifyed");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedNotIn(List<String> values) {
            addCriterion("C_INVOICE_VERIFYED not in", values, "cInvoiceVerifyed");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedBetween(String value1, String value2) {
            addCriterion("C_INVOICE_VERIFYED between", value1, value2, "cInvoiceVerifyed");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedNotBetween(String value1, String value2) {
            addCriterion("C_INVOICE_VERIFYED not between", value1, value2, "cInvoiceVerifyed");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedByIsNull() {
            addCriterion("C_INVOICE_VERIFYED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedByIsNotNull() {
            addCriterion("C_INVOICE_VERIFYED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedByEqualTo(String value) {
            addCriterion("C_INVOICE_VERIFYED_BY =", value, "cInvoiceVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedByNotEqualTo(String value) {
            addCriterion("C_INVOICE_VERIFYED_BY <>", value, "cInvoiceVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedByGreaterThan(String value) {
            addCriterion("C_INVOICE_VERIFYED_BY >", value, "cInvoiceVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedByGreaterThanOrEqualTo(String value) {
            addCriterion("C_INVOICE_VERIFYED_BY >=", value, "cInvoiceVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedByLessThan(String value) {
            addCriterion("C_INVOICE_VERIFYED_BY <", value, "cInvoiceVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedByLessThanOrEqualTo(String value) {
            addCriterion("C_INVOICE_VERIFYED_BY <=", value, "cInvoiceVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedByLike(String value) {
            addCriterion("C_INVOICE_VERIFYED_BY like", value, "cInvoiceVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedByNotLike(String value) {
            addCriterion("C_INVOICE_VERIFYED_BY not like", value, "cInvoiceVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedByIn(List<String> values) {
            addCriterion("C_INVOICE_VERIFYED_BY in", values, "cInvoiceVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedByNotIn(List<String> values) {
            addCriterion("C_INVOICE_VERIFYED_BY not in", values, "cInvoiceVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedByBetween(String value1, String value2) {
            addCriterion("C_INVOICE_VERIFYED_BY between", value1, value2, "cInvoiceVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedByNotBetween(String value1, String value2) {
            addCriterion("C_INVOICE_VERIFYED_BY not between", value1, value2, "cInvoiceVerifyedBy");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedOnIsNull() {
            addCriterion("C_INVOICE_VERIFYED_ON is null");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedOnIsNotNull() {
            addCriterion("C_INVOICE_VERIFYED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedOnEqualTo(Date value) {
            addCriterionForJDBCDate("C_INVOICE_VERIFYED_ON =", value, "cInvoiceVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_INVOICE_VERIFYED_ON <>", value, "cInvoiceVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedOnGreaterThan(Date value) {
            addCriterionForJDBCDate("C_INVOICE_VERIFYED_ON >", value, "cInvoiceVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_INVOICE_VERIFYED_ON >=", value, "cInvoiceVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedOnLessThan(Date value) {
            addCriterionForJDBCDate("C_INVOICE_VERIFYED_ON <", value, "cInvoiceVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_INVOICE_VERIFYED_ON <=", value, "cInvoiceVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedOnIn(List<Date> values) {
            addCriterionForJDBCDate("C_INVOICE_VERIFYED_ON in", values, "cInvoiceVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_INVOICE_VERIFYED_ON not in", values, "cInvoiceVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_INVOICE_VERIFYED_ON between", value1, value2, "cInvoiceVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCInvoiceVerifyedOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_INVOICE_VERIFYED_ON not between", value1, value2, "cInvoiceVerifyedOn");
            return (Criteria) this;
        }

        public Criteria andCRptReportNumberIsNull() {
            addCriterion("C_RPT_REPORT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCRptReportNumberIsNotNull() {
            addCriterion("C_RPT_REPORT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCRptReportNumberEqualTo(Long value) {
            addCriterion("C_RPT_REPORT_NUMBER =", value, "cRptReportNumber");
            return (Criteria) this;
        }

        public Criteria andCRptReportNumberNotEqualTo(Long value) {
            addCriterion("C_RPT_REPORT_NUMBER <>", value, "cRptReportNumber");
            return (Criteria) this;
        }

        public Criteria andCRptReportNumberGreaterThan(Long value) {
            addCriterion("C_RPT_REPORT_NUMBER >", value, "cRptReportNumber");
            return (Criteria) this;
        }

        public Criteria andCRptReportNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("C_RPT_REPORT_NUMBER >=", value, "cRptReportNumber");
            return (Criteria) this;
        }

        public Criteria andCRptReportNumberLessThan(Long value) {
            addCriterion("C_RPT_REPORT_NUMBER <", value, "cRptReportNumber");
            return (Criteria) this;
        }

        public Criteria andCRptReportNumberLessThanOrEqualTo(Long value) {
            addCriterion("C_RPT_REPORT_NUMBER <=", value, "cRptReportNumber");
            return (Criteria) this;
        }

        public Criteria andCRptReportNumberIn(List<Long> values) {
            addCriterion("C_RPT_REPORT_NUMBER in", values, "cRptReportNumber");
            return (Criteria) this;
        }

        public Criteria andCRptReportNumberNotIn(List<Long> values) {
            addCriterion("C_RPT_REPORT_NUMBER not in", values, "cRptReportNumber");
            return (Criteria) this;
        }

        public Criteria andCRptReportNumberBetween(Long value1, Long value2) {
            addCriterion("C_RPT_REPORT_NUMBER between", value1, value2, "cRptReportNumber");
            return (Criteria) this;
        }

        public Criteria andCRptReportNumberNotBetween(Long value1, Long value2) {
            addCriterion("C_RPT_REPORT_NUMBER not between", value1, value2, "cRptReportNumber");
            return (Criteria) this;
        }

        public Criteria andCConclusionIsNull() {
            addCriterion("C_CONCLUSION is null");
            return (Criteria) this;
        }

        public Criteria andCConclusionIsNotNull() {
            addCriterion("C_CONCLUSION is not null");
            return (Criteria) this;
        }

        public Criteria andCConclusionEqualTo(String value) {
            addCriterion("C_CONCLUSION =", value, "cConclusion");
            return (Criteria) this;
        }

        public Criteria andCConclusionNotEqualTo(String value) {
            addCriterion("C_CONCLUSION <>", value, "cConclusion");
            return (Criteria) this;
        }

        public Criteria andCConclusionGreaterThan(String value) {
            addCriterion("C_CONCLUSION >", value, "cConclusion");
            return (Criteria) this;
        }

        public Criteria andCConclusionGreaterThanOrEqualTo(String value) {
            addCriterion("C_CONCLUSION >=", value, "cConclusion");
            return (Criteria) this;
        }

        public Criteria andCConclusionLessThan(String value) {
            addCriterion("C_CONCLUSION <", value, "cConclusion");
            return (Criteria) this;
        }

        public Criteria andCConclusionLessThanOrEqualTo(String value) {
            addCriterion("C_CONCLUSION <=", value, "cConclusion");
            return (Criteria) this;
        }

        public Criteria andCConclusionLike(String value) {
            addCriterion("C_CONCLUSION like", value, "cConclusion");
            return (Criteria) this;
        }

        public Criteria andCConclusionNotLike(String value) {
            addCriterion("C_CONCLUSION not like", value, "cConclusion");
            return (Criteria) this;
        }

        public Criteria andCConclusionIn(List<String> values) {
            addCriterion("C_CONCLUSION in", values, "cConclusion");
            return (Criteria) this;
        }

        public Criteria andCConclusionNotIn(List<String> values) {
            addCriterion("C_CONCLUSION not in", values, "cConclusion");
            return (Criteria) this;
        }

        public Criteria andCConclusionBetween(String value1, String value2) {
            addCriterion("C_CONCLUSION between", value1, value2, "cConclusion");
            return (Criteria) this;
        }

        public Criteria andCConclusionNotBetween(String value1, String value2) {
            addCriterion("C_CONCLUSION not between", value1, value2, "cConclusion");
            return (Criteria) this;
        }

        public Criteria andCFocusProjuserIsNull() {
            addCriterion("C_FOCUS_PROJUSER is null");
            return (Criteria) this;
        }

        public Criteria andCFocusProjuserIsNotNull() {
            addCriterion("C_FOCUS_PROJUSER is not null");
            return (Criteria) this;
        }

        public Criteria andCFocusProjuserEqualTo(String value) {
            addCriterion("C_FOCUS_PROJUSER =", value, "cFocusProjuser");
            return (Criteria) this;
        }

        public Criteria andCFocusProjuserNotEqualTo(String value) {
            addCriterion("C_FOCUS_PROJUSER <>", value, "cFocusProjuser");
            return (Criteria) this;
        }

        public Criteria andCFocusProjuserGreaterThan(String value) {
            addCriterion("C_FOCUS_PROJUSER >", value, "cFocusProjuser");
            return (Criteria) this;
        }

        public Criteria andCFocusProjuserGreaterThanOrEqualTo(String value) {
            addCriterion("C_FOCUS_PROJUSER >=", value, "cFocusProjuser");
            return (Criteria) this;
        }

        public Criteria andCFocusProjuserLessThan(String value) {
            addCriterion("C_FOCUS_PROJUSER <", value, "cFocusProjuser");
            return (Criteria) this;
        }

        public Criteria andCFocusProjuserLessThanOrEqualTo(String value) {
            addCriterion("C_FOCUS_PROJUSER <=", value, "cFocusProjuser");
            return (Criteria) this;
        }

        public Criteria andCFocusProjuserLike(String value) {
            addCriterion("C_FOCUS_PROJUSER like", value, "cFocusProjuser");
            return (Criteria) this;
        }

        public Criteria andCFocusProjuserNotLike(String value) {
            addCriterion("C_FOCUS_PROJUSER not like", value, "cFocusProjuser");
            return (Criteria) this;
        }

        public Criteria andCFocusProjuserIn(List<String> values) {
            addCriterion("C_FOCUS_PROJUSER in", values, "cFocusProjuser");
            return (Criteria) this;
        }

        public Criteria andCFocusProjuserNotIn(List<String> values) {
            addCriterion("C_FOCUS_PROJUSER not in", values, "cFocusProjuser");
            return (Criteria) this;
        }

        public Criteria andCFocusProjuserBetween(String value1, String value2) {
            addCriterion("C_FOCUS_PROJUSER between", value1, value2, "cFocusProjuser");
            return (Criteria) this;
        }

        public Criteria andCFocusProjuserNotBetween(String value1, String value2) {
            addCriterion("C_FOCUS_PROJUSER not between", value1, value2, "cFocusProjuser");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentCIsNull() {
            addCriterion("C_RPT_REJECT_COMMENT_C is null");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentCIsNotNull() {
            addCriterion("C_RPT_REJECT_COMMENT_C is not null");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentCEqualTo(String value) {
            addCriterion("C_RPT_REJECT_COMMENT_C =", value, "cRptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentCNotEqualTo(String value) {
            addCriterion("C_RPT_REJECT_COMMENT_C <>", value, "cRptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentCGreaterThan(String value) {
            addCriterion("C_RPT_REJECT_COMMENT_C >", value, "cRptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentCGreaterThanOrEqualTo(String value) {
            addCriterion("C_RPT_REJECT_COMMENT_C >=", value, "cRptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentCLessThan(String value) {
            addCriterion("C_RPT_REJECT_COMMENT_C <", value, "cRptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentCLessThanOrEqualTo(String value) {
            addCriterion("C_RPT_REJECT_COMMENT_C <=", value, "cRptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentCLike(String value) {
            addCriterion("C_RPT_REJECT_COMMENT_C like", value, "cRptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentCNotLike(String value) {
            addCriterion("C_RPT_REJECT_COMMENT_C not like", value, "cRptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentCIn(List<String> values) {
            addCriterion("C_RPT_REJECT_COMMENT_C in", values, "cRptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentCNotIn(List<String> values) {
            addCriterion("C_RPT_REJECT_COMMENT_C not in", values, "cRptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentCBetween(String value1, String value2) {
            addCriterion("C_RPT_REJECT_COMMENT_C between", value1, value2, "cRptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentCNotBetween(String value1, String value2) {
            addCriterion("C_RPT_REJECT_COMMENT_C not between", value1, value2, "cRptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentSIsNull() {
            addCriterion("C_RPT_REJECT_COMMENT_S is null");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentSIsNotNull() {
            addCriterion("C_RPT_REJECT_COMMENT_S is not null");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentSEqualTo(String value) {
            addCriterion("C_RPT_REJECT_COMMENT_S =", value, "cRptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentSNotEqualTo(String value) {
            addCriterion("C_RPT_REJECT_COMMENT_S <>", value, "cRptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentSGreaterThan(String value) {
            addCriterion("C_RPT_REJECT_COMMENT_S >", value, "cRptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentSGreaterThanOrEqualTo(String value) {
            addCriterion("C_RPT_REJECT_COMMENT_S >=", value, "cRptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentSLessThan(String value) {
            addCriterion("C_RPT_REJECT_COMMENT_S <", value, "cRptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentSLessThanOrEqualTo(String value) {
            addCriterion("C_RPT_REJECT_COMMENT_S <=", value, "cRptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentSLike(String value) {
            addCriterion("C_RPT_REJECT_COMMENT_S like", value, "cRptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentSNotLike(String value) {
            addCriterion("C_RPT_REJECT_COMMENT_S not like", value, "cRptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentSIn(List<String> values) {
            addCriterion("C_RPT_REJECT_COMMENT_S in", values, "cRptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentSNotIn(List<String> values) {
            addCriterion("C_RPT_REJECT_COMMENT_S not in", values, "cRptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentSBetween(String value1, String value2) {
            addCriterion("C_RPT_REJECT_COMMENT_S between", value1, value2, "cRptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andCRptRejectCommentSNotBetween(String value1, String value2) {
            addCriterion("C_RPT_REJECT_COMMENT_S not between", value1, value2, "cRptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andCAlltaskCoaAuthorizedIsNull() {
            addCriterion("C_ALLTASK_COA_AUTHORIZED is null");
            return (Criteria) this;
        }

        public Criteria andCAlltaskCoaAuthorizedIsNotNull() {
            addCriterion("C_ALLTASK_COA_AUTHORIZED is not null");
            return (Criteria) this;
        }

        public Criteria andCAlltaskCoaAuthorizedEqualTo(String value) {
            addCriterion("C_ALLTASK_COA_AUTHORIZED =", value, "cAlltaskCoaAuthorized");
            return (Criteria) this;
        }

        public Criteria andCAlltaskCoaAuthorizedNotEqualTo(String value) {
            addCriterion("C_ALLTASK_COA_AUTHORIZED <>", value, "cAlltaskCoaAuthorized");
            return (Criteria) this;
        }

        public Criteria andCAlltaskCoaAuthorizedGreaterThan(String value) {
            addCriterion("C_ALLTASK_COA_AUTHORIZED >", value, "cAlltaskCoaAuthorized");
            return (Criteria) this;
        }

        public Criteria andCAlltaskCoaAuthorizedGreaterThanOrEqualTo(String value) {
            addCriterion("C_ALLTASK_COA_AUTHORIZED >=", value, "cAlltaskCoaAuthorized");
            return (Criteria) this;
        }

        public Criteria andCAlltaskCoaAuthorizedLessThan(String value) {
            addCriterion("C_ALLTASK_COA_AUTHORIZED <", value, "cAlltaskCoaAuthorized");
            return (Criteria) this;
        }

        public Criteria andCAlltaskCoaAuthorizedLessThanOrEqualTo(String value) {
            addCriterion("C_ALLTASK_COA_AUTHORIZED <=", value, "cAlltaskCoaAuthorized");
            return (Criteria) this;
        }

        public Criteria andCAlltaskCoaAuthorizedLike(String value) {
            addCriterion("C_ALLTASK_COA_AUTHORIZED like", value, "cAlltaskCoaAuthorized");
            return (Criteria) this;
        }

        public Criteria andCAlltaskCoaAuthorizedNotLike(String value) {
            addCriterion("C_ALLTASK_COA_AUTHORIZED not like", value, "cAlltaskCoaAuthorized");
            return (Criteria) this;
        }

        public Criteria andCAlltaskCoaAuthorizedIn(List<String> values) {
            addCriterion("C_ALLTASK_COA_AUTHORIZED in", values, "cAlltaskCoaAuthorized");
            return (Criteria) this;
        }

        public Criteria andCAlltaskCoaAuthorizedNotIn(List<String> values) {
            addCriterion("C_ALLTASK_COA_AUTHORIZED not in", values, "cAlltaskCoaAuthorized");
            return (Criteria) this;
        }

        public Criteria andCAlltaskCoaAuthorizedBetween(String value1, String value2) {
            addCriterion("C_ALLTASK_COA_AUTHORIZED between", value1, value2, "cAlltaskCoaAuthorized");
            return (Criteria) this;
        }

        public Criteria andCAlltaskCoaAuthorizedNotBetween(String value1, String value2) {
            addCriterion("C_ALLTASK_COA_AUTHORIZED not between", value1, value2, "cAlltaskCoaAuthorized");
            return (Criteria) this;
        }

        public Criteria andCRptCnasLogoIsNull() {
            addCriterion("C_RPT_CNAS_LOGO is null");
            return (Criteria) this;
        }

        public Criteria andCRptCnasLogoIsNotNull() {
            addCriterion("C_RPT_CNAS_LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andCRptCnasLogoEqualTo(String value) {
            addCriterion("C_RPT_CNAS_LOGO =", value, "cRptCnasLogo");
            return (Criteria) this;
        }

        public Criteria andCRptCnasLogoNotEqualTo(String value) {
            addCriterion("C_RPT_CNAS_LOGO <>", value, "cRptCnasLogo");
            return (Criteria) this;
        }

        public Criteria andCRptCnasLogoGreaterThan(String value) {
            addCriterion("C_RPT_CNAS_LOGO >", value, "cRptCnasLogo");
            return (Criteria) this;
        }

        public Criteria andCRptCnasLogoGreaterThanOrEqualTo(String value) {
            addCriterion("C_RPT_CNAS_LOGO >=", value, "cRptCnasLogo");
            return (Criteria) this;
        }

        public Criteria andCRptCnasLogoLessThan(String value) {
            addCriterion("C_RPT_CNAS_LOGO <", value, "cRptCnasLogo");
            return (Criteria) this;
        }

        public Criteria andCRptCnasLogoLessThanOrEqualTo(String value) {
            addCriterion("C_RPT_CNAS_LOGO <=", value, "cRptCnasLogo");
            return (Criteria) this;
        }

        public Criteria andCRptCnasLogoLike(String value) {
            addCriterion("C_RPT_CNAS_LOGO like", value, "cRptCnasLogo");
            return (Criteria) this;
        }

        public Criteria andCRptCnasLogoNotLike(String value) {
            addCriterion("C_RPT_CNAS_LOGO not like", value, "cRptCnasLogo");
            return (Criteria) this;
        }

        public Criteria andCRptCnasLogoIn(List<String> values) {
            addCriterion("C_RPT_CNAS_LOGO in", values, "cRptCnasLogo");
            return (Criteria) this;
        }

        public Criteria andCRptCnasLogoNotIn(List<String> values) {
            addCriterion("C_RPT_CNAS_LOGO not in", values, "cRptCnasLogo");
            return (Criteria) this;
        }

        public Criteria andCRptCnasLogoBetween(String value1, String value2) {
            addCriterion("C_RPT_CNAS_LOGO between", value1, value2, "cRptCnasLogo");
            return (Criteria) this;
        }

        public Criteria andCRptCnasLogoNotBetween(String value1, String value2) {
            addCriterion("C_RPT_CNAS_LOGO not between", value1, value2, "cRptCnasLogo");
            return (Criteria) this;
        }

        public Criteria andCMailQuotesIsNull() {
            addCriterion("C_MAIL_QUOTES is null");
            return (Criteria) this;
        }

        public Criteria andCMailQuotesIsNotNull() {
            addCriterion("C_MAIL_QUOTES is not null");
            return (Criteria) this;
        }

        public Criteria andCMailQuotesEqualTo(String value) {
            addCriterion("C_MAIL_QUOTES =", value, "cMailQuotes");
            return (Criteria) this;
        }

        public Criteria andCMailQuotesNotEqualTo(String value) {
            addCriterion("C_MAIL_QUOTES <>", value, "cMailQuotes");
            return (Criteria) this;
        }

        public Criteria andCMailQuotesGreaterThan(String value) {
            addCriterion("C_MAIL_QUOTES >", value, "cMailQuotes");
            return (Criteria) this;
        }

        public Criteria andCMailQuotesGreaterThanOrEqualTo(String value) {
            addCriterion("C_MAIL_QUOTES >=", value, "cMailQuotes");
            return (Criteria) this;
        }

        public Criteria andCMailQuotesLessThan(String value) {
            addCriterion("C_MAIL_QUOTES <", value, "cMailQuotes");
            return (Criteria) this;
        }

        public Criteria andCMailQuotesLessThanOrEqualTo(String value) {
            addCriterion("C_MAIL_QUOTES <=", value, "cMailQuotes");
            return (Criteria) this;
        }

        public Criteria andCMailQuotesLike(String value) {
            addCriterion("C_MAIL_QUOTES like", value, "cMailQuotes");
            return (Criteria) this;
        }

        public Criteria andCMailQuotesNotLike(String value) {
            addCriterion("C_MAIL_QUOTES not like", value, "cMailQuotes");
            return (Criteria) this;
        }

        public Criteria andCMailQuotesIn(List<String> values) {
            addCriterion("C_MAIL_QUOTES in", values, "cMailQuotes");
            return (Criteria) this;
        }

        public Criteria andCMailQuotesNotIn(List<String> values) {
            addCriterion("C_MAIL_QUOTES not in", values, "cMailQuotes");
            return (Criteria) this;
        }

        public Criteria andCMailQuotesBetween(String value1, String value2) {
            addCriterion("C_MAIL_QUOTES between", value1, value2, "cMailQuotes");
            return (Criteria) this;
        }

        public Criteria andCMailQuotesNotBetween(String value1, String value2) {
            addCriterion("C_MAIL_QUOTES not between", value1, value2, "cMailQuotes");
            return (Criteria) this;
        }

        public Criteria andCMailChargeIsNull() {
            addCriterion("C_MAIL_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andCMailChargeIsNotNull() {
            addCriterion("C_MAIL_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andCMailChargeEqualTo(String value) {
            addCriterion("C_MAIL_CHARGE =", value, "cMailCharge");
            return (Criteria) this;
        }

        public Criteria andCMailChargeNotEqualTo(String value) {
            addCriterion("C_MAIL_CHARGE <>", value, "cMailCharge");
            return (Criteria) this;
        }

        public Criteria andCMailChargeGreaterThan(String value) {
            addCriterion("C_MAIL_CHARGE >", value, "cMailCharge");
            return (Criteria) this;
        }

        public Criteria andCMailChargeGreaterThanOrEqualTo(String value) {
            addCriterion("C_MAIL_CHARGE >=", value, "cMailCharge");
            return (Criteria) this;
        }

        public Criteria andCMailChargeLessThan(String value) {
            addCriterion("C_MAIL_CHARGE <", value, "cMailCharge");
            return (Criteria) this;
        }

        public Criteria andCMailChargeLessThanOrEqualTo(String value) {
            addCriterion("C_MAIL_CHARGE <=", value, "cMailCharge");
            return (Criteria) this;
        }

        public Criteria andCMailChargeLike(String value) {
            addCriterion("C_MAIL_CHARGE like", value, "cMailCharge");
            return (Criteria) this;
        }

        public Criteria andCMailChargeNotLike(String value) {
            addCriterion("C_MAIL_CHARGE not like", value, "cMailCharge");
            return (Criteria) this;
        }

        public Criteria andCMailChargeIn(List<String> values) {
            addCriterion("C_MAIL_CHARGE in", values, "cMailCharge");
            return (Criteria) this;
        }

        public Criteria andCMailChargeNotIn(List<String> values) {
            addCriterion("C_MAIL_CHARGE not in", values, "cMailCharge");
            return (Criteria) this;
        }

        public Criteria andCMailChargeBetween(String value1, String value2) {
            addCriterion("C_MAIL_CHARGE between", value1, value2, "cMailCharge");
            return (Criteria) this;
        }

        public Criteria andCMailChargeNotBetween(String value1, String value2) {
            addCriterion("C_MAIL_CHARGE not between", value1, value2, "cMailCharge");
            return (Criteria) this;
        }

        public Criteria andRptNumberBakIsNull() {
            addCriterion("RPT_NUMBER_BAK is null");
            return (Criteria) this;
        }

        public Criteria andRptNumberBakIsNotNull() {
            addCriterion("RPT_NUMBER_BAK is not null");
            return (Criteria) this;
        }

        public Criteria andRptNumberBakEqualTo(Long value) {
            addCriterion("RPT_NUMBER_BAK =", value, "rptNumberBak");
            return (Criteria) this;
        }

        public Criteria andRptNumberBakNotEqualTo(Long value) {
            addCriterion("RPT_NUMBER_BAK <>", value, "rptNumberBak");
            return (Criteria) this;
        }

        public Criteria andRptNumberBakGreaterThan(Long value) {
            addCriterion("RPT_NUMBER_BAK >", value, "rptNumberBak");
            return (Criteria) this;
        }

        public Criteria andRptNumberBakGreaterThanOrEqualTo(Long value) {
            addCriterion("RPT_NUMBER_BAK >=", value, "rptNumberBak");
            return (Criteria) this;
        }

        public Criteria andRptNumberBakLessThan(Long value) {
            addCriterion("RPT_NUMBER_BAK <", value, "rptNumberBak");
            return (Criteria) this;
        }

        public Criteria andRptNumberBakLessThanOrEqualTo(Long value) {
            addCriterion("RPT_NUMBER_BAK <=", value, "rptNumberBak");
            return (Criteria) this;
        }

        public Criteria andRptNumberBakIn(List<Long> values) {
            addCriterion("RPT_NUMBER_BAK in", values, "rptNumberBak");
            return (Criteria) this;
        }

        public Criteria andRptNumberBakNotIn(List<Long> values) {
            addCriterion("RPT_NUMBER_BAK not in", values, "rptNumberBak");
            return (Criteria) this;
        }

        public Criteria andRptNumberBakBetween(Long value1, Long value2) {
            addCriterion("RPT_NUMBER_BAK between", value1, value2, "rptNumberBak");
            return (Criteria) this;
        }

        public Criteria andRptNumberBakNotBetween(Long value1, Long value2) {
            addCriterion("RPT_NUMBER_BAK not between", value1, value2, "rptNumberBak");
            return (Criteria) this;
        }

        public Criteria andNcRefIsNull() {
            addCriterion("NC_REF is null");
            return (Criteria) this;
        }

        public Criteria andNcRefIsNotNull() {
            addCriterion("NC_REF is not null");
            return (Criteria) this;
        }

        public Criteria andNcRefEqualTo(String value) {
            addCriterion("NC_REF =", value, "ncRef");
            return (Criteria) this;
        }

        public Criteria andNcRefNotEqualTo(String value) {
            addCriterion("NC_REF <>", value, "ncRef");
            return (Criteria) this;
        }

        public Criteria andNcRefGreaterThan(String value) {
            addCriterion("NC_REF >", value, "ncRef");
            return (Criteria) this;
        }

        public Criteria andNcRefGreaterThanOrEqualTo(String value) {
            addCriterion("NC_REF >=", value, "ncRef");
            return (Criteria) this;
        }

        public Criteria andNcRefLessThan(String value) {
            addCriterion("NC_REF <", value, "ncRef");
            return (Criteria) this;
        }

        public Criteria andNcRefLessThanOrEqualTo(String value) {
            addCriterion("NC_REF <=", value, "ncRef");
            return (Criteria) this;
        }

        public Criteria andNcRefLike(String value) {
            addCriterion("NC_REF like", value, "ncRef");
            return (Criteria) this;
        }

        public Criteria andNcRefNotLike(String value) {
            addCriterion("NC_REF not like", value, "ncRef");
            return (Criteria) this;
        }

        public Criteria andNcRefIn(List<String> values) {
            addCriterion("NC_REF in", values, "ncRef");
            return (Criteria) this;
        }

        public Criteria andNcRefNotIn(List<String> values) {
            addCriterion("NC_REF not in", values, "ncRef");
            return (Criteria) this;
        }

        public Criteria andNcRefBetween(String value1, String value2) {
            addCriterion("NC_REF between", value1, value2, "ncRef");
            return (Criteria) this;
        }

        public Criteria andNcRefNotBetween(String value1, String value2) {
            addCriterion("NC_REF not between", value1, value2, "ncRef");
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

        public Criteria andCNcToLimsIsNull() {
            addCriterion("C_NC_TO_LIMS is null");
            return (Criteria) this;
        }

        public Criteria andCNcToLimsIsNotNull() {
            addCriterion("C_NC_TO_LIMS is not null");
            return (Criteria) this;
        }

        public Criteria andCNcToLimsEqualTo(String value) {
            addCriterion("C_NC_TO_LIMS =", value, "cNcToLims");
            return (Criteria) this;
        }

        public Criteria andCNcToLimsNotEqualTo(String value) {
            addCriterion("C_NC_TO_LIMS <>", value, "cNcToLims");
            return (Criteria) this;
        }

        public Criteria andCNcToLimsGreaterThan(String value) {
            addCriterion("C_NC_TO_LIMS >", value, "cNcToLims");
            return (Criteria) this;
        }

        public Criteria andCNcToLimsGreaterThanOrEqualTo(String value) {
            addCriterion("C_NC_TO_LIMS >=", value, "cNcToLims");
            return (Criteria) this;
        }

        public Criteria andCNcToLimsLessThan(String value) {
            addCriterion("C_NC_TO_LIMS <", value, "cNcToLims");
            return (Criteria) this;
        }

        public Criteria andCNcToLimsLessThanOrEqualTo(String value) {
            addCriterion("C_NC_TO_LIMS <=", value, "cNcToLims");
            return (Criteria) this;
        }

        public Criteria andCNcToLimsLike(String value) {
            addCriterion("C_NC_TO_LIMS like", value, "cNcToLims");
            return (Criteria) this;
        }

        public Criteria andCNcToLimsNotLike(String value) {
            addCriterion("C_NC_TO_LIMS not like", value, "cNcToLims");
            return (Criteria) this;
        }

        public Criteria andCNcToLimsIn(List<String> values) {
            addCriterion("C_NC_TO_LIMS in", values, "cNcToLims");
            return (Criteria) this;
        }

        public Criteria andCNcToLimsNotIn(List<String> values) {
            addCriterion("C_NC_TO_LIMS not in", values, "cNcToLims");
            return (Criteria) this;
        }

        public Criteria andCNcToLimsBetween(String value1, String value2) {
            addCriterion("C_NC_TO_LIMS between", value1, value2, "cNcToLims");
            return (Criteria) this;
        }

        public Criteria andCNcToLimsNotBetween(String value1, String value2) {
            addCriterion("C_NC_TO_LIMS not between", value1, value2, "cNcToLims");
            return (Criteria) this;
        }

        public Criteria andCAddressIsNull() {
            addCriterion("C_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCAddressIsNotNull() {
            addCriterion("C_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCAddressEqualTo(String value) {
            addCriterion("C_ADDRESS =", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotEqualTo(String value) {
            addCriterion("C_ADDRESS <>", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressGreaterThan(String value) {
            addCriterion("C_ADDRESS >", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressGreaterThanOrEqualTo(String value) {
            addCriterion("C_ADDRESS >=", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLessThan(String value) {
            addCriterion("C_ADDRESS <", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLessThanOrEqualTo(String value) {
            addCriterion("C_ADDRESS <=", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLike(String value) {
            addCriterion("C_ADDRESS like", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotLike(String value) {
            addCriterion("C_ADDRESS not like", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressIn(List<String> values) {
            addCriterion("C_ADDRESS in", values, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotIn(List<String> values) {
            addCriterion("C_ADDRESS not in", values, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressBetween(String value1, String value2) {
            addCriterion("C_ADDRESS between", value1, value2, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotBetween(String value1, String value2) {
            addCriterion("C_ADDRESS not between", value1, value2, "cAddress");
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