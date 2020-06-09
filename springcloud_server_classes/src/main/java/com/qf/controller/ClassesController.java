package com.qf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yy
 * @date 2020/6/4 14:36
 */
@RestController
@RequestMapping("/cls")
public class ClassesController {

    @Value("${server.port}")
    private Integer port;

    @RequestMapping("/queryName")
    public String queryClsNameByCid(Integer cid){
        switch (cid){
            case 1:
                return "一年一班"+port;
            case 2:
                return "一年二班"+port;
                default:
             return "查无此版"+port;
        }
    }
}
