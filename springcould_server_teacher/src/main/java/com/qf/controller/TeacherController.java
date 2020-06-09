package com.qf.controller;

import com.qf.service.IClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yy
 * @date 2020/6/4 22:10
 */
@RestController
@RequestMapping("/tea")
public class TeacherController {

    @Autowired
    private IClassesService classesService;

    @RequestMapping("/queryTeaInfo")
    public String queryTeaInfo(Integer tid){
        String tname = " zhangsan";
        Integer cid = 1 ;

        String cname = classesService.queryClsNameByCid(cid);
        return " jiaoshimingchen:"+tname+"所在班级："+cname;
    }
}
