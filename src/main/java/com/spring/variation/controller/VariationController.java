package com.spring.variation.controller;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.variation.domain.EmailCode;
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
import com.spring.variation.service.MailService;
import com.spring.variation.service.VariationService;
import com.spring.variation.utils.AesUtil;
import com.spring.variation.utils.JwtToken;

import net.sf.json.JSONArray;

@RestController
@RequestMapping("/")
//@CrossOrigin(origins = "http://localhost:8080/",maxAge = 3600)
//@CrossOrigin(origins = "http://172.18.0.1:8083/",maxAge = 3600)
public class VariationController {

    @Autowired
    private VariationService variationService;
    
	@RequestMapping("/variation")
	public Object findByCondition(HttpServletRequest request,
							@RequestParam(value = "page", defaultValue = "0") Integer page,
	                        @RequestParam(value = "size", defaultValue = "10") Integer size,
	                        @RequestParam(value = "chrom", defaultValue = "") String chrom,
	                        @RequestParam(value = "start", defaultValue = "") String start,
	                        @RequestParam(value = "end", defaultValue = "") String end,
	                        @RequestParam(value = "ref", defaultValue = "") String ref,
	                        @RequestParam(value = "alt", defaultValue = "") String alt,
	                        @RequestParam(value = "billion", defaultValue = "") String billion,
	                        @RequestParam(value = "rsID", defaultValue = "") String rsID,
	                        @RequestParam(value = "variation_type", defaultValue = "") String variation_type,
	                        @RequestParam(value = "refSeq_genes", defaultValue = "") String refSeq_genes,
	                        @RequestParam(value = "exonic_function", defaultValue = "") String exonic_function,
	                        @RequestParam(value = "clinvar_id", defaultValue = "") String clinvar_id,
	                        @RequestParam(value = "disease_name_id", defaultValue = "") String disease_name_id,
	                        @RequestParam(value = "significance", defaultValue = "") String significance,
	                        @RequestParam(value = "oMIM_ID", defaultValue = "") String oMIM_ID,
	                        @RequestParam(value = "gnomAD_exome_ALL", defaultValue = "") String gnomAD_exome_ALL,
	                        @RequestParam(value = "gnomAD_exome_AFR", defaultValue = "") String gnomAD_exome_AFR,
	                        @RequestParam(value = "gnomAD_exome_ASJ", defaultValue = "") String gnomAD_exome_ASJ,
	                        @RequestParam(value = "gnomAD_exome_EAS", defaultValue = "") String gnomAD_exome_EAS,
	                        @RequestParam(value = "gnomAD_exome_FIN", defaultValue = "") String gnomAD_exome_FIN,
	                        @RequestParam(value = "gnomAD_exome_NFE", defaultValue = "") String gnomAD_exome_NFE,
	                        @RequestParam(value = "gnomAD_exome_OTH", defaultValue = "") String gnomAD_exome_OTH,
	                        @RequestParam(value = "gnomAD_exome_SAS", defaultValue = "") String gnomAD_exome_SAS,
	                        @RequestParam(value = "thousandG_ALL", defaultValue = "") String thousandG_ALL,
	                        @RequestParam(value = "thousandG_EUR", defaultValue = "") String thousandG_EUR,
	                        @RequestParam(value = "thousandG_AFR", defaultValue = "") String thousandG_AFR,
	                        @RequestParam(value = "thousandG_EAS", defaultValue = "") String thousandG_EAS,
	                        @RequestParam(value = "thousandG_SAS", defaultValue = "") String thousandG_SAS,
	                        @RequestParam(value = "exAC_ALL", defaultValue = "") String exAC_ALL,
	                        @RequestParam(value = "exAC_AFR", defaultValue = "") String exAC_AFR,
	                        @RequestParam(value = "exAC_AMR", defaultValue = "") String exAC_AMR,
	                        @RequestParam(value = "exAC_EAS", defaultValue = "") String exAC_EAS,
	                        @RequestParam(value = "exAC_FIN", defaultValue = "") String exAC_FIN,
	                        @RequestParam(value = "exAC_NFE", defaultValue = "") String exAC_NFE,
	                        @RequestParam(value = "exAC_OTH", defaultValue = "") String exAC_OTH,
	                        @RequestParam(value = "exAC_SAS", defaultValue = "") String exAC_SAS,
	                        @RequestParam(value = "gnomAD_genome_ALL", defaultValue = "") String gnomAD_genome_ALL,
	                        @RequestParam(value = "gnomAD_genome_AFR", defaultValue = "") String gnomAD_genome_AFR,
	                        @RequestParam(value = "gnomAD_genome_AMR", defaultValue = "") String gnomAD_genome_AMR,
	                        @RequestParam(value = "gnomAD_genome_ASJ", defaultValue = "") String gnomAD_genome_ASJ,
	                        @RequestParam(value = "gnomAD_genome_EAS", defaultValue = "") String gnomAD_genome_EAS,
	                        @RequestParam(value = "gnomAD_genome_FIN", defaultValue = "") String gnomAD_genome_FIN,
	                        @RequestParam(value = "gnomAD_genome_NFE", defaultValue = "") String gnomAD_genome_NFE,
	                        @RequestParam(value = "gnomAD_genome_OTH", defaultValue = "") String gnomAD_genome_OTH,
	                        @RequestParam(value = "sIFT", defaultValue = "") String sIFT,
	                        @RequestParam(value = "polyPhenVal", defaultValue = "") String polyPhenVal,
	                        @RequestParam(value = "gERP", defaultValue = "") String gERP,
	                        @RequestParam(value = "cADD", defaultValue = "") String cADD,
	                        @RequestParam(value = "uuId", defaultValue = "") String uuId,
	                        @RequestParam(value = "gnomAD_exome_AMR", defaultValue = "") String gnomAD_exome_AMR
	                        ){
			Map<String, Object> map = new HashMap();
			Map<String, Object> res = new HashMap();
			String token = request.getHeader("X-Token");
			if(!JwtToken.checkToken(token)) {
				res.put("code",100);
				res.put("message","token不存在或已过期 ");
				return res;
			}
			List<Variation> list = variationService.findByCondition(chrom, start, end, ref, alt, billion, rsID,
	 			 variation_type, refSeq_genes, exonic_function, clinvar_id,
				 disease_name_id, significance, oMIM_ID, gnomAD_exome_ALL,
				 gnomAD_exome_AFR, gnomAD_exome_AMR, gnomAD_exome_ASJ, gnomAD_exome_EAS,
				 gnomAD_exome_FIN, gnomAD_exome_NFE, gnomAD_exome_OTH, gnomAD_exome_SAS,
				 thousandG_ALL, thousandG_EUR, thousandG_AFR, thousandG_EAS,
				 thousandG_SAS, exAC_ALL, exAC_AFR, exAC_AMR, exAC_EAS, exAC_FIN,
				 exAC_NFE, exAC_OTH, exAC_SAS, gnomAD_genome_ALL, gnomAD_genome_AFR,
				 gnomAD_genome_AMR, gnomAD_genome_ASJ, gnomAD_genome_EAS, gnomAD_genome_FIN,
				 gnomAD_genome_NFE, gnomAD_genome_OTH, sIFT, polyPhenVal, gERP,
				 cADD, uuId, page, size).getContent();
	     map.put("num", list.size());
	     map.put("listData", list);
	
	     return map;
	}
	
//	@RequestMapping("/search")
//	public Object findByCondition(@RequestParam(value = "str", defaultValue = "") String str,
//							@RequestParam(value = "page", defaultValue = "0") Integer page,
//	                        @RequestParam(value = "size", defaultValue = "5") Integer size){
//		Map<String, Object> map = new HashMap();
//		System.out.println(str);
//		if (!StringUtils.isEmpty(str)){
//			System.out.println(str);
//			 boolean status = str.contains("-");
//		     if(status) {
//		    	 List<Variation> list = variationService.findByVarition(str, page, size).getContent();
//		    	 map.put("num", list.size());
//		    	 map.put("type", "variant");
//			     map.put("listData", list);
//		     } else {
//		    	 List<Genomic> list2 = variationService.findByGenomic(str, page, size).getContent();
//		    	 map.put("num", list2.size());
//		    	 map.put("type", "gene");
//			     map.put("listData", list2);
//		     }
//		}
//		return map;
//	}
	
