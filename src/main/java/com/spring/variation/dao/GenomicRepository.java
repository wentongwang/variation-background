package com.spring.variation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.spring.variation.domain.Genomic;

public interface GenomicRepository extends JpaRepository<Genomic, Long> ,  JpaSpecificationExecutor<Genomic>{

}