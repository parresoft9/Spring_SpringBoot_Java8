package com.curso.example;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;

public class MySingletonBean {

    @Autowired
    private ObjectProvider<MyPrototypeBean> myPrototypeBeanProvider;
    
    @Autowired
    private ObjectProvider<MyFerBean> myFerBean;

    public void showMessage() {
        MyPrototypeBean bean = myPrototypeBeanProvider.getIfAvailable(
                () -> new MyPrototypeBean("Default Bean"));
        System.out.printf("Time: %s from bean: %s - instance: %s%n", bean.getDateTime(), bean.getName(),
                System.identityHashCode(bean));
                
        MyFerBean beanUnico = myFerBean.getIfUnique(() -> new MyFerBean("Fer Default Bean"));
        System.out.println(beanUnico.getName());
        
        MyFerBean beanUnico2 = myFerBean.getIfAvailable(() -> new MyFerBean("Fer 2 Default Bean"));
        System.out.println(beanUnico2.getName());

    }
}