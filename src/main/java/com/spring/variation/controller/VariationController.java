package com.spring.variation.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.variation.dao.VariationRepository;
import com.spring.variation.domain.Genomic;
import com.spring.variation.domain.User;
import com.spring.variation.domain.Variation;
import com.spring.variation.domain.VariationBasic;
import com.spring.variation.service.VariationService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*",maxAge = 3600)
public class VariationController {

    @Autowired
    private VariationService variationService;
    
	@RequestMapping("/variation")
	public Object findByCondition(@RequestParam(value = "page", defaultValue = "0") Integer page,
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
	     Map<String, Object> map = new HashMap();
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
	public Object findByCondition(@RequestBody Map<String,Object> Str,
							@RequestParam(value = "page", defaultValue = "0") Integer page,
	                        @RequestParam(value = "size", defaultValue = "5") Integer size){
		Map<String, Object> map = new HashMap();
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
	public Object genePositionData(@RequestBody Map<String,Object> Gene){
		Map<String, Object> map = new HashMap();
		int start = (int) Gene.get("start");
		int end = (int) Gene.get("end");
		int chrom = (int) Gene.get("chrom");
    	List<VariationBasic> list = variationService.geneDataVarition(start, end, chrom);
    	List<Genomic> list2 = variationService.geneListGenomic(start, end, chrom);
	    map.put("variation", list);
	    map.put("genomic", list2);
		return map;
	}
	
	@RequestMapping("/variant")
	public Object variant(@RequestBody Map<String,Object> Gene){
		Map<String, Object> map = new HashMap();
		String variantId = (String) Gene.get("variantId");
    	List<Variation> list = variationService.variant(variantId);
    	map.put("type", "variant");
	    map.put("listData", list);
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
			map.put("token", list.get(0).getName());
        }else{
        	map.put("code", 500);
        }
		return map;
	}
	
	@RequestMapping("/getInfo")
	public Object getInfo(@RequestBody Map<String,Object> User){
		Map<String, Object> map = new HashMap();
		Map<String, Object> res = new HashMap();
		String userName = (String) User.get("username");
		List<User> list = variationService.getInfo(userName);
		System.out.println(list);
		if (!list.isEmpty()){
			map.put("roles", list.get(0).getRole());
		    map.put("name", list.get(0).getName());
		}
    	res.put("data",map);
		return res;
	}
}