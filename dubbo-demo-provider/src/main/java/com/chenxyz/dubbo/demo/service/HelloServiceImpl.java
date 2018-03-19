package com.chenxyz.dubbo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.chenxyz.dubbo.demo.dao.UserDao;
import com.chenxyz.dubbo.demo.model.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description
 *
 * @author chenxyz
 * @version 1.0
 * @date 2018-03-13
 */
@Transactional
public class HelloServiceImpl implements HelloService {

    @Autowired
    UserDao userDao;

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

    @Override
    public int addUser(User user) {
        return userDao.add(user);
    }
}
