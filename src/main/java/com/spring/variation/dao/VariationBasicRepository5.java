package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr5;

public interface VariationBasicRepository5 extends JpaRepository<VariationBasicChr5, Long> ,  JpaSpecificationExecutor<VariationBasicChr5>{

}