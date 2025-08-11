package com.bms.dao;

import java.util.Set;

import com.bms.pojos.BookPojo;

public interface BookDao {
	Set<BookPojo> getAllBooks();
	BookPojo getABook(int bookId);
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo editBook);
	void deleteBook(int bookId);
}
