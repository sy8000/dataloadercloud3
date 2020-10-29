package cn.besbing.model.entities.primary;

import java.util.ArrayList;
import java.util.List;

public class ResultViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResultViewExample() {
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

        public Criteria andSampleNumberIsNull() {
            addCriterion("SAMPLE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSampleNumberIsNotNull() {
            addCriterion("SAMPLE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSampleNumberEqualTo(Long value) {
            addCriterion("SAMPLE_NUMBER =", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberNotEqualTo(Long value) {
            addCriterion("SAMPLE_NUMBER <>", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberGreaterThan(Long value) {
            addCriterion("SAMPLE_NUMBER >", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("SAMPLE_NUMBER >=", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberLessThan(Long value) {
            addCriterion("SAMPLE_NUMBER <", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberLessThanOrEqualTo(Long value) {
            addCriterion("SAMPLE_NUMBER <=", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberIn(List<Long> values) {
            addCriterion("SAMPLE_NUMBER in", values, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberNotIn(List<Long> values) {
            addCriterion("SAMPLE_NUMBER not in", values, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberBetween(Long value1, Long value2) {
            addCriterion("SAMPLE_NUMBER between", value1, value2, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberNotBetween(Long value1, Long value2) {
            addCriterion("SAMPLE_NUMBER not between", value1, value2, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andFormatvalueIsNull() {
            addCriterion("FORMATVALUE is null");
            return (Criteria) this;
        }

        public Criteria andFormatvalueIsNotNull() {
            addCriterion("FORMATVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andFormatvalueEqualTo(String value) {
            addCriterion("FORMATVALUE =", value, "formatvalue");
            return (Criteria) this;
        }

        public Criteria andFormatvalueNotEqualTo(String value) {
            addCriterion("FORMATVALUE <>", value, "formatvalue");
            return (Criteria) this;
        }

        public Criteria andFormatvalueGreaterThan(String value) {
            addCriterion("FORMATVALUE >", value, "formatvalue");
            return (Criteria) this;
        }

        public Criteria andFormatvalueGreaterThanOrEqualTo(String value) {
            addCriterion("FORMATVALUE >=", value, "formatvalue");
            return (Criteria) this;
        }

        public Criteria andFormatvalueLessThan(String value) {
            addCriterion("FORMATVALUE <", value, "formatvalue");
            return (Criteria) this;
        }

        public Criteria andFormatvalueLessThanOrEqualTo(String value) {
            addCriterion("FORMATVALUE <=", value, "formatvalue");
            return (Criteria) this;
        }

        public Criteria andFormatvalueLike(String value) {
            addCriterion("FORMATVALUE like", value, "formatvalue");
            return (Criteria) this;
        }

        public Criteria andFormatvalueNotLike(String value) {
            addCriterion("FORMATVALUE not like", value, "formatvalue");
            return (Criteria) this;
        }

        public Criteria andFormatvalueIn(List<String> values) {
            addCriterion("FORMATVALUE in", values, "formatvalue");
            return (Criteria) this;
        }

        public Criteria andFormatvalueNotIn(List<String> values) {
            addCriterion("FORMATVALUE not in", values, "formatvalue");
            return (Criteria) this;
        }

        public Criteria andFormatvalueBetween(String value1, String value2) {
            addCriterion("FORMATVALUE between", value1, value2, "formatvalue");
            return (Criteria) this;
        }

        public Criteria andFormatvalueNotBetween(String value1, String value2) {
            addCriterion("FORMATVALUE not between", value1, value2, "formatvalue");
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

        public Criteria andCTaskSeqNumIsNull() {
            addCriterion("C_TASK_SEQ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumIsNotNull() {
            addCriterion("C_TASK_SEQ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumEqualTo(Long value) {
            addCriterion("C_TASK_SEQ_NUM =", value, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumNotEqualTo(Long value) {
            addCriterion("C_TASK_SEQ_NUM <>", value, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumGreaterThan(Long value) {
            addCriterion("C_TASK_SEQ_NUM >", value, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumGreaterThanOrEqualTo(Long value) {
            addCriterion("C_TASK_SEQ_NUM >=", value, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumLessThan(Long value) {
            addCriterion("C_TASK_SEQ_NUM <", value, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumLessThanOrEqualTo(Long value) {
            addCriterion("C_TASK_SEQ_NUM <=", value, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumIn(List<Long> values) {
            addCriterion("C_TASK_SEQ_NUM in", values, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumNotIn(List<Long> values) {
            addCriterion("C_TASK_SEQ_NUM not in", values, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumBetween(Long value1, Long value2) {
            addCriterion("C_TASK_SEQ_NUM between", value1, value2, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumNotBetween(Long value1, Long value2) {
            addCriterion("C_TASK_SEQ_NUM not between", value1, value2, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskIdIsNull() {
            addCriterion("C_TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCTaskIdIsNotNull() {
            addCriterion("C_TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCTaskIdEqualTo(String value) {
            addCriterion("C_TASK_ID =", value, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdNotEqualTo(String value) {
            addCriterion("C_TASK_ID <>", value, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdGreaterThan(String value) {
            addCriterion("C_TASK_ID >", value, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("C_TASK_ID >=", value, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdLessThan(String value) {
            addCriterion("C_TASK_ID <", value, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdLessThanOrEqualTo(String value) {
            addCriterion("C_TASK_ID <=", value, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdLike(String value) {
            addCriterion("C_TASK_ID like", value, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdNotLike(String value) {
            addCriterion("C_TASK_ID not like", value, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdIn(List<String> values) {
            addCriterion("C_TASK_ID in", values, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdNotIn(List<String> values) {
            addCriterion("C_TASK_ID not in", values, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdBetween(String value1, String value2) {
            addCriterion("C_TASK_ID between", value1, value2, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdNotBetween(String value1, String value2) {
            addCriterion("C_TASK_ID not between", value1, value2, "cTaskId");
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