package com.spring.variation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.VariationDetailsv;

public interface VariationDetailRepositorysv extends JpaRepository<VariationDetailsv, Long> ,  JpaSpecificationExecutor<VariationDetailsv>{

}