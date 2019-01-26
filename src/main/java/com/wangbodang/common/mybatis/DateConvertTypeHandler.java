package com.wangbodang.common.mybatis;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertTypeHandler extends BaseTypeHandler<String> {
    private String getMillisecondValue(String columnValue) {
        System.out.println("--->执行时间转换器");
        if (columnValue == null)
            return null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//$NON-NLS-1$
        Date date = null;
        String formatDateStr = null;
        try {
            date = sdf.parse(columnValue);
            formatDateStr = sdf.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
        return formatDateStr;
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType)
            throws SQLException {
        ps.setString(i, parameter);

    }

    @Override
    public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String columnValue = rs.getString(columnName);
        return this.getMillisecondValue(columnValue);
    }

    @Override
    public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String columnValue = rs.getString(columnIndex);
        return this.getMillisecondValue(columnValue);
    }

    @Override
    public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String columnValue = cs.getString(columnIndex);
        return this.getMillisecondValue(columnValue);
    }
}
