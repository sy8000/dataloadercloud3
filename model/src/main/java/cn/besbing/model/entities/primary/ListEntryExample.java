package cn.besbing.model.entities.primary;

import java.util.ArrayList;
import java.util.List;

public class ListEntryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ListEntryExample() {
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

        public Criteria andListIsNull() {
            addCriterion("LIST is null");
            return (Criteria) this;
        }

        public Criteria andListIsNotNull() {
            addCriterion("LIST is not null");
            return (Criteria) this;
        }

        public Criteria andListEqualTo(String value) {
            addCriterion("LIST =", value, "list");
            return (Criteria) this;
        }

        public Criteria andListNotEqualTo(String value) {
            addCriterion("LIST <>", value, "list");
            return (Criteria) this;
        }

        public Criteria andListGreaterThan(String value) {
            addCriterion("LIST >", value, "list");
            return (Criteria) this;
        }

        public Criteria andListGreaterThanOrEqualTo(String value) {
            addCriterion("LIST >=", value, "list");
            return (Criteria) this;
        }

        public Criteria andListLessThan(String value) {
            addCriterion("LIST <", value, "list");
            return (Criteria) this;
        }

        public Criteria andListLessThanOrEqualTo(String value) {
            addCriterion("LIST <=", value, "list");
            return (Criteria) this;
        }

        public Criteria andListLike(String value) {
            addCriterion("LIST like", value, "list");
            return (Criteria) this;
        }

        public Criteria andListNotLike(String value) {
            addCriterion("LIST not like", value, "list");
            return (Criteria) this;
        }

        public Criteria andListIn(List<String> values) {
            addCriterion("LIST in", values, "list");
            return (Criteria) this;
        }

        public Criteria andListNotIn(List<String> values) {
            addCriterion("LIST not in", values, "list");
            return (Criteria) this;
        }

        public Criteria andListBetween(String value1, String value2) {
            addCriterion("LIST between", value1, value2, "list");
            return (Criteria) this;
        }

        public Criteria andListNotBetween(String value1, String value2) {
            addCriterion("LIST not between", value1, value2, "list");
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

        public Criteria andValueIsNull() {
            addCriterion("VALUE is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("VALUE =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("VALUE <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("VALUE >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("VALUE >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("VALUE <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("VALUE <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("VALUE like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("VALUE not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("VALUE in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("VALUE not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("VALUE between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("VALUE not between", value1, value2, "value");
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

        public Criteria andCEnValueIsNull() {
            addCriterion("C_EN_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andCEnValueIsNotNull() {
            addCriterion("C_EN_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCEnValueEqualTo(String value) {
            addCriterion("C_EN_VALUE =", value, "cEnValue");
            return (Criteria) this;
        }

        public Criteria andCEnValueNotEqualTo(String value) {
            addCriterion("C_EN_VALUE <>", value, "cEnValue");
            return (Criteria) this;
        }

        public Criteria andCEnValueGreaterThan(String value) {
            addCriterion("C_EN_VALUE >", value, "cEnValue");
            return (Criteria) this;
        }

        public Criteria andCEnValueGreaterThanOrEqualTo(String value) {
            addCriterion("C_EN_VALUE >=", value, "cEnValue");
            return (Criteria) this;
        }

        public Criteria andCEnValueLessThan(String value) {
            addCriterion("C_EN_VALUE <", value, "cEnValue");
            return (Criteria) this;
        }

        public Criteria andCEnValueLessThanOrEqualTo(String value) {
            addCriterion("C_EN_VALUE <=", value, "cEnValue");
            return (Criteria) this;
        }

        public Criteria andCEnValueLike(String value) {
            addCriterion("C_EN_VALUE like", value, "cEnValue");
            return (Criteria) this;
        }

        public Criteria andCEnValueNotLike(String value) {
            addCriterion("C_EN_VALUE not like", value, "cEnValue");
            return (Criteria) this;
        }

        public Criteria andCEnValueIn(List<String> values) {
            addCriterion("C_EN_VALUE in", values, "cEnValue");
            return (Criteria) this;
        }

        public Criteria andCEnValueNotIn(List<String> values) {
            addCriterion("C_EN_VALUE not in", values, "cEnValue");
            return (Criteria) this;
        }

        public Criteria andCEnValueBetween(String value1, String value2) {
            addCriterion("C_EN_VALUE between", value1, value2, "cEnValue");
            return (Criteria) this;
        }

        public Criteria andCEnValueNotBetween(String value1, String value2) {
            addCriterion("C_EN_VALUE not between", value1, value2, "cEnValue");
            return (Criteria) this;
        }

        public Criteria andCContValueIsNull() {
            addCriterion("C_CONT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andCContValueIsNotNull() {
            addCriterion("C_CONT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCContValueEqualTo(Long value) {
            addCriterion("C_CONT_VALUE =", value, "cContValue");
            return (Criteria) this;
        }

        public Criteria andCContValueNotEqualTo(Long value) {
            addCriterion("C_CONT_VALUE <>", value, "cContValue");
            return (Criteria) this;
        }

        public Criteria andCContValueGreaterThan(Long value) {
            addCriterion("C_CONT_VALUE >", value, "cContValue");
            return (Criteria) this;
        }

        public Criteria andCContValueGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CONT_VALUE >=", value, "cContValue");
            return (Criteria) this;
        }

        public Criteria andCContValueLessThan(Long value) {
            addCriterion("C_CONT_VALUE <", value, "cContValue");
            return (Criteria) this;
        }

        public Criteria andCContValueLessThanOrEqualTo(Long value) {
            addCriterion("C_CONT_VALUE <=", value, "cContValue");
            return (Criteria) this;
        }

        public Criteria andCContValueIn(List<Long> values) {
            addCriterion("C_CONT_VALUE in", values, "cContValue");
            return (Criteria) this;
        }

        public Criteria andCContValueNotIn(List<Long> values) {
            addCriterion("C_CONT_VALUE not in", values, "cContValue");
            return (Criteria) this;
        }

        public Criteria andCContValueBetween(Long value1, Long value2) {
            addCriterion("C_CONT_VALUE between", value1, value2, "cContValue");
            return (Criteria) this;
        }

        public Criteria andCContValueNotBetween(Long value1, Long value2) {
            addCriterion("C_CONT_VALUE not between", value1, value2, "cContValue");
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