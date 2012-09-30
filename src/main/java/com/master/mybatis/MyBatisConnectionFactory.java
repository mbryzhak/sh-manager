package com.master.mybatis;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

public class MyBatisConnectionFactory {

	private static SqlSessionFactory sqlSessionFactory;
	private static String resource = "sh-manager/mybatis/config/MapperConfig.xml";
	
	public static final Logger LOGGER = Logger.getLogger(MyBatisConnectionFactory.class);
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			
			if (sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder()
						.build(reader);
			}
			
		} catch (FileNotFoundException notFoundException) {
			LOGGER.error(notFoundException.getMessage());
		} catch (IOException ioException) {
			LOGGER.error(ioException.getMessage());
		}
	}

    /**
     * Method for getting newly created or existing @sqlSessionFactory
     *
     * @return sqlSessionFactory or null, if there was an errors until
     * creating sqlSessionFactory
     */
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory != null ? sqlSessionFactory : null;		
	}
}
