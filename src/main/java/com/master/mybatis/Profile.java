package com.master.mybatis;

import java.util.UUID;

public class Profile {

    private Integer idprofile;
    private UUID profileUUID;
    private UUID userUUID;
    private String profileName;
    private Integer electricityRate;
    private Integer waterRate;
    private Integer gasRate;
    private Integer lightsRate;
    private Integer temperatureRate;
    private Integer fireProtectionRate;
    private Integer stealProtectionRate;

    public Integer getIdprofile() {
        return idprofile;
    }

    public void setIdprofile(Integer idprofile) {
        this.idprofile = idprofile;
    }

    public UUID getProfileUUID() {
        return profileUUID;
    }

    public void setProfileUUID(UUID profileUUID) {
        this.profileUUID = profileUUID;
    }

    public UUID getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(UUID userUUID) {
        this.userUUID = userUUID;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public Integer getElectricityRate() {
        return electricityRate;
    }

    public void setElectricityRate(Integer electricityRate) {
        this.electricityRate = electricityRate;
    }

    public Integer getWaterRate() {
        return waterRate;
    }

    public void setWaterRate(Integer waterRate) {
        this.waterRate = waterRate;
    }

    public Integer getGasRate() {
        return gasRate;
    }

    public void setGasRate(Integer gasRate) {
        this.gasRate = gasRate;
    }

    public Integer getLightsRate() {
        return lightsRate;
    }

    public void setLightsRate(Integer lightsRate) {
        this.lightsRate = lightsRate;
    }

    public Integer getTemperatureRate() {
        return temperatureRate;
    }

    public void setTemperatureRate(Integer temperatureRate) {
        this.temperatureRate = temperatureRate;
    }

    public Integer getFireProtectionRate() {
        return fireProtectionRate;
    }

    public void setFireProtectionRate(Integer fireProtectionRate) {
        this.fireProtectionRate = fireProtectionRate;
    }

    public Integer getStealProtectionRate() {
        return stealProtectionRate;
    }

    public void setStealProtectionRate(Integer stealProtectionRate) {
        this.stealProtectionRate = stealProtectionRate;
    }

    @Override
    public String toString(){
        final String semicolonPattern = "; ";
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(": ");
        sb.append("ProfileId: ").append(idprofile).append(semicolonPattern);
        sb.append("ProfileUUID: ").append(profileUUID).append(semicolonPattern);
        sb.append("UserUUID: ").append(userUUID).append(semicolonPattern);
        sb.append("ProfileName: ").append(profileName).append(semicolonPattern);
        sb.append("ElectricityRate: ").append(electricityRate).append(semicolonPattern);
        sb.append("WaterRate: ").append(waterRate).append(semicolonPattern);
        sb.append("GasRate: ").append(gasRate).append(semicolonPattern);
        sb.append("LightsRate: ").append(lightsRate).append(semicolonPattern);
        sb.append("TemperatureRate: ").append(temperatureRate).append(semicolonPattern);
        sb.append("FireProtectionRate: ").append(fireProtectionRate).append(semicolonPattern);
        sb.append("StealProtectionRate: ").append(stealProtectionRate).append(semicolonPattern);
        return sb.toString();
    }
}