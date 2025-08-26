package com.bms_rest_jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import com.bms_rest_jdbc.pojo.Author2Pojo;
import com.bms_rest_jdbc.pojo.Book2Pojo;

public class BookMapper implements RowMapper<Book2Pojo>{

	@Override
	public Book2Pojo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Author2Pojo author = new Author2Pojo(rs.getInt("author_id"), rs.getString("author_firstname"), rs.getString("author_lastname"));
		Book2Pojo book = new Book2Pojo(rs.getInt("book_id"), rs.getString("book_title"), author, rs.getDate("book_published").toLocalDate(), rs.getString("book_category"), rs.getDouble("book_price"), rs.getString("book_image_url"));
		return book;
	}

}
