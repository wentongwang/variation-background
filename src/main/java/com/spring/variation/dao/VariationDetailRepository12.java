package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr12;

public interface VariationDetailRepository12 extends JpaRepository<VariationDetailChr12, Long> ,  JpaSpecificationExecutor<VariationDetailChr12>{

}