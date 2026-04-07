package com.tms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy // включает AOP
@ComponentScan("com.tms") //явно просим спринг просканировать этот package и все вложенные
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        User user = applicationContext.getBean(User.class);
        user.setName("Dimas");
        user.printMyName();
    }
}






























