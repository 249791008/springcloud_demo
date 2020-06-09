package com.qf.springcloud_server_classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.qf")
@EnableEurekaClient
public class SpringcloudServerClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServerClassesApplication.class, args);
    }

}
