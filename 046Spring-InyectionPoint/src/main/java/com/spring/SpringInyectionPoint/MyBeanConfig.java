package com.spring.SpringInyectionPoint;

import static org.springframework.core.annotation.AnnotationUtils.findAnnotation;

import org.springframework.beans.factory.InjectionPoint;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.SpringInyectionPoint.Greeting.Language;


// clase de procesado de la anotacion
@Configuration
public class MyBeanConfig {

  @Bean
  @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
  public String greeting(InjectionPoint ip) {

    Greeting greeting = findAnnotation(ip.getAnnotatedElement(), Greeting.class);
    String retorno = "";
    if(Language.ES == greeting.language()) {
    	retorno = "Hola caracola";
    }
    else if(Language.DA == greeting.language()) {
    	retorno = "Ángela Merkel";
    }
    else if (Language.EN == greeting.language()) {
    	retorno = "Hello World";
    }

    return retorno;
  }

}
