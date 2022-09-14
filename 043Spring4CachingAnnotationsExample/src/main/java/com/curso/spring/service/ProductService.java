package com.curso.spring.service;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import com.curso.spring.model.Product;

public interface ProductService {

	Product getByName(String name);
	void refreshAllProducts();
	Product updateProduct(Product product);
}
