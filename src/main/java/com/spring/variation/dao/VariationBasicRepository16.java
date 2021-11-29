package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr16;

public interface VariationBasicRepository16 extends JpaRepository<VariationBasicChr16, Long> ,  JpaSpecificationExecutor<VariationBasicChr16>{

}