package com.master.mybatisgenerated;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
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

        public Criteria andIduserIsNull() {
            addCriterion("idUser is null");
            return (Criteria) this;
        }

        public Criteria andIduserIsNotNull() {
            addCriterion("idUser is not null");
            return (Criteria) this;
        }

        public Criteria andIduserEqualTo(Integer value) {
            addCriterion("idUser =", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserNotEqualTo(Integer value) {
            addCriterion("idUser <>", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserGreaterThan(Integer value) {
            addCriterion("idUser >", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserGreaterThanOrEqualTo(Integer value) {
            addCriterion("idUser >=", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserLessThan(Integer value) {
            addCriterion("idUser <", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserLessThanOrEqualTo(Integer value) {
            addCriterion("idUser <=", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserIn(List<Integer> values) {
            addCriterion("idUser in", values, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserNotIn(List<Integer> values) {
            addCriterion("idUser not in", values, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserBetween(Integer value1, Integer value2) {
            addCriterion("idUser between", value1, value2, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserNotBetween(Integer value1, Integer value2) {
            addCriterion("idUser not between", value1, value2, "iduser");
            return (Criteria) this;
        }

        public Criteria andUserUUIDIsNull() {
            addCriterion("userUUID is null");
            return (Criteria) this;
        }

        public Criteria andUserUUIDIsNotNull() {
            addCriterion("userUUID is not null");
            return (Criteria) this;
        }

        public Criteria andUserUUIDEqualTo(String value) {
            addCriterion("userUUID =", value, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDNotEqualTo(String value) {
            addCriterion("userUUID <>", value, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDGreaterThan(String value) {
            addCriterion("userUUID >", value, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDGreaterThanOrEqualTo(String value) {
            addCriterion("userUUID >=", value, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDLessThan(String value) {
            addCriterion("userUUID <", value, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDLessThanOrEqualTo(String value) {
            addCriterion("userUUID <=", value, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDLike(String value) {
            addCriterion("userUUID like", value, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDNotLike(String value) {
            addCriterion("userUUID not like", value, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDIn(List<String> values) {
            addCriterion("userUUID in", values, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDNotIn(List<String> values) {
            addCriterion("userUUID not in", values, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDBetween(String value1, String value2) {
            addCriterion("userUUID between", value1, value2, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDNotBetween(String value1, String value2) {
            addCriterion("userUUID not between", value1, value2, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("userEmail is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("userEmail is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("userEmail =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("userEmail <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("userEmail >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("userEmail >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("userEmail <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("userEmail <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("userEmail like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("userEmail not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("userEmail in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("userEmail not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("userEmail between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("userEmail not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserDateCreatedIsNull() {
            addCriterion("userDateCreated is null");
            return (Criteria) this;
        }

        public Criteria andUserDateCreatedIsNotNull() {
            addCriterion("userDateCreated is not null");
            return (Criteria) this;
        }

        public Criteria andUserDateCreatedEqualTo(Date value) {
            addCriterion("userDateCreated =", value, "userDateCreated");
            return (Criteria) this;
        }

        public Criteria andUserDateCreatedNotEqualTo(Date value) {
            addCriterion("userDateCreated <>", value, "userDateCreated");
            return (Criteria) this;
        }

        public Criteria andUserDateCreatedGreaterThan(Date value) {
            addCriterion("userDateCreated >", value, "userDateCreated");
            return (Criteria) this;
        }

        public Criteria andUserDateCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("userDateCreated >=", value, "userDateCreated");
            return (Criteria) this;
        }

        public Criteria andUserDateCreatedLessThan(Date value) {
            addCriterion("userDateCreated <", value, "userDateCreated");
            return (Criteria) this;
        }

        public Criteria andUserDateCreatedLessThanOrEqualTo(Date value) {
            addCriterion("userDateCreated <=", value, "userDateCreated");
            return (Criteria) this;
        }

        public Criteria andUserDateCreatedIn(List<Date> values) {
            addCriterion("userDateCreated in", values, "userDateCreated");
            return (Criteria) this;
        }

        public Criteria andUserDateCreatedNotIn(List<Date> values) {
            addCriterion("userDateCreated not in", values, "userDateCreated");
            return (Criteria) this;
        }

        public Criteria andUserDateCreatedBetween(Date value1, Date value2) {
            addCriterion("userDateCreated between", value1, value2, "userDateCreated");
            return (Criteria) this;
        }

        public Criteria andUserDateCreatedNotBetween(Date value1, Date value2) {
            addCriterion("userDateCreated not between", value1, value2, "userDateCreated");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNull() {
            addCriterion("userRole is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNotNull() {
            addCriterion("userRole is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleEqualTo(String value) {
            addCriterion("userRole =", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotEqualTo(String value) {
            addCriterion("userRole <>", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThan(String value) {
            addCriterion("userRole >", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThanOrEqualTo(String value) {
            addCriterion("userRole >=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThan(String value) {
            addCriterion("userRole <", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThanOrEqualTo(String value) {
            addCriterion("userRole <=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLike(String value) {
            addCriterion("userRole like", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotLike(String value) {
            addCriterion("userRole not like", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleIn(List<String> values) {
            addCriterion("userRole in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotIn(List<String> values) {
            addCriterion("userRole not in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleBetween(String value1, String value2) {
            addCriterion("userRole between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotBetween(String value1, String value2) {
            addCriterion("userRole not between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameIsNull() {
            addCriterion("userFirstName is null");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameIsNotNull() {
            addCriterion("userFirstName is not null");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameEqualTo(String value) {
            addCriterion("userFirstName =", value, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameNotEqualTo(String value) {
            addCriterion("userFirstName <>", value, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameGreaterThan(String value) {
            addCriterion("userFirstName >", value, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("userFirstName >=", value, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameLessThan(String value) {
            addCriterion("userFirstName <", value, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameLessThanOrEqualTo(String value) {
            addCriterion("userFirstName <=", value, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameLike(String value) {
            addCriterion("userFirstName like", value, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameNotLike(String value) {
            addCriterion("userFirstName not like", value, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameIn(List<String> values) {
            addCriterion("userFirstName in", values, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameNotIn(List<String> values) {
            addCriterion("userFirstName not in", values, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameBetween(String value1, String value2) {
            addCriterion("userFirstName between", value1, value2, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameNotBetween(String value1, String value2) {
            addCriterion("userFirstName not between", value1, value2, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameIsNull() {
            addCriterion("userLastName is null");
            return (Criteria) this;
        }

        public Criteria andUserLastNameIsNotNull() {
            addCriterion("userLastName is not null");
            return (Criteria) this;
        }

        public Criteria andUserLastNameEqualTo(String value) {
            addCriterion("userLastName =", value, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameNotEqualTo(String value) {
            addCriterion("userLastName <>", value, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameGreaterThan(String value) {
            addCriterion("userLastName >", value, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameGreaterThanOrEqualTo(String value) {
            addCriterion("userLastName >=", value, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameLessThan(String value) {
            addCriterion("userLastName <", value, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameLessThanOrEqualTo(String value) {
            addCriterion("userLastName <=", value, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameLike(String value) {
            addCriterion("userLastName like", value, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameNotLike(String value) {
            addCriterion("userLastName not like", value, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameIn(List<String> values) {
            addCriterion("userLastName in", values, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameNotIn(List<String> values) {
            addCriterion("userLastName not in", values, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameBetween(String value1, String value2) {
            addCriterion("userLastName between", value1, value2, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameNotBetween(String value1, String value2) {
            addCriterion("userLastName not between", value1, value2, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("userSex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("userSex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(Boolean value) {
            addCriterion("userSex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(Boolean value) {
            addCriterion("userSex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(Boolean value) {
            addCriterion("userSex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("userSex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(Boolean value) {
            addCriterion("userSex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(Boolean value) {
            addCriterion("userSex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<Boolean> values) {
            addCriterion("userSex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<Boolean> values) {
            addCriterion("userSex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(Boolean value1, Boolean value2) {
            addCriterion("userSex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("userSex not between", value1, value2, "userSex");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users
     *
     * @mbggenerated do_not_delete_during_merge Sun Sep 23 12:55:53 EEST 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table users
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
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