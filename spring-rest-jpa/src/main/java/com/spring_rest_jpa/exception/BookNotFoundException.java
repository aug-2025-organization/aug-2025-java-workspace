package com.spring_rest_jpa.exception;

public class BookNotFoundException extends RuntimeException{
	int bookId;
	
	public BookNotFoundException(int bookId) {
		this.bookId = bookId;
	}

	@Override
	public String getMessage() {
		return "Book with ID: " + bookId + " does ot exist!";
	}
}
