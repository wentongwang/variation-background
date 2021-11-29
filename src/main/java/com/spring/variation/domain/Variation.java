package com.spring.variation.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "variation")
public class Variation implements Serializable {
	
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
    @Column(name = "VCF_QUAL")
    private String VCF_QUAL;
    @Column(name = "ExAC_ALL")
    private String ExAC_ALL;
    @Column(name = "ExAC_AFR")
    private String ExAC_AFR;
    @Column(name = "ExAC_AMR")
    private String ExAC_AMR;
    @Column(name = "ExAC_EAS")
    private String ExAC_EAS;
    @Column(name = "ExAC_FIN")
    private String ExAC_FIN;
    @Column(name = "ExAC_NFE")
    private String ExAC_NFE;
    @Column(name = "ExAC_OTH")
    private String ExAC_OTH;
    @Column(name = "ExAC_SAS")
    private String ExAC_SAS;
    @Column(name = "gnomAD_exome_ALL")
    private String gnomAD_exome_ALL;
    @Column(name = "gnomAD_exome_AFR")
    private String gnomAD_exome_AFR;
    @Column(name = "gnomAD_exome_AMR")
    private String gnomAD_exome_AMR;
    @Column(name = "gnomAD_exome_ASJ")
    private String gnomAD_exome_ASJ;
    @Column(name = "gnomAD_exome_EAS")
    private String gnomAD_exome_EAS;
    @Column(name = "gnomAD_exome_FIN")
    private String gnomAD_exome_FIN;
    @Column(name = "gnomAD_exome_NFE")
    private String gnomAD_exome_NFE;
    @Column(name = "gnomAD_exome_OTH")
    private String gnomAD_exome_OTH;
    @Column(name = "gnomAD_exome_SAS")
    private String gnomAD_exome_SAS;
    @Column(name = "gnomAD_genome_ALL")
    private String gnomAD_genome_ALL;
    @Column(name = "gnomAD_genome_AFR")
    private String gnomAD_genome_AFR;
    @Column(name = "gnomAD_genome_AMR")
    private String gnomAD_genome_AMR;
    @Column(name = "gnomAD_genome_ASJ")
    private String gnomAD_genome_ASJ;
    @Column(name = "gnomAD_genome_EAS")
    private String gnomAD_genome_EAS;
    @Column(name = "gnomAD_genome_FIN")
    private String gnomAD_genome_FIN;
    @Column(name = "gnomAD_genome_NFE")
    private String gnomAD_genome_NFE;
    @Column(name = "gnomAD_genome_OTH")
    private String gnomAD_genome_OTH;
    @Column(name = "1000G_ALL")
    private String thousandG_ALL;
    @Column(name = "1000G_EUR")
    private String thousandG_EUR;
    @Column(name = "1000G_AFR")
    private String thousandG_AFR;
    @Column(name = "1000G_EAS")
    private String thousandG_EAS;
    @Column(name = "1000G_AMR")
    private String thousandG_AMR;
    @Column(name = "1000G_SAS")
    private String thousandG_SAS;
    @Column(name = "CLNALLELEID")
    private String CLNALLELEID;
    @Column(name = "CLNDN")
    private String CLNDN;
    @Column(name = "CLNDISDB")
    private String CLNDISDB;
    @Column(name = "CLNREVSTAT")
    private String CLNREVSTAT;
    @Column(name = "CLNSIG")
    private String CLNSIG;
    @Column(name = "GerpN")
    private String GerpN;
    @Column(name = "GerpS")
    private String GerpS;
    @Column(name = "CADD_Rwascore")
    private String CADD_RwaScore;
    @Column(name = "CADD_PHRED")
    private String CADD_PHRED;
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
    @Column(name = "AC")
    private String AC;
    @Column(name = "AF")
    private String AF;
    @Column(name = "AN")
    private String AN;
    @Column(name = "chn100k_ALL")
    private String chn100k_ALL;
    @Column(name = "chn100k_AFR")
    private String chn100k_AFR;
    @Column(name = "chn100k_AMR")
    private String chn100k_AMR;
    @Column(name = "chn100k_ASJ")
    private String chn100k_ASJ;
    @Column(name = "chn100k_EAS")
    private String chn100k_EAS;
    @Column(name = "chn100k_FIN")
    private String chn100k_FIN;
    @Column(name = "chn100k_NFE")
    private String chn100k_NFE;
    @Column(name = "chn100k_OTH")
    private String chn100k_OTH;
    @Column(name = "Polyphenval")
    private String PolyPhenVal;
    @Column(name = "SIFTval")
    private String SIFTval;
    @Column(name = "uu_id")
    private String uu_id;


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


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


