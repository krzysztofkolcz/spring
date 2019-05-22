package com.websystique.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.config.AppConfig;
import com.websystique.spring.domain.Application;

public class AppMain {

    public static void main(String args[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //Byname Autowiring
        Application application = (Application)context.getBean("application");
        System.out.println("Application Details : "+application);
    }

}

