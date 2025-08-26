package com.bms_rest_jdbc.dao;

public class DBQueries {
	public static final String BOOK_FETCH_ALL = "select * from book_details";
	public static final String BOOK_FETCH_A = "select * from book_details where book_id = ?";
	public static final String BOOK_ADD = "insert into book_details(book_title, book_author_id, book_published, book_category, book_price, book_image_url) values (?, ?, ?, ?, ?, ?)";
	public static final String BOOK_UPDATE = "update book_details set book_price=? where book_id=?";
	public static final String BOOK_DELETE = "delete from book_details where book_id=?";
}
