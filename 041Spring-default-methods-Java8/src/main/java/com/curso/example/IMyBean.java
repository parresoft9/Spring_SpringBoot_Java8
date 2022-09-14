package com.curso.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public interface IMyBean {
	@PostConstruct
	default void init() {
		System.out.println("post construct: " + this.getClass().getSimpleName());
	}
	
	@PreDestroy
	default void destroy() {
		System.out.println("pre destroy: " + this.getClass().getSimpleName());
	}
}