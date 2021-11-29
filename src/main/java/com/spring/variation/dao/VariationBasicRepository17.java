package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr17;

public interface VariationBasicRepository17 extends JpaRepository<VariationBasicChr17, Long> ,  JpaSpecificationExecutor<VariationBasicChr17>{

}