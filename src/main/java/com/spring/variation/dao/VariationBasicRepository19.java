package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr19;

public interface VariationBasicRepository19 extends JpaRepository<VariationBasicChr19, Long> ,  JpaSpecificationExecutor<VariationBasicChr19>{

}