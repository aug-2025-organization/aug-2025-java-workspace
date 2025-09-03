package com.spring_rest_jpa.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_rest_jpa.dao.UserInfoDao;
import com.spring_rest_jpa.dao.entity.UserInfoEntity;
import com.spring_rest_jpa.service.JwtService;

@RestController
@RequestMapping("/api")
public class UserInfoController {
	@Autowired
	UserInfoDao userInfoDao;
	
	@Autowired
	JwtService jwtService;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@PostMapping("/validate")
	public ResponseEntity<Map<String, Object>> validate(@RequestBody UserInfoEntity userInfo){
		System.out.println("in validate endpoint ....");
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userInfo.getName(), userInfo.getPassword()));
		if (authentication.isAuthenticated()) {
			UserInfoEntity userEntity = userInfoDao.findByName(userInfo.getName()).get();
			Map<String, Object> responseData = new HashMap<>();
			responseData.put("user", userEntity);
			responseData.put("token", jwtService.generateToken(userInfo.getName()));
			return new ResponseEntity(responseData, HttpStatus.OK);
		} else {
			throw new UsernameNotFoundException("invalid user request !");
		}
	}
}
