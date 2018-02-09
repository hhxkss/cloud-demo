package com.example.demo.service.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.common.service.UserService;
import com.example.demo.common.entry.UserEntry;

/**
 * Created by Gary Kuang on 2018/2/9.
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public UserEntry login(String name, String password) {
        if ("user1".equals(name) && "123".equals(password)) {
            UserEntry user = new UserEntry();
            user.setId(1000L);
            user.setName(name);

            return user;
        } else {
            return null;
        }
    }
}
