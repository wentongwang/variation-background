package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr6;

public interface VariationDetailRepository6 extends JpaRepository<VariationDetailChr6, Long> ,  JpaSpecificationExecutor<VariationDetailChr6>{

}