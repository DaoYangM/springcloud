package top.daoyang.servicefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.daoyang.servicefeign.service.ServiceHiService;

@RestController
public class HiController {

    @Autowired
    private ServiceHiService serviceHiService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return serviceHiService.sayHiFromServiceHi(name);
    }
}
