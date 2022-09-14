package com.curso.core.services;

import org.springframework.stereotype.Service;

import com.curso.core.repository.HelloRepository;

@Service
public class HelloServiceImpl implements HelloService {

    HelloRepository helloRepository;
    
    public HelloServiceImpl(HelloRepository helloRepository) {
		this.helloRepository = helloRepository;
	}

	@Override
    public String get() {
        return helloRepository.get();
    }

}
