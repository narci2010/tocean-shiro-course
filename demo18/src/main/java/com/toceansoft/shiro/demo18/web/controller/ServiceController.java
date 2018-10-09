package com.toceansoft.shiro.demo18.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>User: Toceansoft INC.
 * <p>Date: 14-2-26
 * <p>Version: 1.0
 */
@RestController
public class ServiceController {

    @RequestMapping("/hello")
    public String hello1(String[] param1, String param2) {
        return "hello" + param1[0] + param1[1] + param2;
    }
}
