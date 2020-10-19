package cn.besbing.model.entities.primary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DualExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DualExample() {
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

        public Criteria andDummyIsNull() {
            addCriterion("DUMMY is null");
            return (Criteria) this;
        }

        public Criteria andDummyIsNotNull() {
            addCriterion("DUMMY is not null");
            return (Criteria) this;
        }

        public Criteria andDummyEqualTo(String value) {
            addCriterion("DUMMY =", value, "dummy");
            return (Criteria) this;
        }

        public Criteria andDummyNotEqualTo(String value) {
            addCriterion("DUMMY <>", value, "dummy");
            return (Criteria) this;
        }

        public Criteria andDummyGreaterThan(String value) {
            addCriterion("DUMMY >", value, "dummy");
            return (Criteria) this;
        }

        public Criteria andDummyGreaterThanOrEqualTo(String value) {
            addCriterion("DUMMY >=", value, "dummy");
            return (Criteria) this;
        }

        public Criteria andDummyLessThan(String value) {
            addCriterion("DUMMY <", value, "dummy");
            return (Criteria) this;
        }

        public Criteria andDummyLessThanOrEqualTo(String value) {
            addCriterion("DUMMY <=", value, "dummy");
            return (Criteria) this;
        }

        public Criteria andDummyLike(String value) {
            addCriterion("DUMMY like", value, "dummy");
            return (Criteria) this;
        }

        public Criteria andDummyNotLike(String value) {
            addCriterion("DUMMY not like", value, "dummy");
            return (Criteria) this;
        }

        public Criteria andDummyIn(List<String> values) {
            addCriterion("DUMMY in", values, "dummy");
            return (Criteria) this;
        }

        public Criteria andDummyNotIn(List<String> values) {
            addCriterion("DUMMY not in", values, "dummy");
            return (Criteria) this;
        }

        public Criteria andDummyBetween(String value1, String value2) {
            addCriterion("DUMMY between", value1, value2, "dummy");
            return (Criteria) this;
        }

        public Criteria andDummyNotBetween(String value1, String value2) {
            addCriterion("DUMMY not between", value1, value2, "dummy");
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