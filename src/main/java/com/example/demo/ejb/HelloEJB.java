package com.example.demo.ejb;

import javax.ejb.Remote;

@Remote
public interface HelloEJB {
    String sayHello(String name);
}