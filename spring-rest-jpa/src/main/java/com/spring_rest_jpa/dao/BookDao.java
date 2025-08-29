package com.spring_rest_jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_rest_jpa.dao.entity.BookEntity;

@Repository
public interface BookDao extends JpaRepository<BookEntity, Integer> {
	List<BookEntity> findByBookCategory(String category);
}
