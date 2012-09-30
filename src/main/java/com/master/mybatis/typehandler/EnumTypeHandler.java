package com.master.mybatis.typehandler;

import com.master.sh_manager.UserRole;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: mbryzhak
 * Date: 9/28/12
 * Time: 12:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class EnumTypeHandler extends BaseTypeHandler {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Object myenum, JdbcType jdbcType) throws SQLException {
        ps.setString(i, myenum.toString());
    }

    @Override
    public Object getNullableResult(ResultSet rs, String s) throws SQLException {
        return rs.getString(s) != "" ? UserRole.getRoleByName(rs.getString(s)) : null;
    }

    @Override
    public Object getNullableResult(CallableStatement cs, int i) throws SQLException {
        return cs.getString(i) != "" ? UserRole.getRoleByName(cs.getString(i)) : null;
    }
}
