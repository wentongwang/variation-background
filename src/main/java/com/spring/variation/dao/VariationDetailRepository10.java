package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr10;

public interface VariationDetailRepository10 extends JpaRepository<VariationDetailChr10, Long> ,  JpaSpecificationExecutor<VariationDetailChr10>{

}