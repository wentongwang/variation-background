package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr1;

public interface VariationBasicRepository1 extends JpaRepository<VariationBasicChr1, Long> ,  JpaSpecificationExecutor<VariationBasicChr1>{

}