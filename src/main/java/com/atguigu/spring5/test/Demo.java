package com.atguigu.spring5.test;

import com.atguigu.spring5.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    @Test
    public void testUser(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean4.xml");
        UserService userService=context.getBean("userService",UserService.class);
        userService.account();
    }



}
