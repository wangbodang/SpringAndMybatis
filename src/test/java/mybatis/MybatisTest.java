package mybatis;

import com.wangbodang.demo.entity.Employee;
import com.wangbodang.demo.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {

    /**
     * 测试原生的mybatis框架
     */
    @Test
    public void mybatisTest(){
        String resource = "conf/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee emp = new Employee();
        //emp.setId(11003);
        emp.setName("奇国远");
        emp.setAge(34);
        //employeeMapper.insert(emp);
        //System.out.println("->插入的记录id:"+emp.getId());
        sqlSession.commit();

        System.out.println("\n----------------------------------------------\n");

        Employee employee = employeeMapper.selectByPrimaryKey(11001);
        System.out.println(employee);
        sqlSession.close();
    }
    /**
     * 原生的mybatis框架使用连接池
     */
    @Test
    public void myBatisWithDbcpTest(){


    }
}
