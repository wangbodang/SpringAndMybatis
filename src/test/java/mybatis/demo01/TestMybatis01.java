package mybatis.demo01;

import com.wangbodang.demo.entity.Employee;
import com.wangbodang.demo.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis01 {
    SqlSession sqlSession =null;

    @Before
    public void init(){
        String resource = "conf/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }
    @After
    public void destory(){
        if (sqlSession != null){
            sqlSession.close();
        }
    }

    @Test
    public void testUseMybatis(){
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.selectByPrimaryKey(11001);
        System.out.println(employee);
    }

    /**
     * 测试一个参数时不加@Param
     */
    @Test
    public void testParamConvert(){
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employeeList = employeeMapper.getEmployeeByName("王伯当");
        System.out.println(employeeList.get(0));
    }

    /**
     * 测试一个参数时不加@Param
     */
    @Test
    public void testParamConvert2(){
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employeeList = employeeMapper.getEmployeeByAge(34);
        System.out.println(employeeList.get(0));
    }
}
