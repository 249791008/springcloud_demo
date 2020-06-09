package com.qf.service;

import org.springframework.stereotype.Component;

/**
 * @author yy
 * @date 2020/6/5 10:01
 */
@Component
public class ClassServiceHystrix implements IClassesService {
    @Override
    public String queryClsNameByCid(Integer cid) {
        return "服务器繁忙，请稍后再试。。。。";
    }
}
