package cn.besbing.model.entities.primary;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CProjLoginSampleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CProjLoginSampleExample() {
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

        public Criteria andSeqNumIsNull() {
            addCriterion("SEQ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSeqNumIsNotNull() {
            addCriterion("SEQ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNumEqualTo(BigDecimal value) {
            addCriterion("SEQ_NUM =", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotEqualTo(BigDecimal value) {
            addCriterion("SEQ_NUM <>", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThan(BigDecimal value) {
            addCriterion("SEQ_NUM >", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQ_NUM >=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThan(BigDecimal value) {
            addCriterion("SEQ_NUM <", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQ_NUM <=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumIn(List<BigDecimal> values) {
            addCriterion("SEQ_NUM in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotIn(List<BigDecimal> values) {
            addCriterion("SEQ_NUM not in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQ_NUM between", value1, value2, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andProductStandardIsNull() {
            addCriterion("PRODUCT_STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andProductStandardIsNotNull() {
            addCriterion("PRODUCT_STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andProductStandardEqualTo(String value) {
            addCriterion("PRODUCT_STANDARD =", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardNotEqualTo(String value) {
            addCriterion("PRODUCT_STANDARD <>", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardGreaterThan(String value) {
            addCriterion("PRODUCT_STANDARD >", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STANDARD >=", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardLessThan(String value) {
            addCriterion("PRODUCT_STANDARD <", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STANDARD <=", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardLike(String value) {
            addCriterion("PRODUCT_STANDARD like", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardNotLike(String value) {
            addCriterion("PRODUCT_STANDARD not like", value, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardIn(List<String> values) {
            addCriterion("PRODUCT_STANDARD in", values, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardNotIn(List<String> values) {
            addCriterion("PRODUCT_STANDARD not in", values, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardBetween(String value1, String value2) {
            addCriterion("PRODUCT_STANDARD between", value1, value2, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProductStandardNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_STANDARD not between", value1, value2, "productStandard");
            return (Criteria) this;
        }

        public Criteria andProdnameIsNull() {
            addCriterion("PRODNAME is null");
            return (Criteria) this;
        }

        public Criteria andProdnameIsNotNull() {
            addCriterion("PRODNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProdnameEqualTo(String value) {
            addCriterion("PRODNAME =", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotEqualTo(String value) {
            addCriterion("PRODNAME <>", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameGreaterThan(String value) {
            addCriterion("PRODNAME >", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODNAME >=", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameLessThan(String value) {
            addCriterion("PRODNAME <", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameLessThanOrEqualTo(String value) {
            addCriterion("PRODNAME <=", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameLike(String value) {
            addCriterion("PRODNAME like", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotLike(String value) {
            addCriterion("PRODNAME not like", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameIn(List<String> values) {
            addCriterion("PRODNAME in", values, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotIn(List<String> values) {
            addCriterion("PRODNAME not in", values, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameBetween(String value1, String value2) {
            addCriterion("PRODNAME between", value1, value2, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotBetween(String value1, String value2) {
            addCriterion("PRODNAME not between", value1, value2, "prodname");
            return (Criteria) this;
        }

        public Criteria andProductionSpecIsNull() {
            addCriterion("PRODUCTION_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andProductionSpecIsNotNull() {
            addCriterion("PRODUCTION_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andProductionSpecEqualTo(String value) {
            addCriterion("PRODUCTION_SPEC =", value, "productionSpec");
            return (Criteria) this;
        }

        public Criteria andProductionSpecNotEqualTo(String value) {
            addCriterion("PRODUCTION_SPEC <>", value, "productionSpec");
            return (Criteria) this;
        }

        public Criteria andProductionSpecGreaterThan(String value) {
            addCriterion("PRODUCTION_SPEC >", value, "productionSpec");
            return (Criteria) this;
        }

        public Criteria andProductionSpecGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTION_SPEC >=", value, "productionSpec");
            return (Criteria) this;
        }

        public Criteria andProductionSpecLessThan(String value) {
            addCriterion("PRODUCTION_SPEC <", value, "productionSpec");
            return (Criteria) this;
        }

        public Criteria andProductionSpecLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTION_SPEC <=", value, "productionSpec");
            return (Criteria) this;
        }

        public Criteria andProductionSpecLike(String value) {
            addCriterion("PRODUCTION_SPEC like", value, "productionSpec");
            return (Criteria) this;
        }

        public Criteria andProductionSpecNotLike(String value) {
            addCriterion("PRODUCTION_SPEC not like", value, "productionSpec");
            return (Criteria) this;
        }

        public Criteria andProductionSpecIn(List<String> values) {
            addCriterion("PRODUCTION_SPEC in", values, "productionSpec");
            return (Criteria) this;
        }

        public Criteria andProductionSpecNotIn(List<String> values) {
            addCriterion("PRODUCTION_SPEC not in", values, "productionSpec");
            return (Criteria) this;
        }

        public Criteria andProductionSpecBetween(String value1, String value2) {
            addCriterion("PRODUCTION_SPEC between", value1, value2, "productionSpec");
            return (Criteria) this;
        }

        public Criteria andProductionSpecNotBetween(String value1, String value2) {
            addCriterion("PRODUCTION_SPEC not between", value1, value2, "productionSpec");
            return (Criteria) this;
        }

        public Criteria andStructureTypeIsNull() {
            addCriterion("STRUCTURE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStructureTypeIsNotNull() {
            addCriterion("STRUCTURE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStructureTypeEqualTo(String value) {
            addCriterion("STRUCTURE_TYPE =", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeNotEqualTo(String value) {
            addCriterion("STRUCTURE_TYPE <>", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeGreaterThan(String value) {
            addCriterion("STRUCTURE_TYPE >", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeGreaterThanOrEqualTo(String value) {
            addCriterion("STRUCTURE_TYPE >=", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeLessThan(String value) {
            addCriterion("STRUCTURE_TYPE <", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeLessThanOrEqualTo(String value) {
            addCriterion("STRUCTURE_TYPE <=", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeLike(String value) {
            addCriterion("STRUCTURE_TYPE like", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeNotLike(String value) {
            addCriterion("STRUCTURE_TYPE not like", value, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeIn(List<String> values) {
            addCriterion("STRUCTURE_TYPE in", values, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeNotIn(List<String> values) {
            addCriterion("STRUCTURE_TYPE not in", values, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeBetween(String value1, String value2) {
            addCriterion("STRUCTURE_TYPE between", value1, value2, "structureType");
            return (Criteria) this;
        }

        public Criteria andStructureTypeNotBetween(String value1, String value2) {
            addCriterion("STRUCTURE_TYPE not between", value1, value2, "structureType");
            return (Criteria) this;
        }

        public Criteria andContactTypeIsNull() {
            addCriterion("CONTACT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContactTypeIsNotNull() {
            addCriterion("CONTACT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContactTypeEqualTo(String value) {
            addCriterion("CONTACT_TYPE =", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotEqualTo(String value) {
            addCriterion("CONTACT_TYPE <>", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeGreaterThan(String value) {
            addCriterion("CONTACT_TYPE >", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_TYPE >=", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLessThan(String value) {
            addCriterion("CONTACT_TYPE <", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_TYPE <=", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeLike(String value) {
            addCriterion("CONTACT_TYPE like", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotLike(String value) {
            addCriterion("CONTACT_TYPE not like", value, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeIn(List<String> values) {
            addCriterion("CONTACT_TYPE in", values, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotIn(List<String> values) {
            addCriterion("CONTACT_TYPE not in", values, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeBetween(String value1, String value2) {
            addCriterion("CONTACT_TYPE between", value1, value2, "contactType");
            return (Criteria) this;
        }

        public Criteria andContactTypeNotBetween(String value1, String value2) {
            addCriterion("CONTACT_TYPE not between", value1, value2, "contactType");
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

        public Criteria andSampleQuantityIsNull() {
            addCriterion("SAMPLE_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andSampleQuantityIsNotNull() {
            addCriterion("SAMPLE_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andSampleQuantityEqualTo(Long value) {
            addCriterion("SAMPLE_QUANTITY =", value, "sampleQuantity");
            return (Criteria) this;
        }

        public Criteria andSampleQuantityNotEqualTo(Long value) {
            addCriterion("SAMPLE_QUANTITY <>", value, "sampleQuantity");
            return (Criteria) this;
        }

        public Criteria andSampleQuantityGreaterThan(Long value) {
            addCriterion("SAMPLE_QUANTITY >", value, "sampleQuantity");
            return (Criteria) this;
        }

        public Criteria andSampleQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("SAMPLE_QUANTITY >=", value, "sampleQuantity");
            return (Criteria) this;
        }

        public Criteria andSampleQuantityLessThan(Long value) {
            addCriterion("SAMPLE_QUANTITY <", value, "sampleQuantity");
            return (Criteria) this;
        }

        public Criteria andSampleQuantityLessThanOrEqualTo(Long value) {
            addCriterion("SAMPLE_QUANTITY <=", value, "sampleQuantity");
            return (Criteria) this;
        }

        public Criteria andSampleQuantityIn(List<Long> values) {
            addCriterion("SAMPLE_QUANTITY in", values, "sampleQuantity");
            return (Criteria) this;
        }

        public Criteria andSampleQuantityNotIn(List<Long> values) {
            addCriterion("SAMPLE_QUANTITY not in", values, "sampleQuantity");
            return (Criteria) this;
        }

        public Criteria andSampleQuantityBetween(Long value1, Long value2) {
            addCriterion("SAMPLE_QUANTITY between", value1, value2, "sampleQuantity");
            return (Criteria) this;
        }

        public Criteria andSampleQuantityNotBetween(Long value1, Long value2) {
            addCriterion("SAMPLE_QUANTITY not between", value1, value2, "sampleQuantity");
            return (Criteria) this;
        }

        public Criteria andNeedListIsNull() {
            addCriterion("NEED_LIST is null");
            return (Criteria) this;
        }

        public Criteria andNeedListIsNotNull() {
            addCriterion("NEED_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andNeedListEqualTo(String value) {
            addCriterion("NEED_LIST =", value, "needList");
            return (Criteria) this;
        }

        public Criteria andNeedListNotEqualTo(String value) {
            addCriterion("NEED_LIST <>", value, "needList");
            return (Criteria) this;
        }

        public Criteria andNeedListGreaterThan(String value) {
            addCriterion("NEED_LIST >", value, "needList");
            return (Criteria) this;
        }

        public Criteria andNeedListGreaterThanOrEqualTo(String value) {
            addCriterion("NEED_LIST >=", value, "needList");
            return (Criteria) this;
        }

        public Criteria andNeedListLessThan(String value) {
            addCriterion("NEED_LIST <", value, "needList");
            return (Criteria) this;
        }

        public Criteria andNeedListLessThanOrEqualTo(String value) {
            addCriterion("NEED_LIST <=", value, "needList");
            return (Criteria) this;
        }

        public Criteria andNeedListLike(String value) {
            addCriterion("NEED_LIST like", value, "needList");
            return (Criteria) this;
        }

        public Criteria andNeedListNotLike(String value) {
            addCriterion("NEED_LIST not like", value, "needList");
            return (Criteria) this;
        }

        public Criteria andNeedListIn(List<String> values) {
            addCriterion("NEED_LIST in", values, "needList");
            return (Criteria) this;
        }

        public Criteria andNeedListNotIn(List<String> values) {
            addCriterion("NEED_LIST not in", values, "needList");
            return (Criteria) this;
        }

        public Criteria andNeedListBetween(String value1, String value2) {
            addCriterion("NEED_LIST between", value1, value2, "needList");
            return (Criteria) this;
        }

        public Criteria andNeedListNotBetween(String value1, String value2) {
            addCriterion("NEED_LIST not between", value1, value2, "needList");
            return (Criteria) this;
        }

        public Criteria andInsulationLevelIsNull() {
            addCriterion("INSULATION_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andInsulationLevelIsNotNull() {
            addCriterion("INSULATION_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andInsulationLevelEqualTo(String value) {
            addCriterion("INSULATION_LEVEL =", value, "insulationLevel");
            return (Criteria) this;
        }

        public Criteria andInsulationLevelNotEqualTo(String value) {
            addCriterion("INSULATION_LEVEL <>", value, "insulationLevel");
            return (Criteria) this;
        }

        public Criteria andInsulationLevelGreaterThan(String value) {
            addCriterion("INSULATION_LEVEL >", value, "insulationLevel");
            return (Criteria) this;
        }

        public Criteria andInsulationLevelGreaterThanOrEqualTo(String value) {
            addCriterion("INSULATION_LEVEL >=", value, "insulationLevel");
            return (Criteria) this;
        }

        public Criteria andInsulationLevelLessThan(String value) {
            addCriterion("INSULATION_LEVEL <", value, "insulationLevel");
            return (Criteria) this;
        }

        public Criteria andInsulationLevelLessThanOrEqualTo(String value) {
            addCriterion("INSULATION_LEVEL <=", value, "insulationLevel");
            return (Criteria) this;
        }

        public Criteria andInsulationLevelLike(String value) {
            addCriterion("INSULATION_LEVEL like", value, "insulationLevel");
            return (Criteria) this;
        }

        public Criteria andInsulationLevelNotLike(String value) {
            addCriterion("INSULATION_LEVEL not like", value, "insulationLevel");
            return (Criteria) this;
        }

        public Criteria andInsulationLevelIn(List<String> values) {
            addCriterion("INSULATION_LEVEL in", values, "insulationLevel");
            return (Criteria) this;
        }

        public Criteria andInsulationLevelNotIn(List<String> values) {
            addCriterion("INSULATION_LEVEL not in", values, "insulationLevel");
            return (Criteria) this;
        }

        public Criteria andInsulationLevelBetween(String value1, String value2) {
            addCriterion("INSULATION_LEVEL between", value1, value2, "insulationLevel");
            return (Criteria) this;
        }

        public Criteria andInsulationLevelNotBetween(String value1, String value2) {
            addCriterion("INSULATION_LEVEL not between", value1, value2, "insulationLevel");
            return (Criteria) this;
        }

        public Criteria andHasLoginedSampleIsNull() {
            addCriterion("HAS_LOGINED_SAMPLE is null");
            return (Criteria) this;
        }

        public Criteria andHasLoginedSampleIsNotNull() {
            addCriterion("HAS_LOGINED_SAMPLE is not null");
            return (Criteria) this;
        }

        public Criteria andHasLoginedSampleEqualTo(String value) {
            addCriterion("HAS_LOGINED_SAMPLE =", value, "hasLoginedSample");
            return (Criteria) this;
        }

        public Criteria andHasLoginedSampleNotEqualTo(String value) {
            addCriterion("HAS_LOGINED_SAMPLE <>", value, "hasLoginedSample");
            return (Criteria) this;
        }

        public Criteria andHasLoginedSampleGreaterThan(String value) {
            addCriterion("HAS_LOGINED_SAMPLE >", value, "hasLoginedSample");
            return (Criteria) this;
        }

        public Criteria andHasLoginedSampleGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_LOGINED_SAMPLE >=", value, "hasLoginedSample");
            return (Criteria) this;
        }

        public Criteria andHasLoginedSampleLessThan(String value) {
            addCriterion("HAS_LOGINED_SAMPLE <", value, "hasLoginedSample");
            return (Criteria) this;
        }

        public Criteria andHasLoginedSampleLessThanOrEqualTo(String value) {
            addCriterion("HAS_LOGINED_SAMPLE <=", value, "hasLoginedSample");
            return (Criteria) this;
        }

        public Criteria andHasLoginedSampleLike(String value) {
            addCriterion("HAS_LOGINED_SAMPLE like", value, "hasLoginedSample");
            return (Criteria) this;
        }

        public Criteria andHasLoginedSampleNotLike(String value) {
            addCriterion("HAS_LOGINED_SAMPLE not like", value, "hasLoginedSample");
            return (Criteria) this;
        }

        public Criteria andHasLoginedSampleIn(List<String> values) {
            addCriterion("HAS_LOGINED_SAMPLE in", values, "hasLoginedSample");
            return (Criteria) this;
        }

        public Criteria andHasLoginedSampleNotIn(List<String> values) {
            addCriterion("HAS_LOGINED_SAMPLE not in", values, "hasLoginedSample");
            return (Criteria) this;
        }

        public Criteria andHasLoginedSampleBetween(String value1, String value2) {
            addCriterion("HAS_LOGINED_SAMPLE between", value1, value2, "hasLoginedSample");
            return (Criteria) this;
        }

        public Criteria andHasLoginedSampleNotBetween(String value1, String value2) {
            addCriterion("HAS_LOGINED_SAMPLE not between", value1, value2, "hasLoginedSample");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("MANUFACTURER is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("MANUFACTURER is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("MANUFACTURER =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("MANUFACTURER <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("MANUFACTURER >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("MANUFACTURER <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("MANUFACTURER like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("MANUFACTURER not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("MANUFACTURER in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("MANUFACTURER not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("MANUFACTURER between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURER not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andOtherReqIsNull() {
            addCriterion("OTHER_REQ is null");
            return (Criteria) this;
        }

        public Criteria andOtherReqIsNotNull() {
            addCriterion("OTHER_REQ is not null");
            return (Criteria) this;
        }

        public Criteria andOtherReqEqualTo(String value) {
            addCriterion("OTHER_REQ =", value, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqNotEqualTo(String value) {
            addCriterion("OTHER_REQ <>", value, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqGreaterThan(String value) {
            addCriterion("OTHER_REQ >", value, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_REQ >=", value, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqLessThan(String value) {
            addCriterion("OTHER_REQ <", value, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqLessThanOrEqualTo(String value) {
            addCriterion("OTHER_REQ <=", value, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqLike(String value) {
            addCriterion("OTHER_REQ like", value, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqNotLike(String value) {
            addCriterion("OTHER_REQ not like", value, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqIn(List<String> values) {
            addCriterion("OTHER_REQ in", values, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqNotIn(List<String> values) {
            addCriterion("OTHER_REQ not in", values, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqBetween(String value1, String value2) {
            addCriterion("OTHER_REQ between", value1, value2, "otherReq");
            return (Criteria) this;
        }

        public Criteria andOtherReqNotBetween(String value1, String value2) {
            addCriterion("OTHER_REQ not between", value1, value2, "otherReq");
            return (Criteria) this;
        }

        public Criteria andProductStageIsNull() {
            addCriterion("PRODUCT_STAGE is null");
            return (Criteria) this;
        }

        public Criteria andProductStageIsNotNull() {
            addCriterion("PRODUCT_STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andProductStageEqualTo(String value) {
            addCriterion("PRODUCT_STAGE =", value, "productStage");
            return (Criteria) this;
        }

        public Criteria andProductStageNotEqualTo(String value) {
            addCriterion("PRODUCT_STAGE <>", value, "productStage");
            return (Criteria) this;
        }

        public Criteria andProductStageGreaterThan(String value) {
            addCriterion("PRODUCT_STAGE >", value, "productStage");
            return (Criteria) this;
        }

        public Criteria andProductStageGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STAGE >=", value, "productStage");
            return (Criteria) this;
        }

        public Criteria andProductStageLessThan(String value) {
            addCriterion("PRODUCT_STAGE <", value, "productStage");
            return (Criteria) this;
        }

        public Criteria andProductStageLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STAGE <=", value, "productStage");
            return (Criteria) this;
        }

        public Criteria andProductStageLike(String value) {
            addCriterion("PRODUCT_STAGE like", value, "productStage");
            return (Criteria) this;
        }

        public Criteria andProductStageNotLike(String value) {
            addCriterion("PRODUCT_STAGE not like", value, "productStage");
            return (Criteria) this;
        }

        public Criteria andProductStageIn(List<String> values) {
            addCriterion("PRODUCT_STAGE in", values, "productStage");
            return (Criteria) this;
        }

        public Criteria andProductStageNotIn(List<String> values) {
            addCriterion("PRODUCT_STAGE not in", values, "productStage");
            return (Criteria) this;
        }

        public Criteria andProductStageBetween(String value1, String value2) {
            addCriterion("PRODUCT_STAGE between", value1, value2, "productStage");
            return (Criteria) this;
        }

        public Criteria andProductStageNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_STAGE not between", value1, value2, "productStage");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIsNull() {
            addCriterion("PRODUCT_SERIES is null");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIsNotNull() {
            addCriterion("PRODUCT_SERIES is not null");
            return (Criteria) this;
        }

        public Criteria andProductSeriesEqualTo(String value) {
            addCriterion("PRODUCT_SERIES =", value, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesNotEqualTo(String value) {
            addCriterion("PRODUCT_SERIES <>", value, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesGreaterThan(String value) {
            addCriterion("PRODUCT_SERIES >", value, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SERIES >=", value, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesLessThan(String value) {
            addCriterion("PRODUCT_SERIES <", value, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SERIES <=", value, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesLike(String value) {
            addCriterion("PRODUCT_SERIES like", value, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesNotLike(String value) {
            addCriterion("PRODUCT_SERIES not like", value, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIn(List<String> values) {
            addCriterion("PRODUCT_SERIES in", values, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesNotIn(List<String> values) {
            addCriterion("PRODUCT_SERIES not in", values, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesBetween(String value1, String value2) {
            addCriterion("PRODUCT_SERIES between", value1, value2, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_SERIES not between", value1, value2, "productSeries");
            return (Criteria) this;
        }

        public Criteria andContactBrandIsNull() {
            addCriterion("CONTACT_BRAND is null");
            return (Criteria) this;
        }

        public Criteria andContactBrandIsNotNull() {
            addCriterion("CONTACT_BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andContactBrandEqualTo(String value) {
            addCriterion("CONTACT_BRAND =", value, "contactBrand");
            return (Criteria) this;
        }

        public Criteria andContactBrandNotEqualTo(String value) {
            addCriterion("CONTACT_BRAND <>", value, "contactBrand");
            return (Criteria) this;
        }

        public Criteria andContactBrandGreaterThan(String value) {
            addCriterion("CONTACT_BRAND >", value, "contactBrand");
            return (Criteria) this;
        }

        public Criteria andContactBrandGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_BRAND >=", value, "contactBrand");
            return (Criteria) this;
        }

        public Criteria andContactBrandLessThan(String value) {
            addCriterion("CONTACT_BRAND <", value, "contactBrand");
            return (Criteria) this;
        }

        public Criteria andContactBrandLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_BRAND <=", value, "contactBrand");
            return (Criteria) this;
        }

        public Criteria andContactBrandLike(String value) {
            addCriterion("CONTACT_BRAND like", value, "contactBrand");
            return (Criteria) this;
        }

        public Criteria andContactBrandNotLike(String value) {
            addCriterion("CONTACT_BRAND not like", value, "contactBrand");
            return (Criteria) this;
        }

        public Criteria andContactBrandIn(List<String> values) {
            addCriterion("CONTACT_BRAND in", values, "contactBrand");
            return (Criteria) this;
        }

        public Criteria andContactBrandNotIn(List<String> values) {
            addCriterion("CONTACT_BRAND not in", values, "contactBrand");
            return (Criteria) this;
        }

        public Criteria andContactBrandBetween(String value1, String value2) {
            addCriterion("CONTACT_BRAND between", value1, value2, "contactBrand");
            return (Criteria) this;
        }

        public Criteria andContactBrandNotBetween(String value1, String value2) {
            addCriterion("CONTACT_BRAND not between", value1, value2, "contactBrand");
            return (Criteria) this;
        }

        public Criteria andContactModelIsNull() {
            addCriterion("CONTACT_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andContactModelIsNotNull() {
            addCriterion("CONTACT_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andContactModelEqualTo(String value) {
            addCriterion("CONTACT_MODEL =", value, "contactModel");
            return (Criteria) this;
        }

        public Criteria andContactModelNotEqualTo(String value) {
            addCriterion("CONTACT_MODEL <>", value, "contactModel");
            return (Criteria) this;
        }

        public Criteria andContactModelGreaterThan(String value) {
            addCriterion("CONTACT_MODEL >", value, "contactModel");
            return (Criteria) this;
        }

        public Criteria andContactModelGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_MODEL >=", value, "contactModel");
            return (Criteria) this;
        }

        public Criteria andContactModelLessThan(String value) {
            addCriterion("CONTACT_MODEL <", value, "contactModel");
            return (Criteria) this;
        }

        public Criteria andContactModelLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_MODEL <=", value, "contactModel");
            return (Criteria) this;
        }

        public Criteria andContactModelLike(String value) {
            addCriterion("CONTACT_MODEL like", value, "contactModel");
            return (Criteria) this;
        }

        public Criteria andContactModelNotLike(String value) {
            addCriterion("CONTACT_MODEL not like", value, "contactModel");
            return (Criteria) this;
        }

        public Criteria andContactModelIn(List<String> values) {
            addCriterion("CONTACT_MODEL in", values, "contactModel");
            return (Criteria) this;
        }

        public Criteria andContactModelNotIn(List<String> values) {
            addCriterion("CONTACT_MODEL not in", values, "contactModel");
            return (Criteria) this;
        }

        public Criteria andContactModelBetween(String value1, String value2) {
            addCriterion("CONTACT_MODEL between", value1, value2, "contactModel");
            return (Criteria) this;
        }

        public Criteria andContactModelNotBetween(String value1, String value2) {
            addCriterion("CONTACT_MODEL not between", value1, value2, "contactModel");
            return (Criteria) this;
        }

        public Criteria andEnManufacturerIsNull() {
            addCriterion("EN_MANUFACTURER is null");
            return (Criteria) this;
        }

        public Criteria andEnManufacturerIsNotNull() {
            addCriterion("EN_MANUFACTURER is not null");
            return (Criteria) this;
        }

        public Criteria andEnManufacturerEqualTo(String value) {
            addCriterion("EN_MANUFACTURER =", value, "enManufacturer");
            return (Criteria) this;
        }

        public Criteria andEnManufacturerNotEqualTo(String value) {
            addCriterion("EN_MANUFACTURER <>", value, "enManufacturer");
            return (Criteria) this;
        }

        public Criteria andEnManufacturerGreaterThan(String value) {
            addCriterion("EN_MANUFACTURER >", value, "enManufacturer");
            return (Criteria) this;
        }

        public Criteria andEnManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("EN_MANUFACTURER >=", value, "enManufacturer");
            return (Criteria) this;
        }

        public Criteria andEnManufacturerLessThan(String value) {
            addCriterion("EN_MANUFACTURER <", value, "enManufacturer");
            return (Criteria) this;
        }

        public Criteria andEnManufacturerLessThanOrEqualTo(String value) {
            addCriterion("EN_MANUFACTURER <=", value, "enManufacturer");
            return (Criteria) this;
        }

        public Criteria andEnManufacturerLike(String value) {
            addCriterion("EN_MANUFACTURER like", value, "enManufacturer");
            return (Criteria) this;
        }

        public Criteria andEnManufacturerNotLike(String value) {
            addCriterion("EN_MANUFACTURER not like", value, "enManufacturer");
            return (Criteria) this;
        }

        public Criteria andEnManufacturerIn(List<String> values) {
            addCriterion("EN_MANUFACTURER in", values, "enManufacturer");
            return (Criteria) this;
        }

        public Criteria andEnManufacturerNotIn(List<String> values) {
            addCriterion("EN_MANUFACTURER not in", values, "enManufacturer");
            return (Criteria) this;
        }

        public Criteria andEnManufacturerBetween(String value1, String value2) {
            addCriterion("EN_MANUFACTURER between", value1, value2, "enManufacturer");
            return (Criteria) this;
        }

        public Criteria andEnManufacturerNotBetween(String value1, String value2) {
            addCriterion("EN_MANUFACTURER not between", value1, value2, "enManufacturer");
            return (Criteria) this;
        }

        public Criteria andEnOtherReqIsNull() {
            addCriterion("EN_OTHER_REQ is null");
            return (Criteria) this;
        }

        public Criteria andEnOtherReqIsNotNull() {
            addCriterion("EN_OTHER_REQ is not null");
            return (Criteria) this;
        }

        public Criteria andEnOtherReqEqualTo(String value) {
            addCriterion("EN_OTHER_REQ =", value, "enOtherReq");
            return (Criteria) this;
        }

        public Criteria andEnOtherReqNotEqualTo(String value) {
            addCriterion("EN_OTHER_REQ <>", value, "enOtherReq");
            return (Criteria) this;
        }

        public Criteria andEnOtherReqGreaterThan(String value) {
            addCriterion("EN_OTHER_REQ >", value, "enOtherReq");
            return (Criteria) this;
        }

        public Criteria andEnOtherReqGreaterThanOrEqualTo(String value) {
            addCriterion("EN_OTHER_REQ >=", value, "enOtherReq");
            return (Criteria) this;
        }

        public Criteria andEnOtherReqLessThan(String value) {
            addCriterion("EN_OTHER_REQ <", value, "enOtherReq");
            return (Criteria) this;
        }

        public Criteria andEnOtherReqLessThanOrEqualTo(String value) {
            addCriterion("EN_OTHER_REQ <=", value, "enOtherReq");
            return (Criteria) this;
        }

        public Criteria andEnOtherReqLike(String value) {
            addCriterion("EN_OTHER_REQ like", value, "enOtherReq");
            return (Criteria) this;
        }

        public Criteria andEnOtherReqNotLike(String value) {
            addCriterion("EN_OTHER_REQ not like", value, "enOtherReq");
            return (Criteria) this;
        }

        public Criteria andEnOtherReqIn(List<String> values) {
            addCriterion("EN_OTHER_REQ in", values, "enOtherReq");
            return (Criteria) this;
        }

        public Criteria andEnOtherReqNotIn(List<String> values) {
            addCriterion("EN_OTHER_REQ not in", values, "enOtherReq");
            return (Criteria) this;
        }

        public Criteria andEnOtherReqBetween(String value1, String value2) {
            addCriterion("EN_OTHER_REQ between", value1, value2, "enOtherReq");
            return (Criteria) this;
        }

        public Criteria andEnOtherReqNotBetween(String value1, String value2) {
            addCriterion("EN_OTHER_REQ not between", value1, value2, "enOtherReq");
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