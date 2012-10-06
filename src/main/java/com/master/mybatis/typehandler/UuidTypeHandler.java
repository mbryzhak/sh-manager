package com.master.mybatis.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

public class UuidTypeHandler extends BaseTypeHandler {

    public UuidTypeHandler(){
        super();
    }

    @Override
	public Object getNullableResult(ResultSet rs, String columnName)
			throws SQLException, IllegalArgumentException {
		return rs.getString(columnName) != "" ? UUID.fromString(rs.getString(columnName)) : null;
	}

	@Override
	public Object getNullableResult(CallableStatement cs, int columnNumber)
			throws SQLException, IllegalArgumentException {
		return cs.getString(columnNumber) != "" ? UUID.fromString(cs.getString(columnNumber)) : null;
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int columnNumber,
			Object uuid, JdbcType jdbcType) throws SQLException {
		ps.setString(columnNumber, uuid.toString());
	}

}
