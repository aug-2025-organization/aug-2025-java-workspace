package com.spring_rest_jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_rest_jpa.dao.AuthorDao;
import com.spring_rest_jpa.dao.entity.AuthorEntity;

@Service
public class AuthorService {
	
	@Autowired
	AuthorDao authorDao;

	public List<AuthorEntity> getAllAuthors(){
		return authorDao.findAll();
	}
}
