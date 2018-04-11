package com.alarm.alarmserver.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlarmControler {

    @GetMapping("/alarm/{id}")
    public String findAlarmById(@PathVariable String id){
        System.out.println("查询结束");
        return id;
    }
}
