package com.chenxyz.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Description
 *
 * @author chenxyz
 * @version 1.0
 * @date 2018-03-13
 */
public class Provider {

    public static void main(String[] args) throws IOException {
//        System.setProperty()
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.in.read(); // press any key to exit
    }
}
