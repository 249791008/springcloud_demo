package com.qf.springcloud_server_redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class SpringcloudServerRedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Test
    void contextLoads() {

        HashMap<String,String> map = new HashMap<>();

        stringRedisTemplate.opsForValue().set("sex","man");

    }

    /**
     * 通过注解设置缓存
     */
    @Cacheable(cacheNames ="mystu",key = "'stulist'")
    public void stu(){
        // 通常标记查询方法，如果缓存中有数据，
        // 就不会调用目标方法，如果缓存中没有数据，就会调用目标方法，并且将目标方法的返回值重建缓存
    }
    @CachePut(cacheNames = "mystu",key = "'stulist'")
    public void stu1(){
        //通常标记添加方法，目标方法一定会被调用，调用完目标方法后，会将目标方法的返回值，重建到缓存
    }

    @CacheEvict(cacheNames = "mystu",key = "'stulist'")
    public void stu2(){
        //通过标记于删除方法，在目标方法执行的前/后，删除指定缓存

    }

    @Caching
    public void stu3(){
        //是以上三个注解的集合体
    }

}
