package com.example.demo.controller;

import com.example.demo.common.entry.UserEntry;
import com.example.demo.service.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Gary Kuang on 2018/2/9.
 */
@RestController
public class UserController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping
    Object login(@RequestParam("name") String name) {
        UserEntry entry = null;
        try {
            entry = this.userFeignClient.login(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entry;
    }
}
