package com.master.mybatis;

import static org.apache.commons.lang3.math.NumberUtils.toInt;

import org.mybatis.spring.SqlSessionFactoryBean;

/**
 * Created with IntelliJ IDEA.
 * User: mbryzhak
 * Date: 10/1/12
 * Time: 8:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class MybatisSessionFactoryBean extends SqlSessionFactoryBean {
/*
    private final static Logger LOGGER = Logger.getLogger(MybatisSessionFactoryBean.class);

    private List<TypedTypeHandler<?>> customTypeHandlers;

    protected SqlSessionFactory buildSqlSessionFactory() throws IOException{

        SqlSessionFactory factory = super.buildSqlSessionFactory();
        Configuration configuration = factory.getConfiguration();
        Properties properties = new Properties();

        try {
            final Field configProperty = SqlSessionFactoryBean.class.getDeclaredField("configurationProperties");
            configProperty.setAccessible(true);
            properties = (Properties) configProperty.get(this);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }

        configuration.setAutoMappingBehavior(AutoMappingBehavior.valueOf(defaultIfBlank(properties.getProperty("autoMappingBehavior"), "PARTIAL")));
        configuration.setCacheEnabled(booleanValueOf(properties.getProperty("cacheEnabled"), true));
        configuration.setLazyLoadingEnabled(booleanValueOf(properties.getProperty("lazyLoadingEnabled"), false));
        configuration.setAggressiveLazyLoading(booleanValueOf(properties.getProperty("aggressiveLazyLoading"), true));
        configuration.setMultipleResultSetsEnabled(booleanValueOf(properties.getProperty("multipleResultSetsEnabled"), true));
        configuration.setUseColumnLabel(booleanValueOf(properties.getProperty("useColumnLabel"), true));
        configuration.setUseGeneratedKeys(booleanValueOf(properties.getProperty("useGeneratedKeys"), false));
        configuration.setDefaultExecutorType(ExecutorType.valueOf(defaultIfBlank(properties.getProperty("defaultExecutorType"), "SIMPLE")));
        configuration.setDefaultStatementTimeout(toInt(properties.getProperty("defaultStatementTimeout"), 0));
        configuration.setMapUnderscoreToCamelCase(booleanValueOf(properties.getProperty("mapUnderscoreToCamelCase"), false));
        configuration.setSafeRowBoundsEnabled(booleanValueOf(properties.getProperty("safeRowBoundsEnabled"), true));

        if(customTypeHandlers != null){
            for(TypedTypeHandler<?> handler: customTypeHandlers){
                configuration.getTypeHandlerRegistry().register((Class) handler.getJavaType(), handler);
            }
        }
        return factory;
    }

    protected Boolean booleanValueOf(String value, Boolean defaultValue) {
        return value == null ? defaultValue : Boolean.valueOf(value);
    }

    public void setCustomTypeHandlers(List<TypedTypeHandler<?>> customTypeHandlers) {
        this.customTypeHandlers = customTypeHandlers;
    }*/
}
