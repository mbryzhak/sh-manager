package com.master.mybatis.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.master.mybatis.model.Rates;
import com.master.mybatis.model.RatesExample.Criteria;
import com.master.mybatis.model.RatesExample.Criterion;
import com.master.mybatis.model.RatesExample;
import java.util.List;
import java.util.Map;

public class RatesSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public String countByExample(RatesExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("rates");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public String deleteByExample(RatesExample example) {
        BEGIN();
        DELETE_FROM("rates");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public String insertSelective(Rates record) {
        BEGIN();
        INSERT_INTO("rates");
        
        if (record.getUsername() != null) {
            VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getDateTime() != null) {
            VALUES("datetime", "#{dateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSensor1() != null) {
            VALUES("sensor1", "#{sensor1,jdbcType=REAL}");
        }
        
        if (record.getSensor2() != null) {
            VALUES("sensor2", "#{sensor2,jdbcType=REAL}");
        }
        
        if (record.getSensor3() != null) {
            VALUES("sensor3", "#{sensor3,jdbcType=REAL}");
        }
        
        if (record.getSensor4() != null) {
            VALUES("sensor4", "#{sensor4,jdbcType=REAL}");
        }
        
        if (record.getSensor5() != null) {
            VALUES("sensor5", "#{sensor5,jdbcType=REAL}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public String selectByExample(RatesExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("username");
        } else {
            SELECT("username");
        }
        SELECT("datetime");
        SELECT("sensor1");
        SELECT("sensor2");
        SELECT("sensor3");
        SELECT("sensor4");
        SELECT("sensor5");
        FROM("rates");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Rates record = (Rates) parameter.get("record");
        RatesExample example = (RatesExample) parameter.get("example");
        
        BEGIN();
        UPDATE("rates");
        
        if (record.getUsername() != null) {
            SET("username = #{record.username,jdbcType=VARCHAR}");
        }
        
        if (record.getDateTime() != null) {
            SET("datetime = #{record.dateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSensor1() != null) {
            SET("sensor1 = #{record.sensor1,jdbcType=REAL}");
        }
        
        if (record.getSensor2() != null) {
            SET("sensor2 = #{record.sensor2,jdbcType=REAL}");
        }
        
        if (record.getSensor3() != null) {
            SET("sensor3 = #{record.sensor3,jdbcType=REAL}");
        }
        
        if (record.getSensor4() != null) {
            SET("sensor4 = #{record.sensor4,jdbcType=REAL}");
        }
        
        if (record.getSensor5() != null) {
            SET("sensor5 = #{record.sensor5,jdbcType=REAL}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("rates");
        
        SET("username = #{record.username,jdbcType=VARCHAR}");
        SET("datetime = #{record.dateTime,jdbcType=TIMESTAMP}");
        SET("sensor1 = #{record.sensor1,jdbcType=REAL}");
        SET("sensor2 = #{record.sensor2,jdbcType=REAL}");
        SET("sensor3 = #{record.sensor3,jdbcType=REAL}");
        SET("sensor4 = #{record.sensor4,jdbcType=REAL}");
        SET("sensor5 = #{record.sensor5,jdbcType=REAL}");
        
        RatesExample example = (RatesExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rates
     *
     * @mbggenerated Thu Jan 31 22:25:02 EET 2013
     */
    protected void applyWhere(RatesExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}