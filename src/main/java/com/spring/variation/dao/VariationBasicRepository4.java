package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr4;

public interface VariationBasicRepository4 extends JpaRepository<VariationBasicChr4, Long> ,  JpaSpecificationExecutor<VariationBasicChr4>{

}