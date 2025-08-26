package com.bms_rest_jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms_rest_jdbc.dao.BookDao;
import com.bms_rest_jdbc.dao.BookMapper;
import com.bms_rest_jdbc.dao.DBQueries;
import com.bms_rest_jdbc.pojo.Book2Pojo;
import com.bms_rest_jdbc.pojo.BookPojo;

//@Component
@Service
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
	
	public Book2Pojo getABookAuthor(int bookId) {
		return bookDao.getABookAuthor(bookId);
	}
}
