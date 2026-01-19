package com.example.demo.service;

import com.example.demo.ejb.HelloEJB;
import org.springframework.stereotype.Service;

import javax.naming.InitialContext;

@Service
public class EjbClientService {
    public String callEjb(String name) throws Exception {
        InitialContext ctx = new InitialContext();
        HelloEJB ejb = (HelloEJB) ctx.lookup("java:global/HelloEJB");
        return ejb.sayHello(name);
    }
}