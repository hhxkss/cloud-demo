package com.example.demo.controller;

import com.example.demo.common.entry.UserEntry;
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
    private RestTemplate restTemplate;

    @GetMapping
    Object login(@RequestParam("name") String name) {
        UserEntry entry = null;
        try {
            entry = restTemplate.getForObject("http://cloud-demo-service/user/" + name, UserEntry.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entry;
    }
}
