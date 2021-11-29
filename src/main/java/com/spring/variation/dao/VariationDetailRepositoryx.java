package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailChrx;

public interface VariationDetailRepositoryx extends JpaRepository<VariationDetailChrx, Long> ,  JpaSpecificationExecutor<VariationDetailChrx>{

}