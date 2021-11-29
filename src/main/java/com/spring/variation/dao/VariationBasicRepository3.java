package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr3;

public interface VariationBasicRepository3 extends JpaRepository<VariationBasicChr3, Long> ,  JpaSpecificationExecutor<VariationBasicChr3>{

}