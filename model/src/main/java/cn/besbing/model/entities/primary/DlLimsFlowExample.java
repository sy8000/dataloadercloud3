package cn.besbing.model.entities.primary;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DlLimsFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DlLimsFlowExample() {
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

        public Criteria andPkLimsFlowIsNull() {
            addCriterion("PK_LIMS_FLOW is null");
            return (Criteria) this;
        }

        public Criteria andPkLimsFlowIsNotNull() {
            addCriterion("PK_LIMS_FLOW is not null");
            return (Criteria) this;
        }

        public Criteria andPkLimsFlowEqualTo(String value) {
            addCriterion("PK_LIMS_FLOW =", value, "pkLimsFlow");
            return (Criteria) this;
        }

        public Criteria andPkLimsFlowNotEqualTo(String value) {
            addCriterion("PK_LIMS_FLOW <>", value, "pkLimsFlow");
            return (Criteria) this;
        }

        public Criteria andPkLimsFlowGreaterThan(String value) {
            addCriterion("PK_LIMS_FLOW >", value, "pkLimsFlow");
            return (Criteria) this;
        }

        public Criteria andPkLimsFlowGreaterThanOrEqualTo(String value) {
            addCriterion("PK_LIMS_FLOW >=", value, "pkLimsFlow");
            return (Criteria) this;
        }

        public Criteria andPkLimsFlowLessThan(String value) {
            addCriterion("PK_LIMS_FLOW <", value, "pkLimsFlow");
            return (Criteria) this;
        }

        public Criteria andPkLimsFlowLessThanOrEqualTo(String value) {
            addCriterion("PK_LIMS_FLOW <=", value, "pkLimsFlow");
            return (Criteria) this;
        }

        public Criteria andPkLimsFlowLike(String value) {
            addCriterion("PK_LIMS_FLOW like", value, "pkLimsFlow");
            return (Criteria) this;
        }

        public Criteria andPkLimsFlowNotLike(String value) {
            addCriterion("PK_LIMS_FLOW not like", value, "pkLimsFlow");
            return (Criteria) this;
        }

        public Criteria andPkLimsFlowIn(List<String> values) {
            addCriterion("PK_LIMS_FLOW in", values, "pkLimsFlow");
            return (Criteria) this;
        }

        public Criteria andPkLimsFlowNotIn(List<String> values) {
            addCriterion("PK_LIMS_FLOW not in", values, "pkLimsFlow");
            return (Criteria) this;
        }

        public Criteria andPkLimsFlowBetween(String value1, String value2) {
            addCriterion("PK_LIMS_FLOW between", value1, value2, "pkLimsFlow");
            return (Criteria) this;
        }

        public Criteria andPkLimsFlowNotBetween(String value1, String value2) {
            addCriterion("PK_LIMS_FLOW not between", value1, value2, "pkLimsFlow");
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

        public Criteria andFlowActionIsNull() {
            addCriterion("FLOW_ACTION is null");
            return (Criteria) this;
        }

        public Criteria andFlowActionIsNotNull() {
            addCriterion("FLOW_ACTION is not null");
            return (Criteria) this;
        }

        public Criteria andFlowActionEqualTo(String value) {
            addCriterion("FLOW_ACTION =", value, "flowAction");
            return (Criteria) this;
        }

        public Criteria andFlowActionNotEqualTo(String value) {
            addCriterion("FLOW_ACTION <>", value, "flowAction");
            return (Criteria) this;
        }

        public Criteria andFlowActionGreaterThan(String value) {
            addCriterion("FLOW_ACTION >", value, "flowAction");
            return (Criteria) this;
        }

        public Criteria andFlowActionGreaterThanOrEqualTo(String value) {
            addCriterion("FLOW_ACTION >=", value, "flowAction");
            return (Criteria) this;
        }

        public Criteria andFlowActionLessThan(String value) {
            addCriterion("FLOW_ACTION <", value, "flowAction");
            return (Criteria) this;
        }

        public Criteria andFlowActionLessThanOrEqualTo(String value) {
            addCriterion("FLOW_ACTION <=", value, "flowAction");
            return (Criteria) this;
        }

        public Criteria andFlowActionLike(String value) {
            addCriterion("FLOW_ACTION like", value, "flowAction");
            return (Criteria) this;
        }

        public Criteria andFlowActionNotLike(String value) {
            addCriterion("FLOW_ACTION not like", value, "flowAction");
            return (Criteria) this;
        }

        public Criteria andFlowActionIn(List<String> values) {
            addCriterion("FLOW_ACTION in", values, "flowAction");
            return (Criteria) this;
        }

        public Criteria andFlowActionNotIn(List<String> values) {
            addCriterion("FLOW_ACTION not in", values, "flowAction");
            return (Criteria) this;
        }

        public Criteria andFlowActionBetween(String value1, String value2) {
            addCriterion("FLOW_ACTION between", value1, value2, "flowAction");
            return (Criteria) this;
        }

        public Criteria andFlowActionNotBetween(String value1, String value2) {
            addCriterion("FLOW_ACTION not between", value1, value2, "flowAction");
            return (Criteria) this;
        }

        public Criteria andOpratorIsNull() {
            addCriterion("OPRATOR is null");
            return (Criteria) this;
        }

        public Criteria andOpratorIsNotNull() {
            addCriterion("OPRATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOpratorEqualTo(String value) {
            addCriterion("OPRATOR =", value, "oprator");
            return (Criteria) this;
        }

        public Criteria andOpratorNotEqualTo(String value) {
            addCriterion("OPRATOR <>", value, "oprator");
            return (Criteria) this;
        }

        public Criteria andOpratorGreaterThan(String value) {
            addCriterion("OPRATOR >", value, "oprator");
            return (Criteria) this;
        }

        public Criteria andOpratorGreaterThanOrEqualTo(String value) {
            addCriterion("OPRATOR >=", value, "oprator");
            return (Criteria) this;
        }

        public Criteria andOpratorLessThan(String value) {
            addCriterion("OPRATOR <", value, "oprator");
            return (Criteria) this;
        }

        public Criteria andOpratorLessThanOrEqualTo(String value) {
            addCriterion("OPRATOR <=", value, "oprator");
            return (Criteria) this;
        }

        public Criteria andOpratorLike(String value) {
            addCriterion("OPRATOR like", value, "oprator");
            return (Criteria) this;
        }

        public Criteria andOpratorNotLike(String value) {
            addCriterion("OPRATOR not like", value, "oprator");
            return (Criteria) this;
        }

        public Criteria andOpratorIn(List<String> values) {
            addCriterion("OPRATOR in", values, "oprator");
            return (Criteria) this;
        }

        public Criteria andOpratorNotIn(List<String> values) {
            addCriterion("OPRATOR not in", values, "oprator");
            return (Criteria) this;
        }

        public Criteria andOpratorBetween(String value1, String value2) {
            addCriterion("OPRATOR between", value1, value2, "oprator");
            return (Criteria) this;
        }

        public Criteria andOpratorNotBetween(String value1, String value2) {
            addCriterion("OPRATOR not between", value1, value2, "oprator");
            return (Criteria) this;
        }

        public Criteria andOpratdateIsNull() {
            addCriterion("OPRATDATE is null");
            return (Criteria) this;
        }

        public Criteria andOpratdateIsNotNull() {
            addCriterion("OPRATDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpratdateEqualTo(Date value) {
            addCriterionForJDBCDate("OPRATDATE =", value, "opratdate");
            return (Criteria) this;
        }

        public Criteria andOpratdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("OPRATDATE <>", value, "opratdate");
            return (Criteria) this;
        }

        public Criteria andOpratdateGreaterThan(Date value) {
            addCriterionForJDBCDate("OPRATDATE >", value, "opratdate");
            return (Criteria) this;
        }

        public Criteria andOpratdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPRATDATE >=", value, "opratdate");
            return (Criteria) this;
        }

        public Criteria andOpratdateLessThan(Date value) {
            addCriterionForJDBCDate("OPRATDATE <", value, "opratdate");
            return (Criteria) this;
        }

        public Criteria andOpratdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPRATDATE <=", value, "opratdate");
            return (Criteria) this;
        }

        public Criteria andOpratdateIn(List<Date> values) {
            addCriterionForJDBCDate("OPRATDATE in", values, "opratdate");
            return (Criteria) this;
        }

        public Criteria andOpratdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("OPRATDATE not in", values, "opratdate");
            return (Criteria) this;
        }

        public Criteria andOpratdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPRATDATE between", value1, value2, "opratdate");
            return (Criteria) this;
        }

        public Criteria andOpratdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPRATDATE not between", value1, value2, "opratdate");
            return (Criteria) this;
        }

        public Criteria andVdef1IsNull() {
            addCriterion("VDEF1 is null");
            return (Criteria) this;
        }

        public Criteria andVdef1IsNotNull() {
            addCriterion("VDEF1 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef1EqualTo(String value) {
            addCriterion("VDEF1 =", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1NotEqualTo(String value) {
            addCriterion("VDEF1 <>", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1GreaterThan(String value) {
            addCriterion("VDEF1 >", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF1 >=", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1LessThan(String value) {
            addCriterion("VDEF1 <", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1LessThanOrEqualTo(String value) {
            addCriterion("VDEF1 <=", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1Like(String value) {
            addCriterion("VDEF1 like", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1NotLike(String value) {
            addCriterion("VDEF1 not like", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1In(List<String> values) {
            addCriterion("VDEF1 in", values, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1NotIn(List<String> values) {
            addCriterion("VDEF1 not in", values, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1Between(String value1, String value2) {
            addCriterion("VDEF1 between", value1, value2, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1NotBetween(String value1, String value2) {
            addCriterion("VDEF1 not between", value1, value2, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef2IsNull() {
            addCriterion("VDEF2 is null");
            return (Criteria) this;
        }

        public Criteria andVdef2IsNotNull() {
            addCriterion("VDEF2 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef2EqualTo(String value) {
            addCriterion("VDEF2 =", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2NotEqualTo(String value) {
            addCriterion("VDEF2 <>", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2GreaterThan(String value) {
            addCriterion("VDEF2 >", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF2 >=", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2LessThan(String value) {
            addCriterion("VDEF2 <", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2LessThanOrEqualTo(String value) {
            addCriterion("VDEF2 <=", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2Like(String value) {
            addCriterion("VDEF2 like", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2NotLike(String value) {
            addCriterion("VDEF2 not like", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2In(List<String> values) {
            addCriterion("VDEF2 in", values, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2NotIn(List<String> values) {
            addCriterion("VDEF2 not in", values, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2Between(String value1, String value2) {
            addCriterion("VDEF2 between", value1, value2, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2NotBetween(String value1, String value2) {
            addCriterion("VDEF2 not between", value1, value2, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef3IsNull() {
            addCriterion("VDEF3 is null");
            return (Criteria) this;
        }

        public Criteria andVdef3IsNotNull() {
            addCriterion("VDEF3 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef3EqualTo(String value) {
            addCriterion("VDEF3 =", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3NotEqualTo(String value) {
            addCriterion("VDEF3 <>", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3GreaterThan(String value) {
            addCriterion("VDEF3 >", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF3 >=", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3LessThan(String value) {
            addCriterion("VDEF3 <", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3LessThanOrEqualTo(String value) {
            addCriterion("VDEF3 <=", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3Like(String value) {
            addCriterion("VDEF3 like", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3NotLike(String value) {
            addCriterion("VDEF3 not like", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3In(List<String> values) {
            addCriterion("VDEF3 in", values, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3NotIn(List<String> values) {
            addCriterion("VDEF3 not in", values, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3Between(String value1, String value2) {
            addCriterion("VDEF3 between", value1, value2, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3NotBetween(String value1, String value2) {
            addCriterion("VDEF3 not between", value1, value2, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef4IsNull() {
            addCriterion("VDEF4 is null");
            return (Criteria) this;
        }

        public Criteria andVdef4IsNotNull() {
            addCriterion("VDEF4 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef4EqualTo(String value) {
            addCriterion("VDEF4 =", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4NotEqualTo(String value) {
            addCriterion("VDEF4 <>", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4GreaterThan(String value) {
            addCriterion("VDEF4 >", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF4 >=", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4LessThan(String value) {
            addCriterion("VDEF4 <", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4LessThanOrEqualTo(String value) {
            addCriterion("VDEF4 <=", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4Like(String value) {
            addCriterion("VDEF4 like", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4NotLike(String value) {
            addCriterion("VDEF4 not like", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4In(List<String> values) {
            addCriterion("VDEF4 in", values, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4NotIn(List<String> values) {
            addCriterion("VDEF4 not in", values, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4Between(String value1, String value2) {
            addCriterion("VDEF4 between", value1, value2, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4NotBetween(String value1, String value2) {
            addCriterion("VDEF4 not between", value1, value2, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef5IsNull() {
            addCriterion("VDEF5 is null");
            return (Criteria) this;
        }

        public Criteria andVdef5IsNotNull() {
            addCriterion("VDEF5 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef5EqualTo(String value) {
            addCriterion("VDEF5 =", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5NotEqualTo(String value) {
            addCriterion("VDEF5 <>", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5GreaterThan(String value) {
            addCriterion("VDEF5 >", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF5 >=", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5LessThan(String value) {
            addCriterion("VDEF5 <", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5LessThanOrEqualTo(String value) {
            addCriterion("VDEF5 <=", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5Like(String value) {
            addCriterion("VDEF5 like", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5NotLike(String value) {
            addCriterion("VDEF5 not like", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5In(List<String> values) {
            addCriterion("VDEF5 in", values, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5NotIn(List<String> values) {
            addCriterion("VDEF5 not in", values, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5Between(String value1, String value2) {
            addCriterion("VDEF5 between", value1, value2, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5NotBetween(String value1, String value2) {
            addCriterion("VDEF5 not between", value1, value2, "vdef5");
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