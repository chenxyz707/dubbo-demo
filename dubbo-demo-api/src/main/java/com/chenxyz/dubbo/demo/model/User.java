package com.chenxyz.dubbo.demo.model;

import java.io.Serializable;

/**
 * Description
 *
 * @author chenxyz
 * @version 1.0
 * @date 2017-05-05
 */
public class User implements Serializable {

    private String id;

    private String name;

    private int age;

    public User(){}

    public User(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
