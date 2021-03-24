package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasic;

public interface VariationBasicRepository extends JpaRepository<VariationBasic, Long> ,  JpaSpecificationExecutor<VariationBasic>{

}