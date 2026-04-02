package com.tms;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("romaBean") //создай объект класса и помести в контейнер
public class User {
    public int id;
    public String name;

    public User() {

    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Bean("abrahamBean") //Кладет объект который возвращает метод в Контейнер
    public User createAbraham(){
        return new User(3, "Abraham");
    }
}
