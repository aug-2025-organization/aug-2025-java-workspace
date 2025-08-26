package com.demo.spring_rest_hello_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

	// here create the rest methods
	@GetMapping("/hellorest")
	public String greetRest() {
		return "Greet Rest";
	}
}
