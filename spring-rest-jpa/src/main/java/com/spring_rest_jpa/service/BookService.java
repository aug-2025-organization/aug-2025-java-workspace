package com.spring_rest_jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_rest_jpa.dao.BookDao;
import com.spring_rest_jpa.dao.entity.BookEntity;

@Service
public class BookService{

	@Autowired
	BookDao bookDao;
	
	public List<BookEntity> getAllBooks() {
		return bookDao.findAll();
	}

	public Optional<BookEntity> getABook(int bookId) {
		return bookDao.findById(bookId);
	}

	public BookEntity addBook(BookEntity newBook) {
		return bookDao.saveAndFlush(newBook);
	}

	public BookEntity updateBook(BookEntity editBook) {
		return bookDao.save(editBook);
	}

	public void deleteBook(int bookId) {
		bookDao.deleteById(bookId);
	}
}
