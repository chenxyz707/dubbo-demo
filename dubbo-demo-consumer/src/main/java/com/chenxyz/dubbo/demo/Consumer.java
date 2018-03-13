package com.chenxyz.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description
 *
 * @author chenxyz
 * @version 1.0
 * @date 2018-03-13
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();

        HelloService helloService = (HelloService) context.getBean("helloService");

        String hello = helloService.sayHello("world");
        System.out.println(hello);
    }
}
