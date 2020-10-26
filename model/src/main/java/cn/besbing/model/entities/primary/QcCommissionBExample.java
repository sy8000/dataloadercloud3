package cn.besbing.model.entities.primary;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QcCommissionBExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QcCommissionBExample() {
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

        public Criteria andPkCommissionBIsNull() {
            addCriterion("PK_COMMISSION_B is null");
            return (Criteria) this;
        }

        public Criteria andPkCommissionBIsNotNull() {
            addCriterion("PK_COMMISSION_B is not null");
            return (Criteria) this;
        }

        public Criteria andPkCommissionBEqualTo(String value) {
            addCriterion("PK_COMMISSION_B =", value, "pkCommissionB");
            return (Criteria) this;
        }

        public Criteria andPkCommissionBNotEqualTo(String value) {
            addCriterion("PK_COMMISSION_B <>", value, "pkCommissionB");
            return (Criteria) this;
        }

        public Criteria andPkCommissionBGreaterThan(String value) {
            addCriterion("PK_COMMISSION_B >", value, "pkCommissionB");
            return (Criteria) this;
        }

        public Criteria andPkCommissionBGreaterThanOrEqualTo(String value) {
            addCriterion("PK_COMMISSION_B >=", value, "pkCommissionB");
            return (Criteria) this;
        }

        public Criteria andPkCommissionBLessThan(String value) {
            addCriterion("PK_COMMISSION_B <", value, "pkCommissionB");
            return (Criteria) this;
        }

        public Criteria andPkCommissionBLessThanOrEqualTo(String value) {
            addCriterion("PK_COMMISSION_B <=", value, "pkCommissionB");
            return (Criteria) this;
        }

        public Criteria andPkCommissionBLike(String value) {
            addCriterion("PK_COMMISSION_B like", value, "pkCommissionB");
            return (Criteria) this;
        }

        public Criteria andPkCommissionBNotLike(String value) {
            addCriterion("PK_COMMISSION_B not like", value, "pkCommissionB");
            return (Criteria) this;
        }

        public Criteria andPkCommissionBIn(List<String> values) {
            addCriterion("PK_COMMISSION_B in", values, "pkCommissionB");
            return (Criteria) this;
        }

        public Criteria andPkCommissionBNotIn(List<String> values) {
            addCriterion("PK_COMMISSION_B not in", values, "pkCommissionB");
            return (Criteria) this;
        }

        public Criteria andPkCommissionBBetween(String value1, String value2) {
            addCriterion("PK_COMMISSION_B between", value1, value2, "pkCommissionB");
            return (Criteria) this;
        }

        public Criteria andPkCommissionBNotBetween(String value1, String value2) {
            addCriterion("PK_COMMISSION_B not between", value1, value2, "pkCommissionB");
            return (Criteria) this;
        }

        public Criteria andRownoIsNull() {
            addCriterion("ROWNO is null");
            return (Criteria) this;
        }

        public Criteria andRownoIsNotNull() {
            addCriterion("ROWNO is not null");
            return (Criteria) this;
        }

        public Criteria andRownoEqualTo(String value) {
            addCriterion("ROWNO =", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoNotEqualTo(String value) {
            addCriterion("ROWNO <>", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoGreaterThan(String value) {
            addCriterion("ROWNO >", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoGreaterThanOrEqualTo(String value) {
            addCriterion("ROWNO >=", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoLessThan(String value) {
            addCriterion("ROWNO <", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoLessThanOrEqualTo(String value) {
            addCriterion("ROWNO <=", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoLike(String value) {
            addCriterion("ROWNO like", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoNotLike(String value) {
            addCriterion("ROWNO not like", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoIn(List<String> values) {
            addCriterion("ROWNO in", values, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoNotIn(List<String> values) {
            addCriterion("ROWNO not in", values, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoBetween(String value1, String value2) {
            addCriterion("ROWNO between", value1, value2, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoNotBetween(String value1, String value2) {
            addCriterion("ROWNO not between", value1, value2, "rowno");
            return (Criteria) this;
        }

        public Criteria andUniqueidIsNull() {
            addCriterion("UNIQUEID is null");
            return (Criteria) this;
        }

        public Criteria andUniqueidIsNotNull() {
            addCriterion("UNIQUEID is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueidEqualTo(String value) {
            addCriterion("UNIQUEID =", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidNotEqualTo(String value) {
            addCriterion("UNIQUEID <>", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidGreaterThan(String value) {
            addCriterion("UNIQUEID >", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidGreaterThanOrEqualTo(String value) {
            addCriterion("UNIQUEID >=", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidLessThan(String value) {
            addCriterion("UNIQUEID <", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidLessThanOrEqualTo(String value) {
            addCriterion("UNIQUEID <=", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidLike(String value) {
            addCriterion("UNIQUEID like", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidNotLike(String value) {
            addCriterion("UNIQUEID not like", value, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidIn(List<String> values) {
            addCriterion("UNIQUEID in", values, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidNotIn(List<String> values) {
            addCriterion("UNIQUEID not in", values, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidBetween(String value1, String value2) {
            addCriterion("UNIQUEID between", value1, value2, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andUniqueidNotBetween(String value1, String value2) {
            addCriterion("UNIQUEID not between", value1, value2, "uniqueid");
            return (Criteria) this;
        }

        public Criteria andPkProductserialIsNull() {
            addCriterion("PK_PRODUCTSERIAL is null");
            return (Criteria) this;
        }

        public Criteria andPkProductserialIsNotNull() {
            addCriterion("PK_PRODUCTSERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andPkProductserialEqualTo(String value) {
            addCriterion("PK_PRODUCTSERIAL =", value, "pkProductserial");
            return (Criteria) this;
        }

        public Criteria andPkProductserialNotEqualTo(String value) {
            addCriterion("PK_PRODUCTSERIAL <>", value, "pkProductserial");
            return (Criteria) this;
        }

        public Criteria andPkProductserialGreaterThan(String value) {
            addCriterion("PK_PRODUCTSERIAL >", value, "pkProductserial");
            return (Criteria) this;
        }

        public Criteria andPkProductserialGreaterThanOrEqualTo(String value) {
            addCriterion("PK_PRODUCTSERIAL >=", value, "pkProductserial");
            return (Criteria) this;
        }

        public Criteria andPkProductserialLessThan(String value) {
            addCriterion("PK_PRODUCTSERIAL <", value, "pkProductserial");
            return (Criteria) this;
        }

        public Criteria andPkProductserialLessThanOrEqualTo(String value) {
            addCriterion("PK_PRODUCTSERIAL <=", value, "pkProductserial");
            return (Criteria) this;
        }

        public Criteria andPkProductserialLike(String value) {
            addCriterion("PK_PRODUCTSERIAL like", value, "pkProductserial");
            return (Criteria) this;
        }

        public Criteria andPkProductserialNotLike(String value) {
            addCriterion("PK_PRODUCTSERIAL not like", value, "pkProductserial");
            return (Criteria) this;
        }

        public Criteria andPkProductserialIn(List<String> values) {
            addCriterion("PK_PRODUCTSERIAL in", values, "pkProductserial");
            return (Criteria) this;
        }

        public Criteria andPkProductserialNotIn(List<String> values) {
            addCriterion("PK_PRODUCTSERIAL not in", values, "pkProductserial");
            return (Criteria) this;
        }

        public Criteria andPkProductserialBetween(String value1, String value2) {
            addCriterion("PK_PRODUCTSERIAL between", value1, value2, "pkProductserial");
            return (Criteria) this;
        }

        public Criteria andPkProductserialNotBetween(String value1, String value2) {
            addCriterion("PK_PRODUCTSERIAL not between", value1, value2, "pkProductserial");
            return (Criteria) this;
        }

        public Criteria andPkEnterprisestandardIsNull() {
            addCriterion("PK_ENTERPRISESTANDARD is null");
            return (Criteria) this;
        }

        public Criteria andPkEnterprisestandardIsNotNull() {
            addCriterion("PK_ENTERPRISESTANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andPkEnterprisestandardEqualTo(String value) {
            addCriterion("PK_ENTERPRISESTANDARD =", value, "pkEnterprisestandard");
            return (Criteria) this;
        }

        public Criteria andPkEnterprisestandardNotEqualTo(String value) {
            addCriterion("PK_ENTERPRISESTANDARD <>", value, "pkEnterprisestandard");
            return (Criteria) this;
        }

        public Criteria andPkEnterprisestandardGreaterThan(String value) {
            addCriterion("PK_ENTERPRISESTANDARD >", value, "pkEnterprisestandard");
            return (Criteria) this;
        }

        public Criteria andPkEnterprisestandardGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ENTERPRISESTANDARD >=", value, "pkEnterprisestandard");
            return (Criteria) this;
        }

        public Criteria andPkEnterprisestandardLessThan(String value) {
            addCriterion("PK_ENTERPRISESTANDARD <", value, "pkEnterprisestandard");
            return (Criteria) this;
        }

        public Criteria andPkEnterprisestandardLessThanOrEqualTo(String value) {
            addCriterion("PK_ENTERPRISESTANDARD <=", value, "pkEnterprisestandard");
            return (Criteria) this;
        }

        public Criteria andPkEnterprisestandardLike(String value) {
            addCriterion("PK_ENTERPRISESTANDARD like", value, "pkEnterprisestandard");
            return (Criteria) this;
        }

        public Criteria andPkEnterprisestandardNotLike(String value) {
            addCriterion("PK_ENTERPRISESTANDARD not like", value, "pkEnterprisestandard");
            return (Criteria) this;
        }

        public Criteria andPkEnterprisestandardIn(List<String> values) {
            addCriterion("PK_ENTERPRISESTANDARD in", values, "pkEnterprisestandard");
            return (Criteria) this;
        }

        public Criteria andPkEnterprisestandardNotIn(List<String> values) {
            addCriterion("PK_ENTERPRISESTANDARD not in", values, "pkEnterprisestandard");
            return (Criteria) this;
        }

        public Criteria andPkEnterprisestandardBetween(String value1, String value2) {
            addCriterion("PK_ENTERPRISESTANDARD between", value1, value2, "pkEnterprisestandard");
            return (Criteria) this;
        }

        public Criteria andPkEnterprisestandardNotBetween(String value1, String value2) {
            addCriterion("PK_ENTERPRISESTANDARD not between", value1, value2, "pkEnterprisestandard");
            return (Criteria) this;
        }

        public Criteria andTypenoIsNull() {
            addCriterion("TYPENO is null");
            return (Criteria) this;
        }

        public Criteria andTypenoIsNotNull() {
            addCriterion("TYPENO is not null");
            return (Criteria) this;
        }

        public Criteria andTypenoEqualTo(String value) {
            addCriterion("TYPENO =", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotEqualTo(String value) {
            addCriterion("TYPENO <>", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoGreaterThan(String value) {
            addCriterion("TYPENO >", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoGreaterThanOrEqualTo(String value) {
            addCriterion("TYPENO >=", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoLessThan(String value) {
            addCriterion("TYPENO <", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoLessThanOrEqualTo(String value) {
            addCriterion("TYPENO <=", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoLike(String value) {
            addCriterion("TYPENO like", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotLike(String value) {
            addCriterion("TYPENO not like", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoIn(List<String> values) {
            addCriterion("TYPENO in", values, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotIn(List<String> values) {
            addCriterion("TYPENO not in", values, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoBetween(String value1, String value2) {
            addCriterion("TYPENO between", value1, value2, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotBetween(String value1, String value2) {
            addCriterion("TYPENO not between", value1, value2, "typeno");
            return (Criteria) this;
        }

        public Criteria andPkProductspecIsNull() {
            addCriterion("PK_PRODUCTSPEC is null");
            return (Criteria) this;
        }

        public Criteria andPkProductspecIsNotNull() {
            addCriterion("PK_PRODUCTSPEC is not null");
            return (Criteria) this;
        }

        public Criteria andPkProductspecEqualTo(String value) {
            addCriterion("PK_PRODUCTSPEC =", value, "pkProductspec");
            return (Criteria) this;
        }

        public Criteria andPkProductspecNotEqualTo(String value) {
            addCriterion("PK_PRODUCTSPEC <>", value, "pkProductspec");
            return (Criteria) this;
        }

        public Criteria andPkProductspecGreaterThan(String value) {
            addCriterion("PK_PRODUCTSPEC >", value, "pkProductspec");
            return (Criteria) this;
        }

        public Criteria andPkProductspecGreaterThanOrEqualTo(String value) {
            addCriterion("PK_PRODUCTSPEC >=", value, "pkProductspec");
            return (Criteria) this;
        }

        public Criteria andPkProductspecLessThan(String value) {
            addCriterion("PK_PRODUCTSPEC <", value, "pkProductspec");
            return (Criteria) this;
        }

        public Criteria andPkProductspecLessThanOrEqualTo(String value) {
            addCriterion("PK_PRODUCTSPEC <=", value, "pkProductspec");
            return (Criteria) this;
        }

        public Criteria andPkProductspecLike(String value) {
            addCriterion("PK_PRODUCTSPEC like", value, "pkProductspec");
            return (Criteria) this;
        }

        public Criteria andPkProductspecNotLike(String value) {
            addCriterion("PK_PRODUCTSPEC not like", value, "pkProductspec");
            return (Criteria) this;
        }

        public Criteria andPkProductspecIn(List<String> values) {
            addCriterion("PK_PRODUCTSPEC in", values, "pkProductspec");
            return (Criteria) this;
        }

        public Criteria andPkProductspecNotIn(List<String> values) {
            addCriterion("PK_PRODUCTSPEC not in", values, "pkProductspec");
            return (Criteria) this;
        }

        public Criteria andPkProductspecBetween(String value1, String value2) {
            addCriterion("PK_PRODUCTSPEC between", value1, value2, "pkProductspec");
            return (Criteria) this;
        }

        public Criteria andPkProductspecNotBetween(String value1, String value2) {
            addCriterion("PK_PRODUCTSPEC not between", value1, value2, "pkProductspec");
            return (Criteria) this;
        }

        public Criteria andPkStructuretypeIsNull() {
            addCriterion("PK_STRUCTURETYPE is null");
            return (Criteria) this;
        }

        public Criteria andPkStructuretypeIsNotNull() {
            addCriterion("PK_STRUCTURETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPkStructuretypeEqualTo(String value) {
            addCriterion("PK_STRUCTURETYPE =", value, "pkStructuretype");
            return (Criteria) this;
        }

        public Criteria andPkStructuretypeNotEqualTo(String value) {
            addCriterion("PK_STRUCTURETYPE <>", value, "pkStructuretype");
            return (Criteria) this;
        }

        public Criteria andPkStructuretypeGreaterThan(String value) {
            addCriterion("PK_STRUCTURETYPE >", value, "pkStructuretype");
            return (Criteria) this;
        }

        public Criteria andPkStructuretypeGreaterThanOrEqualTo(String value) {
            addCriterion("PK_STRUCTURETYPE >=", value, "pkStructuretype");
            return (Criteria) this;
        }

        public Criteria andPkStructuretypeLessThan(String value) {
            addCriterion("PK_STRUCTURETYPE <", value, "pkStructuretype");
            return (Criteria) this;
        }

        public Criteria andPkStructuretypeLessThanOrEqualTo(String value) {
            addCriterion("PK_STRUCTURETYPE <=", value, "pkStructuretype");
            return (Criteria) this;
        }

        public Criteria andPkStructuretypeLike(String value) {
            addCriterion("PK_STRUCTURETYPE like", value, "pkStructuretype");
            return (Criteria) this;
        }

        public Criteria andPkStructuretypeNotLike(String value) {
            addCriterion("PK_STRUCTURETYPE not like", value, "pkStructuretype");
            return (Criteria) this;
        }

        public Criteria andPkStructuretypeIn(List<String> values) {
            addCriterion("PK_STRUCTURETYPE in", values, "pkStructuretype");
            return (Criteria) this;
        }

        public Criteria andPkStructuretypeNotIn(List<String> values) {
            addCriterion("PK_STRUCTURETYPE not in", values, "pkStructuretype");
            return (Criteria) this;
        }

        public Criteria andPkStructuretypeBetween(String value1, String value2) {
            addCriterion("PK_STRUCTURETYPE between", value1, value2, "pkStructuretype");
            return (Criteria) this;
        }

        public Criteria andPkStructuretypeNotBetween(String value1, String value2) {
            addCriterion("PK_STRUCTURETYPE not between", value1, value2, "pkStructuretype");
            return (Criteria) this;
        }

        public Criteria andContacttypeIsNull() {
            addCriterion("CONTACTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andContacttypeIsNotNull() {
            addCriterion("CONTACTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContacttypeEqualTo(String value) {
            addCriterion("CONTACTTYPE =", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeNotEqualTo(String value) {
            addCriterion("CONTACTTYPE <>", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeGreaterThan(String value) {
            addCriterion("CONTACTTYPE >", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTTYPE >=", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeLessThan(String value) {
            addCriterion("CONTACTTYPE <", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeLessThanOrEqualTo(String value) {
            addCriterion("CONTACTTYPE <=", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeLike(String value) {
            addCriterion("CONTACTTYPE like", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeNotLike(String value) {
            addCriterion("CONTACTTYPE not like", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeIn(List<String> values) {
            addCriterion("CONTACTTYPE in", values, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeNotIn(List<String> values) {
            addCriterion("CONTACTTYPE not in", values, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeBetween(String value1, String value2) {
            addCriterion("CONTACTTYPE between", value1, value2, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeNotBetween(String value1, String value2) {
            addCriterion("CONTACTTYPE not between", value1, value2, "contacttype");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(BigDecimal value) {
            addCriterion("QUANTITY =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(BigDecimal value) {
            addCriterion("QUANTITY <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(BigDecimal value) {
            addCriterion("QUANTITY >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(BigDecimal value) {
            addCriterion("QUANTITY <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<BigDecimal> values) {
            addCriterion("QUANTITY in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<BigDecimal> values) {
            addCriterion("QUANTITY not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY not between", value1, value2, "quantity");
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

        public Criteria andPkContactbrandIsNull() {
            addCriterion("PK_CONTACTBRAND is null");
            return (Criteria) this;
        }

        public Criteria andPkContactbrandIsNotNull() {
            addCriterion("PK_CONTACTBRAND is not null");
            return (Criteria) this;
        }

        public Criteria andPkContactbrandEqualTo(String value) {
            addCriterion("PK_CONTACTBRAND =", value, "pkContactbrand");
            return (Criteria) this;
        }

        public Criteria andPkContactbrandNotEqualTo(String value) {
            addCriterion("PK_CONTACTBRAND <>", value, "pkContactbrand");
            return (Criteria) this;
        }

        public Criteria andPkContactbrandGreaterThan(String value) {
            addCriterion("PK_CONTACTBRAND >", value, "pkContactbrand");
            return (Criteria) this;
        }

        public Criteria andPkContactbrandGreaterThanOrEqualTo(String value) {
            addCriterion("PK_CONTACTBRAND >=", value, "pkContactbrand");
            return (Criteria) this;
        }

        public Criteria andPkContactbrandLessThan(String value) {
            addCriterion("PK_CONTACTBRAND <", value, "pkContactbrand");
            return (Criteria) this;
        }

        public Criteria andPkContactbrandLessThanOrEqualTo(String value) {
            addCriterion("PK_CONTACTBRAND <=", value, "pkContactbrand");
            return (Criteria) this;
        }

        public Criteria andPkContactbrandLike(String value) {
            addCriterion("PK_CONTACTBRAND like", value, "pkContactbrand");
            return (Criteria) this;
        }

        public Criteria andPkContactbrandNotLike(String value) {
            addCriterion("PK_CONTACTBRAND not like", value, "pkContactbrand");
            return (Criteria) this;
        }

        public Criteria andPkContactbrandIn(List<String> values) {
            addCriterion("PK_CONTACTBRAND in", values, "pkContactbrand");
            return (Criteria) this;
        }

        public Criteria andPkContactbrandNotIn(List<String> values) {
            addCriterion("PK_CONTACTBRAND not in", values, "pkContactbrand");
            return (Criteria) this;
        }

        public Criteria andPkContactbrandBetween(String value1, String value2) {
            addCriterion("PK_CONTACTBRAND between", value1, value2, "pkContactbrand");
            return (Criteria) this;
        }

        public Criteria andPkContactbrandNotBetween(String value1, String value2) {
            addCriterion("PK_CONTACTBRAND not between", value1, value2, "pkContactbrand");
            return (Criteria) this;
        }

        public Criteria andContactmodelIsNull() {
            addCriterion("CONTACTMODEL is null");
            return (Criteria) this;
        }

        public Criteria andContactmodelIsNotNull() {
            addCriterion("CONTACTMODEL is not null");
            return (Criteria) this;
        }

        public Criteria andContactmodelEqualTo(String value) {
            addCriterion("CONTACTMODEL =", value, "contactmodel");
            return (Criteria) this;
        }

        public Criteria andContactmodelNotEqualTo(String value) {
            addCriterion("CONTACTMODEL <>", value, "contactmodel");
            return (Criteria) this;
        }

        public Criteria andContactmodelGreaterThan(String value) {
            addCriterion("CONTACTMODEL >", value, "contactmodel");
            return (Criteria) this;
        }

        public Criteria andContactmodelGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTMODEL >=", value, "contactmodel");
            return (Criteria) this;
        }

        public Criteria andContactmodelLessThan(String value) {
            addCriterion("CONTACTMODEL <", value, "contactmodel");
            return (Criteria) this;
        }

        public Criteria andContactmodelLessThanOrEqualTo(String value) {
            addCriterion("CONTACTMODEL <=", value, "contactmodel");
            return (Criteria) this;
        }

        public Criteria andContactmodelLike(String value) {
            addCriterion("CONTACTMODEL like", value, "contactmodel");
            return (Criteria) this;
        }

        public Criteria andContactmodelNotLike(String value) {
            addCriterion("CONTACTMODEL not like", value, "contactmodel");
            return (Criteria) this;
        }

        public Criteria andContactmodelIn(List<String> values) {
            addCriterion("CONTACTMODEL in", values, "contactmodel");
            return (Criteria) this;
        }

        public Criteria andContactmodelNotIn(List<String> values) {
            addCriterion("CONTACTMODEL not in", values, "contactmodel");
            return (Criteria) this;
        }

        public Criteria andContactmodelBetween(String value1, String value2) {
            addCriterion("CONTACTMODEL between", value1, value2, "contactmodel");
            return (Criteria) this;
        }

        public Criteria andContactmodelNotBetween(String value1, String value2) {
            addCriterion("CONTACTMODEL not between", value1, value2, "contactmodel");
            return (Criteria) this;
        }

        public Criteria andProductstageIsNull() {
            addCriterion("PRODUCTSTAGE is null");
            return (Criteria) this;
        }

        public Criteria andProductstageIsNotNull() {
            addCriterion("PRODUCTSTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andProductstageEqualTo(String value) {
            addCriterion("PRODUCTSTAGE =", value, "productstage");
            return (Criteria) this;
        }

        public Criteria andProductstageNotEqualTo(String value) {
            addCriterion("PRODUCTSTAGE <>", value, "productstage");
            return (Criteria) this;
        }

        public Criteria andProductstageGreaterThan(String value) {
            addCriterion("PRODUCTSTAGE >", value, "productstage");
            return (Criteria) this;
        }

        public Criteria andProductstageGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTSTAGE >=", value, "productstage");
            return (Criteria) this;
        }

        public Criteria andProductstageLessThan(String value) {
            addCriterion("PRODUCTSTAGE <", value, "productstage");
            return (Criteria) this;
        }

        public Criteria andProductstageLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTSTAGE <=", value, "productstage");
            return (Criteria) this;
        }

        public Criteria andProductstageLike(String value) {
            addCriterion("PRODUCTSTAGE like", value, "productstage");
            return (Criteria) this;
        }

        public Criteria andProductstageNotLike(String value) {
            addCriterion("PRODUCTSTAGE not like", value, "productstage");
            return (Criteria) this;
        }

        public Criteria andProductstageIn(List<String> values) {
            addCriterion("PRODUCTSTAGE in", values, "productstage");
            return (Criteria) this;
        }

        public Criteria andProductstageNotIn(List<String> values) {
            addCriterion("PRODUCTSTAGE not in", values, "productstage");
            return (Criteria) this;
        }

        public Criteria andProductstageBetween(String value1, String value2) {
            addCriterion("PRODUCTSTAGE between", value1, value2, "productstage");
            return (Criteria) this;
        }

        public Criteria andProductstageNotBetween(String value1, String value2) {
            addCriterion("PRODUCTSTAGE not between", value1, value2, "productstage");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupIsNull() {
            addCriterion("PK_SAMPLEGROUP is null");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupIsNotNull() {
            addCriterion("PK_SAMPLEGROUP is not null");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupEqualTo(String value) {
            addCriterion("PK_SAMPLEGROUP =", value, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupNotEqualTo(String value) {
            addCriterion("PK_SAMPLEGROUP <>", value, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupGreaterThan(String value) {
            addCriterion("PK_SAMPLEGROUP >", value, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupGreaterThanOrEqualTo(String value) {
            addCriterion("PK_SAMPLEGROUP >=", value, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupLessThan(String value) {
            addCriterion("PK_SAMPLEGROUP <", value, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupLessThanOrEqualTo(String value) {
            addCriterion("PK_SAMPLEGROUP <=", value, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupLike(String value) {
            addCriterion("PK_SAMPLEGROUP like", value, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupNotLike(String value) {
            addCriterion("PK_SAMPLEGROUP not like", value, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupIn(List<String> values) {
            addCriterion("PK_SAMPLEGROUP in", values, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupNotIn(List<String> values) {
            addCriterion("PK_SAMPLEGROUP not in", values, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupBetween(String value1, String value2) {
            addCriterion("PK_SAMPLEGROUP between", value1, value2, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupNotBetween(String value1, String value2) {
            addCriterion("PK_SAMPLEGROUP not between", value1, value2, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andAnalysisrefIsNull() {
            addCriterion("ANALYSISREF is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisrefIsNotNull() {
            addCriterion("ANALYSISREF is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisrefEqualTo(String value) {
            addCriterion("ANALYSISREF =", value, "analysisref");
            return (Criteria) this;
        }

        public Criteria andAnalysisrefNotEqualTo(String value) {
            addCriterion("ANALYSISREF <>", value, "analysisref");
            return (Criteria) this;
        }

        public Criteria andAnalysisrefGreaterThan(String value) {
            addCriterion("ANALYSISREF >", value, "analysisref");
            return (Criteria) this;
        }

        public Criteria andAnalysisrefGreaterThanOrEqualTo(String value) {
            addCriterion("ANALYSISREF >=", value, "analysisref");
            return (Criteria) this;
        }

        public Criteria andAnalysisrefLessThan(String value) {
            addCriterion("ANALYSISREF <", value, "analysisref");
            return (Criteria) this;
        }

        public Criteria andAnalysisrefLessThanOrEqualTo(String value) {
            addCriterion("ANALYSISREF <=", value, "analysisref");
            return (Criteria) this;
        }

        public Criteria andAnalysisrefLike(String value) {
            addCriterion("ANALYSISREF like", value, "analysisref");
            return (Criteria) this;
        }

        public Criteria andAnalysisrefNotLike(String value) {
            addCriterion("ANALYSISREF not like", value, "analysisref");
            return (Criteria) this;
        }

        public Criteria andAnalysisrefIn(List<String> values) {
            addCriterion("ANALYSISREF in", values, "analysisref");
            return (Criteria) this;
        }

        public Criteria andAnalysisrefNotIn(List<String> values) {
            addCriterion("ANALYSISREF not in", values, "analysisref");
            return (Criteria) this;
        }

        public Criteria andAnalysisrefBetween(String value1, String value2) {
            addCriterion("ANALYSISREF between", value1, value2, "analysisref");
            return (Criteria) this;
        }

        public Criteria andAnalysisrefNotBetween(String value1, String value2) {
            addCriterion("ANALYSISREF not between", value1, value2, "analysisref");
            return (Criteria) this;
        }

        public Criteria andOtherinfoIsNull() {
            addCriterion("OTHERINFO is null");
            return (Criteria) this;
        }

        public Criteria andOtherinfoIsNotNull() {
            addCriterion("OTHERINFO is not null");
            return (Criteria) this;
        }

        public Criteria andOtherinfoEqualTo(String value) {
            addCriterion("OTHERINFO =", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoNotEqualTo(String value) {
            addCriterion("OTHERINFO <>", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoGreaterThan(String value) {
            addCriterion("OTHERINFO >", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERINFO >=", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoLessThan(String value) {
            addCriterion("OTHERINFO <", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoLessThanOrEqualTo(String value) {
            addCriterion("OTHERINFO <=", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoLike(String value) {
            addCriterion("OTHERINFO like", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoNotLike(String value) {
            addCriterion("OTHERINFO not like", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoIn(List<String> values) {
            addCriterion("OTHERINFO in", values, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoNotIn(List<String> values) {
            addCriterion("OTHERINFO not in", values, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoBetween(String value1, String value2) {
            addCriterion("OTHERINFO between", value1, value2, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoNotBetween(String value1, String value2) {
            addCriterion("OTHERINFO not between", value1, value2, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andDef1IsNull() {
            addCriterion("DEF1 is null");
            return (Criteria) this;
        }

        public Criteria andDef1IsNotNull() {
            addCriterion("DEF1 is not null");
            return (Criteria) this;
        }

        public Criteria andDef1EqualTo(String value) {
            addCriterion("DEF1 =", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotEqualTo(String value) {
            addCriterion("DEF1 <>", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThan(String value) {
            addCriterion("DEF1 >", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThanOrEqualTo(String value) {
            addCriterion("DEF1 >=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThan(String value) {
            addCriterion("DEF1 <", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThanOrEqualTo(String value) {
            addCriterion("DEF1 <=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Like(String value) {
            addCriterion("DEF1 like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotLike(String value) {
            addCriterion("DEF1 not like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1In(List<String> values) {
            addCriterion("DEF1 in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotIn(List<String> values) {
            addCriterion("DEF1 not in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Between(String value1, String value2) {
            addCriterion("DEF1 between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotBetween(String value1, String value2) {
            addCriterion("DEF1 not between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef2IsNull() {
            addCriterion("DEF2 is null");
            return (Criteria) this;
        }

        public Criteria andDef2IsNotNull() {
            addCriterion("DEF2 is not null");
            return (Criteria) this;
        }

        public Criteria andDef2EqualTo(String value) {
            addCriterion("DEF2 =", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotEqualTo(String value) {
            addCriterion("DEF2 <>", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThan(String value) {
            addCriterion("DEF2 >", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThanOrEqualTo(String value) {
            addCriterion("DEF2 >=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThan(String value) {
            addCriterion("DEF2 <", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThanOrEqualTo(String value) {
            addCriterion("DEF2 <=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Like(String value) {
            addCriterion("DEF2 like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotLike(String value) {
            addCriterion("DEF2 not like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2In(List<String> values) {
            addCriterion("DEF2 in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotIn(List<String> values) {
            addCriterion("DEF2 not in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Between(String value1, String value2) {
            addCriterion("DEF2 between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotBetween(String value1, String value2) {
            addCriterion("DEF2 not between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef3IsNull() {
            addCriterion("DEF3 is null");
            return (Criteria) this;
        }

        public Criteria andDef3IsNotNull() {
            addCriterion("DEF3 is not null");
            return (Criteria) this;
        }

        public Criteria andDef3EqualTo(String value) {
            addCriterion("DEF3 =", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotEqualTo(String value) {
            addCriterion("DEF3 <>", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThan(String value) {
            addCriterion("DEF3 >", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThanOrEqualTo(String value) {
            addCriterion("DEF3 >=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThan(String value) {
            addCriterion("DEF3 <", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThanOrEqualTo(String value) {
            addCriterion("DEF3 <=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Like(String value) {
            addCriterion("DEF3 like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotLike(String value) {
            addCriterion("DEF3 not like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3In(List<String> values) {
            addCriterion("DEF3 in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotIn(List<String> values) {
            addCriterion("DEF3 not in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Between(String value1, String value2) {
            addCriterion("DEF3 between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotBetween(String value1, String value2) {
            addCriterion("DEF3 not between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef4IsNull() {
            addCriterion("DEF4 is null");
            return (Criteria) this;
        }

        public Criteria andDef4IsNotNull() {
            addCriterion("DEF4 is not null");
            return (Criteria) this;
        }

        public Criteria andDef4EqualTo(String value) {
            addCriterion("DEF4 =", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotEqualTo(String value) {
            addCriterion("DEF4 <>", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThan(String value) {
            addCriterion("DEF4 >", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThanOrEqualTo(String value) {
            addCriterion("DEF4 >=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThan(String value) {
            addCriterion("DEF4 <", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThanOrEqualTo(String value) {
            addCriterion("DEF4 <=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Like(String value) {
            addCriterion("DEF4 like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotLike(String value) {
            addCriterion("DEF4 not like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4In(List<String> values) {
            addCriterion("DEF4 in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotIn(List<String> values) {
            addCriterion("DEF4 not in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Between(String value1, String value2) {
            addCriterion("DEF4 between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotBetween(String value1, String value2) {
            addCriterion("DEF4 not between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef5IsNull() {
            addCriterion("DEF5 is null");
            return (Criteria) this;
        }

        public Criteria andDef5IsNotNull() {
            addCriterion("DEF5 is not null");
            return (Criteria) this;
        }

        public Criteria andDef5EqualTo(String value) {
            addCriterion("DEF5 =", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotEqualTo(String value) {
            addCriterion("DEF5 <>", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThan(String value) {
            addCriterion("DEF5 >", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThanOrEqualTo(String value) {
            addCriterion("DEF5 >=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThan(String value) {
            addCriterion("DEF5 <", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThanOrEqualTo(String value) {
            addCriterion("DEF5 <=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5Like(String value) {
            addCriterion("DEF5 like", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotLike(String value) {
            addCriterion("DEF5 not like", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5In(List<String> values) {
            addCriterion("DEF5 in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotIn(List<String> values) {
            addCriterion("DEF5 not in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5Between(String value1, String value2) {
            addCriterion("DEF5 between", value1, value2, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotBetween(String value1, String value2) {
            addCriterion("DEF5 not between", value1, value2, "def5");
            return (Criteria) this;
        }

        public Criteria andDef6IsNull() {
            addCriterion("DEF6 is null");
            return (Criteria) this;
        }

        public Criteria andDef6IsNotNull() {
            addCriterion("DEF6 is not null");
            return (Criteria) this;
        }

        public Criteria andDef6EqualTo(String value) {
            addCriterion("DEF6 =", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotEqualTo(String value) {
            addCriterion("DEF6 <>", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6GreaterThan(String value) {
            addCriterion("DEF6 >", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6GreaterThanOrEqualTo(String value) {
            addCriterion("DEF6 >=", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6LessThan(String value) {
            addCriterion("DEF6 <", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6LessThanOrEqualTo(String value) {
            addCriterion("DEF6 <=", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6Like(String value) {
            addCriterion("DEF6 like", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotLike(String value) {
            addCriterion("DEF6 not like", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6In(List<String> values) {
            addCriterion("DEF6 in", values, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotIn(List<String> values) {
            addCriterion("DEF6 not in", values, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6Between(String value1, String value2) {
            addCriterion("DEF6 between", value1, value2, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotBetween(String value1, String value2) {
            addCriterion("DEF6 not between", value1, value2, "def6");
            return (Criteria) this;
        }

        public Criteria andDef7IsNull() {
            addCriterion("DEF7 is null");
            return (Criteria) this;
        }

        public Criteria andDef7IsNotNull() {
            addCriterion("DEF7 is not null");
            return (Criteria) this;
        }

        public Criteria andDef7EqualTo(String value) {
            addCriterion("DEF7 =", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotEqualTo(String value) {
            addCriterion("DEF7 <>", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7GreaterThan(String value) {
            addCriterion("DEF7 >", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7GreaterThanOrEqualTo(String value) {
            addCriterion("DEF7 >=", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7LessThan(String value) {
            addCriterion("DEF7 <", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7LessThanOrEqualTo(String value) {
            addCriterion("DEF7 <=", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7Like(String value) {
            addCriterion("DEF7 like", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotLike(String value) {
            addCriterion("DEF7 not like", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7In(List<String> values) {
            addCriterion("DEF7 in", values, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotIn(List<String> values) {
            addCriterion("DEF7 not in", values, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7Between(String value1, String value2) {
            addCriterion("DEF7 between", value1, value2, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotBetween(String value1, String value2) {
            addCriterion("DEF7 not between", value1, value2, "def7");
            return (Criteria) this;
        }

        public Criteria andDef8IsNull() {
            addCriterion("DEF8 is null");
            return (Criteria) this;
        }

        public Criteria andDef8IsNotNull() {
            addCriterion("DEF8 is not null");
            return (Criteria) this;
        }

        public Criteria andDef8EqualTo(String value) {
            addCriterion("DEF8 =", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotEqualTo(String value) {
            addCriterion("DEF8 <>", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8GreaterThan(String value) {
            addCriterion("DEF8 >", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8GreaterThanOrEqualTo(String value) {
            addCriterion("DEF8 >=", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8LessThan(String value) {
            addCriterion("DEF8 <", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8LessThanOrEqualTo(String value) {
            addCriterion("DEF8 <=", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8Like(String value) {
            addCriterion("DEF8 like", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotLike(String value) {
            addCriterion("DEF8 not like", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8In(List<String> values) {
            addCriterion("DEF8 in", values, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotIn(List<String> values) {
            addCriterion("DEF8 not in", values, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8Between(String value1, String value2) {
            addCriterion("DEF8 between", value1, value2, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotBetween(String value1, String value2) {
            addCriterion("DEF8 not between", value1, value2, "def8");
            return (Criteria) this;
        }

        public Criteria andDef9IsNull() {
            addCriterion("DEF9 is null");
            return (Criteria) this;
        }

        public Criteria andDef9IsNotNull() {
            addCriterion("DEF9 is not null");
            return (Criteria) this;
        }

        public Criteria andDef9EqualTo(String value) {
            addCriterion("DEF9 =", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotEqualTo(String value) {
            addCriterion("DEF9 <>", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9GreaterThan(String value) {
            addCriterion("DEF9 >", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9GreaterThanOrEqualTo(String value) {
            addCriterion("DEF9 >=", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9LessThan(String value) {
            addCriterion("DEF9 <", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9LessThanOrEqualTo(String value) {
            addCriterion("DEF9 <=", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9Like(String value) {
            addCriterion("DEF9 like", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotLike(String value) {
            addCriterion("DEF9 not like", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9In(List<String> values) {
            addCriterion("DEF9 in", values, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotIn(List<String> values) {
            addCriterion("DEF9 not in", values, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9Between(String value1, String value2) {
            addCriterion("DEF9 between", value1, value2, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotBetween(String value1, String value2) {
            addCriterion("DEF9 not between", value1, value2, "def9");
            return (Criteria) this;
        }

        public Criteria andDef10IsNull() {
            addCriterion("DEF10 is null");
            return (Criteria) this;
        }

        public Criteria andDef10IsNotNull() {
            addCriterion("DEF10 is not null");
            return (Criteria) this;
        }

        public Criteria andDef10EqualTo(String value) {
            addCriterion("DEF10 =", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotEqualTo(String value) {
            addCriterion("DEF10 <>", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10GreaterThan(String value) {
            addCriterion("DEF10 >", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10GreaterThanOrEqualTo(String value) {
            addCriterion("DEF10 >=", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10LessThan(String value) {
            addCriterion("DEF10 <", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10LessThanOrEqualTo(String value) {
            addCriterion("DEF10 <=", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10Like(String value) {
            addCriterion("DEF10 like", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotLike(String value) {
            addCriterion("DEF10 not like", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10In(List<String> values) {
            addCriterion("DEF10 in", values, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotIn(List<String> values) {
            addCriterion("DEF10 not in", values, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10Between(String value1, String value2) {
            addCriterion("DEF10 between", value1, value2, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotBetween(String value1, String value2) {
            addCriterion("DEF10 not between", value1, value2, "def10");
            return (Criteria) this;
        }

        public Criteria andDef11IsNull() {
            addCriterion("DEF11 is null");
            return (Criteria) this;
        }

        public Criteria andDef11IsNotNull() {
            addCriterion("DEF11 is not null");
            return (Criteria) this;
        }

        public Criteria andDef11EqualTo(String value) {
            addCriterion("DEF11 =", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11NotEqualTo(String value) {
            addCriterion("DEF11 <>", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11GreaterThan(String value) {
            addCriterion("DEF11 >", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11GreaterThanOrEqualTo(String value) {
            addCriterion("DEF11 >=", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11LessThan(String value) {
            addCriterion("DEF11 <", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11LessThanOrEqualTo(String value) {
            addCriterion("DEF11 <=", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11Like(String value) {
            addCriterion("DEF11 like", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11NotLike(String value) {
            addCriterion("DEF11 not like", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11In(List<String> values) {
            addCriterion("DEF11 in", values, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11NotIn(List<String> values) {
            addCriterion("DEF11 not in", values, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11Between(String value1, String value2) {
            addCriterion("DEF11 between", value1, value2, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11NotBetween(String value1, String value2) {
            addCriterion("DEF11 not between", value1, value2, "def11");
            return (Criteria) this;
        }

        public Criteria andDef12IsNull() {
            addCriterion("DEF12 is null");
            return (Criteria) this;
        }

        public Criteria andDef12IsNotNull() {
            addCriterion("DEF12 is not null");
            return (Criteria) this;
        }

        public Criteria andDef12EqualTo(String value) {
            addCriterion("DEF12 =", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12NotEqualTo(String value) {
            addCriterion("DEF12 <>", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12GreaterThan(String value) {
            addCriterion("DEF12 >", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12GreaterThanOrEqualTo(String value) {
            addCriterion("DEF12 >=", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12LessThan(String value) {
            addCriterion("DEF12 <", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12LessThanOrEqualTo(String value) {
            addCriterion("DEF12 <=", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12Like(String value) {
            addCriterion("DEF12 like", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12NotLike(String value) {
            addCriterion("DEF12 not like", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12In(List<String> values) {
            addCriterion("DEF12 in", values, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12NotIn(List<String> values) {
            addCriterion("DEF12 not in", values, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12Between(String value1, String value2) {
            addCriterion("DEF12 between", value1, value2, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12NotBetween(String value1, String value2) {
            addCriterion("DEF12 not between", value1, value2, "def12");
            return (Criteria) this;
        }

        public Criteria andDef13IsNull() {
            addCriterion("DEF13 is null");
            return (Criteria) this;
        }

        public Criteria andDef13IsNotNull() {
            addCriterion("DEF13 is not null");
            return (Criteria) this;
        }

        public Criteria andDef13EqualTo(String value) {
            addCriterion("DEF13 =", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13NotEqualTo(String value) {
            addCriterion("DEF13 <>", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13GreaterThan(String value) {
            addCriterion("DEF13 >", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13GreaterThanOrEqualTo(String value) {
            addCriterion("DEF13 >=", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13LessThan(String value) {
            addCriterion("DEF13 <", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13LessThanOrEqualTo(String value) {
            addCriterion("DEF13 <=", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13Like(String value) {
            addCriterion("DEF13 like", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13NotLike(String value) {
            addCriterion("DEF13 not like", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13In(List<String> values) {
            addCriterion("DEF13 in", values, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13NotIn(List<String> values) {
            addCriterion("DEF13 not in", values, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13Between(String value1, String value2) {
            addCriterion("DEF13 between", value1, value2, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13NotBetween(String value1, String value2) {
            addCriterion("DEF13 not between", value1, value2, "def13");
            return (Criteria) this;
        }

        public Criteria andDef14IsNull() {
            addCriterion("DEF14 is null");
            return (Criteria) this;
        }

        public Criteria andDef14IsNotNull() {
            addCriterion("DEF14 is not null");
            return (Criteria) this;
        }

        public Criteria andDef14EqualTo(String value) {
            addCriterion("DEF14 =", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14NotEqualTo(String value) {
            addCriterion("DEF14 <>", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14GreaterThan(String value) {
            addCriterion("DEF14 >", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14GreaterThanOrEqualTo(String value) {
            addCriterion("DEF14 >=", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14LessThan(String value) {
            addCriterion("DEF14 <", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14LessThanOrEqualTo(String value) {
            addCriterion("DEF14 <=", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14Like(String value) {
            addCriterion("DEF14 like", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14NotLike(String value) {
            addCriterion("DEF14 not like", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14In(List<String> values) {
            addCriterion("DEF14 in", values, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14NotIn(List<String> values) {
            addCriterion("DEF14 not in", values, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14Between(String value1, String value2) {
            addCriterion("DEF14 between", value1, value2, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14NotBetween(String value1, String value2) {
            addCriterion("DEF14 not between", value1, value2, "def14");
            return (Criteria) this;
        }

        public Criteria andDef15IsNull() {
            addCriterion("DEF15 is null");
            return (Criteria) this;
        }

        public Criteria andDef15IsNotNull() {
            addCriterion("DEF15 is not null");
            return (Criteria) this;
        }

        public Criteria andDef15EqualTo(String value) {
            addCriterion("DEF15 =", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15NotEqualTo(String value) {
            addCriterion("DEF15 <>", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15GreaterThan(String value) {
            addCriterion("DEF15 >", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15GreaterThanOrEqualTo(String value) {
            addCriterion("DEF15 >=", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15LessThan(String value) {
            addCriterion("DEF15 <", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15LessThanOrEqualTo(String value) {
            addCriterion("DEF15 <=", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15Like(String value) {
            addCriterion("DEF15 like", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15NotLike(String value) {
            addCriterion("DEF15 not like", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15In(List<String> values) {
            addCriterion("DEF15 in", values, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15NotIn(List<String> values) {
            addCriterion("DEF15 not in", values, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15Between(String value1, String value2) {
            addCriterion("DEF15 between", value1, value2, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15NotBetween(String value1, String value2) {
            addCriterion("DEF15 not between", value1, value2, "def15");
            return (Criteria) this;
        }

        public Criteria andDef16IsNull() {
            addCriterion("DEF16 is null");
            return (Criteria) this;
        }

        public Criteria andDef16IsNotNull() {
            addCriterion("DEF16 is not null");
            return (Criteria) this;
        }

        public Criteria andDef16EqualTo(String value) {
            addCriterion("DEF16 =", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16NotEqualTo(String value) {
            addCriterion("DEF16 <>", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16GreaterThan(String value) {
            addCriterion("DEF16 >", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16GreaterThanOrEqualTo(String value) {
            addCriterion("DEF16 >=", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16LessThan(String value) {
            addCriterion("DEF16 <", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16LessThanOrEqualTo(String value) {
            addCriterion("DEF16 <=", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16Like(String value) {
            addCriterion("DEF16 like", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16NotLike(String value) {
            addCriterion("DEF16 not like", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16In(List<String> values) {
            addCriterion("DEF16 in", values, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16NotIn(List<String> values) {
            addCriterion("DEF16 not in", values, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16Between(String value1, String value2) {
            addCriterion("DEF16 between", value1, value2, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16NotBetween(String value1, String value2) {
            addCriterion("DEF16 not between", value1, value2, "def16");
            return (Criteria) this;
        }

        public Criteria andDef17IsNull() {
            addCriterion("DEF17 is null");
            return (Criteria) this;
        }

        public Criteria andDef17IsNotNull() {
            addCriterion("DEF17 is not null");
            return (Criteria) this;
        }

        public Criteria andDef17EqualTo(String value) {
            addCriterion("DEF17 =", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17NotEqualTo(String value) {
            addCriterion("DEF17 <>", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17GreaterThan(String value) {
            addCriterion("DEF17 >", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17GreaterThanOrEqualTo(String value) {
            addCriterion("DEF17 >=", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17LessThan(String value) {
            addCriterion("DEF17 <", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17LessThanOrEqualTo(String value) {
            addCriterion("DEF17 <=", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17Like(String value) {
            addCriterion("DEF17 like", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17NotLike(String value) {
            addCriterion("DEF17 not like", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17In(List<String> values) {
            addCriterion("DEF17 in", values, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17NotIn(List<String> values) {
            addCriterion("DEF17 not in", values, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17Between(String value1, String value2) {
            addCriterion("DEF17 between", value1, value2, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17NotBetween(String value1, String value2) {
            addCriterion("DEF17 not between", value1, value2, "def17");
            return (Criteria) this;
        }

        public Criteria andDef18IsNull() {
            addCriterion("DEF18 is null");
            return (Criteria) this;
        }

        public Criteria andDef18IsNotNull() {
            addCriterion("DEF18 is not null");
            return (Criteria) this;
        }

        public Criteria andDef18EqualTo(String value) {
            addCriterion("DEF18 =", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18NotEqualTo(String value) {
            addCriterion("DEF18 <>", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18GreaterThan(String value) {
            addCriterion("DEF18 >", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18GreaterThanOrEqualTo(String value) {
            addCriterion("DEF18 >=", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18LessThan(String value) {
            addCriterion("DEF18 <", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18LessThanOrEqualTo(String value) {
            addCriterion("DEF18 <=", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18Like(String value) {
            addCriterion("DEF18 like", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18NotLike(String value) {
            addCriterion("DEF18 not like", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18In(List<String> values) {
            addCriterion("DEF18 in", values, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18NotIn(List<String> values) {
            addCriterion("DEF18 not in", values, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18Between(String value1, String value2) {
            addCriterion("DEF18 between", value1, value2, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18NotBetween(String value1, String value2) {
            addCriterion("DEF18 not between", value1, value2, "def18");
            return (Criteria) this;
        }

        public Criteria andDef19IsNull() {
            addCriterion("DEF19 is null");
            return (Criteria) this;
        }

        public Criteria andDef19IsNotNull() {
            addCriterion("DEF19 is not null");
            return (Criteria) this;
        }

        public Criteria andDef19EqualTo(String value) {
            addCriterion("DEF19 =", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19NotEqualTo(String value) {
            addCriterion("DEF19 <>", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19GreaterThan(String value) {
            addCriterion("DEF19 >", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19GreaterThanOrEqualTo(String value) {
            addCriterion("DEF19 >=", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19LessThan(String value) {
            addCriterion("DEF19 <", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19LessThanOrEqualTo(String value) {
            addCriterion("DEF19 <=", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19Like(String value) {
            addCriterion("DEF19 like", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19NotLike(String value) {
            addCriterion("DEF19 not like", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19In(List<String> values) {
            addCriterion("DEF19 in", values, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19NotIn(List<String> values) {
            addCriterion("DEF19 not in", values, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19Between(String value1, String value2) {
            addCriterion("DEF19 between", value1, value2, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19NotBetween(String value1, String value2) {
            addCriterion("DEF19 not between", value1, value2, "def19");
            return (Criteria) this;
        }

        public Criteria andDef20IsNull() {
            addCriterion("DEF20 is null");
            return (Criteria) this;
        }

        public Criteria andDef20IsNotNull() {
            addCriterion("DEF20 is not null");
            return (Criteria) this;
        }

        public Criteria andDef20EqualTo(String value) {
            addCriterion("DEF20 =", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20NotEqualTo(String value) {
            addCriterion("DEF20 <>", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20GreaterThan(String value) {
            addCriterion("DEF20 >", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20GreaterThanOrEqualTo(String value) {
            addCriterion("DEF20 >=", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20LessThan(String value) {
            addCriterion("DEF20 <", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20LessThanOrEqualTo(String value) {
            addCriterion("DEF20 <=", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20Like(String value) {
            addCriterion("DEF20 like", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20NotLike(String value) {
            addCriterion("DEF20 not like", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20In(List<String> values) {
            addCriterion("DEF20 in", values, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20NotIn(List<String> values) {
            addCriterion("DEF20 not in", values, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20Between(String value1, String value2) {
            addCriterion("DEF20 between", value1, value2, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20NotBetween(String value1, String value2) {
            addCriterion("DEF20 not between", value1, value2, "def20");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHIsNull() {
            addCriterion("PK_COMMISSION_H is null");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHIsNotNull() {
            addCriterion("PK_COMMISSION_H is not null");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHEqualTo(String value) {
            addCriterion("PK_COMMISSION_H =", value, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHNotEqualTo(String value) {
            addCriterion("PK_COMMISSION_H <>", value, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHGreaterThan(String value) {
            addCriterion("PK_COMMISSION_H >", value, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHGreaterThanOrEqualTo(String value) {
            addCriterion("PK_COMMISSION_H >=", value, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHLessThan(String value) {
            addCriterion("PK_COMMISSION_H <", value, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHLessThanOrEqualTo(String value) {
            addCriterion("PK_COMMISSION_H <=", value, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHLike(String value) {
            addCriterion("PK_COMMISSION_H like", value, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHNotLike(String value) {
            addCriterion("PK_COMMISSION_H not like", value, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHIn(List<String> values) {
            addCriterion("PK_COMMISSION_H in", values, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHNotIn(List<String> values) {
            addCriterion("PK_COMMISSION_H not in", values, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHBetween(String value1, String value2) {
            addCriterion("PK_COMMISSION_H between", value1, value2, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHNotBetween(String value1, String value2) {
            addCriterion("PK_COMMISSION_H not between", value1, value2, "pkCommissionH");
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

        public Criteria andDrIsNull() {
            addCriterion("DR is null");
            return (Criteria) this;
        }

        public Criteria andDrIsNotNull() {
            addCriterion("DR is not null");
            return (Criteria) this;
        }

        public Criteria andDrEqualTo(BigDecimal value) {
            addCriterion("DR =", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotEqualTo(BigDecimal value) {
            addCriterion("DR <>", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThan(BigDecimal value) {
            addCriterion("DR >", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DR >=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThan(BigDecimal value) {
            addCriterion("DR <", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DR <=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrIn(List<BigDecimal> values) {
            addCriterion("DR in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotIn(List<BigDecimal> values) {
            addCriterion("DR not in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DR between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DR not between", value1, value2, "dr");
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