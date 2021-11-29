package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChr9;

public interface VariationDetailRepository9 extends JpaRepository<VariationDetailChr9, Long> ,  JpaSpecificationExecutor<VariationDetailChr9>{

}