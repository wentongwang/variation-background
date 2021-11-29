package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr13;

public interface VariationDetailRepository13 extends JpaRepository<VariationDetailChr13, Long> ,  JpaSpecificationExecutor<VariationDetailChr13>{

}