package com.chenxyz.dubbo.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description
 *
 * @author chenxyz
 * @version 1.0
 * @date 2018-03-19
 */
@Configuration
@MapperScan(basePackages = "com.chenxyz.dubbo.demo.dao")
public class MyBatisConfig {
}
