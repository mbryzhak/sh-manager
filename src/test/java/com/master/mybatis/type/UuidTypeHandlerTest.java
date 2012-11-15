package com.master.mybatis.type;

import com.master.mybatis.typehandler.UuidTypeHandler;
import static junit.framework.TestCase.*;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

@RunWith(JMock.class)
public class UuidTypeHandlerTest {

    Mockery context = new JUnit4Mockery();
    final ResultSet mockedResultSet = context.mock(ResultSet.class);
    final CallableStatement mockedCallableStatement = context.mock(CallableStatement.class);

    UuidTypeHandler typeHandler = new UuidTypeHandler();
    final String dummyColumnName = "COLUMN_NAME";
    final int dummyColumnNumber = 5;
    String uuidString = "";
    int callCount = 0;

/*    private void preInitRS() throws SQLException {
        context.checking(new Expectations(){
            {
                exactly(callCount).of(mockedResultSet).getString(dummyColumnName); will(returnValue(uuidString));
            }
        });
    }

    private void preInitCS() throws SQLException {
        context.checking(new Expectations(){
            {
                exactly(callCount).of(mockedCallableStatement).getString(dummyColumnNumber); will(returnValue(uuidString));
            }
        });
    }

    @Test
    public void testGetNullableResultRSHappy() throws SQLException {

        final UUID validUuid = UUID.randomUUID();
        this.uuidString = validUuid.toString();
        this.callCount = 2;
        preInitRS();

        assertEquals(typeHandler.getNullableResult(mockedResultSet, dummyColumnName), validUuid);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetNullableResultRSInvalidUuid() throws SQLException {

        this.uuidString = "BAD_UUID";
        this.callCount = 2;
        preInitRS();

        typeHandler.getNullableResult(mockedResultSet, dummyColumnName);
    }

    @Test
    public void testGetNullableResultRSNull() throws SQLException {

        this.uuidString = "";
        this.callCount = 1;
        preInitRS();

        assertNull(typeHandler.getNullableResult(mockedResultSet, dummyColumnName));
    }

    @Test
    public void testGetNullableResultCSHappy() throws SQLException {

        final UUID validUuid = UUID.randomUUID();
        this.uuidString = validUuid.toString();
        this.callCount = 2;
        preInitCS();

        assertEquals(typeHandler.getNullableResult(mockedCallableStatement, dummyColumnNumber), validUuid);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetNullableResultCSInvalidUuid() throws SQLException {

        this.uuidString = "BAD_UUID";
        this.callCount = 2;
        preInitCS();

        typeHandler.getNullableResult(mockedCallableStatement, dummyColumnNumber);
    }

    @Test
    public void testGetNullableResultCSNull() throws SQLException {

        this.uuidString = "";
        this.callCount = 1;
        preInitCS();

        assertNull(typeHandler.getNullableResult(mockedCallableStatement, dummyColumnNumber));
    }*/
}