	public String getVCF_QUAL() {
		return VCF_QUAL;
	}


	public void setVCF_QUAL(String vCF_QUAL) {
		VCF_QUAL = vCF_QUAL;
	}


	public String getExAC_ALL() {
		return ExAC_ALL;
	}


	public void setExAC_ALL(String exAC_ALL) {
		ExAC_ALL = exAC_ALL;
	}


	public String getExAC_AFR() {
		return ExAC_AFR;
	}


	public void setExAC_AFR(String exAC_AFR) {
		ExAC_AFR = exAC_AFR;
	}


	public String getExAC_AMR() {
		return ExAC_AMR;
	}


	public void setExAC_AMR(String exAC_AMR) {
		ExAC_AMR = exAC_AMR;
	}


	public String getExAC_EAS() {
		return ExAC_EAS;
	}


	public void setExAC_EAS(String exAC_EAS) {
		ExAC_EAS = exAC_EAS;
	}


	public String getExAC_FIN() {
		return ExAC_FIN;
	}


	public void setExAC_FIN(String exAC_FIN) {
		ExAC_FIN = exAC_FIN;
	}


	public String getExAC_NFE() {
		return ExAC_NFE;
	}


	public void setExAC_NFE(String exAC_NFE) {
		ExAC_NFE = exAC_NFE;
	}


	public String getExAC_OTH() {
		return ExAC_OTH;
	}


	public void setExAC_OTH(String exAC_OTH) {
		ExAC_OTH = exAC_OTH;
	}


	public String getExAC_SAS() {
		return ExAC_SAS;
	}


	public void setExAC_SAS(String exAC_SAS) {
		ExAC_SAS = exAC_SAS;
	}


	public String getGnomAD_exome_ALL() {
		return gnomAD_exome_ALL;
	}


	public void setGnomAD_exome_ALL(String gnomAD_exome_ALL) {
		this.gnomAD_exome_ALL = gnomAD_exome_ALL;
	}


	public String getGnomAD_exome_AFR() {
		return gnomAD_exome_AFR;
	}


	public void setGnomAD_exome_AFR(String gnomAD_exome_AFR) {
		this.gnomAD_exome_AFR = gnomAD_exome_AFR;
	}


	public String getGnomAD_exome_AMR() {
		return gnomAD_exome_AMR;
	}


	public void setGnomAD_exome_AMR(String gnomAD_exome_AMR) {
		this.gnomAD_exome_AMR = gnomAD_exome_AMR;
	}


	public String getGnomAD_exome_ASJ() {
		return gnomAD_exome_ASJ;
	}


	public void setGnomAD_exome_ASJ(String gnomAD_exome_ASJ) {
		this.gnomAD_exome_ASJ = gnomAD_exome_ASJ;
	}


	public String getGnomAD_exome_EAS() {
		return gnomAD_exome_EAS;
	}


	public void setGnomAD_exome_EAS(String gnomAD_exome_EAS) {
		this.gnomAD_exome_EAS = gnomAD_exome_EAS;
	}


	public String getGnomAD_exome_FIN() {
		return gnomAD_exome_FIN;
	}


	public void setGnomAD_exome_FIN(String gnomAD_exome_FIN) {
		this.gnomAD_exome_FIN = gnomAD_exome_FIN;
	}


	public String getGnomAD_exome_NFE() {
		return gnomAD_exome_NFE;
	}


