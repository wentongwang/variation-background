package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr5;

public interface VariationDetailRepository5 extends JpaRepository<VariationDetailChr5, Long> ,  JpaSpecificationExecutor<VariationDetailChr5>{

}