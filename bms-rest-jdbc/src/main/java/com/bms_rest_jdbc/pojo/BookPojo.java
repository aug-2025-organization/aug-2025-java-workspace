package com.bms_rest_jdbc.pojo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookPojo {
	private int bookId;
	private String bookTitle;
	private int bookAuthorId;
	private LocalDate bookPublished;
	private String bookCategory;
	private double bookPrice;
	private String bookImageUrl;
}
