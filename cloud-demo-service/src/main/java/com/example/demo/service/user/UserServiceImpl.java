package com.example.demo.service.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.common.entry.UserEntry;
import com.example.demo.common.service.UserService;
import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Gary Kuang on 2018/2/9.
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserEntry login(String name, String password) {
        return userDao.getUser(name, password);
    }
}
