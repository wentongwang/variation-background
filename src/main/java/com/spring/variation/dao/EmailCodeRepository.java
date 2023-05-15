package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.EmailCode;

public interface EmailCodeRepository extends JpaRepository<EmailCode, Long>,  JpaSpecificationExecutor<EmailCode>{

}