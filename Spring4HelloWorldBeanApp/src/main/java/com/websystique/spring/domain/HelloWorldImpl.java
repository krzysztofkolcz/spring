package com.websystique.spring.domain;

public class HelloWorldImpl implements HelloWorld{

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello ! " + name);
    }
}
