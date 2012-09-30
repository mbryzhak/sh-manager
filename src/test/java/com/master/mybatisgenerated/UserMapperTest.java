package com.master.mybatisgenerated;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;

import com.master.base.mybatis.MybatisTestBase;
import com.master.mybatis.SqlSessionManager;

import java.util.UUID;

public class UserMapperTest {

    @Ignore
	@Test
	public void testCountByExample() {
		fail("Not yet implemented");
	}

    @Ignore
	@Test
	public void testDeleteByPrimaryKey() {
		try {
			deleteUser();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

    @Ignore
	@Test
	public void testInsert() {
		try {
			instertUser();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testSelectByUserUuid() throws Exception {
		SqlSession session = SqlSessionManager.openSqlSession();
		
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			User user = mapper.selectByUserUuid(MybatisTestBase.USER_UUID);
            assertNotNull(user);
		} catch (Exception e) {
            fail(e.getMessage());
		}
	}

	@Test
	public void testSelectByPrimaryKey() throws Exception{
		SqlSession session = SqlSessionManager.openSqlSession();
		
		try{
			UserMapper mapper = session.getMapper(UserMapper.class);
			User user = mapper.selectByPrimaryKey(1);
			System.out.println(user.toString());
		} finally {
			session.close();
		}
	}

    @Ignore
	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

	private void instertUser() throws Exception {
		SqlSession session = SqlSessionManager.openSqlSession();
		
		try{
			UserMapper mapper = session.getMapper(UserMapper.class);
			mapper.insert(MybatisTestBase.createTestUser());
		} finally {
			session.close();
		}
	}
	
	private void deleteUser() throws Exception {
		SqlSession session = SqlSessionManager.openSqlSession();
		
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			mapper.deleteByPrimaryKey(1);
		} finally {
			
		}
	}
}
