package com.master.mybatis.model;

import java.util.Date;

public class Users {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.username
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.password
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.first_name
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    private String firstName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.last_name
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    private String lastName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.enabled
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    private Boolean enabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.date_created
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    private Date dateCreated;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    public Users(String username, String password, String firstName, String lastName, Boolean enabled, Date dateCreated) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.enabled = enabled;
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    public Users() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.username
     *
     * @return the value of users.username
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.username
     *
     * @param username the value for users.username
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.password
     *
     * @return the value of users.password
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.password
     *
     * @param password the value for users.password
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.first_name
     *
     * @return the value of users.first_name
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.first_name
     *
     * @param firstName the value for users.first_name
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.last_name
     *
     * @return the value of users.last_name
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.last_name
     *
     * @param lastName the value for users.last_name
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.enabled
     *
     * @return the value of users.enabled
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.enabled
     *
     * @param enabled the value for users.enabled
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.date_created
     *
     * @return the value of users.date_created
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.date_created
     *
     * @param dateCreated the value for users.date_created
     *
     * @mbggenerated Thu Jan 31 22:25:01 EET 2013
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}