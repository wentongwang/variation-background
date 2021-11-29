package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr16;

public interface VariationDetailRepository16 extends JpaRepository<VariationDetailChr16, Long> ,  JpaSpecificationExecutor<VariationDetailChr16>{

}