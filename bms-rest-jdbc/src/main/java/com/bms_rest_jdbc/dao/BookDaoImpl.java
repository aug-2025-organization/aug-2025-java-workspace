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
		return null;
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		return null;
	}

	@Override
	public BookPojo updateBook(BookPojo editBook) {
		return null;
	}

	@Override
	public void deleteBook(int bookId) {
		
	}

}
