package com.spring.variation.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.spring.variation.domain.Genomic;
import com.spring.variation.domain.User;
import com.spring.variation.domain.Variation;
import com.spring.variation.domain.VariationBasicChr1;
import com.spring.variation.domain.VariationBasicChr10;
import com.spring.variation.domain.VariationBasicChr11;
import com.spring.variation.domain.VariationBasicChr12;
import com.spring.variation.domain.VariationBasicChr13;
import com.spring.variation.domain.VariationBasicChr14;
import com.spring.variation.domain.VariationBasicChr15;
import com.spring.variation.domain.VariationBasicChr16;
import com.spring.variation.domain.VariationBasicChr17;
import com.spring.variation.domain.VariationBasicChr18;
import com.spring.variation.domain.VariationBasicChr19;
import com.spring.variation.domain.VariationBasicChr2;
import com.spring.variation.domain.VariationBasicChr20;
import com.spring.variation.domain.VariationBasicChr21;
import com.spring.variation.domain.VariationBasicChr22;
import com.spring.variation.domain.VariationBasicChr3;
import com.spring.variation.domain.VariationBasicChr4;
import com.spring.variation.domain.VariationBasicChr5;
import com.spring.variation.domain.VariationBasicChr6;
import com.spring.variation.domain.VariationBasicChr7;
import com.spring.variation.domain.VariationBasicChr8;
import com.spring.variation.domain.VariationBasicChr9;
import com.spring.variation.domain.VariationBasicChrx;
import com.spring.variation.domain.VariationDetailChr1;
import com.spring.variation.domain.VariationDetailChr10;
import com.spring.variation.domain.VariationDetailChr11;
import com.spring.variation.domain.VariationDetailChr12;
import com.spring.variation.domain.VariationDetailChr13;
import com.spring.variation.domain.VariationDetailChr14;
import com.spring.variation.domain.VariationDetailChr15;
import com.spring.variation.domain.VariationDetailChr16;
import com.spring.variation.domain.VariationDetailChr17;
import com.spring.variation.domain.VariationDetailChr18;
import com.spring.variation.domain.VariationDetailChr19;
import com.spring.variation.domain.VariationDetailChr2;
import com.spring.variation.domain.VariationDetailChr20;
import com.spring.variation.domain.VariationDetailChr21;
import com.spring.variation.domain.VariationDetailChr22;
import com.spring.variation.domain.VariationDetailChr3;
import com.spring.variation.domain.VariationDetailChr4;
import com.spring.variation.domain.VariationDetailChr5;
import com.spring.variation.domain.VariationDetailChr6;
import com.spring.variation.domain.VariationDetailChr7;
import com.spring.variation.domain.VariationDetailChr8;
import com.spring.variation.domain.VariationDetailChr9;
import com.spring.variation.domain.VariationDetailChrx;
import com.spring.variation.domain.VariationDetailsv;

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
	
	//查询gene列表
	List<Genomic> geneListGenomic(int start, int end, int chrom);
	
	//根据id查询variant
	List<Variation> variant(String variantId);
	
	//登录
	List<User> login(String userName, String passWord);
	//用户信息
	List<User> getInfo(String userName);
	
	//查询Varition type=gene时
	List<VariationBasicChr1> geneDataVarition1(int start, int end, int chrom);
	List<VariationBasicChr2> geneDataVarition2(int start, int end, int chrom);
	List<VariationBasicChr3> geneDataVarition3(int start, int end, int chrom);
	List<VariationBasicChr4> geneDataVarition4(int start, int end, int chrom);
	List<VariationBasicChr5> geneDataVarition5(int start, int end, int chrom);
	List<VariationBasicChr6> geneDataVarition6(int start, int end, int chrom);
	List<VariationBasicChr7> geneDataVarition7(int start, int end, int chrom);
	List<VariationBasicChr8> geneDataVarition8(int start, int end, int chrom);
	List<VariationBasicChr9> geneDataVarition9(int start, int end, int chrom);
	List<VariationBasicChr10> geneDataVarition10(int start, int end, int chrom);
	List<VariationBasicChr11> geneDataVarition11(int start, int end, int chrom);
	List<VariationBasicChr12> geneDataVarition12(int start, int end, int chrom);
	List<VariationBasicChr13> geneDataVarition13(int start, int end, int chrom);
	List<VariationBasicChr14> geneDataVarition14(int start, int end, int chrom);
	List<VariationBasicChr15> geneDataVarition15(int start, int end, int chrom);
	List<VariationBasicChr16> geneDataVarition16(int start, int end, int chrom);
	List<VariationBasicChr17> geneDataVarition17(int start, int end, int chrom);
	List<VariationBasicChr18> geneDataVarition18(int start, int end, int chrom);
	List<VariationBasicChr19> geneDataVarition19(int start, int end, int chrom);
	List<VariationBasicChr20> geneDataVarition20(int start, int end, int chrom);
	List<VariationBasicChr21> geneDataVarition21(int start, int end, int chrom);
	List<VariationBasicChr22> geneDataVarition22(int start, int end, int chrom);
	List<VariationBasicChrx> geneDataVaritionx(int start, int end, String string);
	
	//查询Varition type=variat时
	List<VariationBasicChr1> variant1(String variantId, int chrom);
	List<VariationBasicChr2> variant2(String variantId, int chrom);
	List<VariationBasicChr3> variant3(String variantId, int chrom);
	List<VariationBasicChr4> variant4(String variantId, int chrom);
	List<VariationBasicChr5> variant5(String variantId, int chrom);
	List<VariationBasicChr6> variant6(String variantId, int chrom);
	List<VariationBasicChr7> variant7(String variantId, int chrom);
	List<VariationBasicChr8> variant8(String variantId, int chrom);
	List<VariationBasicChr9> variant9(String variantId, int chrom);
	List<VariationBasicChr10> variant10(String variantId, int chrom);
	List<VariationBasicChr11> variant11(String variantId, int chrom);
	List<VariationBasicChr12> variant12(String variantId, int chrom);
	List<VariationBasicChr13> variant13(String variantId, int chrom);
	List<VariationBasicChr14> variant14(String variantId, int chrom);
	List<VariationBasicChr15> variant15(String variantId, int chrom);
	List<VariationBasicChr16> variant16(String variantId, int chrom);
	List<VariationBasicChr17> variant17(String variantId, int chrom);
	List<VariationBasicChr18> variant18(String variantId, int chrom);
	List<VariationBasicChr19> variant19(String variantId, int chrom);
	List<VariationBasicChr20> variant20(String variantId, int chrom);
	List<VariationBasicChr21> variant21(String variantId, int chrom);
	List<VariationBasicChr22> variant22(String variantId, int chrom);
	List<VariationBasicChrx> variant23(String variantId, String chrom);
	
	//根据id查询variantDetail
	List<VariationDetailChr1> variantDetail1(String variantId, int chrom);
	List<VariationDetailChr2> variantDetail2(String variantId, int chrom);
	List<VariationDetailChr3> variantDetail3(String variantId, int chrom);
	List<VariationDetailChr4> variantDetail4(String variantId, int chrom);
	List<VariationDetailChr5> variantDetail5(String variantId, int chrom);
	List<VariationDetailChr6> variantDetail6(String variantId, int chrom);
	List<VariationDetailChr7> variantDetail7(String variantId, int chrom);
	List<VariationDetailChr8> variantDetail8(String variantId, int chrom);
	List<VariationDetailChr9> variantDetail9(String variantId, int chrom);
	List<VariationDetailChr10> variantDetail10(String variantId, int chrom);
	List<VariationDetailChr11> variantDetail11(String variantId, int chrom);
	List<VariationDetailChr12> variantDetail12(String variantId, int chrom);
	List<VariationDetailChr13> variantDetail13(String variantId, int chrom);
	List<VariationDetailChr14> variantDetail14(String variantId, int chrom);
	List<VariationDetailChr15> variantDetail15(String variantId, int chrom);
	List<VariationDetailChr16> variantDetail16(String variantId, int chrom);
	List<VariationDetailChr17> variantDetail17(String variantId, int chrom);
	List<VariationDetailChr18> variantDetail18(String variantId, int chrom);
	List<VariationDetailChr19> variantDetail19(String variantId, int chrom);
	List<VariationDetailChr20> variantDetail20(String variantId, int chrom);
	List<VariationDetailChr21> variantDetail21(String variantId, int chrom);
	List<VariationDetailChr22> variantDetail22(String variantId, int chrom);
	List<VariationDetailChrx> variantDetailx(String variantId, String string);
	
	//查询相关基因
	List<Genomic> getRelateGene(String string);
	
	//根据id查询svVariantDetail
	List<VariationDetailsv> variantDetailsv(String variantId);
	
}