	@RequestMapping("/search")
	public Object findByCondition(HttpServletRequest request,@RequestBody Map<String,Object> Str,
							@RequestParam(value = "page", defaultValue = "0") Integer page,
	                        @RequestParam(value = "size", defaultValue = "5") Integer size){
		Map<String, Object> map = new HashMap();
		Map<String, Object> res = new HashMap();
		String token = request.getHeader("X-Token");
		if(!JwtToken.checkToken(token)) {
			res.put("code",100);
			res.put("message","token不存在或已过期 ");
			return res;
		}
		String str = (String) Str.get("str");
		if (!StringUtils.isEmpty(str)){
			List<Genomic> list = variationService.findByGenomic(str);
			List<Genomic> list2;
			if(list.size() > 5) {
				list2 = variationService.findByGenomic(str).subList(0, 5);
			}else {
				list2 = variationService.findByGenomic(str);
			}
    	 map.put("type", "gene");
	     map.put("listData", list2);
		}
		return map;
	}
	
	@RequestMapping("/genePositionData")
	public Object genePositionData(HttpServletRequest request,@RequestBody Map<String,Object> Gene){
		Map<String, Object> map = new HashMap();
		Map<String, Object> res = new HashMap();
		String token = request.getHeader("X-Token");
		if(!JwtToken.checkToken(token)) {
			res.put("code",100);
			res.put("message","token不存在或已过期 ");
			return res;
		}
		int start = (int) Gene.get("start");
		int end = (int) Gene.get("end");
		int chrom = (int) Gene.get("chrom");
		String key = AesUtil.generateKeyAndIv();
		JSONArray jsa = null;
		if(chrom == 1) {
			List<VariationBasicChr1> list = variationService.geneDataVarition1(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 2) {
			List<VariationBasicChr2> list = variationService.geneDataVarition2(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 3) {
			List<VariationBasicChr3> list = variationService.geneDataVarition3(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 4) {
			List<VariationBasicChr4> list = variationService.geneDataVarition4(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 5) {
			List<VariationBasicChr5> list = variationService.geneDataVarition5(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 6) {
			List<VariationBasicChr6> list = variationService.geneDataVarition6(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 7) {
			List<VariationBasicChr7> list = variationService.geneDataVarition7(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 9) {
			List<VariationBasicChr8> list = variationService.geneDataVarition8(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 9) {
			List<VariationBasicChr9> list = variationService.geneDataVarition9(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 10) {
			List<VariationBasicChr10> list = variationService.geneDataVarition10(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 11) {
			List<VariationBasicChr11> list = variationService.geneDataVarition11(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 12) {
			List<VariationBasicChr12> list = variationService.geneDataVarition12(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 13) {
			List<VariationBasicChr13> list = variationService.geneDataVarition13(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 14) {
			List<VariationBasicChr14> list = variationService.geneDataVarition14(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 15) {
			List<VariationBasicChr15> list = variationService.geneDataVarition15(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 16) {
			List<VariationBasicChr16> list = variationService.geneDataVarition16(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 17) {
			List<VariationBasicChr17> list = variationService.geneDataVarition17(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 18) {
			List<VariationBasicChr18> list = variationService.geneDataVarition18(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 19) {
			List<VariationBasicChr19> list = variationService.geneDataVarition19(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 20) {
			List<VariationBasicChr20> list = variationService.geneDataVarition20(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 21) {
			List<VariationBasicChr21> list = variationService.geneDataVarition21(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}else if(chrom == 22) {
			List<VariationBasicChr22> list = variationService.geneDataVarition22(start, end, chrom);
			jsa = JSONArray.fromObject(list);
		}else if(chrom == 23) {
			List<VariationBasicChrx> list = variationService.geneDataVaritionx(start, end, "x");
			jsa = JSONArray.fromObject(list);
		}else {
			jsa = null;
		}
		List<Genomic> list2 = variationService.geneListGenomic(start, end, chrom);
		String result = AesUtil.encrypt(jsa.toString(),key);
		map.put("code", 200);
		map.put("key", AesUtil.encrypt(key,"4t5dac4nhxz41e6u"));
		map.put("variation",result);
	    map.put("genomic", list2);
		return map;
	}
	
	@RequestMapping("/variant")
	public Object variant(HttpServletRequest request,@RequestBody Map<String,Object> Gene){
		Map<String, Object> map = new HashMap();
		Map<String, Object> res = new HashMap();
		String token = request.getHeader("X-Token");
		if(!JwtToken.checkToken(token)) {
			res.put("code",100);
			res.put("message","token不存在或已过期 ");
			return res;
		}
		String variantId = (String) Gene.get("variantId");
		int chrom = Integer.parseInt(Gene.get("chrom").toString());
    	if(chrom == 1) {
			List<VariationBasicChr1> list = variationService.variant1(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 2) {
			List<VariationBasicChr2> list = variationService.variant2(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 3) {
			List<VariationBasicChr3> list = variationService.variant3(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 4) {
			List<VariationBasicChr4> list = variationService.variant4(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 5) {
			List<VariationBasicChr5> list = variationService.variant5(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 6) {
			List<VariationBasicChr6> list = variationService.variant6(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 7) {
			List<VariationBasicChr7> list = variationService.variant7(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 8) {
			List<VariationBasicChr8> list = variationService.variant8(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 9) {
			List<VariationBasicChr9> list = variationService.variant9(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 10) {
			List<VariationBasicChr10> list = variationService.variant10(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 11) {
			List<VariationBasicChr11> list = variationService.variant11(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 12) {
			List<VariationBasicChr12> list = variationService.variant12(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 13) {
			List<VariationBasicChr13> list = variationService.variant13(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 14) {
			List<VariationBasicChr14> list = variationService.variant14(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 15) {
			List<VariationBasicChr15> list = variationService.variant15(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 16) {
			List<VariationBasicChr16> list = variationService.variant16(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 17) {
			List<VariationBasicChr17> list = variationService.variant17(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 18) {
			List<VariationBasicChr18> list = variationService.variant18(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 19) {
			List<VariationBasicChr19> list = variationService.variant19(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 20) {
			List<VariationBasicChr20> list = variationService.variant20(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 21) {
			List<VariationBasicChr21> list = variationService.variant21(variantId,chrom);
			map.put("listData", list);
		}else if(chrom == 22) {
			List<VariationBasicChr22> list = variationService.variant22(variantId,chrom);
			map.put("listData", list);
		}else if(chrom == 23) {
			List<VariationBasicChrx> list = variationService.variant23(variantId, "x");
			map.put("listData", list);
		}else {
			map.put("listData", null);
		}
    	map.put("type", "variant");
		return map;
	}
	
	@RequestMapping("/svVariant")
	public Object svVariant(HttpServletRequest request,@RequestBody Map<String,Object> Gene){
		Map<String, Object> map = new HashMap();
		Map<String, Object> res = new HashMap();
		String token = request.getHeader("X-Token");
		if(!JwtToken.checkToken(token)) {
			res.put("code",100);
			res.put("message","token不存在或已过期 ");
			return res;
		}
		String variantId = (String) Gene.get("variantId");
		int chrom = Integer.parseInt(Gene.get("chrom").toString());
    	if(chrom == 1) {
			List<VariationBasicChr1> list = variationService.variant1(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 2) {
			List<VariationBasicChr2> list = variationService.variant2(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 3) {
			List<VariationBasicChr3> list = variationService.variant3(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 4) {
			List<VariationBasicChr4> list = variationService.variant4(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 5) {
			List<VariationBasicChr5> list = variationService.variant5(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 6) {
			List<VariationBasicChr6> list = variationService.variant6(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 7) {
			List<VariationBasicChr7> list = variationService.variant7(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 8) {
			List<VariationBasicChr8> list = variationService.variant8(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 9) {
			List<VariationBasicChr9> list = variationService.variant9(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 10) {
			List<VariationBasicChr10> list = variationService.variant10(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 11) {
			List<VariationBasicChr11> list = variationService.variant11(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 12) {
			List<VariationBasicChr12> list = variationService.variant12(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 13) {
			List<VariationBasicChr13> list = variationService.variant13(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 14) {
			List<VariationBasicChr14> list = variationService.variant14(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 15) {
			List<VariationBasicChr15> list = variationService.variant15(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 16) {
			List<VariationBasicChr16> list = variationService.variant16(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 17) {
			List<VariationBasicChr17> list = variationService.variant17(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 18) {
			List<VariationBasicChr18> list = variationService.variant18(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 19) {
			List<VariationBasicChr19> list = variationService.variant19(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 20) {
			List<VariationBasicChr20> list = variationService.variant20(variantId,chrom);
			map.put("listData", list);
		}
		else if(chrom == 21) {
			List<VariationBasicChr21> list = variationService.variant21(variantId,chrom);
			map.put("listData", list);
		}else if(chrom == 22) {
			List<VariationBasicChr22> list = variationService.variant22(variantId,chrom);
			map.put("listData", list);
		}else if(chrom == 23) {
			List<VariationBasicChrx> list = variationService.variant23(variantId, "x");
			map.put("listData", list);
		}else {
			map.put("listData", null);
		}
    	map.put("type", "svVariant");
		return map;
	}
	
	@RequestMapping("/variantDetail")
	public Object variantDetail(HttpServletRequest request,@RequestBody Map<String,Object> Gene){
		Map<String, Object> map = new HashMap();
		Map<String, Object> res = new HashMap();
		String token = request.getHeader("X-Token");
		if(!JwtToken.checkToken(token)) {
			res.put("code",100);
			res.put("message","token不存在或已过期 ");
			return res;
		}
		String variantId = (String) Gene.get("variantId");
		int chrom = Integer.parseInt(Gene.get("chrom").toString());
		List<Genomic> relateList = new LinkedList<>();
		String thisRelated = "";
		String key = AesUtil.generateKeyAndIv();
		JSONArray jsa = null;
		if(chrom == 1) {
			List<VariationDetailChr1> list = variationService.variantDetail1(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 2) {
			List<VariationDetailChr2> list = variationService.variantDetail2(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 3) {
			List<VariationDetailChr3> list = variationService.variantDetail3(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 4) {
			List<VariationDetailChr4> list = variationService.variantDetail4(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 5) {
			List<VariationDetailChr5> list = variationService.variantDetail5(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 6) {
			List<VariationDetailChr6> list = variationService.variantDetail6(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 7) {
			List<VariationDetailChr7> list = variationService.variantDetail7(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 8) {
			List<VariationDetailChr8> list = variationService.variantDetail8(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 9) {
			List<VariationDetailChr9> list = variationService.variantDetail9(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 10) {
			List<VariationDetailChr10> list = variationService.variantDetail10(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 11) {
			List<VariationDetailChr11> list = variationService.variantDetail11(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 12) {
			List<VariationDetailChr12> list = variationService.variantDetail12(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 13) {
			List<VariationDetailChr13> list = variationService.variantDetail13(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 14) {
			List<VariationDetailChr14> list = variationService.variantDetail14(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 15) {
			List<VariationDetailChr15> list = variationService.variantDetail15(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 16) {
			List<VariationDetailChr16> list = variationService.variantDetail16(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 17) {
			List<VariationDetailChr17> list = variationService.variantDetail17(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 18) {
			List<VariationDetailChr18> list = variationService.variantDetail18(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 19) {
			List<VariationDetailChr19> list = variationService.variantDetail19(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 20) {
			List<VariationDetailChr20> list = variationService.variantDetail20(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}
		else if(chrom == 21) {
			List<VariationDetailChr21> list = variationService.variantDetail21(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}else if(chrom == 22) {
			List<VariationDetailChr22> list = variationService.variantDetail22(variantId,chrom);
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}else if(chrom == 23) {
			List<VariationDetailChrx> list = variationService.variantDetailx(variantId,"x");
			thisRelated = (String)list.get(0).getRelated_gene();
			jsa = JSONArray.fromObject(list);
		}else {
			thisRelated = null;
		}
		if(thisRelated != null && thisRelated.length() > 0) {
			for(int i=0;i<thisRelated.split(";").length;i++){
				if(!thisRelated.split(";")[i].equals("NONE")) {
					relateList.add(variationService.getRelateGene(thisRelated.split(";")[i]).get(0));
				}
            }
			
		}
		String result = AesUtil.encrypt(jsa.toString(),key);
		map.put("listData", result);
		map.put("key", AesUtil.encrypt(key,"4t5dac4nhxz41e6u"));
		map.put("relateList", relateList);
    	map.put("type", "variant");
		return map;
	}
	
	
	@RequestMapping("/svVariantDetail")
	public Object svVariantDetail(HttpServletRequest request,@RequestBody Map<String,Object> Gene){
		Map<String, Object> map = new HashMap();
		Map<String, Object> res = new HashMap();
		String token = request.getHeader("X-Token");
		if(!JwtToken.checkToken(token)) {
			res.put("code",100);
			res.put("message","token不存在或已过期 ");
			return res;
		}
		String variantId = (String) Gene.get("variantId");
		List<VariationDetailsv> list = variationService.variantDetailsv(variantId);
		if (!list.isEmpty()){
			String key = AesUtil.generateKeyAndIv();
			JSONArray jsa = JSONArray.fromObject(list);
			String result = AesUtil.encrypt(jsa.toString(),key);
			map.put("code", 200);
			map.put("key", AesUtil.encrypt(key,"4t5dac4nhxz41e6u"));
			map.put("listData",result);
			map.put("type", "svVariant");
        }else{
        	map.put("code", 500);
        	map.put("listData", null);
        }
		return map;
	}
	
	@RequestMapping("/login")
	public Object login(@RequestBody Map<String,Object> User){
		Map<String, Object> map = new HashMap();
		String userName = (String) User.get("username");
		String passWord = (String) User.get("password");
		List<User> list = variationService.login(userName, passWord);
		if (!list.isEmpty()){
			map.put("code", 200);
			map.put("userName", list.get(0).getName());
			map.put("token", JwtToken.createToken(list.get(0).getName(),list.get(0).getRole()));
        }else{
        	map.put("code", 500);
        }
		return map;
	}
	
	@RequestMapping("/getInfo")
	public Object getInfo(HttpServletRequest request,@RequestBody Map<String,Object> User){
		Map<String, Object> map = new HashMap();
		Map<String, Object> res = new HashMap();
		String token = request.getHeader("X-Token");
		if(!JwtToken.checkToken(token)) {
			res.put("code",100);
			res.put("message","token不存在或已过期 ");
			return res;
		}
		String userName = (String) User.get("username");
		List<User> list = variationService.getInfo(userName);
//		System.out.println(list);
		if (!list.isEmpty()){
			map.put("roles", list.get(0).getRole());
		    map.put("name", list.get(0).getName());
		}
    	res.put("data",map);
		return res;
	}
	
	@Autowired
    MailService mailService;
	@RequestMapping("/register")
	public Map<String, Object> register(@RequestBody Map<String,String> map) {
		Map<String, Object> res = new HashMap();
		try {
			String email = map.get("email");
			String principalType = map.get("principalType");
			String applicationPurpose = map.get("applicationPurpose");
			String IDCardName = map.get("IDCardName");
			String IDCardNo = map.get("IDCardNo");
			String emailCode = map.get("emailCode");
			List<EmailCode> list = variationService.findEmailCode(email);
			if (!list.isEmpty()){
				if(list.get(list.size() - 1).getCode().equals(emailCode)) {
					res.put("code", 200);
					String message = "申请人邮箱：" + email + "\r\n" + "申请主体类型：" + principalType + "\r\n"+ "申请人姓名：" + IDCardName + "\r\n"+ "申请人身份证号码：" + IDCardNo + "\r\n" + "申请账号用途：" + applicationPurpose + "\r\n";
			        mailService.sendSimpleMail("h100kgp@163.com","hit100kgp@163.com","中国人群多组学参比数据库账号申请",message);
				}else {
					res.put("code", 201);
				}
			}else {
				res.put("code", 400);
			}
			return res;
		} catch (Exception e) {
			e.printStackTrace();
			res.put("code", 500);
			return res;
		}
    }
	
	@RequestMapping("/sendCode")
	public String sendCode(@RequestBody EmailCode newEmailCode) {
		try {
			String email = newEmailCode.getEmail();
	        String code = (Math.random()+"").substring(2,8);
	        newEmailCode.setCode(code);
	        variationService.addEmailCode(newEmailCode);
	        mailService.sendSimpleMail("h100kgp@163.com",email,"中国人群多组学参比数据库账号申请验证码",code);
			return code;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
    }
}