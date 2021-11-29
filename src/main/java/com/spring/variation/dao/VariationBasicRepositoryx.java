package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationBasicChrx;

public interface VariationBasicRepositoryx extends JpaRepository<VariationBasicChrx, Long> ,  JpaSpecificationExecutor<VariationBasicChrx>{

}