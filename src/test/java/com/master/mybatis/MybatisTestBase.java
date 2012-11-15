package com.master.mybatis;

import java.util.Date;
import java.util.UUID;

import com.master.common.type.UserRole;
import com.master.mybatisgenerated.House;
import com.master.mybatisgenerated.User;
import com.master.support.BaseTestSupprot;
import org.apache.ibatis.session.SqlSession;

public class MybatisTestBase {
	
	private static final UUID USER_UUID = UUID.randomUUID();
    private static final String USER_EMAIL = USER_UUID.toString().substring(0, 8) + "@test.com";

	public static User createTestUser(){
		User user = new User();
		user.setUserUUID(USER_UUID);
        user.setUserEmail(USER_EMAIL);
        user.setUserDateCreated(new Date());
        user.setUserRole(UserRole.OWNER);
        user.setUserFirstName("Vasia");
		user.setUserLastName("Pupkin");
        user.setUserSex(true);
		return user;
	}

}
