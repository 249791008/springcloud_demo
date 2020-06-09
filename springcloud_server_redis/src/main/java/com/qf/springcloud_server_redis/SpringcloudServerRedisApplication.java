package com.qf.springcloud_server_redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringcloudServerRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServerRedisApplication.class, args);
    }

}
