package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr7;

public interface VariationBasicRepository7 extends JpaRepository<VariationBasicChr7, Long> ,  JpaSpecificationExecutor<VariationBasicChr7>{

}