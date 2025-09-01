package com.spring_rest_jpa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring_rest_jpa.service.AuthorService;

@SpringBootTest
public class AuthorServiceTest {
	
	@Autowired
	AuthorService authorService;
	
	// here we write the test methods
	@Test
	public void testGetAllAuthors() {
		// expected ouput
		int expectedOutput = 3;
		
		// actual output
		int actualOuput = authorService.getAllAuthors().size();
		
		assertEquals(expectedOutput, actualOuput);
	}
}
