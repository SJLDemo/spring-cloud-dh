package com.device.deviceserver.action;

import com.device.deviceserver.feignService.AlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController {
    @Autowired
    private AlarmService alarmService;

    @GetMapping("/findAlarmByDevice/{id}")
    public String findAlarmByDevice(@PathVariable String id){
        System.out.println("开始远程调用alarmService.findAlarm开始查询！");
        String rest=alarmService.findAlarm(id);
        return "alarm:"+rest;
    }
}
