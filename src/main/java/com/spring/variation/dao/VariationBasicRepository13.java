package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr13;

public interface VariationBasicRepository13 extends JpaRepository<VariationBasicChr13, Long> ,  JpaSpecificationExecutor<VariationBasicChr13>{

}