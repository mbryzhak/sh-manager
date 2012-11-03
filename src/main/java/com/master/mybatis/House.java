package com.master.mybatis;

import java.util.UUID;

/**
 * Contains info about house
 */
public class House {

    private Integer idhouse;
    private UUID houseUUID;
    private UUID userUUID;
    private UUID profileUUID;
    private String houseName;
    private String houseAddress;
    private String houseType;

    public Integer getIdhouse() {
        return idhouse;
    }

    public void setIdhouse(Integer idhouse) {
        this.idhouse = idhouse;
    }

    public UUID getHouseUUID() {
        return houseUUID;
    }

    public void setHouseUUID(UUID houseUUID) {
        this.houseUUID = houseUUID;
    }

    public UUID getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(UUID userUUID) {
        this.userUUID = userUUID;
    }

    public UUID getProfileUUID() {
        return profileUUID;
    }

    public void setProfileUUID(UUID profileUUID) {
        this.profileUUID = profileUUID;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    @Override
    public String toString(){
        final String semicolonPattern = "; ";
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(": ");
        sb.append("HouseId: ").append(idhouse).append(semicolonPattern);
        sb.append("HouseUUID: ").append(houseUUID).append(semicolonPattern);
        sb.append("UserUUID: ").append(userUUID).append(semicolonPattern);
        sb.append("ProfileUUID: ").append(profileUUID).append(semicolonPattern);
        sb.append("HouseName: ").append(houseName).append(semicolonPattern);
        sb.append("HouseAddress: ").append(houseAddress).append(semicolonPattern);
        sb.append("HouseType: ").append(houseType).append(semicolonPattern);
        return sb.toString();
    }

}