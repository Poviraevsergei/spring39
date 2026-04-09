package com.tms;

import com.tms.aspects.LogAop;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component(value = "beanUser")
public class User {
    private int id;
    private String name;
    private int age;

    public void printMyName(){
        System.out.println(name);
        printMyId();
    }

    public void printMyId(){
        System.out.println(id);
        printMyAge();
    }

    public void printMyAge(){
        System.out.println(age);
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
