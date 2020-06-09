package com.qf.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yy
 * @date 2020/6/4 22:12
 */

@FeignClient(value = "SERVER-CLASSES", fallback = ClassServiceHystrix.class)
public interface IClassesService {

    @RequestMapping("/cls/queryName")
    String queryClsNameByCid(@RequestParam("cid") Integer cid);
}
