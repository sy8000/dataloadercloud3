package cn.besbing.model.entities.primary;

import java.util.ArrayList;
import java.util.List;

public class DlParamAfterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DlParamAfterExample() {
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

        public Criteria andSamplingPointIsNull() {
            addCriterion("SAMPLING_POINT is null");
            return (Criteria) this;
        }

        public Criteria andSamplingPointIsNotNull() {
            addCriterion("SAMPLING_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andSamplingPointEqualTo(String value) {
            addCriterion("SAMPLING_POINT =", value, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointNotEqualTo(String value) {
            addCriterion("SAMPLING_POINT <>", value, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointGreaterThan(String value) {
            addCriterion("SAMPLING_POINT >", value, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLING_POINT >=", value, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointLessThan(String value) {
            addCriterion("SAMPLING_POINT <", value, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointLessThanOrEqualTo(String value) {
            addCriterion("SAMPLING_POINT <=", value, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointLike(String value) {
            addCriterion("SAMPLING_POINT like", value, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointNotLike(String value) {
            addCriterion("SAMPLING_POINT not like", value, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointIn(List<String> values) {
            addCriterion("SAMPLING_POINT in", values, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointNotIn(List<String> values) {
            addCriterion("SAMPLING_POINT not in", values, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointBetween(String value1, String value2) {
            addCriterion("SAMPLING_POINT between", value1, value2, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointNotBetween(String value1, String value2) {
            addCriterion("SAMPLING_POINT not between", value1, value2, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("GRADE is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("GRADE like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("GRADE not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andStageIsNull() {
            addCriterion("STAGE is null");
            return (Criteria) this;
        }

        public Criteria andStageIsNotNull() {
            addCriterion("STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andStageEqualTo(String value) {
            addCriterion("STAGE =", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotEqualTo(String value) {
            addCriterion("STAGE <>", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThan(String value) {
            addCriterion("STAGE >", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE >=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThan(String value) {
            addCriterion("STAGE <", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThanOrEqualTo(String value) {
            addCriterion("STAGE <=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLike(String value) {
            addCriterion("STAGE like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotLike(String value) {
            addCriterion("STAGE not like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageIn(List<String> values) {
            addCriterion("STAGE in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotIn(List<String> values) {
            addCriterion("STAGE not in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageBetween(String value1, String value2) {
            addCriterion("STAGE between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotBetween(String value1, String value2) {
            addCriterion("STAGE not between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andDisplayStringIsNull() {
            addCriterion("DISPLAY_STRING is null");
            return (Criteria) this;
        }

        public Criteria andDisplayStringIsNotNull() {
            addCriterion("DISPLAY_STRING is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayStringEqualTo(String value) {
            addCriterion("DISPLAY_STRING =", value, "displayString");
            return (Criteria) this;
        }

        public Criteria andDisplayStringNotEqualTo(String value) {
            addCriterion("DISPLAY_STRING <>", value, "displayString");
            return (Criteria) this;
        }

        public Criteria andDisplayStringGreaterThan(String value) {
            addCriterion("DISPLAY_STRING >", value, "displayString");
            return (Criteria) this;
        }

        public Criteria andDisplayStringGreaterThanOrEqualTo(String value) {
            addCriterion("DISPLAY_STRING >=", value, "displayString");
            return (Criteria) this;
        }

        public Criteria andDisplayStringLessThan(String value) {
            addCriterion("DISPLAY_STRING <", value, "displayString");
            return (Criteria) this;
        }

        public Criteria andDisplayStringLessThanOrEqualTo(String value) {
            addCriterion("DISPLAY_STRING <=", value, "displayString");
            return (Criteria) this;
        }

        public Criteria andDisplayStringLike(String value) {
            addCriterion("DISPLAY_STRING like", value, "displayString");
            return (Criteria) this;
        }

        public Criteria andDisplayStringNotLike(String value) {
            addCriterion("DISPLAY_STRING not like", value, "displayString");
            return (Criteria) this;
        }

        public Criteria andDisplayStringIn(List<String> values) {
            addCriterion("DISPLAY_STRING in", values, "displayString");
            return (Criteria) this;
        }

        public Criteria andDisplayStringNotIn(List<String> values) {
            addCriterion("DISPLAY_STRING not in", values, "displayString");
            return (Criteria) this;
        }

        public Criteria andDisplayStringBetween(String value1, String value2) {
            addCriterion("DISPLAY_STRING between", value1, value2, "displayString");
            return (Criteria) this;
        }

        public Criteria andDisplayStringNotBetween(String value1, String value2) {
            addCriterion("DISPLAY_STRING not between", value1, value2, "displayString");
            return (Criteria) this;
        }

        public Criteria andComponentIsNull() {
            addCriterion("COMPONENT is null");
            return (Criteria) this;
        }

        public Criteria andComponentIsNotNull() {
            addCriterion("COMPONENT is not null");
            return (Criteria) this;
        }

        public Criteria andComponentEqualTo(String value) {
            addCriterion("COMPONENT =", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotEqualTo(String value) {
            addCriterion("COMPONENT <>", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentGreaterThan(String value) {
            addCriterion("COMPONENT >", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentGreaterThanOrEqualTo(String value) {
            addCriterion("COMPONENT >=", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLessThan(String value) {
            addCriterion("COMPONENT <", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLessThanOrEqualTo(String value) {
            addCriterion("COMPONENT <=", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLike(String value) {
            addCriterion("COMPONENT like", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotLike(String value) {
            addCriterion("COMPONENT not like", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentIn(List<String> values) {
            addCriterion("COMPONENT in", values, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotIn(List<String> values) {
            addCriterion("COMPONENT not in", values, "component");
            return (Criteria) this;
        }

        public Criteria andComponentBetween(String value1, String value2) {
            addCriterion("COMPONENT between", value1, value2, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotBetween(String value1, String value2) {
            addCriterion("COMPONENT not between", value1, value2, "component");
            return (Criteria) this;
        }

        public Criteria andMaximumIsNull() {
            addCriterion("MAXIMUM is null");
            return (Criteria) this;
        }

        public Criteria andMaximumIsNotNull() {
            addCriterion("MAXIMUM is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumEqualTo(String value) {
            addCriterion("MAXIMUM =", value, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumNotEqualTo(String value) {
            addCriterion("MAXIMUM <>", value, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumGreaterThan(String value) {
            addCriterion("MAXIMUM >", value, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumGreaterThanOrEqualTo(String value) {
            addCriterion("MAXIMUM >=", value, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumLessThan(String value) {
            addCriterion("MAXIMUM <", value, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumLessThanOrEqualTo(String value) {
            addCriterion("MAXIMUM <=", value, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumLike(String value) {
            addCriterion("MAXIMUM like", value, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumNotLike(String value) {
            addCriterion("MAXIMUM not like", value, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumIn(List<String> values) {
            addCriterion("MAXIMUM in", values, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumNotIn(List<String> values) {
            addCriterion("MAXIMUM not in", values, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumBetween(String value1, String value2) {
            addCriterion("MAXIMUM between", value1, value2, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumNotBetween(String value1, String value2) {
            addCriterion("MAXIMUM not between", value1, value2, "maximum");
            return (Criteria) this;
        }

        public Criteria andMinimumIsNull() {
            addCriterion("MINIMUM is null");
            return (Criteria) this;
        }

        public Criteria andMinimumIsNotNull() {
            addCriterion("MINIMUM is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumEqualTo(String value) {
            addCriterion("MINIMUM =", value, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumNotEqualTo(String value) {
            addCriterion("MINIMUM <>", value, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumGreaterThan(String value) {
            addCriterion("MINIMUM >", value, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumGreaterThanOrEqualTo(String value) {
            addCriterion("MINIMUM >=", value, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumLessThan(String value) {
            addCriterion("MINIMUM <", value, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumLessThanOrEqualTo(String value) {
            addCriterion("MINIMUM <=", value, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumLike(String value) {
            addCriterion("MINIMUM like", value, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumNotLike(String value) {
            addCriterion("MINIMUM not like", value, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumIn(List<String> values) {
            addCriterion("MINIMUM in", values, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumNotIn(List<String> values) {
            addCriterion("MINIMUM not in", values, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumBetween(String value1, String value2) {
            addCriterion("MINIMUM between", value1, value2, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumNotBetween(String value1, String value2) {
            addCriterion("MINIMUM not between", value1, value2, "minimum");
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