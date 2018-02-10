package com.example.demo.dao;

import com.example.demo.common.entry.UserEntry;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Gary Kuang on 2018/2/10.
 */
public interface UserDao {

    UserEntry getUser(@Param("user") String user, @Param("password") String password);
}