	public void setGnomAD_exome_NFE(String gnomAD_exome_NFE) {
		this.gnomAD_exome_NFE = gnomAD_exome_NFE;
	}


	public String getGnomAD_exome_OTH() {
		return gnomAD_exome_OTH;
	}


	public void setGnomAD_exome_OTH(String gnomAD_exome_OTH) {
		this.gnomAD_exome_OTH = gnomAD_exome_OTH;
	}


	public String getGnomAD_exome_SAS() {
		return gnomAD_exome_SAS;
	}


	public void setGnomAD_exome_SAS(String gnomAD_exome_SAS) {
		this.gnomAD_exome_SAS = gnomAD_exome_SAS;
	}


	public String getGnomAD_genome_ALL() {
		return gnomAD_genome_ALL;
	}


	public void setGnomAD_genome_ALL(String gnomAD_genome_ALL) {
		this.gnomAD_genome_ALL = gnomAD_genome_ALL;
	}


	public String getGnomAD_genome_AFR() {
		return gnomAD_genome_AFR;
	}


	public void setGnomAD_genome_AFR(String gnomAD_genome_AFR) {
		this.gnomAD_genome_AFR = gnomAD_genome_AFR;
	}


	public String getGnomAD_genome_AMR() {
		return gnomAD_genome_AMR;
	}


	public void setGnomAD_genome_AMR(String gnomAD_genome_AMR) {
		this.gnomAD_genome_AMR = gnomAD_genome_AMR;
	}


	public String getGnomAD_genome_ASJ() {
		return gnomAD_genome_ASJ;
	}


	public void setGnomAD_genome_ASJ(String gnomAD_genome_ASJ) {
		this.gnomAD_genome_ASJ = gnomAD_genome_ASJ;
	}


	public String getGnomAD_genome_EAS() {
		return gnomAD_genome_EAS;
	}


	public void setGnomAD_genome_EAS(String gnomAD_genome_EAS) {
		this.gnomAD_genome_EAS = gnomAD_genome_EAS;
	}


	public String getGnomAD_genome_FIN() {
		return gnomAD_genome_FIN;
	}


	public void setGnomAD_genome_FIN(String gnomAD_genome_FIN) {
		this.gnomAD_genome_FIN = gnomAD_genome_FIN;
	}


	public String getGnomAD_genome_NFE() {
		return gnomAD_genome_NFE;
	}


	public void setGnomAD_genome_NFE(String gnomAD_genome_NFE) {
		this.gnomAD_genome_NFE = gnomAD_genome_NFE;
	}


	public String getGnomAD_genome_OTH() {
		return gnomAD_genome_OTH;
	}


	public void setGnomAD_genome_OTH(String gnomAD_genome_OTH) {
		this.gnomAD_genome_OTH = gnomAD_genome_OTH;
	}


	public String getThousandG_ALL() {
		return thousandG_ALL;
	}


	public void setThousandG_ALL(String thousandG_ALL) {
		this.thousandG_ALL = thousandG_ALL;
	}


	public String getThousandG_EUR() {
		return thousandG_EUR;
	}


	public void setThousandG_EUR(String thousandG_EUR) {
		this.thousandG_EUR = thousandG_EUR;
	}


	public String getThousandG_AFR() {
		return thousandG_AFR;
	}


	public void setThousandG_AFR(String thousandG_AFR) {
		this.thousandG_AFR = thousandG_AFR;
	}


	public String getThousandG_EAS() {
		return thousandG_EAS;
	}


	public void setThousandG_EAS(String thousandG_EAS) {
		this.thousandG_EAS = thousandG_EAS;
	}


	public String getThousandG_AMR() {
		return thousandG_AMR;
	}


	public void setThousandG_AMR(String thousandG_AMR) {
		this.thousandG_AMR = thousandG_AMR;
	}


	public String getThousandG_SAS() {
		return thousandG_SAS;
	}


	public void setThousandG_SAS(String thousandG_SAS) {
		this.thousandG_SAS = thousandG_SAS;
	}


