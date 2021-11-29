package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr6;

public interface VariationBasicRepository6 extends JpaRepository<VariationBasicChr6, Long> ,  JpaSpecificationExecutor<VariationBasicChr6>{

}