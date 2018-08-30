package com.lin.boot.object_consumer.controller;

import com.lin.boot.interface_common.orm.HelloBean;
import com.lin.boot.object_consumer.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("testHello")
public class controller {
    @Autowired
    HelloService helloService;
    @RequestMapping("find")
    public void findList(){
        Map<String, Object> request = new HashMap<>();
        List<HelloBean> list = helloService.findList(request);
        System.out.println(list.get(0).getName());
    }
}
