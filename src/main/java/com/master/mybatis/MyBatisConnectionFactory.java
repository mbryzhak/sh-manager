package com.master.mybatis;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConnectionFactory {

	private static SqlSessionFactory sqlSessionFactory;

	static {

		try {
			String resource = "sh-manager/mybatis/config/SqlMapConfig.xml";
			Reader reader = Resources.getResourceAsReader(resource);

			if (sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder()
						.build(reader);
			}

			System.out.println("Properties readed successfully");

		} catch (FileNotFoundException notFoundException) {
			System.err.println(notFoundException);
		} catch (IOException ioException) {
			System.err.println(ioException);
		}
	}

	public static SqlSessionFactory getSqlSessionFactory() throws Exception {
		if (sqlSessionFactory == null) {
			throw new Exception("Invalid SQL Session Factoty");
		} else {
			return sqlSessionFactory;
		}
	}
}
