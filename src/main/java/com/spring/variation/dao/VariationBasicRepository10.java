package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr10;

public interface VariationBasicRepository10 extends JpaRepository<VariationBasicChr10, Long> ,  JpaSpecificationExecutor<VariationBasicChr10>{

}