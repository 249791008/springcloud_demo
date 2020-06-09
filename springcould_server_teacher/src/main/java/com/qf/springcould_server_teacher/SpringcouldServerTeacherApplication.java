package com.qf.springcould_server_teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.qf")
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.qf.service")
public class SpringcouldServerTeacherApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcouldServerTeacherApplication.class, args);
    }

}
