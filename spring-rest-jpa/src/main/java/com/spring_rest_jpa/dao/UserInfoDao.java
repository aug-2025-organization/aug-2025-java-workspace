package com.spring_rest_jpa.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_rest_jpa.dao.entity.UserInfoEntity;

@Repository
public interface UserInfoDao extends JpaRepository<UserInfoEntity, Integer> {
	Optional<UserInfoEntity> findByName(String name);
}
