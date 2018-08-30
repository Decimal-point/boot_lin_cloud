package com.lin.boot.object_privider.service;

import com.lin.boot.interface_common.enumUtil.UseBody;
import com.lin.boot.interface_common.orm.HelloBean;
import com.lin.boot.interface_common.service.HelloServiceInterface;
import com.lin.boot.object_privider.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class HelloService implements HelloServiceInterface {

    private HelloDao helloDao = new HelloDao();
    @Override
    public List<HelloBean> findList(Map<String, Object> request) {
        if (!request.isEmpty()){
            System.out.print(request);
        }
        List<HelloBean> list = helloDao.findList(request);
        return list;
    }

    @Override
    public void saveAndUpdate(HelloBean helloBean) {

    }

    @Override
    public Boolean update(Map<String, Object> request) {
        return null;
    }

    @Override
    public Boolean delete(Map<String, Object> request) {
        return null;
    }
}