	public String getCLNALLELEID() {
		return CLNALLELEID;
	}


	public void setCLNALLELEID(String cLNALLELEID) {
		CLNALLELEID = cLNALLELEID;
	}


	public String getCLNDN() {
		return CLNDN;
	}


	public void setCLNDN(String cLNDN) {
		CLNDN = cLNDN;
	}


	public String getCLNDISDB() {
		return CLNDISDB;
	}


	public void setCLNDISDB(String cLNDISDB) {
		CLNDISDB = cLNDISDB;
	}


	public String getCLNREVSTAT() {
		return CLNREVSTAT;
	}


	public void setCLNREVSTAT(String cLNREVSTAT) {
		CLNREVSTAT = cLNREVSTAT;
	}


	public String getCLNSIG() {
		return CLNSIG;
	}


	public void setCLNSIG(String cLNSIG) {
		CLNSIG = cLNSIG;
	}


	public String getGerpN() {
		return GerpN;
	}


	public void setGerpN(String gerpN) {
		GerpN = gerpN;
	}


	public String getGerpS() {
		return GerpS;
	}


	public void setGerpS(String gerpS) {
		GerpS = gerpS;
	}


	public String getCADD_RwaScore() {
		return CADD_RwaScore;
	}


	public void setCADD_RwaScore(String cADD_RwaScore) {
		CADD_RwaScore = cADD_RwaScore;
	}


	public String getCADD_PHRED() {
		return CADD_PHRED;
	}


