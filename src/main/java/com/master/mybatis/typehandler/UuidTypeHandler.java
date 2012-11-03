package com.master.mybatis.typehandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class UuidTypeHandler implements TypeHandler<UUID> {

    @Override
    public void setParameter(PreparedStatement ps, int i, UUID parameter, JdbcType jdbcType) throws SQLException {
        if(parameter == null) {
            ps.setNull(i, jdbcType.TYPE_CODE);
        }
        ps.setString(i, parameter.toString());
    }

    @Override
    public UUID getResult(ResultSet rs, String columnName) throws SQLException {
        return rs.getString(columnName) == null ? null : UUID.fromString(rs.getString(columnName));
    }

    @Override
    public UUID getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return cs.getString(columnIndex) == null ? null : UUID.fromString(cs.getString(columnIndex));
    }

}

