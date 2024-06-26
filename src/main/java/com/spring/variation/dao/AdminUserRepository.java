package com.spring.variation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.AdminUser;

public interface AdminUserRepository extends JpaRepository<AdminUser, Long> ,  JpaSpecificationExecutor<AdminUser>{

}