package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr20;

public interface VariationBasicRepository20 extends JpaRepository<VariationBasicChr20, Long> ,  JpaSpecificationExecutor<VariationBasicChr20>{

}