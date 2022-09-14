package com.curso.example;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GetIfAvailableWithSupplier {
    //uncomment @Bean then getIfAvailable will return this instance
//    @Bean
    MsgBean msgBean() {
        return new MsgBean("test msg 1");
    }
    
	/*
	 * @Bean MsgBean msgBean2() { return new MsgBean("test msg 2"); } // EXPLOTA CON AMBOS
	 */

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(GetIfAvailableWithSupplier.class);
        ObjectProvider<MsgBean> beanProvider = context.getBeanProvider(MsgBean.class);
        MsgBean exampleBean = beanProvider.getIfAvailable(() -> new MsgBean("default msg"));
        exampleBean.showMessage();
    }
}