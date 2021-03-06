package com.master.mybatis.model;

import com.master.common.type.UserRole;

public class Authorities {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authorities.username
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authorities.authority
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    private UserRole authority;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authorities
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public Authorities(String username, UserRole authority) {
        this.username = username;
        this.authority = authority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authorities
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public Authorities() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorities.username
     *
     * @return the value of authorities.username
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorities.username
     *
     * @param username the value for authorities.username
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorities.authority
     *
     * @return the value of authorities.authority
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public UserRole getAuthority() {
        return authority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorities.authority
     *
     * @param authority the value for authorities.authority
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public void setAuthority(UserRole authority) {
        this.authority = authority;
    }
}