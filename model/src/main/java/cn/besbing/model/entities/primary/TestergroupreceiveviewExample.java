package cn.besbing.model.entities.primary;

import java.util.ArrayList;
import java.util.List;

public class TestergroupreceiveviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestergroupreceiveviewExample() {
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

        public Criteria andLocationNumberIsNull() {
            addCriterion("LOCATION_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andLocationNumberIsNotNull() {
            addCriterion("LOCATION_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andLocationNumberEqualTo(Long value) {
            addCriterion("LOCATION_NUMBER =", value, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberNotEqualTo(Long value) {
            addCriterion("LOCATION_NUMBER <>", value, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberGreaterThan(Long value) {
            addCriterion("LOCATION_NUMBER >", value, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("LOCATION_NUMBER >=", value, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberLessThan(Long value) {
            addCriterion("LOCATION_NUMBER <", value, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberLessThanOrEqualTo(Long value) {
            addCriterion("LOCATION_NUMBER <=", value, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberIn(List<Long> values) {
            addCriterion("LOCATION_NUMBER in", values, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberNotIn(List<Long> values) {
            addCriterion("LOCATION_NUMBER not in", values, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberBetween(Long value1, Long value2) {
            addCriterion("LOCATION_NUMBER between", value1, value2, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andLocationNumberNotBetween(Long value1, Long value2) {
            addCriterion("LOCATION_NUMBER not between", value1, value2, "locationNumber");
            return (Criteria) this;
        }

        public Criteria andReservedForIsNull() {
            addCriterion("RESERVED_FOR is null");
            return (Criteria) this;
        }

        public Criteria andReservedForIsNotNull() {
            addCriterion("RESERVED_FOR is not null");
            return (Criteria) this;
        }

        public Criteria andReservedForEqualTo(String value) {
            addCriterion("RESERVED_FOR =", value, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForNotEqualTo(String value) {
            addCriterion("RESERVED_FOR <>", value, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForGreaterThan(String value) {
            addCriterion("RESERVED_FOR >", value, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForGreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED_FOR >=", value, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForLessThan(String value) {
            addCriterion("RESERVED_FOR <", value, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForLessThanOrEqualTo(String value) {
            addCriterion("RESERVED_FOR <=", value, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForLike(String value) {
            addCriterion("RESERVED_FOR like", value, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForNotLike(String value) {
            addCriterion("RESERVED_FOR not like", value, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForIn(List<String> values) {
            addCriterion("RESERVED_FOR in", values, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForNotIn(List<String> values) {
            addCriterion("RESERVED_FOR not in", values, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForBetween(String value1, String value2) {
            addCriterion("RESERVED_FOR between", value1, value2, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andReservedForNotBetween(String value1, String value2) {
            addCriterion("RESERVED_FOR not between", value1, value2, "reservedFor");
            return (Criteria) this;
        }

        public Criteria andHierarchyIsNull() {
            addCriterion("HIERARCHY is null");
            return (Criteria) this;
        }

        public Criteria andHierarchyIsNotNull() {
            addCriterion("HIERARCHY is not null");
            return (Criteria) this;
        }

        public Criteria andHierarchyEqualTo(String value) {
            addCriterion("HIERARCHY =", value, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyNotEqualTo(String value) {
            addCriterion("HIERARCHY <>", value, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyGreaterThan(String value) {
            addCriterion("HIERARCHY >", value, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyGreaterThanOrEqualTo(String value) {
            addCriterion("HIERARCHY >=", value, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyLessThan(String value) {
            addCriterion("HIERARCHY <", value, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyLessThanOrEqualTo(String value) {
            addCriterion("HIERARCHY <=", value, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyLike(String value) {
            addCriterion("HIERARCHY like", value, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyNotLike(String value) {
            addCriterion("HIERARCHY not like", value, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyIn(List<String> values) {
            addCriterion("HIERARCHY in", values, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyNotIn(List<String> values) {
            addCriterion("HIERARCHY not in", values, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyBetween(String value1, String value2) {
            addCriterion("HIERARCHY between", value1, value2, "hierarchy");
            return (Criteria) this;
        }

        public Criteria andHierarchyNotBetween(String value1, String value2) {
            addCriterion("HIERARCHY not between", value1, value2, "hierarchy");
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

        public Criteria andParentLocation10IsNull() {
            addCriterion("PARENT_LOCATION_10 is null");
            return (Criteria) this;
        }

        public Criteria andParentLocation10IsNotNull() {
            addCriterion("PARENT_LOCATION_10 is not null");
            return (Criteria) this;
        }

        public Criteria andParentLocation10EqualTo(Long value) {
            addCriterion("PARENT_LOCATION_10 =", value, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10NotEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_10 <>", value, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10GreaterThan(Long value) {
            addCriterion("PARENT_LOCATION_10 >", value, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10GreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_10 >=", value, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10LessThan(Long value) {
            addCriterion("PARENT_LOCATION_10 <", value, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10LessThanOrEqualTo(Long value) {
            addCriterion("PARENT_LOCATION_10 <=", value, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10In(List<Long> values) {
            addCriterion("PARENT_LOCATION_10 in", values, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10NotIn(List<Long> values) {
            addCriterion("PARENT_LOCATION_10 not in", values, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10Between(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_10 between", value1, value2, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andParentLocation10NotBetween(Long value1, Long value2) {
            addCriterion("PARENT_LOCATION_10 not between", value1, value2, "parentLocation10");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("TASK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("TASK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("TASK_NAME =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("TASK_NAME <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("TASK_NAME >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_NAME >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("TASK_NAME <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_NAME <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("TASK_NAME like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("TASK_NAME not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("TASK_NAME in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("TASK_NAME not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("TASK_NAME between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("TASK_NAME not between", value1, value2, "taskName");
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

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andTestGroupIsNull() {
            addCriterion("TEST_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andTestGroupIsNotNull() {
            addCriterion("TEST_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andTestGroupEqualTo(String value) {
            addCriterion("TEST_GROUP =", value, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupNotEqualTo(String value) {
            addCriterion("TEST_GROUP <>", value, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupGreaterThan(String value) {
            addCriterion("TEST_GROUP >", value, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_GROUP >=", value, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupLessThan(String value) {
            addCriterion("TEST_GROUP <", value, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupLessThanOrEqualTo(String value) {
            addCriterion("TEST_GROUP <=", value, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupLike(String value) {
            addCriterion("TEST_GROUP like", value, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupNotLike(String value) {
            addCriterion("TEST_GROUP not like", value, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupIn(List<String> values) {
            addCriterion("TEST_GROUP in", values, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupNotIn(List<String> values) {
            addCriterion("TEST_GROUP not in", values, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupBetween(String value1, String value2) {
            addCriterion("TEST_GROUP between", value1, value2, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupNotBetween(String value1, String value2) {
            addCriterion("TEST_GROUP not between", value1, value2, "testGroup");
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