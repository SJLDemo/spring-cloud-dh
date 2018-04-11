package com.device.deviceserver.feignService;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "alarm-server")
public interface AlarmService {
    @RequestMapping(value = "/alarm/{id}",method = RequestMethod.GET)
    public String findAlarm(@PathVariable("id") String id);
}
