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

import com.spring.variation.dao.EmailCodeRepository;
import com.spring.variation.dao.GenomicRepository;
import com.spring.variation.dao.UserRepository;
import com.spring.variation.dao.VariationBasicRepository1;
import com.spring.variation.dao.VariationBasicRepository10;
import com.spring.variation.dao.VariationBasicRepository11;
import com.spring.variation.dao.VariationBasicRepository12;
import com.spring.variation.dao.VariationBasicRepository13;
import com.spring.variation.dao.VariationBasicRepository14;
import com.spring.variation.dao.VariationBasicRepository15;
import com.spring.variation.dao.VariationBasicRepository16;
import com.spring.variation.dao.VariationBasicRepository17;
import com.spring.variation.dao.VariationBasicRepository18;
import com.spring.variation.dao.VariationBasicRepository19;
import com.spring.variation.dao.VariationBasicRepository2;
import com.spring.variation.dao.VariationBasicRepository20;
import com.spring.variation.dao.VariationRepository;
import com.spring.variation.dao.VariationBasicRepository21;
import com.spring.variation.dao.VariationBasicRepository22;
import com.spring.variation.dao.VariationBasicRepository3;
import com.spring.variation.dao.VariationBasicRepository4;
import com.spring.variation.dao.VariationBasicRepository5;
import com.spring.variation.dao.VariationBasicRepository6;
import com.spring.variation.dao.VariationBasicRepository7;
import com.spring.variation.dao.VariationBasicRepository8;
import com.spring.variation.dao.VariationBasicRepository9;
import com.spring.variation.dao.VariationBasicRepositoryx;
import com.spring.variation.dao.VariationDetailRepository1;
import com.spring.variation.dao.VariationDetailRepository10;
import com.spring.variation.dao.VariationDetailRepository11;
import com.spring.variation.dao.VariationDetailRepository12;
import com.spring.variation.dao.VariationDetailRepository13;
import com.spring.variation.dao.VariationDetailRepository14;
import com.spring.variation.dao.VariationDetailRepository15;
import com.spring.variation.dao.VariationDetailRepository16;
import com.spring.variation.dao.VariationDetailRepository17;
import com.spring.variation.dao.VariationDetailRepository18;
import com.spring.variation.dao.VariationDetailRepository19;
import com.spring.variation.dao.VariationDetailRepository2;
import com.spring.variation.dao.VariationDetailRepository20;
import com.spring.variation.dao.VariationDetailRepository21;
import com.spring.variation.dao.VariationDetailRepository22;
import com.spring.variation.dao.VariationDetailRepository3;
import com.spring.variation.dao.VariationDetailRepository4;
import com.spring.variation.dao.VariationDetailRepository5;
import com.spring.variation.dao.VariationDetailRepository6;
import com.spring.variation.dao.VariationDetailRepository7;
import com.spring.variation.dao.VariationDetailRepository8;
import com.spring.variation.dao.VariationDetailRepository9;
import com.spring.variation.dao.VariationDetailRepositorysv;
import com.spring.variation.dao.VariationDetailRepositoryx;
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

