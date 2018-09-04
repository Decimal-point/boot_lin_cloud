package fallback;

import com.lin.boot.interface_common.orm.HelloBean;
import com.lin.boot.interface_common.service.HelloServiceInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 此类的使用相当于开启的feign 中的 hystrix 的一个降级操作
 */
public class HelloServiceFallBack implements HelloServiceInterface {

    public List<HelloBean> findList(Map<String, Object> request) {
        System.out.println("hystrix is come!");
        return new ArrayList<HelloBean>();
    }

    public void saveAndUpdate(HelloBean helloBean) {

    }

    public Boolean update(Map<String, Object> request) {
        return null;
    }

    public Boolean delete(Map<String, Object> request) {
        return null;
    }
}
