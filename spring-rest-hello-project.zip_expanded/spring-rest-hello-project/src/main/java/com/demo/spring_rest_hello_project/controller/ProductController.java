package com.demo.spring_rest_hello_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_rest_hello_project.pojo.ProductPojo;

@RestController
@RequestMapping("/api")
public class ProductController {

	@GetMapping("/products")
	public ProductPojo getProduct() {
		ProductPojo product = new ProductPojo(201, "Laptop", 50000.0);
		return product;
	}
}
