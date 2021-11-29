package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr12;

public interface VariationBasicRepository12 extends JpaRepository<VariationBasicChr12, Long> ,  JpaSpecificationExecutor<VariationBasicChr12>{

}