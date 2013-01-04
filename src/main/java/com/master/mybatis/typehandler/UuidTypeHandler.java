package com.master.mybatis.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

/**
 *  UuidTypeHandler used for converting UUID to String and retrieve UUID
 *  from String while working with mybatis orm & mysql db
 *
 *  @author mbryzhak
 */
@MappedTypes(value = UUID.class)
public class UuidTypeHandler implements TypeHandler<UUID> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, UUID uuid, JdbcType jdbcType) throws SQLException {
        if(uuid == null) {
            preparedStatement.setNull(i, jdbcType.TYPE_CODE);
        }
        preparedStatement.setString(i, uuid.toString());
    }

    @Override
    public UUID getResult(ResultSet resultSet, String s) throws SQLException {
        return resultSet.getString(s) == null ? null : UUID.fromString(resultSet.getString(s));
    }

    @Override
    public UUID getResult(CallableStatement callableStatement, int i) throws SQLException {
        return callableStatement.getString(i) == null ? null : UUID.fromString(callableStatement.getString(i));
    }
}
