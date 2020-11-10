package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @RequestMapping("/test")
    public void test(){
        System.out.println("test 2...");
    }

    @RequestMapping("/add")
    public void add(){
        System.out.println("add... ");
    }

}
