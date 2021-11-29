package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr19;

public interface VariationDetailRepository19 extends JpaRepository<VariationDetailChr19, Long> ,  JpaSpecificationExecutor<VariationDetailChr19>{

}