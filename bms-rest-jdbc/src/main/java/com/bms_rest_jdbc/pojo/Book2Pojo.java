package com.bms_rest_jdbc.pojo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book2Pojo {
	private int bookId;
	private String bookTitle;
	private Author2Pojo author;
	private LocalDate bookPublished;
	private String bookCategory;
	private double bookPrice;
	private String bookImageUrl;
}
