package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr7;

public interface VariationDetailRepository7 extends JpaRepository<VariationDetailChr7, Long> ,  JpaSpecificationExecutor<VariationDetailChr7>{

}