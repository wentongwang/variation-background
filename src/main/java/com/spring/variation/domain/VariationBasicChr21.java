package com.spring.variation.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "variation_basic_chr21")
public class VariationBasicChr21 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue
    private int Id;
    @Column(name = "Chrom")
    private String Chrom;
    @Column(name = "Start")
    private int Start;
    @Column(name = "End")
    private int End;
    @Column(name = "Ref")
    private String Ref;
    @Column(name = "Alt")
    private String Alt;
    @Column(name = "VCF_CHROM")
    private String VCF_CHROM;
    @Column(name = "VCF_POS")
    private String VCF_POS;
    @Column(name = "VCF_REF")
    private String VCF_REF;
    @Column(name = "VCF_ALT")
    private String VCF_ALT;
    @Column(name = "RSID")
    private String RSID;
    @Column(name = "Func")
    private String Func;
    @Column(name = "Gene")
    private String Gene;
    @Column(name = "Genedetail")
    private String GeneDetail;
    @Column(name = "Exonicfunc")
    private String ExonicFunc;
    @Column(name = "AAChange")
    private String AAChange;
    @Column(name = "variation_type")
    private String variation_type;
    @Column(name = "AF")
    private String AF;
    @Column(name = "chn100k_ALL")
    private String chn100k_ALL;
    @Column(name = "uu_id")
    private String uu_id;
    @Column(name = "chn100k_NE")
    private String chn100k_NE;
    @Column(name = "chn100k_N")
    private String chn100k_N;
    @Column(name = "chn100k_E")
    private String chn100k_E;
    @Column(name = "chn100k_C")
    private String chn100k_C;
    @Column(name = "chn100k_NW")
    private String chn100k_NW;
    @Column(name = "chn100k_SW")
    private String chn100k_SW;
    @Column(name = "chn100k_S")
    private String chn100k_S;
    
	

	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public String getChrom() {
		return Chrom;
	}



	public void setChrom(String chrom) {
		Chrom = chrom;
	}



	public int getStart() {
		return Start;
	}



	public void setStart(int start) {
		Start = start;
	}



	public int getEnd() {
		return End;
	}



	public void setEnd(int end) {
		End = end;
	}



	public String getRef() {
		return Ref;
	}



	public void setRef(String ref) {
		Ref = ref;
	}



	public String getAlt() {
		return Alt;
	}



	public void setAlt(String alt) {
		Alt = alt;
	}



	public String getVCF_CHROM() {
		return VCF_CHROM;
	}



	public void setVCF_CHROM(String vCF_CHROM) {
		VCF_CHROM = vCF_CHROM;
	}



	public String getVCF_POS() {
		return VCF_POS;
	}



	public void setVCF_POS(String vCF_POS) {
		VCF_POS = vCF_POS;
	}



	public String getVCF_REF() {
		return VCF_REF;
	}



	public void setVCF_REF(String vCF_REF) {
		VCF_REF = vCF_REF;
	}



	public String getVCF_ALT() {
		return VCF_ALT;
	}



	public void setVCF_ALT(String vCF_ALT) {
		VCF_ALT = vCF_ALT;
	}



	public String getRSID() {
		return RSID;
	}



	public void setRSID(String rSID) {
		RSID = rSID;
	}



	public String getFunc() {
		return Func;
	}



	public void setFunc(String func) {
		Func = func;
	}



	public String getGene() {
		return Gene;
	}



	public void setGene(String gene) {
		Gene = gene;
	}



	public String getGeneDetail() {
		return GeneDetail;
	}



	public void setGeneDetail(String geneDetail) {
		GeneDetail = geneDetail;
	}



	public String getExonicFunc() {
		return ExonicFunc;
	}



	public void setExonicFunc(String exonicFunc) {
		ExonicFunc = exonicFunc;
	}



	public String getAAChange() {
		return AAChange;
	}



	public void setAAChange(String aAChange) {
		AAChange = aAChange;
	}



	public String getVariation_type() {
		return variation_type;
	}



	public void setVariation_type(String variation_type) {
		this.variation_type = variation_type;
	}



	public String getAF() {
		return AF;
	}



	public void setAF(String aF) {
		AF = aF;
	}



	public String getChn100k_ALL() {
		return chn100k_ALL;
	}



	public void setChn100k_ALL(String chn100k_ALL) {
		this.chn100k_ALL = chn100k_ALL;
	}



	public String getUu_id() {
		return uu_id;
	}



	public void setUu_id(String uu_id) {
		this.uu_id = uu_id;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public String getChn100k_NE() {
		return chn100k_NE;
	}



	public void setChn100k_NE(String chn100k_NE) {
		this.chn100k_NE = chn100k_NE;
	}



	public String getChn100k_N() {
		return chn100k_N;
	}



	public void setChn100k_N(String chn100k_N) {
		this.chn100k_N = chn100k_N;
	}



	public String getChn100k_E() {
		return chn100k_E;
	}



	public void setChn100k_E(String chn100k_E) {
		this.chn100k_E = chn100k_E;
	}



	public String getChn100k_C() {
		return chn100k_C;
	}



	public void setChn100k_C(String chn100k_C) {
		this.chn100k_C = chn100k_C;
	}



	public String getChn100k_NW() {
		return chn100k_NW;
	}



	public void setChn100k_NW(String chn100k_NW) {
		this.chn100k_NW = chn100k_NW;
	}



	public String getChn100k_SW() {
		return chn100k_SW;
	}



	public void setChn100k_SW(String chn100k_SW) {
		this.chn100k_SW = chn100k_SW;
	}



	public String getChn100k_S() {
		return chn100k_S;
	}



	public void setChn100k_S(String chn100k_S) {
		this.chn100k_S = chn100k_S;
	}




	@Override
	public String toString() {
		return "VariationBasic [Id=" + Id + ", Chrom=" + Chrom + ", Start=" + Start + ", End=" + End + ", Ref="
				+ Ref + ", Alt=" + Alt + ", VCF_CHROM=" + VCF_CHROM + ", VCF_POS=" + VCF_POS + ", VCF_REF=" + VCF_REF
				+ ", VCF_ALT=" + VCF_ALT + ", RSID=" + RSID + ", Func=" + Func + ", Gene=" + Gene + ", GeneDetail="
				+ GeneDetail + ", ExonicFunc=" + ExonicFunc + ", AAChange=" + AAChange + ", variation_type="
				+ variation_type + ", AF=" + AF + ", chn100k_ALL=" + chn100k_ALL + ", uu_id=" + uu_id + ", chn100k_NE="
				+ chn100k_NE + ", chn100k_N=" + chn100k_N + ", chn100k_E=" + chn100k_E + ", chn100k_C=" + chn100k_C
				+ ", chn100k_NW=" + chn100k_NW + ", chn100k_SW=" + chn100k_SW + ", chn100k_S=" + chn100k_S + "]";
	}



	public VariationBasicChr21() {
        super();
    }
    
}
