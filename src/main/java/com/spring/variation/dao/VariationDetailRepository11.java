package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr11;

public interface VariationDetailRepository11 extends JpaRepository<VariationDetailChr11, Long> ,  JpaSpecificationExecutor<VariationDetailChr11>{

}