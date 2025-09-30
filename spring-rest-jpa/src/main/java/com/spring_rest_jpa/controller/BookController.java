package com.spring_rest_jpa.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_rest_jpa.dao.entity.BookEntity;
import com.spring_rest_jpa.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class BookController {
	
	public static final Logger LOG = LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	BookService bookService;
	
	//@PreAuthorize("hasAuthority('USER')")
	@GetMapping("/books")
	public ResponseEntity<List<BookEntity>> getAllBooks(){
		LOG.info("Entered getAllBooks() in controller...");
		return new ResponseEntity<List<BookEntity>>(bookService.getAllBooks(), HttpStatus.OK);
	}
	
	//@PreAuthorize("hasAuthority('USER')")
	@GetMapping("/books/{bid}")
	public ResponseEntity<Optional<BookEntity>> getABook(@PathVariable("bid") int bookId) {
		LOG.info("Entered getABook() in controller...");
		return new ResponseEntity<Optional<BookEntity>>(bookService.getABook(bookId), HttpStatus.OK);
	}
	
	//@PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping("/books/{bookId}")
	public ResponseEntity<Void> deleteBook(@PathVariable int bookId) {
		bookService.deleteBook(bookId);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	//@PreAuthorize("hasAuthority('ADMIN')")
	@PutMapping("/books")
	public ResponseEntity<BookEntity> updateBook(@RequestBody @Valid BookEntity editBook) {
		return new ResponseEntity<BookEntity>(bookService.updateBook(editBook), HttpStatus.OK);
	}
	
	//@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping("/books")
	public ResponseEntity<BookEntity> addBook(@RequestBody @Valid BookEntity newBook) {
		return new ResponseEntity<BookEntity>(bookService.addBook(newBook), HttpStatus.OK);
	}
	
	//@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping("/books/category/{bookCategory}")
	public ResponseEntity<List<BookEntity>> getAllBooksByCategory(@PathVariable String bookCategory){
		return new ResponseEntity<List<BookEntity>>(bookService.getAllBooksByCategory(bookCategory), HttpStatus.OK);
	}
}
