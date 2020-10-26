package cn.besbing.model.entities.primary;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QcCommissionHExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QcCommissionHExample() {
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

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("CREATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("CREATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(String value) {
            addCriterion("CREATIONTIME =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(String value) {
            addCriterion("CREATIONTIME <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(String value) {
            addCriterion("CREATIONTIME >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATIONTIME >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(String value) {
            addCriterion("CREATIONTIME <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(String value) {
            addCriterion("CREATIONTIME <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLike(String value) {
            addCriterion("CREATIONTIME like", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotLike(String value) {
            addCriterion("CREATIONTIME not like", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<String> values) {
            addCriterion("CREATIONTIME in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<String> values) {
            addCriterion("CREATIONTIME not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(String value1, String value2) {
            addCriterion("CREATIONTIME between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(String value1, String value2) {
            addCriterion("CREATIONTIME not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("MODIFIER =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("MODIFIER <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("MODIFIER >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIER >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("MODIFIER <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("MODIFIER <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("MODIFIER like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("MODIFIER not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("MODIFIER in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("MODIFIER not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("MODIFIER between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("MODIFIER not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNull() {
            addCriterion("MODIFIEDTIME is null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNotNull() {
            addCriterion("MODIFIEDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeEqualTo(String value) {
            addCriterion("MODIFIEDTIME =", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotEqualTo(String value) {
            addCriterion("MODIFIEDTIME <>", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThan(String value) {
            addCriterion("MODIFIEDTIME >", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIEDTIME >=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThan(String value) {
            addCriterion("MODIFIEDTIME <", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThanOrEqualTo(String value) {
            addCriterion("MODIFIEDTIME <=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLike(String value) {
            addCriterion("MODIFIEDTIME like", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotLike(String value) {
            addCriterion("MODIFIEDTIME not like", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIn(List<String> values) {
            addCriterion("MODIFIEDTIME in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotIn(List<String> values) {
            addCriterion("MODIFIEDTIME not in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeBetween(String value1, String value2) {
            addCriterion("MODIFIEDTIME between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotBetween(String value1, String value2) {
            addCriterion("MODIFIEDTIME not between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeIsNull() {
            addCriterion("LASTMAKETIME is null");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeIsNotNull() {
            addCriterion("LASTMAKETIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeEqualTo(String value) {
            addCriterion("LASTMAKETIME =", value, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeNotEqualTo(String value) {
            addCriterion("LASTMAKETIME <>", value, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeGreaterThan(String value) {
            addCriterion("LASTMAKETIME >", value, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeGreaterThanOrEqualTo(String value) {
            addCriterion("LASTMAKETIME >=", value, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeLessThan(String value) {
            addCriterion("LASTMAKETIME <", value, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeLessThanOrEqualTo(String value) {
            addCriterion("LASTMAKETIME <=", value, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeLike(String value) {
            addCriterion("LASTMAKETIME like", value, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeNotLike(String value) {
            addCriterion("LASTMAKETIME not like", value, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeIn(List<String> values) {
            addCriterion("LASTMAKETIME in", values, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeNotIn(List<String> values) {
            addCriterion("LASTMAKETIME not in", values, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeBetween(String value1, String value2) {
            addCriterion("LASTMAKETIME between", value1, value2, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeNotBetween(String value1, String value2) {
            addCriterion("LASTMAKETIME not between", value1, value2, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andDmakedateIsNull() {
            addCriterion("DMAKEDATE is null");
            return (Criteria) this;
        }

        public Criteria andDmakedateIsNotNull() {
            addCriterion("DMAKEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDmakedateEqualTo(String value) {
            addCriterion("DMAKEDATE =", value, "dmakedate");
            return (Criteria) this;
        }

        public Criteria andDmakedateNotEqualTo(String value) {
            addCriterion("DMAKEDATE <>", value, "dmakedate");
            return (Criteria) this;
        }

        public Criteria andDmakedateGreaterThan(String value) {
            addCriterion("DMAKEDATE >", value, "dmakedate");
            return (Criteria) this;
        }

        public Criteria andDmakedateGreaterThanOrEqualTo(String value) {
            addCriterion("DMAKEDATE >=", value, "dmakedate");
            return (Criteria) this;
        }

        public Criteria andDmakedateLessThan(String value) {
            addCriterion("DMAKEDATE <", value, "dmakedate");
            return (Criteria) this;
        }

        public Criteria andDmakedateLessThanOrEqualTo(String value) {
            addCriterion("DMAKEDATE <=", value, "dmakedate");
            return (Criteria) this;
        }

        public Criteria andDmakedateLike(String value) {
            addCriterion("DMAKEDATE like", value, "dmakedate");
            return (Criteria) this;
        }

        public Criteria andDmakedateNotLike(String value) {
            addCriterion("DMAKEDATE not like", value, "dmakedate");
            return (Criteria) this;
        }

        public Criteria andDmakedateIn(List<String> values) {
            addCriterion("DMAKEDATE in", values, "dmakedate");
            return (Criteria) this;
        }

        public Criteria andDmakedateNotIn(List<String> values) {
            addCriterion("DMAKEDATE not in", values, "dmakedate");
            return (Criteria) this;
        }

        public Criteria andDmakedateBetween(String value1, String value2) {
            addCriterion("DMAKEDATE between", value1, value2, "dmakedate");
            return (Criteria) this;
        }

        public Criteria andDmakedateNotBetween(String value1, String value2) {
            addCriterion("DMAKEDATE not between", value1, value2, "dmakedate");
            return (Criteria) this;
        }

        public Criteria andPkGroupIsNull() {
            addCriterion("PK_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andPkGroupIsNotNull() {
            addCriterion("PK_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andPkGroupEqualTo(String value) {
            addCriterion("PK_GROUP =", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotEqualTo(String value) {
            addCriterion("PK_GROUP <>", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupGreaterThan(String value) {
            addCriterion("PK_GROUP >", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupGreaterThanOrEqualTo(String value) {
            addCriterion("PK_GROUP >=", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupLessThan(String value) {
            addCriterion("PK_GROUP <", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupLessThanOrEqualTo(String value) {
            addCriterion("PK_GROUP <=", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupLike(String value) {
            addCriterion("PK_GROUP like", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotLike(String value) {
            addCriterion("PK_GROUP not like", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupIn(List<String> values) {
            addCriterion("PK_GROUP in", values, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotIn(List<String> values) {
            addCriterion("PK_GROUP not in", values, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupBetween(String value1, String value2) {
            addCriterion("PK_GROUP between", value1, value2, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotBetween(String value1, String value2) {
            addCriterion("PK_GROUP not between", value1, value2, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkOrgIsNull() {
            addCriterion("PK_ORG is null");
            return (Criteria) this;
        }

        public Criteria andPkOrgIsNotNull() {
            addCriterion("PK_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andPkOrgEqualTo(String value) {
            addCriterion("PK_ORG =", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotEqualTo(String value) {
            addCriterion("PK_ORG <>", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgGreaterThan(String value) {
            addCriterion("PK_ORG >", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ORG >=", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLessThan(String value) {
            addCriterion("PK_ORG <", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLessThanOrEqualTo(String value) {
            addCriterion("PK_ORG <=", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLike(String value) {
            addCriterion("PK_ORG like", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotLike(String value) {
            addCriterion("PK_ORG not like", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgIn(List<String> values) {
            addCriterion("PK_ORG in", values, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotIn(List<String> values) {
            addCriterion("PK_ORG not in", values, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgBetween(String value1, String value2) {
            addCriterion("PK_ORG between", value1, value2, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotBetween(String value1, String value2) {
            addCriterion("PK_ORG not between", value1, value2, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgVIsNull() {
            addCriterion("PK_ORG_V is null");
            return (Criteria) this;
        }

        public Criteria andPkOrgVIsNotNull() {
            addCriterion("PK_ORG_V is not null");
            return (Criteria) this;
        }

        public Criteria andPkOrgVEqualTo(String value) {
            addCriterion("PK_ORG_V =", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVNotEqualTo(String value) {
            addCriterion("PK_ORG_V <>", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVGreaterThan(String value) {
            addCriterion("PK_ORG_V >", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ORG_V >=", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVLessThan(String value) {
            addCriterion("PK_ORG_V <", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVLessThanOrEqualTo(String value) {
            addCriterion("PK_ORG_V <=", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVLike(String value) {
            addCriterion("PK_ORG_V like", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVNotLike(String value) {
            addCriterion("PK_ORG_V not like", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVIn(List<String> values) {
            addCriterion("PK_ORG_V in", values, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVNotIn(List<String> values) {
            addCriterion("PK_ORG_V not in", values, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVBetween(String value1, String value2) {
            addCriterion("PK_ORG_V between", value1, value2, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVNotBetween(String value1, String value2) {
            addCriterion("PK_ORG_V not between", value1, value2, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkCommissiontypeIsNull() {
            addCriterion("PK_COMMISSIONTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPkCommissiontypeIsNotNull() {
            addCriterion("PK_COMMISSIONTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPkCommissiontypeEqualTo(String value) {
            addCriterion("PK_COMMISSIONTYPE =", value, "pkCommissiontype");
            return (Criteria) this;
        }

        public Criteria andPkCommissiontypeNotEqualTo(String value) {
            addCriterion("PK_COMMISSIONTYPE <>", value, "pkCommissiontype");
            return (Criteria) this;
        }

        public Criteria andPkCommissiontypeGreaterThan(String value) {
            addCriterion("PK_COMMISSIONTYPE >", value, "pkCommissiontype");
            return (Criteria) this;
        }

        public Criteria andPkCommissiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("PK_COMMISSIONTYPE >=", value, "pkCommissiontype");
            return (Criteria) this;
        }

        public Criteria andPkCommissiontypeLessThan(String value) {
            addCriterion("PK_COMMISSIONTYPE <", value, "pkCommissiontype");
            return (Criteria) this;
        }

        public Criteria andPkCommissiontypeLessThanOrEqualTo(String value) {
            addCriterion("PK_COMMISSIONTYPE <=", value, "pkCommissiontype");
            return (Criteria) this;
        }

        public Criteria andPkCommissiontypeLike(String value) {
            addCriterion("PK_COMMISSIONTYPE like", value, "pkCommissiontype");
            return (Criteria) this;
        }

        public Criteria andPkCommissiontypeNotLike(String value) {
            addCriterion("PK_COMMISSIONTYPE not like", value, "pkCommissiontype");
            return (Criteria) this;
        }

        public Criteria andPkCommissiontypeIn(List<String> values) {
            addCriterion("PK_COMMISSIONTYPE in", values, "pkCommissiontype");
            return (Criteria) this;
        }

        public Criteria andPkCommissiontypeNotIn(List<String> values) {
            addCriterion("PK_COMMISSIONTYPE not in", values, "pkCommissiontype");
            return (Criteria) this;
        }

        public Criteria andPkCommissiontypeBetween(String value1, String value2) {
            addCriterion("PK_COMMISSIONTYPE between", value1, value2, "pkCommissiontype");
            return (Criteria) this;
        }

        public Criteria andPkCommissiontypeNotBetween(String value1, String value2) {
            addCriterion("PK_COMMISSIONTYPE not between", value1, value2, "pkCommissiontype");
            return (Criteria) this;
        }

        public Criteria andCodeprefixIsNull() {
            addCriterion("CODEPREFIX is null");
            return (Criteria) this;
        }

        public Criteria andCodeprefixIsNotNull() {
            addCriterion("CODEPREFIX is not null");
            return (Criteria) this;
        }

        public Criteria andCodeprefixEqualTo(String value) {
            addCriterion("CODEPREFIX =", value, "codeprefix");
            return (Criteria) this;
        }

        public Criteria andCodeprefixNotEqualTo(String value) {
            addCriterion("CODEPREFIX <>", value, "codeprefix");
            return (Criteria) this;
        }

        public Criteria andCodeprefixGreaterThan(String value) {
            addCriterion("CODEPREFIX >", value, "codeprefix");
            return (Criteria) this;
        }

        public Criteria andCodeprefixGreaterThanOrEqualTo(String value) {
            addCriterion("CODEPREFIX >=", value, "codeprefix");
            return (Criteria) this;
        }

        public Criteria andCodeprefixLessThan(String value) {
            addCriterion("CODEPREFIX <", value, "codeprefix");
            return (Criteria) this;
        }

        public Criteria andCodeprefixLessThanOrEqualTo(String value) {
            addCriterion("CODEPREFIX <=", value, "codeprefix");
            return (Criteria) this;
        }

        public Criteria andCodeprefixLike(String value) {
            addCriterion("CODEPREFIX like", value, "codeprefix");
            return (Criteria) this;
        }

        public Criteria andCodeprefixNotLike(String value) {
            addCriterion("CODEPREFIX not like", value, "codeprefix");
            return (Criteria) this;
        }

        public Criteria andCodeprefixIn(List<String> values) {
            addCriterion("CODEPREFIX in", values, "codeprefix");
            return (Criteria) this;
        }

        public Criteria andCodeprefixNotIn(List<String> values) {
            addCriterion("CODEPREFIX not in", values, "codeprefix");
            return (Criteria) this;
        }

        public Criteria andCodeprefixBetween(String value1, String value2) {
            addCriterion("CODEPREFIX between", value1, value2, "codeprefix");
            return (Criteria) this;
        }

        public Criteria andCodeprefixNotBetween(String value1, String value2) {
            addCriterion("CODEPREFIX not between", value1, value2, "codeprefix");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNull() {
            addCriterion("BILLNO is null");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNotNull() {
            addCriterion("BILLNO is not null");
            return (Criteria) this;
        }

        public Criteria andBillnoEqualTo(String value) {
            addCriterion("BILLNO =", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotEqualTo(String value) {
            addCriterion("BILLNO <>", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThan(String value) {
            addCriterion("BILLNO >", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("BILLNO >=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThan(String value) {
            addCriterion("BILLNO <", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThanOrEqualTo(String value) {
            addCriterion("BILLNO <=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLike(String value) {
            addCriterion("BILLNO like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotLike(String value) {
            addCriterion("BILLNO not like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoIn(List<String> values) {
            addCriterion("BILLNO in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotIn(List<String> values) {
            addCriterion("BILLNO not in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoBetween(String value1, String value2) {
            addCriterion("BILLNO between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotBetween(String value1, String value2) {
            addCriterion("BILLNO not between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnameIsNull() {
            addCriterion("BILLNAME is null");
            return (Criteria) this;
        }

        public Criteria andBillnameIsNotNull() {
            addCriterion("BILLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBillnameEqualTo(String value) {
            addCriterion("BILLNAME =", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameNotEqualTo(String value) {
            addCriterion("BILLNAME <>", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameGreaterThan(String value) {
            addCriterion("BILLNAME >", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameGreaterThanOrEqualTo(String value) {
            addCriterion("BILLNAME >=", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameLessThan(String value) {
            addCriterion("BILLNAME <", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameLessThanOrEqualTo(String value) {
            addCriterion("BILLNAME <=", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameLike(String value) {
            addCriterion("BILLNAME like", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameNotLike(String value) {
            addCriterion("BILLNAME not like", value, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameIn(List<String> values) {
            addCriterion("BILLNAME in", values, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameNotIn(List<String> values) {
            addCriterion("BILLNAME not in", values, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameBetween(String value1, String value2) {
            addCriterion("BILLNAME between", value1, value2, "billname");
            return (Criteria) this;
        }

        public Criteria andBillnameNotBetween(String value1, String value2) {
            addCriterion("BILLNAME not between", value1, value2, "billname");
            return (Criteria) this;
        }

        public Criteria andPkOwnerIsNull() {
            addCriterion("PK_OWNER is null");
            return (Criteria) this;
        }

        public Criteria andPkOwnerIsNotNull() {
            addCriterion("PK_OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andPkOwnerEqualTo(String value) {
            addCriterion("PK_OWNER =", value, "pkOwner");
            return (Criteria) this;
        }

        public Criteria andPkOwnerNotEqualTo(String value) {
            addCriterion("PK_OWNER <>", value, "pkOwner");
            return (Criteria) this;
        }

        public Criteria andPkOwnerGreaterThan(String value) {
            addCriterion("PK_OWNER >", value, "pkOwner");
            return (Criteria) this;
        }

        public Criteria andPkOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("PK_OWNER >=", value, "pkOwner");
            return (Criteria) this;
        }

        public Criteria andPkOwnerLessThan(String value) {
            addCriterion("PK_OWNER <", value, "pkOwner");
            return (Criteria) this;
        }

        public Criteria andPkOwnerLessThanOrEqualTo(String value) {
            addCriterion("PK_OWNER <=", value, "pkOwner");
            return (Criteria) this;
        }

        public Criteria andPkOwnerLike(String value) {
            addCriterion("PK_OWNER like", value, "pkOwner");
            return (Criteria) this;
        }

        public Criteria andPkOwnerNotLike(String value) {
            addCriterion("PK_OWNER not like", value, "pkOwner");
            return (Criteria) this;
        }

        public Criteria andPkOwnerIn(List<String> values) {
            addCriterion("PK_OWNER in", values, "pkOwner");
            return (Criteria) this;
        }

        public Criteria andPkOwnerNotIn(List<String> values) {
            addCriterion("PK_OWNER not in", values, "pkOwner");
            return (Criteria) this;
        }

        public Criteria andPkOwnerBetween(String value1, String value2) {
            addCriterion("PK_OWNER between", value1, value2, "pkOwner");
            return (Criteria) this;
        }

        public Criteria andPkOwnerNotBetween(String value1, String value2) {
            addCriterion("PK_OWNER not between", value1, value2, "pkOwner");
            return (Criteria) this;
        }

        public Criteria andPkDeptIsNull() {
            addCriterion("PK_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andPkDeptIsNotNull() {
            addCriterion("PK_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andPkDeptEqualTo(String value) {
            addCriterion("PK_DEPT =", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptNotEqualTo(String value) {
            addCriterion("PK_DEPT <>", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptGreaterThan(String value) {
            addCriterion("PK_DEPT >", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptGreaterThanOrEqualTo(String value) {
            addCriterion("PK_DEPT >=", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptLessThan(String value) {
            addCriterion("PK_DEPT <", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptLessThanOrEqualTo(String value) {
            addCriterion("PK_DEPT <=", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptLike(String value) {
            addCriterion("PK_DEPT like", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptNotLike(String value) {
            addCriterion("PK_DEPT not like", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptIn(List<String> values) {
            addCriterion("PK_DEPT in", values, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptNotIn(List<String> values) {
            addCriterion("PK_DEPT not in", values, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptBetween(String value1, String value2) {
            addCriterion("PK_DEPT between", value1, value2, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptNotBetween(String value1, String value2) {
            addCriterion("PK_DEPT not between", value1, value2, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkPayerIsNull() {
            addCriterion("PK_PAYER is null");
            return (Criteria) this;
        }

        public Criteria andPkPayerIsNotNull() {
            addCriterion("PK_PAYER is not null");
            return (Criteria) this;
        }

        public Criteria andPkPayerEqualTo(String value) {
            addCriterion("PK_PAYER =", value, "pkPayer");
            return (Criteria) this;
        }

        public Criteria andPkPayerNotEqualTo(String value) {
            addCriterion("PK_PAYER <>", value, "pkPayer");
            return (Criteria) this;
        }

        public Criteria andPkPayerGreaterThan(String value) {
            addCriterion("PK_PAYER >", value, "pkPayer");
            return (Criteria) this;
        }

        public Criteria andPkPayerGreaterThanOrEqualTo(String value) {
            addCriterion("PK_PAYER >=", value, "pkPayer");
            return (Criteria) this;
        }

        public Criteria andPkPayerLessThan(String value) {
            addCriterion("PK_PAYER <", value, "pkPayer");
            return (Criteria) this;
        }

        public Criteria andPkPayerLessThanOrEqualTo(String value) {
            addCriterion("PK_PAYER <=", value, "pkPayer");
            return (Criteria) this;
        }

        public Criteria andPkPayerLike(String value) {
            addCriterion("PK_PAYER like", value, "pkPayer");
            return (Criteria) this;
        }

        public Criteria andPkPayerNotLike(String value) {
            addCriterion("PK_PAYER not like", value, "pkPayer");
            return (Criteria) this;
        }

        public Criteria andPkPayerIn(List<String> values) {
            addCriterion("PK_PAYER in", values, "pkPayer");
            return (Criteria) this;
        }

        public Criteria andPkPayerNotIn(List<String> values) {
            addCriterion("PK_PAYER not in", values, "pkPayer");
            return (Criteria) this;
        }

        public Criteria andPkPayerBetween(String value1, String value2) {
            addCriterion("PK_PAYER between", value1, value2, "pkPayer");
            return (Criteria) this;
        }

        public Criteria andPkPayerNotBetween(String value1, String value2) {
            addCriterion("PK_PAYER not between", value1, value2, "pkPayer");
            return (Criteria) this;
        }

        public Criteria andContractIsNull() {
            addCriterion("CONTRACT is null");
            return (Criteria) this;
        }

        public Criteria andContractIsNotNull() {
            addCriterion("CONTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andContractEqualTo(String value) {
            addCriterion("CONTRACT =", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotEqualTo(String value) {
            addCriterion("CONTRACT <>", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractGreaterThan(String value) {
            addCriterion("CONTRACT >", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT >=", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLessThan(String value) {
            addCriterion("CONTRACT <", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT <=", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLike(String value) {
            addCriterion("CONTRACT like", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotLike(String value) {
            addCriterion("CONTRACT not like", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractIn(List<String> values) {
            addCriterion("CONTRACT in", values, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotIn(List<String> values) {
            addCriterion("CONTRACT not in", values, "contract");
            return (Criteria) this;
        }

        public Criteria andContractBetween(String value1, String value2) {
            addCriterion("CONTRACT between", value1, value2, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotBetween(String value1, String value2) {
            addCriterion("CONTRACT not between", value1, value2, "contract");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andTelenoIsNull() {
            addCriterion("TELENO is null");
            return (Criteria) this;
        }

        public Criteria andTelenoIsNotNull() {
            addCriterion("TELENO is not null");
            return (Criteria) this;
        }

        public Criteria andTelenoEqualTo(String value) {
            addCriterion("TELENO =", value, "teleno");
            return (Criteria) this;
        }

        public Criteria andTelenoNotEqualTo(String value) {
            addCriterion("TELENO <>", value, "teleno");
            return (Criteria) this;
        }

        public Criteria andTelenoGreaterThan(String value) {
            addCriterion("TELENO >", value, "teleno");
            return (Criteria) this;
        }

        public Criteria andTelenoGreaterThanOrEqualTo(String value) {
            addCriterion("TELENO >=", value, "teleno");
            return (Criteria) this;
        }

        public Criteria andTelenoLessThan(String value) {
            addCriterion("TELENO <", value, "teleno");
            return (Criteria) this;
        }

        public Criteria andTelenoLessThanOrEqualTo(String value) {
            addCriterion("TELENO <=", value, "teleno");
            return (Criteria) this;
        }

        public Criteria andTelenoLike(String value) {
            addCriterion("TELENO like", value, "teleno");
            return (Criteria) this;
        }

        public Criteria andTelenoNotLike(String value) {
            addCriterion("TELENO not like", value, "teleno");
            return (Criteria) this;
        }

        public Criteria andTelenoIn(List<String> values) {
            addCriterion("TELENO in", values, "teleno");
            return (Criteria) this;
        }

        public Criteria andTelenoNotIn(List<String> values) {
            addCriterion("TELENO not in", values, "teleno");
            return (Criteria) this;
        }

        public Criteria andTelenoBetween(String value1, String value2) {
            addCriterion("TELENO between", value1, value2, "teleno");
            return (Criteria) this;
        }

        public Criteria andTelenoNotBetween(String value1, String value2) {
            addCriterion("TELENO not between", value1, value2, "teleno");
            return (Criteria) this;
        }

        public Criteria andPkMaincategoryIsNull() {
            addCriterion("PK_MAINCATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andPkMaincategoryIsNotNull() {
            addCriterion("PK_MAINCATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andPkMaincategoryEqualTo(String value) {
            addCriterion("PK_MAINCATEGORY =", value, "pkMaincategory");
            return (Criteria) this;
        }

        public Criteria andPkMaincategoryNotEqualTo(String value) {
            addCriterion("PK_MAINCATEGORY <>", value, "pkMaincategory");
            return (Criteria) this;
        }

        public Criteria andPkMaincategoryGreaterThan(String value) {
            addCriterion("PK_MAINCATEGORY >", value, "pkMaincategory");
            return (Criteria) this;
        }

        public Criteria andPkMaincategoryGreaterThanOrEqualTo(String value) {
            addCriterion("PK_MAINCATEGORY >=", value, "pkMaincategory");
            return (Criteria) this;
        }

        public Criteria andPkMaincategoryLessThan(String value) {
            addCriterion("PK_MAINCATEGORY <", value, "pkMaincategory");
            return (Criteria) this;
        }

        public Criteria andPkMaincategoryLessThanOrEqualTo(String value) {
            addCriterion("PK_MAINCATEGORY <=", value, "pkMaincategory");
            return (Criteria) this;
        }

        public Criteria andPkMaincategoryLike(String value) {
            addCriterion("PK_MAINCATEGORY like", value, "pkMaincategory");
            return (Criteria) this;
        }

        public Criteria andPkMaincategoryNotLike(String value) {
            addCriterion("PK_MAINCATEGORY not like", value, "pkMaincategory");
            return (Criteria) this;
        }

        public Criteria andPkMaincategoryIn(List<String> values) {
            addCriterion("PK_MAINCATEGORY in", values, "pkMaincategory");
            return (Criteria) this;
        }

        public Criteria andPkMaincategoryNotIn(List<String> values) {
            addCriterion("PK_MAINCATEGORY not in", values, "pkMaincategory");
            return (Criteria) this;
        }

        public Criteria andPkMaincategoryBetween(String value1, String value2) {
            addCriterion("PK_MAINCATEGORY between", value1, value2, "pkMaincategory");
            return (Criteria) this;
        }

        public Criteria andPkMaincategoryNotBetween(String value1, String value2) {
            addCriterion("PK_MAINCATEGORY not between", value1, value2, "pkMaincategory");
            return (Criteria) this;
        }

        public Criteria andPkSubcategoryIsNull() {
            addCriterion("PK_SUBCATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andPkSubcategoryIsNotNull() {
            addCriterion("PK_SUBCATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andPkSubcategoryEqualTo(String value) {
            addCriterion("PK_SUBCATEGORY =", value, "pkSubcategory");
            return (Criteria) this;
        }

        public Criteria andPkSubcategoryNotEqualTo(String value) {
            addCriterion("PK_SUBCATEGORY <>", value, "pkSubcategory");
            return (Criteria) this;
        }

        public Criteria andPkSubcategoryGreaterThan(String value) {
            addCriterion("PK_SUBCATEGORY >", value, "pkSubcategory");
            return (Criteria) this;
        }

        public Criteria andPkSubcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("PK_SUBCATEGORY >=", value, "pkSubcategory");
            return (Criteria) this;
        }

        public Criteria andPkSubcategoryLessThan(String value) {
            addCriterion("PK_SUBCATEGORY <", value, "pkSubcategory");
            return (Criteria) this;
        }

        public Criteria andPkSubcategoryLessThanOrEqualTo(String value) {
            addCriterion("PK_SUBCATEGORY <=", value, "pkSubcategory");
            return (Criteria) this;
        }

        public Criteria andPkSubcategoryLike(String value) {
            addCriterion("PK_SUBCATEGORY like", value, "pkSubcategory");
            return (Criteria) this;
        }

        public Criteria andPkSubcategoryNotLike(String value) {
            addCriterion("PK_SUBCATEGORY not like", value, "pkSubcategory");
            return (Criteria) this;
        }

        public Criteria andPkSubcategoryIn(List<String> values) {
            addCriterion("PK_SUBCATEGORY in", values, "pkSubcategory");
            return (Criteria) this;
        }

        public Criteria andPkSubcategoryNotIn(List<String> values) {
            addCriterion("PK_SUBCATEGORY not in", values, "pkSubcategory");
            return (Criteria) this;
        }

        public Criteria andPkSubcategoryBetween(String value1, String value2) {
            addCriterion("PK_SUBCATEGORY between", value1, value2, "pkSubcategory");
            return (Criteria) this;
        }

        public Criteria andPkSubcategoryNotBetween(String value1, String value2) {
            addCriterion("PK_SUBCATEGORY not between", value1, value2, "pkSubcategory");
            return (Criteria) this;
        }

        public Criteria andPkLastcategoryIsNull() {
            addCriterion("PK_LASTCATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andPkLastcategoryIsNotNull() {
            addCriterion("PK_LASTCATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andPkLastcategoryEqualTo(String value) {
            addCriterion("PK_LASTCATEGORY =", value, "pkLastcategory");
            return (Criteria) this;
        }

        public Criteria andPkLastcategoryNotEqualTo(String value) {
            addCriterion("PK_LASTCATEGORY <>", value, "pkLastcategory");
            return (Criteria) this;
        }

        public Criteria andPkLastcategoryGreaterThan(String value) {
            addCriterion("PK_LASTCATEGORY >", value, "pkLastcategory");
            return (Criteria) this;
        }

        public Criteria andPkLastcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("PK_LASTCATEGORY >=", value, "pkLastcategory");
            return (Criteria) this;
        }

        public Criteria andPkLastcategoryLessThan(String value) {
            addCriterion("PK_LASTCATEGORY <", value, "pkLastcategory");
            return (Criteria) this;
        }

        public Criteria andPkLastcategoryLessThanOrEqualTo(String value) {
            addCriterion("PK_LASTCATEGORY <=", value, "pkLastcategory");
            return (Criteria) this;
        }

        public Criteria andPkLastcategoryLike(String value) {
            addCriterion("PK_LASTCATEGORY like", value, "pkLastcategory");
            return (Criteria) this;
        }

        public Criteria andPkLastcategoryNotLike(String value) {
            addCriterion("PK_LASTCATEGORY not like", value, "pkLastcategory");
            return (Criteria) this;
        }

        public Criteria andPkLastcategoryIn(List<String> values) {
            addCriterion("PK_LASTCATEGORY in", values, "pkLastcategory");
            return (Criteria) this;
        }

        public Criteria andPkLastcategoryNotIn(List<String> values) {
            addCriterion("PK_LASTCATEGORY not in", values, "pkLastcategory");
            return (Criteria) this;
        }

        public Criteria andPkLastcategoryBetween(String value1, String value2) {
            addCriterion("PK_LASTCATEGORY between", value1, value2, "pkLastcategory");
            return (Criteria) this;
        }

        public Criteria andPkLastcategoryNotBetween(String value1, String value2) {
            addCriterion("PK_LASTCATEGORY not between", value1, value2, "pkLastcategory");
            return (Criteria) this;
        }

        public Criteria andCuseridIsNull() {
            addCriterion("CUSERID is null");
            return (Criteria) this;
        }

        public Criteria andCuseridIsNotNull() {
            addCriterion("CUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andCuseridEqualTo(String value) {
            addCriterion("CUSERID =", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridNotEqualTo(String value) {
            addCriterion("CUSERID <>", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridGreaterThan(String value) {
            addCriterion("CUSERID >", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridGreaterThanOrEqualTo(String value) {
            addCriterion("CUSERID >=", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridLessThan(String value) {
            addCriterion("CUSERID <", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridLessThanOrEqualTo(String value) {
            addCriterion("CUSERID <=", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridLike(String value) {
            addCriterion("CUSERID like", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridNotLike(String value) {
            addCriterion("CUSERID not like", value, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridIn(List<String> values) {
            addCriterion("CUSERID in", values, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridNotIn(List<String> values) {
            addCriterion("CUSERID not in", values, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridBetween(String value1, String value2) {
            addCriterion("CUSERID between", value1, value2, "cuserid");
            return (Criteria) this;
        }

        public Criteria andCuseridNotBetween(String value1, String value2) {
            addCriterion("CUSERID not between", value1, value2, "cuserid");
            return (Criteria) this;
        }

        public Criteria andReportformatIsNull() {
            addCriterion("REPORTFORMAT is null");
            return (Criteria) this;
        }

        public Criteria andReportformatIsNotNull() {
            addCriterion("REPORTFORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andReportformatEqualTo(String value) {
            addCriterion("REPORTFORMAT =", value, "reportformat");
            return (Criteria) this;
        }

        public Criteria andReportformatNotEqualTo(String value) {
            addCriterion("REPORTFORMAT <>", value, "reportformat");
            return (Criteria) this;
        }

        public Criteria andReportformatGreaterThan(String value) {
            addCriterion("REPORTFORMAT >", value, "reportformat");
            return (Criteria) this;
        }

        public Criteria andReportformatGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTFORMAT >=", value, "reportformat");
            return (Criteria) this;
        }

        public Criteria andReportformatLessThan(String value) {
            addCriterion("REPORTFORMAT <", value, "reportformat");
            return (Criteria) this;
        }

        public Criteria andReportformatLessThanOrEqualTo(String value) {
            addCriterion("REPORTFORMAT <=", value, "reportformat");
            return (Criteria) this;
        }

        public Criteria andReportformatLike(String value) {
            addCriterion("REPORTFORMAT like", value, "reportformat");
            return (Criteria) this;
        }

        public Criteria andReportformatNotLike(String value) {
            addCriterion("REPORTFORMAT not like", value, "reportformat");
            return (Criteria) this;
        }

        public Criteria andReportformatIn(List<String> values) {
            addCriterion("REPORTFORMAT in", values, "reportformat");
            return (Criteria) this;
        }

        public Criteria andReportformatNotIn(List<String> values) {
            addCriterion("REPORTFORMAT not in", values, "reportformat");
            return (Criteria) this;
        }

        public Criteria andReportformatBetween(String value1, String value2) {
            addCriterion("REPORTFORMAT between", value1, value2, "reportformat");
            return (Criteria) this;
        }

        public Criteria andReportformatNotBetween(String value1, String value2) {
            addCriterion("REPORTFORMAT not between", value1, value2, "reportformat");
            return (Criteria) this;
        }

        public Criteria andReportlangIsNull() {
            addCriterion("REPORTLANG is null");
            return (Criteria) this;
        }

        public Criteria andReportlangIsNotNull() {
            addCriterion("REPORTLANG is not null");
            return (Criteria) this;
        }

        public Criteria andReportlangEqualTo(String value) {
            addCriterion("REPORTLANG =", value, "reportlang");
            return (Criteria) this;
        }

        public Criteria andReportlangNotEqualTo(String value) {
            addCriterion("REPORTLANG <>", value, "reportlang");
            return (Criteria) this;
        }

        public Criteria andReportlangGreaterThan(String value) {
            addCriterion("REPORTLANG >", value, "reportlang");
            return (Criteria) this;
        }

        public Criteria andReportlangGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTLANG >=", value, "reportlang");
            return (Criteria) this;
        }

        public Criteria andReportlangLessThan(String value) {
            addCriterion("REPORTLANG <", value, "reportlang");
            return (Criteria) this;
        }

        public Criteria andReportlangLessThanOrEqualTo(String value) {
            addCriterion("REPORTLANG <=", value, "reportlang");
            return (Criteria) this;
        }

        public Criteria andReportlangLike(String value) {
            addCriterion("REPORTLANG like", value, "reportlang");
            return (Criteria) this;
        }

        public Criteria andReportlangNotLike(String value) {
            addCriterion("REPORTLANG not like", value, "reportlang");
            return (Criteria) this;
        }

        public Criteria andReportlangIn(List<String> values) {
            addCriterion("REPORTLANG in", values, "reportlang");
            return (Criteria) this;
        }

        public Criteria andReportlangNotIn(List<String> values) {
            addCriterion("REPORTLANG not in", values, "reportlang");
            return (Criteria) this;
        }

        public Criteria andReportlangBetween(String value1, String value2) {
            addCriterion("REPORTLANG between", value1, value2, "reportlang");
            return (Criteria) this;
        }

        public Criteria andReportlangNotBetween(String value1, String value2) {
            addCriterion("REPORTLANG not between", value1, value2, "reportlang");
            return (Criteria) this;
        }

        public Criteria andManagersendflagIsNull() {
            addCriterion("MANAGERSENDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andManagersendflagIsNotNull() {
            addCriterion("MANAGERSENDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andManagersendflagEqualTo(String value) {
            addCriterion("MANAGERSENDFLAG =", value, "managersendflag");
            return (Criteria) this;
        }

        public Criteria andManagersendflagNotEqualTo(String value) {
            addCriterion("MANAGERSENDFLAG <>", value, "managersendflag");
            return (Criteria) this;
        }

        public Criteria andManagersendflagGreaterThan(String value) {
            addCriterion("MANAGERSENDFLAG >", value, "managersendflag");
            return (Criteria) this;
        }

        public Criteria andManagersendflagGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGERSENDFLAG >=", value, "managersendflag");
            return (Criteria) this;
        }

        public Criteria andManagersendflagLessThan(String value) {
            addCriterion("MANAGERSENDFLAG <", value, "managersendflag");
            return (Criteria) this;
        }

        public Criteria andManagersendflagLessThanOrEqualTo(String value) {
            addCriterion("MANAGERSENDFLAG <=", value, "managersendflag");
            return (Criteria) this;
        }

        public Criteria andManagersendflagLike(String value) {
            addCriterion("MANAGERSENDFLAG like", value, "managersendflag");
            return (Criteria) this;
        }

        public Criteria andManagersendflagNotLike(String value) {
            addCriterion("MANAGERSENDFLAG not like", value, "managersendflag");
            return (Criteria) this;
        }

        public Criteria andManagersendflagIn(List<String> values) {
            addCriterion("MANAGERSENDFLAG in", values, "managersendflag");
            return (Criteria) this;
        }

        public Criteria andManagersendflagNotIn(List<String> values) {
            addCriterion("MANAGERSENDFLAG not in", values, "managersendflag");
            return (Criteria) this;
        }

        public Criteria andManagersendflagBetween(String value1, String value2) {
            addCriterion("MANAGERSENDFLAG between", value1, value2, "managersendflag");
            return (Criteria) this;
        }

        public Criteria andManagersendflagNotBetween(String value1, String value2) {
            addCriterion("MANAGERSENDFLAG not between", value1, value2, "managersendflag");
            return (Criteria) this;
        }

        public Criteria andTaskbeginsendflagIsNull() {
            addCriterion("TASKBEGINSENDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andTaskbeginsendflagIsNotNull() {
            addCriterion("TASKBEGINSENDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTaskbeginsendflagEqualTo(String value) {
            addCriterion("TASKBEGINSENDFLAG =", value, "taskbeginsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskbeginsendflagNotEqualTo(String value) {
            addCriterion("TASKBEGINSENDFLAG <>", value, "taskbeginsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskbeginsendflagGreaterThan(String value) {
            addCriterion("TASKBEGINSENDFLAG >", value, "taskbeginsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskbeginsendflagGreaterThanOrEqualTo(String value) {
            addCriterion("TASKBEGINSENDFLAG >=", value, "taskbeginsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskbeginsendflagLessThan(String value) {
            addCriterion("TASKBEGINSENDFLAG <", value, "taskbeginsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskbeginsendflagLessThanOrEqualTo(String value) {
            addCriterion("TASKBEGINSENDFLAG <=", value, "taskbeginsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskbeginsendflagLike(String value) {
            addCriterion("TASKBEGINSENDFLAG like", value, "taskbeginsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskbeginsendflagNotLike(String value) {
            addCriterion("TASKBEGINSENDFLAG not like", value, "taskbeginsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskbeginsendflagIn(List<String> values) {
            addCriterion("TASKBEGINSENDFLAG in", values, "taskbeginsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskbeginsendflagNotIn(List<String> values) {
            addCriterion("TASKBEGINSENDFLAG not in", values, "taskbeginsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskbeginsendflagBetween(String value1, String value2) {
            addCriterion("TASKBEGINSENDFLAG between", value1, value2, "taskbeginsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskbeginsendflagNotBetween(String value1, String value2) {
            addCriterion("TASKBEGINSENDFLAG not between", value1, value2, "taskbeginsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskendsendflagIsNull() {
            addCriterion("TASKENDSENDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andTaskendsendflagIsNotNull() {
            addCriterion("TASKENDSENDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTaskendsendflagEqualTo(String value) {
            addCriterion("TASKENDSENDFLAG =", value, "taskendsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskendsendflagNotEqualTo(String value) {
            addCriterion("TASKENDSENDFLAG <>", value, "taskendsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskendsendflagGreaterThan(String value) {
            addCriterion("TASKENDSENDFLAG >", value, "taskendsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskendsendflagGreaterThanOrEqualTo(String value) {
            addCriterion("TASKENDSENDFLAG >=", value, "taskendsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskendsendflagLessThan(String value) {
            addCriterion("TASKENDSENDFLAG <", value, "taskendsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskendsendflagLessThanOrEqualTo(String value) {
            addCriterion("TASKENDSENDFLAG <=", value, "taskendsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskendsendflagLike(String value) {
            addCriterion("TASKENDSENDFLAG like", value, "taskendsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskendsendflagNotLike(String value) {
            addCriterion("TASKENDSENDFLAG not like", value, "taskendsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskendsendflagIn(List<String> values) {
            addCriterion("TASKENDSENDFLAG in", values, "taskendsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskendsendflagNotIn(List<String> values) {
            addCriterion("TASKENDSENDFLAG not in", values, "taskendsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskendsendflagBetween(String value1, String value2) {
            addCriterion("TASKENDSENDFLAG between", value1, value2, "taskendsendflag");
            return (Criteria) this;
        }

        public Criteria andTaskendsendflagNotBetween(String value1, String value2) {
            addCriterion("TASKENDSENDFLAG not between", value1, value2, "taskendsendflag");
            return (Criteria) this;
        }

        public Criteria andReportsendflagIsNull() {
            addCriterion("REPORTSENDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andReportsendflagIsNotNull() {
            addCriterion("REPORTSENDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReportsendflagEqualTo(String value) {
            addCriterion("REPORTSENDFLAG =", value, "reportsendflag");
            return (Criteria) this;
        }

        public Criteria andReportsendflagNotEqualTo(String value) {
            addCriterion("REPORTSENDFLAG <>", value, "reportsendflag");
            return (Criteria) this;
        }

        public Criteria andReportsendflagGreaterThan(String value) {
            addCriterion("REPORTSENDFLAG >", value, "reportsendflag");
            return (Criteria) this;
        }

        public Criteria andReportsendflagGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTSENDFLAG >=", value, "reportsendflag");
            return (Criteria) this;
        }

        public Criteria andReportsendflagLessThan(String value) {
            addCriterion("REPORTSENDFLAG <", value, "reportsendflag");
            return (Criteria) this;
        }

        public Criteria andReportsendflagLessThanOrEqualTo(String value) {
            addCriterion("REPORTSENDFLAG <=", value, "reportsendflag");
            return (Criteria) this;
        }

        public Criteria andReportsendflagLike(String value) {
            addCriterion("REPORTSENDFLAG like", value, "reportsendflag");
            return (Criteria) this;
        }

        public Criteria andReportsendflagNotLike(String value) {
            addCriterion("REPORTSENDFLAG not like", value, "reportsendflag");
            return (Criteria) this;
        }

        public Criteria andReportsendflagIn(List<String> values) {
            addCriterion("REPORTSENDFLAG in", values, "reportsendflag");
            return (Criteria) this;
        }

        public Criteria andReportsendflagNotIn(List<String> values) {
            addCriterion("REPORTSENDFLAG not in", values, "reportsendflag");
            return (Criteria) this;
        }

        public Criteria andReportsendflagBetween(String value1, String value2) {
            addCriterion("REPORTSENDFLAG between", value1, value2, "reportsendflag");
            return (Criteria) this;
        }

        public Criteria andReportsendflagNotBetween(String value1, String value2) {
            addCriterion("REPORTSENDFLAG not between", value1, value2, "reportsendflag");
            return (Criteria) this;
        }

        public Criteria andSavetotemplateflagIsNull() {
            addCriterion("SAVETOTEMPLATEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andSavetotemplateflagIsNotNull() {
            addCriterion("SAVETOTEMPLATEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSavetotemplateflagEqualTo(String value) {
            addCriterion("SAVETOTEMPLATEFLAG =", value, "savetotemplateflag");
            return (Criteria) this;
        }

        public Criteria andSavetotemplateflagNotEqualTo(String value) {
            addCriterion("SAVETOTEMPLATEFLAG <>", value, "savetotemplateflag");
            return (Criteria) this;
        }

        public Criteria andSavetotemplateflagGreaterThan(String value) {
            addCriterion("SAVETOTEMPLATEFLAG >", value, "savetotemplateflag");
            return (Criteria) this;
        }

        public Criteria andSavetotemplateflagGreaterThanOrEqualTo(String value) {
            addCriterion("SAVETOTEMPLATEFLAG >=", value, "savetotemplateflag");
            return (Criteria) this;
        }

        public Criteria andSavetotemplateflagLessThan(String value) {
            addCriterion("SAVETOTEMPLATEFLAG <", value, "savetotemplateflag");
            return (Criteria) this;
        }

        public Criteria andSavetotemplateflagLessThanOrEqualTo(String value) {
            addCriterion("SAVETOTEMPLATEFLAG <=", value, "savetotemplateflag");
            return (Criteria) this;
        }

        public Criteria andSavetotemplateflagLike(String value) {
            addCriterion("SAVETOTEMPLATEFLAG like", value, "savetotemplateflag");
            return (Criteria) this;
        }

        public Criteria andSavetotemplateflagNotLike(String value) {
            addCriterion("SAVETOTEMPLATEFLAG not like", value, "savetotemplateflag");
            return (Criteria) this;
        }

        public Criteria andSavetotemplateflagIn(List<String> values) {
            addCriterion("SAVETOTEMPLATEFLAG in", values, "savetotemplateflag");
            return (Criteria) this;
        }

        public Criteria andSavetotemplateflagNotIn(List<String> values) {
            addCriterion("SAVETOTEMPLATEFLAG not in", values, "savetotemplateflag");
            return (Criteria) this;
        }

        public Criteria andSavetotemplateflagBetween(String value1, String value2) {
            addCriterion("SAVETOTEMPLATEFLAG between", value1, value2, "savetotemplateflag");
            return (Criteria) this;
        }

        public Criteria andSavetotemplateflagNotBetween(String value1, String value2) {
            addCriterion("SAVETOTEMPLATEFLAG not between", value1, value2, "savetotemplateflag");
            return (Criteria) this;
        }

        public Criteria andReceiptsendflagIsNull() {
            addCriterion("RECEIPTSENDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andReceiptsendflagIsNotNull() {
            addCriterion("RECEIPTSENDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptsendflagEqualTo(String value) {
            addCriterion("RECEIPTSENDFLAG =", value, "receiptsendflag");
            return (Criteria) this;
        }

        public Criteria andReceiptsendflagNotEqualTo(String value) {
            addCriterion("RECEIPTSENDFLAG <>", value, "receiptsendflag");
            return (Criteria) this;
        }

        public Criteria andReceiptsendflagGreaterThan(String value) {
            addCriterion("RECEIPTSENDFLAG >", value, "receiptsendflag");
            return (Criteria) this;
        }

        public Criteria andReceiptsendflagGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIPTSENDFLAG >=", value, "receiptsendflag");
            return (Criteria) this;
        }

        public Criteria andReceiptsendflagLessThan(String value) {
            addCriterion("RECEIPTSENDFLAG <", value, "receiptsendflag");
            return (Criteria) this;
        }

        public Criteria andReceiptsendflagLessThanOrEqualTo(String value) {
            addCriterion("RECEIPTSENDFLAG <=", value, "receiptsendflag");
            return (Criteria) this;
        }

        public Criteria andReceiptsendflagLike(String value) {
            addCriterion("RECEIPTSENDFLAG like", value, "receiptsendflag");
            return (Criteria) this;
        }

        public Criteria andReceiptsendflagNotLike(String value) {
            addCriterion("RECEIPTSENDFLAG not like", value, "receiptsendflag");
            return (Criteria) this;
        }

        public Criteria andReceiptsendflagIn(List<String> values) {
            addCriterion("RECEIPTSENDFLAG in", values, "receiptsendflag");
            return (Criteria) this;
        }

        public Criteria andReceiptsendflagNotIn(List<String> values) {
            addCriterion("RECEIPTSENDFLAG not in", values, "receiptsendflag");
            return (Criteria) this;
        }

        public Criteria andReceiptsendflagBetween(String value1, String value2) {
            addCriterion("RECEIPTSENDFLAG between", value1, value2, "receiptsendflag");
            return (Criteria) this;
        }

        public Criteria andReceiptsendflagNotBetween(String value1, String value2) {
            addCriterion("RECEIPTSENDFLAG not between", value1, value2, "receiptsendflag");
            return (Criteria) this;
        }

        public Criteria andQuotaionsendflagIsNull() {
            addCriterion("QUOTAIONSENDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andQuotaionsendflagIsNotNull() {
            addCriterion("QUOTAIONSENDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andQuotaionsendflagEqualTo(String value) {
            addCriterion("QUOTAIONSENDFLAG =", value, "quotaionsendflag");
            return (Criteria) this;
        }

        public Criteria andQuotaionsendflagNotEqualTo(String value) {
            addCriterion("QUOTAIONSENDFLAG <>", value, "quotaionsendflag");
            return (Criteria) this;
        }

        public Criteria andQuotaionsendflagGreaterThan(String value) {
            addCriterion("QUOTAIONSENDFLAG >", value, "quotaionsendflag");
            return (Criteria) this;
        }

        public Criteria andQuotaionsendflagGreaterThanOrEqualTo(String value) {
            addCriterion("QUOTAIONSENDFLAG >=", value, "quotaionsendflag");
            return (Criteria) this;
        }

        public Criteria andQuotaionsendflagLessThan(String value) {
            addCriterion("QUOTAIONSENDFLAG <", value, "quotaionsendflag");
            return (Criteria) this;
        }

        public Criteria andQuotaionsendflagLessThanOrEqualTo(String value) {
            addCriterion("QUOTAIONSENDFLAG <=", value, "quotaionsendflag");
            return (Criteria) this;
        }

        public Criteria andQuotaionsendflagLike(String value) {
            addCriterion("QUOTAIONSENDFLAG like", value, "quotaionsendflag");
            return (Criteria) this;
        }

        public Criteria andQuotaionsendflagNotLike(String value) {
            addCriterion("QUOTAIONSENDFLAG not like", value, "quotaionsendflag");
            return (Criteria) this;
        }

        public Criteria andQuotaionsendflagIn(List<String> values) {
            addCriterion("QUOTAIONSENDFLAG in", values, "quotaionsendflag");
            return (Criteria) this;
        }

        public Criteria andQuotaionsendflagNotIn(List<String> values) {
            addCriterion("QUOTAIONSENDFLAG not in", values, "quotaionsendflag");
            return (Criteria) this;
        }

        public Criteria andQuotaionsendflagBetween(String value1, String value2) {
            addCriterion("QUOTAIONSENDFLAG between", value1, value2, "quotaionsendflag");
            return (Criteria) this;
        }

        public Criteria andQuotaionsendflagNotBetween(String value1, String value2) {
            addCriterion("QUOTAIONSENDFLAG not between", value1, value2, "quotaionsendflag");
            return (Criteria) this;
        }

        public Criteria andTestaimIsNull() {
            addCriterion("TESTAIM is null");
            return (Criteria) this;
        }

        public Criteria andTestaimIsNotNull() {
            addCriterion("TESTAIM is not null");
            return (Criteria) this;
        }

        public Criteria andTestaimEqualTo(String value) {
            addCriterion("TESTAIM =", value, "testaim");
            return (Criteria) this;
        }

        public Criteria andTestaimNotEqualTo(String value) {
            addCriterion("TESTAIM <>", value, "testaim");
            return (Criteria) this;
        }

        public Criteria andTestaimGreaterThan(String value) {
            addCriterion("TESTAIM >", value, "testaim");
            return (Criteria) this;
        }

        public Criteria andTestaimGreaterThanOrEqualTo(String value) {
            addCriterion("TESTAIM >=", value, "testaim");
            return (Criteria) this;
        }

        public Criteria andTestaimLessThan(String value) {
            addCriterion("TESTAIM <", value, "testaim");
            return (Criteria) this;
        }

        public Criteria andTestaimLessThanOrEqualTo(String value) {
            addCriterion("TESTAIM <=", value, "testaim");
            return (Criteria) this;
        }

        public Criteria andTestaimLike(String value) {
            addCriterion("TESTAIM like", value, "testaim");
            return (Criteria) this;
        }

        public Criteria andTestaimNotLike(String value) {
            addCriterion("TESTAIM not like", value, "testaim");
            return (Criteria) this;
        }

        public Criteria andTestaimIn(List<String> values) {
            addCriterion("TESTAIM in", values, "testaim");
            return (Criteria) this;
        }

        public Criteria andTestaimNotIn(List<String> values) {
            addCriterion("TESTAIM not in", values, "testaim");
            return (Criteria) this;
        }

        public Criteria andTestaimBetween(String value1, String value2) {
            addCriterion("TESTAIM between", value1, value2, "testaim");
            return (Criteria) this;
        }

        public Criteria andTestaimNotBetween(String value1, String value2) {
            addCriterion("TESTAIM not between", value1, value2, "testaim");
            return (Criteria) this;
        }

        public Criteria andProgressneedIsNull() {
            addCriterion("PROGRESSNEED is null");
            return (Criteria) this;
        }

        public Criteria andProgressneedIsNotNull() {
            addCriterion("PROGRESSNEED is not null");
            return (Criteria) this;
        }

        public Criteria andProgressneedEqualTo(String value) {
            addCriterion("PROGRESSNEED =", value, "progressneed");
            return (Criteria) this;
        }

        public Criteria andProgressneedNotEqualTo(String value) {
            addCriterion("PROGRESSNEED <>", value, "progressneed");
            return (Criteria) this;
        }

        public Criteria andProgressneedGreaterThan(String value) {
            addCriterion("PROGRESSNEED >", value, "progressneed");
            return (Criteria) this;
        }

        public Criteria andProgressneedGreaterThanOrEqualTo(String value) {
            addCriterion("PROGRESSNEED >=", value, "progressneed");
            return (Criteria) this;
        }

        public Criteria andProgressneedLessThan(String value) {
            addCriterion("PROGRESSNEED <", value, "progressneed");
            return (Criteria) this;
        }

        public Criteria andProgressneedLessThanOrEqualTo(String value) {
            addCriterion("PROGRESSNEED <=", value, "progressneed");
            return (Criteria) this;
        }

        public Criteria andProgressneedLike(String value) {
            addCriterion("PROGRESSNEED like", value, "progressneed");
            return (Criteria) this;
        }

        public Criteria andProgressneedNotLike(String value) {
            addCriterion("PROGRESSNEED not like", value, "progressneed");
            return (Criteria) this;
        }

        public Criteria andProgressneedIn(List<String> values) {
            addCriterion("PROGRESSNEED in", values, "progressneed");
            return (Criteria) this;
        }

        public Criteria andProgressneedNotIn(List<String> values) {
            addCriterion("PROGRESSNEED not in", values, "progressneed");
            return (Criteria) this;
        }

        public Criteria andProgressneedBetween(String value1, String value2) {
            addCriterion("PROGRESSNEED between", value1, value2, "progressneed");
            return (Criteria) this;
        }

        public Criteria andProgressneedNotBetween(String value1, String value2) {
            addCriterion("PROGRESSNEED not between", value1, value2, "progressneed");
            return (Criteria) this;
        }

        public Criteria andSampledealtypeIsNull() {
            addCriterion("SAMPLEDEALTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSampledealtypeIsNotNull() {
            addCriterion("SAMPLEDEALTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSampledealtypeEqualTo(String value) {
            addCriterion("SAMPLEDEALTYPE =", value, "sampledealtype");
            return (Criteria) this;
        }

        public Criteria andSampledealtypeNotEqualTo(String value) {
            addCriterion("SAMPLEDEALTYPE <>", value, "sampledealtype");
            return (Criteria) this;
        }

        public Criteria andSampledealtypeGreaterThan(String value) {
            addCriterion("SAMPLEDEALTYPE >", value, "sampledealtype");
            return (Criteria) this;
        }

        public Criteria andSampledealtypeGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLEDEALTYPE >=", value, "sampledealtype");
            return (Criteria) this;
        }

        public Criteria andSampledealtypeLessThan(String value) {
            addCriterion("SAMPLEDEALTYPE <", value, "sampledealtype");
            return (Criteria) this;
        }

        public Criteria andSampledealtypeLessThanOrEqualTo(String value) {
            addCriterion("SAMPLEDEALTYPE <=", value, "sampledealtype");
            return (Criteria) this;
        }

        public Criteria andSampledealtypeLike(String value) {
            addCriterion("SAMPLEDEALTYPE like", value, "sampledealtype");
            return (Criteria) this;
        }

        public Criteria andSampledealtypeNotLike(String value) {
            addCriterion("SAMPLEDEALTYPE not like", value, "sampledealtype");
            return (Criteria) this;
        }

        public Criteria andSampledealtypeIn(List<String> values) {
            addCriterion("SAMPLEDEALTYPE in", values, "sampledealtype");
            return (Criteria) this;
        }

        public Criteria andSampledealtypeNotIn(List<String> values) {
            addCriterion("SAMPLEDEALTYPE not in", values, "sampledealtype");
            return (Criteria) this;
        }

        public Criteria andSampledealtypeBetween(String value1, String value2) {
            addCriterion("SAMPLEDEALTYPE between", value1, value2, "sampledealtype");
            return (Criteria) this;
        }

        public Criteria andSampledealtypeNotBetween(String value1, String value2) {
            addCriterion("SAMPLEDEALTYPE not between", value1, value2, "sampledealtype");
            return (Criteria) this;
        }

        public Criteria andProductpropertyIsNull() {
            addCriterion("PRODUCTPROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andProductpropertyIsNotNull() {
            addCriterion("PRODUCTPROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andProductpropertyEqualTo(String value) {
            addCriterion("PRODUCTPROPERTY =", value, "productproperty");
            return (Criteria) this;
        }

        public Criteria andProductpropertyNotEqualTo(String value) {
            addCriterion("PRODUCTPROPERTY <>", value, "productproperty");
            return (Criteria) this;
        }

        public Criteria andProductpropertyGreaterThan(String value) {
            addCriterion("PRODUCTPROPERTY >", value, "productproperty");
            return (Criteria) this;
        }

        public Criteria andProductpropertyGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTPROPERTY >=", value, "productproperty");
            return (Criteria) this;
        }

        public Criteria andProductpropertyLessThan(String value) {
            addCriterion("PRODUCTPROPERTY <", value, "productproperty");
            return (Criteria) this;
        }

        public Criteria andProductpropertyLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTPROPERTY <=", value, "productproperty");
            return (Criteria) this;
        }

        public Criteria andProductpropertyLike(String value) {
            addCriterion("PRODUCTPROPERTY like", value, "productproperty");
            return (Criteria) this;
        }

        public Criteria andProductpropertyNotLike(String value) {
            addCriterion("PRODUCTPROPERTY not like", value, "productproperty");
            return (Criteria) this;
        }

        public Criteria andProductpropertyIn(List<String> values) {
            addCriterion("PRODUCTPROPERTY in", values, "productproperty");
            return (Criteria) this;
        }

        public Criteria andProductpropertyNotIn(List<String> values) {
            addCriterion("PRODUCTPROPERTY not in", values, "productproperty");
            return (Criteria) this;
        }

        public Criteria andProductpropertyBetween(String value1, String value2) {
            addCriterion("PRODUCTPROPERTY between", value1, value2, "productproperty");
            return (Criteria) this;
        }

        public Criteria andProductpropertyNotBetween(String value1, String value2) {
            addCriterion("PRODUCTPROPERTY not between", value1, value2, "productproperty");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("CUSTOMERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("CUSTOMERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("CUSTOMERNAME =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("CUSTOMERNAME <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("CUSTOMERNAME >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAME >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("CUSTOMERNAME <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERNAME <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("CUSTOMERNAME like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("CUSTOMERNAME not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("CUSTOMERNAME in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("CUSTOMERNAME not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAME between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERNAME not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNull() {
            addCriterion("CUSTOMERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNotNull() {
            addCriterion("CUSTOMERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeEqualTo(String value) {
            addCriterion("CUSTOMERTYPE =", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotEqualTo(String value) {
            addCriterion("CUSTOMERTYPE <>", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThan(String value) {
            addCriterion("CUSTOMERTYPE >", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERTYPE >=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThan(String value) {
            addCriterion("CUSTOMERTYPE <", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERTYPE <=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLike(String value) {
            addCriterion("CUSTOMERTYPE like", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotLike(String value) {
            addCriterion("CUSTOMERTYPE not like", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIn(List<String> values) {
            addCriterion("CUSTOMERTYPE in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotIn(List<String> values) {
            addCriterion("CUSTOMERTYPE not in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeBetween(String value1, String value2) {
            addCriterion("CUSTOMERTYPE between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERTYPE not between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andTestrequirementIsNull() {
            addCriterion("TESTREQUIREMENT is null");
            return (Criteria) this;
        }

        public Criteria andTestrequirementIsNotNull() {
            addCriterion("TESTREQUIREMENT is not null");
            return (Criteria) this;
        }

        public Criteria andTestrequirementEqualTo(String value) {
            addCriterion("TESTREQUIREMENT =", value, "testrequirement");
            return (Criteria) this;
        }

        public Criteria andTestrequirementNotEqualTo(String value) {
            addCriterion("TESTREQUIREMENT <>", value, "testrequirement");
            return (Criteria) this;
        }

        public Criteria andTestrequirementGreaterThan(String value) {
            addCriterion("TESTREQUIREMENT >", value, "testrequirement");
            return (Criteria) this;
        }

        public Criteria andTestrequirementGreaterThanOrEqualTo(String value) {
            addCriterion("TESTREQUIREMENT >=", value, "testrequirement");
            return (Criteria) this;
        }

        public Criteria andTestrequirementLessThan(String value) {
            addCriterion("TESTREQUIREMENT <", value, "testrequirement");
            return (Criteria) this;
        }

        public Criteria andTestrequirementLessThanOrEqualTo(String value) {
            addCriterion("TESTREQUIREMENT <=", value, "testrequirement");
            return (Criteria) this;
        }

        public Criteria andTestrequirementLike(String value) {
            addCriterion("TESTREQUIREMENT like", value, "testrequirement");
            return (Criteria) this;
        }

        public Criteria andTestrequirementNotLike(String value) {
            addCriterion("TESTREQUIREMENT not like", value, "testrequirement");
            return (Criteria) this;
        }

        public Criteria andTestrequirementIn(List<String> values) {
            addCriterion("TESTREQUIREMENT in", values, "testrequirement");
            return (Criteria) this;
        }

        public Criteria andTestrequirementNotIn(List<String> values) {
            addCriterion("TESTREQUIREMENT not in", values, "testrequirement");
            return (Criteria) this;
        }

        public Criteria andTestrequirementBetween(String value1, String value2) {
            addCriterion("TESTREQUIREMENT between", value1, value2, "testrequirement");
            return (Criteria) this;
        }

        public Criteria andTestrequirementNotBetween(String value1, String value2) {
            addCriterion("TESTREQUIREMENT not between", value1, value2, "testrequirement");
            return (Criteria) this;
        }

        public Criteria andCheckingpropertyIsNull() {
            addCriterion("CHECKINGPROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andCheckingpropertyIsNotNull() {
            addCriterion("CHECKINGPROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andCheckingpropertyEqualTo(String value) {
            addCriterion("CHECKINGPROPERTY =", value, "checkingproperty");
            return (Criteria) this;
        }

        public Criteria andCheckingpropertyNotEqualTo(String value) {
            addCriterion("CHECKINGPROPERTY <>", value, "checkingproperty");
            return (Criteria) this;
        }

        public Criteria andCheckingpropertyGreaterThan(String value) {
            addCriterion("CHECKINGPROPERTY >", value, "checkingproperty");
            return (Criteria) this;
        }

        public Criteria andCheckingpropertyGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKINGPROPERTY >=", value, "checkingproperty");
            return (Criteria) this;
        }

        public Criteria andCheckingpropertyLessThan(String value) {
            addCriterion("CHECKINGPROPERTY <", value, "checkingproperty");
            return (Criteria) this;
        }

        public Criteria andCheckingpropertyLessThanOrEqualTo(String value) {
            addCriterion("CHECKINGPROPERTY <=", value, "checkingproperty");
            return (Criteria) this;
        }

        public Criteria andCheckingpropertyLike(String value) {
            addCriterion("CHECKINGPROPERTY like", value, "checkingproperty");
            return (Criteria) this;
        }

        public Criteria andCheckingpropertyNotLike(String value) {
            addCriterion("CHECKINGPROPERTY not like", value, "checkingproperty");
            return (Criteria) this;
        }

        public Criteria andCheckingpropertyIn(List<String> values) {
            addCriterion("CHECKINGPROPERTY in", values, "checkingproperty");
            return (Criteria) this;
        }

        public Criteria andCheckingpropertyNotIn(List<String> values) {
            addCriterion("CHECKINGPROPERTY not in", values, "checkingproperty");
            return (Criteria) this;
        }

        public Criteria andCheckingpropertyBetween(String value1, String value2) {
            addCriterion("CHECKINGPROPERTY between", value1, value2, "checkingproperty");
            return (Criteria) this;
        }

        public Criteria andCheckingpropertyNotBetween(String value1, String value2) {
            addCriterion("CHECKINGPROPERTY not between", value1, value2, "checkingproperty");
            return (Criteria) this;
        }

        public Criteria andProductlineIsNull() {
            addCriterion("PRODUCTLINE is null");
            return (Criteria) this;
        }

        public Criteria andProductlineIsNotNull() {
            addCriterion("PRODUCTLINE is not null");
            return (Criteria) this;
        }

        public Criteria andProductlineEqualTo(String value) {
            addCriterion("PRODUCTLINE =", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineNotEqualTo(String value) {
            addCriterion("PRODUCTLINE <>", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineGreaterThan(String value) {
            addCriterion("PRODUCTLINE >", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTLINE >=", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineLessThan(String value) {
            addCriterion("PRODUCTLINE <", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTLINE <=", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineLike(String value) {
            addCriterion("PRODUCTLINE like", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineNotLike(String value) {
            addCriterion("PRODUCTLINE not like", value, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineIn(List<String> values) {
            addCriterion("PRODUCTLINE in", values, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineNotIn(List<String> values) {
            addCriterion("PRODUCTLINE not in", values, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineBetween(String value1, String value2) {
            addCriterion("PRODUCTLINE between", value1, value2, "productline");
            return (Criteria) this;
        }

        public Criteria andProductlineNotBetween(String value1, String value2) {
            addCriterion("PRODUCTLINE not between", value1, value2, "productline");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNull() {
            addCriterion("BATCHNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNotNull() {
            addCriterion("BATCHNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberEqualTo(String value) {
            addCriterion("BATCHNUMBER =", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotEqualTo(String value) {
            addCriterion("BATCHNUMBER <>", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThan(String value) {
            addCriterion("BATCHNUMBER >", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHNUMBER >=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThan(String value) {
            addCriterion("BATCHNUMBER <", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThanOrEqualTo(String value) {
            addCriterion("BATCHNUMBER <=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLike(String value) {
            addCriterion("BATCHNUMBER like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotLike(String value) {
            addCriterion("BATCHNUMBER not like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIn(List<String> values) {
            addCriterion("BATCHNUMBER in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotIn(List<String> values) {
            addCriterion("BATCHNUMBER not in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberBetween(String value1, String value2) {
            addCriterion("BATCHNUMBER between", value1, value2, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotBetween(String value1, String value2) {
            addCriterion("BATCHNUMBER not between", value1, value2, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andProductdateIsNull() {
            addCriterion("PRODUCTDATE is null");
            return (Criteria) this;
        }

        public Criteria andProductdateIsNotNull() {
            addCriterion("PRODUCTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andProductdateEqualTo(String value) {
            addCriterion("PRODUCTDATE =", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateNotEqualTo(String value) {
            addCriterion("PRODUCTDATE <>", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateGreaterThan(String value) {
            addCriterion("PRODUCTDATE >", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTDATE >=", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateLessThan(String value) {
            addCriterion("PRODUCTDATE <", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTDATE <=", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateLike(String value) {
            addCriterion("PRODUCTDATE like", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateNotLike(String value) {
            addCriterion("PRODUCTDATE not like", value, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateIn(List<String> values) {
            addCriterion("PRODUCTDATE in", values, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateNotIn(List<String> values) {
            addCriterion("PRODUCTDATE not in", values, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateBetween(String value1, String value2) {
            addCriterion("PRODUCTDATE between", value1, value2, "productdate");
            return (Criteria) this;
        }

        public Criteria andProductdateNotBetween(String value1, String value2) {
            addCriterion("PRODUCTDATE not between", value1, value2, "productdate");
            return (Criteria) this;
        }

        public Criteria andBatchserialIsNull() {
            addCriterion("BATCHSERIAL is null");
            return (Criteria) this;
        }

        public Criteria andBatchserialIsNotNull() {
            addCriterion("BATCHSERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andBatchserialEqualTo(String value) {
            addCriterion("BATCHSERIAL =", value, "batchserial");
            return (Criteria) this;
        }

        public Criteria andBatchserialNotEqualTo(String value) {
            addCriterion("BATCHSERIAL <>", value, "batchserial");
            return (Criteria) this;
        }

        public Criteria andBatchserialGreaterThan(String value) {
            addCriterion("BATCHSERIAL >", value, "batchserial");
            return (Criteria) this;
        }

        public Criteria andBatchserialGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHSERIAL >=", value, "batchserial");
            return (Criteria) this;
        }

        public Criteria andBatchserialLessThan(String value) {
            addCriterion("BATCHSERIAL <", value, "batchserial");
            return (Criteria) this;
        }

        public Criteria andBatchserialLessThanOrEqualTo(String value) {
            addCriterion("BATCHSERIAL <=", value, "batchserial");
            return (Criteria) this;
        }

        public Criteria andBatchserialLike(String value) {
            addCriterion("BATCHSERIAL like", value, "batchserial");
            return (Criteria) this;
        }

        public Criteria andBatchserialNotLike(String value) {
            addCriterion("BATCHSERIAL not like", value, "batchserial");
            return (Criteria) this;
        }

        public Criteria andBatchserialIn(List<String> values) {
            addCriterion("BATCHSERIAL in", values, "batchserial");
            return (Criteria) this;
        }

        public Criteria andBatchserialNotIn(List<String> values) {
            addCriterion("BATCHSERIAL not in", values, "batchserial");
            return (Criteria) this;
        }

        public Criteria andBatchserialBetween(String value1, String value2) {
            addCriterion("BATCHSERIAL between", value1, value2, "batchserial");
            return (Criteria) this;
        }

        public Criteria andBatchserialNotBetween(String value1, String value2) {
            addCriterion("BATCHSERIAL not between", value1, value2, "batchserial");
            return (Criteria) this;
        }

        public Criteria andIdentificationtypeIsNull() {
            addCriterion("IDENTIFICATIONTYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdentificationtypeIsNotNull() {
            addCriterion("IDENTIFICATIONTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdentificationtypeEqualTo(String value) {
            addCriterion("IDENTIFICATIONTYPE =", value, "identificationtype");
            return (Criteria) this;
        }

        public Criteria andIdentificationtypeNotEqualTo(String value) {
            addCriterion("IDENTIFICATIONTYPE <>", value, "identificationtype");
            return (Criteria) this;
        }

        public Criteria andIdentificationtypeGreaterThan(String value) {
            addCriterion("IDENTIFICATIONTYPE >", value, "identificationtype");
            return (Criteria) this;
        }

        public Criteria andIdentificationtypeGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTIFICATIONTYPE >=", value, "identificationtype");
            return (Criteria) this;
        }

        public Criteria andIdentificationtypeLessThan(String value) {
            addCriterion("IDENTIFICATIONTYPE <", value, "identificationtype");
            return (Criteria) this;
        }

        public Criteria andIdentificationtypeLessThanOrEqualTo(String value) {
            addCriterion("IDENTIFICATIONTYPE <=", value, "identificationtype");
            return (Criteria) this;
        }

        public Criteria andIdentificationtypeLike(String value) {
            addCriterion("IDENTIFICATIONTYPE like", value, "identificationtype");
            return (Criteria) this;
        }

        public Criteria andIdentificationtypeNotLike(String value) {
            addCriterion("IDENTIFICATIONTYPE not like", value, "identificationtype");
            return (Criteria) this;
        }

        public Criteria andIdentificationtypeIn(List<String> values) {
            addCriterion("IDENTIFICATIONTYPE in", values, "identificationtype");
            return (Criteria) this;
        }

        public Criteria andIdentificationtypeNotIn(List<String> values) {
            addCriterion("IDENTIFICATIONTYPE not in", values, "identificationtype");
            return (Criteria) this;
        }

        public Criteria andIdentificationtypeBetween(String value1, String value2) {
            addCriterion("IDENTIFICATIONTYPE between", value1, value2, "identificationtype");
            return (Criteria) this;
        }

        public Criteria andIdentificationtypeNotBetween(String value1, String value2) {
            addCriterion("IDENTIFICATIONTYPE not between", value1, value2, "identificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeIsNull() {
            addCriterion("CERTIFICATIONTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeIsNotNull() {
            addCriterion("CERTIFICATIONTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeEqualTo(String value) {
            addCriterion("CERTIFICATIONTYPE =", value, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeNotEqualTo(String value) {
            addCriterion("CERTIFICATIONTYPE <>", value, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeGreaterThan(String value) {
            addCriterion("CERTIFICATIONTYPE >", value, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATIONTYPE >=", value, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeLessThan(String value) {
            addCriterion("CERTIFICATIONTYPE <", value, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATIONTYPE <=", value, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeLike(String value) {
            addCriterion("CERTIFICATIONTYPE like", value, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeNotLike(String value) {
            addCriterion("CERTIFICATIONTYPE not like", value, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeIn(List<String> values) {
            addCriterion("CERTIFICATIONTYPE in", values, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeNotIn(List<String> values) {
            addCriterion("CERTIFICATIONTYPE not in", values, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeBetween(String value1, String value2) {
            addCriterion("CERTIFICATIONTYPE between", value1, value2, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andCertificationtypeNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATIONTYPE not between", value1, value2, "certificationtype");
            return (Criteria) this;
        }

        public Criteria andItemnumberIsNull() {
            addCriterion("ITEMNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andItemnumberIsNotNull() {
            addCriterion("ITEMNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andItemnumberEqualTo(String value) {
            addCriterion("ITEMNUMBER =", value, "itemnumber");
            return (Criteria) this;
        }

        public Criteria andItemnumberNotEqualTo(String value) {
            addCriterion("ITEMNUMBER <>", value, "itemnumber");
            return (Criteria) this;
        }

        public Criteria andItemnumberGreaterThan(String value) {
            addCriterion("ITEMNUMBER >", value, "itemnumber");
            return (Criteria) this;
        }

        public Criteria andItemnumberGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMNUMBER >=", value, "itemnumber");
            return (Criteria) this;
        }

        public Criteria andItemnumberLessThan(String value) {
            addCriterion("ITEMNUMBER <", value, "itemnumber");
            return (Criteria) this;
        }

        public Criteria andItemnumberLessThanOrEqualTo(String value) {
            addCriterion("ITEMNUMBER <=", value, "itemnumber");
            return (Criteria) this;
        }

        public Criteria andItemnumberLike(String value) {
            addCriterion("ITEMNUMBER like", value, "itemnumber");
            return (Criteria) this;
        }

        public Criteria andItemnumberNotLike(String value) {
            addCriterion("ITEMNUMBER not like", value, "itemnumber");
            return (Criteria) this;
        }

        public Criteria andItemnumberIn(List<String> values) {
            addCriterion("ITEMNUMBER in", values, "itemnumber");
            return (Criteria) this;
        }

        public Criteria andItemnumberNotIn(List<String> values) {
            addCriterion("ITEMNUMBER not in", values, "itemnumber");
            return (Criteria) this;
        }

        public Criteria andItemnumberBetween(String value1, String value2) {
            addCriterion("ITEMNUMBER between", value1, value2, "itemnumber");
            return (Criteria) this;
        }

        public Criteria andItemnumberNotBetween(String value1, String value2) {
            addCriterion("ITEMNUMBER not between", value1, value2, "itemnumber");
            return (Criteria) this;
        }

        public Criteria andDocstatusIsNull() {
            addCriterion("DOCSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andDocstatusIsNotNull() {
            addCriterion("DOCSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDocstatusEqualTo(String value) {
            addCriterion("DOCSTATUS =", value, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusNotEqualTo(String value) {
            addCriterion("DOCSTATUS <>", value, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusGreaterThan(String value) {
            addCriterion("DOCSTATUS >", value, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusGreaterThanOrEqualTo(String value) {
            addCriterion("DOCSTATUS >=", value, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusLessThan(String value) {
            addCriterion("DOCSTATUS <", value, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusLessThanOrEqualTo(String value) {
            addCriterion("DOCSTATUS <=", value, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusLike(String value) {
            addCriterion("DOCSTATUS like", value, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusNotLike(String value) {
            addCriterion("DOCSTATUS not like", value, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusIn(List<String> values) {
            addCriterion("DOCSTATUS in", values, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusNotIn(List<String> values) {
            addCriterion("DOCSTATUS not in", values, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusBetween(String value1, String value2) {
            addCriterion("DOCSTATUS between", value1, value2, "docstatus");
            return (Criteria) this;
        }

        public Criteria andDocstatusNotBetween(String value1, String value2) {
            addCriterion("DOCSTATUS not between", value1, value2, "docstatus");
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

        public Criteria andDef21IsNull() {
            addCriterion("DEF21 is null");
            return (Criteria) this;
        }

        public Criteria andDef21IsNotNull() {
            addCriterion("DEF21 is not null");
            return (Criteria) this;
        }

        public Criteria andDef21EqualTo(String value) {
            addCriterion("DEF21 =", value, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21NotEqualTo(String value) {
            addCriterion("DEF21 <>", value, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21GreaterThan(String value) {
            addCriterion("DEF21 >", value, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21GreaterThanOrEqualTo(String value) {
            addCriterion("DEF21 >=", value, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21LessThan(String value) {
            addCriterion("DEF21 <", value, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21LessThanOrEqualTo(String value) {
            addCriterion("DEF21 <=", value, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21Like(String value) {
            addCriterion("DEF21 like", value, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21NotLike(String value) {
            addCriterion("DEF21 not like", value, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21In(List<String> values) {
            addCriterion("DEF21 in", values, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21NotIn(List<String> values) {
            addCriterion("DEF21 not in", values, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21Between(String value1, String value2) {
            addCriterion("DEF21 between", value1, value2, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21NotBetween(String value1, String value2) {
            addCriterion("DEF21 not between", value1, value2, "def21");
            return (Criteria) this;
        }

        public Criteria andDef22IsNull() {
            addCriterion("DEF22 is null");
            return (Criteria) this;
        }

        public Criteria andDef22IsNotNull() {
            addCriterion("DEF22 is not null");
            return (Criteria) this;
        }

        public Criteria andDef22EqualTo(String value) {
            addCriterion("DEF22 =", value, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22NotEqualTo(String value) {
            addCriterion("DEF22 <>", value, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22GreaterThan(String value) {
            addCriterion("DEF22 >", value, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22GreaterThanOrEqualTo(String value) {
            addCriterion("DEF22 >=", value, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22LessThan(String value) {
            addCriterion("DEF22 <", value, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22LessThanOrEqualTo(String value) {
            addCriterion("DEF22 <=", value, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22Like(String value) {
            addCriterion("DEF22 like", value, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22NotLike(String value) {
            addCriterion("DEF22 not like", value, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22In(List<String> values) {
            addCriterion("DEF22 in", values, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22NotIn(List<String> values) {
            addCriterion("DEF22 not in", values, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22Between(String value1, String value2) {
            addCriterion("DEF22 between", value1, value2, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22NotBetween(String value1, String value2) {
            addCriterion("DEF22 not between", value1, value2, "def22");
            return (Criteria) this;
        }

        public Criteria andDef23IsNull() {
            addCriterion("DEF23 is null");
            return (Criteria) this;
        }

        public Criteria andDef23IsNotNull() {
            addCriterion("DEF23 is not null");
            return (Criteria) this;
        }

        public Criteria andDef23EqualTo(String value) {
            addCriterion("DEF23 =", value, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23NotEqualTo(String value) {
            addCriterion("DEF23 <>", value, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23GreaterThan(String value) {
            addCriterion("DEF23 >", value, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23GreaterThanOrEqualTo(String value) {
            addCriterion("DEF23 >=", value, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23LessThan(String value) {
            addCriterion("DEF23 <", value, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23LessThanOrEqualTo(String value) {
            addCriterion("DEF23 <=", value, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23Like(String value) {
            addCriterion("DEF23 like", value, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23NotLike(String value) {
            addCriterion("DEF23 not like", value, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23In(List<String> values) {
            addCriterion("DEF23 in", values, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23NotIn(List<String> values) {
            addCriterion("DEF23 not in", values, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23Between(String value1, String value2) {
            addCriterion("DEF23 between", value1, value2, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23NotBetween(String value1, String value2) {
            addCriterion("DEF23 not between", value1, value2, "def23");
            return (Criteria) this;
        }

        public Criteria andDef24IsNull() {
            addCriterion("DEF24 is null");
            return (Criteria) this;
        }

        public Criteria andDef24IsNotNull() {
            addCriterion("DEF24 is not null");
            return (Criteria) this;
        }

        public Criteria andDef24EqualTo(String value) {
            addCriterion("DEF24 =", value, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24NotEqualTo(String value) {
            addCriterion("DEF24 <>", value, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24GreaterThan(String value) {
            addCriterion("DEF24 >", value, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24GreaterThanOrEqualTo(String value) {
            addCriterion("DEF24 >=", value, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24LessThan(String value) {
            addCriterion("DEF24 <", value, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24LessThanOrEqualTo(String value) {
            addCriterion("DEF24 <=", value, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24Like(String value) {
            addCriterion("DEF24 like", value, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24NotLike(String value) {
            addCriterion("DEF24 not like", value, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24In(List<String> values) {
            addCriterion("DEF24 in", values, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24NotIn(List<String> values) {
            addCriterion("DEF24 not in", values, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24Between(String value1, String value2) {
            addCriterion("DEF24 between", value1, value2, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24NotBetween(String value1, String value2) {
            addCriterion("DEF24 not between", value1, value2, "def24");
            return (Criteria) this;
        }

        public Criteria andDef25IsNull() {
            addCriterion("DEF25 is null");
            return (Criteria) this;
        }

        public Criteria andDef25IsNotNull() {
            addCriterion("DEF25 is not null");
            return (Criteria) this;
        }

        public Criteria andDef25EqualTo(String value) {
            addCriterion("DEF25 =", value, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25NotEqualTo(String value) {
            addCriterion("DEF25 <>", value, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25GreaterThan(String value) {
            addCriterion("DEF25 >", value, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25GreaterThanOrEqualTo(String value) {
            addCriterion("DEF25 >=", value, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25LessThan(String value) {
            addCriterion("DEF25 <", value, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25LessThanOrEqualTo(String value) {
            addCriterion("DEF25 <=", value, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25Like(String value) {
            addCriterion("DEF25 like", value, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25NotLike(String value) {
            addCriterion("DEF25 not like", value, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25In(List<String> values) {
            addCriterion("DEF25 in", values, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25NotIn(List<String> values) {
            addCriterion("DEF25 not in", values, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25Between(String value1, String value2) {
            addCriterion("DEF25 between", value1, value2, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25NotBetween(String value1, String value2) {
            addCriterion("DEF25 not between", value1, value2, "def25");
            return (Criteria) this;
        }

        public Criteria andDef26IsNull() {
            addCriterion("DEF26 is null");
            return (Criteria) this;
        }

        public Criteria andDef26IsNotNull() {
            addCriterion("DEF26 is not null");
            return (Criteria) this;
        }

        public Criteria andDef26EqualTo(String value) {
            addCriterion("DEF26 =", value, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26NotEqualTo(String value) {
            addCriterion("DEF26 <>", value, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26GreaterThan(String value) {
            addCriterion("DEF26 >", value, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26GreaterThanOrEqualTo(String value) {
            addCriterion("DEF26 >=", value, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26LessThan(String value) {
            addCriterion("DEF26 <", value, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26LessThanOrEqualTo(String value) {
            addCriterion("DEF26 <=", value, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26Like(String value) {
            addCriterion("DEF26 like", value, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26NotLike(String value) {
            addCriterion("DEF26 not like", value, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26In(List<String> values) {
            addCriterion("DEF26 in", values, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26NotIn(List<String> values) {
            addCriterion("DEF26 not in", values, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26Between(String value1, String value2) {
            addCriterion("DEF26 between", value1, value2, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26NotBetween(String value1, String value2) {
            addCriterion("DEF26 not between", value1, value2, "def26");
            return (Criteria) this;
        }

        public Criteria andDef27IsNull() {
            addCriterion("DEF27 is null");
            return (Criteria) this;
        }

        public Criteria andDef27IsNotNull() {
            addCriterion("DEF27 is not null");
            return (Criteria) this;
        }

        public Criteria andDef27EqualTo(String value) {
            addCriterion("DEF27 =", value, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27NotEqualTo(String value) {
            addCriterion("DEF27 <>", value, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27GreaterThan(String value) {
            addCriterion("DEF27 >", value, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27GreaterThanOrEqualTo(String value) {
            addCriterion("DEF27 >=", value, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27LessThan(String value) {
            addCriterion("DEF27 <", value, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27LessThanOrEqualTo(String value) {
            addCriterion("DEF27 <=", value, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27Like(String value) {
            addCriterion("DEF27 like", value, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27NotLike(String value) {
            addCriterion("DEF27 not like", value, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27In(List<String> values) {
            addCriterion("DEF27 in", values, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27NotIn(List<String> values) {
            addCriterion("DEF27 not in", values, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27Between(String value1, String value2) {
            addCriterion("DEF27 between", value1, value2, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27NotBetween(String value1, String value2) {
            addCriterion("DEF27 not between", value1, value2, "def27");
            return (Criteria) this;
        }

        public Criteria andDef28IsNull() {
            addCriterion("DEF28 is null");
            return (Criteria) this;
        }

        public Criteria andDef28IsNotNull() {
            addCriterion("DEF28 is not null");
            return (Criteria) this;
        }

        public Criteria andDef28EqualTo(String value) {
            addCriterion("DEF28 =", value, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28NotEqualTo(String value) {
            addCriterion("DEF28 <>", value, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28GreaterThan(String value) {
            addCriterion("DEF28 >", value, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28GreaterThanOrEqualTo(String value) {
            addCriterion("DEF28 >=", value, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28LessThan(String value) {
            addCriterion("DEF28 <", value, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28LessThanOrEqualTo(String value) {
            addCriterion("DEF28 <=", value, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28Like(String value) {
            addCriterion("DEF28 like", value, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28NotLike(String value) {
            addCriterion("DEF28 not like", value, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28In(List<String> values) {
            addCriterion("DEF28 in", values, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28NotIn(List<String> values) {
            addCriterion("DEF28 not in", values, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28Between(String value1, String value2) {
            addCriterion("DEF28 between", value1, value2, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28NotBetween(String value1, String value2) {
            addCriterion("DEF28 not between", value1, value2, "def28");
            return (Criteria) this;
        }

        public Criteria andDef29IsNull() {
            addCriterion("DEF29 is null");
            return (Criteria) this;
        }

        public Criteria andDef29IsNotNull() {
            addCriterion("DEF29 is not null");
            return (Criteria) this;
        }

        public Criteria andDef29EqualTo(String value) {
            addCriterion("DEF29 =", value, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29NotEqualTo(String value) {
            addCriterion("DEF29 <>", value, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29GreaterThan(String value) {
            addCriterion("DEF29 >", value, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29GreaterThanOrEqualTo(String value) {
            addCriterion("DEF29 >=", value, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29LessThan(String value) {
            addCriterion("DEF29 <", value, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29LessThanOrEqualTo(String value) {
            addCriterion("DEF29 <=", value, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29Like(String value) {
            addCriterion("DEF29 like", value, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29NotLike(String value) {
            addCriterion("DEF29 not like", value, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29In(List<String> values) {
            addCriterion("DEF29 in", values, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29NotIn(List<String> values) {
            addCriterion("DEF29 not in", values, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29Between(String value1, String value2) {
            addCriterion("DEF29 between", value1, value2, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29NotBetween(String value1, String value2) {
            addCriterion("DEF29 not between", value1, value2, "def29");
            return (Criteria) this;
        }

        public Criteria andDef30IsNull() {
            addCriterion("DEF30 is null");
            return (Criteria) this;
        }

        public Criteria andDef30IsNotNull() {
            addCriterion("DEF30 is not null");
            return (Criteria) this;
        }

        public Criteria andDef30EqualTo(String value) {
            addCriterion("DEF30 =", value, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30NotEqualTo(String value) {
            addCriterion("DEF30 <>", value, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30GreaterThan(String value) {
            addCriterion("DEF30 >", value, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30GreaterThanOrEqualTo(String value) {
            addCriterion("DEF30 >=", value, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30LessThan(String value) {
            addCriterion("DEF30 <", value, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30LessThanOrEqualTo(String value) {
            addCriterion("DEF30 <=", value, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30Like(String value) {
            addCriterion("DEF30 like", value, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30NotLike(String value) {
            addCriterion("DEF30 not like", value, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30In(List<String> values) {
            addCriterion("DEF30 in", values, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30NotIn(List<String> values) {
            addCriterion("DEF30 not in", values, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30Between(String value1, String value2) {
            addCriterion("DEF30 between", value1, value2, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30NotBetween(String value1, String value2) {
            addCriterion("DEF30 not between", value1, value2, "def30");
            return (Criteria) this;
        }

        public Criteria andDef31IsNull() {
            addCriterion("DEF31 is null");
            return (Criteria) this;
        }

        public Criteria andDef31IsNotNull() {
            addCriterion("DEF31 is not null");
            return (Criteria) this;
        }

        public Criteria andDef31EqualTo(String value) {
            addCriterion("DEF31 =", value, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31NotEqualTo(String value) {
            addCriterion("DEF31 <>", value, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31GreaterThan(String value) {
            addCriterion("DEF31 >", value, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31GreaterThanOrEqualTo(String value) {
            addCriterion("DEF31 >=", value, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31LessThan(String value) {
            addCriterion("DEF31 <", value, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31LessThanOrEqualTo(String value) {
            addCriterion("DEF31 <=", value, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31Like(String value) {
            addCriterion("DEF31 like", value, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31NotLike(String value) {
            addCriterion("DEF31 not like", value, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31In(List<String> values) {
            addCriterion("DEF31 in", values, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31NotIn(List<String> values) {
            addCriterion("DEF31 not in", values, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31Between(String value1, String value2) {
            addCriterion("DEF31 between", value1, value2, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31NotBetween(String value1, String value2) {
            addCriterion("DEF31 not between", value1, value2, "def31");
            return (Criteria) this;
        }

        public Criteria andDef32IsNull() {
            addCriterion("DEF32 is null");
            return (Criteria) this;
        }

        public Criteria andDef32IsNotNull() {
            addCriterion("DEF32 is not null");
            return (Criteria) this;
        }

        public Criteria andDef32EqualTo(String value) {
            addCriterion("DEF32 =", value, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32NotEqualTo(String value) {
            addCriterion("DEF32 <>", value, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32GreaterThan(String value) {
            addCriterion("DEF32 >", value, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32GreaterThanOrEqualTo(String value) {
            addCriterion("DEF32 >=", value, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32LessThan(String value) {
            addCriterion("DEF32 <", value, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32LessThanOrEqualTo(String value) {
            addCriterion("DEF32 <=", value, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32Like(String value) {
            addCriterion("DEF32 like", value, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32NotLike(String value) {
            addCriterion("DEF32 not like", value, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32In(List<String> values) {
            addCriterion("DEF32 in", values, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32NotIn(List<String> values) {
            addCriterion("DEF32 not in", values, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32Between(String value1, String value2) {
            addCriterion("DEF32 between", value1, value2, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32NotBetween(String value1, String value2) {
            addCriterion("DEF32 not between", value1, value2, "def32");
            return (Criteria) this;
        }

        public Criteria andDef33IsNull() {
            addCriterion("DEF33 is null");
            return (Criteria) this;
        }

        public Criteria andDef33IsNotNull() {
            addCriterion("DEF33 is not null");
            return (Criteria) this;
        }

        public Criteria andDef33EqualTo(String value) {
            addCriterion("DEF33 =", value, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33NotEqualTo(String value) {
            addCriterion("DEF33 <>", value, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33GreaterThan(String value) {
            addCriterion("DEF33 >", value, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33GreaterThanOrEqualTo(String value) {
            addCriterion("DEF33 >=", value, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33LessThan(String value) {
            addCriterion("DEF33 <", value, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33LessThanOrEqualTo(String value) {
            addCriterion("DEF33 <=", value, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33Like(String value) {
            addCriterion("DEF33 like", value, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33NotLike(String value) {
            addCriterion("DEF33 not like", value, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33In(List<String> values) {
            addCriterion("DEF33 in", values, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33NotIn(List<String> values) {
            addCriterion("DEF33 not in", values, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33Between(String value1, String value2) {
            addCriterion("DEF33 between", value1, value2, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33NotBetween(String value1, String value2) {
            addCriterion("DEF33 not between", value1, value2, "def33");
            return (Criteria) this;
        }

        public Criteria andDef34IsNull() {
            addCriterion("DEF34 is null");
            return (Criteria) this;
        }

        public Criteria andDef34IsNotNull() {
            addCriterion("DEF34 is not null");
            return (Criteria) this;
        }

        public Criteria andDef34EqualTo(String value) {
            addCriterion("DEF34 =", value, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34NotEqualTo(String value) {
            addCriterion("DEF34 <>", value, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34GreaterThan(String value) {
            addCriterion("DEF34 >", value, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34GreaterThanOrEqualTo(String value) {
            addCriterion("DEF34 >=", value, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34LessThan(String value) {
            addCriterion("DEF34 <", value, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34LessThanOrEqualTo(String value) {
            addCriterion("DEF34 <=", value, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34Like(String value) {
            addCriterion("DEF34 like", value, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34NotLike(String value) {
            addCriterion("DEF34 not like", value, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34In(List<String> values) {
            addCriterion("DEF34 in", values, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34NotIn(List<String> values) {
            addCriterion("DEF34 not in", values, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34Between(String value1, String value2) {
            addCriterion("DEF34 between", value1, value2, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34NotBetween(String value1, String value2) {
            addCriterion("DEF34 not between", value1, value2, "def34");
            return (Criteria) this;
        }

        public Criteria andDef35IsNull() {
            addCriterion("DEF35 is null");
            return (Criteria) this;
        }

        public Criteria andDef35IsNotNull() {
            addCriterion("DEF35 is not null");
            return (Criteria) this;
        }

        public Criteria andDef35EqualTo(String value) {
            addCriterion("DEF35 =", value, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35NotEqualTo(String value) {
            addCriterion("DEF35 <>", value, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35GreaterThan(String value) {
            addCriterion("DEF35 >", value, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35GreaterThanOrEqualTo(String value) {
            addCriterion("DEF35 >=", value, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35LessThan(String value) {
            addCriterion("DEF35 <", value, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35LessThanOrEqualTo(String value) {
            addCriterion("DEF35 <=", value, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35Like(String value) {
            addCriterion("DEF35 like", value, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35NotLike(String value) {
            addCriterion("DEF35 not like", value, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35In(List<String> values) {
            addCriterion("DEF35 in", values, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35NotIn(List<String> values) {
            addCriterion("DEF35 not in", values, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35Between(String value1, String value2) {
            addCriterion("DEF35 between", value1, value2, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35NotBetween(String value1, String value2) {
            addCriterion("DEF35 not between", value1, value2, "def35");
            return (Criteria) this;
        }

        public Criteria andDef36IsNull() {
            addCriterion("DEF36 is null");
            return (Criteria) this;
        }

        public Criteria andDef36IsNotNull() {
            addCriterion("DEF36 is not null");
            return (Criteria) this;
        }

        public Criteria andDef36EqualTo(String value) {
            addCriterion("DEF36 =", value, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36NotEqualTo(String value) {
            addCriterion("DEF36 <>", value, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36GreaterThan(String value) {
            addCriterion("DEF36 >", value, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36GreaterThanOrEqualTo(String value) {
            addCriterion("DEF36 >=", value, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36LessThan(String value) {
            addCriterion("DEF36 <", value, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36LessThanOrEqualTo(String value) {
            addCriterion("DEF36 <=", value, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36Like(String value) {
            addCriterion("DEF36 like", value, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36NotLike(String value) {
            addCriterion("DEF36 not like", value, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36In(List<String> values) {
            addCriterion("DEF36 in", values, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36NotIn(List<String> values) {
            addCriterion("DEF36 not in", values, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36Between(String value1, String value2) {
            addCriterion("DEF36 between", value1, value2, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36NotBetween(String value1, String value2) {
            addCriterion("DEF36 not between", value1, value2, "def36");
            return (Criteria) this;
        }

        public Criteria andDef37IsNull() {
            addCriterion("DEF37 is null");
            return (Criteria) this;
        }

        public Criteria andDef37IsNotNull() {
            addCriterion("DEF37 is not null");
            return (Criteria) this;
        }

        public Criteria andDef37EqualTo(String value) {
            addCriterion("DEF37 =", value, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37NotEqualTo(String value) {
            addCriterion("DEF37 <>", value, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37GreaterThan(String value) {
            addCriterion("DEF37 >", value, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37GreaterThanOrEqualTo(String value) {
            addCriterion("DEF37 >=", value, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37LessThan(String value) {
            addCriterion("DEF37 <", value, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37LessThanOrEqualTo(String value) {
            addCriterion("DEF37 <=", value, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37Like(String value) {
            addCriterion("DEF37 like", value, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37NotLike(String value) {
            addCriterion("DEF37 not like", value, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37In(List<String> values) {
            addCriterion("DEF37 in", values, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37NotIn(List<String> values) {
            addCriterion("DEF37 not in", values, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37Between(String value1, String value2) {
            addCriterion("DEF37 between", value1, value2, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37NotBetween(String value1, String value2) {
            addCriterion("DEF37 not between", value1, value2, "def37");
            return (Criteria) this;
        }

        public Criteria andDef38IsNull() {
            addCriterion("DEF38 is null");
            return (Criteria) this;
        }

        public Criteria andDef38IsNotNull() {
            addCriterion("DEF38 is not null");
            return (Criteria) this;
        }

        public Criteria andDef38EqualTo(String value) {
            addCriterion("DEF38 =", value, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38NotEqualTo(String value) {
            addCriterion("DEF38 <>", value, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38GreaterThan(String value) {
            addCriterion("DEF38 >", value, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38GreaterThanOrEqualTo(String value) {
            addCriterion("DEF38 >=", value, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38LessThan(String value) {
            addCriterion("DEF38 <", value, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38LessThanOrEqualTo(String value) {
            addCriterion("DEF38 <=", value, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38Like(String value) {
            addCriterion("DEF38 like", value, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38NotLike(String value) {
            addCriterion("DEF38 not like", value, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38In(List<String> values) {
            addCriterion("DEF38 in", values, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38NotIn(List<String> values) {
            addCriterion("DEF38 not in", values, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38Between(String value1, String value2) {
            addCriterion("DEF38 between", value1, value2, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38NotBetween(String value1, String value2) {
            addCriterion("DEF38 not between", value1, value2, "def38");
            return (Criteria) this;
        }

        public Criteria andDef39IsNull() {
            addCriterion("DEF39 is null");
            return (Criteria) this;
        }

        public Criteria andDef39IsNotNull() {
            addCriterion("DEF39 is not null");
            return (Criteria) this;
        }

        public Criteria andDef39EqualTo(String value) {
            addCriterion("DEF39 =", value, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39NotEqualTo(String value) {
            addCriterion("DEF39 <>", value, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39GreaterThan(String value) {
            addCriterion("DEF39 >", value, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39GreaterThanOrEqualTo(String value) {
            addCriterion("DEF39 >=", value, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39LessThan(String value) {
            addCriterion("DEF39 <", value, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39LessThanOrEqualTo(String value) {
            addCriterion("DEF39 <=", value, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39Like(String value) {
            addCriterion("DEF39 like", value, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39NotLike(String value) {
            addCriterion("DEF39 not like", value, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39In(List<String> values) {
            addCriterion("DEF39 in", values, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39NotIn(List<String> values) {
            addCriterion("DEF39 not in", values, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39Between(String value1, String value2) {
            addCriterion("DEF39 between", value1, value2, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39NotBetween(String value1, String value2) {
            addCriterion("DEF39 not between", value1, value2, "def39");
            return (Criteria) this;
        }

        public Criteria andDef40IsNull() {
            addCriterion("DEF40 is null");
            return (Criteria) this;
        }

        public Criteria andDef40IsNotNull() {
            addCriterion("DEF40 is not null");
            return (Criteria) this;
        }

        public Criteria andDef40EqualTo(String value) {
            addCriterion("DEF40 =", value, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40NotEqualTo(String value) {
            addCriterion("DEF40 <>", value, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40GreaterThan(String value) {
            addCriterion("DEF40 >", value, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40GreaterThanOrEqualTo(String value) {
            addCriterion("DEF40 >=", value, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40LessThan(String value) {
            addCriterion("DEF40 <", value, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40LessThanOrEqualTo(String value) {
            addCriterion("DEF40 <=", value, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40Like(String value) {
            addCriterion("DEF40 like", value, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40NotLike(String value) {
            addCriterion("DEF40 not like", value, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40In(List<String> values) {
            addCriterion("DEF40 in", values, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40NotIn(List<String> values) {
            addCriterion("DEF40 not in", values, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40Between(String value1, String value2) {
            addCriterion("DEF40 between", value1, value2, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40NotBetween(String value1, String value2) {
            addCriterion("DEF40 not between", value1, value2, "def40");
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