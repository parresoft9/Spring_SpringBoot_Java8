package com.spring.SpringInyectionPoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.SpringInyectionPoint.Greeting.Language;

@Service
public class GreeterService {
	//Esto falla porque le falta el @Greeting y el IP busca por salida de String
	//@Autowired
	//private String greeting4;

	@Autowired
	@Greeting(language=Language.ES)
	private String greeting;

	@Autowired
	@Greeting
	private String greeting2;
	
	@Autowired
	@Greeting(language=Language.DA)
	private String greeting3;

	public String sayHello(String caller) {
		return String.format("%s, %s", greeting, caller);
	}

	public String sayHello2(String caller) {
		return String.format("%s, %s", greeting2, caller);
	}
	
	public String sayHello3(String caller) {
		return String.format("%s, %s", greeting3, caller);
	}


}
