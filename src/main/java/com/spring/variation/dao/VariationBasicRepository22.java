package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr22;

public interface VariationBasicRepository22 extends JpaRepository<VariationBasicChr22, Long> ,  JpaSpecificationExecutor<VariationBasicChr22>{

}