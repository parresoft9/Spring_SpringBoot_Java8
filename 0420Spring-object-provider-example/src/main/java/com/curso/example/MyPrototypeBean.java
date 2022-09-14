package com.curso.example;

import java.time.LocalDateTime;

public class MyPrototypeBean {
    private String dateTimeString = LocalDateTime.now().toString();
    private String name;

    public MyPrototypeBean(String name) {
        this.name = name;
    }

    public String getDateTime() {
        return dateTimeString;
    }

    public String getName() {
        return name;
    }
}