package cn.besbing.model.entities.primary;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SampleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SampleExample() {
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

        public Criteria andTextIdIsNull() {
            addCriterion("TEXT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTextIdIsNotNull() {
            addCriterion("TEXT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTextIdEqualTo(String value) {
            addCriterion("TEXT_ID =", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdNotEqualTo(String value) {
            addCriterion("TEXT_ID <>", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdGreaterThan(String value) {
            addCriterion("TEXT_ID >", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdGreaterThanOrEqualTo(String value) {
            addCriterion("TEXT_ID >=", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdLessThan(String value) {
            addCriterion("TEXT_ID <", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdLessThanOrEqualTo(String value) {
            addCriterion("TEXT_ID <=", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdLike(String value) {
            addCriterion("TEXT_ID like", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdNotLike(String value) {
            addCriterion("TEXT_ID not like", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdIn(List<String> values) {
            addCriterion("TEXT_ID in", values, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdNotIn(List<String> values) {
            addCriterion("TEXT_ID not in", values, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdBetween(String value1, String value2) {
            addCriterion("TEXT_ID between", value1, value2, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdNotBetween(String value1, String value2) {
            addCriterion("TEXT_ID not between", value1, value2, "textId");
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

        public Criteria andDispFldsIsNull() {
            addCriterion("DISP_FLDS is null");
            return (Criteria) this;
        }

        public Criteria andDispFldsIsNotNull() {
            addCriterion("DISP_FLDS is not null");
            return (Criteria) this;
        }

        public Criteria andDispFldsEqualTo(String value) {
            addCriterion("DISP_FLDS =", value, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsNotEqualTo(String value) {
            addCriterion("DISP_FLDS <>", value, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsGreaterThan(String value) {
            addCriterion("DISP_FLDS >", value, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsGreaterThanOrEqualTo(String value) {
            addCriterion("DISP_FLDS >=", value, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsLessThan(String value) {
            addCriterion("DISP_FLDS <", value, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsLessThanOrEqualTo(String value) {
            addCriterion("DISP_FLDS <=", value, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsLike(String value) {
            addCriterion("DISP_FLDS like", value, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsNotLike(String value) {
            addCriterion("DISP_FLDS not like", value, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsIn(List<String> values) {
            addCriterion("DISP_FLDS in", values, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsNotIn(List<String> values) {
            addCriterion("DISP_FLDS not in", values, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsBetween(String value1, String value2) {
            addCriterion("DISP_FLDS between", value1, value2, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsNotBetween(String value1, String value2) {
            addCriterion("DISP_FLDS not between", value1, value2, "dispFlds");
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

        public Criteria andInSpecIsNull() {
            addCriterion("IN_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andInSpecIsNotNull() {
            addCriterion("IN_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andInSpecEqualTo(String value) {
            addCriterion("IN_SPEC =", value, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecNotEqualTo(String value) {
            addCriterion("IN_SPEC <>", value, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecGreaterThan(String value) {
            addCriterion("IN_SPEC >", value, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecGreaterThanOrEqualTo(String value) {
            addCriterion("IN_SPEC >=", value, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecLessThan(String value) {
            addCriterion("IN_SPEC <", value, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecLessThanOrEqualTo(String value) {
            addCriterion("IN_SPEC <=", value, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecLike(String value) {
            addCriterion("IN_SPEC like", value, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecNotLike(String value) {
            addCriterion("IN_SPEC not like", value, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecIn(List<String> values) {
            addCriterion("IN_SPEC in", values, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecNotIn(List<String> values) {
            addCriterion("IN_SPEC not in", values, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecBetween(String value1, String value2) {
            addCriterion("IN_SPEC between", value1, value2, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecNotBetween(String value1, String value2) {
            addCriterion("IN_SPEC not between", value1, value2, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInCalIsNull() {
            addCriterion("IN_CAL is null");
            return (Criteria) this;
        }

        public Criteria andInCalIsNotNull() {
            addCriterion("IN_CAL is not null");
            return (Criteria) this;
        }

        public Criteria andInCalEqualTo(String value) {
            addCriterion("IN_CAL =", value, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalNotEqualTo(String value) {
            addCriterion("IN_CAL <>", value, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalGreaterThan(String value) {
            addCriterion("IN_CAL >", value, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalGreaterThanOrEqualTo(String value) {
            addCriterion("IN_CAL >=", value, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalLessThan(String value) {
            addCriterion("IN_CAL <", value, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalLessThanOrEqualTo(String value) {
            addCriterion("IN_CAL <=", value, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalLike(String value) {
            addCriterion("IN_CAL like", value, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalNotLike(String value) {
            addCriterion("IN_CAL not like", value, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalIn(List<String> values) {
            addCriterion("IN_CAL in", values, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalNotIn(List<String> values) {
            addCriterion("IN_CAL not in", values, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalBetween(String value1, String value2) {
            addCriterion("IN_CAL between", value1, value2, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalNotBetween(String value1, String value2) {
            addCriterion("IN_CAL not between", value1, value2, "inCal");
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

        public Criteria andReSampleIsNull() {
            addCriterion("RE_SAMPLE is null");
            return (Criteria) this;
        }

        public Criteria andReSampleIsNotNull() {
            addCriterion("RE_SAMPLE is not null");
            return (Criteria) this;
        }

        public Criteria andReSampleEqualTo(String value) {
            addCriterion("RE_SAMPLE =", value, "reSample");
            return (Criteria) this;
        }

        public Criteria andReSampleNotEqualTo(String value) {
            addCriterion("RE_SAMPLE <>", value, "reSample");
            return (Criteria) this;
        }

        public Criteria andReSampleGreaterThan(String value) {
            addCriterion("RE_SAMPLE >", value, "reSample");
            return (Criteria) this;
        }

        public Criteria andReSampleGreaterThanOrEqualTo(String value) {
            addCriterion("RE_SAMPLE >=", value, "reSample");
            return (Criteria) this;
        }

        public Criteria andReSampleLessThan(String value) {
            addCriterion("RE_SAMPLE <", value, "reSample");
            return (Criteria) this;
        }

        public Criteria andReSampleLessThanOrEqualTo(String value) {
            addCriterion("RE_SAMPLE <=", value, "reSample");
            return (Criteria) this;
        }

        public Criteria andReSampleLike(String value) {
            addCriterion("RE_SAMPLE like", value, "reSample");
            return (Criteria) this;
        }

        public Criteria andReSampleNotLike(String value) {
            addCriterion("RE_SAMPLE not like", value, "reSample");
            return (Criteria) this;
        }

        public Criteria andReSampleIn(List<String> values) {
            addCriterion("RE_SAMPLE in", values, "reSample");
            return (Criteria) this;
        }

        public Criteria andReSampleNotIn(List<String> values) {
            addCriterion("RE_SAMPLE not in", values, "reSample");
            return (Criteria) this;
        }

        public Criteria andReSampleBetween(String value1, String value2) {
            addCriterion("RE_SAMPLE between", value1, value2, "reSample");
            return (Criteria) this;
        }

        public Criteria andReSampleNotBetween(String value1, String value2) {
            addCriterion("RE_SAMPLE not between", value1, value2, "reSample");
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

        public Criteria andOriginalSampleIsNull() {
            addCriterion("ORIGINAL_SAMPLE is null");
            return (Criteria) this;
        }

        public Criteria andOriginalSampleIsNotNull() {
            addCriterion("ORIGINAL_SAMPLE is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalSampleEqualTo(Long value) {
            addCriterion("ORIGINAL_SAMPLE =", value, "originalSample");
            return (Criteria) this;
        }

        public Criteria andOriginalSampleNotEqualTo(Long value) {
            addCriterion("ORIGINAL_SAMPLE <>", value, "originalSample");
            return (Criteria) this;
        }

        public Criteria andOriginalSampleGreaterThan(Long value) {
            addCriterion("ORIGINAL_SAMPLE >", value, "originalSample");
            return (Criteria) this;
        }

        public Criteria andOriginalSampleGreaterThanOrEqualTo(Long value) {
            addCriterion("ORIGINAL_SAMPLE >=", value, "originalSample");
            return (Criteria) this;
        }

        public Criteria andOriginalSampleLessThan(Long value) {
            addCriterion("ORIGINAL_SAMPLE <", value, "originalSample");
            return (Criteria) this;
        }

        public Criteria andOriginalSampleLessThanOrEqualTo(Long value) {
            addCriterion("ORIGINAL_SAMPLE <=", value, "originalSample");
            return (Criteria) this;
        }

        public Criteria andOriginalSampleIn(List<Long> values) {
            addCriterion("ORIGINAL_SAMPLE in", values, "originalSample");
            return (Criteria) this;
        }

        public Criteria andOriginalSampleNotIn(List<Long> values) {
            addCriterion("ORIGINAL_SAMPLE not in", values, "originalSample");
            return (Criteria) this;
        }

        public Criteria andOriginalSampleBetween(Long value1, Long value2) {
            addCriterion("ORIGINAL_SAMPLE between", value1, value2, "originalSample");
            return (Criteria) this;
        }

        public Criteria andOriginalSampleNotBetween(Long value1, Long value2) {
            addCriterion("ORIGINAL_SAMPLE not between", value1, value2, "originalSample");
            return (Criteria) this;
        }

        public Criteria andParentSampleIsNull() {
            addCriterion("PARENT_SAMPLE is null");
            return (Criteria) this;
        }

        public Criteria andParentSampleIsNotNull() {
            addCriterion("PARENT_SAMPLE is not null");
            return (Criteria) this;
        }

        public Criteria andParentSampleEqualTo(Long value) {
            addCriterion("PARENT_SAMPLE =", value, "parentSample");
            return (Criteria) this;
        }

        public Criteria andParentSampleNotEqualTo(Long value) {
            addCriterion("PARENT_SAMPLE <>", value, "parentSample");
            return (Criteria) this;
        }

        public Criteria andParentSampleGreaterThan(Long value) {
            addCriterion("PARENT_SAMPLE >", value, "parentSample");
            return (Criteria) this;
        }

        public Criteria andParentSampleGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_SAMPLE >=", value, "parentSample");
            return (Criteria) this;
        }

        public Criteria andParentSampleLessThan(Long value) {
            addCriterion("PARENT_SAMPLE <", value, "parentSample");
            return (Criteria) this;
        }

        public Criteria andParentSampleLessThanOrEqualTo(Long value) {
            addCriterion("PARENT_SAMPLE <=", value, "parentSample");
            return (Criteria) this;
        }

        public Criteria andParentSampleIn(List<Long> values) {
            addCriterion("PARENT_SAMPLE in", values, "parentSample");
            return (Criteria) this;
        }

        public Criteria andParentSampleNotIn(List<Long> values) {
            addCriterion("PARENT_SAMPLE not in", values, "parentSample");
            return (Criteria) this;
        }

        public Criteria andParentSampleBetween(Long value1, Long value2) {
            addCriterion("PARENT_SAMPLE between", value1, value2, "parentSample");
            return (Criteria) this;
        }

        public Criteria andParentSampleNotBetween(Long value1, Long value2) {
            addCriterion("PARENT_SAMPLE not between", value1, value2, "parentSample");
            return (Criteria) this;
        }

        public Criteria andParentAliquotIsNull() {
            addCriterion("PARENT_ALIQUOT is null");
            return (Criteria) this;
        }

        public Criteria andParentAliquotIsNotNull() {
            addCriterion("PARENT_ALIQUOT is not null");
            return (Criteria) this;
        }

        public Criteria andParentAliquotEqualTo(Long value) {
            addCriterion("PARENT_ALIQUOT =", value, "parentAliquot");
            return (Criteria) this;
        }

        public Criteria andParentAliquotNotEqualTo(Long value) {
            addCriterion("PARENT_ALIQUOT <>", value, "parentAliquot");
            return (Criteria) this;
        }

        public Criteria andParentAliquotGreaterThan(Long value) {
            addCriterion("PARENT_ALIQUOT >", value, "parentAliquot");
            return (Criteria) this;
        }

        public Criteria andParentAliquotGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_ALIQUOT >=", value, "parentAliquot");
            return (Criteria) this;
        }

        public Criteria andParentAliquotLessThan(Long value) {
            addCriterion("PARENT_ALIQUOT <", value, "parentAliquot");
            return (Criteria) this;
        }

        public Criteria andParentAliquotLessThanOrEqualTo(Long value) {
            addCriterion("PARENT_ALIQUOT <=", value, "parentAliquot");
            return (Criteria) this;
        }

        public Criteria andParentAliquotIn(List<Long> values) {
            addCriterion("PARENT_ALIQUOT in", values, "parentAliquot");
            return (Criteria) this;
        }

        public Criteria andParentAliquotNotIn(List<Long> values) {
            addCriterion("PARENT_ALIQUOT not in", values, "parentAliquot");
            return (Criteria) this;
        }

        public Criteria andParentAliquotBetween(Long value1, Long value2) {
            addCriterion("PARENT_ALIQUOT between", value1, value2, "parentAliquot");
            return (Criteria) this;
        }

        public Criteria andParentAliquotNotBetween(Long value1, Long value2) {
            addCriterion("PARENT_ALIQUOT not between", value1, value2, "parentAliquot");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupIsNull() {
            addCriterion("ALIQUOT_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupIsNotNull() {
            addCriterion("ALIQUOT_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupEqualTo(String value) {
            addCriterion("ALIQUOT_GROUP =", value, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupNotEqualTo(String value) {
            addCriterion("ALIQUOT_GROUP <>", value, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupGreaterThan(String value) {
            addCriterion("ALIQUOT_GROUP >", value, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupGreaterThanOrEqualTo(String value) {
            addCriterion("ALIQUOT_GROUP >=", value, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupLessThan(String value) {
            addCriterion("ALIQUOT_GROUP <", value, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupLessThanOrEqualTo(String value) {
            addCriterion("ALIQUOT_GROUP <=", value, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupLike(String value) {
            addCriterion("ALIQUOT_GROUP like", value, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupNotLike(String value) {
            addCriterion("ALIQUOT_GROUP not like", value, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupIn(List<String> values) {
            addCriterion("ALIQUOT_GROUP in", values, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupNotIn(List<String> values) {
            addCriterion("ALIQUOT_GROUP not in", values, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupBetween(String value1, String value2) {
            addCriterion("ALIQUOT_GROUP between", value1, value2, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupNotBetween(String value1, String value2) {
            addCriterion("ALIQUOT_GROUP not between", value1, value2, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andSampleVolumeIsNull() {
            addCriterion("SAMPLE_VOLUME is null");
            return (Criteria) this;
        }

        public Criteria andSampleVolumeIsNotNull() {
            addCriterion("SAMPLE_VOLUME is not null");
            return (Criteria) this;
        }

        public Criteria andSampleVolumeEqualTo(BigDecimal value) {
            addCriterion("SAMPLE_VOLUME =", value, "sampleVolume");
            return (Criteria) this;
        }

        public Criteria andSampleVolumeNotEqualTo(BigDecimal value) {
            addCriterion("SAMPLE_VOLUME <>", value, "sampleVolume");
            return (Criteria) this;
        }

        public Criteria andSampleVolumeGreaterThan(BigDecimal value) {
            addCriterion("SAMPLE_VOLUME >", value, "sampleVolume");
            return (Criteria) this;
        }

        public Criteria andSampleVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SAMPLE_VOLUME >=", value, "sampleVolume");
            return (Criteria) this;
        }

        public Criteria andSampleVolumeLessThan(BigDecimal value) {
            addCriterion("SAMPLE_VOLUME <", value, "sampleVolume");
            return (Criteria) this;
        }

        public Criteria andSampleVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SAMPLE_VOLUME <=", value, "sampleVolume");
            return (Criteria) this;
        }

        public Criteria andSampleVolumeIn(List<BigDecimal> values) {
            addCriterion("SAMPLE_VOLUME in", values, "sampleVolume");
            return (Criteria) this;
        }

        public Criteria andSampleVolumeNotIn(List<BigDecimal> values) {
            addCriterion("SAMPLE_VOLUME not in", values, "sampleVolume");
            return (Criteria) this;
        }

        public Criteria andSampleVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAMPLE_VOLUME between", value1, value2, "sampleVolume");
            return (Criteria) this;
        }

        public Criteria andSampleVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAMPLE_VOLUME not between", value1, value2, "sampleVolume");
            return (Criteria) this;
        }

        public Criteria andSampleUnitsIsNull() {
            addCriterion("SAMPLE_UNITS is null");
            return (Criteria) this;
        }

        public Criteria andSampleUnitsIsNotNull() {
            addCriterion("SAMPLE_UNITS is not null");
            return (Criteria) this;
        }

        public Criteria andSampleUnitsEqualTo(String value) {
            addCriterion("SAMPLE_UNITS =", value, "sampleUnits");
            return (Criteria) this;
        }

        public Criteria andSampleUnitsNotEqualTo(String value) {
            addCriterion("SAMPLE_UNITS <>", value, "sampleUnits");
            return (Criteria) this;
        }

        public Criteria andSampleUnitsGreaterThan(String value) {
            addCriterion("SAMPLE_UNITS >", value, "sampleUnits");
            return (Criteria) this;
        }

        public Criteria andSampleUnitsGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_UNITS >=", value, "sampleUnits");
            return (Criteria) this;
        }

        public Criteria andSampleUnitsLessThan(String value) {
            addCriterion("SAMPLE_UNITS <", value, "sampleUnits");
            return (Criteria) this;
        }

        public Criteria andSampleUnitsLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_UNITS <=", value, "sampleUnits");
            return (Criteria) this;
        }

        public Criteria andSampleUnitsLike(String value) {
            addCriterion("SAMPLE_UNITS like", value, "sampleUnits");
            return (Criteria) this;
        }

        public Criteria andSampleUnitsNotLike(String value) {
            addCriterion("SAMPLE_UNITS not like", value, "sampleUnits");
            return (Criteria) this;
        }

        public Criteria andSampleUnitsIn(List<String> values) {
            addCriterion("SAMPLE_UNITS in", values, "sampleUnits");
            return (Criteria) this;
        }

        public Criteria andSampleUnitsNotIn(List<String> values) {
            addCriterion("SAMPLE_UNITS not in", values, "sampleUnits");
            return (Criteria) this;
        }

        public Criteria andSampleUnitsBetween(String value1, String value2) {
            addCriterion("SAMPLE_UNITS between", value1, value2, "sampleUnits");
            return (Criteria) this;
        }

        public Criteria andSampleUnitsNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_UNITS not between", value1, value2, "sampleUnits");
            return (Criteria) this;
        }

        public Criteria andLoginDateIsNull() {
            addCriterion("LOGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLoginDateIsNotNull() {
            addCriterion("LOGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLoginDateEqualTo(Date value) {
            addCriterionForJDBCDate("LOGIN_DATE =", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LOGIN_DATE <>", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThan(Date value) {
            addCriterionForJDBCDate("LOGIN_DATE >", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LOGIN_DATE >=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThan(Date value) {
            addCriterionForJDBCDate("LOGIN_DATE <", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LOGIN_DATE <=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateIn(List<Date> values) {
            addCriterionForJDBCDate("LOGIN_DATE in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LOGIN_DATE not in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LOGIN_DATE between", value1, value2, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LOGIN_DATE not between", value1, value2, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginByIsNull() {
            addCriterion("LOGIN_BY is null");
            return (Criteria) this;
        }

        public Criteria andLoginByIsNotNull() {
            addCriterion("LOGIN_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLoginByEqualTo(String value) {
            addCriterion("LOGIN_BY =", value, "loginBy");
            return (Criteria) this;
        }

        public Criteria andLoginByNotEqualTo(String value) {
            addCriterion("LOGIN_BY <>", value, "loginBy");
            return (Criteria) this;
        }

        public Criteria andLoginByGreaterThan(String value) {
            addCriterion("LOGIN_BY >", value, "loginBy");
            return (Criteria) this;
        }

        public Criteria andLoginByGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_BY >=", value, "loginBy");
            return (Criteria) this;
        }

        public Criteria andLoginByLessThan(String value) {
            addCriterion("LOGIN_BY <", value, "loginBy");
            return (Criteria) this;
        }

        public Criteria andLoginByLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_BY <=", value, "loginBy");
            return (Criteria) this;
        }

        public Criteria andLoginByLike(String value) {
            addCriterion("LOGIN_BY like", value, "loginBy");
            return (Criteria) this;
        }

        public Criteria andLoginByNotLike(String value) {
            addCriterion("LOGIN_BY not like", value, "loginBy");
            return (Criteria) this;
        }

        public Criteria andLoginByIn(List<String> values) {
            addCriterion("LOGIN_BY in", values, "loginBy");
            return (Criteria) this;
        }

        public Criteria andLoginByNotIn(List<String> values) {
            addCriterion("LOGIN_BY not in", values, "loginBy");
            return (Criteria) this;
        }

        public Criteria andLoginByBetween(String value1, String value2) {
            addCriterion("LOGIN_BY between", value1, value2, "loginBy");
            return (Criteria) this;
        }

        public Criteria andLoginByNotBetween(String value1, String value2) {
            addCriterion("LOGIN_BY not between", value1, value2, "loginBy");
            return (Criteria) this;
        }

        public Criteria andSampledDateIsNull() {
            addCriterion("SAMPLED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSampledDateIsNotNull() {
            addCriterion("SAMPLED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSampledDateEqualTo(Date value) {
            addCriterionForJDBCDate("SAMPLED_DATE =", value, "sampledDate");
            return (Criteria) this;
        }

        public Criteria andSampledDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SAMPLED_DATE <>", value, "sampledDate");
            return (Criteria) this;
        }

        public Criteria andSampledDateGreaterThan(Date value) {
            addCriterionForJDBCDate("SAMPLED_DATE >", value, "sampledDate");
            return (Criteria) this;
        }

        public Criteria andSampledDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SAMPLED_DATE >=", value, "sampledDate");
            return (Criteria) this;
        }

        public Criteria andSampledDateLessThan(Date value) {
            addCriterionForJDBCDate("SAMPLED_DATE <", value, "sampledDate");
            return (Criteria) this;
        }

        public Criteria andSampledDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SAMPLED_DATE <=", value, "sampledDate");
            return (Criteria) this;
        }

        public Criteria andSampledDateIn(List<Date> values) {
            addCriterionForJDBCDate("SAMPLED_DATE in", values, "sampledDate");
            return (Criteria) this;
        }

        public Criteria andSampledDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SAMPLED_DATE not in", values, "sampledDate");
            return (Criteria) this;
        }

        public Criteria andSampledDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SAMPLED_DATE between", value1, value2, "sampledDate");
            return (Criteria) this;
        }

        public Criteria andSampledDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SAMPLED_DATE not between", value1, value2, "sampledDate");
            return (Criteria) this;
        }

        public Criteria andRecdDateIsNull() {
            addCriterion("RECD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRecdDateIsNotNull() {
            addCriterion("RECD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRecdDateEqualTo(Date value) {
            addCriterionForJDBCDate("RECD_DATE =", value, "recdDate");
            return (Criteria) this;
        }

        public Criteria andRecdDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("RECD_DATE <>", value, "recdDate");
            return (Criteria) this;
        }

        public Criteria andRecdDateGreaterThan(Date value) {
            addCriterionForJDBCDate("RECD_DATE >", value, "recdDate");
            return (Criteria) this;
        }

        public Criteria andRecdDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RECD_DATE >=", value, "recdDate");
            return (Criteria) this;
        }

        public Criteria andRecdDateLessThan(Date value) {
            addCriterionForJDBCDate("RECD_DATE <", value, "recdDate");
            return (Criteria) this;
        }

        public Criteria andRecdDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RECD_DATE <=", value, "recdDate");
            return (Criteria) this;
        }

        public Criteria andRecdDateIn(List<Date> values) {
            addCriterionForJDBCDate("RECD_DATE in", values, "recdDate");
            return (Criteria) this;
        }

        public Criteria andRecdDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("RECD_DATE not in", values, "recdDate");
            return (Criteria) this;
        }

        public Criteria andRecdDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RECD_DATE between", value1, value2, "recdDate");
            return (Criteria) this;
        }

        public Criteria andRecdDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RECD_DATE not between", value1, value2, "recdDate");
            return (Criteria) this;
        }

        public Criteria andReceivedByIsNull() {
            addCriterion("RECEIVED_BY is null");
            return (Criteria) this;
        }

        public Criteria andReceivedByIsNotNull() {
            addCriterion("RECEIVED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedByEqualTo(String value) {
            addCriterion("RECEIVED_BY =", value, "receivedBy");
            return (Criteria) this;
        }

        public Criteria andReceivedByNotEqualTo(String value) {
            addCriterion("RECEIVED_BY <>", value, "receivedBy");
            return (Criteria) this;
        }

        public Criteria andReceivedByGreaterThan(String value) {
            addCriterion("RECEIVED_BY >", value, "receivedBy");
            return (Criteria) this;
        }

        public Criteria andReceivedByGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVED_BY >=", value, "receivedBy");
            return (Criteria) this;
        }

        public Criteria andReceivedByLessThan(String value) {
            addCriterion("RECEIVED_BY <", value, "receivedBy");
            return (Criteria) this;
        }

        public Criteria andReceivedByLessThanOrEqualTo(String value) {
            addCriterion("RECEIVED_BY <=", value, "receivedBy");
            return (Criteria) this;
        }

        public Criteria andReceivedByLike(String value) {
            addCriterion("RECEIVED_BY like", value, "receivedBy");
            return (Criteria) this;
        }

        public Criteria andReceivedByNotLike(String value) {
            addCriterion("RECEIVED_BY not like", value, "receivedBy");
            return (Criteria) this;
        }

        public Criteria andReceivedByIn(List<String> values) {
            addCriterion("RECEIVED_BY in", values, "receivedBy");
            return (Criteria) this;
        }

        public Criteria andReceivedByNotIn(List<String> values) {
            addCriterion("RECEIVED_BY not in", values, "receivedBy");
            return (Criteria) this;
        }

        public Criteria andReceivedByBetween(String value1, String value2) {
            addCriterion("RECEIVED_BY between", value1, value2, "receivedBy");
            return (Criteria) this;
        }

        public Criteria andReceivedByNotBetween(String value1, String value2) {
            addCriterion("RECEIVED_BY not between", value1, value2, "receivedBy");
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

        public Criteria andStartedIsNull() {
            addCriterion("STARTED is null");
            return (Criteria) this;
        }

        public Criteria andStartedIsNotNull() {
            addCriterion("STARTED is not null");
            return (Criteria) this;
        }

        public Criteria andStartedEqualTo(String value) {
            addCriterion("STARTED =", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedNotEqualTo(String value) {
            addCriterion("STARTED <>", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedGreaterThan(String value) {
            addCriterion("STARTED >", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedGreaterThanOrEqualTo(String value) {
            addCriterion("STARTED >=", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedLessThan(String value) {
            addCriterion("STARTED <", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedLessThanOrEqualTo(String value) {
            addCriterion("STARTED <=", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedLike(String value) {
            addCriterion("STARTED like", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedNotLike(String value) {
            addCriterion("STARTED not like", value, "started");
            return (Criteria) this;
        }

        public Criteria andStartedIn(List<String> values) {
            addCriterion("STARTED in", values, "started");
            return (Criteria) this;
        }

        public Criteria andStartedNotIn(List<String> values) {
            addCriterion("STARTED not in", values, "started");
            return (Criteria) this;
        }

        public Criteria andStartedBetween(String value1, String value2) {
            addCriterion("STARTED between", value1, value2, "started");
            return (Criteria) this;
        }

        public Criteria andStartedNotBetween(String value1, String value2) {
            addCriterion("STARTED not between", value1, value2, "started");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorIsNull() {
            addCriterion("ASSIGNED_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorIsNotNull() {
            addCriterion("ASSIGNED_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorEqualTo(String value) {
            addCriterion("ASSIGNED_OPERATOR =", value, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorNotEqualTo(String value) {
            addCriterion("ASSIGNED_OPERATOR <>", value, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorGreaterThan(String value) {
            addCriterion("ASSIGNED_OPERATOR >", value, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGNED_OPERATOR >=", value, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorLessThan(String value) {
            addCriterion("ASSIGNED_OPERATOR <", value, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorLessThanOrEqualTo(String value) {
            addCriterion("ASSIGNED_OPERATOR <=", value, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorLike(String value) {
            addCriterion("ASSIGNED_OPERATOR like", value, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorNotLike(String value) {
            addCriterion("ASSIGNED_OPERATOR not like", value, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorIn(List<String> values) {
            addCriterion("ASSIGNED_OPERATOR in", values, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorNotIn(List<String> values) {
            addCriterion("ASSIGNED_OPERATOR not in", values, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorBetween(String value1, String value2) {
            addCriterion("ASSIGNED_OPERATOR between", value1, value2, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorNotBetween(String value1, String value2) {
            addCriterion("ASSIGNED_OPERATOR not between", value1, value2, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNull() {
            addCriterion("DUE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNotNull() {
            addCriterion("DUE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDueDateEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_DATE =", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_DATE <>", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThan(Date value) {
            addCriterionForJDBCDate("DUE_DATE >", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_DATE >=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThan(Date value) {
            addCriterionForJDBCDate("DUE_DATE <", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_DATE <=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateIn(List<Date> values) {
            addCriterionForJDBCDate("DUE_DATE in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DUE_DATE not in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DUE_DATE between", value1, value2, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DUE_DATE not between", value1, value2, "dueDate");
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

        public Criteria andPrepIsNull() {
            addCriterion("PREP is null");
            return (Criteria) this;
        }

        public Criteria andPrepIsNotNull() {
            addCriterion("PREP is not null");
            return (Criteria) this;
        }

        public Criteria andPrepEqualTo(String value) {
            addCriterion("PREP =", value, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepNotEqualTo(String value) {
            addCriterion("PREP <>", value, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepGreaterThan(String value) {
            addCriterion("PREP >", value, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepGreaterThanOrEqualTo(String value) {
            addCriterion("PREP >=", value, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepLessThan(String value) {
            addCriterion("PREP <", value, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepLessThanOrEqualTo(String value) {
            addCriterion("PREP <=", value, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepLike(String value) {
            addCriterion("PREP like", value, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepNotLike(String value) {
            addCriterion("PREP not like", value, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepIn(List<String> values) {
            addCriterion("PREP in", values, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepNotIn(List<String> values) {
            addCriterion("PREP not in", values, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepBetween(String value1, String value2) {
            addCriterion("PREP between", value1, value2, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepNotBetween(String value1, String value2) {
            addCriterion("PREP not between", value1, value2, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepDateIsNull() {
            addCriterion("PREP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPrepDateIsNotNull() {
            addCriterion("PREP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrepDateEqualTo(Date value) {
            addCriterionForJDBCDate("PREP_DATE =", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PREP_DATE <>", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PREP_DATE >", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PREP_DATE >=", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateLessThan(Date value) {
            addCriterionForJDBCDate("PREP_DATE <", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PREP_DATE <=", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateIn(List<Date> values) {
            addCriterionForJDBCDate("PREP_DATE in", values, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PREP_DATE not in", values, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PREP_DATE between", value1, value2, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PREP_DATE not between", value1, value2, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepByIsNull() {
            addCriterion("PREP_BY is null");
            return (Criteria) this;
        }

        public Criteria andPrepByIsNotNull() {
            addCriterion("PREP_BY is not null");
            return (Criteria) this;
        }

        public Criteria andPrepByEqualTo(String value) {
            addCriterion("PREP_BY =", value, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByNotEqualTo(String value) {
            addCriterion("PREP_BY <>", value, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByGreaterThan(String value) {
            addCriterion("PREP_BY >", value, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByGreaterThanOrEqualTo(String value) {
            addCriterion("PREP_BY >=", value, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByLessThan(String value) {
            addCriterion("PREP_BY <", value, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByLessThanOrEqualTo(String value) {
            addCriterion("PREP_BY <=", value, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByLike(String value) {
            addCriterion("PREP_BY like", value, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByNotLike(String value) {
            addCriterion("PREP_BY not like", value, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByIn(List<String> values) {
            addCriterion("PREP_BY in", values, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByNotIn(List<String> values) {
            addCriterion("PREP_BY not in", values, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByBetween(String value1, String value2) {
            addCriterion("PREP_BY between", value1, value2, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByNotBetween(String value1, String value2) {
            addCriterion("PREP_BY not between", value1, value2, "prepBy");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNull() {
            addCriterion("REVIEWER is null");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNotNull() {
            addCriterion("REVIEWER is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerEqualTo(String value) {
            addCriterion("REVIEWER =", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotEqualTo(String value) {
            addCriterion("REVIEWER <>", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThan(String value) {
            addCriterion("REVIEWER >", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEWER >=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThan(String value) {
            addCriterion("REVIEWER <", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThanOrEqualTo(String value) {
            addCriterion("REVIEWER <=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLike(String value) {
            addCriterion("REVIEWER like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotLike(String value) {
            addCriterion("REVIEWER not like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerIn(List<String> values) {
            addCriterion("REVIEWER in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotIn(List<String> values) {
            addCriterion("REVIEWER not in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerBetween(String value1, String value2) {
            addCriterion("REVIEWER between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotBetween(String value1, String value2) {
            addCriterion("REVIEWER not between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewNoteIsNull() {
            addCriterion("REVIEW_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andReviewNoteIsNotNull() {
            addCriterion("REVIEW_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andReviewNoteEqualTo(String value) {
            addCriterion("REVIEW_NOTE =", value, "reviewNote");
            return (Criteria) this;
        }

        public Criteria andReviewNoteNotEqualTo(String value) {
            addCriterion("REVIEW_NOTE <>", value, "reviewNote");
            return (Criteria) this;
        }

        public Criteria andReviewNoteGreaterThan(String value) {
            addCriterion("REVIEW_NOTE >", value, "reviewNote");
            return (Criteria) this;
        }

        public Criteria andReviewNoteGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_NOTE >=", value, "reviewNote");
            return (Criteria) this;
        }

        public Criteria andReviewNoteLessThan(String value) {
            addCriterion("REVIEW_NOTE <", value, "reviewNote");
            return (Criteria) this;
        }

        public Criteria andReviewNoteLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_NOTE <=", value, "reviewNote");
            return (Criteria) this;
        }

        public Criteria andReviewNoteLike(String value) {
            addCriterion("REVIEW_NOTE like", value, "reviewNote");
            return (Criteria) this;
        }

        public Criteria andReviewNoteNotLike(String value) {
            addCriterion("REVIEW_NOTE not like", value, "reviewNote");
            return (Criteria) this;
        }

        public Criteria andReviewNoteIn(List<String> values) {
            addCriterion("REVIEW_NOTE in", values, "reviewNote");
            return (Criteria) this;
        }

        public Criteria andReviewNoteNotIn(List<String> values) {
            addCriterion("REVIEW_NOTE not in", values, "reviewNote");
            return (Criteria) this;
        }

        public Criteria andReviewNoteBetween(String value1, String value2) {
            addCriterion("REVIEW_NOTE between", value1, value2, "reviewNote");
            return (Criteria) this;
        }

        public Criteria andReviewNoteNotBetween(String value1, String value2) {
            addCriterion("REVIEW_NOTE not between", value1, value2, "reviewNote");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("PRODUCT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("PRODUCT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("PRODUCT_CODE =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("PRODUCT_CODE <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("PRODUCT_CODE >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("PRODUCT_CODE <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("PRODUCT_CODE like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("PRODUCT_CODE not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("PRODUCT_CODE in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("PRODUCT_CODE not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE not between", value1, value2, "productCode");
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

        public Criteria andProductVersionIsNull() {
            addCriterion("PRODUCT_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andProductVersionIsNotNull() {
            addCriterion("PRODUCT_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andProductVersionEqualTo(Long value) {
            addCriterion("PRODUCT_VERSION =", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionNotEqualTo(Long value) {
            addCriterion("PRODUCT_VERSION <>", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionGreaterThan(Long value) {
            addCriterion("PRODUCT_VERSION >", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODUCT_VERSION >=", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionLessThan(Long value) {
            addCriterion("PRODUCT_VERSION <", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionLessThanOrEqualTo(Long value) {
            addCriterion("PRODUCT_VERSION <=", value, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionIn(List<Long> values) {
            addCriterion("PRODUCT_VERSION in", values, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionNotIn(List<Long> values) {
            addCriterion("PRODUCT_VERSION not in", values, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_VERSION between", value1, value2, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductVersionNotBetween(Long value1, Long value2) {
            addCriterion("PRODUCT_VERSION not between", value1, value2, "productVersion");
            return (Criteria) this;
        }

        public Criteria andProductGradeIsNull() {
            addCriterion("PRODUCT_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andProductGradeIsNotNull() {
            addCriterion("PRODUCT_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andProductGradeEqualTo(String value) {
            addCriterion("PRODUCT_GRADE =", value, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeNotEqualTo(String value) {
            addCriterion("PRODUCT_GRADE <>", value, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeGreaterThan(String value) {
            addCriterion("PRODUCT_GRADE >", value, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_GRADE >=", value, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeLessThan(String value) {
            addCriterion("PRODUCT_GRADE <", value, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_GRADE <=", value, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeLike(String value) {
            addCriterion("PRODUCT_GRADE like", value, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeNotLike(String value) {
            addCriterion("PRODUCT_GRADE not like", value, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeIn(List<String> values) {
            addCriterion("PRODUCT_GRADE in", values, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeNotIn(List<String> values) {
            addCriterion("PRODUCT_GRADE not in", values, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeBetween(String value1, String value2) {
            addCriterion("PRODUCT_GRADE between", value1, value2, "productGrade");
            return (Criteria) this;
        }

        public Criteria andProductGradeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_GRADE not between", value1, value2, "productGrade");
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

        public Criteria andSampleTypeIsNull() {
            addCriterion("SAMPLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSampleTypeIsNotNull() {
            addCriterion("SAMPLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSampleTypeEqualTo(String value) {
            addCriterion("SAMPLE_TYPE =", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeNotEqualTo(String value) {
            addCriterion("SAMPLE_TYPE <>", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeGreaterThan(String value) {
            addCriterion("SAMPLE_TYPE >", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_TYPE >=", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeLessThan(String value) {
            addCriterion("SAMPLE_TYPE <", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_TYPE <=", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeLike(String value) {
            addCriterion("SAMPLE_TYPE like", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeNotLike(String value) {
            addCriterion("SAMPLE_TYPE not like", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeIn(List<String> values) {
            addCriterion("SAMPLE_TYPE in", values, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeNotIn(List<String> values) {
            addCriterion("SAMPLE_TYPE not in", values, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeBetween(String value1, String value2) {
            addCriterion("SAMPLE_TYPE between", value1, value2, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_TYPE not between", value1, value2, "sampleType");
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

        public Criteria andBatchNameIsNull() {
            addCriterion("BATCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBatchNameIsNotNull() {
            addCriterion("BATCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNameEqualTo(String value) {
            addCriterion("BATCH_NAME =", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotEqualTo(String value) {
            addCriterion("BATCH_NAME <>", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameGreaterThan(String value) {
            addCriterion("BATCH_NAME >", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_NAME >=", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLessThan(String value) {
            addCriterion("BATCH_NAME <", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLessThanOrEqualTo(String value) {
            addCriterion("BATCH_NAME <=", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLike(String value) {
            addCriterion("BATCH_NAME like", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotLike(String value) {
            addCriterion("BATCH_NAME not like", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameIn(List<String> values) {
            addCriterion("BATCH_NAME in", values, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotIn(List<String> values) {
            addCriterion("BATCH_NAME not in", values, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameBetween(String value1, String value2) {
            addCriterion("BATCH_NAME between", value1, value2, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotBetween(String value1, String value2) {
            addCriterion("BATCH_NAME not between", value1, value2, "batchName");
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

        public Criteria andStepIsNull() {
            addCriterion("STEP is null");
            return (Criteria) this;
        }

        public Criteria andStepIsNotNull() {
            addCriterion("STEP is not null");
            return (Criteria) this;
        }

        public Criteria andStepEqualTo(String value) {
            addCriterion("STEP =", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotEqualTo(String value) {
            addCriterion("STEP <>", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThan(String value) {
            addCriterion("STEP >", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThanOrEqualTo(String value) {
            addCriterion("STEP >=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThan(String value) {
            addCriterion("STEP <", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThanOrEqualTo(String value) {
            addCriterion("STEP <=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLike(String value) {
            addCriterion("STEP like", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotLike(String value) {
            addCriterion("STEP not like", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepIn(List<String> values) {
            addCriterion("STEP in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotIn(List<String> values) {
            addCriterion("STEP not in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepBetween(String value1, String value2) {
            addCriterion("STEP between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotBetween(String value1, String value2) {
            addCriterion("STEP not between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andSampleNameIsNull() {
            addCriterion("SAMPLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSampleNameIsNotNull() {
            addCriterion("SAMPLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSampleNameEqualTo(String value) {
            addCriterion("SAMPLE_NAME =", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotEqualTo(String value) {
            addCriterion("SAMPLE_NAME <>", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameGreaterThan(String value) {
            addCriterion("SAMPLE_NAME >", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_NAME >=", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLessThan(String value) {
            addCriterion("SAMPLE_NAME <", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_NAME <=", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLike(String value) {
            addCriterion("SAMPLE_NAME like", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotLike(String value) {
            addCriterion("SAMPLE_NAME not like", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameIn(List<String> values) {
            addCriterion("SAMPLE_NAME in", values, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotIn(List<String> values) {
            addCriterion("SAMPLE_NAME not in", values, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameBetween(String value1, String value2) {
            addCriterion("SAMPLE_NAME between", value1, value2, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_NAME not between", value1, value2, "sampleName");
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

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Long value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Long value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Long value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Long value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Long value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Long> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Long> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Long value1, Long value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Long value1, Long value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("LOCATION =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("LOCATION <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("LOCATION >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("LOCATION <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("LOCATION <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("LOCATION like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("LOCATION not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("LOCATION in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("LOCATION not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("LOCATION between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("LOCATION not between", value1, value2, "location");
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

        public Criteria andRecipientIsNull() {
            addCriterion("RECIPIENT is null");
            return (Criteria) this;
        }

        public Criteria andRecipientIsNotNull() {
            addCriterion("RECIPIENT is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientEqualTo(String value) {
            addCriterion("RECIPIENT =", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotEqualTo(String value) {
            addCriterion("RECIPIENT <>", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThan(String value) {
            addCriterion("RECIPIENT >", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThanOrEqualTo(String value) {
            addCriterion("RECIPIENT >=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThan(String value) {
            addCriterion("RECIPIENT <", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThanOrEqualTo(String value) {
            addCriterion("RECIPIENT <=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLike(String value) {
            addCriterion("RECIPIENT like", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotLike(String value) {
            addCriterion("RECIPIENT not like", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientIn(List<String> values) {
            addCriterion("RECIPIENT in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotIn(List<String> values) {
            addCriterion("RECIPIENT not in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientBetween(String value1, String value2) {
            addCriterion("RECIPIENT between", value1, value2, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotBetween(String value1, String value2) {
            addCriterion("RECIPIENT not between", value1, value2, "recipient");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("STANDARD =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("STANDARD <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("STANDARD >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("STANDARD >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("STANDARD <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("STANDARD <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("STANDARD like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("STANDARD not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("STANDARD in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("STANDARD not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("STANDARD between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("STANDARD not between", value1, value2, "standard");
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

        public Criteria andTimepointIsNull() {
            addCriterion("TIMEPOINT is null");
            return (Criteria) this;
        }

        public Criteria andTimepointIsNotNull() {
            addCriterion("TIMEPOINT is not null");
            return (Criteria) this;
        }

        public Criteria andTimepointEqualTo(String value) {
            addCriterion("TIMEPOINT =", value, "timepoint");
            return (Criteria) this;
        }

        public Criteria andTimepointNotEqualTo(String value) {
            addCriterion("TIMEPOINT <>", value, "timepoint");
            return (Criteria) this;
        }

        public Criteria andTimepointGreaterThan(String value) {
            addCriterion("TIMEPOINT >", value, "timepoint");
            return (Criteria) this;
        }

        public Criteria andTimepointGreaterThanOrEqualTo(String value) {
            addCriterion("TIMEPOINT >=", value, "timepoint");
            return (Criteria) this;
        }

        public Criteria andTimepointLessThan(String value) {
            addCriterion("TIMEPOINT <", value, "timepoint");
            return (Criteria) this;
        }

        public Criteria andTimepointLessThanOrEqualTo(String value) {
            addCriterion("TIMEPOINT <=", value, "timepoint");
            return (Criteria) this;
        }

        public Criteria andTimepointLike(String value) {
            addCriterion("TIMEPOINT like", value, "timepoint");
            return (Criteria) this;
        }

        public Criteria andTimepointNotLike(String value) {
            addCriterion("TIMEPOINT not like", value, "timepoint");
            return (Criteria) this;
        }

        public Criteria andTimepointIn(List<String> values) {
            addCriterion("TIMEPOINT in", values, "timepoint");
            return (Criteria) this;
        }

        public Criteria andTimepointNotIn(List<String> values) {
            addCriterion("TIMEPOINT not in", values, "timepoint");
            return (Criteria) this;
        }

        public Criteria andTimepointBetween(String value1, String value2) {
            addCriterion("TIMEPOINT between", value1, value2, "timepoint");
            return (Criteria) this;
        }

        public Criteria andTimepointNotBetween(String value1, String value2) {
            addCriterion("TIMEPOINT not between", value1, value2, "timepoint");
            return (Criteria) this;
        }

        public Criteria andLotIsNull() {
            addCriterion("LOT is null");
            return (Criteria) this;
        }

        public Criteria andLotIsNotNull() {
            addCriterion("LOT is not null");
            return (Criteria) this;
        }

        public Criteria andLotEqualTo(Long value) {
            addCriterion("LOT =", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotNotEqualTo(Long value) {
            addCriterion("LOT <>", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotGreaterThan(Long value) {
            addCriterion("LOT >", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotGreaterThanOrEqualTo(Long value) {
            addCriterion("LOT >=", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotLessThan(Long value) {
            addCriterion("LOT <", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotLessThanOrEqualTo(Long value) {
            addCriterion("LOT <=", value, "lot");
            return (Criteria) this;
        }

        public Criteria andLotIn(List<Long> values) {
            addCriterion("LOT in", values, "lot");
            return (Criteria) this;
        }

        public Criteria andLotNotIn(List<Long> values) {
            addCriterion("LOT not in", values, "lot");
            return (Criteria) this;
        }

        public Criteria andLotBetween(Long value1, Long value2) {
            addCriterion("LOT between", value1, value2, "lot");
            return (Criteria) this;
        }

        public Criteria andLotNotBetween(Long value1, Long value2) {
            addCriterion("LOT not between", value1, value2, "lot");
            return (Criteria) this;
        }

        public Criteria andBaseDateIsNull() {
            addCriterion("BASE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBaseDateIsNotNull() {
            addCriterion("BASE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("BASE_DATE =", value, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BASE_DATE <>", value, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("BASE_DATE >", value, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BASE_DATE >=", value, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateLessThan(Date value) {
            addCriterionForJDBCDate("BASE_DATE <", value, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BASE_DATE <=", value, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("BASE_DATE in", values, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BASE_DATE not in", values, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BASE_DATE between", value1, value2, "baseDate");
            return (Criteria) this;
        }

        public Criteria andBaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BASE_DATE not between", value1, value2, "baseDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateIsNull() {
            addCriterion("AVAILABLE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAvailableDateIsNotNull() {
            addCriterion("AVAILABLE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableDateEqualTo(Date value) {
            addCriterionForJDBCDate("AVAILABLE_DATE =", value, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("AVAILABLE_DATE <>", value, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateGreaterThan(Date value) {
            addCriterionForJDBCDate("AVAILABLE_DATE >", value, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AVAILABLE_DATE >=", value, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateLessThan(Date value) {
            addCriterionForJDBCDate("AVAILABLE_DATE <", value, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AVAILABLE_DATE <=", value, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateIn(List<Date> values) {
            addCriterionForJDBCDate("AVAILABLE_DATE in", values, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("AVAILABLE_DATE not in", values, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AVAILABLE_DATE between", value1, value2, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AVAILABLE_DATE not between", value1, value2, "availableDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDateIsNull() {
            addCriterion("REQUIRED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRequiredDateIsNotNull() {
            addCriterion("REQUIRED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRequiredDateEqualTo(Date value) {
            addCriterionForJDBCDate("REQUIRED_DATE =", value, "requiredDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("REQUIRED_DATE <>", value, "requiredDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDateGreaterThan(Date value) {
            addCriterionForJDBCDate("REQUIRED_DATE >", value, "requiredDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REQUIRED_DATE >=", value, "requiredDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDateLessThan(Date value) {
            addCriterionForJDBCDate("REQUIRED_DATE <", value, "requiredDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REQUIRED_DATE <=", value, "requiredDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDateIn(List<Date> values) {
            addCriterionForJDBCDate("REQUIRED_DATE in", values, "requiredDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("REQUIRED_DATE not in", values, "requiredDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REQUIRED_DATE between", value1, value2, "requiredDate");
            return (Criteria) this;
        }

        public Criteria andRequiredDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REQUIRED_DATE not between", value1, value2, "requiredDate");
            return (Criteria) this;
        }

        public Criteria andTargetDateIsNull() {
            addCriterion("TARGET_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTargetDateIsNotNull() {
            addCriterion("TARGET_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTargetDateEqualTo(Date value) {
            addCriterionForJDBCDate("TARGET_DATE =", value, "targetDate");
            return (Criteria) this;
        }

        public Criteria andTargetDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("TARGET_DATE <>", value, "targetDate");
            return (Criteria) this;
        }

        public Criteria andTargetDateGreaterThan(Date value) {
            addCriterionForJDBCDate("TARGET_DATE >", value, "targetDate");
            return (Criteria) this;
        }

        public Criteria andTargetDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TARGET_DATE >=", value, "targetDate");
            return (Criteria) this;
        }

        public Criteria andTargetDateLessThan(Date value) {
            addCriterionForJDBCDate("TARGET_DATE <", value, "targetDate");
            return (Criteria) this;
        }

        public Criteria andTargetDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TARGET_DATE <=", value, "targetDate");
            return (Criteria) this;
        }

        public Criteria andTargetDateIn(List<Date> values) {
            addCriterionForJDBCDate("TARGET_DATE in", values, "targetDate");
            return (Criteria) this;
        }

        public Criteria andTargetDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("TARGET_DATE not in", values, "targetDate");
            return (Criteria) this;
        }

        public Criteria andTargetDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TARGET_DATE between", value1, value2, "targetDate");
            return (Criteria) this;
        }

        public Criteria andTargetDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TARGET_DATE not between", value1, value2, "targetDate");
            return (Criteria) this;
        }

        public Criteria andPartialSpecIsNull() {
            addCriterion("PARTIAL_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andPartialSpecIsNotNull() {
            addCriterion("PARTIAL_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andPartialSpecEqualTo(String value) {
            addCriterion("PARTIAL_SPEC =", value, "partialSpec");
            return (Criteria) this;
        }

        public Criteria andPartialSpecNotEqualTo(String value) {
            addCriterion("PARTIAL_SPEC <>", value, "partialSpec");
            return (Criteria) this;
        }

        public Criteria andPartialSpecGreaterThan(String value) {
            addCriterion("PARTIAL_SPEC >", value, "partialSpec");
            return (Criteria) this;
        }

        public Criteria andPartialSpecGreaterThanOrEqualTo(String value) {
            addCriterion("PARTIAL_SPEC >=", value, "partialSpec");
            return (Criteria) this;
        }

        public Criteria andPartialSpecLessThan(String value) {
            addCriterion("PARTIAL_SPEC <", value, "partialSpec");
            return (Criteria) this;
        }

        public Criteria andPartialSpecLessThanOrEqualTo(String value) {
            addCriterion("PARTIAL_SPEC <=", value, "partialSpec");
            return (Criteria) this;
        }

        public Criteria andPartialSpecLike(String value) {
            addCriterion("PARTIAL_SPEC like", value, "partialSpec");
            return (Criteria) this;
        }

        public Criteria andPartialSpecNotLike(String value) {
            addCriterion("PARTIAL_SPEC not like", value, "partialSpec");
            return (Criteria) this;
        }

        public Criteria andPartialSpecIn(List<String> values) {
            addCriterion("PARTIAL_SPEC in", values, "partialSpec");
            return (Criteria) this;
        }

        public Criteria andPartialSpecNotIn(List<String> values) {
            addCriterion("PARTIAL_SPEC not in", values, "partialSpec");
            return (Criteria) this;
        }

        public Criteria andPartialSpecBetween(String value1, String value2) {
            addCriterion("PARTIAL_SPEC between", value1, value2, "partialSpec");
            return (Criteria) this;
        }

        public Criteria andPartialSpecNotBetween(String value1, String value2) {
            addCriterion("PARTIAL_SPEC not between", value1, value2, "partialSpec");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIsNull() {
            addCriterion("SPEC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIsNotNull() {
            addCriterion("SPEC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSpecTypeEqualTo(String value) {
            addCriterion("SPEC_TYPE =", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeNotEqualTo(String value) {
            addCriterion("SPEC_TYPE <>", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeGreaterThan(String value) {
            addCriterion("SPEC_TYPE >", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SPEC_TYPE >=", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeLessThan(String value) {
            addCriterion("SPEC_TYPE <", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeLessThanOrEqualTo(String value) {
            addCriterion("SPEC_TYPE <=", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeLike(String value) {
            addCriterion("SPEC_TYPE like", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeNotLike(String value) {
            addCriterion("SPEC_TYPE not like", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIn(List<String> values) {
            addCriterion("SPEC_TYPE in", values, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeNotIn(List<String> values) {
            addCriterion("SPEC_TYPE not in", values, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeBetween(String value1, String value2) {
            addCriterion("SPEC_TYPE between", value1, value2, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeNotBetween(String value1, String value2) {
            addCriterion("SPEC_TYPE not between", value1, value2, "specType");
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

        public Criteria andPrimaryInSpecIsNull() {
            addCriterion("PRIMARY_IN_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecIsNotNull() {
            addCriterion("PRIMARY_IN_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecEqualTo(String value) {
            addCriterion("PRIMARY_IN_SPEC =", value, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecNotEqualTo(String value) {
            addCriterion("PRIMARY_IN_SPEC <>", value, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecGreaterThan(String value) {
            addCriterion("PRIMARY_IN_SPEC >", value, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecGreaterThanOrEqualTo(String value) {
            addCriterion("PRIMARY_IN_SPEC >=", value, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecLessThan(String value) {
            addCriterion("PRIMARY_IN_SPEC <", value, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecLessThanOrEqualTo(String value) {
            addCriterion("PRIMARY_IN_SPEC <=", value, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecLike(String value) {
            addCriterion("PRIMARY_IN_SPEC like", value, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecNotLike(String value) {
            addCriterion("PRIMARY_IN_SPEC not like", value, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecIn(List<String> values) {
            addCriterion("PRIMARY_IN_SPEC in", values, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecNotIn(List<String> values) {
            addCriterion("PRIMARY_IN_SPEC not in", values, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecBetween(String value1, String value2) {
            addCriterion("PRIMARY_IN_SPEC between", value1, value2, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecNotBetween(String value1, String value2) {
            addCriterion("PRIMARY_IN_SPEC not between", value1, value2, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andBatchIsNull() {
            addCriterion("BATCH is null");
            return (Criteria) this;
        }

        public Criteria andBatchIsNotNull() {
            addCriterion("BATCH is not null");
            return (Criteria) this;
        }

        public Criteria andBatchEqualTo(String value) {
            addCriterion("BATCH =", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotEqualTo(String value) {
            addCriterion("BATCH <>", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThan(String value) {
            addCriterion("BATCH >", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH >=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThan(String value) {
            addCriterion("BATCH <", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThanOrEqualTo(String value) {
            addCriterion("BATCH <=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLike(String value) {
            addCriterion("BATCH like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotLike(String value) {
            addCriterion("BATCH not like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchIn(List<String> values) {
            addCriterion("BATCH in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotIn(List<String> values) {
            addCriterion("BATCH not in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchBetween(String value1, String value2) {
            addCriterion("BATCH between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotBetween(String value1, String value2) {
            addCriterion("BATCH not between", value1, value2, "batch");
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

        public Criteria andFormulationIsNull() {
            addCriterion("FORMULATION is null");
            return (Criteria) this;
        }

        public Criteria andFormulationIsNotNull() {
            addCriterion("FORMULATION is not null");
            return (Criteria) this;
        }

        public Criteria andFormulationEqualTo(String value) {
            addCriterion("FORMULATION =", value, "formulation");
            return (Criteria) this;
        }

        public Criteria andFormulationNotEqualTo(String value) {
            addCriterion("FORMULATION <>", value, "formulation");
            return (Criteria) this;
        }

        public Criteria andFormulationGreaterThan(String value) {
            addCriterion("FORMULATION >", value, "formulation");
            return (Criteria) this;
        }

        public Criteria andFormulationGreaterThanOrEqualTo(String value) {
            addCriterion("FORMULATION >=", value, "formulation");
            return (Criteria) this;
        }

        public Criteria andFormulationLessThan(String value) {
            addCriterion("FORMULATION <", value, "formulation");
            return (Criteria) this;
        }

        public Criteria andFormulationLessThanOrEqualTo(String value) {
            addCriterion("FORMULATION <=", value, "formulation");
            return (Criteria) this;
        }

        public Criteria andFormulationLike(String value) {
            addCriterion("FORMULATION like", value, "formulation");
            return (Criteria) this;
        }

        public Criteria andFormulationNotLike(String value) {
            addCriterion("FORMULATION not like", value, "formulation");
            return (Criteria) this;
        }

        public Criteria andFormulationIn(List<String> values) {
            addCriterion("FORMULATION in", values, "formulation");
            return (Criteria) this;
        }

        public Criteria andFormulationNotIn(List<String> values) {
            addCriterion("FORMULATION not in", values, "formulation");
            return (Criteria) this;
        }

        public Criteria andFormulationBetween(String value1, String value2) {
            addCriterion("FORMULATION between", value1, value2, "formulation");
            return (Criteria) this;
        }

        public Criteria andFormulationNotBetween(String value1, String value2) {
            addCriterion("FORMULATION not between", value1, value2, "formulation");
            return (Criteria) this;
        }

        public Criteria andProtocolLevelIsNull() {
            addCriterion("PROTOCOL_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andProtocolLevelIsNotNull() {
            addCriterion("PROTOCOL_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolLevelEqualTo(String value) {
            addCriterion("PROTOCOL_LEVEL =", value, "protocolLevel");
            return (Criteria) this;
        }

        public Criteria andProtocolLevelNotEqualTo(String value) {
            addCriterion("PROTOCOL_LEVEL <>", value, "protocolLevel");
            return (Criteria) this;
        }

        public Criteria andProtocolLevelGreaterThan(String value) {
            addCriterion("PROTOCOL_LEVEL >", value, "protocolLevel");
            return (Criteria) this;
        }

        public Criteria andProtocolLevelGreaterThanOrEqualTo(String value) {
            addCriterion("PROTOCOL_LEVEL >=", value, "protocolLevel");
            return (Criteria) this;
        }

        public Criteria andProtocolLevelLessThan(String value) {
            addCriterion("PROTOCOL_LEVEL <", value, "protocolLevel");
            return (Criteria) this;
        }

        public Criteria andProtocolLevelLessThanOrEqualTo(String value) {
            addCriterion("PROTOCOL_LEVEL <=", value, "protocolLevel");
            return (Criteria) this;
        }

        public Criteria andProtocolLevelLike(String value) {
            addCriterion("PROTOCOL_LEVEL like", value, "protocolLevel");
            return (Criteria) this;
        }

        public Criteria andProtocolLevelNotLike(String value) {
            addCriterion("PROTOCOL_LEVEL not like", value, "protocolLevel");
            return (Criteria) this;
        }

        public Criteria andProtocolLevelIn(List<String> values) {
            addCriterion("PROTOCOL_LEVEL in", values, "protocolLevel");
            return (Criteria) this;
        }

        public Criteria andProtocolLevelNotIn(List<String> values) {
            addCriterion("PROTOCOL_LEVEL not in", values, "protocolLevel");
            return (Criteria) this;
        }

        public Criteria andProtocolLevelBetween(String value1, String value2) {
            addCriterion("PROTOCOL_LEVEL between", value1, value2, "protocolLevel");
            return (Criteria) this;
        }

        public Criteria andProtocolLevelNotBetween(String value1, String value2) {
            addCriterion("PROTOCOL_LEVEL not between", value1, value2, "protocolLevel");
            return (Criteria) this;
        }

        public Criteria andReleasedIsNull() {
            addCriterion("RELEASED is null");
            return (Criteria) this;
        }

        public Criteria andReleasedIsNotNull() {
            addCriterion("RELEASED is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedEqualTo(String value) {
            addCriterion("RELEASED =", value, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedNotEqualTo(String value) {
            addCriterion("RELEASED <>", value, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedGreaterThan(String value) {
            addCriterion("RELEASED >", value, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASED >=", value, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedLessThan(String value) {
            addCriterion("RELEASED <", value, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedLessThanOrEqualTo(String value) {
            addCriterion("RELEASED <=", value, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedLike(String value) {
            addCriterion("RELEASED like", value, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedNotLike(String value) {
            addCriterion("RELEASED not like", value, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedIn(List<String> values) {
            addCriterion("RELEASED in", values, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedNotIn(List<String> values) {
            addCriterion("RELEASED not in", values, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedBetween(String value1, String value2) {
            addCriterion("RELEASED between", value1, value2, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedNotBetween(String value1, String value2) {
            addCriterion("RELEASED not between", value1, value2, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedByIsNull() {
            addCriterion("RELEASED_BY is null");
            return (Criteria) this;
        }

        public Criteria andReleasedByIsNotNull() {
            addCriterion("RELEASED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedByEqualTo(String value) {
            addCriterion("RELEASED_BY =", value, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByNotEqualTo(String value) {
            addCriterion("RELEASED_BY <>", value, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByGreaterThan(String value) {
            addCriterion("RELEASED_BY >", value, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASED_BY >=", value, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByLessThan(String value) {
            addCriterion("RELEASED_BY <", value, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByLessThanOrEqualTo(String value) {
            addCriterion("RELEASED_BY <=", value, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByLike(String value) {
            addCriterion("RELEASED_BY like", value, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByNotLike(String value) {
            addCriterion("RELEASED_BY not like", value, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByIn(List<String> values) {
            addCriterion("RELEASED_BY in", values, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByNotIn(List<String> values) {
            addCriterion("RELEASED_BY not in", values, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByBetween(String value1, String value2) {
            addCriterion("RELEASED_BY between", value1, value2, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByNotBetween(String value1, String value2) {
            addCriterion("RELEASED_BY not between", value1, value2, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedOnIsNull() {
            addCriterion("RELEASED_ON is null");
            return (Criteria) this;
        }

        public Criteria andReleasedOnIsNotNull() {
            addCriterion("RELEASED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedOnEqualTo(Date value) {
            addCriterionForJDBCDate("RELEASED_ON =", value, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("RELEASED_ON <>", value, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnGreaterThan(Date value) {
            addCriterionForJDBCDate("RELEASED_ON >", value, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RELEASED_ON >=", value, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnLessThan(Date value) {
            addCriterionForJDBCDate("RELEASED_ON <", value, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RELEASED_ON <=", value, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnIn(List<Date> values) {
            addCriterionForJDBCDate("RELEASED_ON in", values, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("RELEASED_ON not in", values, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RELEASED_ON between", value1, value2, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RELEASED_ON not between", value1, value2, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andInControlIsNull() {
            addCriterion("IN_CONTROL is null");
            return (Criteria) this;
        }

        public Criteria andInControlIsNotNull() {
            addCriterion("IN_CONTROL is not null");
            return (Criteria) this;
        }

        public Criteria andInControlEqualTo(String value) {
            addCriterion("IN_CONTROL =", value, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlNotEqualTo(String value) {
            addCriterion("IN_CONTROL <>", value, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlGreaterThan(String value) {
            addCriterion("IN_CONTROL >", value, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlGreaterThanOrEqualTo(String value) {
            addCriterion("IN_CONTROL >=", value, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlLessThan(String value) {
            addCriterion("IN_CONTROL <", value, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlLessThanOrEqualTo(String value) {
            addCriterion("IN_CONTROL <=", value, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlLike(String value) {
            addCriterion("IN_CONTROL like", value, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlNotLike(String value) {
            addCriterion("IN_CONTROL not like", value, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlIn(List<String> values) {
            addCriterion("IN_CONTROL in", values, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlNotIn(List<String> values) {
            addCriterion("IN_CONTROL not in", values, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlBetween(String value1, String value2) {
            addCriterion("IN_CONTROL between", value1, value2, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlNotBetween(String value1, String value2) {
            addCriterion("IN_CONTROL not between", value1, value2, "inControl");
            return (Criteria) this;
        }

        public Criteria andInvestigationIsNull() {
            addCriterion("INVESTIGATION is null");
            return (Criteria) this;
        }

        public Criteria andInvestigationIsNotNull() {
            addCriterion("INVESTIGATION is not null");
            return (Criteria) this;
        }

        public Criteria andInvestigationEqualTo(String value) {
            addCriterion("INVESTIGATION =", value, "investigation");
            return (Criteria) this;
        }

        public Criteria andInvestigationNotEqualTo(String value) {
            addCriterion("INVESTIGATION <>", value, "investigation");
            return (Criteria) this;
        }

        public Criteria andInvestigationGreaterThan(String value) {
            addCriterion("INVESTIGATION >", value, "investigation");
            return (Criteria) this;
        }

        public Criteria andInvestigationGreaterThanOrEqualTo(String value) {
            addCriterion("INVESTIGATION >=", value, "investigation");
            return (Criteria) this;
        }

        public Criteria andInvestigationLessThan(String value) {
            addCriterion("INVESTIGATION <", value, "investigation");
            return (Criteria) this;
        }

        public Criteria andInvestigationLessThanOrEqualTo(String value) {
            addCriterion("INVESTIGATION <=", value, "investigation");
            return (Criteria) this;
        }

        public Criteria andInvestigationLike(String value) {
            addCriterion("INVESTIGATION like", value, "investigation");
            return (Criteria) this;
        }

        public Criteria andInvestigationNotLike(String value) {
            addCriterion("INVESTIGATION not like", value, "investigation");
            return (Criteria) this;
        }

        public Criteria andInvestigationIn(List<String> values) {
            addCriterion("INVESTIGATION in", values, "investigation");
            return (Criteria) this;
        }

        public Criteria andInvestigationNotIn(List<String> values) {
            addCriterion("INVESTIGATION not in", values, "investigation");
            return (Criteria) this;
        }

        public Criteria andInvestigationBetween(String value1, String value2) {
            addCriterion("INVESTIGATION between", value1, value2, "investigation");
            return (Criteria) this;
        }

        public Criteria andInvestigationNotBetween(String value1, String value2) {
            addCriterion("INVESTIGATION not between", value1, value2, "investigation");
            return (Criteria) this;
        }

        public Criteria andInvestigatedIsNull() {
            addCriterion("INVESTIGATED is null");
            return (Criteria) this;
        }

        public Criteria andInvestigatedIsNotNull() {
            addCriterion("INVESTIGATED is not null");
            return (Criteria) this;
        }

        public Criteria andInvestigatedEqualTo(String value) {
            addCriterion("INVESTIGATED =", value, "investigated");
            return (Criteria) this;
        }

        public Criteria andInvestigatedNotEqualTo(String value) {
            addCriterion("INVESTIGATED <>", value, "investigated");
            return (Criteria) this;
        }

        public Criteria andInvestigatedGreaterThan(String value) {
            addCriterion("INVESTIGATED >", value, "investigated");
            return (Criteria) this;
        }

        public Criteria andInvestigatedGreaterThanOrEqualTo(String value) {
            addCriterion("INVESTIGATED >=", value, "investigated");
            return (Criteria) this;
        }

        public Criteria andInvestigatedLessThan(String value) {
            addCriterion("INVESTIGATED <", value, "investigated");
            return (Criteria) this;
        }

        public Criteria andInvestigatedLessThanOrEqualTo(String value) {
            addCriterion("INVESTIGATED <=", value, "investigated");
            return (Criteria) this;
        }

        public Criteria andInvestigatedLike(String value) {
            addCriterion("INVESTIGATED like", value, "investigated");
            return (Criteria) this;
        }

        public Criteria andInvestigatedNotLike(String value) {
            addCriterion("INVESTIGATED not like", value, "investigated");
            return (Criteria) this;
        }

        public Criteria andInvestigatedIn(List<String> values) {
            addCriterion("INVESTIGATED in", values, "investigated");
            return (Criteria) this;
        }

        public Criteria andInvestigatedNotIn(List<String> values) {
            addCriterion("INVESTIGATED not in", values, "investigated");
            return (Criteria) this;
        }

        public Criteria andInvestigatedBetween(String value1, String value2) {
            addCriterion("INVESTIGATED between", value1, value2, "investigated");
            return (Criteria) this;
        }

        public Criteria andInvestigatedNotBetween(String value1, String value2) {
            addCriterion("INVESTIGATED not between", value1, value2, "investigated");
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

        public Criteria andModifiedResultsIsNull() {
            addCriterion("MODIFIED_RESULTS is null");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsIsNotNull() {
            addCriterion("MODIFIED_RESULTS is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsEqualTo(String value) {
            addCriterion("MODIFIED_RESULTS =", value, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsNotEqualTo(String value) {
            addCriterion("MODIFIED_RESULTS <>", value, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsGreaterThan(String value) {
            addCriterion("MODIFIED_RESULTS >", value, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIED_RESULTS >=", value, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsLessThan(String value) {
            addCriterion("MODIFIED_RESULTS <", value, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsLessThanOrEqualTo(String value) {
            addCriterion("MODIFIED_RESULTS <=", value, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsLike(String value) {
            addCriterion("MODIFIED_RESULTS like", value, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsNotLike(String value) {
            addCriterion("MODIFIED_RESULTS not like", value, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsIn(List<String> values) {
            addCriterion("MODIFIED_RESULTS in", values, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsNotIn(List<String> values) {
            addCriterion("MODIFIED_RESULTS not in", values, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsBetween(String value1, String value2) {
            addCriterion("MODIFIED_RESULTS between", value1, value2, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsNotBetween(String value1, String value2) {
            addCriterion("MODIFIED_RESULTS not between", value1, value2, "modifiedResults");
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

        public Criteria andCompositeIsNull() {
            addCriterion("COMPOSITE is null");
            return (Criteria) this;
        }

        public Criteria andCompositeIsNotNull() {
            addCriterion("COMPOSITE is not null");
            return (Criteria) this;
        }

        public Criteria andCompositeEqualTo(String value) {
            addCriterion("COMPOSITE =", value, "composite");
            return (Criteria) this;
        }

        public Criteria andCompositeNotEqualTo(String value) {
            addCriterion("COMPOSITE <>", value, "composite");
            return (Criteria) this;
        }

        public Criteria andCompositeGreaterThan(String value) {
            addCriterion("COMPOSITE >", value, "composite");
            return (Criteria) this;
        }

        public Criteria andCompositeGreaterThanOrEqualTo(String value) {
            addCriterion("COMPOSITE >=", value, "composite");
            return (Criteria) this;
        }

        public Criteria andCompositeLessThan(String value) {
            addCriterion("COMPOSITE <", value, "composite");
            return (Criteria) this;
        }

        public Criteria andCompositeLessThanOrEqualTo(String value) {
            addCriterion("COMPOSITE <=", value, "composite");
            return (Criteria) this;
        }

        public Criteria andCompositeLike(String value) {
            addCriterion("COMPOSITE like", value, "composite");
            return (Criteria) this;
        }

        public Criteria andCompositeNotLike(String value) {
            addCriterion("COMPOSITE not like", value, "composite");
            return (Criteria) this;
        }

        public Criteria andCompositeIn(List<String> values) {
            addCriterion("COMPOSITE in", values, "composite");
            return (Criteria) this;
        }

        public Criteria andCompositeNotIn(List<String> values) {
            addCriterion("COMPOSITE not in", values, "composite");
            return (Criteria) this;
        }

        public Criteria andCompositeBetween(String value1, String value2) {
            addCriterion("COMPOSITE between", value1, value2, "composite");
            return (Criteria) this;
        }

        public Criteria andCompositeNotBetween(String value1, String value2) {
            addCriterion("COMPOSITE not between", value1, value2, "composite");
            return (Criteria) this;
        }

        public Criteria andParentCompositeIsNull() {
            addCriterion("PARENT_COMPOSITE is null");
            return (Criteria) this;
        }

        public Criteria andParentCompositeIsNotNull() {
            addCriterion("PARENT_COMPOSITE is not null");
            return (Criteria) this;
        }

        public Criteria andParentCompositeEqualTo(Long value) {
            addCriterion("PARENT_COMPOSITE =", value, "parentComposite");
            return (Criteria) this;
        }

        public Criteria andParentCompositeNotEqualTo(Long value) {
            addCriterion("PARENT_COMPOSITE <>", value, "parentComposite");
            return (Criteria) this;
        }

        public Criteria andParentCompositeGreaterThan(Long value) {
            addCriterion("PARENT_COMPOSITE >", value, "parentComposite");
            return (Criteria) this;
        }

        public Criteria andParentCompositeGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_COMPOSITE >=", value, "parentComposite");
            return (Criteria) this;
        }

        public Criteria andParentCompositeLessThan(Long value) {
            addCriterion("PARENT_COMPOSITE <", value, "parentComposite");
            return (Criteria) this;
        }

        public Criteria andParentCompositeLessThanOrEqualTo(Long value) {
            addCriterion("PARENT_COMPOSITE <=", value, "parentComposite");
            return (Criteria) this;
        }

        public Criteria andParentCompositeIn(List<Long> values) {
            addCriterion("PARENT_COMPOSITE in", values, "parentComposite");
            return (Criteria) this;
        }

        public Criteria andParentCompositeNotIn(List<Long> values) {
            addCriterion("PARENT_COMPOSITE not in", values, "parentComposite");
            return (Criteria) this;
        }

        public Criteria andParentCompositeBetween(Long value1, Long value2) {
            addCriterion("PARENT_COMPOSITE between", value1, value2, "parentComposite");
            return (Criteria) this;
        }

        public Criteria andParentCompositeNotBetween(Long value1, Long value2) {
            addCriterion("PARENT_COMPOSITE not between", value1, value2, "parentComposite");
            return (Criteria) this;
        }

        public Criteria andCompositeTemplateIsNull() {
            addCriterion("COMPOSITE_TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andCompositeTemplateIsNotNull() {
            addCriterion("COMPOSITE_TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andCompositeTemplateEqualTo(String value) {
            addCriterion("COMPOSITE_TEMPLATE =", value, "compositeTemplate");
            return (Criteria) this;
        }

        public Criteria andCompositeTemplateNotEqualTo(String value) {
            addCriterion("COMPOSITE_TEMPLATE <>", value, "compositeTemplate");
            return (Criteria) this;
        }

        public Criteria andCompositeTemplateGreaterThan(String value) {
            addCriterion("COMPOSITE_TEMPLATE >", value, "compositeTemplate");
            return (Criteria) this;
        }

        public Criteria andCompositeTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("COMPOSITE_TEMPLATE >=", value, "compositeTemplate");
            return (Criteria) this;
        }

        public Criteria andCompositeTemplateLessThan(String value) {
            addCriterion("COMPOSITE_TEMPLATE <", value, "compositeTemplate");
            return (Criteria) this;
        }

        public Criteria andCompositeTemplateLessThanOrEqualTo(String value) {
            addCriterion("COMPOSITE_TEMPLATE <=", value, "compositeTemplate");
            return (Criteria) this;
        }

        public Criteria andCompositeTemplateLike(String value) {
            addCriterion("COMPOSITE_TEMPLATE like", value, "compositeTemplate");
            return (Criteria) this;
        }

        public Criteria andCompositeTemplateNotLike(String value) {
            addCriterion("COMPOSITE_TEMPLATE not like", value, "compositeTemplate");
            return (Criteria) this;
        }

        public Criteria andCompositeTemplateIn(List<String> values) {
            addCriterion("COMPOSITE_TEMPLATE in", values, "compositeTemplate");
            return (Criteria) this;
        }

        public Criteria andCompositeTemplateNotIn(List<String> values) {
            addCriterion("COMPOSITE_TEMPLATE not in", values, "compositeTemplate");
            return (Criteria) this;
        }

        public Criteria andCompositeTemplateBetween(String value1, String value2) {
            addCriterion("COMPOSITE_TEMPLATE between", value1, value2, "compositeTemplate");
            return (Criteria) this;
        }

        public Criteria andCompositeTemplateNotBetween(String value1, String value2) {
            addCriterion("COMPOSITE_TEMPLATE not between", value1, value2, "compositeTemplate");
            return (Criteria) this;
        }

        public Criteria andSeasonDateIsNull() {
            addCriterion("SEASON_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSeasonDateIsNotNull() {
            addCriterion("SEASON_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonDateEqualTo(Date value) {
            addCriterionForJDBCDate("SEASON_DATE =", value, "seasonDate");
            return (Criteria) this;
        }

        public Criteria andSeasonDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SEASON_DATE <>", value, "seasonDate");
            return (Criteria) this;
        }

        public Criteria andSeasonDateGreaterThan(Date value) {
            addCriterionForJDBCDate("SEASON_DATE >", value, "seasonDate");
            return (Criteria) this;
        }

        public Criteria andSeasonDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SEASON_DATE >=", value, "seasonDate");
            return (Criteria) this;
        }

        public Criteria andSeasonDateLessThan(Date value) {
            addCriterionForJDBCDate("SEASON_DATE <", value, "seasonDate");
            return (Criteria) this;
        }

        public Criteria andSeasonDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SEASON_DATE <=", value, "seasonDate");
            return (Criteria) this;
        }

        public Criteria andSeasonDateIn(List<Date> values) {
            addCriterionForJDBCDate("SEASON_DATE in", values, "seasonDate");
            return (Criteria) this;
        }

        public Criteria andSeasonDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SEASON_DATE not in", values, "seasonDate");
            return (Criteria) this;
        }

        public Criteria andSeasonDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SEASON_DATE between", value1, value2, "seasonDate");
            return (Criteria) this;
        }

        public Criteria andSeasonDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SEASON_DATE not between", value1, value2, "seasonDate");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNull() {
            addCriterion("PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNotNull() {
            addCriterion("PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleEqualTo(Long value) {
            addCriterion("PEOPLE =", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotEqualTo(Long value) {
            addCriterion("PEOPLE <>", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThan(Long value) {
            addCriterion("PEOPLE >", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThanOrEqualTo(Long value) {
            addCriterion("PEOPLE >=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThan(Long value) {
            addCriterion("PEOPLE <", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThanOrEqualTo(Long value) {
            addCriterion("PEOPLE <=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleIn(List<Long> values) {
            addCriterion("PEOPLE in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotIn(List<Long> values) {
            addCriterion("PEOPLE not in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleBetween(Long value1, Long value2) {
            addCriterion("PEOPLE between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotBetween(Long value1, Long value2) {
            addCriterion("PEOPLE not between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andTestLocationIsNull() {
            addCriterion("TEST_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andTestLocationIsNotNull() {
            addCriterion("TEST_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andTestLocationEqualTo(String value) {
            addCriterion("TEST_LOCATION =", value, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationNotEqualTo(String value) {
            addCriterion("TEST_LOCATION <>", value, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationGreaterThan(String value) {
            addCriterion("TEST_LOCATION >", value, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_LOCATION >=", value, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationLessThan(String value) {
            addCriterion("TEST_LOCATION <", value, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationLessThanOrEqualTo(String value) {
            addCriterion("TEST_LOCATION <=", value, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationLike(String value) {
            addCriterion("TEST_LOCATION like", value, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationNotLike(String value) {
            addCriterion("TEST_LOCATION not like", value, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationIn(List<String> values) {
            addCriterion("TEST_LOCATION in", values, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationNotIn(List<String> values) {
            addCriterion("TEST_LOCATION not in", values, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationBetween(String value1, String value2) {
            addCriterion("TEST_LOCATION between", value1, value2, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationNotBetween(String value1, String value2) {
            addCriterion("TEST_LOCATION not between", value1, value2, "testLocation");
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

        public Criteria andChkAliquotStatusIsNull() {
            addCriterion("CHK_ALIQUOT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andChkAliquotStatusIsNotNull() {
            addCriterion("CHK_ALIQUOT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andChkAliquotStatusEqualTo(String value) {
            addCriterion("CHK_ALIQUOT_STATUS =", value, "chkAliquotStatus");
            return (Criteria) this;
        }

        public Criteria andChkAliquotStatusNotEqualTo(String value) {
            addCriterion("CHK_ALIQUOT_STATUS <>", value, "chkAliquotStatus");
            return (Criteria) this;
        }

        public Criteria andChkAliquotStatusGreaterThan(String value) {
            addCriterion("CHK_ALIQUOT_STATUS >", value, "chkAliquotStatus");
            return (Criteria) this;
        }

        public Criteria andChkAliquotStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_ALIQUOT_STATUS >=", value, "chkAliquotStatus");
            return (Criteria) this;
        }

        public Criteria andChkAliquotStatusLessThan(String value) {
            addCriterion("CHK_ALIQUOT_STATUS <", value, "chkAliquotStatus");
            return (Criteria) this;
        }

        public Criteria andChkAliquotStatusLessThanOrEqualTo(String value) {
            addCriterion("CHK_ALIQUOT_STATUS <=", value, "chkAliquotStatus");
            return (Criteria) this;
        }

        public Criteria andChkAliquotStatusLike(String value) {
            addCriterion("CHK_ALIQUOT_STATUS like", value, "chkAliquotStatus");
            return (Criteria) this;
        }

        public Criteria andChkAliquotStatusNotLike(String value) {
            addCriterion("CHK_ALIQUOT_STATUS not like", value, "chkAliquotStatus");
            return (Criteria) this;
        }

        public Criteria andChkAliquotStatusIn(List<String> values) {
            addCriterion("CHK_ALIQUOT_STATUS in", values, "chkAliquotStatus");
            return (Criteria) this;
        }

        public Criteria andChkAliquotStatusNotIn(List<String> values) {
            addCriterion("CHK_ALIQUOT_STATUS not in", values, "chkAliquotStatus");
            return (Criteria) this;
        }

        public Criteria andChkAliquotStatusBetween(String value1, String value2) {
            addCriterion("CHK_ALIQUOT_STATUS between", value1, value2, "chkAliquotStatus");
            return (Criteria) this;
        }

        public Criteria andChkAliquotStatusNotBetween(String value1, String value2) {
            addCriterion("CHK_ALIQUOT_STATUS not between", value1, value2, "chkAliquotStatus");
            return (Criteria) this;
        }

        public Criteria andChkAliquotSpecsIsNull() {
            addCriterion("CHK_ALIQUOT_SPECS is null");
            return (Criteria) this;
        }

        public Criteria andChkAliquotSpecsIsNotNull() {
            addCriterion("CHK_ALIQUOT_SPECS is not null");
            return (Criteria) this;
        }

        public Criteria andChkAliquotSpecsEqualTo(String value) {
            addCriterion("CHK_ALIQUOT_SPECS =", value, "chkAliquotSpecs");
            return (Criteria) this;
        }

        public Criteria andChkAliquotSpecsNotEqualTo(String value) {
            addCriterion("CHK_ALIQUOT_SPECS <>", value, "chkAliquotSpecs");
            return (Criteria) this;
        }

        public Criteria andChkAliquotSpecsGreaterThan(String value) {
            addCriterion("CHK_ALIQUOT_SPECS >", value, "chkAliquotSpecs");
            return (Criteria) this;
        }

        public Criteria andChkAliquotSpecsGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_ALIQUOT_SPECS >=", value, "chkAliquotSpecs");
            return (Criteria) this;
        }

        public Criteria andChkAliquotSpecsLessThan(String value) {
            addCriterion("CHK_ALIQUOT_SPECS <", value, "chkAliquotSpecs");
            return (Criteria) this;
        }

        public Criteria andChkAliquotSpecsLessThanOrEqualTo(String value) {
            addCriterion("CHK_ALIQUOT_SPECS <=", value, "chkAliquotSpecs");
            return (Criteria) this;
        }

        public Criteria andChkAliquotSpecsLike(String value) {
            addCriterion("CHK_ALIQUOT_SPECS like", value, "chkAliquotSpecs");
            return (Criteria) this;
        }

        public Criteria andChkAliquotSpecsNotLike(String value) {
            addCriterion("CHK_ALIQUOT_SPECS not like", value, "chkAliquotSpecs");
            return (Criteria) this;
        }

        public Criteria andChkAliquotSpecsIn(List<String> values) {
            addCriterion("CHK_ALIQUOT_SPECS in", values, "chkAliquotSpecs");
            return (Criteria) this;
        }

        public Criteria andChkAliquotSpecsNotIn(List<String> values) {
            addCriterion("CHK_ALIQUOT_SPECS not in", values, "chkAliquotSpecs");
            return (Criteria) this;
        }

        public Criteria andChkAliquotSpecsBetween(String value1, String value2) {
            addCriterion("CHK_ALIQUOT_SPECS between", value1, value2, "chkAliquotSpecs");
            return (Criteria) this;
        }

        public Criteria andChkAliquotSpecsNotBetween(String value1, String value2) {
            addCriterion("CHK_ALIQUOT_SPECS not between", value1, value2, "chkAliquotSpecs");
            return (Criteria) this;
        }

        public Criteria andAliquotTemplateIsNull() {
            addCriterion("ALIQUOT_TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andAliquotTemplateIsNotNull() {
            addCriterion("ALIQUOT_TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andAliquotTemplateEqualTo(String value) {
            addCriterion("ALIQUOT_TEMPLATE =", value, "aliquotTemplate");
            return (Criteria) this;
        }

        public Criteria andAliquotTemplateNotEqualTo(String value) {
            addCriterion("ALIQUOT_TEMPLATE <>", value, "aliquotTemplate");
            return (Criteria) this;
        }

        public Criteria andAliquotTemplateGreaterThan(String value) {
            addCriterion("ALIQUOT_TEMPLATE >", value, "aliquotTemplate");
            return (Criteria) this;
        }

        public Criteria andAliquotTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("ALIQUOT_TEMPLATE >=", value, "aliquotTemplate");
            return (Criteria) this;
        }

        public Criteria andAliquotTemplateLessThan(String value) {
            addCriterion("ALIQUOT_TEMPLATE <", value, "aliquotTemplate");
            return (Criteria) this;
        }

        public Criteria andAliquotTemplateLessThanOrEqualTo(String value) {
            addCriterion("ALIQUOT_TEMPLATE <=", value, "aliquotTemplate");
            return (Criteria) this;
        }

        public Criteria andAliquotTemplateLike(String value) {
            addCriterion("ALIQUOT_TEMPLATE like", value, "aliquotTemplate");
            return (Criteria) this;
        }

        public Criteria andAliquotTemplateNotLike(String value) {
            addCriterion("ALIQUOT_TEMPLATE not like", value, "aliquotTemplate");
            return (Criteria) this;
        }

        public Criteria andAliquotTemplateIn(List<String> values) {
            addCriterion("ALIQUOT_TEMPLATE in", values, "aliquotTemplate");
            return (Criteria) this;
        }

        public Criteria andAliquotTemplateNotIn(List<String> values) {
            addCriterion("ALIQUOT_TEMPLATE not in", values, "aliquotTemplate");
            return (Criteria) this;
        }

        public Criteria andAliquotTemplateBetween(String value1, String value2) {
            addCriterion("ALIQUOT_TEMPLATE between", value1, value2, "aliquotTemplate");
            return (Criteria) this;
        }

        public Criteria andAliquotTemplateNotBetween(String value1, String value2) {
            addCriterion("ALIQUOT_TEMPLATE not between", value1, value2, "aliquotTemplate");
            return (Criteria) this;
        }

        public Criteria andCalcGroupIsNull() {
            addCriterion("CALC_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andCalcGroupIsNotNull() {
            addCriterion("CALC_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andCalcGroupEqualTo(String value) {
            addCriterion("CALC_GROUP =", value, "calcGroup");
            return (Criteria) this;
        }

        public Criteria andCalcGroupNotEqualTo(String value) {
            addCriterion("CALC_GROUP <>", value, "calcGroup");
            return (Criteria) this;
        }

        public Criteria andCalcGroupGreaterThan(String value) {
            addCriterion("CALC_GROUP >", value, "calcGroup");
            return (Criteria) this;
        }

        public Criteria andCalcGroupGreaterThanOrEqualTo(String value) {
            addCriterion("CALC_GROUP >=", value, "calcGroup");
            return (Criteria) this;
        }

        public Criteria andCalcGroupLessThan(String value) {
            addCriterion("CALC_GROUP <", value, "calcGroup");
            return (Criteria) this;
        }

        public Criteria andCalcGroupLessThanOrEqualTo(String value) {
            addCriterion("CALC_GROUP <=", value, "calcGroup");
            return (Criteria) this;
        }

        public Criteria andCalcGroupLike(String value) {
            addCriterion("CALC_GROUP like", value, "calcGroup");
            return (Criteria) this;
        }

        public Criteria andCalcGroupNotLike(String value) {
            addCriterion("CALC_GROUP not like", value, "calcGroup");
            return (Criteria) this;
        }

        public Criteria andCalcGroupIn(List<String> values) {
            addCriterion("CALC_GROUP in", values, "calcGroup");
            return (Criteria) this;
        }

        public Criteria andCalcGroupNotIn(List<String> values) {
            addCriterion("CALC_GROUP not in", values, "calcGroup");
            return (Criteria) this;
        }

        public Criteria andCalcGroupBetween(String value1, String value2) {
            addCriterion("CALC_GROUP between", value1, value2, "calcGroup");
            return (Criteria) this;
        }

        public Criteria andCalcGroupNotBetween(String value1, String value2) {
            addCriterion("CALC_GROUP not between", value1, value2, "calcGroup");
            return (Criteria) this;
        }

        public Criteria andSampleEventIsNull() {
            addCriterion("SAMPLE_EVENT is null");
            return (Criteria) this;
        }

        public Criteria andSampleEventIsNotNull() {
            addCriterion("SAMPLE_EVENT is not null");
            return (Criteria) this;
        }

        public Criteria andSampleEventEqualTo(Long value) {
            addCriterion("SAMPLE_EVENT =", value, "sampleEvent");
            return (Criteria) this;
        }

        public Criteria andSampleEventNotEqualTo(Long value) {
            addCriterion("SAMPLE_EVENT <>", value, "sampleEvent");
            return (Criteria) this;
        }

        public Criteria andSampleEventGreaterThan(Long value) {
            addCriterion("SAMPLE_EVENT >", value, "sampleEvent");
            return (Criteria) this;
        }

        public Criteria andSampleEventGreaterThanOrEqualTo(Long value) {
            addCriterion("SAMPLE_EVENT >=", value, "sampleEvent");
            return (Criteria) this;
        }

        public Criteria andSampleEventLessThan(Long value) {
            addCriterion("SAMPLE_EVENT <", value, "sampleEvent");
            return (Criteria) this;
        }

        public Criteria andSampleEventLessThanOrEqualTo(Long value) {
            addCriterion("SAMPLE_EVENT <=", value, "sampleEvent");
            return (Criteria) this;
        }

        public Criteria andSampleEventIn(List<Long> values) {
            addCriterion("SAMPLE_EVENT in", values, "sampleEvent");
            return (Criteria) this;
        }

        public Criteria andSampleEventNotIn(List<Long> values) {
            addCriterion("SAMPLE_EVENT not in", values, "sampleEvent");
            return (Criteria) this;
        }

        public Criteria andSampleEventBetween(Long value1, Long value2) {
            addCriterion("SAMPLE_EVENT between", value1, value2, "sampleEvent");
            return (Criteria) this;
        }

        public Criteria andSampleEventNotBetween(Long value1, Long value2) {
            addCriterion("SAMPLE_EVENT not between", value1, value2, "sampleEvent");
            return (Criteria) this;
        }

        public Criteria andLabelIdIsNull() {
            addCriterion("LABEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andLabelIdIsNotNull() {
            addCriterion("LABEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLabelIdEqualTo(String value) {
            addCriterion("LABEL_ID =", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotEqualTo(String value) {
            addCriterion("LABEL_ID <>", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThan(String value) {
            addCriterion("LABEL_ID >", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThanOrEqualTo(String value) {
            addCriterion("LABEL_ID >=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThan(String value) {
            addCriterion("LABEL_ID <", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThanOrEqualTo(String value) {
            addCriterion("LABEL_ID <=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLike(String value) {
            addCriterion("LABEL_ID like", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotLike(String value) {
            addCriterion("LABEL_ID not like", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdIn(List<String> values) {
            addCriterion("LABEL_ID in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotIn(List<String> values) {
            addCriterion("LABEL_ID not in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdBetween(String value1, String value2) {
            addCriterion("LABEL_ID between", value1, value2, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotBetween(String value1, String value2) {
            addCriterion("LABEL_ID not between", value1, value2, "labelId");
            return (Criteria) this;
        }

        public Criteria andHasFlagsIsNull() {
            addCriterion("HAS_FLAGS is null");
            return (Criteria) this;
        }

        public Criteria andHasFlagsIsNotNull() {
            addCriterion("HAS_FLAGS is not null");
            return (Criteria) this;
        }

        public Criteria andHasFlagsEqualTo(String value) {
            addCriterion("HAS_FLAGS =", value, "hasFlags");
            return (Criteria) this;
        }

        public Criteria andHasFlagsNotEqualTo(String value) {
            addCriterion("HAS_FLAGS <>", value, "hasFlags");
            return (Criteria) this;
        }

        public Criteria andHasFlagsGreaterThan(String value) {
            addCriterion("HAS_FLAGS >", value, "hasFlags");
            return (Criteria) this;
        }

        public Criteria andHasFlagsGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_FLAGS >=", value, "hasFlags");
            return (Criteria) this;
        }

        public Criteria andHasFlagsLessThan(String value) {
            addCriterion("HAS_FLAGS <", value, "hasFlags");
            return (Criteria) this;
        }

        public Criteria andHasFlagsLessThanOrEqualTo(String value) {
            addCriterion("HAS_FLAGS <=", value, "hasFlags");
            return (Criteria) this;
        }

        public Criteria andHasFlagsLike(String value) {
            addCriterion("HAS_FLAGS like", value, "hasFlags");
            return (Criteria) this;
        }

        public Criteria andHasFlagsNotLike(String value) {
            addCriterion("HAS_FLAGS not like", value, "hasFlags");
            return (Criteria) this;
        }

        public Criteria andHasFlagsIn(List<String> values) {
            addCriterion("HAS_FLAGS in", values, "hasFlags");
            return (Criteria) this;
        }

        public Criteria andHasFlagsNotIn(List<String> values) {
            addCriterion("HAS_FLAGS not in", values, "hasFlags");
            return (Criteria) this;
        }

        public Criteria andHasFlagsBetween(String value1, String value2) {
            addCriterion("HAS_FLAGS between", value1, value2, "hasFlags");
            return (Criteria) this;
        }

        public Criteria andHasFlagsNotBetween(String value1, String value2) {
            addCriterion("HAS_FLAGS not between", value1, value2, "hasFlags");
            return (Criteria) this;
        }

        public Criteria andVariationIsNull() {
            addCriterion("VARIATION is null");
            return (Criteria) this;
        }

        public Criteria andVariationIsNotNull() {
            addCriterion("VARIATION is not null");
            return (Criteria) this;
        }

        public Criteria andVariationEqualTo(String value) {
            addCriterion("VARIATION =", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationNotEqualTo(String value) {
            addCriterion("VARIATION <>", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationGreaterThan(String value) {
            addCriterion("VARIATION >", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationGreaterThanOrEqualTo(String value) {
            addCriterion("VARIATION >=", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationLessThan(String value) {
            addCriterion("VARIATION <", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationLessThanOrEqualTo(String value) {
            addCriterion("VARIATION <=", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationLike(String value) {
            addCriterion("VARIATION like", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationNotLike(String value) {
            addCriterion("VARIATION not like", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationIn(List<String> values) {
            addCriterion("VARIATION in", values, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationNotIn(List<String> values) {
            addCriterion("VARIATION not in", values, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationBetween(String value1, String value2) {
            addCriterion("VARIATION between", value1, value2, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationNotBetween(String value1, String value2) {
            addCriterion("VARIATION not between", value1, value2, "variation");
            return (Criteria) this;
        }

        public Criteria andSampledByIsNull() {
            addCriterion("SAMPLED_BY is null");
            return (Criteria) this;
        }

        public Criteria andSampledByIsNotNull() {
            addCriterion("SAMPLED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andSampledByEqualTo(String value) {
            addCriterion("SAMPLED_BY =", value, "sampledBy");
            return (Criteria) this;
        }

        public Criteria andSampledByNotEqualTo(String value) {
            addCriterion("SAMPLED_BY <>", value, "sampledBy");
            return (Criteria) this;
        }

        public Criteria andSampledByGreaterThan(String value) {
            addCriterion("SAMPLED_BY >", value, "sampledBy");
            return (Criteria) this;
        }

        public Criteria andSampledByGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLED_BY >=", value, "sampledBy");
            return (Criteria) this;
        }

        public Criteria andSampledByLessThan(String value) {
            addCriterion("SAMPLED_BY <", value, "sampledBy");
            return (Criteria) this;
        }

        public Criteria andSampledByLessThanOrEqualTo(String value) {
            addCriterion("SAMPLED_BY <=", value, "sampledBy");
            return (Criteria) this;
        }

        public Criteria andSampledByLike(String value) {
            addCriterion("SAMPLED_BY like", value, "sampledBy");
            return (Criteria) this;
        }

        public Criteria andSampledByNotLike(String value) {
            addCriterion("SAMPLED_BY not like", value, "sampledBy");
            return (Criteria) this;
        }

        public Criteria andSampledByIn(List<String> values) {
            addCriterion("SAMPLED_BY in", values, "sampledBy");
            return (Criteria) this;
        }

        public Criteria andSampledByNotIn(List<String> values) {
            addCriterion("SAMPLED_BY not in", values, "sampledBy");
            return (Criteria) this;
        }

        public Criteria andSampledByBetween(String value1, String value2) {
            addCriterion("SAMPLED_BY between", value1, value2, "sampledBy");
            return (Criteria) this;
        }

        public Criteria andSampledByNotBetween(String value1, String value2) {
            addCriterion("SAMPLED_BY not between", value1, value2, "sampledBy");
            return (Criteria) this;
        }

        public Criteria andSampledIsNull() {
            addCriterion("SAMPLED is null");
            return (Criteria) this;
        }

        public Criteria andSampledIsNotNull() {
            addCriterion("SAMPLED is not null");
            return (Criteria) this;
        }

        public Criteria andSampledEqualTo(String value) {
            addCriterion("SAMPLED =", value, "sampled");
            return (Criteria) this;
        }

        public Criteria andSampledNotEqualTo(String value) {
            addCriterion("SAMPLED <>", value, "sampled");
            return (Criteria) this;
        }

        public Criteria andSampledGreaterThan(String value) {
            addCriterion("SAMPLED >", value, "sampled");
            return (Criteria) this;
        }

        public Criteria andSampledGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLED >=", value, "sampled");
            return (Criteria) this;
        }

        public Criteria andSampledLessThan(String value) {
            addCriterion("SAMPLED <", value, "sampled");
            return (Criteria) this;
        }

        public Criteria andSampledLessThanOrEqualTo(String value) {
            addCriterion("SAMPLED <=", value, "sampled");
            return (Criteria) this;
        }

        public Criteria andSampledLike(String value) {
            addCriterion("SAMPLED like", value, "sampled");
            return (Criteria) this;
        }

        public Criteria andSampledNotLike(String value) {
            addCriterion("SAMPLED not like", value, "sampled");
            return (Criteria) this;
        }

        public Criteria andSampledIn(List<String> values) {
            addCriterion("SAMPLED in", values, "sampled");
            return (Criteria) this;
        }

        public Criteria andSampledNotIn(List<String> values) {
            addCriterion("SAMPLED not in", values, "sampled");
            return (Criteria) this;
        }

        public Criteria andSampledBetween(String value1, String value2) {
            addCriterion("SAMPLED between", value1, value2, "sampled");
            return (Criteria) this;
        }

        public Criteria andSampledNotBetween(String value1, String value2) {
            addCriterion("SAMPLED not between", value1, value2, "sampled");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("ORDER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("ORDER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(String value) {
            addCriterion("ORDER_NUM =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("ORDER_NUM <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(String value) {
            addCriterion("ORDER_NUM >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NUM >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(String value) {
            addCriterion("ORDER_NUM <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NUM <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(String value) {
            addCriterion("ORDER_NUM like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(String value) {
            addCriterion("ORDER_NUM not like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<String> values) {
            addCriterion("ORDER_NUM in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("ORDER_NUM not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("ORDER_NUM between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("ORDER_NUM not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andLastOrderNumIsNull() {
            addCriterion("LAST_ORDER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLastOrderNumIsNotNull() {
            addCriterion("LAST_ORDER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLastOrderNumEqualTo(String value) {
            addCriterion("LAST_ORDER_NUM =", value, "lastOrderNum");
            return (Criteria) this;
        }

        public Criteria andLastOrderNumNotEqualTo(String value) {
            addCriterion("LAST_ORDER_NUM <>", value, "lastOrderNum");
            return (Criteria) this;
        }

        public Criteria andLastOrderNumGreaterThan(String value) {
            addCriterion("LAST_ORDER_NUM >", value, "lastOrderNum");
            return (Criteria) this;
        }

        public Criteria andLastOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_ORDER_NUM >=", value, "lastOrderNum");
            return (Criteria) this;
        }

        public Criteria andLastOrderNumLessThan(String value) {
            addCriterion("LAST_ORDER_NUM <", value, "lastOrderNum");
            return (Criteria) this;
        }

        public Criteria andLastOrderNumLessThanOrEqualTo(String value) {
            addCriterion("LAST_ORDER_NUM <=", value, "lastOrderNum");
            return (Criteria) this;
        }

        public Criteria andLastOrderNumLike(String value) {
            addCriterion("LAST_ORDER_NUM like", value, "lastOrderNum");
            return (Criteria) this;
        }

        public Criteria andLastOrderNumNotLike(String value) {
            addCriterion("LAST_ORDER_NUM not like", value, "lastOrderNum");
            return (Criteria) this;
        }

        public Criteria andLastOrderNumIn(List<String> values) {
            addCriterion("LAST_ORDER_NUM in", values, "lastOrderNum");
            return (Criteria) this;
        }

        public Criteria andLastOrderNumNotIn(List<String> values) {
            addCriterion("LAST_ORDER_NUM not in", values, "lastOrderNum");
            return (Criteria) this;
        }

        public Criteria andLastOrderNumBetween(String value1, String value2) {
            addCriterion("LAST_ORDER_NUM between", value1, value2, "lastOrderNum");
            return (Criteria) this;
        }

        public Criteria andLastOrderNumNotBetween(String value1, String value2) {
            addCriterion("LAST_ORDER_NUM not between", value1, value2, "lastOrderNum");
            return (Criteria) this;
        }

        public Criteria andStorageConditionIsNull() {
            addCriterion("STORAGE_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andStorageConditionIsNotNull() {
            addCriterion("STORAGE_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andStorageConditionEqualTo(String value) {
            addCriterion("STORAGE_CONDITION =", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionNotEqualTo(String value) {
            addCriterion("STORAGE_CONDITION <>", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionGreaterThan(String value) {
            addCriterion("STORAGE_CONDITION >", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGE_CONDITION >=", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionLessThan(String value) {
            addCriterion("STORAGE_CONDITION <", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionLessThanOrEqualTo(String value) {
            addCriterion("STORAGE_CONDITION <=", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionLike(String value) {
            addCriterion("STORAGE_CONDITION like", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionNotLike(String value) {
            addCriterion("STORAGE_CONDITION not like", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionIn(List<String> values) {
            addCriterion("STORAGE_CONDITION in", values, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionNotIn(List<String> values) {
            addCriterion("STORAGE_CONDITION not in", values, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionBetween(String value1, String value2) {
            addCriterion("STORAGE_CONDITION between", value1, value2, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionNotBetween(String value1, String value2) {
            addCriterion("STORAGE_CONDITION not between", value1, value2, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIsNull() {
            addCriterion("CONTAINER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIsNotNull() {
            addCriterion("CONTAINER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContainerTypeEqualTo(String value) {
            addCriterion("CONTAINER_TYPE =", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotEqualTo(String value) {
            addCriterion("CONTAINER_TYPE <>", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeGreaterThan(String value) {
            addCriterion("CONTAINER_TYPE >", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTAINER_TYPE >=", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLessThan(String value) {
            addCriterion("CONTAINER_TYPE <", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTAINER_TYPE <=", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLike(String value) {
            addCriterion("CONTAINER_TYPE like", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotLike(String value) {
            addCriterion("CONTAINER_TYPE not like", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIn(List<String> values) {
            addCriterion("CONTAINER_TYPE in", values, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotIn(List<String> values) {
            addCriterion("CONTAINER_TYPE not in", values, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeBetween(String value1, String value2) {
            addCriterion("CONTAINER_TYPE between", value1, value2, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotBetween(String value1, String value2) {
            addCriterion("CONTAINER_TYPE not between", value1, value2, "containerType");
            return (Criteria) this;
        }

        public Criteria andNumContainersIsNull() {
            addCriterion("NUM_CONTAINERS is null");
            return (Criteria) this;
        }

        public Criteria andNumContainersIsNotNull() {
            addCriterion("NUM_CONTAINERS is not null");
            return (Criteria) this;
        }

        public Criteria andNumContainersEqualTo(Long value) {
            addCriterion("NUM_CONTAINERS =", value, "numContainers");
            return (Criteria) this;
        }

        public Criteria andNumContainersNotEqualTo(Long value) {
            addCriterion("NUM_CONTAINERS <>", value, "numContainers");
            return (Criteria) this;
        }

        public Criteria andNumContainersGreaterThan(Long value) {
            addCriterion("NUM_CONTAINERS >", value, "numContainers");
            return (Criteria) this;
        }

        public Criteria andNumContainersGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_CONTAINERS >=", value, "numContainers");
            return (Criteria) this;
        }

        public Criteria andNumContainersLessThan(Long value) {
            addCriterion("NUM_CONTAINERS <", value, "numContainers");
            return (Criteria) this;
        }

        public Criteria andNumContainersLessThanOrEqualTo(Long value) {
            addCriterion("NUM_CONTAINERS <=", value, "numContainers");
            return (Criteria) this;
        }

        public Criteria andNumContainersIn(List<Long> values) {
            addCriterion("NUM_CONTAINERS in", values, "numContainers");
            return (Criteria) this;
        }

        public Criteria andNumContainersNotIn(List<Long> values) {
            addCriterion("NUM_CONTAINERS not in", values, "numContainers");
            return (Criteria) this;
        }

        public Criteria andNumContainersBetween(Long value1, Long value2) {
            addCriterion("NUM_CONTAINERS between", value1, value2, "numContainers");
            return (Criteria) this;
        }

        public Criteria andNumContainersNotBetween(Long value1, Long value2) {
            addCriterion("NUM_CONTAINERS not between", value1, value2, "numContainers");
            return (Criteria) this;
        }

        public Criteria andImportantMessageIsNull() {
            addCriterion("IMPORTANT_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andImportantMessageIsNotNull() {
            addCriterion("IMPORTANT_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andImportantMessageEqualTo(String value) {
            addCriterion("IMPORTANT_MESSAGE =", value, "importantMessage");
            return (Criteria) this;
        }

        public Criteria andImportantMessageNotEqualTo(String value) {
            addCriterion("IMPORTANT_MESSAGE <>", value, "importantMessage");
            return (Criteria) this;
        }

        public Criteria andImportantMessageGreaterThan(String value) {
            addCriterion("IMPORTANT_MESSAGE >", value, "importantMessage");
            return (Criteria) this;
        }

        public Criteria andImportantMessageGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORTANT_MESSAGE >=", value, "importantMessage");
            return (Criteria) this;
        }

        public Criteria andImportantMessageLessThan(String value) {
            addCriterion("IMPORTANT_MESSAGE <", value, "importantMessage");
            return (Criteria) this;
        }

        public Criteria andImportantMessageLessThanOrEqualTo(String value) {
            addCriterion("IMPORTANT_MESSAGE <=", value, "importantMessage");
            return (Criteria) this;
        }

        public Criteria andImportantMessageLike(String value) {
            addCriterion("IMPORTANT_MESSAGE like", value, "importantMessage");
            return (Criteria) this;
        }

        public Criteria andImportantMessageNotLike(String value) {
            addCriterion("IMPORTANT_MESSAGE not like", value, "importantMessage");
            return (Criteria) this;
        }

        public Criteria andImportantMessageIn(List<String> values) {
            addCriterion("IMPORTANT_MESSAGE in", values, "importantMessage");
            return (Criteria) this;
        }

        public Criteria andImportantMessageNotIn(List<String> values) {
            addCriterion("IMPORTANT_MESSAGE not in", values, "importantMessage");
            return (Criteria) this;
        }

        public Criteria andImportantMessageBetween(String value1, String value2) {
            addCriterion("IMPORTANT_MESSAGE between", value1, value2, "importantMessage");
            return (Criteria) this;
        }

        public Criteria andImportantMessageNotBetween(String value1, String value2) {
            addCriterion("IMPORTANT_MESSAGE not between", value1, value2, "importantMessage");
            return (Criteria) this;
        }

        public Criteria andObservationsIsNull() {
            addCriterion("OBSERVATIONS is null");
            return (Criteria) this;
        }

        public Criteria andObservationsIsNotNull() {
            addCriterion("OBSERVATIONS is not null");
            return (Criteria) this;
        }

        public Criteria andObservationsEqualTo(String value) {
            addCriterion("OBSERVATIONS =", value, "observations");
            return (Criteria) this;
        }

        public Criteria andObservationsNotEqualTo(String value) {
            addCriterion("OBSERVATIONS <>", value, "observations");
            return (Criteria) this;
        }

        public Criteria andObservationsGreaterThan(String value) {
            addCriterion("OBSERVATIONS >", value, "observations");
            return (Criteria) this;
        }

        public Criteria andObservationsGreaterThanOrEqualTo(String value) {
            addCriterion("OBSERVATIONS >=", value, "observations");
            return (Criteria) this;
        }

        public Criteria andObservationsLessThan(String value) {
            addCriterion("OBSERVATIONS <", value, "observations");
            return (Criteria) this;
        }

        public Criteria andObservationsLessThanOrEqualTo(String value) {
            addCriterion("OBSERVATIONS <=", value, "observations");
            return (Criteria) this;
        }

        public Criteria andObservationsLike(String value) {
            addCriterion("OBSERVATIONS like", value, "observations");
            return (Criteria) this;
        }

        public Criteria andObservationsNotLike(String value) {
            addCriterion("OBSERVATIONS not like", value, "observations");
            return (Criteria) this;
        }

        public Criteria andObservationsIn(List<String> values) {
            addCriterion("OBSERVATIONS in", values, "observations");
            return (Criteria) this;
        }

        public Criteria andObservationsNotIn(List<String> values) {
            addCriterion("OBSERVATIONS not in", values, "observations");
            return (Criteria) this;
        }

        public Criteria andObservationsBetween(String value1, String value2) {
            addCriterion("OBSERVATIONS between", value1, value2, "observations");
            return (Criteria) this;
        }

        public Criteria andObservationsNotBetween(String value1, String value2) {
            addCriterion("OBSERVATIONS not between", value1, value2, "observations");
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

        public Criteria andExpirationDateIsNull() {
            addCriterion("EXPIRATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNotNull() {
            addCriterion("EXPIRATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateEqualTo(Date value) {
            addCriterionForJDBCDate("EXPIRATION_DATE =", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("EXPIRATION_DATE <>", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("EXPIRATION_DATE >", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXPIRATION_DATE >=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThan(Date value) {
            addCriterionForJDBCDate("EXPIRATION_DATE <", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXPIRATION_DATE <=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIn(List<Date> values) {
            addCriterionForJDBCDate("EXPIRATION_DATE in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("EXPIRATION_DATE not in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXPIRATION_DATE between", value1, value2, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXPIRATION_DATE not between", value1, value2, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andReqdVolumeIsNull() {
            addCriterion("REQD_VOLUME is null");
            return (Criteria) this;
        }

        public Criteria andReqdVolumeIsNotNull() {
            addCriterion("REQD_VOLUME is not null");
            return (Criteria) this;
        }

        public Criteria andReqdVolumeEqualTo(BigDecimal value) {
            addCriterion("REQD_VOLUME =", value, "reqdVolume");
            return (Criteria) this;
        }

        public Criteria andReqdVolumeNotEqualTo(BigDecimal value) {
            addCriterion("REQD_VOLUME <>", value, "reqdVolume");
            return (Criteria) this;
        }

        public Criteria andReqdVolumeGreaterThan(BigDecimal value) {
            addCriterion("REQD_VOLUME >", value, "reqdVolume");
            return (Criteria) this;
        }

        public Criteria andReqdVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REQD_VOLUME >=", value, "reqdVolume");
            return (Criteria) this;
        }

        public Criteria andReqdVolumeLessThan(BigDecimal value) {
            addCriterion("REQD_VOLUME <", value, "reqdVolume");
            return (Criteria) this;
        }

        public Criteria andReqdVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REQD_VOLUME <=", value, "reqdVolume");
            return (Criteria) this;
        }

        public Criteria andReqdVolumeIn(List<BigDecimal> values) {
            addCriterion("REQD_VOLUME in", values, "reqdVolume");
            return (Criteria) this;
        }

        public Criteria andReqdVolumeNotIn(List<BigDecimal> values) {
            addCriterion("REQD_VOLUME not in", values, "reqdVolume");
            return (Criteria) this;
        }

        public Criteria andReqdVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REQD_VOLUME between", value1, value2, "reqdVolume");
            return (Criteria) this;
        }

        public Criteria andReqdVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REQD_VOLUME not between", value1, value2, "reqdVolume");
            return (Criteria) this;
        }

        public Criteria andCollectionMethodIsNull() {
            addCriterion("COLLECTION_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andCollectionMethodIsNotNull() {
            addCriterion("COLLECTION_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionMethodEqualTo(String value) {
            addCriterion("COLLECTION_METHOD =", value, "collectionMethod");
            return (Criteria) this;
        }

        public Criteria andCollectionMethodNotEqualTo(String value) {
            addCriterion("COLLECTION_METHOD <>", value, "collectionMethod");
            return (Criteria) this;
        }

        public Criteria andCollectionMethodGreaterThan(String value) {
            addCriterion("COLLECTION_METHOD >", value, "collectionMethod");
            return (Criteria) this;
        }

        public Criteria andCollectionMethodGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTION_METHOD >=", value, "collectionMethod");
            return (Criteria) this;
        }

        public Criteria andCollectionMethodLessThan(String value) {
            addCriterion("COLLECTION_METHOD <", value, "collectionMethod");
            return (Criteria) this;
        }

        public Criteria andCollectionMethodLessThanOrEqualTo(String value) {
            addCriterion("COLLECTION_METHOD <=", value, "collectionMethod");
            return (Criteria) this;
        }

        public Criteria andCollectionMethodLike(String value) {
            addCriterion("COLLECTION_METHOD like", value, "collectionMethod");
            return (Criteria) this;
        }

        public Criteria andCollectionMethodNotLike(String value) {
            addCriterion("COLLECTION_METHOD not like", value, "collectionMethod");
            return (Criteria) this;
        }

        public Criteria andCollectionMethodIn(List<String> values) {
            addCriterion("COLLECTION_METHOD in", values, "collectionMethod");
            return (Criteria) this;
        }

        public Criteria andCollectionMethodNotIn(List<String> values) {
            addCriterion("COLLECTION_METHOD not in", values, "collectionMethod");
            return (Criteria) this;
        }

        public Criteria andCollectionMethodBetween(String value1, String value2) {
            addCriterion("COLLECTION_METHOD between", value1, value2, "collectionMethod");
            return (Criteria) this;
        }

        public Criteria andCollectionMethodNotBetween(String value1, String value2) {
            addCriterion("COLLECTION_METHOD not between", value1, value2, "collectionMethod");
            return (Criteria) this;
        }

        public Criteria andCollectionOffsetIsNull() {
            addCriterion("COLLECTION_OFFSET is null");
            return (Criteria) this;
        }

        public Criteria andCollectionOffsetIsNotNull() {
            addCriterion("COLLECTION_OFFSET is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionOffsetEqualTo(Long value) {
            addCriterion("COLLECTION_OFFSET =", value, "collectionOffset");
            return (Criteria) this;
        }

        public Criteria andCollectionOffsetNotEqualTo(Long value) {
            addCriterion("COLLECTION_OFFSET <>", value, "collectionOffset");
            return (Criteria) this;
        }

        public Criteria andCollectionOffsetGreaterThan(Long value) {
            addCriterion("COLLECTION_OFFSET >", value, "collectionOffset");
            return (Criteria) this;
        }

        public Criteria andCollectionOffsetGreaterThanOrEqualTo(Long value) {
            addCriterion("COLLECTION_OFFSET >=", value, "collectionOffset");
            return (Criteria) this;
        }

        public Criteria andCollectionOffsetLessThan(Long value) {
            addCriterion("COLLECTION_OFFSET <", value, "collectionOffset");
            return (Criteria) this;
        }

        public Criteria andCollectionOffsetLessThanOrEqualTo(Long value) {
            addCriterion("COLLECTION_OFFSET <=", value, "collectionOffset");
            return (Criteria) this;
        }

        public Criteria andCollectionOffsetIn(List<Long> values) {
            addCriterion("COLLECTION_OFFSET in", values, "collectionOffset");
            return (Criteria) this;
        }

        public Criteria andCollectionOffsetNotIn(List<Long> values) {
            addCriterion("COLLECTION_OFFSET not in", values, "collectionOffset");
            return (Criteria) this;
        }

        public Criteria andCollectionOffsetBetween(Long value1, Long value2) {
            addCriterion("COLLECTION_OFFSET between", value1, value2, "collectionOffset");
            return (Criteria) this;
        }

        public Criteria andCollectionOffsetNotBetween(Long value1, Long value2) {
            addCriterion("COLLECTION_OFFSET not between", value1, value2, "collectionOffset");
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

        public Criteria andAllowChldAlqtsIsNull() {
            addCriterion("ALLOW_CHLD_ALQTS is null");
            return (Criteria) this;
        }

        public Criteria andAllowChldAlqtsIsNotNull() {
            addCriterion("ALLOW_CHLD_ALQTS is not null");
            return (Criteria) this;
        }

        public Criteria andAllowChldAlqtsEqualTo(String value) {
            addCriterion("ALLOW_CHLD_ALQTS =", value, "allowChldAlqts");
            return (Criteria) this;
        }

        public Criteria andAllowChldAlqtsNotEqualTo(String value) {
            addCriterion("ALLOW_CHLD_ALQTS <>", value, "allowChldAlqts");
            return (Criteria) this;
        }

        public Criteria andAllowChldAlqtsGreaterThan(String value) {
            addCriterion("ALLOW_CHLD_ALQTS >", value, "allowChldAlqts");
            return (Criteria) this;
        }

        public Criteria andAllowChldAlqtsGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_CHLD_ALQTS >=", value, "allowChldAlqts");
            return (Criteria) this;
        }

        public Criteria andAllowChldAlqtsLessThan(String value) {
            addCriterion("ALLOW_CHLD_ALQTS <", value, "allowChldAlqts");
            return (Criteria) this;
        }

        public Criteria andAllowChldAlqtsLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_CHLD_ALQTS <=", value, "allowChldAlqts");
            return (Criteria) this;
        }

        public Criteria andAllowChldAlqtsLike(String value) {
            addCriterion("ALLOW_CHLD_ALQTS like", value, "allowChldAlqts");
            return (Criteria) this;
        }

        public Criteria andAllowChldAlqtsNotLike(String value) {
            addCriterion("ALLOW_CHLD_ALQTS not like", value, "allowChldAlqts");
            return (Criteria) this;
        }

        public Criteria andAllowChldAlqtsIn(List<String> values) {
            addCriterion("ALLOW_CHLD_ALQTS in", values, "allowChldAlqts");
            return (Criteria) this;
        }

        public Criteria andAllowChldAlqtsNotIn(List<String> values) {
            addCriterion("ALLOW_CHLD_ALQTS not in", values, "allowChldAlqts");
            return (Criteria) this;
        }

        public Criteria andAllowChldAlqtsBetween(String value1, String value2) {
            addCriterion("ALLOW_CHLD_ALQTS between", value1, value2, "allowChldAlqts");
            return (Criteria) this;
        }

        public Criteria andAllowChldAlqtsNotBetween(String value1, String value2) {
            addCriterion("ALLOW_CHLD_ALQTS not between", value1, value2, "allowChldAlqts");
            return (Criteria) this;
        }

        public Criteria andContractNumberIsNull() {
            addCriterion("CONTRACT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andContractNumberIsNotNull() {
            addCriterion("CONTRACT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andContractNumberEqualTo(Long value) {
            addCriterion("CONTRACT_NUMBER =", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotEqualTo(Long value) {
            addCriterion("CONTRACT_NUMBER <>", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberGreaterThan(Long value) {
            addCriterion("CONTRACT_NUMBER >", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTRACT_NUMBER >=", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberLessThan(Long value) {
            addCriterion("CONTRACT_NUMBER <", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberLessThanOrEqualTo(Long value) {
            addCriterion("CONTRACT_NUMBER <=", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberIn(List<Long> values) {
            addCriterion("CONTRACT_NUMBER in", values, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotIn(List<Long> values) {
            addCriterion("CONTRACT_NUMBER not in", values, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberBetween(Long value1, Long value2) {
            addCriterion("CONTRACT_NUMBER between", value1, value2, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotBetween(Long value1, Long value2) {
            addCriterion("CONTRACT_NUMBER not between", value1, value2, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescIsNull() {
            addCriterion("BILLING_ITEM_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescIsNotNull() {
            addCriterion("BILLING_ITEM_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescEqualTo(String value) {
            addCriterion("BILLING_ITEM_DESC =", value, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescNotEqualTo(String value) {
            addCriterion("BILLING_ITEM_DESC <>", value, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescGreaterThan(String value) {
            addCriterion("BILLING_ITEM_DESC >", value, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescGreaterThanOrEqualTo(String value) {
            addCriterion("BILLING_ITEM_DESC >=", value, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescLessThan(String value) {
            addCriterion("BILLING_ITEM_DESC <", value, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescLessThanOrEqualTo(String value) {
            addCriterion("BILLING_ITEM_DESC <=", value, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescLike(String value) {
            addCriterion("BILLING_ITEM_DESC like", value, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescNotLike(String value) {
            addCriterion("BILLING_ITEM_DESC not like", value, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescIn(List<String> values) {
            addCriterion("BILLING_ITEM_DESC in", values, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescNotIn(List<String> values) {
            addCriterion("BILLING_ITEM_DESC not in", values, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescBetween(String value1, String value2) {
            addCriterion("BILLING_ITEM_DESC between", value1, value2, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescNotBetween(String value1, String value2) {
            addCriterion("BILLING_ITEM_DESC not between", value1, value2, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andStorageLocNoIsNull() {
            addCriterion("STORAGE_LOC_NO is null");
            return (Criteria) this;
        }

        public Criteria andStorageLocNoIsNotNull() {
            addCriterion("STORAGE_LOC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStorageLocNoEqualTo(Long value) {
            addCriterion("STORAGE_LOC_NO =", value, "storageLocNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocNoNotEqualTo(Long value) {
            addCriterion("STORAGE_LOC_NO <>", value, "storageLocNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocNoGreaterThan(Long value) {
            addCriterion("STORAGE_LOC_NO >", value, "storageLocNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocNoGreaterThanOrEqualTo(Long value) {
            addCriterion("STORAGE_LOC_NO >=", value, "storageLocNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocNoLessThan(Long value) {
            addCriterion("STORAGE_LOC_NO <", value, "storageLocNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocNoLessThanOrEqualTo(Long value) {
            addCriterion("STORAGE_LOC_NO <=", value, "storageLocNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocNoIn(List<Long> values) {
            addCriterion("STORAGE_LOC_NO in", values, "storageLocNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocNoNotIn(List<Long> values) {
            addCriterion("STORAGE_LOC_NO not in", values, "storageLocNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocNoBetween(Long value1, Long value2) {
            addCriterion("STORAGE_LOC_NO between", value1, value2, "storageLocNo");
            return (Criteria) this;
        }

        public Criteria andStorageLocNoNotBetween(Long value1, Long value2) {
            addCriterion("STORAGE_LOC_NO not between", value1, value2, "storageLocNo");
            return (Criteria) this;
        }

        public Criteria andExternalLocationIsNull() {
            addCriterion("EXTERNAL_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andExternalLocationIsNotNull() {
            addCriterion("EXTERNAL_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andExternalLocationEqualTo(String value) {
            addCriterion("EXTERNAL_LOCATION =", value, "externalLocation");
            return (Criteria) this;
        }

        public Criteria andExternalLocationNotEqualTo(String value) {
            addCriterion("EXTERNAL_LOCATION <>", value, "externalLocation");
            return (Criteria) this;
        }

        public Criteria andExternalLocationGreaterThan(String value) {
            addCriterion("EXTERNAL_LOCATION >", value, "externalLocation");
            return (Criteria) this;
        }

        public Criteria andExternalLocationGreaterThanOrEqualTo(String value) {
            addCriterion("EXTERNAL_LOCATION >=", value, "externalLocation");
            return (Criteria) this;
        }

        public Criteria andExternalLocationLessThan(String value) {
            addCriterion("EXTERNAL_LOCATION <", value, "externalLocation");
            return (Criteria) this;
        }

        public Criteria andExternalLocationLessThanOrEqualTo(String value) {
            addCriterion("EXTERNAL_LOCATION <=", value, "externalLocation");
            return (Criteria) this;
        }

        public Criteria andExternalLocationLike(String value) {
            addCriterion("EXTERNAL_LOCATION like", value, "externalLocation");
            return (Criteria) this;
        }

        public Criteria andExternalLocationNotLike(String value) {
            addCriterion("EXTERNAL_LOCATION not like", value, "externalLocation");
            return (Criteria) this;
        }

        public Criteria andExternalLocationIn(List<String> values) {
            addCriterion("EXTERNAL_LOCATION in", values, "externalLocation");
            return (Criteria) this;
        }

        public Criteria andExternalLocationNotIn(List<String> values) {
            addCriterion("EXTERNAL_LOCATION not in", values, "externalLocation");
            return (Criteria) this;
        }

        public Criteria andExternalLocationBetween(String value1, String value2) {
            addCriterion("EXTERNAL_LOCATION between", value1, value2, "externalLocation");
            return (Criteria) this;
        }

        public Criteria andExternalLocationNotBetween(String value1, String value2) {
            addCriterion("EXTERNAL_LOCATION not between", value1, value2, "externalLocation");
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

        public Criteria andConversionGroupsIsNull() {
            addCriterion("CONVERSION_GROUPS is null");
            return (Criteria) this;
        }

        public Criteria andConversionGroupsIsNotNull() {
            addCriterion("CONVERSION_GROUPS is not null");
            return (Criteria) this;
        }

        public Criteria andConversionGroupsEqualTo(String value) {
            addCriterion("CONVERSION_GROUPS =", value, "conversionGroups");
            return (Criteria) this;
        }

        public Criteria andConversionGroupsNotEqualTo(String value) {
            addCriterion("CONVERSION_GROUPS <>", value, "conversionGroups");
            return (Criteria) this;
        }

        public Criteria andConversionGroupsGreaterThan(String value) {
            addCriterion("CONVERSION_GROUPS >", value, "conversionGroups");
            return (Criteria) this;
        }

        public Criteria andConversionGroupsGreaterThanOrEqualTo(String value) {
            addCriterion("CONVERSION_GROUPS >=", value, "conversionGroups");
            return (Criteria) this;
        }

        public Criteria andConversionGroupsLessThan(String value) {
            addCriterion("CONVERSION_GROUPS <", value, "conversionGroups");
            return (Criteria) this;
        }

        public Criteria andConversionGroupsLessThanOrEqualTo(String value) {
            addCriterion("CONVERSION_GROUPS <=", value, "conversionGroups");
            return (Criteria) this;
        }

        public Criteria andConversionGroupsLike(String value) {
            addCriterion("CONVERSION_GROUPS like", value, "conversionGroups");
            return (Criteria) this;
        }

        public Criteria andConversionGroupsNotLike(String value) {
            addCriterion("CONVERSION_GROUPS not like", value, "conversionGroups");
            return (Criteria) this;
        }

        public Criteria andConversionGroupsIn(List<String> values) {
            addCriterion("CONVERSION_GROUPS in", values, "conversionGroups");
            return (Criteria) this;
        }

        public Criteria andConversionGroupsNotIn(List<String> values) {
            addCriterion("CONVERSION_GROUPS not in", values, "conversionGroups");
            return (Criteria) this;
        }

        public Criteria andConversionGroupsBetween(String value1, String value2) {
            addCriterion("CONVERSION_GROUPS between", value1, value2, "conversionGroups");
            return (Criteria) this;
        }

        public Criteria andConversionGroupsNotBetween(String value1, String value2) {
            addCriterion("CONVERSION_GROUPS not between", value1, value2, "conversionGroups");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosIsNull() {
            addCriterion("REPORTED_RSLT_OOS is null");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosIsNotNull() {
            addCriterion("REPORTED_RSLT_OOS is not null");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosEqualTo(String value) {
            addCriterion("REPORTED_RSLT_OOS =", value, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosNotEqualTo(String value) {
            addCriterion("REPORTED_RSLT_OOS <>", value, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosGreaterThan(String value) {
            addCriterion("REPORTED_RSLT_OOS >", value, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTED_RSLT_OOS >=", value, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosLessThan(String value) {
            addCriterion("REPORTED_RSLT_OOS <", value, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosLessThanOrEqualTo(String value) {
            addCriterion("REPORTED_RSLT_OOS <=", value, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosLike(String value) {
            addCriterion("REPORTED_RSLT_OOS like", value, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosNotLike(String value) {
            addCriterion("REPORTED_RSLT_OOS not like", value, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosIn(List<String> values) {
            addCriterion("REPORTED_RSLT_OOS in", values, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosNotIn(List<String> values) {
            addCriterion("REPORTED_RSLT_OOS not in", values, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosBetween(String value1, String value2) {
            addCriterion("REPORTED_RSLT_OOS between", value1, value2, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosNotBetween(String value1, String value2) {
            addCriterion("REPORTED_RSLT_OOS not between", value1, value2, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andTContractTestsIsNull() {
            addCriterion("T_CONTRACT_TESTS is null");
            return (Criteria) this;
        }

        public Criteria andTContractTestsIsNotNull() {
            addCriterion("T_CONTRACT_TESTS is not null");
            return (Criteria) this;
        }

        public Criteria andTContractTestsEqualTo(String value) {
            addCriterion("T_CONTRACT_TESTS =", value, "tContractTests");
            return (Criteria) this;
        }

        public Criteria andTContractTestsNotEqualTo(String value) {
            addCriterion("T_CONTRACT_TESTS <>", value, "tContractTests");
            return (Criteria) this;
        }

        public Criteria andTContractTestsGreaterThan(String value) {
            addCriterion("T_CONTRACT_TESTS >", value, "tContractTests");
            return (Criteria) this;
        }

        public Criteria andTContractTestsGreaterThanOrEqualTo(String value) {
            addCriterion("T_CONTRACT_TESTS >=", value, "tContractTests");
            return (Criteria) this;
        }

        public Criteria andTContractTestsLessThan(String value) {
            addCriterion("T_CONTRACT_TESTS <", value, "tContractTests");
            return (Criteria) this;
        }

        public Criteria andTContractTestsLessThanOrEqualTo(String value) {
            addCriterion("T_CONTRACT_TESTS <=", value, "tContractTests");
            return (Criteria) this;
        }

        public Criteria andTContractTestsLike(String value) {
            addCriterion("T_CONTRACT_TESTS like", value, "tContractTests");
            return (Criteria) this;
        }

        public Criteria andTContractTestsNotLike(String value) {
            addCriterion("T_CONTRACT_TESTS not like", value, "tContractTests");
            return (Criteria) this;
        }

        public Criteria andTContractTestsIn(List<String> values) {
            addCriterion("T_CONTRACT_TESTS in", values, "tContractTests");
            return (Criteria) this;
        }

        public Criteria andTContractTestsNotIn(List<String> values) {
            addCriterion("T_CONTRACT_TESTS not in", values, "tContractTests");
            return (Criteria) this;
        }

        public Criteria andTContractTestsBetween(String value1, String value2) {
            addCriterion("T_CONTRACT_TESTS between", value1, value2, "tContractTests");
            return (Criteria) this;
        }

        public Criteria andTContractTestsNotBetween(String value1, String value2) {
            addCriterion("T_CONTRACT_TESTS not between", value1, value2, "tContractTests");
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

        public Criteria andTDepthIsNull() {
            addCriterion("T_DEPTH is null");
            return (Criteria) this;
        }

        public Criteria andTDepthIsNotNull() {
            addCriterion("T_DEPTH is not null");
            return (Criteria) this;
        }

        public Criteria andTDepthEqualTo(String value) {
            addCriterion("T_DEPTH =", value, "tDepth");
            return (Criteria) this;
        }

        public Criteria andTDepthNotEqualTo(String value) {
            addCriterion("T_DEPTH <>", value, "tDepth");
            return (Criteria) this;
        }

        public Criteria andTDepthGreaterThan(String value) {
            addCriterion("T_DEPTH >", value, "tDepth");
            return (Criteria) this;
        }

        public Criteria andTDepthGreaterThanOrEqualTo(String value) {
            addCriterion("T_DEPTH >=", value, "tDepth");
            return (Criteria) this;
        }

        public Criteria andTDepthLessThan(String value) {
            addCriterion("T_DEPTH <", value, "tDepth");
            return (Criteria) this;
        }

        public Criteria andTDepthLessThanOrEqualTo(String value) {
            addCriterion("T_DEPTH <=", value, "tDepth");
            return (Criteria) this;
        }

        public Criteria andTDepthLike(String value) {
            addCriterion("T_DEPTH like", value, "tDepth");
            return (Criteria) this;
        }

        public Criteria andTDepthNotLike(String value) {
            addCriterion("T_DEPTH not like", value, "tDepth");
            return (Criteria) this;
        }

        public Criteria andTDepthIn(List<String> values) {
            addCriterion("T_DEPTH in", values, "tDepth");
            return (Criteria) this;
        }

        public Criteria andTDepthNotIn(List<String> values) {
            addCriterion("T_DEPTH not in", values, "tDepth");
            return (Criteria) this;
        }

        public Criteria andTDepthBetween(String value1, String value2) {
            addCriterion("T_DEPTH between", value1, value2, "tDepth");
            return (Criteria) this;
        }

        public Criteria andTDepthNotBetween(String value1, String value2) {
            addCriterion("T_DEPTH not between", value1, value2, "tDepth");
            return (Criteria) this;
        }

        public Criteria andTDisposalDateIsNull() {
            addCriterion("T_DISPOSAL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTDisposalDateIsNotNull() {
            addCriterion("T_DISPOSAL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTDisposalDateEqualTo(Date value) {
            addCriterionForJDBCDate("T_DISPOSAL_DATE =", value, "tDisposalDate");
            return (Criteria) this;
        }

        public Criteria andTDisposalDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_DISPOSAL_DATE <>", value, "tDisposalDate");
            return (Criteria) this;
        }

        public Criteria andTDisposalDateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_DISPOSAL_DATE >", value, "tDisposalDate");
            return (Criteria) this;
        }

        public Criteria andTDisposalDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_DISPOSAL_DATE >=", value, "tDisposalDate");
            return (Criteria) this;
        }

        public Criteria andTDisposalDateLessThan(Date value) {
            addCriterionForJDBCDate("T_DISPOSAL_DATE <", value, "tDisposalDate");
            return (Criteria) this;
        }

        public Criteria andTDisposalDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_DISPOSAL_DATE <=", value, "tDisposalDate");
            return (Criteria) this;
        }

        public Criteria andTDisposalDateIn(List<Date> values) {
            addCriterionForJDBCDate("T_DISPOSAL_DATE in", values, "tDisposalDate");
            return (Criteria) this;
        }

        public Criteria andTDisposalDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_DISPOSAL_DATE not in", values, "tDisposalDate");
            return (Criteria) this;
        }

        public Criteria andTDisposalDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_DISPOSAL_DATE between", value1, value2, "tDisposalDate");
            return (Criteria) this;
        }

        public Criteria andTDisposalDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_DISPOSAL_DATE not between", value1, value2, "tDisposalDate");
            return (Criteria) this;
        }

        public Criteria andTInstrumentIsNull() {
            addCriterion("T_INSTRUMENT is null");
            return (Criteria) this;
        }

        public Criteria andTInstrumentIsNotNull() {
            addCriterion("T_INSTRUMENT is not null");
            return (Criteria) this;
        }

        public Criteria andTInstrumentEqualTo(String value) {
            addCriterion("T_INSTRUMENT =", value, "tInstrument");
            return (Criteria) this;
        }

        public Criteria andTInstrumentNotEqualTo(String value) {
            addCriterion("T_INSTRUMENT <>", value, "tInstrument");
            return (Criteria) this;
        }

        public Criteria andTInstrumentGreaterThan(String value) {
            addCriterion("T_INSTRUMENT >", value, "tInstrument");
            return (Criteria) this;
        }

        public Criteria andTInstrumentGreaterThanOrEqualTo(String value) {
            addCriterion("T_INSTRUMENT >=", value, "tInstrument");
            return (Criteria) this;
        }

        public Criteria andTInstrumentLessThan(String value) {
            addCriterion("T_INSTRUMENT <", value, "tInstrument");
            return (Criteria) this;
        }

        public Criteria andTInstrumentLessThanOrEqualTo(String value) {
            addCriterion("T_INSTRUMENT <=", value, "tInstrument");
            return (Criteria) this;
        }

        public Criteria andTInstrumentLike(String value) {
            addCriterion("T_INSTRUMENT like", value, "tInstrument");
            return (Criteria) this;
        }

        public Criteria andTInstrumentNotLike(String value) {
            addCriterion("T_INSTRUMENT not like", value, "tInstrument");
            return (Criteria) this;
        }

        public Criteria andTInstrumentIn(List<String> values) {
            addCriterion("T_INSTRUMENT in", values, "tInstrument");
            return (Criteria) this;
        }

        public Criteria andTInstrumentNotIn(List<String> values) {
            addCriterion("T_INSTRUMENT not in", values, "tInstrument");
            return (Criteria) this;
        }

        public Criteria andTInstrumentBetween(String value1, String value2) {
            addCriterion("T_INSTRUMENT between", value1, value2, "tInstrument");
            return (Criteria) this;
        }

        public Criteria andTInstrumentNotBetween(String value1, String value2) {
            addCriterion("T_INSTRUMENT not between", value1, value2, "tInstrument");
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

        public Criteria andTReturnDateIsNull() {
            addCriterion("T_RETURN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTReturnDateIsNotNull() {
            addCriterion("T_RETURN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTReturnDateEqualTo(Date value) {
            addCriterionForJDBCDate("T_RETURN_DATE =", value, "tReturnDate");
            return (Criteria) this;
        }

        public Criteria andTReturnDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("T_RETURN_DATE <>", value, "tReturnDate");
            return (Criteria) this;
        }

        public Criteria andTReturnDateGreaterThan(Date value) {
            addCriterionForJDBCDate("T_RETURN_DATE >", value, "tReturnDate");
            return (Criteria) this;
        }

        public Criteria andTReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_RETURN_DATE >=", value, "tReturnDate");
            return (Criteria) this;
        }

        public Criteria andTReturnDateLessThan(Date value) {
            addCriterionForJDBCDate("T_RETURN_DATE <", value, "tReturnDate");
            return (Criteria) this;
        }

        public Criteria andTReturnDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T_RETURN_DATE <=", value, "tReturnDate");
            return (Criteria) this;
        }

        public Criteria andTReturnDateIn(List<Date> values) {
            addCriterionForJDBCDate("T_RETURN_DATE in", values, "tReturnDate");
            return (Criteria) this;
        }

        public Criteria andTReturnDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("T_RETURN_DATE not in", values, "tReturnDate");
            return (Criteria) this;
        }

        public Criteria andTReturnDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_RETURN_DATE between", value1, value2, "tReturnDate");
            return (Criteria) this;
        }

        public Criteria andTReturnDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T_RETURN_DATE not between", value1, value2, "tReturnDate");
            return (Criteria) this;
        }

        public Criteria andTSampleIdIsNull() {
            addCriterion("T_SAMPLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTSampleIdIsNotNull() {
            addCriterion("T_SAMPLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTSampleIdEqualTo(String value) {
            addCriterion("T_SAMPLE_ID =", value, "tSampleId");
            return (Criteria) this;
        }

        public Criteria andTSampleIdNotEqualTo(String value) {
            addCriterion("T_SAMPLE_ID <>", value, "tSampleId");
            return (Criteria) this;
        }

        public Criteria andTSampleIdGreaterThan(String value) {
            addCriterion("T_SAMPLE_ID >", value, "tSampleId");
            return (Criteria) this;
        }

        public Criteria andTSampleIdGreaterThanOrEqualTo(String value) {
            addCriterion("T_SAMPLE_ID >=", value, "tSampleId");
            return (Criteria) this;
        }

        public Criteria andTSampleIdLessThan(String value) {
            addCriterion("T_SAMPLE_ID <", value, "tSampleId");
            return (Criteria) this;
        }

        public Criteria andTSampleIdLessThanOrEqualTo(String value) {
            addCriterion("T_SAMPLE_ID <=", value, "tSampleId");
            return (Criteria) this;
        }

        public Criteria andTSampleIdLike(String value) {
            addCriterion("T_SAMPLE_ID like", value, "tSampleId");
            return (Criteria) this;
        }

        public Criteria andTSampleIdNotLike(String value) {
            addCriterion("T_SAMPLE_ID not like", value, "tSampleId");
            return (Criteria) this;
        }

        public Criteria andTSampleIdIn(List<String> values) {
            addCriterion("T_SAMPLE_ID in", values, "tSampleId");
            return (Criteria) this;
        }

        public Criteria andTSampleIdNotIn(List<String> values) {
            addCriterion("T_SAMPLE_ID not in", values, "tSampleId");
            return (Criteria) this;
        }

        public Criteria andTSampleIdBetween(String value1, String value2) {
            addCriterion("T_SAMPLE_ID between", value1, value2, "tSampleId");
            return (Criteria) this;
        }

        public Criteria andTSampleIdNotBetween(String value1, String value2) {
            addCriterion("T_SAMPLE_ID not between", value1, value2, "tSampleId");
            return (Criteria) this;
        }

        public Criteria andCSampleGroupIsNull() {
            addCriterion("C_SAMPLE_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andCSampleGroupIsNotNull() {
            addCriterion("C_SAMPLE_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andCSampleGroupEqualTo(String value) {
            addCriterion("C_SAMPLE_GROUP =", value, "cSampleGroup");
            return (Criteria) this;
        }

        public Criteria andCSampleGroupNotEqualTo(String value) {
            addCriterion("C_SAMPLE_GROUP <>", value, "cSampleGroup");
            return (Criteria) this;
        }

        public Criteria andCSampleGroupGreaterThan(String value) {
            addCriterion("C_SAMPLE_GROUP >", value, "cSampleGroup");
            return (Criteria) this;
        }

        public Criteria andCSampleGroupGreaterThanOrEqualTo(String value) {
            addCriterion("C_SAMPLE_GROUP >=", value, "cSampleGroup");
            return (Criteria) this;
        }

        public Criteria andCSampleGroupLessThan(String value) {
            addCriterion("C_SAMPLE_GROUP <", value, "cSampleGroup");
            return (Criteria) this;
        }

        public Criteria andCSampleGroupLessThanOrEqualTo(String value) {
            addCriterion("C_SAMPLE_GROUP <=", value, "cSampleGroup");
            return (Criteria) this;
        }

        public Criteria andCSampleGroupLike(String value) {
            addCriterion("C_SAMPLE_GROUP like", value, "cSampleGroup");
            return (Criteria) this;
        }

        public Criteria andCSampleGroupNotLike(String value) {
            addCriterion("C_SAMPLE_GROUP not like", value, "cSampleGroup");
            return (Criteria) this;
        }

        public Criteria andCSampleGroupIn(List<String> values) {
            addCriterion("C_SAMPLE_GROUP in", values, "cSampleGroup");
            return (Criteria) this;
        }

        public Criteria andCSampleGroupNotIn(List<String> values) {
            addCriterion("C_SAMPLE_GROUP not in", values, "cSampleGroup");
            return (Criteria) this;
        }

        public Criteria andCSampleGroupBetween(String value1, String value2) {
            addCriterion("C_SAMPLE_GROUP between", value1, value2, "cSampleGroup");
            return (Criteria) this;
        }

        public Criteria andCSampleGroupNotBetween(String value1, String value2) {
            addCriterion("C_SAMPLE_GROUP not between", value1, value2, "cSampleGroup");
            return (Criteria) this;
        }

        public Criteria andCIsSequnceIsNull() {
            addCriterion("C_IS_SEQUNCE is null");
            return (Criteria) this;
        }

        public Criteria andCIsSequnceIsNotNull() {
            addCriterion("C_IS_SEQUNCE is not null");
            return (Criteria) this;
        }

        public Criteria andCIsSequnceEqualTo(String value) {
            addCriterion("C_IS_SEQUNCE =", value, "cIsSequnce");
            return (Criteria) this;
        }

        public Criteria andCIsSequnceNotEqualTo(String value) {
            addCriterion("C_IS_SEQUNCE <>", value, "cIsSequnce");
            return (Criteria) this;
        }

        public Criteria andCIsSequnceGreaterThan(String value) {
            addCriterion("C_IS_SEQUNCE >", value, "cIsSequnce");
            return (Criteria) this;
        }

        public Criteria andCIsSequnceGreaterThanOrEqualTo(String value) {
            addCriterion("C_IS_SEQUNCE >=", value, "cIsSequnce");
            return (Criteria) this;
        }

        public Criteria andCIsSequnceLessThan(String value) {
            addCriterion("C_IS_SEQUNCE <", value, "cIsSequnce");
            return (Criteria) this;
        }

        public Criteria andCIsSequnceLessThanOrEqualTo(String value) {
            addCriterion("C_IS_SEQUNCE <=", value, "cIsSequnce");
            return (Criteria) this;
        }

        public Criteria andCIsSequnceLike(String value) {
            addCriterion("C_IS_SEQUNCE like", value, "cIsSequnce");
            return (Criteria) this;
        }

        public Criteria andCIsSequnceNotLike(String value) {
            addCriterion("C_IS_SEQUNCE not like", value, "cIsSequnce");
            return (Criteria) this;
        }

        public Criteria andCIsSequnceIn(List<String> values) {
            addCriterion("C_IS_SEQUNCE in", values, "cIsSequnce");
            return (Criteria) this;
        }

        public Criteria andCIsSequnceNotIn(List<String> values) {
            addCriterion("C_IS_SEQUNCE not in", values, "cIsSequnce");
            return (Criteria) this;
        }

        public Criteria andCIsSequnceBetween(String value1, String value2) {
            addCriterion("C_IS_SEQUNCE between", value1, value2, "cIsSequnce");
            return (Criteria) this;
        }

        public Criteria andCIsSequnceNotBetween(String value1, String value2) {
            addCriterion("C_IS_SEQUNCE not between", value1, value2, "cIsSequnce");
            return (Criteria) this;
        }

        public Criteria andCContactTypeIsNull() {
            addCriterion("C_CONTACT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCContactTypeIsNotNull() {
            addCriterion("C_CONTACT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCContactTypeEqualTo(String value) {
            addCriterion("C_CONTACT_TYPE =", value, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeNotEqualTo(String value) {
            addCriterion("C_CONTACT_TYPE <>", value, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeGreaterThan(String value) {
            addCriterion("C_CONTACT_TYPE >", value, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_CONTACT_TYPE >=", value, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeLessThan(String value) {
            addCriterion("C_CONTACT_TYPE <", value, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeLessThanOrEqualTo(String value) {
            addCriterion("C_CONTACT_TYPE <=", value, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeLike(String value) {
            addCriterion("C_CONTACT_TYPE like", value, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeNotLike(String value) {
            addCriterion("C_CONTACT_TYPE not like", value, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeIn(List<String> values) {
            addCriterion("C_CONTACT_TYPE in", values, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeNotIn(List<String> values) {
            addCriterion("C_CONTACT_TYPE not in", values, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeBetween(String value1, String value2) {
            addCriterion("C_CONTACT_TYPE between", value1, value2, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeNotBetween(String value1, String value2) {
            addCriterion("C_CONTACT_TYPE not between", value1, value2, "cContactType");
            return (Criteria) this;
        }

        public Criteria andTransNumIsNull() {
            addCriterion("TRANS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTransNumIsNotNull() {
            addCriterion("TRANS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTransNumEqualTo(Long value) {
            addCriterion("TRANS_NUM =", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumNotEqualTo(Long value) {
            addCriterion("TRANS_NUM <>", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumGreaterThan(Long value) {
            addCriterion("TRANS_NUM >", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumGreaterThanOrEqualTo(Long value) {
            addCriterion("TRANS_NUM >=", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumLessThan(Long value) {
            addCriterion("TRANS_NUM <", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumLessThanOrEqualTo(Long value) {
            addCriterion("TRANS_NUM <=", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumIn(List<Long> values) {
            addCriterion("TRANS_NUM in", values, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumNotIn(List<Long> values) {
            addCriterion("TRANS_NUM not in", values, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumBetween(Long value1, Long value2) {
            addCriterion("TRANS_NUM between", value1, value2, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumNotBetween(Long value1, Long value2) {
            addCriterion("TRANS_NUM not between", value1, value2, "transNum");
            return (Criteria) this;
        }

        public Criteria andClonedFromIsNull() {
            addCriterion("CLONED_FROM is null");
            return (Criteria) this;
        }

        public Criteria andClonedFromIsNotNull() {
            addCriterion("CLONED_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andClonedFromEqualTo(Long value) {
            addCriterion("CLONED_FROM =", value, "clonedFrom");
            return (Criteria) this;
        }

        public Criteria andClonedFromNotEqualTo(Long value) {
            addCriterion("CLONED_FROM <>", value, "clonedFrom");
            return (Criteria) this;
        }

        public Criteria andClonedFromGreaterThan(Long value) {
            addCriterion("CLONED_FROM >", value, "clonedFrom");
            return (Criteria) this;
        }

        public Criteria andClonedFromGreaterThanOrEqualTo(Long value) {
            addCriterion("CLONED_FROM >=", value, "clonedFrom");
            return (Criteria) this;
        }

        public Criteria andClonedFromLessThan(Long value) {
            addCriterion("CLONED_FROM <", value, "clonedFrom");
            return (Criteria) this;
        }

        public Criteria andClonedFromLessThanOrEqualTo(Long value) {
            addCriterion("CLONED_FROM <=", value, "clonedFrom");
            return (Criteria) this;
        }

        public Criteria andClonedFromIn(List<Long> values) {
            addCriterion("CLONED_FROM in", values, "clonedFrom");
            return (Criteria) this;
        }

        public Criteria andClonedFromNotIn(List<Long> values) {
            addCriterion("CLONED_FROM not in", values, "clonedFrom");
            return (Criteria) this;
        }

        public Criteria andClonedFromBetween(Long value1, Long value2) {
            addCriterion("CLONED_FROM between", value1, value2, "clonedFrom");
            return (Criteria) this;
        }

        public Criteria andClonedFromNotBetween(Long value1, Long value2) {
            addCriterion("CLONED_FROM not between", value1, value2, "clonedFrom");
            return (Criteria) this;
        }

        public Criteria andAuditIsNull() {
            addCriterion("AUDIT is null");
            return (Criteria) this;
        }

        public Criteria andAuditIsNotNull() {
            addCriterion("AUDIT is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEqualTo(String value) {
            addCriterion("AUDIT =", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotEqualTo(String value) {
            addCriterion("AUDIT <>", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThan(String value) {
            addCriterion("AUDIT >", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT >=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThan(String value) {
            addCriterion("AUDIT <", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThanOrEqualTo(String value) {
            addCriterion("AUDIT <=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLike(String value) {
            addCriterion("AUDIT like", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotLike(String value) {
            addCriterion("AUDIT not like", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditIn(List<String> values) {
            addCriterion("AUDIT in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotIn(List<String> values) {
            addCriterion("AUDIT not in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditBetween(String value1, String value2) {
            addCriterion("AUDIT between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotBetween(String value1, String value2) {
            addCriterion("AUDIT not between", value1, value2, "audit");
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