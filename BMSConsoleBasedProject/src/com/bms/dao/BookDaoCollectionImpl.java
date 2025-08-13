package com.bms.dao;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.bms.pojos.BookPojo;

public class BookDaoCollectionImpl implements BookDao {

	private Set<BookPojo> bookDataStore;
	
	public BookDaoCollectionImpl() {
		bookDataStore = new HashSet<>();
		bookDataStore.add(new BookPojo(101, "Harry Potter and the Prizoner of Azkaban", "J.K. Rowling", LocalDate.of(2010, 10, 05), "Fiction", 200.0, ""));
		bookDataStore.add(new BookPojo(102, "Harry Potter and the Chamber of Secrets", "J.K. Rowling", LocalDate.of(2015, 05, 15), "Fiction", 300.0, ""));
		bookDataStore.add(new BookPojo(103, "Harry Potter and the Order of Phoenix", "J.K. Rowling", LocalDate.of(2020, 9, 10), "Fiction", 100.0, ""));
	}

	@Override
	public Set<BookPojo> getAllBooks() {
		return bookDataStore;
	}

	@Override
	public BookPojo getABook(int bookId) {
		BookPojo fetchedBook = null;
		for(BookPojo eachBook: bookDataStore) {
			if(eachBook.getBookId() == bookId) {
				fetchedBook = eachBook;
				break;
			}
		}
		return fetchedBook;
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		BookPojo maxBook = Collections.max(bookDataStore, (obj1, obj2) -> obj1.getBookId() - obj2.getBookId());
		newBook.setBookId(maxBook.getBookId() + 1);
		bookDataStore.add(newBook);
		return newBook;
	}

	@Override
	public BookPojo updateBook(BookPojo editBook) {
		bookDataStore.remove(editBook);
		bookDataStore.add(editBook);
		return editBook;
	}

	@Override
	public void deleteBook(int bookId) {
		bookDataStore.removeIf((eachBook) -> eachBook.getBookId() == bookId);
	}
}
