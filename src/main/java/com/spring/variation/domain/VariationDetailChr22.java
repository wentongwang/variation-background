package com.spring.variation.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "variation_detail_chr22")
public class VariationDetailChr22 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue
    private int Id;
	@Column(name = "chn100k_ALL")
    private String chn100k_ALL;
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
    @Column(name = "CHN100K")
    private String CHN100K;
    @Column(name = "variation_position")
    private String variation_position;
    @Column(name = "dbSNPRsID")
    private String dbSNPRsID;
    @Column(name = "variation_type")
    private String variation_type;
    @Column(name = "HGVS")
    private String HGVS;
    @Column(name = "variation_details")
    private String variation_details;
    @Column(name = "related_gene")
    private String related_gene;
    @Column(name = "variation_effect")
    private String variation_effect;
    @Column(name = "SIFT")
    private String SIFT;
    @Column(name = "PolyPhen")
    private String PolyPhen;
    @Column(name = "GERP")
    private String GERP;
    @Column(name = "CADD")
    private String CADD;
    @Column(name = "VertebratePhastCons")
    private String VertebratePhastCons;
    @Column(name = "VertebratePhyloP")
    private String VertebratePhyloP;
    @Column(name = "MammalsPhastCons")
    private String MammalsPhastCons;
    @Column(name = "MammalsPhyloP")
    private String MammalsPhyloP;
    @Column(name = "PrimatesPhastCons")
    private String PrimatesPhastCons;
    @Column(name = "PrimatesPhyloP")
    private String PrimatesPhyloP;
    @Column(name = "GCContent")
    private String GCContent;
    @Column(name = "CpGRatio")
    private String CpGRatio;
    @Column(name = "RepeatMasker")
    private String RepeatMasker;
    @Column(name = "Ti_Tv")
    private String Ti_Tv;
    @Column(name = "ClinVarID")
    private String ClinVarID;
    @Column(name = "OMIMID")
    private String OMIMID;
    @Column(name = "ClinVar")
    private String ClinVar;
    @Column(name = "DiseaseName")
    private String DiseaseName;
    @Column(name = "GWASCatalog")
    private String GWASCatalog;
    @Column(name = "GRASP2")
    private String GRASP2;
    @Column(name = "COSMIC")
    private String COSMIC;
    @Column(name = "TFBS")
    private String TFBS;
    @Column(name = "TargetScan")
    private String TargetScan;
    @Column(name = "CAGEPromoters")
    private String CAGEPromoters;
    @Column(name = "CAGEEnhancers")
    private String CAGEEnhancers;
    @Column(name = "H3K27me3")
    private String H3K27me3;
    @Column(name = "H3K9me3")
    private String H3K9me3;
    @Column(name = "H3K27Ac")
    private String H3K27Ac;
    @Column(name = "H3K4Me1")
    private String H3K4Me1;
    @Column(name = "H3K4Me3")
    private String H3K4Me3;
    @Column(name = "DNase")
    private String DNase;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getChn100k_ALL() {
		return chn100k_ALL;
	}


	public void setChn100k_ALL(String chn100k_ALL) {
		this.chn100k_ALL = chn100k_ALL;
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


	public String getCHN100K() {
		return CHN100K;
	}


	public void setCHN100K(String cHN100K) {
		CHN100K = cHN100K;
	}


	public String getVariation_position() {
		return variation_position;
	}


	public void setVariation_position(String variation_position) {
		this.variation_position = variation_position;
	}


	public String getDbSNPRsID() {
		return dbSNPRsID;
	}


	public void setDbSNPRsID(String dbSNPRsID) {
		this.dbSNPRsID = dbSNPRsID;
	}


	public String getVariation_type() {
		return variation_type;
	}


	public void setVariation_type(String variation_type) {
		this.variation_type = variation_type;
	}


	public String getHGVS() {
		return HGVS;
	}


	public void setHGVS(String hGVS) {
		HGVS = hGVS;
	}


	public String getVariation_details() {
		return variation_details;
	}


	public void setVariation_details(String variation_details) {
		this.variation_details = variation_details;
	}


	public String getRelated_gene() {
		return related_gene;
	}


	public void setRelated_gene(String related_gene) {
		this.related_gene = related_gene;
	}


	public String getVariation_effect() {
		return variation_effect;
	}


	public void setVariation_effect(String variation_effect) {
		this.variation_effect = variation_effect;
	}


	public String getSIFT() {
		return SIFT;
	}


	public void setSIFT(String sIFT) {
		SIFT = sIFT;
	}


	public String getPolyPhen() {
		return PolyPhen;
	}


	public void setPolyPhen(String polyPhen) {
		PolyPhen = polyPhen;
	}


	public String getGERP() {
		return GERP;
	}


	public void setGERP(String gERP) {
		GERP = gERP;
	}


	public String getCADD() {
		return CADD;
	}


	public void setCADD(String cADD) {
		CADD = cADD;
	}


	public String getVertebratePhastCons() {
		return VertebratePhastCons;
	}


	public void setVertebratePhastCons(String vertebratePhastCons) {
		VertebratePhastCons = vertebratePhastCons;
	}


	public String getVertebratePhyloP() {
		return VertebratePhyloP;
	}


	public void setVertebratePhyloP(String vertebratePhyloP) {
		VertebratePhyloP = vertebratePhyloP;
	}


	public String getMammalsPhastCons() {
		return MammalsPhastCons;
	}


	public void setMammalsPhastCons(String mammalsPhastCons) {
		MammalsPhastCons = mammalsPhastCons;
	}


	public String getMammalsPhyloP() {
		return MammalsPhyloP;
	}


	public void setMammalsPhyloP(String mammalsPhyloP) {
		MammalsPhyloP = mammalsPhyloP;
	}


	public String getPrimatesPhastCons() {
		return PrimatesPhastCons;
	}


	public void setPrimatesPhastCons(String primatesPhastCons) {
		PrimatesPhastCons = primatesPhastCons;
	}


	public String getPrimatesPhyloP() {
		return PrimatesPhyloP;
	}


	public void setPrimatesPhyloP(String primatesPhyloP) {
		PrimatesPhyloP = primatesPhyloP;
	}


	public String getGCContent() {
		return GCContent;
	}


	public void setGCContent(String gCContent) {
		GCContent = gCContent;
	}


	public String getCpGRatio() {
		return CpGRatio;
	}


	public void setCpGRatio(String cpGRatio) {
		CpGRatio = cpGRatio;
	}


	public String getRepeatMasker() {
		return RepeatMasker;
	}


	public void setRepeatMasker(String repeatMasker) {
		RepeatMasker = repeatMasker;
	}


	public String getTi_Tv() {
		return Ti_Tv;
	}


	public void setTi_Tv(String ti_Tv) {
		Ti_Tv = ti_Tv;
	}


	public String getClinVarID() {
		return ClinVarID;
	}


	public void setClinVarID(String clinVarID) {
		ClinVarID = clinVarID;
	}


	public String getOMIMID() {
		return OMIMID;
	}


	public void setOMIMID(String oMIMID) {
		OMIMID = oMIMID;
	}


	public String getClinVar() {
		return ClinVar;
	}


	public void setClinVar(String clinVar) {
		ClinVar = clinVar;
	}


	public String getDiseaseName() {
		return DiseaseName;
	}


	public void setDiseaseName(String diseaseName) {
		DiseaseName = diseaseName;
	}


	public String getGWASCatalog() {
		return GWASCatalog;
	}


	public void setGWASCatalog(String gWASCatalog) {
		GWASCatalog = gWASCatalog;
	}


	public String getGRASP2() {
		return GRASP2;
	}


	public void setGRASP2(String gRASP2) {
		GRASP2 = gRASP2;
	}


	public String getCOSMIC() {
		return COSMIC;
	}


	public void setCOSMIC(String cOSMIC) {
		COSMIC = cOSMIC;
	}


	public String getTFBS() {
		return TFBS;
	}


	public void setTFBS(String tFBS) {
		TFBS = tFBS;
	}


	public String getTargetScan() {
		return TargetScan;
	}


	public void setTargetScan(String targetScan) {
		TargetScan = targetScan;
	}


	public String getCAGEPromoters() {
		return CAGEPromoters;
	}


	public void setCAGEPromoters(String cAGEPromoters) {
		CAGEPromoters = cAGEPromoters;
	}


	public String getCAGEEnhancers() {
		return CAGEEnhancers;
	}


	public void setCAGEEnhancers(String cAGEEnhancers) {
		CAGEEnhancers = cAGEEnhancers;
	}


	public String getH3K27me3() {
		return H3K27me3;
	}


	public void setH3K27me3(String h3k27me3) {
		H3K27me3 = h3k27me3;
	}


	public String getH3K9me3() {
		return H3K9me3;
	}


	public void setH3K9me3(String h3k9me3) {
		H3K9me3 = h3k9me3;
	}


	public String getH3K27Ac() {
		return H3K27Ac;
	}


	public void setH3K27Ac(String h3k27Ac) {
		H3K27Ac = h3k27Ac;
	}


	public String getH3K4Me1() {
		return H3K4Me1;
	}


	public void setH3K4Me1(String h3k4Me1) {
		H3K4Me1 = h3k4Me1;
	}


	public String getH3K4Me3() {
		return H3K4Me3;
	}


	public void setH3K4Me3(String h3k4Me3) {
		H3K4Me3 = h3k4Me3;
	}


	public String getDNase() {
		return DNase;
	}


	public void setDNase(String dNase) {
		DNase = dNase;
	}


	public String getPolII() {
		return PolII;
	}


	public void setPolII(String polII) {
		PolII = polII;
	}


	public String getCTCF() {
		return CTCF;
	}


	public void setCTCF(String cTCF) {
		CTCF = cTCF;
	}


	public String getUu_id() {
		return uu_id;
	}


	public void setUu_id(String uu_id) {
		this.uu_id = uu_id;
	}


	@Column(name = "PolII")
    private String PolII;
    @Column(name = "CTCF")
    private String CTCF;
    @Column(name = "uu_id")
    private String uu_id;
	@Override
	public String toString() {
		return "VariationDetail [Id=" + Id + ", chn100k_ALL=" + chn100k_ALL + ", chn100k_NE=" + chn100k_NE
				+ ", chn100k_N=" + chn100k_N + ", chn100k_E=" + chn100k_E + ", chn100k_C=" + chn100k_C + ", chn100k_NW="
				+ chn100k_NW + ", chn100k_SW=" + chn100k_SW + ", chn100k_S=" + chn100k_S + ", ExAC_ALL=" + ExAC_ALL
				+ ", ExAC_AFR=" + ExAC_AFR + ", ExAC_AMR=" + ExAC_AMR + ", ExAC_EAS=" + ExAC_EAS + ", ExAC_FIN="
				+ ExAC_FIN + ", ExAC_NFE=" + ExAC_NFE + ", ExAC_OTH=" + ExAC_OTH + ", ExAC_SAS=" + ExAC_SAS
				+ ", gnomAD_exome_ALL=" + gnomAD_exome_ALL + ", gnomAD_exome_AFR=" + gnomAD_exome_AFR
				+ ", gnomAD_exome_AMR=" + gnomAD_exome_AMR + ", gnomAD_exome_ASJ=" + gnomAD_exome_ASJ
				+ ", gnomAD_exome_EAS=" + gnomAD_exome_EAS + ", gnomAD_exome_FIN=" + gnomAD_exome_FIN
				+ ", gnomAD_exome_NFE=" + gnomAD_exome_NFE + ", gnomAD_exome_OTH=" + gnomAD_exome_OTH
				+ ", gnomAD_exome_SAS=" + gnomAD_exome_SAS + ", gnomAD_genome_ALL=" + gnomAD_genome_ALL
				+ ", gnomAD_genome_AFR=" + gnomAD_genome_AFR + ", gnomAD_genome_AMR=" + gnomAD_genome_AMR
				+ ", gnomAD_genome_ASJ=" + gnomAD_genome_ASJ + ", gnomAD_genome_EAS=" + gnomAD_genome_EAS
				+ ", gnomAD_genome_FIN=" + gnomAD_genome_FIN + ", gnomAD_genome_NFE=" + gnomAD_genome_NFE
				+ ", gnomAD_genome_OTH=" + gnomAD_genome_OTH + ", thousandG_ALL=" + thousandG_ALL + ", thousandG_EUR="
				+ thousandG_EUR + ", thousandG_AFR=" + thousandG_AFR + ", thousandG_EAS=" + thousandG_EAS
				+ ", thousandG_AMR=" + thousandG_AMR + ", thousandG_SAS=" + thousandG_SAS + ", CHN100K=" + CHN100K
				+ ", variation_position=" + variation_position + ", dbSNPRsID=" + dbSNPRsID + ", variation_type="
				+ variation_type + ", HGVS=" + HGVS + ", variation_details=" + variation_details + ", related_gene="
				+ related_gene + ", variation_effect=" + variation_effect + ", SIFT=" + SIFT + ", PolyPhen=" + PolyPhen
				+ ", GERP=" + GERP + ", CADD=" + CADD + ", VertebratePhastCons=" + VertebratePhastCons
				+ ", VertebratePhyloP=" + VertebratePhyloP + ", MammalsPhastCons=" + MammalsPhastCons
				+ ", MammalsPhyloP=" + MammalsPhyloP + ", PrimatesPhastCons=" + PrimatesPhastCons + ", PrimatesPhyloP="
				+ PrimatesPhyloP + ", GCContent=" + GCContent + ", CpGRatio=" + CpGRatio + ", RepeatMasker="
				+ RepeatMasker + ", Ti_Tv=" + Ti_Tv + ", ClinVarID=" + ClinVarID + ", OMIMID=" + OMIMID + ", ClinVar="
				+ ClinVar + ", DiseaseName=" + DiseaseName + ", GWASCatalog=" + GWASCatalog + ", GRASP2=" + GRASP2
				+ ", COSMIC=" + COSMIC + ", TFBS=" + TFBS + ", TargetScan=" + TargetScan + ", CAGEPromoters="
				+ CAGEPromoters + ", CAGEEnhancers=" + CAGEEnhancers + ", H3K27me3=" + H3K27me3 + ", H3K9me3=" + H3K9me3
				+ ", H3K27Ac=" + H3K27Ac + ", H3K4Me1=" + H3K4Me1 + ", H3K4Me3=" + H3K4Me3 + ", DNase=" + DNase
				+ ", PolII=" + PolII + ", CTCF=" + CTCF + ", uu_id=" + uu_id + "]";
	}
    


}