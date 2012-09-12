package com.master.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class ManageSqlSession {

	public static SqlSession openAutoIncSqlSession() throws Exception {

		SqlSessionFactory sessionFactory = MyBatisConnectionFactory
				.getSqlSessionFactory();
		return sessionFactory.openSession(true);
	}

}
