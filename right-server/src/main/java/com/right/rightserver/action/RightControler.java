package com.right.rightserver.action;

import com.right.rightserver.service.RightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RightControler {
    @Autowired
    private RightService rightService;

    @GetMapping("/register/{id}")
    public void register(@PathVariable String id){
        System.out.println("开始调用注册service...");
        rightService.register();
    }
}
