package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.RejectUser;

public interface RejectUserRepository extends JpaRepository<RejectUser, Long> ,  JpaSpecificationExecutor<RejectUser>{

}