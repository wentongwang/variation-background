package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.Variation;

public interface VariationRepository extends JpaRepository<Variation, Long> ,  JpaSpecificationExecutor<Variation>{

}