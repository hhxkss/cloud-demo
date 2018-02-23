package com.example.demo.controller;

import com.example.demo.service.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Gary Kuang on 2018/2/9.
 */
@RestController
public class UserController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping
    Object login(@RequestParam("name") String name) {
        return this.userFeignClient.login(name);
    }
}
