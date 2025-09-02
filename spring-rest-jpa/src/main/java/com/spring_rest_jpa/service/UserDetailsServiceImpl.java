package com.spring_rest_jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring_rest_jpa.dao.UserInfoDao;
import com.spring_rest_jpa.dao.entity.UserInfoEntity;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
	UserInfoDao userInfoDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		Optional<UserInfoEntity> userInfoEntity = userInfoDao.findByName(username);
		// but we have return UserDetails and not UserInfoEntity
		return userInfoEntity
		.map((userInfo)->new UserDetailsImpl(userInfo.getName(), userInfo.getPassword(), userInfo.getAllRoles()))
		.orElseThrow(()-> new UsernameNotFoundException(username + " not found"));
	}
}
