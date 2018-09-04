package com.lin.boot.object_consumer.Service;

import com.lin.boot.interface_common.orm.HelloBean;
import com.lin.boot.interface_common.service.HelloServiceInterface;
import fallback.HelloServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
@FeignClient(name = "object-privider",fallback = HelloServiceFallBack.class) //降级处理(请求量大响应量小)
public interface HelloService extends HelloServiceInterface{
}
