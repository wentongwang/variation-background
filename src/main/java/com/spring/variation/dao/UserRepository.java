package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.spring.variation.domain.User;
import com.sun.istack.NotNull;

public interface UserRepository extends JpaRepository<User, Long> ,  JpaSpecificationExecutor<User>{

	User findById(Integer userId);

	@Transactional
	@Modifying
	@Query(value = "delete from user where id = :id", nativeQuery = true)
	void deleteById(@NotNull Integer id);

}