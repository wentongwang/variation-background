package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr14;

public interface VariationDetailRepository14 extends JpaRepository<VariationDetailChr14, Long> ,  JpaSpecificationExecutor<VariationDetailChr14>{

}