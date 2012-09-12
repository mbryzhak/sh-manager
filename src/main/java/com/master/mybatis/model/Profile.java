package com.master.mybatis.model;

public class Profile {

	private int profileId;
	private String profileName;

	Profile() {
	}

	public Profile(int profileId, String profileName) {
		super();
		this.profileId = profileId;
		this.profileName = profileName;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
}
