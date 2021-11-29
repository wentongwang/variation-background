package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr18;

public interface VariationDetailRepository18 extends JpaRepository<VariationDetailChr18, Long> ,  JpaSpecificationExecutor<VariationDetailChr18>{

}