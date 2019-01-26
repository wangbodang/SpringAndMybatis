package spring;

import com.wangbodang.demo.entity.DemoEntity;
import com.wangbodang.demo.entity.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextTest {

    /**
     * 测试spring容器
     */
    @Test
    public void contextTest01(){
        String config = "conf/spring-conf.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Employee emp = (Employee) ac.getBean("employee");
        System.out.println(emp);
        DemoEntity demoEntity = (DemoEntity) ac.getBean("demoEntity");
        System.out.println(demoEntity);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((AbstractApplicationContext) ac).close();
    }
}
