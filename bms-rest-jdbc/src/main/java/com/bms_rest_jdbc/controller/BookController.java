package com.bms_rest_jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms_rest_jdbc.pojo.Book2Pojo;
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
	
	// http://localhost:3131/api/books/102
	@GetMapping("/books/{bid}")
	public BookPojo getABook(@PathVariable("bid") int bookId) {
		return bookService.getABook(bookId);
	}
	
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable int bookId) {
		bookService.deleteBook(bookId);
	}
	
	@PutMapping("/books")
	public BookPojo updateBook(@RequestBody BookPojo editBook) {
		return bookService.updateBook(editBook);
	}
	
	@PostMapping("/books")
	public BookPojo addBook(@RequestBody BookPojo newBook) {
		return bookService.addBook(newBook);
	}
	
	@GetMapping("/books/author/{bid}")
	public Book2Pojo getABookAuthor(@PathVariable("bid") int bookId) {
		return bookService.getABookAuthor(bookId);
	}
}
