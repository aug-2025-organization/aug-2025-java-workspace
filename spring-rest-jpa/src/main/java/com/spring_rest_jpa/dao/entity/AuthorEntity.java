package com.spring_rest_jpa.dao.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="author_details")
public class AuthorEntity {
	@Id
	@Column(name="author_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int authorId;
	
	@Column(name="author_firstname")
	private String authorFirstname;
	
	@Column(name="author_lastname")
	private String authorLastname;
	
	@JsonBackReference
	@OneToMany(mappedBy = "author", cascade = CascadeType.REMOVE)
	List<BookEntity> allBooks;
}
