package com.chenxyz.dubbo.demo.service;

import com.chenxyz.dubbo.demo.model.User;

/**
 * Description
 *
 * @author chenxyz
 * @version 1.0
 * @date 2018-03-13
 */
public interface HelloService {

    String sayHello(String name);

    int addUser(User user);
}
