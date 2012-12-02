package com.master.mybatis;

import java.util.Date;
import java.util.UUID;

import com.master.common.type.UserRole;
import com.master.helper.PasswordHelper;
import com.master.mybatisgenerated.House;
import com.master.mybatisgenerated.User;
import com.master.mybatisgenerated.UserCredentials;
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

    public static UserCredentials createTestCredentials(){
        UserCredentials credentials = new UserCredentials();
        credentials.setCredentialUUID(USER_UUID);
        credentials.setUserPassword(new PasswordHelper(USER_UUID).encodePassword("test_pass"));
        return credentials;
    }

}