	public void setCADD_PHRED(String cADD_PHRED) {
		CADD_PHRED = cADD_PHRED;
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


	public String getAC() {
		return AC;
	}


	public void setAC(String aC) {
		AC = aC;
	}


	public String getAF() {
		return AF;
	}


	public void setAF(String aF) {
		AF = aF;
	}


	public String getAN() {
		return AN;
	}


	public void setAN(String aN) {
		AN = aN;
	}


	public String getChn100k_ALL() {
		return chn100k_ALL;
	}


	public void setChn100k_ALL(String chn100k_ALL) {
		this.chn100k_ALL = chn100k_ALL;
	}


	public String getChn100k_AFR() {
		return chn100k_AFR;
	}


	public void setChn100k_AFR(String chn100k_AFR) {
		this.chn100k_AFR = chn100k_AFR;
	}


	public String getChn100k_AMR() {
		return chn100k_AMR;
	}


	public void setChn100k_AMR(String chn100k_AMR) {
		this.chn100k_AMR = chn100k_AMR;
	}


	public String getChn100k_ASJ() {
		return chn100k_ASJ;
	}


	public void setChn100k_ASJ(String chn100k_ASJ) {
		this.chn100k_ASJ = chn100k_ASJ;
	}


	public String getChn100k_EAS() {
		return chn100k_EAS;
	}


	public void setChn100k_EAS(String chn100k_EAS) {
		this.chn100k_EAS = chn100k_EAS;
	}


	public String getChn100k_FIN() {
		return chn100k_FIN;
	}


	public void setChn100k_FIN(String chn100k_FIN) {
		this.chn100k_FIN = chn100k_FIN;
	}


	public String getChn100k_NFE() {
		return chn100k_NFE;
	}


	public void setChn100k_NFE(String chn100k_NFE) {
		this.chn100k_NFE = chn100k_NFE;
	}


	public String getChn100k_OTH() {
		return chn100k_OTH;
	}


	public void setChn100k_OTH(String chn100k_OTH) {
		this.chn100k_OTH = chn100k_OTH;
	}


	public String getPolyPhenVal() {
		return PolyPhenVal;
	}


	public void setPolyPhenVal(String polyPhenVal) {
		PolyPhenVal = polyPhenVal;
	}


	public String getSIFTval() {
		return SIFTval;
	}


	public void setSIFTval(String sIFTval) {
		SIFTval = sIFTval;
	}


	public String getUu_id() {
		return uu_id;
	}


	public void setUu_id(String uu_id) {
		this.uu_id = uu_id;
	}


	@Override
	public String toString() {
		return "Variation [Id=" + Id + ", Chrom=" + Chrom + ", Start=" + Start + ", End=" + End + ", Ref=" + Ref
				+ ", Alt=" + Alt + ", VCF_CHROM=" + VCF_CHROM + ", VCF_POS=" + VCF_POS + ", VCF_REF=" + VCF_REF
				+ ", VCF_ALT=" + VCF_ALT + ", VCF_QUAL=" + VCF_QUAL + ", ExAC_ALL=" + ExAC_ALL + ", ExAC_AFR="
				+ ExAC_AFR + ", ExAC_AMR=" + ExAC_AMR + ", ExAC_EAS=" + ExAC_EAS + ", ExAC_FIN=" + ExAC_FIN
				+ ", ExAC_NFE=" + ExAC_NFE + ", ExAC_OTH=" + ExAC_OTH + ", ExAC_SAS=" + ExAC_SAS + ", gnomAD_exome_ALL="
				+ gnomAD_exome_ALL + ", gnomAD_exome_AFR=" + gnomAD_exome_AFR + ", gnomAD_exome_AMR=" + gnomAD_exome_AMR
				+ ", gnomAD_exome_ASJ=" + gnomAD_exome_ASJ + ", gnomAD_exome_EAS=" + gnomAD_exome_EAS
				+ ", gnomAD_exome_FIN=" + gnomAD_exome_FIN + ", gnomAD_exome_NFE=" + gnomAD_exome_NFE
				+ ", gnomAD_exome_OTH=" + gnomAD_exome_OTH + ", gnomAD_exome_SAS=" + gnomAD_exome_SAS
				+ ", gnomAD_genome_ALL=" + gnomAD_genome_ALL + ", gnomAD_genome_AFR=" + gnomAD_genome_AFR
				+ ", gnomAD_genome_AMR=" + gnomAD_genome_AMR + ", gnomAD_genome_ASJ=" + gnomAD_genome_ASJ
				+ ", gnomAD_genome_EAS=" + gnomAD_genome_EAS + ", gnomAD_genome_FIN=" + gnomAD_genome_FIN
				+ ", gnomAD_genome_NFE=" + gnomAD_genome_NFE + ", gnomAD_genome_OTH=" + gnomAD_genome_OTH
				+ ", thousandG_ALL=" + thousandG_ALL + ", thousandG_EUR=" + thousandG_EUR + ", thousandG_AFR="
				+ thousandG_AFR + ", thousandG_EAS=" + thousandG_EAS + ", thousandG_AMR=" + thousandG_AMR
				+ ", thousandG_SAS=" + thousandG_SAS + ", CLNALLELEID=" + CLNALLELEID + ", CLNDN=" + CLNDN
				+ ", CLNDISDB=" + CLNDISDB + ", CLNREVSTAT=" + CLNREVSTAT + ", CLNSIG=" + CLNSIG + ", GerpN=" + GerpN
				+ ", GerpS=" + GerpS + ", CADD_RwaScore=" + CADD_RwaScore + ", CADD_PHRED=" + CADD_PHRED + ", RSID="
				+ RSID + ", Func=" + Func + ", Gene=" + Gene + ", GeneDetail=" + GeneDetail + ", ExonicFunc="
				+ ExonicFunc + ", AAChange=" + AAChange + ", variation_type=" + variation_type + ", AC=" + AC + ", AF="
				+ AF + ", AN=" + AN + ", chn100k_ALL=" + chn100k_ALL + ", chn100k_AFR=" + chn100k_AFR + ", chn100k_AMR="
				+ chn100k_AMR + ", chn100k_ASJ=" + chn100k_ASJ + ", chn100k_EAS=" + chn100k_EAS + ", chn100k_FIN="
				+ chn100k_FIN + ", chn100k_NFE=" + chn100k_NFE + ", chn100k_OTH=" + chn100k_OTH + ", PolyPhenVal="
				+ PolyPhenVal + ", SIFTval=" + SIFTval + ", uu_id=" + uu_id + "]";
	}

	


}