package com.wangbodang.demo.service.impl;

import com.wangbodang.demo.service.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FruitServiceImpl {
    @Autowired
    private Apple apple;
    @Autowired
    private GinSeng ginseng;
    //定义一个产生Bean的方法
    @Bean(name="getApple")
    public Fruit<?> getApple(){
        System.out.println(apple.getClass().getName().hashCode());
        System.out.println(ginseng.getClass().getName().hashCode());
        return new Apple();
}
}
