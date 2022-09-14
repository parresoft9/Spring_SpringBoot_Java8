package com.curso.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig implements IMyConfig {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        MyBean bean = context.getBean(MyBean.class);
        bean.showMessage("a test message");
        
        IFerBean beanFer = context.getBean(FerBean.class);
        beanFer.showFer("Hola caracola");
    }
}