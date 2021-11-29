package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr11;

public interface VariationBasicRepository11 extends JpaRepository<VariationBasicChr11, Long> ,  JpaSpecificationExecutor<VariationBasicChr11>{

}