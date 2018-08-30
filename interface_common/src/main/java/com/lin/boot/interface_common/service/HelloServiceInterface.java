package com.lin.boot.interface_common.service;

import com.lin.boot.interface_common.orm.HelloBean;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
@RequestMapping("helloService") //   服务名
public interface HelloServiceInterface {

    @RequestMapping("findList") //方法名
    List<HelloBean> findList(Map<String,Object> request);

    @RequestMapping("saveAndUpdate")
    void saveAndUpdate(HelloBean helloBean);

    @RequestMapping("update")
    Boolean update(Map<String,Object> request);

    @RequestMapping("delete")
    Boolean delete(Map<String,Object> request);
}
