package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr21;

public interface VariationDetailRepository21 extends JpaRepository<VariationDetailChr21, Long> ,  JpaSpecificationExecutor<VariationDetailChr21>{

}