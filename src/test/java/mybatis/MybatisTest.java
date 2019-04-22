package mybatis;

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

public class MybatisTest {

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

    /**
     * 测试原生的mybatis框架
     */
    @Test
    public void mybatisTest(){

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

    /**
     * 使用存储过程
     */
    @Test
    public void testMybatisCallProcedure(){
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee emp = new Employee();
        emp.setId(11007);
        emp.setName("奇国远");
        emp.setAge(34);
        employeeMapper.callProcedureInsertAEmp(emp);
    }

    /**
     * 使用函数
     */
    @Test
    public void testMybatisCallFunction(){
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Integer i = employeeMapper.callFunctionContEmp(11007);
        System.out.println(i);
    }
}
