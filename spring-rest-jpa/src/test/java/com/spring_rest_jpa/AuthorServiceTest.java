package com.spring_rest_jpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Assertions;
import static org.mockito.Mockito.verify;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring_rest_jpa.dao.AuthorDao;
import com.spring_rest_jpa.dao.entity.AuthorEntity;
import com.spring_rest_jpa.service.AuthorService;

@SpringBootTest
public class AuthorServiceTest {
	
//	@Autowired
//	AuthorService authorService;
	
	@Mock
	AuthorDao authorDao;
	
	@InjectMocks
	AuthorService authorService;
	
	// here we write the test methods
	@Test
	public void testGetAllAuthors() {
		// define your mockito rule
		Mockito
			.when(authorDao.findAll())
			.thenReturn(Arrays.asList(new AuthorEntity(1, "Test", "Test")));
		
		// expected ouput
		int expectedOutput = 1;
		
		// actual output
		int actualOuput = authorService.getAllAuthors().size();
		
		verify(authorDao).findAll();
		assertEquals(expectedOutput, actualOuput);
		
	}
}
