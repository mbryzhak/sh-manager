package com.master.mybatis.mapper;

import com.master.mybatisgenerated.ProfileMapper;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/sh-manager/spring/test-context.xml"})
public class ProfilesMapperTest {

    @Autowired
    private ProfileMapper profileMapper;

    @Ignore
    @Test
    public void testCreateProfile(){

    }

    @Ignore
    @Test
    public void testGetProfile(){

    }
}
