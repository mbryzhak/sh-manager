package com.master.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RatesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public RatesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
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
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNull() {
            addCriterion("datetime is null");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNotNull() {
            addCriterion("datetime is not null");
            return (Criteria) this;
        }

        public Criteria andDateTimeEqualTo(Date value) {
            addCriterion("datetime =", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotEqualTo(Date value) {
            addCriterion("datetime <>", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThan(Date value) {
            addCriterion("datetime >", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("datetime >=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThan(Date value) {
            addCriterion("datetime <", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("datetime <=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeIn(List<Date> values) {
            addCriterion("datetime in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotIn(List<Date> values) {
            addCriterion("datetime not in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeBetween(Date value1, Date value2) {
            addCriterion("datetime between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("datetime not between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andSensor1IsNull() {
            addCriterion("sensor1 is null");
            return (Criteria) this;
        }

        public Criteria andSensor1IsNotNull() {
            addCriterion("sensor1 is not null");
            return (Criteria) this;
        }

        public Criteria andSensor1EqualTo(Float value) {
            addCriterion("sensor1 =", value, "sensor1");
            return (Criteria) this;
        }

        public Criteria andSensor1NotEqualTo(Float value) {
            addCriterion("sensor1 <>", value, "sensor1");
            return (Criteria) this;
        }

        public Criteria andSensor1GreaterThan(Float value) {
            addCriterion("sensor1 >", value, "sensor1");
            return (Criteria) this;
        }

        public Criteria andSensor1GreaterThanOrEqualTo(Float value) {
            addCriterion("sensor1 >=", value, "sensor1");
            return (Criteria) this;
        }

        public Criteria andSensor1LessThan(Float value) {
            addCriterion("sensor1 <", value, "sensor1");
            return (Criteria) this;
        }

        public Criteria andSensor1LessThanOrEqualTo(Float value) {
            addCriterion("sensor1 <=", value, "sensor1");
            return (Criteria) this;
        }

        public Criteria andSensor1In(List<Float> values) {
            addCriterion("sensor1 in", values, "sensor1");
            return (Criteria) this;
        }

        public Criteria andSensor1NotIn(List<Float> values) {
            addCriterion("sensor1 not in", values, "sensor1");
            return (Criteria) this;
        }

        public Criteria andSensor1Between(Float value1, Float value2) {
            addCriterion("sensor1 between", value1, value2, "sensor1");
            return (Criteria) this;
        }

        public Criteria andSensor1NotBetween(Float value1, Float value2) {
            addCriterion("sensor1 not between", value1, value2, "sensor1");
            return (Criteria) this;
        }

        public Criteria andSensor2IsNull() {
            addCriterion("sensor2 is null");
            return (Criteria) this;
        }

        public Criteria andSensor2IsNotNull() {
            addCriterion("sensor2 is not null");
            return (Criteria) this;
        }

        public Criteria andSensor2EqualTo(Float value) {
            addCriterion("sensor2 =", value, "sensor2");
            return (Criteria) this;
        }

        public Criteria andSensor2NotEqualTo(Float value) {
            addCriterion("sensor2 <>", value, "sensor2");
            return (Criteria) this;
        }

        public Criteria andSensor2GreaterThan(Float value) {
            addCriterion("sensor2 >", value, "sensor2");
            return (Criteria) this;
        }

        public Criteria andSensor2GreaterThanOrEqualTo(Float value) {
            addCriterion("sensor2 >=", value, "sensor2");
            return (Criteria) this;
        }

        public Criteria andSensor2LessThan(Float value) {
            addCriterion("sensor2 <", value, "sensor2");
            return (Criteria) this;
        }

        public Criteria andSensor2LessThanOrEqualTo(Float value) {
            addCriterion("sensor2 <=", value, "sensor2");
            return (Criteria) this;
        }

        public Criteria andSensor2In(List<Float> values) {
            addCriterion("sensor2 in", values, "sensor2");
            return (Criteria) this;
        }

        public Criteria andSensor2NotIn(List<Float> values) {
            addCriterion("sensor2 not in", values, "sensor2");
            return (Criteria) this;
        }

        public Criteria andSensor2Between(Float value1, Float value2) {
            addCriterion("sensor2 between", value1, value2, "sensor2");
            return (Criteria) this;
        }

        public Criteria andSensor2NotBetween(Float value1, Float value2) {
            addCriterion("sensor2 not between", value1, value2, "sensor2");
            return (Criteria) this;
        }

        public Criteria andSensor3IsNull() {
            addCriterion("sensor3 is null");
            return (Criteria) this;
        }

        public Criteria andSensor3IsNotNull() {
            addCriterion("sensor3 is not null");
            return (Criteria) this;
        }

        public Criteria andSensor3EqualTo(Float value) {
            addCriterion("sensor3 =", value, "sensor3");
            return (Criteria) this;
        }

        public Criteria andSensor3NotEqualTo(Float value) {
            addCriterion("sensor3 <>", value, "sensor3");
            return (Criteria) this;
        }

        public Criteria andSensor3GreaterThan(Float value) {
            addCriterion("sensor3 >", value, "sensor3");
            return (Criteria) this;
        }

        public Criteria andSensor3GreaterThanOrEqualTo(Float value) {
            addCriterion("sensor3 >=", value, "sensor3");
            return (Criteria) this;
        }

        public Criteria andSensor3LessThan(Float value) {
            addCriterion("sensor3 <", value, "sensor3");
            return (Criteria) this;
        }

        public Criteria andSensor3LessThanOrEqualTo(Float value) {
            addCriterion("sensor3 <=", value, "sensor3");
            return (Criteria) this;
        }

        public Criteria andSensor3In(List<Float> values) {
            addCriterion("sensor3 in", values, "sensor3");
            return (Criteria) this;
        }

        public Criteria andSensor3NotIn(List<Float> values) {
            addCriterion("sensor3 not in", values, "sensor3");
            return (Criteria) this;
        }

        public Criteria andSensor3Between(Float value1, Float value2) {
            addCriterion("sensor3 between", value1, value2, "sensor3");
            return (Criteria) this;
        }

        public Criteria andSensor3NotBetween(Float value1, Float value2) {
            addCriterion("sensor3 not between", value1, value2, "sensor3");
            return (Criteria) this;
        }

        public Criteria andSensor4IsNull() {
            addCriterion("sensor4 is null");
            return (Criteria) this;
        }

        public Criteria andSensor4IsNotNull() {
            addCriterion("sensor4 is not null");
            return (Criteria) this;
        }

        public Criteria andSensor4EqualTo(Float value) {
            addCriterion("sensor4 =", value, "sensor4");
            return (Criteria) this;
        }

        public Criteria andSensor4NotEqualTo(Float value) {
            addCriterion("sensor4 <>", value, "sensor4");
            return (Criteria) this;
        }

        public Criteria andSensor4GreaterThan(Float value) {
            addCriterion("sensor4 >", value, "sensor4");
            return (Criteria) this;
        }

        public Criteria andSensor4GreaterThanOrEqualTo(Float value) {
            addCriterion("sensor4 >=", value, "sensor4");
            return (Criteria) this;
        }

        public Criteria andSensor4LessThan(Float value) {
            addCriterion("sensor4 <", value, "sensor4");
            return (Criteria) this;
        }

        public Criteria andSensor4LessThanOrEqualTo(Float value) {
            addCriterion("sensor4 <=", value, "sensor4");
            return (Criteria) this;
        }

        public Criteria andSensor4In(List<Float> values) {
            addCriterion("sensor4 in", values, "sensor4");
            return (Criteria) this;
        }

        public Criteria andSensor4NotIn(List<Float> values) {
            addCriterion("sensor4 not in", values, "sensor4");
            return (Criteria) this;
        }

        public Criteria andSensor4Between(Float value1, Float value2) {
            addCriterion("sensor4 between", value1, value2, "sensor4");
            return (Criteria) this;
        }

        public Criteria andSensor4NotBetween(Float value1, Float value2) {
            addCriterion("sensor4 not between", value1, value2, "sensor4");
            return (Criteria) this;
        }

        public Criteria andSensor5IsNull() {
            addCriterion("sensor5 is null");
            return (Criteria) this;
        }

        public Criteria andSensor5IsNotNull() {
            addCriterion("sensor5 is not null");
            return (Criteria) this;
        }

        public Criteria andSensor5EqualTo(Float value) {
            addCriterion("sensor5 =", value, "sensor5");
            return (Criteria) this;
        }

        public Criteria andSensor5NotEqualTo(Float value) {
            addCriterion("sensor5 <>", value, "sensor5");
            return (Criteria) this;
        }

        public Criteria andSensor5GreaterThan(Float value) {
            addCriterion("sensor5 >", value, "sensor5");
            return (Criteria) this;
        }

        public Criteria andSensor5GreaterThanOrEqualTo(Float value) {
            addCriterion("sensor5 >=", value, "sensor5");
            return (Criteria) this;
        }

        public Criteria andSensor5LessThan(Float value) {
            addCriterion("sensor5 <", value, "sensor5");
            return (Criteria) this;
        }

        public Criteria andSensor5LessThanOrEqualTo(Float value) {
            addCriterion("sensor5 <=", value, "sensor5");
            return (Criteria) this;
        }

        public Criteria andSensor5In(List<Float> values) {
            addCriterion("sensor5 in", values, "sensor5");
            return (Criteria) this;
        }

        public Criteria andSensor5NotIn(List<Float> values) {
            addCriterion("sensor5 not in", values, "sensor5");
            return (Criteria) this;
        }

        public Criteria andSensor5Between(Float value1, Float value2) {
            addCriterion("sensor5 between", value1, value2, "sensor5");
            return (Criteria) this;
        }

        public Criteria andSensor5NotBetween(Float value1, Float value2) {
            addCriterion("sensor5 not between", value1, value2, "sensor5");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rates
     *
     * @mbggenerated do_not_delete_during_merge Thu Jan 31 22:25:02 EET 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
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