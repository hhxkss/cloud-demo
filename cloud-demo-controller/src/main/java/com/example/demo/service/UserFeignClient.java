package com.example.demo.service;

import com.example.demo.common.entry.UserEntry;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Gary Kuang on 2018/2/23.
 */
@FeignClient(name="cloud-demo-service")
public interface UserFeignClient {

    @GetMapping("/user/{name}")
    UserEntry login(@PathVariable("name") String name);
}
