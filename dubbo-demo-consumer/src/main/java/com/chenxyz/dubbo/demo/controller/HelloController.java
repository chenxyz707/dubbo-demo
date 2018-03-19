package com.chenxyz.dubbo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenxyz.dubbo.demo.model.User;
import com.chenxyz.dubbo.demo.service.HelloService;

/**
 * Description
 *
 * @author chenxyz
 * @version 1.0
 * @date 2018-03-19
 */
@Controller
@RequestMapping("")
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(String name){
        System.out.println("=========sayHello=======");
        return helloService.sayHello(name);
    }

    @RequestMapping("addUser")
    @ResponseBody
    public int addUser() {
        User user = new User(null, "chenxyz", 20);
        return helloService.addUser(user);
    }
}
