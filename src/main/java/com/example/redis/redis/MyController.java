package com.example.redis.redis;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    @Cacheable("hello")
    public String hello(){
        System.out.println("Hello com cache");
        return "Hello";
    }

    @GetMapping("/limpar")
    @CacheEvict("hello")
    public String LimpaHello(){
        System.out.println("Limpando o cache");
        return "Hello limpado";
    }
}
