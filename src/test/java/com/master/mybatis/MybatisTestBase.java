package com.master.mybatis;

import java.util.Date;
import java.util.UUID;

import com.master.common.type.UserRole;
import com.master.mybatis.MybatisSessionFactoryBean;
import com.master.mybatisgenerated.User;
import org.apache.ibatis.session.SqlSession;

public class MybatisTestBase {
	
	public static final UUID USER_UUID = UUID.randomUUID();
    public static final String USER_EMAIL = "test@test.com";
    public static final Date USER_DATE_CREATED = new Date();
    public static final UserRole USER_ROLE = UserRole.MANAGER;
    public static final String USER_FIRST_NAME = "Vasia";
	public static final String USER_LAST_NAME = "Pupkin";
    public static final boolean USER_SEX = true;

	public static User createTestUser(){
		User user = new User();
		user.setUserUUID(USER_UUID);
        user.setUserEmail(USER_EMAIL);
        user.setUserDateCreated(USER_DATE_CREATED);
        user.setUserRole(USER_ROLE);
        user.setUserFirstName(USER_FIRST_NAME);
		user.setUserLastName(USER_LAST_NAME);
        user.setUserSex(USER_SEX);
		return user;
	}

}
