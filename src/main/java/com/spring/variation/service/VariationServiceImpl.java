package com.spring.variation.service;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import com.spring.variation.dao.GenomicRepository;
import com.spring.variation.dao.UserRepository;
import com.spring.variation.dao.VariationRepository;
import com.spring.variation.dao.VariationBasicRepository;
import com.spring.variation.domain.Genomic;
import com.spring.variation.domain.User;
import com.spring.variation.domain.Variation;
import com.spring.variation.domain.VariationBasic;

@Service("VariationService")
public class VariationServiceImpl implements VariationService {
    @Autowired
    private VariationRepository variationRepository;
    @Autowired
    private GenomicRepository genomicRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private VariationBasicRepository variationBasicRepository;
    @Override
    public Page<Variation> findByCondition(String chrom, String start, String end, String ref, String alt, String billion, String rsID,
			String variation_type, String refSeq_genes, String exonic_function, String clinvar_id,
			String disease_name_id, String significance, String oMIM_ID, String gnomAD_exome_ALL,
			String gnomAD_exome_AFR, String gnomAD_exome_AMR, String gnomAD_exome_ASJ, String gnomAD_exome_EAS,
			String gnomAD_exome_FIN, String gnomAD_exome_NFE, String gnomAD_exome_OTH, String gnomAD_exome_SAS,
			String thousandG_ALL, String thousandG_EUR, String thousandG_AFR, String thousandG_EAS,
			String thousandG_SAS, String exAC_ALL, String exAC_AFR, String exAC_AMR, String exAC_EAS, String exAC_FIN,
			String exAC_NFE, String exAC_OTH, String exAC_SAS, String gnomAD_genome_ALL, String gnomAD_genome_AFR,
			String gnomAD_genome_AMR, String gnomAD_genome_ASJ, String gnomAD_genome_EAS, String gnomAD_genome_FIN,
			String gnomAD_genome_NFE, String gnomAD_genome_OTH, String sIFT, String polyPhenVal, String gERP,
			String cADD, String uuId,int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return variationRepository.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            
            if (!StringUtils.isEmpty(chrom)){             //Chrom
              predicates.add(criteriaBuilder.equal(root.get("Chrom"),chrom));
            }
            
            if (!StringUtils.isEmpty(uuId)){             //uuId
              predicates.add(criteriaBuilder.equal(root.get("uuId"),uuId));
            }
            
            return criteriaQuery.where(predicates.toArray(new Predicate[predicates.size()])).getRestriction();
        },pageable);
    }
    
    @Override
    public Page<Variation> findByVarition(String str,int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return variationRepository.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uuId"),str);
            if (!StringUtils.isEmpty(str)){
            	predicates.add(criteriaBuilder.and(p1));
            }
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        },pageable);
    }
    
    @Override
    public List<Genomic> findByGenomic(String str) {
        return genomicRepository.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
//            int num = Integer.parseInt(str);
//    		Predicate p3 = criteriaBuilder.lt(root.get("start"),num);
//            Predicate p4 = criteriaBuilder.gt(root.get("end"),num);
//    		predicates.add(criteriaBuilder.and(p1,p3,p4));
//    		Predicate p1 = criteriaBuilder.like(root.get("gene"),"%"+str+"%");
            Predicate p1 = criteriaBuilder.like(root.get("gene"), str+"%");
    		Predicate p2 = criteriaBuilder.equal(root.get("type"),"gene");
    		Predicate p3 = criteriaBuilder.equal(root.get("type"),"pseudogene");
    		predicates.add(criteriaBuilder.and(p1));
    		predicates.add(criteriaBuilder.or(p2,p3));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    
    @Override
    public List<VariationBasic> geneDataVarition(int start, int end, int chrom) {
        return variationBasicRepository.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
    		Predicate p2 = criteriaBuilder.gt(root.get("Start"),start);
            Predicate p3 = criteriaBuilder.lt(root.get("End"),end);
    		predicates.add(criteriaBuilder.and(p1,p2,p3));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    
    @Override
    public List<Genomic> geneListGenomic(int start, int end, int chrom) {
        return genomicRepository.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = null;
            if(chrom < 10) {
            	p1 = criteriaBuilder.like(root.get("chrom"),"%0"+chrom+".%");
            } else {
            	p1 = criteriaBuilder.like(root.get("chrom"),"%"+chrom+".%");
            }
    		Predicate p2 = criteriaBuilder.gt(root.get("start"),start);
            Predicate p3 = criteriaBuilder.lt(root.get("end"),end);
    		predicates.add(criteriaBuilder.and(p1,p2,p3));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    
    @Override
    public List<Variation> variant(String variantId) {
        return variationRepository.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uuId"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    
    @Override
    public List<User> login(String userName, String passWord) {
        return userRepository.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            String md5Password = DigestUtils.md5DigestAsHex(passWord.getBytes());
            System.out.println(md5Password);
            Predicate p1 = criteriaBuilder.equal(root.get("name"),userName);
            Predicate p2 = criteriaBuilder.equal(root.get("password"),md5Password);
    		predicates.add(criteriaBuilder.and(p1,p2));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    
    @Override
    public List<User> getInfo(String userName) {
        return userRepository.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("name"),userName);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
}
