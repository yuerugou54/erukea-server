/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */
package com.microservice.erukea.server.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: erukea-server
 * @description: 测试
 * @author: Kevin Ma
 * @create: 2021-11-19
 **/
@RestController
@RequestMapping(value = "/erukea")
public class TestController {

    @GetMapping(value = "/test")
    public String test() {
        return "success";
    }
}
