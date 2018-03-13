package com.chenxyz.dubbo.demo;

/**
 * Description
 *
 * @author chenlinchao
 * @version 1.0
 * @date 2018-03-13
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
