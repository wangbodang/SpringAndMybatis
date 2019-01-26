package com.wangbodang.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.annotation.Configuration;

@RunWith(BlockJUnit4ClassRunner.class)
public class Config {
    public Config(){
        //super("classpath:conf/spring-conf.xml");
    }
    @Test
    public void test(){
        //super.getBean("getApple");//这个Bean从哪来，从上面的@Bean下面的方法中来，返回的是一个Apple类实例对象
        System.out.println("fuck");
    }
}
