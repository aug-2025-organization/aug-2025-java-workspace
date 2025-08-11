package com.bms.pojos;

import java.time.LocalDate;

public class BookPojo {
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private LocalDate bookPublished;
	private String bookCategory;
	private double bookPrice;
	private String bookImageUrl;
	
	public BookPojo(int bookId, String bookTitle, String bookAuthor, LocalDate bookPublished, String bookCategory,
			double bookPrice, String bookImageUrl) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPublished = bookPublished;
		this.bookCategory = bookCategory;
		this.bookPrice = bookPrice;
		this.bookImageUrl = bookImageUrl;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public LocalDate getBookPublished() {
		return bookPublished;
	}

	public void setBookPublished(LocalDate bookPublished) {
		this.bookPublished = bookPublished;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookImageUrl() {
		return bookImageUrl;
	}

	public void setBookImageUrl(String bookImageUrl) {
		this.bookImageUrl = bookImageUrl;
	}

	@Override
	public String toString() {
		return "BookPojo [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor
				+ ", bookPublished=" + bookPublished + ", bookCategory=" + bookCategory + ", bookPrice=" + bookPrice
				+ ", bookImageUrl=" + bookImageUrl + "]";
	}
}
