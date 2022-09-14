package com.curso.example;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public MyPrototypeBean prototypeBean() {
		return new MyPrototypeBean("Registered Bean");
	}

//	@Bean(name = "uno")
	public MyFerBean uno() {
		return new MyFerBean("fer");
	}

//	@Bean(name = "dos")
	public MyFerBean dos() {
		return new MyFerBean("rachel");
	}

	@Bean
	public MySingletonBean singletonBean() {
		return new MySingletonBean();
	}

	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MySingletonBean bean = context.getBean(MySingletonBean.class);
		bean.showMessage();
		

		MyPrototypeBean beanp = context.getBean(MyPrototypeBean.class);
		System.out.println(beanp.getDateTime());
		Thread.sleep(1000);

		MyPrototypeBean beanp2 = context.getBean(MyPrototypeBean.class);
		System.out.println(beanp2.getDateTime());

		/*
		 * bean = context.getBean(MySingletonBean.class); bean.showMessage();
		 */
	}
}