package cn.besbing.model.entities.primary;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CProjTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CProjTaskExample() {
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

        public Criteria andSeqNumIsNull() {
            addCriterion("SEQ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSeqNumIsNotNull() {
            addCriterion("SEQ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNumEqualTo(Long value) {
            addCriterion("SEQ_NUM =", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotEqualTo(Long value) {
            addCriterion("SEQ_NUM <>", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThan(Long value) {
            addCriterion("SEQ_NUM >", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQ_NUM >=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThan(Long value) {
            addCriterion("SEQ_NUM <", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThanOrEqualTo(Long value) {
            addCriterion("SEQ_NUM <=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumIn(List<Long> values) {
            addCriterion("SEQ_NUM in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotIn(List<Long> values) {
            addCriterion("SEQ_NUM not in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumBetween(Long value1, Long value2) {
            addCriterion("SEQ_NUM between", value1, value2, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotBetween(Long value1, Long value2) {
            addCriterion("SEQ_NUM not between", value1, value2, "seqNum");
            return (Criteria) this;
        }

        public Criteria andProjectIsNull() {
            addCriterion("PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(String value) {
            addCriterion("PROJECT =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(String value) {
            addCriterion("PROJECT <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(String value) {
            addCriterion("PROJECT >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(String value) {
            addCriterion("PROJECT <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(String value) {
            addCriterion("PROJECT <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLike(String value) {
            addCriterion("PROJECT like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotLike(String value) {
            addCriterion("PROJECT not like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<String> values) {
            addCriterion("PROJECT in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<String> values) {
            addCriterion("PROJECT not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(String value1, String value2) {
            addCriterion("PROJECT between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(String value1, String value2) {
            addCriterion("PROJECT not between", value1, value2, "project");
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

        public Criteria andOrderNumberEqualTo(BigDecimal value) {
            addCriterion("ORDER_NUMBER =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_NUMBER <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(BigDecimal value) {
            addCriterion("ORDER_NUMBER >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_NUMBER >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(BigDecimal value) {
            addCriterion("ORDER_NUMBER <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_NUMBER <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<BigDecimal> values) {
            addCriterion("ORDER_NUMBER in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_NUMBER not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_NUMBER between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_NUMBER not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andAnalysisIsNull() {
            addCriterion("ANALYSIS is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisIsNotNull() {
            addCriterion("ANALYSIS is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisEqualTo(String value) {
            addCriterion("ANALYSIS =", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotEqualTo(String value) {
            addCriterion("ANALYSIS <>", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThan(String value) {
            addCriterion("ANALYSIS >", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThanOrEqualTo(String value) {
            addCriterion("ANALYSIS >=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThan(String value) {
            addCriterion("ANALYSIS <", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThanOrEqualTo(String value) {
            addCriterion("ANALYSIS <=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLike(String value) {
            addCriterion("ANALYSIS like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotLike(String value) {
            addCriterion("ANALYSIS not like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisIn(List<String> values) {
            addCriterion("ANALYSIS in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotIn(List<String> values) {
            addCriterion("ANALYSIS not in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisBetween(String value1, String value2) {
            addCriterion("ANALYSIS between", value1, value2, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotBetween(String value1, String value2) {
            addCriterion("ANALYSIS not between", value1, value2, "analysis");
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

        public Criteria andSampleGroupIsNull() {
            addCriterion("SAMPLE_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andSampleGroupIsNotNull() {
            addCriterion("SAMPLE_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andSampleGroupEqualTo(String value) {
            addCriterion("SAMPLE_GROUP =", value, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupNotEqualTo(String value) {
            addCriterion("SAMPLE_GROUP <>", value, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupGreaterThan(String value) {
            addCriterion("SAMPLE_GROUP >", value, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_GROUP >=", value, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupLessThan(String value) {
            addCriterion("SAMPLE_GROUP <", value, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_GROUP <=", value, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupLike(String value) {
            addCriterion("SAMPLE_GROUP like", value, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupNotLike(String value) {
            addCriterion("SAMPLE_GROUP not like", value, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupIn(List<String> values) {
            addCriterion("SAMPLE_GROUP in", values, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupNotIn(List<String> values) {
            addCriterion("SAMPLE_GROUP not in", values, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupBetween(String value1, String value2) {
            addCriterion("SAMPLE_GROUP between", value1, value2, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_GROUP not between", value1, value2, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andStartedDateIsNull() {
            addCriterion("STARTED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartedDateIsNotNull() {
            addCriterion("STARTED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartedDateEqualTo(Date value) {
            addCriterionForJDBCDate("STARTED_DATE =", value, "startedDate");
            return (Criteria) this;
        }

        public Criteria andStartedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("STARTED_DATE <>", value, "startedDate");
            return (Criteria) this;
        }

        public Criteria andStartedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("STARTED_DATE >", value, "startedDate");
            return (Criteria) this;
        }

        public Criteria andStartedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTED_DATE >=", value, "startedDate");
            return (Criteria) this;
        }

        public Criteria andStartedDateLessThan(Date value) {
            addCriterionForJDBCDate("STARTED_DATE <", value, "startedDate");
            return (Criteria) this;
        }

        public Criteria andStartedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTED_DATE <=", value, "startedDate");
            return (Criteria) this;
        }

        public Criteria andStartedDateIn(List<Date> values) {
            addCriterionForJDBCDate("STARTED_DATE in", values, "startedDate");
            return (Criteria) this;
        }

        public Criteria andStartedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("STARTED_DATE not in", values, "startedDate");
            return (Criteria) this;
        }

        public Criteria andStartedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTED_DATE between", value1, value2, "startedDate");
            return (Criteria) this;
        }

        public Criteria andStartedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTED_DATE not between", value1, value2, "startedDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("CREATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CREATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_DATE =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_DATE <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATED_DATE >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_DATE >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterionForJDBCDate("CREATED_DATE <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATED_DATE <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATED_DATE in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATED_DATE not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATED_DATE between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATED_DATE not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCompletedDateIsNull() {
            addCriterion("COMPLETED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCompletedDateIsNotNull() {
            addCriterion("COMPLETED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedDateEqualTo(Date value) {
            addCriterionForJDBCDate("COMPLETED_DATE =", value, "completedDate");
            return (Criteria) this;
        }

        public Criteria andCompletedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("COMPLETED_DATE <>", value, "completedDate");
            return (Criteria) this;
        }

        public Criteria andCompletedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("COMPLETED_DATE >", value, "completedDate");
            return (Criteria) this;
        }

        public Criteria andCompletedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COMPLETED_DATE >=", value, "completedDate");
            return (Criteria) this;
        }

        public Criteria andCompletedDateLessThan(Date value) {
            addCriterionForJDBCDate("COMPLETED_DATE <", value, "completedDate");
            return (Criteria) this;
        }

        public Criteria andCompletedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COMPLETED_DATE <=", value, "completedDate");
            return (Criteria) this;
        }

        public Criteria andCompletedDateIn(List<Date> values) {
            addCriterionForJDBCDate("COMPLETED_DATE in", values, "completedDate");
            return (Criteria) this;
        }

        public Criteria andCompletedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("COMPLETED_DATE not in", values, "completedDate");
            return (Criteria) this;
        }

        public Criteria andCompletedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COMPLETED_DATE between", value1, value2, "completedDate");
            return (Criteria) this;
        }

        public Criteria andCompletedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COMPLETED_DATE not between", value1, value2, "completedDate");
            return (Criteria) this;
        }

        public Criteria andTestNumberIsNull() {
            addCriterion("TEST_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTestNumberIsNotNull() {
            addCriterion("TEST_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTestNumberEqualTo(Long value) {
            addCriterion("TEST_NUMBER =", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberNotEqualTo(Long value) {
            addCriterion("TEST_NUMBER <>", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberGreaterThan(Long value) {
            addCriterion("TEST_NUMBER >", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("TEST_NUMBER >=", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberLessThan(Long value) {
            addCriterion("TEST_NUMBER <", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberLessThanOrEqualTo(Long value) {
            addCriterion("TEST_NUMBER <=", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberIn(List<Long> values) {
            addCriterion("TEST_NUMBER in", values, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberNotIn(List<Long> values) {
            addCriterion("TEST_NUMBER not in", values, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberBetween(Long value1, Long value2) {
            addCriterion("TEST_NUMBER between", value1, value2, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberNotBetween(Long value1, Long value2) {
            addCriterion("TEST_NUMBER not between", value1, value2, "testNumber");
            return (Criteria) this;
        }

        public Criteria andIsEnteredIsNull() {
            addCriterion("IS_ENTERED is null");
            return (Criteria) this;
        }

        public Criteria andIsEnteredIsNotNull() {
            addCriterion("IS_ENTERED is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnteredEqualTo(String value) {
            addCriterion("IS_ENTERED =", value, "isEntered");
            return (Criteria) this;
        }

        public Criteria andIsEnteredNotEqualTo(String value) {
            addCriterion("IS_ENTERED <>", value, "isEntered");
            return (Criteria) this;
        }

        public Criteria andIsEnteredGreaterThan(String value) {
            addCriterion("IS_ENTERED >", value, "isEntered");
            return (Criteria) this;
        }

        public Criteria andIsEnteredGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ENTERED >=", value, "isEntered");
            return (Criteria) this;
        }

        public Criteria andIsEnteredLessThan(String value) {
            addCriterion("IS_ENTERED <", value, "isEntered");
            return (Criteria) this;
        }

        public Criteria andIsEnteredLessThanOrEqualTo(String value) {
            addCriterion("IS_ENTERED <=", value, "isEntered");
            return (Criteria) this;
        }

        public Criteria andIsEnteredLike(String value) {
            addCriterion("IS_ENTERED like", value, "isEntered");
            return (Criteria) this;
        }

        public Criteria andIsEnteredNotLike(String value) {
            addCriterion("IS_ENTERED not like", value, "isEntered");
            return (Criteria) this;
        }

        public Criteria andIsEnteredIn(List<String> values) {
            addCriterion("IS_ENTERED in", values, "isEntered");
            return (Criteria) this;
        }

        public Criteria andIsEnteredNotIn(List<String> values) {
            addCriterion("IS_ENTERED not in", values, "isEntered");
            return (Criteria) this;
        }

        public Criteria andIsEnteredBetween(String value1, String value2) {
            addCriterion("IS_ENTERED between", value1, value2, "isEntered");
            return (Criteria) this;
        }

        public Criteria andIsEnteredNotBetween(String value1, String value2) {
            addCriterion("IS_ENTERED not between", value1, value2, "isEntered");
            return (Criteria) this;
        }

        public Criteria andTestVariationIsNull() {
            addCriterion("TEST_VARIATION is null");
            return (Criteria) this;
        }

        public Criteria andTestVariationIsNotNull() {
            addCriterion("TEST_VARIATION is not null");
            return (Criteria) this;
        }

        public Criteria andTestVariationEqualTo(String value) {
            addCriterion("TEST_VARIATION =", value, "testVariation");
            return (Criteria) this;
        }

        public Criteria andTestVariationNotEqualTo(String value) {
            addCriterion("TEST_VARIATION <>", value, "testVariation");
            return (Criteria) this;
        }

        public Criteria andTestVariationGreaterThan(String value) {
            addCriterion("TEST_VARIATION >", value, "testVariation");
            return (Criteria) this;
        }

        public Criteria andTestVariationGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_VARIATION >=", value, "testVariation");
            return (Criteria) this;
        }

        public Criteria andTestVariationLessThan(String value) {
            addCriterion("TEST_VARIATION <", value, "testVariation");
            return (Criteria) this;
        }

        public Criteria andTestVariationLessThanOrEqualTo(String value) {
            addCriterion("TEST_VARIATION <=", value, "testVariation");
            return (Criteria) this;
        }

        public Criteria andTestVariationLike(String value) {
            addCriterion("TEST_VARIATION like", value, "testVariation");
            return (Criteria) this;
        }

        public Criteria andTestVariationNotLike(String value) {
            addCriterion("TEST_VARIATION not like", value, "testVariation");
            return (Criteria) this;
        }

        public Criteria andTestVariationIn(List<String> values) {
            addCriterion("TEST_VARIATION in", values, "testVariation");
            return (Criteria) this;
        }

        public Criteria andTestVariationNotIn(List<String> values) {
            addCriterion("TEST_VARIATION not in", values, "testVariation");
            return (Criteria) this;
        }

        public Criteria andTestVariationBetween(String value1, String value2) {
            addCriterion("TEST_VARIATION between", value1, value2, "testVariation");
            return (Criteria) this;
        }

        public Criteria andTestVariationNotBetween(String value1, String value2) {
            addCriterion("TEST_VARIATION not between", value1, value2, "testVariation");
            return (Criteria) this;
        }

        public Criteria andPlanTestTimeIsNull() {
            addCriterion("PLAN_TEST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPlanTestTimeIsNotNull() {
            addCriterion("PLAN_TEST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPlanTestTimeEqualTo(Long value) {
            addCriterion("PLAN_TEST_TIME =", value, "planTestTime");
            return (Criteria) this;
        }

        public Criteria andPlanTestTimeNotEqualTo(Long value) {
            addCriterion("PLAN_TEST_TIME <>", value, "planTestTime");
            return (Criteria) this;
        }

        public Criteria andPlanTestTimeGreaterThan(Long value) {
            addCriterion("PLAN_TEST_TIME >", value, "planTestTime");
            return (Criteria) this;
        }

        public Criteria andPlanTestTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("PLAN_TEST_TIME >=", value, "planTestTime");
            return (Criteria) this;
        }

        public Criteria andPlanTestTimeLessThan(Long value) {
            addCriterion("PLAN_TEST_TIME <", value, "planTestTime");
            return (Criteria) this;
        }

        public Criteria andPlanTestTimeLessThanOrEqualTo(Long value) {
            addCriterion("PLAN_TEST_TIME <=", value, "planTestTime");
            return (Criteria) this;
        }

        public Criteria andPlanTestTimeIn(List<Long> values) {
            addCriterion("PLAN_TEST_TIME in", values, "planTestTime");
            return (Criteria) this;
        }

        public Criteria andPlanTestTimeNotIn(List<Long> values) {
            addCriterion("PLAN_TEST_TIME not in", values, "planTestTime");
            return (Criteria) this;
        }

        public Criteria andPlanTestTimeBetween(Long value1, Long value2) {
            addCriterion("PLAN_TEST_TIME between", value1, value2, "planTestTime");
            return (Criteria) this;
        }

        public Criteria andPlanTestTimeNotBetween(Long value1, Long value2) {
            addCriterion("PLAN_TEST_TIME not between", value1, value2, "planTestTime");
            return (Criteria) this;
        }

        public Criteria andActualTestTimeIsNull() {
            addCriterion("ACTUAL_TEST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andActualTestTimeIsNotNull() {
            addCriterion("ACTUAL_TEST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andActualTestTimeEqualTo(Long value) {
            addCriterion("ACTUAL_TEST_TIME =", value, "actualTestTime");
            return (Criteria) this;
        }

        public Criteria andActualTestTimeNotEqualTo(Long value) {
            addCriterion("ACTUAL_TEST_TIME <>", value, "actualTestTime");
            return (Criteria) this;
        }

        public Criteria andActualTestTimeGreaterThan(Long value) {
            addCriterion("ACTUAL_TEST_TIME >", value, "actualTestTime");
            return (Criteria) this;
        }

        public Criteria andActualTestTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("ACTUAL_TEST_TIME >=", value, "actualTestTime");
            return (Criteria) this;
        }

        public Criteria andActualTestTimeLessThan(Long value) {
            addCriterion("ACTUAL_TEST_TIME <", value, "actualTestTime");
            return (Criteria) this;
        }

        public Criteria andActualTestTimeLessThanOrEqualTo(Long value) {
            addCriterion("ACTUAL_TEST_TIME <=", value, "actualTestTime");
            return (Criteria) this;
        }

        public Criteria andActualTestTimeIn(List<Long> values) {
            addCriterion("ACTUAL_TEST_TIME in", values, "actualTestTime");
            return (Criteria) this;
        }

        public Criteria andActualTestTimeNotIn(List<Long> values) {
            addCriterion("ACTUAL_TEST_TIME not in", values, "actualTestTime");
            return (Criteria) this;
        }

        public Criteria andActualTestTimeBetween(Long value1, Long value2) {
            addCriterion("ACTUAL_TEST_TIME between", value1, value2, "actualTestTime");
            return (Criteria) this;
        }

        public Criteria andActualTestTimeNotBetween(Long value1, Long value2) {
            addCriterion("ACTUAL_TEST_TIME not between", value1, value2, "actualTestTime");
            return (Criteria) this;
        }

        public Criteria andMaxNumBatchIsNull() {
            addCriterion("MAX_NUM_BATCH is null");
            return (Criteria) this;
        }

        public Criteria andMaxNumBatchIsNotNull() {
            addCriterion("MAX_NUM_BATCH is not null");
            return (Criteria) this;
        }

        public Criteria andMaxNumBatchEqualTo(Long value) {
            addCriterion("MAX_NUM_BATCH =", value, "maxNumBatch");
            return (Criteria) this;
        }

        public Criteria andMaxNumBatchNotEqualTo(Long value) {
            addCriterion("MAX_NUM_BATCH <>", value, "maxNumBatch");
            return (Criteria) this;
        }

        public Criteria andMaxNumBatchGreaterThan(Long value) {
            addCriterion("MAX_NUM_BATCH >", value, "maxNumBatch");
            return (Criteria) this;
        }

        public Criteria andMaxNumBatchGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_NUM_BATCH >=", value, "maxNumBatch");
            return (Criteria) this;
        }

        public Criteria andMaxNumBatchLessThan(Long value) {
            addCriterion("MAX_NUM_BATCH <", value, "maxNumBatch");
            return (Criteria) this;
        }

        public Criteria andMaxNumBatchLessThanOrEqualTo(Long value) {
            addCriterion("MAX_NUM_BATCH <=", value, "maxNumBatch");
            return (Criteria) this;
        }

        public Criteria andMaxNumBatchIn(List<Long> values) {
            addCriterion("MAX_NUM_BATCH in", values, "maxNumBatch");
            return (Criteria) this;
        }

        public Criteria andMaxNumBatchNotIn(List<Long> values) {
            addCriterion("MAX_NUM_BATCH not in", values, "maxNumBatch");
            return (Criteria) this;
        }

        public Criteria andMaxNumBatchBetween(Long value1, Long value2) {
            addCriterion("MAX_NUM_BATCH between", value1, value2, "maxNumBatch");
            return (Criteria) this;
        }

        public Criteria andMaxNumBatchNotBetween(Long value1, Long value2) {
            addCriterion("MAX_NUM_BATCH not between", value1, value2, "maxNumBatch");
            return (Criteria) this;
        }

        public Criteria andBaseFeeIsNull() {
            addCriterion("BASE_FEE is null");
            return (Criteria) this;
        }

        public Criteria andBaseFeeIsNotNull() {
            addCriterion("BASE_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andBaseFeeEqualTo(BigDecimal value) {
            addCriterion("BASE_FEE =", value, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeNotEqualTo(BigDecimal value) {
            addCriterion("BASE_FEE <>", value, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeGreaterThan(BigDecimal value) {
            addCriterion("BASE_FEE >", value, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_FEE >=", value, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeLessThan(BigDecimal value) {
            addCriterion("BASE_FEE <", value, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_FEE <=", value, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeIn(List<BigDecimal> values) {
            addCriterion("BASE_FEE in", values, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeNotIn(List<BigDecimal> values) {
            addCriterion("BASE_FEE not in", values, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_FEE between", value1, value2, "baseFee");
            return (Criteria) this;
        }

        public Criteria andBaseFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_FEE not between", value1, value2, "baseFee");
            return (Criteria) this;
        }

        public Criteria andTestFeeIsNull() {
            addCriterion("TEST_FEE is null");
            return (Criteria) this;
        }

        public Criteria andTestFeeIsNotNull() {
            addCriterion("TEST_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andTestFeeEqualTo(BigDecimal value) {
            addCriterion("TEST_FEE =", value, "testFee");
            return (Criteria) this;
        }

        public Criteria andTestFeeNotEqualTo(BigDecimal value) {
            addCriterion("TEST_FEE <>", value, "testFee");
            return (Criteria) this;
        }

        public Criteria andTestFeeGreaterThan(BigDecimal value) {
            addCriterion("TEST_FEE >", value, "testFee");
            return (Criteria) this;
        }

        public Criteria andTestFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEST_FEE >=", value, "testFee");
            return (Criteria) this;
        }

        public Criteria andTestFeeLessThan(BigDecimal value) {
            addCriterion("TEST_FEE <", value, "testFee");
            return (Criteria) this;
        }

        public Criteria andTestFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEST_FEE <=", value, "testFee");
            return (Criteria) this;
        }

        public Criteria andTestFeeIn(List<BigDecimal> values) {
            addCriterion("TEST_FEE in", values, "testFee");
            return (Criteria) this;
        }

        public Criteria andTestFeeNotIn(List<BigDecimal> values) {
            addCriterion("TEST_FEE not in", values, "testFee");
            return (Criteria) this;
        }

        public Criteria andTestFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEST_FEE between", value1, value2, "testFee");
            return (Criteria) this;
        }

        public Criteria andTestFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEST_FEE not between", value1, value2, "testFee");
            return (Criteria) this;
        }

        public Criteria andQuotesIsNull() {
            addCriterion("QUOTES is null");
            return (Criteria) this;
        }

        public Criteria andQuotesIsNotNull() {
            addCriterion("QUOTES is not null");
            return (Criteria) this;
        }

        public Criteria andQuotesEqualTo(BigDecimal value) {
            addCriterion("QUOTES =", value, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesNotEqualTo(BigDecimal value) {
            addCriterion("QUOTES <>", value, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesGreaterThan(BigDecimal value) {
            addCriterion("QUOTES >", value, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUOTES >=", value, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesLessThan(BigDecimal value) {
            addCriterion("QUOTES <", value, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUOTES <=", value, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesIn(List<BigDecimal> values) {
            addCriterion("QUOTES in", values, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesNotIn(List<BigDecimal> values) {
            addCriterion("QUOTES not in", values, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUOTES between", value1, value2, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUOTES not between", value1, value2, "quotes");
            return (Criteria) this;
        }

        public Criteria andActualTestFeeIsNull() {
            addCriterion("ACTUAL_TEST_FEE is null");
            return (Criteria) this;
        }

        public Criteria andActualTestFeeIsNotNull() {
            addCriterion("ACTUAL_TEST_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andActualTestFeeEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_TEST_FEE =", value, "actualTestFee");
            return (Criteria) this;
        }

        public Criteria andActualTestFeeNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_TEST_FEE <>", value, "actualTestFee");
            return (Criteria) this;
        }

        public Criteria andActualTestFeeGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_TEST_FEE >", value, "actualTestFee");
            return (Criteria) this;
        }

        public Criteria andActualTestFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_TEST_FEE >=", value, "actualTestFee");
            return (Criteria) this;
        }

        public Criteria andActualTestFeeLessThan(BigDecimal value) {
            addCriterion("ACTUAL_TEST_FEE <", value, "actualTestFee");
            return (Criteria) this;
        }

        public Criteria andActualTestFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_TEST_FEE <=", value, "actualTestFee");
            return (Criteria) this;
        }

        public Criteria andActualTestFeeIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_TEST_FEE in", values, "actualTestFee");
            return (Criteria) this;
        }

        public Criteria andActualTestFeeNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_TEST_FEE not in", values, "actualTestFee");
            return (Criteria) this;
        }

        public Criteria andActualTestFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_TEST_FEE between", value1, value2, "actualTestFee");
            return (Criteria) this;
        }

        public Criteria andActualTestFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_TEST_FEE not between", value1, value2, "actualTestFee");
            return (Criteria) this;
        }

        public Criteria andActualTotalCostIsNull() {
            addCriterion("ACTUAL_TOTAL_COST is null");
            return (Criteria) this;
        }

        public Criteria andActualTotalCostIsNotNull() {
            addCriterion("ACTUAL_TOTAL_COST is not null");
            return (Criteria) this;
        }

        public Criteria andActualTotalCostEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_TOTAL_COST =", value, "actualTotalCost");
            return (Criteria) this;
        }

        public Criteria andActualTotalCostNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_TOTAL_COST <>", value, "actualTotalCost");
            return (Criteria) this;
        }

        public Criteria andActualTotalCostGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_TOTAL_COST >", value, "actualTotalCost");
            return (Criteria) this;
        }

        public Criteria andActualTotalCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_TOTAL_COST >=", value, "actualTotalCost");
            return (Criteria) this;
        }

        public Criteria andActualTotalCostLessThan(BigDecimal value) {
            addCriterion("ACTUAL_TOTAL_COST <", value, "actualTotalCost");
            return (Criteria) this;
        }

        public Criteria andActualTotalCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_TOTAL_COST <=", value, "actualTotalCost");
            return (Criteria) this;
        }

        public Criteria andActualTotalCostIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_TOTAL_COST in", values, "actualTotalCost");
            return (Criteria) this;
        }

        public Criteria andActualTotalCostNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_TOTAL_COST not in", values, "actualTotalCost");
            return (Criteria) this;
        }

        public Criteria andActualTotalCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_TOTAL_COST between", value1, value2, "actualTotalCost");
            return (Criteria) this;
        }

        public Criteria andActualTotalCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_TOTAL_COST not between", value1, value2, "actualTotalCost");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionIsNull() {
            addCriterion("ANALYSIS_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionIsNotNull() {
            addCriterion("ANALYSIS_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionEqualTo(Long value) {
            addCriterion("ANALYSIS_VERSION =", value, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionNotEqualTo(Long value) {
            addCriterion("ANALYSIS_VERSION <>", value, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionGreaterThan(Long value) {
            addCriterion("ANALYSIS_VERSION >", value, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("ANALYSIS_VERSION >=", value, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionLessThan(Long value) {
            addCriterion("ANALYSIS_VERSION <", value, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionLessThanOrEqualTo(Long value) {
            addCriterion("ANALYSIS_VERSION <=", value, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionIn(List<Long> values) {
            addCriterion("ANALYSIS_VERSION in", values, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionNotIn(List<Long> values) {
            addCriterion("ANALYSIS_VERSION not in", values, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionBetween(Long value1, Long value2) {
            addCriterion("ANALYSIS_VERSION between", value1, value2, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionNotBetween(Long value1, Long value2) {
            addCriterion("ANALYSIS_VERSION not between", value1, value2, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andIsRecheckIsNull() {
            addCriterion("IS_RECHECK is null");
            return (Criteria) this;
        }

        public Criteria andIsRecheckIsNotNull() {
            addCriterion("IS_RECHECK is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecheckEqualTo(String value) {
            addCriterion("IS_RECHECK =", value, "isRecheck");
            return (Criteria) this;
        }

        public Criteria andIsRecheckNotEqualTo(String value) {
            addCriterion("IS_RECHECK <>", value, "isRecheck");
            return (Criteria) this;
        }

        public Criteria andIsRecheckGreaterThan(String value) {
            addCriterion("IS_RECHECK >", value, "isRecheck");
            return (Criteria) this;
        }

        public Criteria andIsRecheckGreaterThanOrEqualTo(String value) {
            addCriterion("IS_RECHECK >=", value, "isRecheck");
            return (Criteria) this;
        }

        public Criteria andIsRecheckLessThan(String value) {
            addCriterion("IS_RECHECK <", value, "isRecheck");
            return (Criteria) this;
        }

        public Criteria andIsRecheckLessThanOrEqualTo(String value) {
            addCriterion("IS_RECHECK <=", value, "isRecheck");
            return (Criteria) this;
        }

        public Criteria andIsRecheckLike(String value) {
            addCriterion("IS_RECHECK like", value, "isRecheck");
            return (Criteria) this;
        }

        public Criteria andIsRecheckNotLike(String value) {
            addCriterion("IS_RECHECK not like", value, "isRecheck");
            return (Criteria) this;
        }

        public Criteria andIsRecheckIn(List<String> values) {
            addCriterion("IS_RECHECK in", values, "isRecheck");
            return (Criteria) this;
        }

        public Criteria andIsRecheckNotIn(List<String> values) {
            addCriterion("IS_RECHECK not in", values, "isRecheck");
            return (Criteria) this;
        }

        public Criteria andIsRecheckBetween(String value1, String value2) {
            addCriterion("IS_RECHECK between", value1, value2, "isRecheck");
            return (Criteria) this;
        }

        public Criteria andIsRecheckNotBetween(String value1, String value2) {
            addCriterion("IS_RECHECK not between", value1, value2, "isRecheck");
            return (Criteria) this;
        }

        public Criteria andRecheckToIsNull() {
            addCriterion("RECHECK_TO is null");
            return (Criteria) this;
        }

        public Criteria andRecheckToIsNotNull() {
            addCriterion("RECHECK_TO is not null");
            return (Criteria) this;
        }

        public Criteria andRecheckToEqualTo(String value) {
            addCriterion("RECHECK_TO =", value, "recheckTo");
            return (Criteria) this;
        }

        public Criteria andRecheckToNotEqualTo(String value) {
            addCriterion("RECHECK_TO <>", value, "recheckTo");
            return (Criteria) this;
        }

        public Criteria andRecheckToGreaterThan(String value) {
            addCriterion("RECHECK_TO >", value, "recheckTo");
            return (Criteria) this;
        }

        public Criteria andRecheckToGreaterThanOrEqualTo(String value) {
            addCriterion("RECHECK_TO >=", value, "recheckTo");
            return (Criteria) this;
        }

        public Criteria andRecheckToLessThan(String value) {
            addCriterion("RECHECK_TO <", value, "recheckTo");
            return (Criteria) this;
        }

        public Criteria andRecheckToLessThanOrEqualTo(String value) {
            addCriterion("RECHECK_TO <=", value, "recheckTo");
            return (Criteria) this;
        }

        public Criteria andRecheckToLike(String value) {
            addCriterion("RECHECK_TO like", value, "recheckTo");
            return (Criteria) this;
        }

        public Criteria andRecheckToNotLike(String value) {
            addCriterion("RECHECK_TO not like", value, "recheckTo");
            return (Criteria) this;
        }

        public Criteria andRecheckToIn(List<String> values) {
            addCriterion("RECHECK_TO in", values, "recheckTo");
            return (Criteria) this;
        }

        public Criteria andRecheckToNotIn(List<String> values) {
            addCriterion("RECHECK_TO not in", values, "recheckTo");
            return (Criteria) this;
        }

        public Criteria andRecheckToBetween(String value1, String value2) {
            addCriterion("RECHECK_TO between", value1, value2, "recheckTo");
            return (Criteria) this;
        }

        public Criteria andRecheckToNotBetween(String value1, String value2) {
            addCriterion("RECHECK_TO not between", value1, value2, "recheckTo");
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

        public Criteria andIfPassIsNull() {
            addCriterion("IF_PASS is null");
            return (Criteria) this;
        }

        public Criteria andIfPassIsNotNull() {
            addCriterion("IF_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andIfPassEqualTo(String value) {
            addCriterion("IF_PASS =", value, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassNotEqualTo(String value) {
            addCriterion("IF_PASS <>", value, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassGreaterThan(String value) {
            addCriterion("IF_PASS >", value, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassGreaterThanOrEqualTo(String value) {
            addCriterion("IF_PASS >=", value, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassLessThan(String value) {
            addCriterion("IF_PASS <", value, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassLessThanOrEqualTo(String value) {
            addCriterion("IF_PASS <=", value, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassLike(String value) {
            addCriterion("IF_PASS like", value, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassNotLike(String value) {
            addCriterion("IF_PASS not like", value, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassIn(List<String> values) {
            addCriterion("IF_PASS in", values, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassNotIn(List<String> values) {
            addCriterion("IF_PASS not in", values, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassBetween(String value1, String value2) {
            addCriterion("IF_PASS between", value1, value2, "ifPass");
            return (Criteria) this;
        }

        public Criteria andIfPassNotBetween(String value1, String value2) {
            addCriterion("IF_PASS not between", value1, value2, "ifPass");
            return (Criteria) this;
        }

        public Criteria andCommentTechIsNull() {
            addCriterion("COMMENT_TECH is null");
            return (Criteria) this;
        }

        public Criteria andCommentTechIsNotNull() {
            addCriterion("COMMENT_TECH is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTechEqualTo(String value) {
            addCriterion("COMMENT_TECH =", value, "commentTech");
            return (Criteria) this;
        }

        public Criteria andCommentTechNotEqualTo(String value) {
            addCriterion("COMMENT_TECH <>", value, "commentTech");
            return (Criteria) this;
        }

        public Criteria andCommentTechGreaterThan(String value) {
            addCriterion("COMMENT_TECH >", value, "commentTech");
            return (Criteria) this;
        }

        public Criteria andCommentTechGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENT_TECH >=", value, "commentTech");
            return (Criteria) this;
        }

        public Criteria andCommentTechLessThan(String value) {
            addCriterion("COMMENT_TECH <", value, "commentTech");
            return (Criteria) this;
        }

        public Criteria andCommentTechLessThanOrEqualTo(String value) {
            addCriterion("COMMENT_TECH <=", value, "commentTech");
            return (Criteria) this;
        }

        public Criteria andCommentTechLike(String value) {
            addCriterion("COMMENT_TECH like", value, "commentTech");
            return (Criteria) this;
        }

        public Criteria andCommentTechNotLike(String value) {
            addCriterion("COMMENT_TECH not like", value, "commentTech");
            return (Criteria) this;
        }

        public Criteria andCommentTechIn(List<String> values) {
            addCriterion("COMMENT_TECH in", values, "commentTech");
            return (Criteria) this;
        }

        public Criteria andCommentTechNotIn(List<String> values) {
            addCriterion("COMMENT_TECH not in", values, "commentTech");
            return (Criteria) this;
        }

        public Criteria andCommentTechBetween(String value1, String value2) {
            addCriterion("COMMENT_TECH between", value1, value2, "commentTech");
            return (Criteria) this;
        }

        public Criteria andCommentTechNotBetween(String value1, String value2) {
            addCriterion("COMMENT_TECH not between", value1, value2, "commentTech");
            return (Criteria) this;
        }

        public Criteria andTestQuantityIsNull() {
            addCriterion("TEST_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andTestQuantityIsNotNull() {
            addCriterion("TEST_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andTestQuantityEqualTo(Long value) {
            addCriterion("TEST_QUANTITY =", value, "testQuantity");
            return (Criteria) this;
        }

        public Criteria andTestQuantityNotEqualTo(Long value) {
            addCriterion("TEST_QUANTITY <>", value, "testQuantity");
            return (Criteria) this;
        }

        public Criteria andTestQuantityGreaterThan(Long value) {
            addCriterion("TEST_QUANTITY >", value, "testQuantity");
            return (Criteria) this;
        }

        public Criteria andTestQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("TEST_QUANTITY >=", value, "testQuantity");
            return (Criteria) this;
        }

        public Criteria andTestQuantityLessThan(Long value) {
            addCriterion("TEST_QUANTITY <", value, "testQuantity");
            return (Criteria) this;
        }

        public Criteria andTestQuantityLessThanOrEqualTo(Long value) {
            addCriterion("TEST_QUANTITY <=", value, "testQuantity");
            return (Criteria) this;
        }

        public Criteria andTestQuantityIn(List<Long> values) {
            addCriterion("TEST_QUANTITY in", values, "testQuantity");
            return (Criteria) this;
        }

        public Criteria andTestQuantityNotIn(List<Long> values) {
            addCriterion("TEST_QUANTITY not in", values, "testQuantity");
            return (Criteria) this;
        }

        public Criteria andTestQuantityBetween(Long value1, Long value2) {
            addCriterion("TEST_QUANTITY between", value1, value2, "testQuantity");
            return (Criteria) this;
        }

        public Criteria andTestQuantityNotBetween(Long value1, Long value2) {
            addCriterion("TEST_QUANTITY not between", value1, value2, "testQuantity");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameIsNull() {
            addCriterion("TASK_REPORTED_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameIsNotNull() {
            addCriterion("TASK_REPORTED_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameEqualTo(String value) {
            addCriterion("TASK_REPORTED_NAME =", value, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameNotEqualTo(String value) {
            addCriterion("TASK_REPORTED_NAME <>", value, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameGreaterThan(String value) {
            addCriterion("TASK_REPORTED_NAME >", value, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_REPORTED_NAME >=", value, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameLessThan(String value) {
            addCriterion("TASK_REPORTED_NAME <", value, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_REPORTED_NAME <=", value, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameLike(String value) {
            addCriterion("TASK_REPORTED_NAME like", value, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameNotLike(String value) {
            addCriterion("TASK_REPORTED_NAME not like", value, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameIn(List<String> values) {
            addCriterion("TASK_REPORTED_NAME in", values, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameNotIn(List<String> values) {
            addCriterion("TASK_REPORTED_NAME not in", values, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameBetween(String value1, String value2) {
            addCriterion("TASK_REPORTED_NAME between", value1, value2, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameNotBetween(String value1, String value2) {
            addCriterion("TASK_REPORTED_NAME not between", value1, value2, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNull() {
            addCriterion("EXPIRY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNotNull() {
            addCriterion("EXPIRY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEqualTo(Date value) {
            addCriterionForJDBCDate("EXPIRY_DATE =", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("EXPIRY_DATE <>", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("EXPIRY_DATE >", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXPIRY_DATE >=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThan(Date value) {
            addCriterionForJDBCDate("EXPIRY_DATE <", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXPIRY_DATE <=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIn(List<Date> values) {
            addCriterionForJDBCDate("EXPIRY_DATE in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("EXPIRY_DATE not in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXPIRY_DATE between", value1, value2, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXPIRY_DATE not between", value1, value2, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andAssginToIsNull() {
            addCriterion("ASSGIN_TO is null");
            return (Criteria) this;
        }

        public Criteria andAssginToIsNotNull() {
            addCriterion("ASSGIN_TO is not null");
            return (Criteria) this;
        }

        public Criteria andAssginToEqualTo(String value) {
            addCriterion("ASSGIN_TO =", value, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToNotEqualTo(String value) {
            addCriterion("ASSGIN_TO <>", value, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToGreaterThan(String value) {
            addCriterion("ASSGIN_TO >", value, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToGreaterThanOrEqualTo(String value) {
            addCriterion("ASSGIN_TO >=", value, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToLessThan(String value) {
            addCriterion("ASSGIN_TO <", value, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToLessThanOrEqualTo(String value) {
            addCriterion("ASSGIN_TO <=", value, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToLike(String value) {
            addCriterion("ASSGIN_TO like", value, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToNotLike(String value) {
            addCriterion("ASSGIN_TO not like", value, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToIn(List<String> values) {
            addCriterion("ASSGIN_TO in", values, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToNotIn(List<String> values) {
            addCriterion("ASSGIN_TO not in", values, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToBetween(String value1, String value2) {
            addCriterion("ASSGIN_TO between", value1, value2, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToNotBetween(String value1, String value2) {
            addCriterion("ASSGIN_TO not between", value1, value2, "assginTo");
            return (Criteria) this;
        }

        public Criteria andLabIsNull() {
            addCriterion("LAB is null");
            return (Criteria) this;
        }

        public Criteria andLabIsNotNull() {
            addCriterion("LAB is not null");
            return (Criteria) this;
        }

        public Criteria andLabEqualTo(String value) {
            addCriterion("LAB =", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabNotEqualTo(String value) {
            addCriterion("LAB <>", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabGreaterThan(String value) {
            addCriterion("LAB >", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabGreaterThanOrEqualTo(String value) {
            addCriterion("LAB >=", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabLessThan(String value) {
            addCriterion("LAB <", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabLessThanOrEqualTo(String value) {
            addCriterion("LAB <=", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabLike(String value) {
            addCriterion("LAB like", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabNotLike(String value) {
            addCriterion("LAB not like", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabIn(List<String> values) {
            addCriterion("LAB in", values, "lab");
            return (Criteria) this;
        }

        public Criteria andLabNotIn(List<String> values) {
            addCriterion("LAB not in", values, "lab");
            return (Criteria) this;
        }

        public Criteria andLabBetween(String value1, String value2) {
            addCriterion("LAB between", value1, value2, "lab");
            return (Criteria) this;
        }

        public Criteria andLabNotBetween(String value1, String value2) {
            addCriterion("LAB not between", value1, value2, "lab");
            return (Criteria) this;
        }

        public Criteria andRedateIsNull() {
            addCriterion("REDATE is null");
            return (Criteria) this;
        }

        public Criteria andRedateIsNotNull() {
            addCriterion("REDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRedateEqualTo(BigDecimal value) {
            addCriterion("REDATE =", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateNotEqualTo(BigDecimal value) {
            addCriterion("REDATE <>", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateGreaterThan(BigDecimal value) {
            addCriterion("REDATE >", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REDATE >=", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateLessThan(BigDecimal value) {
            addCriterion("REDATE <", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REDATE <=", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateIn(List<BigDecimal> values) {
            addCriterion("REDATE in", values, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateNotIn(List<BigDecimal> values) {
            addCriterion("REDATE not in", values, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REDATE between", value1, value2, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REDATE not between", value1, value2, "redate");
            return (Criteria) this;
        }

        public Criteria andReadyForReviewIsNull() {
            addCriterion("READY_FOR_REVIEW is null");
            return (Criteria) this;
        }

        public Criteria andReadyForReviewIsNotNull() {
            addCriterion("READY_FOR_REVIEW is not null");
            return (Criteria) this;
        }

        public Criteria andReadyForReviewEqualTo(String value) {
            addCriterion("READY_FOR_REVIEW =", value, "readyForReview");
            return (Criteria) this;
        }

        public Criteria andReadyForReviewNotEqualTo(String value) {
            addCriterion("READY_FOR_REVIEW <>", value, "readyForReview");
            return (Criteria) this;
        }

        public Criteria andReadyForReviewGreaterThan(String value) {
            addCriterion("READY_FOR_REVIEW >", value, "readyForReview");
            return (Criteria) this;
        }

        public Criteria andReadyForReviewGreaterThanOrEqualTo(String value) {
            addCriterion("READY_FOR_REVIEW >=", value, "readyForReview");
            return (Criteria) this;
        }

        public Criteria andReadyForReviewLessThan(String value) {
            addCriterion("READY_FOR_REVIEW <", value, "readyForReview");
            return (Criteria) this;
        }

        public Criteria andReadyForReviewLessThanOrEqualTo(String value) {
            addCriterion("READY_FOR_REVIEW <=", value, "readyForReview");
            return (Criteria) this;
        }

        public Criteria andReadyForReviewLike(String value) {
            addCriterion("READY_FOR_REVIEW like", value, "readyForReview");
            return (Criteria) this;
        }

        public Criteria andReadyForReviewNotLike(String value) {
            addCriterion("READY_FOR_REVIEW not like", value, "readyForReview");
            return (Criteria) this;
        }

        public Criteria andReadyForReviewIn(List<String> values) {
            addCriterion("READY_FOR_REVIEW in", values, "readyForReview");
            return (Criteria) this;
        }

        public Criteria andReadyForReviewNotIn(List<String> values) {
            addCriterion("READY_FOR_REVIEW not in", values, "readyForReview");
            return (Criteria) this;
        }

        public Criteria andReadyForReviewBetween(String value1, String value2) {
            addCriterion("READY_FOR_REVIEW between", value1, value2, "readyForReview");
            return (Criteria) this;
        }

        public Criteria andReadyForReviewNotBetween(String value1, String value2) {
            addCriterion("READY_FOR_REVIEW not between", value1, value2, "readyForReview");
            return (Criteria) this;
        }

        public Criteria andRptAssginToIsNull() {
            addCriterion("RPT_ASSGIN_TO is null");
            return (Criteria) this;
        }

        public Criteria andRptAssginToIsNotNull() {
            addCriterion("RPT_ASSGIN_TO is not null");
            return (Criteria) this;
        }

        public Criteria andRptAssginToEqualTo(String value) {
            addCriterion("RPT_ASSGIN_TO =", value, "rptAssginTo");
            return (Criteria) this;
        }

        public Criteria andRptAssginToNotEqualTo(String value) {
            addCriterion("RPT_ASSGIN_TO <>", value, "rptAssginTo");
            return (Criteria) this;
        }

        public Criteria andRptAssginToGreaterThan(String value) {
            addCriterion("RPT_ASSGIN_TO >", value, "rptAssginTo");
            return (Criteria) this;
        }

        public Criteria andRptAssginToGreaterThanOrEqualTo(String value) {
            addCriterion("RPT_ASSGIN_TO >=", value, "rptAssginTo");
            return (Criteria) this;
        }

        public Criteria andRptAssginToLessThan(String value) {
            addCriterion("RPT_ASSGIN_TO <", value, "rptAssginTo");
            return (Criteria) this;
        }

        public Criteria andRptAssginToLessThanOrEqualTo(String value) {
            addCriterion("RPT_ASSGIN_TO <=", value, "rptAssginTo");
            return (Criteria) this;
        }

        public Criteria andRptAssginToLike(String value) {
            addCriterion("RPT_ASSGIN_TO like", value, "rptAssginTo");
            return (Criteria) this;
        }

        public Criteria andRptAssginToNotLike(String value) {
            addCriterion("RPT_ASSGIN_TO not like", value, "rptAssginTo");
            return (Criteria) this;
        }

        public Criteria andRptAssginToIn(List<String> values) {
            addCriterion("RPT_ASSGIN_TO in", values, "rptAssginTo");
            return (Criteria) this;
        }

        public Criteria andRptAssginToNotIn(List<String> values) {
            addCriterion("RPT_ASSGIN_TO not in", values, "rptAssginTo");
            return (Criteria) this;
        }

        public Criteria andRptAssginToBetween(String value1, String value2) {
            addCriterion("RPT_ASSGIN_TO between", value1, value2, "rptAssginTo");
            return (Criteria) this;
        }

        public Criteria andRptAssginToNotBetween(String value1, String value2) {
            addCriterion("RPT_ASSGIN_TO not between", value1, value2, "rptAssginTo");
            return (Criteria) this;
        }

        public Criteria andReadyForDraftIsNull() {
            addCriterion("READY_FOR_DRAFT is null");
            return (Criteria) this;
        }

        public Criteria andReadyForDraftIsNotNull() {
            addCriterion("READY_FOR_DRAFT is not null");
            return (Criteria) this;
        }

        public Criteria andReadyForDraftEqualTo(String value) {
            addCriterion("READY_FOR_DRAFT =", value, "readyForDraft");
            return (Criteria) this;
        }

        public Criteria andReadyForDraftNotEqualTo(String value) {
            addCriterion("READY_FOR_DRAFT <>", value, "readyForDraft");
            return (Criteria) this;
        }

        public Criteria andReadyForDraftGreaterThan(String value) {
            addCriterion("READY_FOR_DRAFT >", value, "readyForDraft");
            return (Criteria) this;
        }

        public Criteria andReadyForDraftGreaterThanOrEqualTo(String value) {
            addCriterion("READY_FOR_DRAFT >=", value, "readyForDraft");
            return (Criteria) this;
        }

        public Criteria andReadyForDraftLessThan(String value) {
            addCriterion("READY_FOR_DRAFT <", value, "readyForDraft");
            return (Criteria) this;
        }

        public Criteria andReadyForDraftLessThanOrEqualTo(String value) {
            addCriterion("READY_FOR_DRAFT <=", value, "readyForDraft");
            return (Criteria) this;
        }

        public Criteria andReadyForDraftLike(String value) {
            addCriterion("READY_FOR_DRAFT like", value, "readyForDraft");
            return (Criteria) this;
        }

        public Criteria andReadyForDraftNotLike(String value) {
            addCriterion("READY_FOR_DRAFT not like", value, "readyForDraft");
            return (Criteria) this;
        }

        public Criteria andReadyForDraftIn(List<String> values) {
            addCriterion("READY_FOR_DRAFT in", values, "readyForDraft");
            return (Criteria) this;
        }

        public Criteria andReadyForDraftNotIn(List<String> values) {
            addCriterion("READY_FOR_DRAFT not in", values, "readyForDraft");
            return (Criteria) this;
        }

        public Criteria andReadyForDraftBetween(String value1, String value2) {
            addCriterion("READY_FOR_DRAFT between", value1, value2, "readyForDraft");
            return (Criteria) this;
        }

        public Criteria andReadyForDraftNotBetween(String value1, String value2) {
            addCriterion("READY_FOR_DRAFT not between", value1, value2, "readyForDraft");
            return (Criteria) this;
        }

        public Criteria andDraftApplyOnIsNull() {
            addCriterion("DRAFT_APPLY_ON is null");
            return (Criteria) this;
        }

        public Criteria andDraftApplyOnIsNotNull() {
            addCriterion("DRAFT_APPLY_ON is not null");
            return (Criteria) this;
        }

        public Criteria andDraftApplyOnEqualTo(Date value) {
            addCriterionForJDBCDate("DRAFT_APPLY_ON =", value, "draftApplyOn");
            return (Criteria) this;
        }

        public Criteria andDraftApplyOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("DRAFT_APPLY_ON <>", value, "draftApplyOn");
            return (Criteria) this;
        }

        public Criteria andDraftApplyOnGreaterThan(Date value) {
            addCriterionForJDBCDate("DRAFT_APPLY_ON >", value, "draftApplyOn");
            return (Criteria) this;
        }

        public Criteria andDraftApplyOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DRAFT_APPLY_ON >=", value, "draftApplyOn");
            return (Criteria) this;
        }

        public Criteria andDraftApplyOnLessThan(Date value) {
            addCriterionForJDBCDate("DRAFT_APPLY_ON <", value, "draftApplyOn");
            return (Criteria) this;
        }

        public Criteria andDraftApplyOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DRAFT_APPLY_ON <=", value, "draftApplyOn");
            return (Criteria) this;
        }

        public Criteria andDraftApplyOnIn(List<Date> values) {
            addCriterionForJDBCDate("DRAFT_APPLY_ON in", values, "draftApplyOn");
            return (Criteria) this;
        }

        public Criteria andDraftApplyOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("DRAFT_APPLY_ON not in", values, "draftApplyOn");
            return (Criteria) this;
        }

        public Criteria andDraftApplyOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DRAFT_APPLY_ON between", value1, value2, "draftApplyOn");
            return (Criteria) this;
        }

        public Criteria andDraftApplyOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DRAFT_APPLY_ON not between", value1, value2, "draftApplyOn");
            return (Criteria) this;
        }

        public Criteria andDraftApplyByIsNull() {
            addCriterion("DRAFT_APPLY_BY is null");
            return (Criteria) this;
        }

        public Criteria andDraftApplyByIsNotNull() {
            addCriterion("DRAFT_APPLY_BY is not null");
            return (Criteria) this;
        }

        public Criteria andDraftApplyByEqualTo(String value) {
            addCriterion("DRAFT_APPLY_BY =", value, "draftApplyBy");
            return (Criteria) this;
        }

        public Criteria andDraftApplyByNotEqualTo(String value) {
            addCriterion("DRAFT_APPLY_BY <>", value, "draftApplyBy");
            return (Criteria) this;
        }

        public Criteria andDraftApplyByGreaterThan(String value) {
            addCriterion("DRAFT_APPLY_BY >", value, "draftApplyBy");
            return (Criteria) this;
        }

        public Criteria andDraftApplyByGreaterThanOrEqualTo(String value) {
            addCriterion("DRAFT_APPLY_BY >=", value, "draftApplyBy");
            return (Criteria) this;
        }

        public Criteria andDraftApplyByLessThan(String value) {
            addCriterion("DRAFT_APPLY_BY <", value, "draftApplyBy");
            return (Criteria) this;
        }

        public Criteria andDraftApplyByLessThanOrEqualTo(String value) {
            addCriterion("DRAFT_APPLY_BY <=", value, "draftApplyBy");
            return (Criteria) this;
        }

        public Criteria andDraftApplyByLike(String value) {
            addCriterion("DRAFT_APPLY_BY like", value, "draftApplyBy");
            return (Criteria) this;
        }

        public Criteria andDraftApplyByNotLike(String value) {
            addCriterion("DRAFT_APPLY_BY not like", value, "draftApplyBy");
            return (Criteria) this;
        }

        public Criteria andDraftApplyByIn(List<String> values) {
            addCriterion("DRAFT_APPLY_BY in", values, "draftApplyBy");
            return (Criteria) this;
        }

        public Criteria andDraftApplyByNotIn(List<String> values) {
            addCriterion("DRAFT_APPLY_BY not in", values, "draftApplyBy");
            return (Criteria) this;
        }

        public Criteria andDraftApplyByBetween(String value1, String value2) {
            addCriterion("DRAFT_APPLY_BY between", value1, value2, "draftApplyBy");
            return (Criteria) this;
        }

        public Criteria andDraftApplyByNotBetween(String value1, String value2) {
            addCriterion("DRAFT_APPLY_BY not between", value1, value2, "draftApplyBy");
            return (Criteria) this;
        }

        public Criteria andReportNumberIsNull() {
            addCriterion("REPORT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andReportNumberIsNotNull() {
            addCriterion("REPORT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andReportNumberEqualTo(Long value) {
            addCriterion("REPORT_NUMBER =", value, "reportNumber");
            return (Criteria) this;
        }

        public Criteria andReportNumberNotEqualTo(Long value) {
            addCriterion("REPORT_NUMBER <>", value, "reportNumber");
            return (Criteria) this;
        }

        public Criteria andReportNumberGreaterThan(Long value) {
            addCriterion("REPORT_NUMBER >", value, "reportNumber");
            return (Criteria) this;
        }

        public Criteria andReportNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("REPORT_NUMBER >=", value, "reportNumber");
            return (Criteria) this;
        }

        public Criteria andReportNumberLessThan(Long value) {
            addCriterion("REPORT_NUMBER <", value, "reportNumber");
            return (Criteria) this;
        }

        public Criteria andReportNumberLessThanOrEqualTo(Long value) {
            addCriterion("REPORT_NUMBER <=", value, "reportNumber");
            return (Criteria) this;
        }

        public Criteria andReportNumberIn(List<Long> values) {
            addCriterion("REPORT_NUMBER in", values, "reportNumber");
            return (Criteria) this;
        }

        public Criteria andReportNumberNotIn(List<Long> values) {
            addCriterion("REPORT_NUMBER not in", values, "reportNumber");
            return (Criteria) this;
        }

        public Criteria andReportNumberBetween(Long value1, Long value2) {
            addCriterion("REPORT_NUMBER between", value1, value2, "reportNumber");
            return (Criteria) this;
        }

        public Criteria andReportNumberNotBetween(Long value1, Long value2) {
            addCriterion("REPORT_NUMBER not between", value1, value2, "reportNumber");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleIsNull() {
            addCriterion("ASSIGNED_SAMPLE is null");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleIsNotNull() {
            addCriterion("ASSIGNED_SAMPLE is not null");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleEqualTo(String value) {
            addCriterion("ASSIGNED_SAMPLE =", value, "assignedSample");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleNotEqualTo(String value) {
            addCriterion("ASSIGNED_SAMPLE <>", value, "assignedSample");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleGreaterThan(String value) {
            addCriterion("ASSIGNED_SAMPLE >", value, "assignedSample");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGNED_SAMPLE >=", value, "assignedSample");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleLessThan(String value) {
            addCriterion("ASSIGNED_SAMPLE <", value, "assignedSample");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleLessThanOrEqualTo(String value) {
            addCriterion("ASSIGNED_SAMPLE <=", value, "assignedSample");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleLike(String value) {
            addCriterion("ASSIGNED_SAMPLE like", value, "assignedSample");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleNotLike(String value) {
            addCriterion("ASSIGNED_SAMPLE not like", value, "assignedSample");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleIn(List<String> values) {
            addCriterion("ASSIGNED_SAMPLE in", values, "assignedSample");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleNotIn(List<String> values) {
            addCriterion("ASSIGNED_SAMPLE not in", values, "assignedSample");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleBetween(String value1, String value2) {
            addCriterion("ASSIGNED_SAMPLE between", value1, value2, "assignedSample");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleNotBetween(String value1, String value2) {
            addCriterion("ASSIGNED_SAMPLE not between", value1, value2, "assignedSample");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleDisplayIsNull() {
            addCriterion("ASSIGNED_SAMPLE_DISPLAY is null");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleDisplayIsNotNull() {
            addCriterion("ASSIGNED_SAMPLE_DISPLAY is not null");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleDisplayEqualTo(String value) {
            addCriterion("ASSIGNED_SAMPLE_DISPLAY =", value, "assignedSampleDisplay");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleDisplayNotEqualTo(String value) {
            addCriterion("ASSIGNED_SAMPLE_DISPLAY <>", value, "assignedSampleDisplay");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleDisplayGreaterThan(String value) {
            addCriterion("ASSIGNED_SAMPLE_DISPLAY >", value, "assignedSampleDisplay");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleDisplayGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGNED_SAMPLE_DISPLAY >=", value, "assignedSampleDisplay");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleDisplayLessThan(String value) {
            addCriterion("ASSIGNED_SAMPLE_DISPLAY <", value, "assignedSampleDisplay");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleDisplayLessThanOrEqualTo(String value) {
            addCriterion("ASSIGNED_SAMPLE_DISPLAY <=", value, "assignedSampleDisplay");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleDisplayLike(String value) {
            addCriterion("ASSIGNED_SAMPLE_DISPLAY like", value, "assignedSampleDisplay");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleDisplayNotLike(String value) {
            addCriterion("ASSIGNED_SAMPLE_DISPLAY not like", value, "assignedSampleDisplay");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleDisplayIn(List<String> values) {
            addCriterion("ASSIGNED_SAMPLE_DISPLAY in", values, "assignedSampleDisplay");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleDisplayNotIn(List<String> values) {
            addCriterion("ASSIGNED_SAMPLE_DISPLAY not in", values, "assignedSampleDisplay");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleDisplayBetween(String value1, String value2) {
            addCriterion("ASSIGNED_SAMPLE_DISPLAY between", value1, value2, "assignedSampleDisplay");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleDisplayNotBetween(String value1, String value2) {
            addCriterion("ASSIGNED_SAMPLE_DISPLAY not between", value1, value2, "assignedSampleDisplay");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityIsNull() {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityIsNotNull() {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityEqualTo(Long value) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY =", value, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityNotEqualTo(Long value) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY <>", value, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityGreaterThan(Long value) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY >", value, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY >=", value, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityLessThan(Long value) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY <", value, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityLessThanOrEqualTo(Long value) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY <=", value, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityIn(List<Long> values) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY in", values, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityNotIn(List<Long> values) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY not in", values, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityBetween(Long value1, Long value2) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY between", value1, value2, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityNotBetween(Long value1, Long value2) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY not between", value1, value2, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkHoursIsNull() {
            addCriterion("ADDITIONAL_WORK_HOURS is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkHoursIsNotNull() {
            addCriterion("ADDITIONAL_WORK_HOURS is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkHoursEqualTo(Long value) {
            addCriterion("ADDITIONAL_WORK_HOURS =", value, "additionalWorkHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkHoursNotEqualTo(Long value) {
            addCriterion("ADDITIONAL_WORK_HOURS <>", value, "additionalWorkHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkHoursGreaterThan(Long value) {
            addCriterion("ADDITIONAL_WORK_HOURS >", value, "additionalWorkHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkHoursGreaterThanOrEqualTo(Long value) {
            addCriterion("ADDITIONAL_WORK_HOURS >=", value, "additionalWorkHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkHoursLessThan(Long value) {
            addCriterion("ADDITIONAL_WORK_HOURS <", value, "additionalWorkHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkHoursLessThanOrEqualTo(Long value) {
            addCriterion("ADDITIONAL_WORK_HOURS <=", value, "additionalWorkHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkHoursIn(List<Long> values) {
            addCriterion("ADDITIONAL_WORK_HOURS in", values, "additionalWorkHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkHoursNotIn(List<Long> values) {
            addCriterion("ADDITIONAL_WORK_HOURS not in", values, "additionalWorkHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkHoursBetween(Long value1, Long value2) {
            addCriterion("ADDITIONAL_WORK_HOURS between", value1, value2, "additionalWorkHours");
            return (Criteria) this;
        }

        public Criteria andAdditionalWorkHoursNotBetween(Long value1, Long value2) {
            addCriterion("ADDITIONAL_WORK_HOURS not between", value1, value2, "additionalWorkHours");
            return (Criteria) this;
        }

        public Criteria andSurchargeIsNull() {
            addCriterion("SURCHARGE is null");
            return (Criteria) this;
        }

        public Criteria andSurchargeIsNotNull() {
            addCriterion("SURCHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andSurchargeEqualTo(BigDecimal value) {
            addCriterion("SURCHARGE =", value, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeNotEqualTo(BigDecimal value) {
            addCriterion("SURCHARGE <>", value, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeGreaterThan(BigDecimal value) {
            addCriterion("SURCHARGE >", value, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SURCHARGE >=", value, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeLessThan(BigDecimal value) {
            addCriterion("SURCHARGE <", value, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SURCHARGE <=", value, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeIn(List<BigDecimal> values) {
            addCriterion("SURCHARGE in", values, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeNotIn(List<BigDecimal> values) {
            addCriterion("SURCHARGE not in", values, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SURCHARGE between", value1, value2, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SURCHARGE not between", value1, value2, "surcharge");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeIsNull() {
            addCriterion("ACTUAL_BASE_FEE is null");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeIsNotNull() {
            addCriterion("ACTUAL_BASE_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_BASE_FEE =", value, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_BASE_FEE <>", value, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_BASE_FEE >", value, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_BASE_FEE >=", value, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeLessThan(BigDecimal value) {
            addCriterion("ACTUAL_BASE_FEE <", value, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_BASE_FEE <=", value, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_BASE_FEE in", values, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_BASE_FEE not in", values, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_BASE_FEE between", value1, value2, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualBaseFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_BASE_FEE not between", value1, value2, "actualBaseFee");
            return (Criteria) this;
        }

        public Criteria andActualSurchargeIsNull() {
            addCriterion("ACTUAL_SURCHARGE is null");
            return (Criteria) this;
        }

        public Criteria andActualSurchargeIsNotNull() {
            addCriterion("ACTUAL_SURCHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andActualSurchargeEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_SURCHARGE =", value, "actualSurcharge");
            return (Criteria) this;
        }

        public Criteria andActualSurchargeNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_SURCHARGE <>", value, "actualSurcharge");
            return (Criteria) this;
        }

        public Criteria andActualSurchargeGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_SURCHARGE >", value, "actualSurcharge");
            return (Criteria) this;
        }

        public Criteria andActualSurchargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_SURCHARGE >=", value, "actualSurcharge");
            return (Criteria) this;
        }

        public Criteria andActualSurchargeLessThan(BigDecimal value) {
            addCriterion("ACTUAL_SURCHARGE <", value, "actualSurcharge");
            return (Criteria) this;
        }

        public Criteria andActualSurchargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_SURCHARGE <=", value, "actualSurcharge");
            return (Criteria) this;
        }

        public Criteria andActualSurchargeIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_SURCHARGE in", values, "actualSurcharge");
            return (Criteria) this;
        }

        public Criteria andActualSurchargeNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_SURCHARGE not in", values, "actualSurcharge");
            return (Criteria) this;
        }

        public Criteria andActualSurchargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_SURCHARGE between", value1, value2, "actualSurcharge");
            return (Criteria) this;
        }

        public Criteria andActualSurchargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_SURCHARGE not between", value1, value2, "actualSurcharge");
            return (Criteria) this;
        }

        public Criteria andActualTestQtyIsNull() {
            addCriterion("ACTUAL_TEST_QTY is null");
            return (Criteria) this;
        }

        public Criteria andActualTestQtyIsNotNull() {
            addCriterion("ACTUAL_TEST_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andActualTestQtyEqualTo(Long value) {
            addCriterion("ACTUAL_TEST_QTY =", value, "actualTestQty");
            return (Criteria) this;
        }

        public Criteria andActualTestQtyNotEqualTo(Long value) {
            addCriterion("ACTUAL_TEST_QTY <>", value, "actualTestQty");
            return (Criteria) this;
        }

        public Criteria andActualTestQtyGreaterThan(Long value) {
            addCriterion("ACTUAL_TEST_QTY >", value, "actualTestQty");
            return (Criteria) this;
        }

        public Criteria andActualTestQtyGreaterThanOrEqualTo(Long value) {
            addCriterion("ACTUAL_TEST_QTY >=", value, "actualTestQty");
            return (Criteria) this;
        }

        public Criteria andActualTestQtyLessThan(Long value) {
            addCriterion("ACTUAL_TEST_QTY <", value, "actualTestQty");
            return (Criteria) this;
        }

        public Criteria andActualTestQtyLessThanOrEqualTo(Long value) {
            addCriterion("ACTUAL_TEST_QTY <=", value, "actualTestQty");
            return (Criteria) this;
        }

        public Criteria andActualTestQtyIn(List<Long> values) {
            addCriterion("ACTUAL_TEST_QTY in", values, "actualTestQty");
            return (Criteria) this;
        }

        public Criteria andActualTestQtyNotIn(List<Long> values) {
            addCriterion("ACTUAL_TEST_QTY not in", values, "actualTestQty");
            return (Criteria) this;
        }

        public Criteria andActualTestQtyBetween(Long value1, Long value2) {
            addCriterion("ACTUAL_TEST_QTY between", value1, value2, "actualTestQty");
            return (Criteria) this;
        }

        public Criteria andActualTestQtyNotBetween(Long value1, Long value2) {
            addCriterion("ACTUAL_TEST_QTY not between", value1, value2, "actualTestQty");
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

        public Criteria andReviewedOnIsNull() {
            addCriterion("REVIEWED_ON is null");
            return (Criteria) this;
        }

        public Criteria andReviewedOnIsNotNull() {
            addCriterion("REVIEWED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andReviewedOnEqualTo(Date value) {
            addCriterionForJDBCDate("REVIEWED_ON =", value, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("REVIEWED_ON <>", value, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnGreaterThan(Date value) {
            addCriterionForJDBCDate("REVIEWED_ON >", value, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REVIEWED_ON >=", value, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnLessThan(Date value) {
            addCriterionForJDBCDate("REVIEWED_ON <", value, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REVIEWED_ON <=", value, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnIn(List<Date> values) {
            addCriterionForJDBCDate("REVIEWED_ON in", values, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("REVIEWED_ON not in", values, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REVIEWED_ON between", value1, value2, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REVIEWED_ON not between", value1, value2, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByIsNull() {
            addCriterion("RPT_AUTHORIZED_BY is null");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByIsNotNull() {
            addCriterion("RPT_AUTHORIZED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByEqualTo(String value) {
            addCriterion("RPT_AUTHORIZED_BY =", value, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByNotEqualTo(String value) {
            addCriterion("RPT_AUTHORIZED_BY <>", value, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByGreaterThan(String value) {
            addCriterion("RPT_AUTHORIZED_BY >", value, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByGreaterThanOrEqualTo(String value) {
            addCriterion("RPT_AUTHORIZED_BY >=", value, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByLessThan(String value) {
            addCriterion("RPT_AUTHORIZED_BY <", value, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByLessThanOrEqualTo(String value) {
            addCriterion("RPT_AUTHORIZED_BY <=", value, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByLike(String value) {
            addCriterion("RPT_AUTHORIZED_BY like", value, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByNotLike(String value) {
            addCriterion("RPT_AUTHORIZED_BY not like", value, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByIn(List<String> values) {
            addCriterion("RPT_AUTHORIZED_BY in", values, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByNotIn(List<String> values) {
            addCriterion("RPT_AUTHORIZED_BY not in", values, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByBetween(String value1, String value2) {
            addCriterion("RPT_AUTHORIZED_BY between", value1, value2, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByNotBetween(String value1, String value2) {
            addCriterion("RPT_AUTHORIZED_BY not between", value1, value2, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnIsNull() {
            addCriterion("RPT_AUTHORIZED_ON is null");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnIsNotNull() {
            addCriterion("RPT_AUTHORIZED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnEqualTo(Date value) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON =", value, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON <>", value, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnGreaterThan(Date value) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON >", value, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON >=", value, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnLessThan(Date value) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON <", value, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON <=", value, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnIn(List<Date> values) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON in", values, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON not in", values, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON between", value1, value2, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON not between", value1, value2, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedIsNull() {
            addCriterion("RPT_AUTHORIZED is null");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedIsNotNull() {
            addCriterion("RPT_AUTHORIZED is not null");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedEqualTo(String value) {
            addCriterion("RPT_AUTHORIZED =", value, "rptAuthorized");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedNotEqualTo(String value) {
            addCriterion("RPT_AUTHORIZED <>", value, "rptAuthorized");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedGreaterThan(String value) {
            addCriterion("RPT_AUTHORIZED >", value, "rptAuthorized");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedGreaterThanOrEqualTo(String value) {
            addCriterion("RPT_AUTHORIZED >=", value, "rptAuthorized");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedLessThan(String value) {
            addCriterion("RPT_AUTHORIZED <", value, "rptAuthorized");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedLessThanOrEqualTo(String value) {
            addCriterion("RPT_AUTHORIZED <=", value, "rptAuthorized");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedLike(String value) {
            addCriterion("RPT_AUTHORIZED like", value, "rptAuthorized");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedNotLike(String value) {
            addCriterion("RPT_AUTHORIZED not like", value, "rptAuthorized");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedIn(List<String> values) {
            addCriterion("RPT_AUTHORIZED in", values, "rptAuthorized");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedNotIn(List<String> values) {
            addCriterion("RPT_AUTHORIZED not in", values, "rptAuthorized");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedBetween(String value1, String value2) {
            addCriterion("RPT_AUTHORIZED between", value1, value2, "rptAuthorized");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedNotBetween(String value1, String value2) {
            addCriterion("RPT_AUTHORIZED not between", value1, value2, "rptAuthorized");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentCIsNull() {
            addCriterion("RPT_REJECT_COMMENT_C is null");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentCIsNotNull() {
            addCriterion("RPT_REJECT_COMMENT_C is not null");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentCEqualTo(String value) {
            addCriterion("RPT_REJECT_COMMENT_C =", value, "rptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentCNotEqualTo(String value) {
            addCriterion("RPT_REJECT_COMMENT_C <>", value, "rptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentCGreaterThan(String value) {
            addCriterion("RPT_REJECT_COMMENT_C >", value, "rptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentCGreaterThanOrEqualTo(String value) {
            addCriterion("RPT_REJECT_COMMENT_C >=", value, "rptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentCLessThan(String value) {
            addCriterion("RPT_REJECT_COMMENT_C <", value, "rptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentCLessThanOrEqualTo(String value) {
            addCriterion("RPT_REJECT_COMMENT_C <=", value, "rptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentCLike(String value) {
            addCriterion("RPT_REJECT_COMMENT_C like", value, "rptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentCNotLike(String value) {
            addCriterion("RPT_REJECT_COMMENT_C not like", value, "rptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentCIn(List<String> values) {
            addCriterion("RPT_REJECT_COMMENT_C in", values, "rptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentCNotIn(List<String> values) {
            addCriterion("RPT_REJECT_COMMENT_C not in", values, "rptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentCBetween(String value1, String value2) {
            addCriterion("RPT_REJECT_COMMENT_C between", value1, value2, "rptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentCNotBetween(String value1, String value2) {
            addCriterion("RPT_REJECT_COMMENT_C not between", value1, value2, "rptRejectCommentC");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentSIsNull() {
            addCriterion("RPT_REJECT_COMMENT_S is null");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentSIsNotNull() {
            addCriterion("RPT_REJECT_COMMENT_S is not null");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentSEqualTo(String value) {
            addCriterion("RPT_REJECT_COMMENT_S =", value, "rptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentSNotEqualTo(String value) {
            addCriterion("RPT_REJECT_COMMENT_S <>", value, "rptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentSGreaterThan(String value) {
            addCriterion("RPT_REJECT_COMMENT_S >", value, "rptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentSGreaterThanOrEqualTo(String value) {
            addCriterion("RPT_REJECT_COMMENT_S >=", value, "rptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentSLessThan(String value) {
            addCriterion("RPT_REJECT_COMMENT_S <", value, "rptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentSLessThanOrEqualTo(String value) {
            addCriterion("RPT_REJECT_COMMENT_S <=", value, "rptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentSLike(String value) {
            addCriterion("RPT_REJECT_COMMENT_S like", value, "rptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentSNotLike(String value) {
            addCriterion("RPT_REJECT_COMMENT_S not like", value, "rptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentSIn(List<String> values) {
            addCriterion("RPT_REJECT_COMMENT_S in", values, "rptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentSNotIn(List<String> values) {
            addCriterion("RPT_REJECT_COMMENT_S not in", values, "rptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentSBetween(String value1, String value2) {
            addCriterion("RPT_REJECT_COMMENT_S between", value1, value2, "rptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andRptRejectCommentSNotBetween(String value1, String value2) {
            addCriterion("RPT_REJECT_COMMENT_S not between", value1, value2, "rptRejectCommentS");
            return (Criteria) this;
        }

        public Criteria andRptConclusionIsNull() {
            addCriterion("RPT_CONCLUSION is null");
            return (Criteria) this;
        }

        public Criteria andRptConclusionIsNotNull() {
            addCriterion("RPT_CONCLUSION is not null");
            return (Criteria) this;
        }

        public Criteria andRptConclusionEqualTo(String value) {
            addCriterion("RPT_CONCLUSION =", value, "rptConclusion");
            return (Criteria) this;
        }

        public Criteria andRptConclusionNotEqualTo(String value) {
            addCriterion("RPT_CONCLUSION <>", value, "rptConclusion");
            return (Criteria) this;
        }

        public Criteria andRptConclusionGreaterThan(String value) {
            addCriterion("RPT_CONCLUSION >", value, "rptConclusion");
            return (Criteria) this;
        }

        public Criteria andRptConclusionGreaterThanOrEqualTo(String value) {
            addCriterion("RPT_CONCLUSION >=", value, "rptConclusion");
            return (Criteria) this;
        }

        public Criteria andRptConclusionLessThan(String value) {
            addCriterion("RPT_CONCLUSION <", value, "rptConclusion");
            return (Criteria) this;
        }

        public Criteria andRptConclusionLessThanOrEqualTo(String value) {
            addCriterion("RPT_CONCLUSION <=", value, "rptConclusion");
            return (Criteria) this;
        }

        public Criteria andRptConclusionLike(String value) {
            addCriterion("RPT_CONCLUSION like", value, "rptConclusion");
            return (Criteria) this;
        }

        public Criteria andRptConclusionNotLike(String value) {
            addCriterion("RPT_CONCLUSION not like", value, "rptConclusion");
            return (Criteria) this;
        }

        public Criteria andRptConclusionIn(List<String> values) {
            addCriterion("RPT_CONCLUSION in", values, "rptConclusion");
            return (Criteria) this;
        }

        public Criteria andRptConclusionNotIn(List<String> values) {
            addCriterion("RPT_CONCLUSION not in", values, "rptConclusion");
            return (Criteria) this;
        }

        public Criteria andRptConclusionBetween(String value1, String value2) {
            addCriterion("RPT_CONCLUSION between", value1, value2, "rptConclusion");
            return (Criteria) this;
        }

        public Criteria andRptConclusionNotBetween(String value1, String value2) {
            addCriterion("RPT_CONCLUSION not between", value1, value2, "rptConclusion");
            return (Criteria) this;
        }

        public Criteria andCSubmitByIsNull() {
            addCriterion("C_SUBMIT_BY is null");
            return (Criteria) this;
        }

        public Criteria andCSubmitByIsNotNull() {
            addCriterion("C_SUBMIT_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCSubmitByEqualTo(String value) {
            addCriterion("C_SUBMIT_BY =", value, "cSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCSubmitByNotEqualTo(String value) {
            addCriterion("C_SUBMIT_BY <>", value, "cSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCSubmitByGreaterThan(String value) {
            addCriterion("C_SUBMIT_BY >", value, "cSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCSubmitByGreaterThanOrEqualTo(String value) {
            addCriterion("C_SUBMIT_BY >=", value, "cSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCSubmitByLessThan(String value) {
            addCriterion("C_SUBMIT_BY <", value, "cSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCSubmitByLessThanOrEqualTo(String value) {
            addCriterion("C_SUBMIT_BY <=", value, "cSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCSubmitByLike(String value) {
            addCriterion("C_SUBMIT_BY like", value, "cSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCSubmitByNotLike(String value) {
            addCriterion("C_SUBMIT_BY not like", value, "cSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCSubmitByIn(List<String> values) {
            addCriterion("C_SUBMIT_BY in", values, "cSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCSubmitByNotIn(List<String> values) {
            addCriterion("C_SUBMIT_BY not in", values, "cSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCSubmitByBetween(String value1, String value2) {
            addCriterion("C_SUBMIT_BY between", value1, value2, "cSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCSubmitByNotBetween(String value1, String value2) {
            addCriterion("C_SUBMIT_BY not between", value1, value2, "cSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateIsNull() {
            addCriterion("C_SUBMIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateIsNotNull() {
            addCriterion("C_SUBMIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_SUBMIT_DATE =", value, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_SUBMIT_DATE <>", value, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_SUBMIT_DATE >", value, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_SUBMIT_DATE >=", value, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateLessThan(Date value) {
            addCriterionForJDBCDate("C_SUBMIT_DATE <", value, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_SUBMIT_DATE <=", value, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_SUBMIT_DATE in", values, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_SUBMIT_DATE not in", values, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_SUBMIT_DATE between", value1, value2, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_SUBMIT_DATE not between", value1, value2, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerByIsNull() {
            addCriterion("C_CUSTOMERMANAGER_BY is null");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerByIsNotNull() {
            addCriterion("C_CUSTOMERMANAGER_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerByEqualTo(String value) {
            addCriterion("C_CUSTOMERMANAGER_BY =", value, "cCustomermanagerBy");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerByNotEqualTo(String value) {
            addCriterion("C_CUSTOMERMANAGER_BY <>", value, "cCustomermanagerBy");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerByGreaterThan(String value) {
            addCriterion("C_CUSTOMERMANAGER_BY >", value, "cCustomermanagerBy");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerByGreaterThanOrEqualTo(String value) {
            addCriterion("C_CUSTOMERMANAGER_BY >=", value, "cCustomermanagerBy");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerByLessThan(String value) {
            addCriterion("C_CUSTOMERMANAGER_BY <", value, "cCustomermanagerBy");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerByLessThanOrEqualTo(String value) {
            addCriterion("C_CUSTOMERMANAGER_BY <=", value, "cCustomermanagerBy");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerByLike(String value) {
            addCriterion("C_CUSTOMERMANAGER_BY like", value, "cCustomermanagerBy");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerByNotLike(String value) {
            addCriterion("C_CUSTOMERMANAGER_BY not like", value, "cCustomermanagerBy");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerByIn(List<String> values) {
            addCriterion("C_CUSTOMERMANAGER_BY in", values, "cCustomermanagerBy");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerByNotIn(List<String> values) {
            addCriterion("C_CUSTOMERMANAGER_BY not in", values, "cCustomermanagerBy");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerByBetween(String value1, String value2) {
            addCriterion("C_CUSTOMERMANAGER_BY between", value1, value2, "cCustomermanagerBy");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerByNotBetween(String value1, String value2) {
            addCriterion("C_CUSTOMERMANAGER_BY not between", value1, value2, "cCustomermanagerBy");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerDateIsNull() {
            addCriterion("C_CUSTOMERMANAGER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerDateIsNotNull() {
            addCriterion("C_CUSTOMERMANAGER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_CUSTOMERMANAGER_DATE =", value, "cCustomermanagerDate");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_CUSTOMERMANAGER_DATE <>", value, "cCustomermanagerDate");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_CUSTOMERMANAGER_DATE >", value, "cCustomermanagerDate");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_CUSTOMERMANAGER_DATE >=", value, "cCustomermanagerDate");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerDateLessThan(Date value) {
            addCriterionForJDBCDate("C_CUSTOMERMANAGER_DATE <", value, "cCustomermanagerDate");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_CUSTOMERMANAGER_DATE <=", value, "cCustomermanagerDate");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_CUSTOMERMANAGER_DATE in", values, "cCustomermanagerDate");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_CUSTOMERMANAGER_DATE not in", values, "cCustomermanagerDate");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_CUSTOMERMANAGER_DATE between", value1, value2, "cCustomermanagerDate");
            return (Criteria) this;
        }

        public Criteria andCCustomermanagerDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_CUSTOMERMANAGER_DATE not between", value1, value2, "cCustomermanagerDate");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorByIsNull() {
            addCriterion("C_TECHSUPERVISOR_BY is null");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorByIsNotNull() {
            addCriterion("C_TECHSUPERVISOR_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorByEqualTo(String value) {
            addCriterion("C_TECHSUPERVISOR_BY =", value, "cTechsupervisorBy");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorByNotEqualTo(String value) {
            addCriterion("C_TECHSUPERVISOR_BY <>", value, "cTechsupervisorBy");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorByGreaterThan(String value) {
            addCriterion("C_TECHSUPERVISOR_BY >", value, "cTechsupervisorBy");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorByGreaterThanOrEqualTo(String value) {
            addCriterion("C_TECHSUPERVISOR_BY >=", value, "cTechsupervisorBy");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorByLessThan(String value) {
            addCriterion("C_TECHSUPERVISOR_BY <", value, "cTechsupervisorBy");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorByLessThanOrEqualTo(String value) {
            addCriterion("C_TECHSUPERVISOR_BY <=", value, "cTechsupervisorBy");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorByLike(String value) {
            addCriterion("C_TECHSUPERVISOR_BY like", value, "cTechsupervisorBy");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorByNotLike(String value) {
            addCriterion("C_TECHSUPERVISOR_BY not like", value, "cTechsupervisorBy");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorByIn(List<String> values) {
            addCriterion("C_TECHSUPERVISOR_BY in", values, "cTechsupervisorBy");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorByNotIn(List<String> values) {
            addCriterion("C_TECHSUPERVISOR_BY not in", values, "cTechsupervisorBy");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorByBetween(String value1, String value2) {
            addCriterion("C_TECHSUPERVISOR_BY between", value1, value2, "cTechsupervisorBy");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorByNotBetween(String value1, String value2) {
            addCriterion("C_TECHSUPERVISOR_BY not between", value1, value2, "cTechsupervisorBy");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorDateIsNull() {
            addCriterion("C_TECHSUPERVISOR_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorDateIsNotNull() {
            addCriterion("C_TECHSUPERVISOR_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_TECHSUPERVISOR_DATE =", value, "cTechsupervisorDate");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_TECHSUPERVISOR_DATE <>", value, "cTechsupervisorDate");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_TECHSUPERVISOR_DATE >", value, "cTechsupervisorDate");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_TECHSUPERVISOR_DATE >=", value, "cTechsupervisorDate");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorDateLessThan(Date value) {
            addCriterionForJDBCDate("C_TECHSUPERVISOR_DATE <", value, "cTechsupervisorDate");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_TECHSUPERVISOR_DATE <=", value, "cTechsupervisorDate");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_TECHSUPERVISOR_DATE in", values, "cTechsupervisorDate");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_TECHSUPERVISOR_DATE not in", values, "cTechsupervisorDate");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_TECHSUPERVISOR_DATE between", value1, value2, "cTechsupervisorDate");
            return (Criteria) this;
        }

        public Criteria andCTechsupervisorDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_TECHSUPERVISOR_DATE not between", value1, value2, "cTechsupervisorDate");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateByIsNull() {
            addCriterion("C_QUOTECREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateByIsNotNull() {
            addCriterion("C_QUOTECREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateByEqualTo(String value) {
            addCriterion("C_QUOTECREATE_BY =", value, "cQuotecreateBy");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateByNotEqualTo(String value) {
            addCriterion("C_QUOTECREATE_BY <>", value, "cQuotecreateBy");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateByGreaterThan(String value) {
            addCriterion("C_QUOTECREATE_BY >", value, "cQuotecreateBy");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateByGreaterThanOrEqualTo(String value) {
            addCriterion("C_QUOTECREATE_BY >=", value, "cQuotecreateBy");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateByLessThan(String value) {
            addCriterion("C_QUOTECREATE_BY <", value, "cQuotecreateBy");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateByLessThanOrEqualTo(String value) {
            addCriterion("C_QUOTECREATE_BY <=", value, "cQuotecreateBy");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateByLike(String value) {
            addCriterion("C_QUOTECREATE_BY like", value, "cQuotecreateBy");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateByNotLike(String value) {
            addCriterion("C_QUOTECREATE_BY not like", value, "cQuotecreateBy");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateByIn(List<String> values) {
            addCriterion("C_QUOTECREATE_BY in", values, "cQuotecreateBy");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateByNotIn(List<String> values) {
            addCriterion("C_QUOTECREATE_BY not in", values, "cQuotecreateBy");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateByBetween(String value1, String value2) {
            addCriterion("C_QUOTECREATE_BY between", value1, value2, "cQuotecreateBy");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateByNotBetween(String value1, String value2) {
            addCriterion("C_QUOTECREATE_BY not between", value1, value2, "cQuotecreateBy");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateDateIsNull() {
            addCriterion("C_QUOTECREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateDateIsNotNull() {
            addCriterion("C_QUOTECREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTECREATE_DATE =", value, "cQuotecreateDate");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTECREATE_DATE <>", value, "cQuotecreateDate");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_QUOTECREATE_DATE >", value, "cQuotecreateDate");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTECREATE_DATE >=", value, "cQuotecreateDate");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateDateLessThan(Date value) {
            addCriterionForJDBCDate("C_QUOTECREATE_DATE <", value, "cQuotecreateDate");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTECREATE_DATE <=", value, "cQuotecreateDate");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_QUOTECREATE_DATE in", values, "cQuotecreateDate");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_QUOTECREATE_DATE not in", values, "cQuotecreateDate");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_QUOTECREATE_DATE between", value1, value2, "cQuotecreateDate");
            return (Criteria) this;
        }

        public Criteria andCQuotecreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_QUOTECREATE_DATE not between", value1, value2, "cQuotecreateDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureByIsNull() {
            addCriterion("C_QUOTESIGNATURE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureByIsNotNull() {
            addCriterion("C_QUOTESIGNATURE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureByEqualTo(String value) {
            addCriterion("C_QUOTESIGNATURE_BY =", value, "cQuotesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureByNotEqualTo(String value) {
            addCriterion("C_QUOTESIGNATURE_BY <>", value, "cQuotesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureByGreaterThan(String value) {
            addCriterion("C_QUOTESIGNATURE_BY >", value, "cQuotesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureByGreaterThanOrEqualTo(String value) {
            addCriterion("C_QUOTESIGNATURE_BY >=", value, "cQuotesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureByLessThan(String value) {
            addCriterion("C_QUOTESIGNATURE_BY <", value, "cQuotesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureByLessThanOrEqualTo(String value) {
            addCriterion("C_QUOTESIGNATURE_BY <=", value, "cQuotesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureByLike(String value) {
            addCriterion("C_QUOTESIGNATURE_BY like", value, "cQuotesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureByNotLike(String value) {
            addCriterion("C_QUOTESIGNATURE_BY not like", value, "cQuotesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureByIn(List<String> values) {
            addCriterion("C_QUOTESIGNATURE_BY in", values, "cQuotesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureByNotIn(List<String> values) {
            addCriterion("C_QUOTESIGNATURE_BY not in", values, "cQuotesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureByBetween(String value1, String value2) {
            addCriterion("C_QUOTESIGNATURE_BY between", value1, value2, "cQuotesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureByNotBetween(String value1, String value2) {
            addCriterion("C_QUOTESIGNATURE_BY not between", value1, value2, "cQuotesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureDateIsNull() {
            addCriterion("C_QUOTESIGNATURE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureDateIsNotNull() {
            addCriterion("C_QUOTESIGNATURE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTESIGNATURE_DATE =", value, "cQuotesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTESIGNATURE_DATE <>", value, "cQuotesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_QUOTESIGNATURE_DATE >", value, "cQuotesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTESIGNATURE_DATE >=", value, "cQuotesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureDateLessThan(Date value) {
            addCriterionForJDBCDate("C_QUOTESIGNATURE_DATE <", value, "cQuotesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTESIGNATURE_DATE <=", value, "cQuotesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_QUOTESIGNATURE_DATE in", values, "cQuotesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_QUOTESIGNATURE_DATE not in", values, "cQuotesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_QUOTESIGNATURE_DATE between", value1, value2, "cQuotesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesignatureDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_QUOTESIGNATURE_DATE not between", value1, value2, "cQuotesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesendByIsNull() {
            addCriterion("C_QUOTESEND_BY is null");
            return (Criteria) this;
        }

        public Criteria andCQuotesendByIsNotNull() {
            addCriterion("C_QUOTESEND_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCQuotesendByEqualTo(String value) {
            addCriterion("C_QUOTESEND_BY =", value, "cQuotesendBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesendByNotEqualTo(String value) {
            addCriterion("C_QUOTESEND_BY <>", value, "cQuotesendBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesendByGreaterThan(String value) {
            addCriterion("C_QUOTESEND_BY >", value, "cQuotesendBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesendByGreaterThanOrEqualTo(String value) {
            addCriterion("C_QUOTESEND_BY >=", value, "cQuotesendBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesendByLessThan(String value) {
            addCriterion("C_QUOTESEND_BY <", value, "cQuotesendBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesendByLessThanOrEqualTo(String value) {
            addCriterion("C_QUOTESEND_BY <=", value, "cQuotesendBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesendByLike(String value) {
            addCriterion("C_QUOTESEND_BY like", value, "cQuotesendBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesendByNotLike(String value) {
            addCriterion("C_QUOTESEND_BY not like", value, "cQuotesendBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesendByIn(List<String> values) {
            addCriterion("C_QUOTESEND_BY in", values, "cQuotesendBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesendByNotIn(List<String> values) {
            addCriterion("C_QUOTESEND_BY not in", values, "cQuotesendBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesendByBetween(String value1, String value2) {
            addCriterion("C_QUOTESEND_BY between", value1, value2, "cQuotesendBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesendByNotBetween(String value1, String value2) {
            addCriterion("C_QUOTESEND_BY not between", value1, value2, "cQuotesendBy");
            return (Criteria) this;
        }

        public Criteria andCQuotesendDateIsNull() {
            addCriterion("C_QUOTESEND_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCQuotesendDateIsNotNull() {
            addCriterion("C_QUOTESEND_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCQuotesendDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTESEND_DATE =", value, "cQuotesendDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesendDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTESEND_DATE <>", value, "cQuotesendDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesendDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_QUOTESEND_DATE >", value, "cQuotesendDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesendDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTESEND_DATE >=", value, "cQuotesendDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesendDateLessThan(Date value) {
            addCriterionForJDBCDate("C_QUOTESEND_DATE <", value, "cQuotesendDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesendDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_QUOTESEND_DATE <=", value, "cQuotesendDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesendDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_QUOTESEND_DATE in", values, "cQuotesendDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesendDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_QUOTESEND_DATE not in", values, "cQuotesendDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesendDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_QUOTESEND_DATE between", value1, value2, "cQuotesendDate");
            return (Criteria) this;
        }

        public Criteria andCQuotesendDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_QUOTESEND_DATE not between", value1, value2, "cQuotesendDate");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveByIsNull() {
            addCriterion("C_SAMPLERECEIVE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveByIsNotNull() {
            addCriterion("C_SAMPLERECEIVE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveByEqualTo(String value) {
            addCriterion("C_SAMPLERECEIVE_BY =", value, "cSamplereceiveBy");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveByNotEqualTo(String value) {
            addCriterion("C_SAMPLERECEIVE_BY <>", value, "cSamplereceiveBy");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveByGreaterThan(String value) {
            addCriterion("C_SAMPLERECEIVE_BY >", value, "cSamplereceiveBy");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveByGreaterThanOrEqualTo(String value) {
            addCriterion("C_SAMPLERECEIVE_BY >=", value, "cSamplereceiveBy");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveByLessThan(String value) {
            addCriterion("C_SAMPLERECEIVE_BY <", value, "cSamplereceiveBy");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveByLessThanOrEqualTo(String value) {
            addCriterion("C_SAMPLERECEIVE_BY <=", value, "cSamplereceiveBy");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveByLike(String value) {
            addCriterion("C_SAMPLERECEIVE_BY like", value, "cSamplereceiveBy");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveByNotLike(String value) {
            addCriterion("C_SAMPLERECEIVE_BY not like", value, "cSamplereceiveBy");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveByIn(List<String> values) {
            addCriterion("C_SAMPLERECEIVE_BY in", values, "cSamplereceiveBy");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveByNotIn(List<String> values) {
            addCriterion("C_SAMPLERECEIVE_BY not in", values, "cSamplereceiveBy");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveByBetween(String value1, String value2) {
            addCriterion("C_SAMPLERECEIVE_BY between", value1, value2, "cSamplereceiveBy");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveByNotBetween(String value1, String value2) {
            addCriterion("C_SAMPLERECEIVE_BY not between", value1, value2, "cSamplereceiveBy");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveDateIsNull() {
            addCriterion("C_SAMPLERECEIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveDateIsNotNull() {
            addCriterion("C_SAMPLERECEIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLERECEIVE_DATE =", value, "cSamplereceiveDate");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLERECEIVE_DATE <>", value, "cSamplereceiveDate");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_SAMPLERECEIVE_DATE >", value, "cSamplereceiveDate");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLERECEIVE_DATE >=", value, "cSamplereceiveDate");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveDateLessThan(Date value) {
            addCriterionForJDBCDate("C_SAMPLERECEIVE_DATE <", value, "cSamplereceiveDate");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLERECEIVE_DATE <=", value, "cSamplereceiveDate");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_SAMPLERECEIVE_DATE in", values, "cSamplereceiveDate");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_SAMPLERECEIVE_DATE not in", values, "cSamplereceiveDate");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_SAMPLERECEIVE_DATE between", value1, value2, "cSamplereceiveDate");
            return (Criteria) this;
        }

        public Criteria andCSamplereceiveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_SAMPLERECEIVE_DATE not between", value1, value2, "cSamplereceiveDate");
            return (Criteria) this;
        }

        public Criteria andCArrangementByIsNull() {
            addCriterion("C_ARRANGEMENT_BY is null");
            return (Criteria) this;
        }

        public Criteria andCArrangementByIsNotNull() {
            addCriterion("C_ARRANGEMENT_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCArrangementByEqualTo(String value) {
            addCriterion("C_ARRANGEMENT_BY =", value, "cArrangementBy");
            return (Criteria) this;
        }

        public Criteria andCArrangementByNotEqualTo(String value) {
            addCriterion("C_ARRANGEMENT_BY <>", value, "cArrangementBy");
            return (Criteria) this;
        }

        public Criteria andCArrangementByGreaterThan(String value) {
            addCriterion("C_ARRANGEMENT_BY >", value, "cArrangementBy");
            return (Criteria) this;
        }

        public Criteria andCArrangementByGreaterThanOrEqualTo(String value) {
            addCriterion("C_ARRANGEMENT_BY >=", value, "cArrangementBy");
            return (Criteria) this;
        }

        public Criteria andCArrangementByLessThan(String value) {
            addCriterion("C_ARRANGEMENT_BY <", value, "cArrangementBy");
            return (Criteria) this;
        }

        public Criteria andCArrangementByLessThanOrEqualTo(String value) {
            addCriterion("C_ARRANGEMENT_BY <=", value, "cArrangementBy");
            return (Criteria) this;
        }

        public Criteria andCArrangementByLike(String value) {
            addCriterion("C_ARRANGEMENT_BY like", value, "cArrangementBy");
            return (Criteria) this;
        }

        public Criteria andCArrangementByNotLike(String value) {
            addCriterion("C_ARRANGEMENT_BY not like", value, "cArrangementBy");
            return (Criteria) this;
        }

        public Criteria andCArrangementByIn(List<String> values) {
            addCriterion("C_ARRANGEMENT_BY in", values, "cArrangementBy");
            return (Criteria) this;
        }

        public Criteria andCArrangementByNotIn(List<String> values) {
            addCriterion("C_ARRANGEMENT_BY not in", values, "cArrangementBy");
            return (Criteria) this;
        }

        public Criteria andCArrangementByBetween(String value1, String value2) {
            addCriterion("C_ARRANGEMENT_BY between", value1, value2, "cArrangementBy");
            return (Criteria) this;
        }

        public Criteria andCArrangementByNotBetween(String value1, String value2) {
            addCriterion("C_ARRANGEMENT_BY not between", value1, value2, "cArrangementBy");
            return (Criteria) this;
        }

        public Criteria andCArrangementDateIsNull() {
            addCriterion("C_ARRANGEMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCArrangementDateIsNotNull() {
            addCriterion("C_ARRANGEMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCArrangementDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_ARRANGEMENT_DATE =", value, "cArrangementDate");
            return (Criteria) this;
        }

        public Criteria andCArrangementDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_ARRANGEMENT_DATE <>", value, "cArrangementDate");
            return (Criteria) this;
        }

        public Criteria andCArrangementDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_ARRANGEMENT_DATE >", value, "cArrangementDate");
            return (Criteria) this;
        }

        public Criteria andCArrangementDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_ARRANGEMENT_DATE >=", value, "cArrangementDate");
            return (Criteria) this;
        }

        public Criteria andCArrangementDateLessThan(Date value) {
            addCriterionForJDBCDate("C_ARRANGEMENT_DATE <", value, "cArrangementDate");
            return (Criteria) this;
        }

        public Criteria andCArrangementDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_ARRANGEMENT_DATE <=", value, "cArrangementDate");
            return (Criteria) this;
        }

        public Criteria andCArrangementDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_ARRANGEMENT_DATE in", values, "cArrangementDate");
            return (Criteria) this;
        }

        public Criteria andCArrangementDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_ARRANGEMENT_DATE not in", values, "cArrangementDate");
            return (Criteria) this;
        }

        public Criteria andCArrangementDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_ARRANGEMENT_DATE between", value1, value2, "cArrangementDate");
            return (Criteria) this;
        }

        public Criteria andCArrangementDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_ARRANGEMENT_DATE not between", value1, value2, "cArrangementDate");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessByIsNull() {
            addCriterion("C_MONITORPROCESS_BY is null");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessByIsNotNull() {
            addCriterion("C_MONITORPROCESS_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessByEqualTo(String value) {
            addCriterion("C_MONITORPROCESS_BY =", value, "cMonitorprocessBy");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessByNotEqualTo(String value) {
            addCriterion("C_MONITORPROCESS_BY <>", value, "cMonitorprocessBy");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessByGreaterThan(String value) {
            addCriterion("C_MONITORPROCESS_BY >", value, "cMonitorprocessBy");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessByGreaterThanOrEqualTo(String value) {
            addCriterion("C_MONITORPROCESS_BY >=", value, "cMonitorprocessBy");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessByLessThan(String value) {
            addCriterion("C_MONITORPROCESS_BY <", value, "cMonitorprocessBy");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessByLessThanOrEqualTo(String value) {
            addCriterion("C_MONITORPROCESS_BY <=", value, "cMonitorprocessBy");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessByLike(String value) {
            addCriterion("C_MONITORPROCESS_BY like", value, "cMonitorprocessBy");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessByNotLike(String value) {
            addCriterion("C_MONITORPROCESS_BY not like", value, "cMonitorprocessBy");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessByIn(List<String> values) {
            addCriterion("C_MONITORPROCESS_BY in", values, "cMonitorprocessBy");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessByNotIn(List<String> values) {
            addCriterion("C_MONITORPROCESS_BY not in", values, "cMonitorprocessBy");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessByBetween(String value1, String value2) {
            addCriterion("C_MONITORPROCESS_BY between", value1, value2, "cMonitorprocessBy");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessByNotBetween(String value1, String value2) {
            addCriterion("C_MONITORPROCESS_BY not between", value1, value2, "cMonitorprocessBy");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessDateIsNull() {
            addCriterion("C_MONITORPROCESS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessDateIsNotNull() {
            addCriterion("C_MONITORPROCESS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_MONITORPROCESS_DATE =", value, "cMonitorprocessDate");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_MONITORPROCESS_DATE <>", value, "cMonitorprocessDate");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_MONITORPROCESS_DATE >", value, "cMonitorprocessDate");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_MONITORPROCESS_DATE >=", value, "cMonitorprocessDate");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessDateLessThan(Date value) {
            addCriterionForJDBCDate("C_MONITORPROCESS_DATE <", value, "cMonitorprocessDate");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_MONITORPROCESS_DATE <=", value, "cMonitorprocessDate");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_MONITORPROCESS_DATE in", values, "cMonitorprocessDate");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_MONITORPROCESS_DATE not in", values, "cMonitorprocessDate");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_MONITORPROCESS_DATE between", value1, value2, "cMonitorprocessDate");
            return (Criteria) this;
        }

        public Criteria andCMonitorprocessDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_MONITORPROCESS_DATE not between", value1, value2, "cMonitorprocessDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartByIsNull() {
            addCriterion("C_ANALYST_START_BY is null");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartByIsNotNull() {
            addCriterion("C_ANALYST_START_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartByEqualTo(String value) {
            addCriterion("C_ANALYST_START_BY =", value, "cAnalystStartBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartByNotEqualTo(String value) {
            addCriterion("C_ANALYST_START_BY <>", value, "cAnalystStartBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartByGreaterThan(String value) {
            addCriterion("C_ANALYST_START_BY >", value, "cAnalystStartBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartByGreaterThanOrEqualTo(String value) {
            addCriterion("C_ANALYST_START_BY >=", value, "cAnalystStartBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartByLessThan(String value) {
            addCriterion("C_ANALYST_START_BY <", value, "cAnalystStartBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartByLessThanOrEqualTo(String value) {
            addCriterion("C_ANALYST_START_BY <=", value, "cAnalystStartBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartByLike(String value) {
            addCriterion("C_ANALYST_START_BY like", value, "cAnalystStartBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartByNotLike(String value) {
            addCriterion("C_ANALYST_START_BY not like", value, "cAnalystStartBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartByIn(List<String> values) {
            addCriterion("C_ANALYST_START_BY in", values, "cAnalystStartBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartByNotIn(List<String> values) {
            addCriterion("C_ANALYST_START_BY not in", values, "cAnalystStartBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartByBetween(String value1, String value2) {
            addCriterion("C_ANALYST_START_BY between", value1, value2, "cAnalystStartBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartByNotBetween(String value1, String value2) {
            addCriterion("C_ANALYST_START_BY not between", value1, value2, "cAnalystStartBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartDateIsNull() {
            addCriterion("C_ANALYST_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartDateIsNotNull() {
            addCriterion("C_ANALYST_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_ANALYST_START_DATE =", value, "cAnalystStartDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_ANALYST_START_DATE <>", value, "cAnalystStartDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_ANALYST_START_DATE >", value, "cAnalystStartDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_ANALYST_START_DATE >=", value, "cAnalystStartDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartDateLessThan(Date value) {
            addCriterionForJDBCDate("C_ANALYST_START_DATE <", value, "cAnalystStartDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_ANALYST_START_DATE <=", value, "cAnalystStartDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_ANALYST_START_DATE in", values, "cAnalystStartDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_ANALYST_START_DATE not in", values, "cAnalystStartDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_ANALYST_START_DATE between", value1, value2, "cAnalystStartDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_ANALYST_START_DATE not between", value1, value2, "cAnalystStartDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndByIsNull() {
            addCriterion("C_ANALYST_END_BY is null");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndByIsNotNull() {
            addCriterion("C_ANALYST_END_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndByEqualTo(String value) {
            addCriterion("C_ANALYST_END_BY =", value, "cAnalystEndBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndByNotEqualTo(String value) {
            addCriterion("C_ANALYST_END_BY <>", value, "cAnalystEndBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndByGreaterThan(String value) {
            addCriterion("C_ANALYST_END_BY >", value, "cAnalystEndBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndByGreaterThanOrEqualTo(String value) {
            addCriterion("C_ANALYST_END_BY >=", value, "cAnalystEndBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndByLessThan(String value) {
            addCriterion("C_ANALYST_END_BY <", value, "cAnalystEndBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndByLessThanOrEqualTo(String value) {
            addCriterion("C_ANALYST_END_BY <=", value, "cAnalystEndBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndByLike(String value) {
            addCriterion("C_ANALYST_END_BY like", value, "cAnalystEndBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndByNotLike(String value) {
            addCriterion("C_ANALYST_END_BY not like", value, "cAnalystEndBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndByIn(List<String> values) {
            addCriterion("C_ANALYST_END_BY in", values, "cAnalystEndBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndByNotIn(List<String> values) {
            addCriterion("C_ANALYST_END_BY not in", values, "cAnalystEndBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndByBetween(String value1, String value2) {
            addCriterion("C_ANALYST_END_BY between", value1, value2, "cAnalystEndBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndByNotBetween(String value1, String value2) {
            addCriterion("C_ANALYST_END_BY not between", value1, value2, "cAnalystEndBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndDateIsNull() {
            addCriterion("C_ANALYST_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndDateIsNotNull() {
            addCriterion("C_ANALYST_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_ANALYST_END_DATE =", value, "cAnalystEndDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_ANALYST_END_DATE <>", value, "cAnalystEndDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_ANALYST_END_DATE >", value, "cAnalystEndDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_ANALYST_END_DATE >=", value, "cAnalystEndDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndDateLessThan(Date value) {
            addCriterionForJDBCDate("C_ANALYST_END_DATE <", value, "cAnalystEndDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_ANALYST_END_DATE <=", value, "cAnalystEndDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_ANALYST_END_DATE in", values, "cAnalystEndDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_ANALYST_END_DATE not in", values, "cAnalystEndDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_ANALYST_END_DATE between", value1, value2, "cAnalystEndDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_ANALYST_END_DATE not between", value1, value2, "cAnalystEndDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitByIsNull() {
            addCriterion("C_ANALYST_SUBMIT_BY is null");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitByIsNotNull() {
            addCriterion("C_ANALYST_SUBMIT_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitByEqualTo(String value) {
            addCriterion("C_ANALYST_SUBMIT_BY =", value, "cAnalystSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitByNotEqualTo(String value) {
            addCriterion("C_ANALYST_SUBMIT_BY <>", value, "cAnalystSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitByGreaterThan(String value) {
            addCriterion("C_ANALYST_SUBMIT_BY >", value, "cAnalystSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitByGreaterThanOrEqualTo(String value) {
            addCriterion("C_ANALYST_SUBMIT_BY >=", value, "cAnalystSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitByLessThan(String value) {
            addCriterion("C_ANALYST_SUBMIT_BY <", value, "cAnalystSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitByLessThanOrEqualTo(String value) {
            addCriterion("C_ANALYST_SUBMIT_BY <=", value, "cAnalystSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitByLike(String value) {
            addCriterion("C_ANALYST_SUBMIT_BY like", value, "cAnalystSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitByNotLike(String value) {
            addCriterion("C_ANALYST_SUBMIT_BY not like", value, "cAnalystSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitByIn(List<String> values) {
            addCriterion("C_ANALYST_SUBMIT_BY in", values, "cAnalystSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitByNotIn(List<String> values) {
            addCriterion("C_ANALYST_SUBMIT_BY not in", values, "cAnalystSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitByBetween(String value1, String value2) {
            addCriterion("C_ANALYST_SUBMIT_BY between", value1, value2, "cAnalystSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitByNotBetween(String value1, String value2) {
            addCriterion("C_ANALYST_SUBMIT_BY not between", value1, value2, "cAnalystSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitDateIsNull() {
            addCriterion("C_ANALYST_SUBMIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitDateIsNotNull() {
            addCriterion("C_ANALYST_SUBMIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_ANALYST_SUBMIT_DATE =", value, "cAnalystSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_ANALYST_SUBMIT_DATE <>", value, "cAnalystSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_ANALYST_SUBMIT_DATE >", value, "cAnalystSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_ANALYST_SUBMIT_DATE >=", value, "cAnalystSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitDateLessThan(Date value) {
            addCriterionForJDBCDate("C_ANALYST_SUBMIT_DATE <", value, "cAnalystSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_ANALYST_SUBMIT_DATE <=", value, "cAnalystSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_ANALYST_SUBMIT_DATE in", values, "cAnalystSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_ANALYST_SUBMIT_DATE not in", values, "cAnalystSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_ANALYST_SUBMIT_DATE between", value1, value2, "cAnalystSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCAnalystSubmitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_ANALYST_SUBMIT_DATE not between", value1, value2, "cAnalystSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateByIsNull() {
            addCriterion("C_TECHENGINEER_CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateByIsNotNull() {
            addCriterion("C_TECHENGINEER_CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateByEqualTo(String value) {
            addCriterion("C_TECHENGINEER_CREATE_BY =", value, "cTechengineerCreateBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateByNotEqualTo(String value) {
            addCriterion("C_TECHENGINEER_CREATE_BY <>", value, "cTechengineerCreateBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateByGreaterThan(String value) {
            addCriterion("C_TECHENGINEER_CREATE_BY >", value, "cTechengineerCreateBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("C_TECHENGINEER_CREATE_BY >=", value, "cTechengineerCreateBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateByLessThan(String value) {
            addCriterion("C_TECHENGINEER_CREATE_BY <", value, "cTechengineerCreateBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateByLessThanOrEqualTo(String value) {
            addCriterion("C_TECHENGINEER_CREATE_BY <=", value, "cTechengineerCreateBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateByLike(String value) {
            addCriterion("C_TECHENGINEER_CREATE_BY like", value, "cTechengineerCreateBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateByNotLike(String value) {
            addCriterion("C_TECHENGINEER_CREATE_BY not like", value, "cTechengineerCreateBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateByIn(List<String> values) {
            addCriterion("C_TECHENGINEER_CREATE_BY in", values, "cTechengineerCreateBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateByNotIn(List<String> values) {
            addCriterion("C_TECHENGINEER_CREATE_BY not in", values, "cTechengineerCreateBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateByBetween(String value1, String value2) {
            addCriterion("C_TECHENGINEER_CREATE_BY between", value1, value2, "cTechengineerCreateBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateByNotBetween(String value1, String value2) {
            addCriterion("C_TECHENGINEER_CREATE_BY not between", value1, value2, "cTechengineerCreateBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateDateIsNull() {
            addCriterion("C_TECHENGINEER_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateDateIsNotNull() {
            addCriterion("C_TECHENGINEER_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_TECHENGINEER_CREATE_DATE =", value, "cTechengineerCreateDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_TECHENGINEER_CREATE_DATE <>", value, "cTechengineerCreateDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_TECHENGINEER_CREATE_DATE >", value, "cTechengineerCreateDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_TECHENGINEER_CREATE_DATE >=", value, "cTechengineerCreateDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("C_TECHENGINEER_CREATE_DATE <", value, "cTechengineerCreateDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_TECHENGINEER_CREATE_DATE <=", value, "cTechengineerCreateDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_TECHENGINEER_CREATE_DATE in", values, "cTechengineerCreateDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_TECHENGINEER_CREATE_DATE not in", values, "cTechengineerCreateDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_TECHENGINEER_CREATE_DATE between", value1, value2, "cTechengineerCreateDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_TECHENGINEER_CREATE_DATE not between", value1, value2, "cTechengineerCreateDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitByIsNull() {
            addCriterion("C_TECHENGINEER_SUBMIT_BY is null");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitByIsNotNull() {
            addCriterion("C_TECHENGINEER_SUBMIT_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitByEqualTo(String value) {
            addCriterion("C_TECHENGINEER_SUBMIT_BY =", value, "cTechengineerSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitByNotEqualTo(String value) {
            addCriterion("C_TECHENGINEER_SUBMIT_BY <>", value, "cTechengineerSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitByGreaterThan(String value) {
            addCriterion("C_TECHENGINEER_SUBMIT_BY >", value, "cTechengineerSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitByGreaterThanOrEqualTo(String value) {
            addCriterion("C_TECHENGINEER_SUBMIT_BY >=", value, "cTechengineerSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitByLessThan(String value) {
            addCriterion("C_TECHENGINEER_SUBMIT_BY <", value, "cTechengineerSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitByLessThanOrEqualTo(String value) {
            addCriterion("C_TECHENGINEER_SUBMIT_BY <=", value, "cTechengineerSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitByLike(String value) {
            addCriterion("C_TECHENGINEER_SUBMIT_BY like", value, "cTechengineerSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitByNotLike(String value) {
            addCriterion("C_TECHENGINEER_SUBMIT_BY not like", value, "cTechengineerSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitByIn(List<String> values) {
            addCriterion("C_TECHENGINEER_SUBMIT_BY in", values, "cTechengineerSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitByNotIn(List<String> values) {
            addCriterion("C_TECHENGINEER_SUBMIT_BY not in", values, "cTechengineerSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitByBetween(String value1, String value2) {
            addCriterion("C_TECHENGINEER_SUBMIT_BY between", value1, value2, "cTechengineerSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitByNotBetween(String value1, String value2) {
            addCriterion("C_TECHENGINEER_SUBMIT_BY not between", value1, value2, "cTechengineerSubmitBy");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitDateIsNull() {
            addCriterion("C_TECHENGINEER_SUBMIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitDateIsNotNull() {
            addCriterion("C_TECHENGINEER_SUBMIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_TECHENGINEER_SUBMIT_DATE =", value, "cTechengineerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_TECHENGINEER_SUBMIT_DATE <>", value, "cTechengineerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_TECHENGINEER_SUBMIT_DATE >", value, "cTechengineerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_TECHENGINEER_SUBMIT_DATE >=", value, "cTechengineerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitDateLessThan(Date value) {
            addCriterionForJDBCDate("C_TECHENGINEER_SUBMIT_DATE <", value, "cTechengineerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_TECHENGINEER_SUBMIT_DATE <=", value, "cTechengineerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_TECHENGINEER_SUBMIT_DATE in", values, "cTechengineerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_TECHENGINEER_SUBMIT_DATE not in", values, "cTechengineerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_TECHENGINEER_SUBMIT_DATE between", value1, value2, "cTechengineerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCTechengineerSubmitDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_TECHENGINEER_SUBMIT_DATE not between", value1, value2, "cTechengineerSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCReportcreateByIsNull() {
            addCriterion("C_REPORTCREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCReportcreateByIsNotNull() {
            addCriterion("C_REPORTCREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCReportcreateByEqualTo(String value) {
            addCriterion("C_REPORTCREATE_BY =", value, "cReportcreateBy");
            return (Criteria) this;
        }

        public Criteria andCReportcreateByNotEqualTo(String value) {
            addCriterion("C_REPORTCREATE_BY <>", value, "cReportcreateBy");
            return (Criteria) this;
        }

        public Criteria andCReportcreateByGreaterThan(String value) {
            addCriterion("C_REPORTCREATE_BY >", value, "cReportcreateBy");
            return (Criteria) this;
        }

        public Criteria andCReportcreateByGreaterThanOrEqualTo(String value) {
            addCriterion("C_REPORTCREATE_BY >=", value, "cReportcreateBy");
            return (Criteria) this;
        }

        public Criteria andCReportcreateByLessThan(String value) {
            addCriterion("C_REPORTCREATE_BY <", value, "cReportcreateBy");
            return (Criteria) this;
        }

        public Criteria andCReportcreateByLessThanOrEqualTo(String value) {
            addCriterion("C_REPORTCREATE_BY <=", value, "cReportcreateBy");
            return (Criteria) this;
        }

        public Criteria andCReportcreateByLike(String value) {
            addCriterion("C_REPORTCREATE_BY like", value, "cReportcreateBy");
            return (Criteria) this;
        }

        public Criteria andCReportcreateByNotLike(String value) {
            addCriterion("C_REPORTCREATE_BY not like", value, "cReportcreateBy");
            return (Criteria) this;
        }

        public Criteria andCReportcreateByIn(List<String> values) {
            addCriterion("C_REPORTCREATE_BY in", values, "cReportcreateBy");
            return (Criteria) this;
        }

        public Criteria andCReportcreateByNotIn(List<String> values) {
            addCriterion("C_REPORTCREATE_BY not in", values, "cReportcreateBy");
            return (Criteria) this;
        }

        public Criteria andCReportcreateByBetween(String value1, String value2) {
            addCriterion("C_REPORTCREATE_BY between", value1, value2, "cReportcreateBy");
            return (Criteria) this;
        }

        public Criteria andCReportcreateByNotBetween(String value1, String value2) {
            addCriterion("C_REPORTCREATE_BY not between", value1, value2, "cReportcreateBy");
            return (Criteria) this;
        }

        public Criteria andCReportcreateDateIsNull() {
            addCriterion("C_REPORTCREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCReportcreateDateIsNotNull() {
            addCriterion("C_REPORTCREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCReportcreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_REPORTCREATE_DATE =", value, "cReportcreateDate");
            return (Criteria) this;
        }

        public Criteria andCReportcreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_REPORTCREATE_DATE <>", value, "cReportcreateDate");
            return (Criteria) this;
        }

        public Criteria andCReportcreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_REPORTCREATE_DATE >", value, "cReportcreateDate");
            return (Criteria) this;
        }

        public Criteria andCReportcreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_REPORTCREATE_DATE >=", value, "cReportcreateDate");
            return (Criteria) this;
        }

        public Criteria andCReportcreateDateLessThan(Date value) {
            addCriterionForJDBCDate("C_REPORTCREATE_DATE <", value, "cReportcreateDate");
            return (Criteria) this;
        }

        public Criteria andCReportcreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_REPORTCREATE_DATE <=", value, "cReportcreateDate");
            return (Criteria) this;
        }

        public Criteria andCReportcreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_REPORTCREATE_DATE in", values, "cReportcreateDate");
            return (Criteria) this;
        }

        public Criteria andCReportcreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_REPORTCREATE_DATE not in", values, "cReportcreateDate");
            return (Criteria) this;
        }

        public Criteria andCReportcreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_REPORTCREATE_DATE between", value1, value2, "cReportcreateDate");
            return (Criteria) this;
        }

        public Criteria andCReportcreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_REPORTCREATE_DATE not between", value1, value2, "cReportcreateDate");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureByIsNull() {
            addCriterion("C_REPORTSIGNATURE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureByIsNotNull() {
            addCriterion("C_REPORTSIGNATURE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureByEqualTo(String value) {
            addCriterion("C_REPORTSIGNATURE_BY =", value, "cReportsignatureBy");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureByNotEqualTo(String value) {
            addCriterion("C_REPORTSIGNATURE_BY <>", value, "cReportsignatureBy");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureByGreaterThan(String value) {
            addCriterion("C_REPORTSIGNATURE_BY >", value, "cReportsignatureBy");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureByGreaterThanOrEqualTo(String value) {
            addCriterion("C_REPORTSIGNATURE_BY >=", value, "cReportsignatureBy");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureByLessThan(String value) {
            addCriterion("C_REPORTSIGNATURE_BY <", value, "cReportsignatureBy");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureByLessThanOrEqualTo(String value) {
            addCriterion("C_REPORTSIGNATURE_BY <=", value, "cReportsignatureBy");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureByLike(String value) {
            addCriterion("C_REPORTSIGNATURE_BY like", value, "cReportsignatureBy");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureByNotLike(String value) {
            addCriterion("C_REPORTSIGNATURE_BY not like", value, "cReportsignatureBy");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureByIn(List<String> values) {
            addCriterion("C_REPORTSIGNATURE_BY in", values, "cReportsignatureBy");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureByNotIn(List<String> values) {
            addCriterion("C_REPORTSIGNATURE_BY not in", values, "cReportsignatureBy");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureByBetween(String value1, String value2) {
            addCriterion("C_REPORTSIGNATURE_BY between", value1, value2, "cReportsignatureBy");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureByNotBetween(String value1, String value2) {
            addCriterion("C_REPORTSIGNATURE_BY not between", value1, value2, "cReportsignatureBy");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureDateIsNull() {
            addCriterion("C_REPORTSIGNATURE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureDateIsNotNull() {
            addCriterion("C_REPORTSIGNATURE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_REPORTSIGNATURE_DATE =", value, "cReportsignatureDate");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_REPORTSIGNATURE_DATE <>", value, "cReportsignatureDate");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_REPORTSIGNATURE_DATE >", value, "cReportsignatureDate");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_REPORTSIGNATURE_DATE >=", value, "cReportsignatureDate");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureDateLessThan(Date value) {
            addCriterionForJDBCDate("C_REPORTSIGNATURE_DATE <", value, "cReportsignatureDate");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_REPORTSIGNATURE_DATE <=", value, "cReportsignatureDate");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_REPORTSIGNATURE_DATE in", values, "cReportsignatureDate");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_REPORTSIGNATURE_DATE not in", values, "cReportsignatureDate");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_REPORTSIGNATURE_DATE between", value1, value2, "cReportsignatureDate");
            return (Criteria) this;
        }

        public Criteria andCReportsignatureDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_REPORTSIGNATURE_DATE not between", value1, value2, "cReportsignatureDate");
            return (Criteria) this;
        }

        public Criteria andCChargesendByIsNull() {
            addCriterion("C_CHARGESEND_BY is null");
            return (Criteria) this;
        }

        public Criteria andCChargesendByIsNotNull() {
            addCriterion("C_CHARGESEND_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCChargesendByEqualTo(String value) {
            addCriterion("C_CHARGESEND_BY =", value, "cChargesendBy");
            return (Criteria) this;
        }

        public Criteria andCChargesendByNotEqualTo(String value) {
            addCriterion("C_CHARGESEND_BY <>", value, "cChargesendBy");
            return (Criteria) this;
        }

        public Criteria andCChargesendByGreaterThan(String value) {
            addCriterion("C_CHARGESEND_BY >", value, "cChargesendBy");
            return (Criteria) this;
        }

        public Criteria andCChargesendByGreaterThanOrEqualTo(String value) {
            addCriterion("C_CHARGESEND_BY >=", value, "cChargesendBy");
            return (Criteria) this;
        }

        public Criteria andCChargesendByLessThan(String value) {
            addCriterion("C_CHARGESEND_BY <", value, "cChargesendBy");
            return (Criteria) this;
        }

        public Criteria andCChargesendByLessThanOrEqualTo(String value) {
            addCriterion("C_CHARGESEND_BY <=", value, "cChargesendBy");
            return (Criteria) this;
        }

        public Criteria andCChargesendByLike(String value) {
            addCriterion("C_CHARGESEND_BY like", value, "cChargesendBy");
            return (Criteria) this;
        }

        public Criteria andCChargesendByNotLike(String value) {
            addCriterion("C_CHARGESEND_BY not like", value, "cChargesendBy");
            return (Criteria) this;
        }

        public Criteria andCChargesendByIn(List<String> values) {
            addCriterion("C_CHARGESEND_BY in", values, "cChargesendBy");
            return (Criteria) this;
        }

        public Criteria andCChargesendByNotIn(List<String> values) {
            addCriterion("C_CHARGESEND_BY not in", values, "cChargesendBy");
            return (Criteria) this;
        }

        public Criteria andCChargesendByBetween(String value1, String value2) {
            addCriterion("C_CHARGESEND_BY between", value1, value2, "cChargesendBy");
            return (Criteria) this;
        }

        public Criteria andCChargesendByNotBetween(String value1, String value2) {
            addCriterion("C_CHARGESEND_BY not between", value1, value2, "cChargesendBy");
            return (Criteria) this;
        }

        public Criteria andCChargesendDateIsNull() {
            addCriterion("C_CHARGESEND_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCChargesendDateIsNotNull() {
            addCriterion("C_CHARGESEND_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCChargesendDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_CHARGESEND_DATE =", value, "cChargesendDate");
            return (Criteria) this;
        }

        public Criteria andCChargesendDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_CHARGESEND_DATE <>", value, "cChargesendDate");
            return (Criteria) this;
        }

        public Criteria andCChargesendDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_CHARGESEND_DATE >", value, "cChargesendDate");
            return (Criteria) this;
        }

        public Criteria andCChargesendDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_CHARGESEND_DATE >=", value, "cChargesendDate");
            return (Criteria) this;
        }

        public Criteria andCChargesendDateLessThan(Date value) {
            addCriterionForJDBCDate("C_CHARGESEND_DATE <", value, "cChargesendDate");
            return (Criteria) this;
        }

        public Criteria andCChargesendDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_CHARGESEND_DATE <=", value, "cChargesendDate");
            return (Criteria) this;
        }

        public Criteria andCChargesendDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_CHARGESEND_DATE in", values, "cChargesendDate");
            return (Criteria) this;
        }

        public Criteria andCChargesendDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_CHARGESEND_DATE not in", values, "cChargesendDate");
            return (Criteria) this;
        }

        public Criteria andCChargesendDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_CHARGESEND_DATE between", value1, value2, "cChargesendDate");
            return (Criteria) this;
        }

        public Criteria andCChargesendDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_CHARGESEND_DATE not between", value1, value2, "cChargesendDate");
            return (Criteria) this;
        }

        public Criteria andCChargecreateByIsNull() {
            addCriterion("C_CHARGECREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCChargecreateByIsNotNull() {
            addCriterion("C_CHARGECREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCChargecreateByEqualTo(String value) {
            addCriterion("C_CHARGECREATE_BY =", value, "cChargecreateBy");
            return (Criteria) this;
        }

        public Criteria andCChargecreateByNotEqualTo(String value) {
            addCriterion("C_CHARGECREATE_BY <>", value, "cChargecreateBy");
            return (Criteria) this;
        }

        public Criteria andCChargecreateByGreaterThan(String value) {
            addCriterion("C_CHARGECREATE_BY >", value, "cChargecreateBy");
            return (Criteria) this;
        }

        public Criteria andCChargecreateByGreaterThanOrEqualTo(String value) {
            addCriterion("C_CHARGECREATE_BY >=", value, "cChargecreateBy");
            return (Criteria) this;
        }

        public Criteria andCChargecreateByLessThan(String value) {
            addCriterion("C_CHARGECREATE_BY <", value, "cChargecreateBy");
            return (Criteria) this;
        }

        public Criteria andCChargecreateByLessThanOrEqualTo(String value) {
            addCriterion("C_CHARGECREATE_BY <=", value, "cChargecreateBy");
            return (Criteria) this;
        }

        public Criteria andCChargecreateByLike(String value) {
            addCriterion("C_CHARGECREATE_BY like", value, "cChargecreateBy");
            return (Criteria) this;
        }

        public Criteria andCChargecreateByNotLike(String value) {
            addCriterion("C_CHARGECREATE_BY not like", value, "cChargecreateBy");
            return (Criteria) this;
        }

        public Criteria andCChargecreateByIn(List<String> values) {
            addCriterion("C_CHARGECREATE_BY in", values, "cChargecreateBy");
            return (Criteria) this;
        }

        public Criteria andCChargecreateByNotIn(List<String> values) {
            addCriterion("C_CHARGECREATE_BY not in", values, "cChargecreateBy");
            return (Criteria) this;
        }

        public Criteria andCChargecreateByBetween(String value1, String value2) {
            addCriterion("C_CHARGECREATE_BY between", value1, value2, "cChargecreateBy");
            return (Criteria) this;
        }

        public Criteria andCChargecreateByNotBetween(String value1, String value2) {
            addCriterion("C_CHARGECREATE_BY not between", value1, value2, "cChargecreateBy");
            return (Criteria) this;
        }

        public Criteria andCChargecreateDateIsNull() {
            addCriterion("C_CHARGECREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCChargecreateDateIsNotNull() {
            addCriterion("C_CHARGECREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCChargecreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_CHARGECREATE_DATE =", value, "cChargecreateDate");
            return (Criteria) this;
        }

        public Criteria andCChargecreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_CHARGECREATE_DATE <>", value, "cChargecreateDate");
            return (Criteria) this;
        }

        public Criteria andCChargecreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_CHARGECREATE_DATE >", value, "cChargecreateDate");
            return (Criteria) this;
        }

        public Criteria andCChargecreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_CHARGECREATE_DATE >=", value, "cChargecreateDate");
            return (Criteria) this;
        }

        public Criteria andCChargecreateDateLessThan(Date value) {
            addCriterionForJDBCDate("C_CHARGECREATE_DATE <", value, "cChargecreateDate");
            return (Criteria) this;
        }

        public Criteria andCChargecreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_CHARGECREATE_DATE <=", value, "cChargecreateDate");
            return (Criteria) this;
        }

        public Criteria andCChargecreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_CHARGECREATE_DATE in", values, "cChargecreateDate");
            return (Criteria) this;
        }

        public Criteria andCChargecreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_CHARGECREATE_DATE not in", values, "cChargecreateDate");
            return (Criteria) this;
        }

        public Criteria andCChargecreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_CHARGECREATE_DATE between", value1, value2, "cChargecreateDate");
            return (Criteria) this;
        }

        public Criteria andCChargecreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_CHARGECREATE_DATE not between", value1, value2, "cChargecreateDate");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureByIsNull() {
            addCriterion("C_CHARGESIGNATURE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureByIsNotNull() {
            addCriterion("C_CHARGESIGNATURE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureByEqualTo(String value) {
            addCriterion("C_CHARGESIGNATURE_BY =", value, "cChargesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureByNotEqualTo(String value) {
            addCriterion("C_CHARGESIGNATURE_BY <>", value, "cChargesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureByGreaterThan(String value) {
            addCriterion("C_CHARGESIGNATURE_BY >", value, "cChargesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureByGreaterThanOrEqualTo(String value) {
            addCriterion("C_CHARGESIGNATURE_BY >=", value, "cChargesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureByLessThan(String value) {
            addCriterion("C_CHARGESIGNATURE_BY <", value, "cChargesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureByLessThanOrEqualTo(String value) {
            addCriterion("C_CHARGESIGNATURE_BY <=", value, "cChargesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureByLike(String value) {
            addCriterion("C_CHARGESIGNATURE_BY like", value, "cChargesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureByNotLike(String value) {
            addCriterion("C_CHARGESIGNATURE_BY not like", value, "cChargesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureByIn(List<String> values) {
            addCriterion("C_CHARGESIGNATURE_BY in", values, "cChargesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureByNotIn(List<String> values) {
            addCriterion("C_CHARGESIGNATURE_BY not in", values, "cChargesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureByBetween(String value1, String value2) {
            addCriterion("C_CHARGESIGNATURE_BY between", value1, value2, "cChargesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureByNotBetween(String value1, String value2) {
            addCriterion("C_CHARGESIGNATURE_BY not between", value1, value2, "cChargesignatureBy");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureDateIsNull() {
            addCriterion("C_CHARGESIGNATURE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureDateIsNotNull() {
            addCriterion("C_CHARGESIGNATURE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_CHARGESIGNATURE_DATE =", value, "cChargesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_CHARGESIGNATURE_DATE <>", value, "cChargesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_CHARGESIGNATURE_DATE >", value, "cChargesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_CHARGESIGNATURE_DATE >=", value, "cChargesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureDateLessThan(Date value) {
            addCriterionForJDBCDate("C_CHARGESIGNATURE_DATE <", value, "cChargesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_CHARGESIGNATURE_DATE <=", value, "cChargesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_CHARGESIGNATURE_DATE in", values, "cChargesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_CHARGESIGNATURE_DATE not in", values, "cChargesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_CHARGESIGNATURE_DATE between", value1, value2, "cChargesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCChargesignatureDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_CHARGESIGNATURE_DATE not between", value1, value2, "cChargesignatureDate");
            return (Criteria) this;
        }

        public Criteria andCNextPersonIsNull() {
            addCriterion("C_NEXT_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andCNextPersonIsNotNull() {
            addCriterion("C_NEXT_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andCNextPersonEqualTo(String value) {
            addCriterion("C_NEXT_PERSON =", value, "cNextPerson");
            return (Criteria) this;
        }

        public Criteria andCNextPersonNotEqualTo(String value) {
            addCriterion("C_NEXT_PERSON <>", value, "cNextPerson");
            return (Criteria) this;
        }

        public Criteria andCNextPersonGreaterThan(String value) {
            addCriterion("C_NEXT_PERSON >", value, "cNextPerson");
            return (Criteria) this;
        }

        public Criteria andCNextPersonGreaterThanOrEqualTo(String value) {
            addCriterion("C_NEXT_PERSON >=", value, "cNextPerson");
            return (Criteria) this;
        }

        public Criteria andCNextPersonLessThan(String value) {
            addCriterion("C_NEXT_PERSON <", value, "cNextPerson");
            return (Criteria) this;
        }

        public Criteria andCNextPersonLessThanOrEqualTo(String value) {
            addCriterion("C_NEXT_PERSON <=", value, "cNextPerson");
            return (Criteria) this;
        }

        public Criteria andCNextPersonLike(String value) {
            addCriterion("C_NEXT_PERSON like", value, "cNextPerson");
            return (Criteria) this;
        }

        public Criteria andCNextPersonNotLike(String value) {
            addCriterion("C_NEXT_PERSON not like", value, "cNextPerson");
            return (Criteria) this;
        }

        public Criteria andCNextPersonIn(List<String> values) {
            addCriterion("C_NEXT_PERSON in", values, "cNextPerson");
            return (Criteria) this;
        }

        public Criteria andCNextPersonNotIn(List<String> values) {
            addCriterion("C_NEXT_PERSON not in", values, "cNextPerson");
            return (Criteria) this;
        }

        public Criteria andCNextPersonBetween(String value1, String value2) {
            addCriterion("C_NEXT_PERSON between", value1, value2, "cNextPerson");
            return (Criteria) this;
        }

        public Criteria andCNextPersonNotBetween(String value1, String value2) {
            addCriterion("C_NEXT_PERSON not between", value1, value2, "cNextPerson");
            return (Criteria) this;
        }

        public Criteria andCCurrentProcessIsNull() {
            addCriterion("C_CURRENT_PROCESS is null");
            return (Criteria) this;
        }

        public Criteria andCCurrentProcessIsNotNull() {
            addCriterion("C_CURRENT_PROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andCCurrentProcessEqualTo(String value) {
            addCriterion("C_CURRENT_PROCESS =", value, "cCurrentProcess");
            return (Criteria) this;
        }

        public Criteria andCCurrentProcessNotEqualTo(String value) {
            addCriterion("C_CURRENT_PROCESS <>", value, "cCurrentProcess");
            return (Criteria) this;
        }

        public Criteria andCCurrentProcessGreaterThan(String value) {
            addCriterion("C_CURRENT_PROCESS >", value, "cCurrentProcess");
            return (Criteria) this;
        }

        public Criteria andCCurrentProcessGreaterThanOrEqualTo(String value) {
            addCriterion("C_CURRENT_PROCESS >=", value, "cCurrentProcess");
            return (Criteria) this;
        }

        public Criteria andCCurrentProcessLessThan(String value) {
            addCriterion("C_CURRENT_PROCESS <", value, "cCurrentProcess");
            return (Criteria) this;
        }

        public Criteria andCCurrentProcessLessThanOrEqualTo(String value) {
            addCriterion("C_CURRENT_PROCESS <=", value, "cCurrentProcess");
            return (Criteria) this;
        }

        public Criteria andCCurrentProcessLike(String value) {
            addCriterion("C_CURRENT_PROCESS like", value, "cCurrentProcess");
            return (Criteria) this;
        }

        public Criteria andCCurrentProcessNotLike(String value) {
            addCriterion("C_CURRENT_PROCESS not like", value, "cCurrentProcess");
            return (Criteria) this;
        }

        public Criteria andCCurrentProcessIn(List<String> values) {
            addCriterion("C_CURRENT_PROCESS in", values, "cCurrentProcess");
            return (Criteria) this;
        }

        public Criteria andCCurrentProcessNotIn(List<String> values) {
            addCriterion("C_CURRENT_PROCESS not in", values, "cCurrentProcess");
            return (Criteria) this;
        }

        public Criteria andCCurrentProcessBetween(String value1, String value2) {
            addCriterion("C_CURRENT_PROCESS between", value1, value2, "cCurrentProcess");
            return (Criteria) this;
        }

        public Criteria andCCurrentProcessNotBetween(String value1, String value2) {
            addCriterion("C_CURRENT_PROCESS not between", value1, value2, "cCurrentProcess");
            return (Criteria) this;
        }

        public Criteria andCSampleOutByIsNull() {
            addCriterion("C_SAMPLE_OUT_BY is null");
            return (Criteria) this;
        }

        public Criteria andCSampleOutByIsNotNull() {
            addCriterion("C_SAMPLE_OUT_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCSampleOutByEqualTo(String value) {
            addCriterion("C_SAMPLE_OUT_BY =", value, "cSampleOutBy");
            return (Criteria) this;
        }

        public Criteria andCSampleOutByNotEqualTo(String value) {
            addCriterion("C_SAMPLE_OUT_BY <>", value, "cSampleOutBy");
            return (Criteria) this;
        }

        public Criteria andCSampleOutByGreaterThan(String value) {
            addCriterion("C_SAMPLE_OUT_BY >", value, "cSampleOutBy");
            return (Criteria) this;
        }

        public Criteria andCSampleOutByGreaterThanOrEqualTo(String value) {
            addCriterion("C_SAMPLE_OUT_BY >=", value, "cSampleOutBy");
            return (Criteria) this;
        }

        public Criteria andCSampleOutByLessThan(String value) {
            addCriterion("C_SAMPLE_OUT_BY <", value, "cSampleOutBy");
            return (Criteria) this;
        }

        public Criteria andCSampleOutByLessThanOrEqualTo(String value) {
            addCriterion("C_SAMPLE_OUT_BY <=", value, "cSampleOutBy");
            return (Criteria) this;
        }

        public Criteria andCSampleOutByLike(String value) {
            addCriterion("C_SAMPLE_OUT_BY like", value, "cSampleOutBy");
            return (Criteria) this;
        }

        public Criteria andCSampleOutByNotLike(String value) {
            addCriterion("C_SAMPLE_OUT_BY not like", value, "cSampleOutBy");
            return (Criteria) this;
        }

        public Criteria andCSampleOutByIn(List<String> values) {
            addCriterion("C_SAMPLE_OUT_BY in", values, "cSampleOutBy");
            return (Criteria) this;
        }

        public Criteria andCSampleOutByNotIn(List<String> values) {
            addCriterion("C_SAMPLE_OUT_BY not in", values, "cSampleOutBy");
            return (Criteria) this;
        }

        public Criteria andCSampleOutByBetween(String value1, String value2) {
            addCriterion("C_SAMPLE_OUT_BY between", value1, value2, "cSampleOutBy");
            return (Criteria) this;
        }

        public Criteria andCSampleOutByNotBetween(String value1, String value2) {
            addCriterion("C_SAMPLE_OUT_BY not between", value1, value2, "cSampleOutBy");
            return (Criteria) this;
        }

        public Criteria andCSampleOutDateIsNull() {
            addCriterion("C_SAMPLE_OUT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCSampleOutDateIsNotNull() {
            addCriterion("C_SAMPLE_OUT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCSampleOutDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_OUT_DATE =", value, "cSampleOutDate");
            return (Criteria) this;
        }

        public Criteria andCSampleOutDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_OUT_DATE <>", value, "cSampleOutDate");
            return (Criteria) this;
        }

        public Criteria andCSampleOutDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_OUT_DATE >", value, "cSampleOutDate");
            return (Criteria) this;
        }

        public Criteria andCSampleOutDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_OUT_DATE >=", value, "cSampleOutDate");
            return (Criteria) this;
        }

        public Criteria andCSampleOutDateLessThan(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_OUT_DATE <", value, "cSampleOutDate");
            return (Criteria) this;
        }

        public Criteria andCSampleOutDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_OUT_DATE <=", value, "cSampleOutDate");
            return (Criteria) this;
        }

        public Criteria andCSampleOutDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_SAMPLE_OUT_DATE in", values, "cSampleOutDate");
            return (Criteria) this;
        }

        public Criteria andCSampleOutDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_SAMPLE_OUT_DATE not in", values, "cSampleOutDate");
            return (Criteria) this;
        }

        public Criteria andCSampleOutDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_SAMPLE_OUT_DATE between", value1, value2, "cSampleOutDate");
            return (Criteria) this;
        }

        public Criteria andCSampleOutDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_SAMPLE_OUT_DATE not between", value1, value2, "cSampleOutDate");
            return (Criteria) this;
        }

        public Criteria andCSampleInByIsNull() {
            addCriterion("C_SAMPLE_IN_BY is null");
            return (Criteria) this;
        }

        public Criteria andCSampleInByIsNotNull() {
            addCriterion("C_SAMPLE_IN_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCSampleInByEqualTo(String value) {
            addCriterion("C_SAMPLE_IN_BY =", value, "cSampleInBy");
            return (Criteria) this;
        }

        public Criteria andCSampleInByNotEqualTo(String value) {
            addCriterion("C_SAMPLE_IN_BY <>", value, "cSampleInBy");
            return (Criteria) this;
        }

        public Criteria andCSampleInByGreaterThan(String value) {
            addCriterion("C_SAMPLE_IN_BY >", value, "cSampleInBy");
            return (Criteria) this;
        }

        public Criteria andCSampleInByGreaterThanOrEqualTo(String value) {
            addCriterion("C_SAMPLE_IN_BY >=", value, "cSampleInBy");
            return (Criteria) this;
        }

        public Criteria andCSampleInByLessThan(String value) {
            addCriterion("C_SAMPLE_IN_BY <", value, "cSampleInBy");
            return (Criteria) this;
        }

        public Criteria andCSampleInByLessThanOrEqualTo(String value) {
            addCriterion("C_SAMPLE_IN_BY <=", value, "cSampleInBy");
            return (Criteria) this;
        }

        public Criteria andCSampleInByLike(String value) {
            addCriterion("C_SAMPLE_IN_BY like", value, "cSampleInBy");
            return (Criteria) this;
        }

        public Criteria andCSampleInByNotLike(String value) {
            addCriterion("C_SAMPLE_IN_BY not like", value, "cSampleInBy");
            return (Criteria) this;
        }

        public Criteria andCSampleInByIn(List<String> values) {
            addCriterion("C_SAMPLE_IN_BY in", values, "cSampleInBy");
            return (Criteria) this;
        }

        public Criteria andCSampleInByNotIn(List<String> values) {
            addCriterion("C_SAMPLE_IN_BY not in", values, "cSampleInBy");
            return (Criteria) this;
        }

        public Criteria andCSampleInByBetween(String value1, String value2) {
            addCriterion("C_SAMPLE_IN_BY between", value1, value2, "cSampleInBy");
            return (Criteria) this;
        }

        public Criteria andCSampleInByNotBetween(String value1, String value2) {
            addCriterion("C_SAMPLE_IN_BY not between", value1, value2, "cSampleInBy");
            return (Criteria) this;
        }

        public Criteria andCSampleInDateIsNull() {
            addCriterion("C_SAMPLE_IN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCSampleInDateIsNotNull() {
            addCriterion("C_SAMPLE_IN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCSampleInDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_IN_DATE =", value, "cSampleInDate");
            return (Criteria) this;
        }

        public Criteria andCSampleInDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_IN_DATE <>", value, "cSampleInDate");
            return (Criteria) this;
        }

        public Criteria andCSampleInDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_IN_DATE >", value, "cSampleInDate");
            return (Criteria) this;
        }

        public Criteria andCSampleInDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_IN_DATE >=", value, "cSampleInDate");
            return (Criteria) this;
        }

        public Criteria andCSampleInDateLessThan(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_IN_DATE <", value, "cSampleInDate");
            return (Criteria) this;
        }

        public Criteria andCSampleInDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_IN_DATE <=", value, "cSampleInDate");
            return (Criteria) this;
        }

        public Criteria andCSampleInDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_SAMPLE_IN_DATE in", values, "cSampleInDate");
            return (Criteria) this;
        }

        public Criteria andCSampleInDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_SAMPLE_IN_DATE not in", values, "cSampleInDate");
            return (Criteria) this;
        }

        public Criteria andCSampleInDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_SAMPLE_IN_DATE between", value1, value2, "cSampleInDate");
            return (Criteria) this;
        }

        public Criteria andCSampleInDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_SAMPLE_IN_DATE not between", value1, value2, "cSampleInDate");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowByIsNull() {
            addCriterion("C_SAMPLE_BORROW_BY is null");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowByIsNotNull() {
            addCriterion("C_SAMPLE_BORROW_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowByEqualTo(String value) {
            addCriterion("C_SAMPLE_BORROW_BY =", value, "cSampleBorrowBy");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowByNotEqualTo(String value) {
            addCriterion("C_SAMPLE_BORROW_BY <>", value, "cSampleBorrowBy");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowByGreaterThan(String value) {
            addCriterion("C_SAMPLE_BORROW_BY >", value, "cSampleBorrowBy");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowByGreaterThanOrEqualTo(String value) {
            addCriterion("C_SAMPLE_BORROW_BY >=", value, "cSampleBorrowBy");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowByLessThan(String value) {
            addCriterion("C_SAMPLE_BORROW_BY <", value, "cSampleBorrowBy");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowByLessThanOrEqualTo(String value) {
            addCriterion("C_SAMPLE_BORROW_BY <=", value, "cSampleBorrowBy");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowByLike(String value) {
            addCriterion("C_SAMPLE_BORROW_BY like", value, "cSampleBorrowBy");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowByNotLike(String value) {
            addCriterion("C_SAMPLE_BORROW_BY not like", value, "cSampleBorrowBy");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowByIn(List<String> values) {
            addCriterion("C_SAMPLE_BORROW_BY in", values, "cSampleBorrowBy");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowByNotIn(List<String> values) {
            addCriterion("C_SAMPLE_BORROW_BY not in", values, "cSampleBorrowBy");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowByBetween(String value1, String value2) {
            addCriterion("C_SAMPLE_BORROW_BY between", value1, value2, "cSampleBorrowBy");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowByNotBetween(String value1, String value2) {
            addCriterion("C_SAMPLE_BORROW_BY not between", value1, value2, "cSampleBorrowBy");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowDateIsNull() {
            addCriterion("C_SAMPLE_BORROW_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowDateIsNotNull() {
            addCriterion("C_SAMPLE_BORROW_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_BORROW_DATE =", value, "cSampleBorrowDate");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_BORROW_DATE <>", value, "cSampleBorrowDate");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_BORROW_DATE >", value, "cSampleBorrowDate");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_BORROW_DATE >=", value, "cSampleBorrowDate");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowDateLessThan(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_BORROW_DATE <", value, "cSampleBorrowDate");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_BORROW_DATE <=", value, "cSampleBorrowDate");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_SAMPLE_BORROW_DATE in", values, "cSampleBorrowDate");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_SAMPLE_BORROW_DATE not in", values, "cSampleBorrowDate");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_SAMPLE_BORROW_DATE between", value1, value2, "cSampleBorrowDate");
            return (Criteria) this;
        }

        public Criteria andCSampleBorrowDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_SAMPLE_BORROW_DATE not between", value1, value2, "cSampleBorrowDate");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnByIsNull() {
            addCriterion("C_SAMPLE_RETURN_BY is null");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnByIsNotNull() {
            addCriterion("C_SAMPLE_RETURN_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnByEqualTo(String value) {
            addCriterion("C_SAMPLE_RETURN_BY =", value, "cSampleReturnBy");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnByNotEqualTo(String value) {
            addCriterion("C_SAMPLE_RETURN_BY <>", value, "cSampleReturnBy");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnByGreaterThan(String value) {
            addCriterion("C_SAMPLE_RETURN_BY >", value, "cSampleReturnBy");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnByGreaterThanOrEqualTo(String value) {
            addCriterion("C_SAMPLE_RETURN_BY >=", value, "cSampleReturnBy");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnByLessThan(String value) {
            addCriterion("C_SAMPLE_RETURN_BY <", value, "cSampleReturnBy");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnByLessThanOrEqualTo(String value) {
            addCriterion("C_SAMPLE_RETURN_BY <=", value, "cSampleReturnBy");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnByLike(String value) {
            addCriterion("C_SAMPLE_RETURN_BY like", value, "cSampleReturnBy");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnByNotLike(String value) {
            addCriterion("C_SAMPLE_RETURN_BY not like", value, "cSampleReturnBy");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnByIn(List<String> values) {
            addCriterion("C_SAMPLE_RETURN_BY in", values, "cSampleReturnBy");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnByNotIn(List<String> values) {
            addCriterion("C_SAMPLE_RETURN_BY not in", values, "cSampleReturnBy");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnByBetween(String value1, String value2) {
            addCriterion("C_SAMPLE_RETURN_BY between", value1, value2, "cSampleReturnBy");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnByNotBetween(String value1, String value2) {
            addCriterion("C_SAMPLE_RETURN_BY not between", value1, value2, "cSampleReturnBy");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnDateIsNull() {
            addCriterion("C_SAMPLE_RETURN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnDateIsNotNull() {
            addCriterion("C_SAMPLE_RETURN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnDateEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_RETURN_DATE =", value, "cSampleReturnDate");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_RETURN_DATE <>", value, "cSampleReturnDate");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnDateGreaterThan(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_RETURN_DATE >", value, "cSampleReturnDate");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_RETURN_DATE >=", value, "cSampleReturnDate");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnDateLessThan(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_RETURN_DATE <", value, "cSampleReturnDate");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_SAMPLE_RETURN_DATE <=", value, "cSampleReturnDate");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnDateIn(List<Date> values) {
            addCriterionForJDBCDate("C_SAMPLE_RETURN_DATE in", values, "cSampleReturnDate");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_SAMPLE_RETURN_DATE not in", values, "cSampleReturnDate");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_SAMPLE_RETURN_DATE between", value1, value2, "cSampleReturnDate");
            return (Criteria) this;
        }

        public Criteria andCSampleReturnDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_SAMPLE_RETURN_DATE not between", value1, value2, "cSampleReturnDate");
            return (Criteria) this;
        }

        public Criteria andReportNumberBakIsNull() {
            addCriterion("REPORT_NUMBER_BAK is null");
            return (Criteria) this;
        }

        public Criteria andReportNumberBakIsNotNull() {
            addCriterion("REPORT_NUMBER_BAK is not null");
            return (Criteria) this;
        }

        public Criteria andReportNumberBakEqualTo(Long value) {
            addCriterion("REPORT_NUMBER_BAK =", value, "reportNumberBak");
            return (Criteria) this;
        }

        public Criteria andReportNumberBakNotEqualTo(Long value) {
            addCriterion("REPORT_NUMBER_BAK <>", value, "reportNumberBak");
            return (Criteria) this;
        }

        public Criteria andReportNumberBakGreaterThan(Long value) {
            addCriterion("REPORT_NUMBER_BAK >", value, "reportNumberBak");
            return (Criteria) this;
        }

        public Criteria andReportNumberBakGreaterThanOrEqualTo(Long value) {
            addCriterion("REPORT_NUMBER_BAK >=", value, "reportNumberBak");
            return (Criteria) this;
        }

        public Criteria andReportNumberBakLessThan(Long value) {
            addCriterion("REPORT_NUMBER_BAK <", value, "reportNumberBak");
            return (Criteria) this;
        }

        public Criteria andReportNumberBakLessThanOrEqualTo(Long value) {
            addCriterion("REPORT_NUMBER_BAK <=", value, "reportNumberBak");
            return (Criteria) this;
        }

        public Criteria andReportNumberBakIn(List<Long> values) {
            addCriterion("REPORT_NUMBER_BAK in", values, "reportNumberBak");
            return (Criteria) this;
        }

        public Criteria andReportNumberBakNotIn(List<Long> values) {
            addCriterion("REPORT_NUMBER_BAK not in", values, "reportNumberBak");
            return (Criteria) this;
        }

        public Criteria andReportNumberBakBetween(Long value1, Long value2) {
            addCriterion("REPORT_NUMBER_BAK between", value1, value2, "reportNumberBak");
            return (Criteria) this;
        }

        public Criteria andReportNumberBakNotBetween(Long value1, Long value2) {
            addCriterion("REPORT_NUMBER_BAK not between", value1, value2, "reportNumberBak");
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

        public Criteria andCIsDownparamIsNull() {
            addCriterion("C_IS_DOWNPARAM is null");
            return (Criteria) this;
        }

        public Criteria andCIsDownparamIsNotNull() {
            addCriterion("C_IS_DOWNPARAM is not null");
            return (Criteria) this;
        }

        public Criteria andCIsDownparamEqualTo(String value) {
            addCriterion("C_IS_DOWNPARAM =", value, "cIsDownparam");
            return (Criteria) this;
        }

        public Criteria andCIsDownparamNotEqualTo(String value) {
            addCriterion("C_IS_DOWNPARAM <>", value, "cIsDownparam");
            return (Criteria) this;
        }

        public Criteria andCIsDownparamGreaterThan(String value) {
            addCriterion("C_IS_DOWNPARAM >", value, "cIsDownparam");
            return (Criteria) this;
        }

        public Criteria andCIsDownparamGreaterThanOrEqualTo(String value) {
            addCriterion("C_IS_DOWNPARAM >=", value, "cIsDownparam");
            return (Criteria) this;
        }

        public Criteria andCIsDownparamLessThan(String value) {
            addCriterion("C_IS_DOWNPARAM <", value, "cIsDownparam");
            return (Criteria) this;
        }

        public Criteria andCIsDownparamLessThanOrEqualTo(String value) {
            addCriterion("C_IS_DOWNPARAM <=", value, "cIsDownparam");
            return (Criteria) this;
        }

        public Criteria andCIsDownparamLike(String value) {
            addCriterion("C_IS_DOWNPARAM like", value, "cIsDownparam");
            return (Criteria) this;
        }

        public Criteria andCIsDownparamNotLike(String value) {
            addCriterion("C_IS_DOWNPARAM not like", value, "cIsDownparam");
            return (Criteria) this;
        }

        public Criteria andCIsDownparamIn(List<String> values) {
            addCriterion("C_IS_DOWNPARAM in", values, "cIsDownparam");
            return (Criteria) this;
        }

        public Criteria andCIsDownparamNotIn(List<String> values) {
            addCriterion("C_IS_DOWNPARAM not in", values, "cIsDownparam");
            return (Criteria) this;
        }

        public Criteria andCIsDownparamBetween(String value1, String value2) {
            addCriterion("C_IS_DOWNPARAM between", value1, value2, "cIsDownparam");
            return (Criteria) this;
        }

        public Criteria andCIsDownparamNotBetween(String value1, String value2) {
            addCriterion("C_IS_DOWNPARAM not between", value1, value2, "cIsDownparam");
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