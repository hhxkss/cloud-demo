package com.example.demo.common.entry;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Gary Kuang on 2018/2/9.
 */
@Data
public class UserEntry implements Serializable {

    private long id;

    private String name;

}
