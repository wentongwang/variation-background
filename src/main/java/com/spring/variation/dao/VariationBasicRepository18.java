package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr18;

public interface VariationBasicRepository18 extends JpaRepository<VariationBasicChr18, Long> ,  JpaSpecificationExecutor<VariationBasicChr18>{

}