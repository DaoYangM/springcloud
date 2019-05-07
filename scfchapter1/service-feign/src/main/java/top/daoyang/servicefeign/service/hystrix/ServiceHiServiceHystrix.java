package top.daoyang.servicefeign.service.hystrix;

import org.springframework.stereotype.Component;
import top.daoyang.servicefeign.service.ServiceHiService;

@Component
public class ServiceHiServiceHystrix implements ServiceHiService {
    @Override
    public String sayHiFromServiceHi(String name) {
        return "sorry " + name;
    }
}
