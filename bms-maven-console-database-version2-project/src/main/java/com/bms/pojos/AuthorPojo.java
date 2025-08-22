package com.bms.pojos;

public class AuthorPojo {
	private int author_id;
	private String author_firstname;
	private String author_lastname;
	
	public AuthorPojo(int author_id, String author_firstname, String author_lastname) {
		super();
		this.author_id = author_id;
		this.author_firstname = author_firstname;
		this.author_lastname = author_lastname;
	}
	
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public String getAuthor_firstname() {
		return author_firstname;
	}
	public void setAuthor_firstname(String author_firstname) {
		this.author_firstname = author_firstname;
	}
	public String getAuthor_lastname() {
		return author_lastname;
	}
	public void setAuthor_lastname(String author_lastname) {
		this.author_lastname = author_lastname;
	}

	@Override
	public String toString() {
		return "AuthorPojo [author_id=" + author_id + ", author_firstname=" + author_firstname + ", author_lastname="
				+ author_lastname + "]";
	}
}
