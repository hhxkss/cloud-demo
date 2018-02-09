package com.example.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.common.entry.UserEntry;
import com.example.demo.common.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Gary Kuang on 2018/2/9.
 */
@RestController
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @RequestMapping(method= RequestMethod.GET)
    Object login(@RequestParam("name") String name, @RequestParam("password") String password) {
        UserEntry entry = null;
        try {
            entry = userService.login(name, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entry;
    }
}
