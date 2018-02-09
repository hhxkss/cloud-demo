package com.example.demo.common.service;

import com.example.demo.common.entry.UserEntry;

/**
 * Created by Gary Kuang on 2018/2/9.
 */
public interface UserService {

    UserEntry login(String name, String password);
}
