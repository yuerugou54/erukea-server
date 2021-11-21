/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.microservice.erukea.server.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @program: erukea-server
 * @description:
 * @author: Kevin Ma
 * @create: 2021-11-19
 **/
@SpringBootApplication
@EnableConfigurationProperties
@EnableAsync
@ComponentScan("com.microservice.erukea")
@EnableEurekaServer
public class ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);
    }
}
