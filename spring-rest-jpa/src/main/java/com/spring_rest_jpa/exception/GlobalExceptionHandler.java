package com.spring_rest_jpa.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.spring_rest_jpa.controller.BookController;

@ControllerAdvice
public class GlobalExceptionHandler {

	public static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	// write your exception handler methods here
	
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, Object>> handleMethodArgumentNotValid(MethodArgumentNotValidException me){
		LOG.error(me.getMessage());
		Map<String, Object> responseData = new HashMap<>();
		Map<String, String> allErrors = new HashMap<>();
		me
			.getBindingResult()
			.getFieldErrors()
			.stream()
			.forEach((eachError) -> allErrors.put(eachError.getField(), eachError.getDefaultMessage()));
		responseData.put("datetime", LocalDateTime.now());
		responseData.put("errors", allErrors);
		return new ResponseEntity<Map<String, Object>>(responseData, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = BookNotFoundException.class)
	public ResponseEntity<Map<String, Object>> handleBookNotFoundException(BookNotFoundException be){
		LOG.error(be.getMessage());
		Map<String, Object> responseData = new HashMap<>();
		responseData.put("datetime", LocalDateTime.now());
		responseData.put("errors", be.getMessage());
		return new ResponseEntity(responseData, HttpStatus.NOT_FOUND);
	}
}
