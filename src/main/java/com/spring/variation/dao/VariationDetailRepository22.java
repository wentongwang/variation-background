package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr22;

public interface VariationDetailRepository22 extends JpaRepository<VariationDetailChr22, Long> ,  JpaSpecificationExecutor<VariationDetailChr22>{

}