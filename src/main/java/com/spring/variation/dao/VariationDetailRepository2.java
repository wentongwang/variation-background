package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr2;

public interface VariationDetailRepository2 extends JpaRepository<VariationDetailChr2, Long> ,  JpaSpecificationExecutor<VariationDetailChr2>{

}