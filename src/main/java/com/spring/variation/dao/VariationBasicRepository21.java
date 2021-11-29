package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr21;

public interface VariationBasicRepository21 extends JpaRepository<VariationBasicChr21, Long> ,  JpaSpecificationExecutor<VariationBasicChr21>{

}