package com.qf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yy
 * @date 2020/6/4 14:52
 */
@RestController
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/queryStuInfo")
    public String queryStuInfo(Integer sid){
        String name;
        Integer cid;

        switch (sid){
            case 1:
                name = "xiaoming";
                cid = 1 ;
                break;
            case 2:
                name = "xiaohong";
                cid = 2;
                break;
            default:
                name = "wuciren";
                cid = -1;
                break;
        }

        String cname = restTemplate.getForObject("http://SERVER-CLASSES/cls/queryName?cid="+cid,String.class);
        return "学生姓名为："+name+",所在班级为："+cname;
    }
}
