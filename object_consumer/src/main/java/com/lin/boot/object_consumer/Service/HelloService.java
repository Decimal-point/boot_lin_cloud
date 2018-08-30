package com.lin.boot.object_consumer.Service;

import com.lin.boot.interface_common.orm.HelloBean;
import com.lin.boot.interface_common.service.HelloServiceInterface;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
@FeignClient("object-privider")
public interface HelloService extends HelloServiceInterface{
}
