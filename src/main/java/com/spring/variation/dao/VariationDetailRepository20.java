package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr20;

public interface VariationDetailRepository20 extends JpaRepository<VariationDetailChr20, Long> ,  JpaSpecificationExecutor<VariationDetailChr20>{

}