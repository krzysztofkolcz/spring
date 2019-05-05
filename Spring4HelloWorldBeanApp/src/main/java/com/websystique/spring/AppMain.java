package com.websystique.spring;
 
import com.websystique.spring.configuration.HelloWorldConfig;
import com.websystique.spring.domain.HelloWorld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("helloworld-config.xml");
//        AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);//TODO - skonfigurować bez NullPointer
        HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
        bean.setName("xXx");
        bean.printHello();
        context.close();
    }
}
