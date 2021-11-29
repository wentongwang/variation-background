package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr8;

public interface VariationBasicRepository8 extends JpaRepository<VariationBasicChr8, Long> ,  JpaSpecificationExecutor<VariationBasicChr8>{

}