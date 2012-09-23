package com.master.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

public class ManageSqlSession {

	public static final Logger LOGGER = Logger.getLogger(ManageSqlSession.class);
	
	public static SqlSession openSqlSession() throws Exception {

		SqlSessionFactory sessionFactory = MyBatisConnectionFactory
				.getSqlSessionFactory();
		try{
			return sessionFactory.openSession(true);			
		} catch (Exception e){
			LOGGER.error(e.getMessage());
			return null;
		}
	}

}
