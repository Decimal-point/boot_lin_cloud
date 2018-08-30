package com.lin.boot.object_privider.dao;

import com.lin.boot.interface_common.enumUtil.UseBody;
import com.lin.boot.interface_common.orm.HelloBean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Service
public class HelloDao {
    public List<HelloBean> findList(Map<String,Object> request){
        ArrayList<HelloBean> list = new ArrayList<>();
        HelloBean helloBean = new HelloBean();
        helloBean.setName("xiaoming");
        helloBean.setUserBody(UseBody.MOUSE.getType());
        list.add(helloBean);
        return list;
    }
}
