package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr15;

public interface VariationBasicRepository15 extends JpaRepository<VariationBasicChr15, Long> ,  JpaSpecificationExecutor<VariationBasicChr15>{

}