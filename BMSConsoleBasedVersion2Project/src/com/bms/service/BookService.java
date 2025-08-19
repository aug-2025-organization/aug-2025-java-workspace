package com.bms.service;

import java.util.Set;

import com.bms.dao.BookDao;
import com.bms.dao.BookDaoCollectionImpl;
import com.bms.pojos.BookPojo;

public class BookService{

	private BookDao bookDao;
	
	public BookService() {
		bookDao = new BookDaoCollectionImpl();
	}

	public Set<BookPojo> getAllBooks() {
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
