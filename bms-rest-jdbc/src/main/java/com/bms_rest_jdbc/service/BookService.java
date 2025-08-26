package com.bms_rest_jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bms_rest_jdbc.dao.BookDao;
import com.bms_rest_jdbc.pojo.BookPojo;

public class BookService{

	@Autowired
	BookDao bookDao;
	
	public List<BookPojo> getAllBooks() {
		return bookDao.getAllBooks();
	}

	public BookPojo getABook(int bookId) {
		return bookDao.getABook(bookId);
	}

	public BookPojo addBook(BookPojo newBook) {
		return bookDao.addBook(newBook);
	}

	public BookPojo updateBook(BookPojo editBook) {
		return bookDao.updateBook(editBook);
	}

	public void deleteBook(int bookId) {
		bookDao.deleteBook(bookId);
	}
}
