package com.curso.spring.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.curso.spring.model.Product;
import com.curso.spring.service.ProductService;

public class SampleApplication {

	private static final Logger logger = LoggerFactory.getLogger(SampleApplication.class);
	
	public static void main(String[] args){
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService service = (ProductService) context.getBean("productService");
		
		logger.info("IPhone ->" + service.getByName("IPhone"));
		//a partir de aqui lo estará leyendo de la cache
		logger.info("IPhone ->" + service.getByName("IPhone"));
		logger.info("IPhone ->" + service.getByName("IPhone"));

		
		logger.info("HTC ->" + service.getByName("HTC"));
		// nunca obtendrá los datos de la caché porque NUNCA va a ser cacheado  condition="#name!='HTC'"
		logger.info("HTC ->" + service.getByName("HTC"));
		logger.info("HTC ->" + service.getByName("HTC"));

		
		Product product = new Product("IPhone",1300);
		//actualiza la cache
		service.updateProduct(product);
		
		logger.info("IPhone ->" + service.getByName("IPhone"));
		logger.info("IPhone ->" + service.getByName("IPhone"));
		logger.info("IPhone ->" + service.getByName("IPhone"));
		
		
		logger.info("Refreshing all products");

		service.refreshAllProducts();
		logger.info("IPhone [after refresh]->" + service.getByName("IPhone"));
		logger.info("IPhone [after refresh]->" + service.getByName("IPhone"));
		logger.info("IPhone [after refresh]->" + service.getByName("IPhone"));

		((AbstractApplicationContext) context).close();
		
	}
}
