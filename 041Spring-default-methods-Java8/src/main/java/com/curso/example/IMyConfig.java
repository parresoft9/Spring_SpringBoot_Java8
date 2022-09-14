package com.curso.example;

import org.springframework.context.annotation.Bean;

public interface IMyConfig {
    @Bean
    default MyBean myBean() {
        return new MyBean();
    }
    
    @Bean
    default IFerBean myFer() {
        return new FerBean();
    }
}