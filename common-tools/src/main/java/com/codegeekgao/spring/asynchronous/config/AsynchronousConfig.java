package com.codegeekgao.spring.asynchronous.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * asynchronous config class
 *
 * @author DonnieGao
 * @version Id: AsynchronousConfig.java, v 0.1 2018/8/23 22:33 DonnieGao Exp $$
 */
@Configuration
@ComponentScan("com.codegeekgao.spring.asynchronous")
@EnableAsync
public class AsynchronousConfig {

}