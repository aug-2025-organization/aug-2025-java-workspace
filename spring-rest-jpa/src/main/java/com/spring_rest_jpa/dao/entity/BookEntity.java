package com.spring_rest_jpa.dao.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="book_details")
public class BookEntity {
	@Id
	@Column(name="book_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	
	@Column(name="book_title")
	private String bookTitle;
	
//	@Column(name="book_author_id")
//	private int bookAuthorId;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="book_author_id")
	private AuthorEntity author;
	
	@Column(name="book_published")
	private LocalDate bookPublished;
	
	@Column(name="book_category")
	private String bookCategory;
	
	@Column(name="book_price")
	private double bookPrice;
	
	@Column(name="book_image_url")
	private String bookImageUrl;
	
}
