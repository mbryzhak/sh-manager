package com.master.mybatis.mapper;

import com.master.mybatisgenerated.HouseMapper;
import com.master.support.BaseTestSupprot;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/sh-manager/spring/test-context.xml"})
public class HouseMapperTest extends BaseTestSupprot {

    @Autowired
    private HouseMapper houseMapper;

    @Ignore
    @Test
    public void testCreateHouse(){

    }

    @Ignore
    @Test
    public void testGetHouse(){

    }
}
