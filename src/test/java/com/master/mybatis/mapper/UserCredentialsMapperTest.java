package com.master.mybatis.mapper;

import com.master.mybatis.MybatisTestBase;
import com.master.mybatisgenerated.User;
import com.master.mybatisgenerated.UserCredentials;
import com.master.mybatisgenerated.UserCredentialsMapper;
import com.master.mybatisgenerated.UserMapper;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static junit.framework.TestCase.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/sh-manager/spring/test-context.xml"})
public class UserCredentialsMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserCredentialsMapper userCredentialsMapper;

    @Test
    public void testCreateUserCredentials(){
        User user = MybatisTestBase.createTestUser();
        UserCredentials credentials = MybatisTestBase.createTestCredentials();
        credentials.setCredentialUUID(user.getUserUUID());

        userMapper.insert(user);
        userCredentialsMapper.insert(credentials);
    }

    @Test
    public void testGetUserCredentials(){
        UserCredentials credentials = userCredentialsMapper.selectByPrimaryKey(1);
        UserCredentials credentials1 = userCredentialsMapper.selectByUuid(credentials.getCredentialUUID());
        assertEquals(credentials.getUserPassword(), credentials1.getUserPassword());
    }
}
