package spring;

import com.wangbodang.common.spring.BeanEntity;
import com.wangbodang.demo.entity.DemoEntity;
import com.wangbodang.demo.entity.Employee;
import com.wangbodang.demo.service.impl.Apple;
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

        BeanEntity beanEntity = (BeanEntity) ac.getBean("beanEntity");
        System.out.println(beanEntity.getSpringVersion());

        //ac.getBean("getApple");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((AbstractApplicationContext) ac).close();
    }
}
