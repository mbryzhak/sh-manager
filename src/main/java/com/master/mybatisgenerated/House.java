package com.master.mybatisgenerated;

import java.util.UUID;

public class House {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column houses.idHouse
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    private Integer idhouse;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column houses.houseUUID
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    private UUID houseUUID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column houses.userUUID
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    private UUID userUUID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column houses.profileUUID
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    private UUID profileUUID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column houses.houseName
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    private String houseName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column houses.houseAddress
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    private String houseAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column houses.houseType
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    private String houseType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column houses.idHouse
     *
     * @return the value of houses.idHouse
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public Integer getIdhouse() {
        return idhouse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column houses.idHouse
     *
     * @param idhouse the value for houses.idHouse
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public void setIdhouse(Integer idhouse) {
        this.idhouse = idhouse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column houses.houseUUID
     *
     * @return the value of houses.houseUUID
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public UUID getHouseUUID() {
        return houseUUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column houses.houseUUID
     *
     * @param houseUUID the value for houses.houseUUID
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public void setHouseUUID(UUID houseUUID) {
        this.houseUUID = houseUUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column houses.userUUID
     *
     * @return the value of houses.userUUID
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public UUID getUserUUID() {
        return userUUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column houses.userUUID
     *
     * @param userUUID the value for houses.userUUID
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public void setUserUUID(UUID userUUID) {
        this.userUUID = userUUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column houses.profileUUID
     *
     * @return the value of houses.profileUUID
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public UUID getProfileUUID() {
        return profileUUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column houses.profileUUID
     *
     * @param profileUUID the value for houses.profileUUID
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public void setProfileUUID(UUID profileUUID) {
        this.profileUUID = profileUUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column houses.houseName
     *
     * @return the value of houses.houseName
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public String getHouseName() {
        return houseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column houses.houseName
     *
     * @param houseName the value for houses.houseName
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public void setHouseName(String houseName) {
        this.houseName = houseName == null ? null : houseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column houses.houseAddress
     *
     * @return the value of houses.houseAddress
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public String getHouseAddress() {
        return houseAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column houses.houseAddress
     *
     * @param houseAddress the value for houses.houseAddress
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress == null ? null : houseAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column houses.houseType
     *
     * @return the value of houses.houseType
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public String getHouseType() {
        return houseType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column houses.houseType
     *
     * @param houseType the value for houses.houseType
     *
     * @mbggenerated Sun Oct 07 00:57:29 EEST 2012
     */
    public void setHouseType(String houseType) {
        this.houseType = houseType == null ? null : houseType.trim();
    }
}