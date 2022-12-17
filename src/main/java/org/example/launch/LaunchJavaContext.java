package org.example.launch;

import org.example.configuration.SpringContext;
import org.example.service.BusinessService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaunchJavaContext {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringContext.class);
        BusinessService businessService = applicationContext.getBean(BusinessService.class);
        businessService.getData().forEach(System.out::println);
    }

}
