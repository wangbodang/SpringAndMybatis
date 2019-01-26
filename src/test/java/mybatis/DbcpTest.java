package mybatis;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DbcpTest {

    /**
     * 使用Dbcp连接池连接mysql
     */
    @Test
    public void testDbcp(){
        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getClassLoader().getResourceAsStream("conf/db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        BasicDataSource bds = new BasicDataSource();
        bds.setDriverClassName(properties.getProperty("jdbc.driver"));
        bds.setUrl(properties.getProperty("jdbc.url"));
        bds.setUsername(properties.getProperty("jdbc.username"));
        bds.setPassword(properties.getProperty("jdbc.password"));
        Connection conn = null;
        try {
            conn = bds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql = "select * from employee";
        try {
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()){
                Integer id = rs.getInt("Id");
                String name = rs.getString("Name");
                Double salary = rs.getDouble("Salary");
                System.out.println(" -> id name salary:"+id+" "+name+" "+salary);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
