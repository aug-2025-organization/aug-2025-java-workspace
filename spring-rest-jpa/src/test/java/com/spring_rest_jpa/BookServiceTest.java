package com.spring_rest_jpa;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring_rest_jpa.exception.BookNotFoundException;
import com.spring_rest_jpa.service.BookService;

@SpringBootTest
public class BookServiceTest {
	@Autowired
	BookService bookService;
	
	// here we write the test methods
	@Test
	public void testGetABookValidID() {
		// expected ouput
	
		// actual output
		boolean actualOutput = bookService.getABook(1).isPresent();
		assertTrue(actualOutput);
	}
	@Test
	public void testGetABookInvalidID() {
		// expected ouput
	
		// actual output
		
		assertThrows(BookNotFoundException.class, () -> bookService.getABook(12333));
	}
}
