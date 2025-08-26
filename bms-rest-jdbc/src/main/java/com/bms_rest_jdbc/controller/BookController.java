package com.bms_rest_jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms_rest_jdbc.pojo.BookPojo;
import com.bms_rest_jdbc.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public List<BookPojo> getAllBooks(){
		return bookService.getAllBooks();
	}
}
