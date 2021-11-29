package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr4;

public interface VariationDetailRepository4 extends JpaRepository<VariationDetailChr4, Long> ,  JpaSpecificationExecutor<VariationDetailChr4>{

}