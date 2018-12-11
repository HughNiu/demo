package com.ocean.demo.controller;

import com.ocean.demo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class IndexController {

    @RequestMapping("/test")
    public void testParam(Set<User> users){
        System.out.println(users);
    }

    @RequestMapping("/test2")
    public void testArray(String[] ids) {
        for (String id:ids) {
            System.out.println(id);
        }
    }
}
