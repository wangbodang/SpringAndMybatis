package mybatis;

import org.junit.Test;

import java.sql.*;

public class JdbcTest {

    /**
     * 使用原生的jdbc连接数据库
     *
     String driver = "oracle.jdbc.driver.OracleDriver";
     String url = "jdbc:oracle:thin:@192.168.0.112:1521:orcl";
     String user = "system";
     String pwd = "yskj666";

     */
    @Test
    public void testJdbc(){
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false";
        String user = "root";
        String password = "7241";

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "select * from employee";
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()){
                Integer id = rs.getInt("Id");
                String name = rs.getString("Name");
                  Integer age = rs.getInt("Age");
                Double salary = rs.getDouble("Salary");
                System.out.println(" -> id name age salary:"+id+" "+name+" "+age+" "+salary);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
