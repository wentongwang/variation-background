package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr17;

public interface VariationDetailRepository17 extends JpaRepository<VariationDetailChr17, Long> ,  JpaSpecificationExecutor<VariationDetailChr17>{

}