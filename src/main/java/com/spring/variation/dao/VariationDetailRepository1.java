package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr1;

public interface VariationDetailRepository1 extends JpaRepository<VariationDetailChr1, Long> ,  JpaSpecificationExecutor<VariationDetailChr1>{

}