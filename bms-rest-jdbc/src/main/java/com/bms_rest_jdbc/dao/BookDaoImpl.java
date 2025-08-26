package com.bms_rest_jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bms_rest_jdbc.pojo.BookPojo;

//@Component
@Repository
public class BookDaoImpl implements BookDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<BookPojo> getAllBooks() {
		return jdbcTemplate.query(DBQueries.BOOK_FETCH_ALL, new BeanPropertyRowMapper<BookPojo>(BookPojo.class));
	}

	@Override
	public BookPojo getABook(int bookId) {
		return jdbcTemplate.queryForObject(DBQueries.BOOK_FETCH_A, new BeanPropertyRowMapper<BookPojo>(BookPojo.class), bookId);
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		jdbcTemplate.update(DBQueries.BOOK_ADD, newBook.getBookTitle(), newBook.getBookAuthorId(), newBook.getBookPublished(), newBook.getBookCategory(), newBook.getBookPrice(), newBook.getBookImageUrl());
		return newBook;
	}

	@Override
	public BookPojo updateBook(BookPojo editBook) {
		jdbcTemplate.update(DBQueries.BOOK_UPDATE, editBook.getBookPrice(), editBook.getBookId());
		return editBook;
	}

	@Override
	public void deleteBook(int bookId) {
		jdbcTemplate.update(DBQueries.BOOK_DELETE, bookId);
	}

}
