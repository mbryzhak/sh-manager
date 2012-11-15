package com.master.mybatis.mapper;

import com.master.mybatisgenerated.UserCredentialsMapper;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/sh-manager/spring/test-context.xml"})
public class UserCredentialsMapperTest {

    @Autowired
    private UserCredentialsMapper userCredentialsMapper;

    @Ignore
    @Test
    public void testUserCredentials(){

    }

    @Ignore
    @Test
    public void testGetUserCredentials(){

    }
}
