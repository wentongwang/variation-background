package com.spring.variation.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.spring.variation.domain.Genomic;
import com.spring.variation.domain.User;
import com.spring.variation.domain.Variation;
import com.spring.variation.domain.VariationBasic;

public interface VariationService{
	Page<Variation> findByCondition(String chrom, String start, String end, String ref, String alt, String billion, String rsID,
			String variation_type, String refSeq_genes, String exonic_function, String clinvar_id,
			String disease_name_id, String significance, String oMIM_ID, String gnomAD_exome_ALL,
			String gnomAD_exome_AFR, String gnomAD_exome_AMR, String gnomAD_exome_ASJ, String gnomAD_exome_EAS,
			String gnomAD_exome_FIN, String gnomAD_exome_NFE, String gnomAD_exome_OTH, String gnomAD_exome_SAS,
			String thousandG_ALL, String thousandG_EUR, String thousandG_AFR, String thousandG_EAS,
			String thousandG_SAS, String exAC_ALL, String exAC_AFR, String exAC_AMR, String exAC_EAS, String exAC_FIN,
			String exAC_NFE, String exAC_OTH, String exAC_SAS, String gnomAD_genome_ALL, String gnomAD_genome_AFR,
			String gnomAD_genome_AMR, String gnomAD_genome_ASJ, String gnomAD_genome_EAS, String gnomAD_genome_FIN,
			String gnomAD_genome_NFE, String gnomAD_genome_OTH, String sIFT, String polyPhenVal, String gERP,
			String cADD, String uuId,int page, int size);
	//查询Varition
	Page<Variation> findByVarition(String str,int page, int size);
	//查询Genomic
	List<Genomic> findByGenomic(String str);
	
	//查询Varition type=gene时
	List<VariationBasic> geneDataVarition(int start, int end, int chrom);
	
	//查询gene列表
	List<Genomic> geneListGenomic(int start, int end, int chrom);
	
	//根据id查询variant
	List<Variation> variant(String variantId);
	
	//登录
	List<User> login(String userName, String passWord);
	//用户信息
	List<User> getInfo(String userName);
}