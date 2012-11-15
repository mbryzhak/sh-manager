package com.master.mybatis.mapper;

import com.master.mybatis.MybatisTestBase;
import com.master.mybatisgenerated.User;
import com.master.mybatisgenerated.UserMapper;
import com.master.support.BaseTestSupprot;
import org.junit.Test;
import static junit.framework.TestCase.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/sh-manager/spring/test-context.xml"})
public class UserMapperTest extends BaseTestSupprot {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testCreateUser(){
        User user = MybatisTestBase.createTestUser();
        userMapper.insert(user);
    }

    @Test
    public void testGetByEmail(){
        User user = userMapper.selectByPrimaryKey(3);
        User user1 = userMapper.selectByEmail(user.getUserEmail());
        assertNotNull(user1.getUserUUID());
    }

}
