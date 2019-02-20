package mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DruidTest {

    /**
     * 使用阿里的druid连接池lpk
     */
    @Test
    public void testDruidPool(){
        Properties properties =  new Properties();
        // 使用ClassLoader加载properties配置文件生成对应的输入流
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("conf/db.properties");
        // 使用properties对象加载输入流
        try {
            properties.load(in);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //获取key对应的value值
        System.out.println("--->driver:"+properties.get("jdbc.driver").toString());

        DruidDataSource dds = new DruidDataSource();
        dds.setDriverClassName(properties.get("jdbc.driver").toString());
        dds.setUrl(properties.get("jdbc.url").toString());
        dds.setUsername(properties.get("jdbc.username").toString());
        dds.setPassword(properties.get("jdbc.password").toString());

        try {
            DruidPooledConnection conn = dds.getConnection();
            String sql = "select id, name, age from employee";
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while(rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id+", "+name);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
