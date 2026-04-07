package com.tms;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component(value = "beanUser")
public class User {
    private int id;
    private String name;

    public String printMyName(){
        System.out.println(name);
        //System.out.println(10/0); // выпадет ArithmeticException
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct //init метода
    public void init() {
        System.out.println("Создается User Bean!");
    }

    @PreDestroy //*
    public void destroy() {
        System.out.println("Сносит User Bean!");
    }
}
