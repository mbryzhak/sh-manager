package com.master.mybatis.dao;

import com.master.mybatis.model.*;
import com.master.support.BaseTestSupprot;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/sh-manager/spring/test-context.xml"})
public class AllMapperTest {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private AuthoritiesMapper authoritiesMapper;

    @Autowired
    private RatesMapper ratesMapper;

    @Test
    public void testCreateSelect() {
        Users user = BaseTestSupprot.createTestUser();
        Authorities authorities = BaseTestSupprot.createTestAuthorities(user.getUsername());
        Rates rates = BaseTestSupprot.createTestRates(user.getUsername());

        usersMapper.insert(user);
        assertNotNull(usersMapper.selectByPrimaryKey(user.getUsername()));

        authoritiesMapper.insert(authorities);
        assertNotNull(authoritiesMapper.selectByExample(getAuthoritiesExample(user.getUsername())));

        ratesMapper.insert(rates);
        assertNotNull(ratesMapper.selectByExample(getRatesExample(user.getUsername())));
    }

    private AuthoritiesExample getAuthoritiesExample(String username) {
        AuthoritiesExample example = new AuthoritiesExample();
        example.createCriteria().andUsernameEqualTo(username);
        return example;
    }

    private RatesExample getRatesExample(String username) {
        RatesExample example = new RatesExample();
        example.createCriteria().andUsernameEqualTo(username);
        return example;
    }
}
