package top.daoyang.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.daoyang.servicefeign.service.hystrix.ServiceHiServiceHystrix;

@FeignClient(value = "service-hi", fallback = ServiceHiServiceHystrix.class)
public interface ServiceHiService {

    @GetMapping(value = "/hi")
    String sayHiFromServiceHi(@RequestParam(value = "name") String name);
}
