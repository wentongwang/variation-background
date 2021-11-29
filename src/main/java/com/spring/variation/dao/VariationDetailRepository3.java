package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr3;

public interface VariationDetailRepository3 extends JpaRepository<VariationDetailChr3, Long> ,  JpaSpecificationExecutor<VariationDetailChr3>{

}