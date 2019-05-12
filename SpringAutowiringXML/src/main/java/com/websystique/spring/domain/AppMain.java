package com.websystique.spring.domain;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

    public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

        //autowire=byName
        Application application = (Application)context.getBean("application");
        System.out.println("Application Details : "+application);

        //autowire=byType
        Employee employee = (Employee)context.getBean("employee");
        System.out.println("Employee Details : "+employee);
    }
}
