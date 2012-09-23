package com.master.mybatisgenerated;

import java.util.ArrayList;
import java.util.List;

public class HouseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table houses
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table houses
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table houses
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houses
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public HouseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houses
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houses
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houses
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houses
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houses
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houses
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houses
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
     * This method corresponds to the database table houses
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
     * This method corresponds to the database table houses
     *
     * @mbggenerated Sun Sep 23 12:55:53 EEST 2012
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table houses
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
     * This class corresponds to the database table houses
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

        public Criteria andIdhouseIsNull() {
            addCriterion("idHouse is null");
            return (Criteria) this;
        }

        public Criteria andIdhouseIsNotNull() {
            addCriterion("idHouse is not null");
            return (Criteria) this;
        }

        public Criteria andIdhouseEqualTo(Integer value) {
            addCriterion("idHouse =", value, "idhouse");
            return (Criteria) this;
        }

        public Criteria andIdhouseNotEqualTo(Integer value) {
            addCriterion("idHouse <>", value, "idhouse");
            return (Criteria) this;
        }

        public Criteria andIdhouseGreaterThan(Integer value) {
            addCriterion("idHouse >", value, "idhouse");
            return (Criteria) this;
        }

        public Criteria andIdhouseGreaterThanOrEqualTo(Integer value) {
            addCriterion("idHouse >=", value, "idhouse");
            return (Criteria) this;
        }

        public Criteria andIdhouseLessThan(Integer value) {
            addCriterion("idHouse <", value, "idhouse");
            return (Criteria) this;
        }

        public Criteria andIdhouseLessThanOrEqualTo(Integer value) {
            addCriterion("idHouse <=", value, "idhouse");
            return (Criteria) this;
        }

        public Criteria andIdhouseIn(List<Integer> values) {
            addCriterion("idHouse in", values, "idhouse");
            return (Criteria) this;
        }

        public Criteria andIdhouseNotIn(List<Integer> values) {
            addCriterion("idHouse not in", values, "idhouse");
            return (Criteria) this;
        }

        public Criteria andIdhouseBetween(Integer value1, Integer value2) {
            addCriterion("idHouse between", value1, value2, "idhouse");
            return (Criteria) this;
        }

        public Criteria andIdhouseNotBetween(Integer value1, Integer value2) {
            addCriterion("idHouse not between", value1, value2, "idhouse");
            return (Criteria) this;
        }

        public Criteria andHouseUUIDIsNull() {
            addCriterion("houseUUID is null");
            return (Criteria) this;
        }

        public Criteria andHouseUUIDIsNotNull() {
            addCriterion("houseUUID is not null");
            return (Criteria) this;
        }

        public Criteria andHouseUUIDEqualTo(String value) {
            addCriterion("houseUUID =", value, "houseUUID");
            return (Criteria) this;
        }

        public Criteria andHouseUUIDNotEqualTo(String value) {
            addCriterion("houseUUID <>", value, "houseUUID");
            return (Criteria) this;
        }

        public Criteria andHouseUUIDGreaterThan(String value) {
            addCriterion("houseUUID >", value, "houseUUID");
            return (Criteria) this;
        }

        public Criteria andHouseUUIDGreaterThanOrEqualTo(String value) {
            addCriterion("houseUUID >=", value, "houseUUID");
            return (Criteria) this;
        }

        public Criteria andHouseUUIDLessThan(String value) {
            addCriterion("houseUUID <", value, "houseUUID");
            return (Criteria) this;
        }

        public Criteria andHouseUUIDLessThanOrEqualTo(String value) {
            addCriterion("houseUUID <=", value, "houseUUID");
            return (Criteria) this;
        }

        public Criteria andHouseUUIDLike(String value) {
            addCriterion("houseUUID like", value, "houseUUID");
            return (Criteria) this;
        }

        public Criteria andHouseUUIDNotLike(String value) {
            addCriterion("houseUUID not like", value, "houseUUID");
            return (Criteria) this;
        }

        public Criteria andHouseUUIDIn(List<String> values) {
            addCriterion("houseUUID in", values, "houseUUID");
            return (Criteria) this;
        }

        public Criteria andHouseUUIDNotIn(List<String> values) {
            addCriterion("houseUUID not in", values, "houseUUID");
            return (Criteria) this;
        }

        public Criteria andHouseUUIDBetween(String value1, String value2) {
            addCriterion("houseUUID between", value1, value2, "houseUUID");
            return (Criteria) this;
        }

        public Criteria andHouseUUIDNotBetween(String value1, String value2) {
            addCriterion("houseUUID not between", value1, value2, "houseUUID");
            return (Criteria) this;
        }

        public Criteria andHouseNameIsNull() {
            addCriterion("houseName is null");
            return (Criteria) this;
        }

        public Criteria andHouseNameIsNotNull() {
            addCriterion("houseName is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNameEqualTo(String value) {
            addCriterion("houseName =", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotEqualTo(String value) {
            addCriterion("houseName <>", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameGreaterThan(String value) {
            addCriterion("houseName >", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("houseName >=", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLessThan(String value) {
            addCriterion("houseName <", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLessThanOrEqualTo(String value) {
            addCriterion("houseName <=", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLike(String value) {
            addCriterion("houseName like", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotLike(String value) {
            addCriterion("houseName not like", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameIn(List<String> values) {
            addCriterion("houseName in", values, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotIn(List<String> values) {
            addCriterion("houseName not in", values, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameBetween(String value1, String value2) {
            addCriterion("houseName between", value1, value2, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotBetween(String value1, String value2) {
            addCriterion("houseName not between", value1, value2, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIsNull() {
            addCriterion("houseAddress is null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIsNotNull() {
            addCriterion("houseAddress is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressEqualTo(String value) {
            addCriterion("houseAddress =", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotEqualTo(String value) {
            addCriterion("houseAddress <>", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressGreaterThan(String value) {
            addCriterion("houseAddress >", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("houseAddress >=", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLessThan(String value) {
            addCriterion("houseAddress <", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLessThanOrEqualTo(String value) {
            addCriterion("houseAddress <=", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLike(String value) {
            addCriterion("houseAddress like", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotLike(String value) {
            addCriterion("houseAddress not like", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIn(List<String> values) {
            addCriterion("houseAddress in", values, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotIn(List<String> values) {
            addCriterion("houseAddress not in", values, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressBetween(String value1, String value2) {
            addCriterion("houseAddress between", value1, value2, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotBetween(String value1, String value2) {
            addCriterion("houseAddress not between", value1, value2, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNull() {
            addCriterion("houseType is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNotNull() {
            addCriterion("houseType is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeEqualTo(String value) {
            addCriterion("houseType =", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotEqualTo(String value) {
            addCriterion("houseType <>", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThan(String value) {
            addCriterion("houseType >", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("houseType >=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThan(String value) {
            addCriterion("houseType <", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThanOrEqualTo(String value) {
            addCriterion("houseType <=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLike(String value) {
            addCriterion("houseType like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotLike(String value) {
            addCriterion("houseType not like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIn(List<String> values) {
            addCriterion("houseType in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotIn(List<String> values) {
            addCriterion("houseType not in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeBetween(String value1, String value2) {
            addCriterion("houseType between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotBetween(String value1, String value2) {
            addCriterion("houseType not between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("Users_idUser is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("Users_idUser is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("Users_idUser =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("Users_idUser <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("Users_idUser >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Users_idUser >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("Users_idUser <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("Users_idUser <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("Users_idUser in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("Users_idUser not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("Users_idUser between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Users_idUser not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andProfileIdIsNull() {
            addCriterion("Profiles_idProfile is null");
            return (Criteria) this;
        }

        public Criteria andProfileIdIsNotNull() {
            addCriterion("Profiles_idProfile is not null");
            return (Criteria) this;
        }

        public Criteria andProfileIdEqualTo(Integer value) {
            addCriterion("Profiles_idProfile =", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdNotEqualTo(Integer value) {
            addCriterion("Profiles_idProfile <>", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdGreaterThan(Integer value) {
            addCriterion("Profiles_idProfile >", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Profiles_idProfile >=", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdLessThan(Integer value) {
            addCriterion("Profiles_idProfile <", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdLessThanOrEqualTo(Integer value) {
            addCriterion("Profiles_idProfile <=", value, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdIn(List<Integer> values) {
            addCriterion("Profiles_idProfile in", values, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdNotIn(List<Integer> values) {
            addCriterion("Profiles_idProfile not in", values, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdBetween(Integer value1, Integer value2) {
            addCriterion("Profiles_idProfile between", value1, value2, "profileId");
            return (Criteria) this;
        }

        public Criteria andProfileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Profiles_idProfile not between", value1, value2, "profileId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table houses
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
     * This class corresponds to the database table houses
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