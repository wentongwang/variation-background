package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr8;

public interface VariationDetailRepository8 extends JpaRepository<VariationDetailChr8, Long> ,  JpaSpecificationExecutor<VariationDetailChr8>{

}