@Service("VariationService")
public class VariationServiceImpl implements VariationService {
	@Autowired
    private EmailCodeRepository EmailCodeRepository;
    @Autowired
    private VariationRepository variationRepository;
    @Autowired
    private GenomicRepository genomicRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private VariationBasicRepository1 variationBasicRepository1;
    @Autowired
    private VariationBasicRepository2 variationBasicRepository2;
    @Autowired
    private VariationBasicRepository3 variationBasicRepository3;
    @Autowired
    private VariationBasicRepository4 variationBasicRepository4;
    @Autowired
    private VariationBasicRepository5 variationBasicRepository5;
    @Autowired
    private VariationBasicRepository6 variationBasicRepository6;
    @Autowired
    private VariationBasicRepository7 variationBasicRepository7;
    @Autowired
    private VariationBasicRepository8 variationBasicRepository8;
    @Autowired
    private VariationBasicRepository9 variationBasicRepository9;
    @Autowired
    private VariationBasicRepository10 variationBasicRepository10;
    @Autowired
    private VariationBasicRepository11 variationBasicRepository11;
    @Autowired
    private VariationBasicRepository12 variationBasicRepository12;
    @Autowired
    private VariationBasicRepository13 variationBasicRepository13;
    @Autowired
    private VariationBasicRepository14 variationBasicRepository14;
    @Autowired
    private VariationBasicRepository15 variationBasicRepository15;
    @Autowired
    private VariationBasicRepository16 variationBasicRepository16;
    @Autowired
    private VariationBasicRepository17 variationBasicRepository17;
    @Autowired
    private VariationBasicRepository18 variationBasicRepository18;
    @Autowired
    private VariationBasicRepository19 variationBasicRepository19;
    @Autowired
    private VariationBasicRepository20 variationBasicRepository20;
    @Autowired
    private VariationBasicRepository21 variationBasicRepository21;
    @Autowired
    private VariationBasicRepository22 variationBasicRepository22;
    @Autowired
    private VariationBasicRepositoryx variationBasicRepositoryx;
    @Autowired
    private VariationDetailRepository1 variationDetailRepository1;
    @Autowired
    private VariationDetailRepository2 variationDetailRepository2;
    @Autowired
    private VariationDetailRepository3 variationDetailRepository3;
    @Autowired
    private VariationDetailRepository4 variationDetailRepository4;
    @Autowired
    private VariationDetailRepository5 variationDetailRepository5;
    @Autowired
    private VariationDetailRepository6 variationDetailRepository6;
    @Autowired
    private VariationDetailRepository7 variationDetailRepository7;
    @Autowired
    private VariationDetailRepository8 variationDetailRepository8;
    @Autowired
    private VariationDetailRepository9 variationDetailRepository9;
    @Autowired
    private VariationDetailRepository10 variationDetailRepository10;
    @Autowired
    private VariationDetailRepository11 variationDetailRepository11;
    @Autowired
    private VariationDetailRepository12 variationDetailRepository12;
    @Autowired
    private VariationDetailRepository13 variationDetailRepository13;
    @Autowired
    private VariationDetailRepository14 variationDetailRepository14;
    @Autowired
    private VariationDetailRepository15 variationDetailRepository15;
    @Autowired
    private VariationDetailRepository16 variationDetailRepository16;
    @Autowired
    private VariationDetailRepository17 variationDetailRepository17;
    @Autowired
    private VariationDetailRepository18 variationDetailRepository18;
    @Autowired
    private VariationDetailRepository19 variationDetailRepository19;
    @Autowired
    private VariationDetailRepository20 variationDetailRepository20;
    @Autowired
    private VariationDetailRepository21 variationDetailRepository21;
    @Autowired
    private VariationDetailRepository22 variationDetailRepository22;
    @Autowired
    private VariationDetailRepositoryx variationDetailRepositoryx;
    @Autowired
    private VariationDetailRepositorysv variationDetailRepositorysv;
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
    public List<VariationBasicChr1> geneDataVarition1(int start, int end, int chrom) {
		return variationBasicRepository1.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr2> geneDataVarition2(int start, int end, int chrom) {
		return variationBasicRepository2.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr3> geneDataVarition3(int start, int end, int chrom) {
		return variationBasicRepository3.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr4> geneDataVarition4(int start, int end, int chrom) {
		return variationBasicRepository4.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr5> geneDataVarition5(int start, int end, int chrom) {
		return variationBasicRepository5.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr6> geneDataVarition6(int start, int end, int chrom) {
		return variationBasicRepository6.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr7> geneDataVarition7(int start, int end, int chrom) {
		return variationBasicRepository7.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr8> geneDataVarition8(int start, int end, int chrom) {
		return variationBasicRepository8.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr9> geneDataVarition9(int start, int end, int chrom) {
		return variationBasicRepository9.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr10> geneDataVarition10(int start, int end, int chrom) {
		return variationBasicRepository10.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr11> geneDataVarition11(int start, int end, int chrom) {
		return variationBasicRepository11.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr12> geneDataVarition12(int start, int end, int chrom) {
		return variationBasicRepository12.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr13> geneDataVarition13(int start, int end, int chrom) {
		return variationBasicRepository13.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr14> geneDataVarition14(int start, int end, int chrom) {
		return variationBasicRepository14.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr15> geneDataVarition15(int start, int end, int chrom) {
		return variationBasicRepository15.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr16> geneDataVarition16(int start, int end, int chrom) {
		return variationBasicRepository16.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr17> geneDataVarition17(int start, int end, int chrom) {
		return variationBasicRepository17.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr18> geneDataVarition18(int start, int end, int chrom) {
		return variationBasicRepository18.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr19> geneDataVarition19(int start, int end, int chrom) {
		return variationBasicRepository19.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr20> geneDataVarition20(int start, int end, int chrom) {
		return variationBasicRepository20.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr21> geneDataVarition21(int start, int end, int chrom) {
		return variationBasicRepository21.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChr22> geneDataVarition22(int start, int end, int chrom) {
		return variationBasicRepository22.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    public List<VariationBasicChrx> geneDataVaritionx(int start, int end, String chrom) {
		return variationBasicRepositoryx.findAll((root, criteriaQuery, criteriaBuilder) -> {
	        List<Predicate> predicates = new ArrayList<Predicate>();
	        Predicate p1 = criteriaBuilder.equal(root.get("Chrom"),chrom);
	        Predicate p2 = criteriaBuilder.between(root.get("End"), start, end);
			predicates.add(criteriaBuilder.and(p1,p2));
	        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	    });
    }
    
    @Override
    public List<Genomic> geneListGenomic(int start, int end, int chrom) {
        return genomicRepository.findAll((root, criteriaQuery, criteriaBuilder) -> {
        	Predicate p1 = criteriaBuilder.like(root.get("chrom"),"NC%");
            Predicate p2 = null;
            if(chrom < 10) {
            	p2 = criteriaBuilder.like(root.get("chrom"),"%0"+chrom+".%");
            } else {
            	p2 = criteriaBuilder.like(root.get("chrom"),"%"+chrom+".%");
            }
    		Predicate p3 = criteriaBuilder.gt(root.get("start"),start);
            Predicate p4 = criteriaBuilder.lt(root.get("end"),end);
            criteriaQuery.where(criteriaBuilder.and(p1,p2,p3,p4));  
            criteriaQuery.orderBy(criteriaBuilder.asc(root.get("Id")));
            return criteriaQuery.getRestriction();
        });
    }
    
    @Override
    public List<VariationBasicChr1> variant1(String variantId,int chrom) {
        return variationBasicRepository1.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr2> variant2(String variantId,int chrom) {
        return variationBasicRepository2.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr3> variant3(String variantId,int chrom) {
        return variationBasicRepository3.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr4> variant4(String variantId,int chrom) {
        return variationBasicRepository4.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr5> variant5(String variantId,int chrom) {
        return variationBasicRepository5.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr6> variant6(String variantId,int chrom) {
        return variationBasicRepository6.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr7> variant7(String variantId,int chrom) {
        return variationBasicRepository7.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr8> variant8(String variantId,int chrom) {
        return variationBasicRepository8.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr9> variant9(String variantId,int chrom) {
        return variationBasicRepository9.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr10> variant10(String variantId,int chrom) {
        return variationBasicRepository10.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr11> variant11(String variantId,int chrom) {
        return variationBasicRepository11.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr12> variant12(String variantId,int chrom) {
        return variationBasicRepository12.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr13> variant13(String variantId,int chrom) {
        return variationBasicRepository13.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr14> variant14(String variantId,int chrom) {
        return variationBasicRepository14.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr15> variant15(String variantId,int chrom) {
        return variationBasicRepository15.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr16> variant16(String variantId,int chrom) {
        return variationBasicRepository16.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr17> variant17(String variantId,int chrom) {
        return variationBasicRepository17.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr18> variant18(String variantId,int chrom) {
        return variationBasicRepository18.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr19> variant19(String variantId,int chrom) {
        return variationBasicRepository19.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr20> variant20(String variantId,int chrom) {
        return variationBasicRepository20.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr21> variant21(String variantId,int chrom) {
        return variationBasicRepository21.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChr22> variant22(String variantId,int chrom) {
        return variationBasicRepository22.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    @Override
    public List<VariationBasicChrx> variant23(String variantId,String chrom) {
        return variationBasicRepositoryx.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    
    
    @Override
    public List<VariationDetailChr1> variantDetail1(String variantId,int chrom) {
		return variationDetailRepository1.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr2> variantDetail2(String variantId,int chrom) {
		return variationDetailRepository2.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr3> variantDetail3(String variantId,int chrom) {
		return variationDetailRepository3.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr4> variantDetail4(String variantId,int chrom) {
		return variationDetailRepository4.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr5> variantDetail5(String variantId,int chrom) {
		return variationDetailRepository5.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr6> variantDetail6(String variantId,int chrom) {
		return variationDetailRepository6.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr7> variantDetail7(String variantId,int chrom) {
		return variationDetailRepository7.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr8> variantDetail8(String variantId,int chrom) {
		return variationDetailRepository8.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr9> variantDetail9(String variantId,int chrom) {
		return variationDetailRepository9.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr10> variantDetail10(String variantId,int chrom) {
		return variationDetailRepository10.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr11> variantDetail11(String variantId,int chrom) {
		return variationDetailRepository11.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr12> variantDetail12(String variantId,int chrom) {
		return variationDetailRepository12.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr13> variantDetail13(String variantId,int chrom) {
		return variationDetailRepository13.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr14> variantDetail14(String variantId,int chrom) {
		return variationDetailRepository14.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr15> variantDetail15(String variantId,int chrom) {
		return variationDetailRepository15.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr16> variantDetail16(String variantId,int chrom) {
		return variationDetailRepository16.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr17> variantDetail17(String variantId,int chrom) {
		return variationDetailRepository17.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr18> variantDetail18(String variantId,int chrom) {
		return variationDetailRepository18.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr19> variantDetail19(String variantId,int chrom) {
		return variationDetailRepository19.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr20> variantDetail20(String variantId,int chrom) {
		return variationDetailRepository20.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr21> variantDetail21(String variantId,int chrom) {
		return variationDetailRepository21.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChr22> variantDetail22(String variantId,int chrom) {
		return variationDetailRepository22.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
    public List<VariationDetailChrx> variantDetailx(String variantId,String chrom) {
		return variationDetailRepositoryx.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
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
    
    @Override
    public List<Genomic> getRelateGene(String geneName) {
        return genomicRepository.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
    		Predicate p1 = criteriaBuilder.equal(root.get("gene"),geneName);
    		Predicate p2 = criteriaBuilder.equal(root.get("type"),"gene");
    		Predicate p3 = criteriaBuilder.equal(root.get("type"),"pseudogene");
    		predicates.add(criteriaBuilder.and(p1));
    		predicates.add(criteriaBuilder.or(p2,p3));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }

	@Override
	public List<Variation> variant(String variantId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<VariationDetailsv> variantDetailsv(String variantId) {
		return variationDetailRepositorysv.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("uu_id"),variantId);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
	
	@Override
	public void addEmailCode(EmailCode emailcode) {
		EmailCodeRepository.save(emailcode);
    }
	
	@Override
	public List<EmailCode> findEmailCode(String email) {
		return EmailCodeRepository.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            Predicate p1 = criteriaBuilder.equal(root.get("email"),email);
    		predicates.add(criteriaBuilder.and(p1));
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
        });
    }
}
