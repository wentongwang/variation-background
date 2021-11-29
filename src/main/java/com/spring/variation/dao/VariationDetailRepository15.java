package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr15;

public interface VariationDetailRepository15 extends JpaRepository<VariationDetailChr15, Long> ,  JpaSpecificationExecutor<VariationDetailChr15>{

}