package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr2;

public interface VariationBasicRepository2 extends JpaRepository<VariationBasicChr2, Long> ,  JpaSpecificationExecutor<VariationBasicChr2>{

}