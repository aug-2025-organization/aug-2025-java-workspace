package com.spring_rest_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_rest_jpa.dao.entity.AuthorEntity;
import com.spring_rest_jpa.service.AuthorService;

@RestController
@RequestMapping("/api")
public class AuthorController {
	
	@Autowired
	AuthorService authorService;
	
	@GetMapping("/authors")
	public ResponseEntity<List<AuthorEntity>> getAllAuthors(){
		return new ResponseEntity<List<AuthorEntity>>(authorService.getAllAuthors(), HttpStatus.OK);
	}
	
}
