package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChr9;

public interface VariationBasicRepository9 extends JpaRepository<VariationBasicChr9, Long> ,  JpaSpecificationExecutor<VariationBasicChr9>{

}