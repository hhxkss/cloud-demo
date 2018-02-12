package com.example.demo.service.user;

import com.example.demo.common.entry.UserEntry;
import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Gary Kuang on 2018/2/9.
 */
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/user/{name}")
    public UserEntry login(@PathVariable("name") String name) {
        return userDao.getUser(name);
    }
}
