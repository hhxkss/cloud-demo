package com.example.demo.service;

import com.example.demo.common.entry.UserEntry;
import org.springframework.stereotype.Component;

/**
 * Created by Gary Kuang on 2018/2/23.
 */
@Component
public class UserFeignClientFallback implements UserFeignClient {

    @Override
    public UserEntry login(String name) {
        UserEntry entry = new UserEntry();
        entry.setId(-1);
        entry.setName(name);
        return entry;
    }
}
