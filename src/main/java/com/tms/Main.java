package com.tms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //1. Создаем IoC Container - ApplicationContext(Spring interface)
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.tms");

        //2. создать объект и положить в контейнер. По просьбе вернуть объект.
        //applicationContext.getBean(com.tms.User.class);
        User romaFromContainer = applicationContext.getBean("abrahamBean", User.class);

        System.out.println(romaFromContainer.id);
        System.out.println(romaFromContainer.name);
    }
}
