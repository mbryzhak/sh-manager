package com.master.mybatisgenerated;

import java.util.UUID;

public class UserCredentials {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usercredentials.idCredential
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    private Integer idcredential;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usercredentials.credentialUUID
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    private UUID credentialUUID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column usercredentials.userPassword
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    private String userPassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usercredentials.idCredential
     *
     * @return the value of usercredentials.idCredential
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public Integer getIdcredential() {
        return idcredential;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usercredentials.idCredential
     *
     * @param idcredential the value for usercredentials.idCredential
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public void setIdcredential(Integer idcredential) {
        this.idcredential = idcredential;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usercredentials.credentialUUID
     *
     * @return the value of usercredentials.credentialUUID
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public UUID getCredentialUUID() {
        return credentialUUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usercredentials.credentialUUID
     *
     * @param credentialUUID the value for usercredentials.credentialUUID
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public void setCredentialUUID(UUID credentialUUID) {
        this.credentialUUID = credentialUUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column usercredentials.userPassword
     *
     * @return the value of usercredentials.userPassword
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column usercredentials.userPassword
     *
     * @param userPassword the value for usercredentials.userPassword
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }
}