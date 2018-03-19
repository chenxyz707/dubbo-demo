package com.chenxyz.dubbo.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Description
 *
 * @author chenxyz
 * @version 1.0
 * @date 2018-03-19
 */
@Configuration
@PropertySource("classpath:dubbo/dubbo.properties")
@ImportResource("classpath:dubbo/*.xml")
public class DubboConfig {
}
