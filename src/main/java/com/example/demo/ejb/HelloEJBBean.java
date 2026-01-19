package com.example.demo.ejb;

import javax.ejb.Stateless;

@Stateless(mappedName = "HelloEJB")
public class HelloEJBBean implements HelloEJB {
    public String sayHello(String name) {
        return "Hello from legacy EJB, " + name;
    }
}