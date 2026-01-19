package com.example.demo.controller;

import com.example.demo.service.EjbClientService;
import com.example.demo.service.LegacyPathService;
import com.example.demo.jaxb.Person;
import com.example.demo.jaxb.JaxbUtil;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    private final EjbClientService ejbService;
    private final LegacyPathService pathService;

    public HelloController(EjbClientService ejbService, LegacyPathService pathService) {
        this.ejbService = ejbService;
        this.pathService = pathService;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) throws Exception {
        return ejbService.callEjb(name);
    }

    @GetMapping("/paths")
    public String paths() {
        return pathService.getLegacyPaths();
    }

    @GetMapping("/person")
    public String person() throws Exception {
        Person p = new Person();
        p.setName("Legacy RHEL6 User");
        p.setAge(50);
        return JaxbUtil.toXml(p);
    }
}