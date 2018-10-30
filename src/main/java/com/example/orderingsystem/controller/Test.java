package com.example.orderingsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping
    public void test(Long dashu) {
        System.out.println(dashu);
    }
}
