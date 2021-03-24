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
    private int Chrom;
    @Column(name = "Start")
    private int Start;
    @Column(name = "End")
    private int End;
    @Column(name = "Ref")
    private String Ref;
    @Column(name = "Alt")
    private String Alt;
    @Column(name = "100_k")
    private String billion;
    @Column(name = "RsID")
    private String RsID;
    @Column(name = "variation_type")
    private String variation_type;
    @Column(name = "RefSeq_genes")
    private String RefSeq_genes;
    @Column(name = "Exonic_function")
    private String Exonic_function;
    @Column(name = "Clinvar_id")
    private String Clinvar_id;
    @Column(name = "Disease_name_id")
    private String Disease_name_id;
    @Column(name = "Significance")
    private String Significance;
    @Column(name = "OMIM_ID")
    private String OMIM_ID;
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
    public String getThousandG_AMR() {
		return thousandG_AMR;
	}


	public void setThousandG_AMR(String thousandG_AMR) {
		this.thousandG_AMR = thousandG_AMR;
	}


	@Column(name = "1000G_SAS")
    private String thousandG_SAS;
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
    @Column(name = "SIFT")
    private String SIFT;
    @Column(name = "PolyPhenVal")
    private String PolyPhenVal;
    @Column(name = "GERP")
    private String GERP;
    @Column(name = "CADD")
    private String CADD;
    @Column(name = "uu_id")
    private String uuId;
    
    public Variation() {
        super();
    }


	public int getId() {
		return Id;
	}





	public void setId(int id) {
		Id = id;
	}





	public int getChrom() {
		return Chrom;
	}





	public void setChrom(int chrom) {
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





	public String getBillion() {
		return billion;
	}





	public void setBillion(String billion) {
		this.billion = billion;
	}





	public String getRsID() {
		return RsID;
	}





	public void setRsID(String rsID) {
		RsID = rsID;
	}





	public String getVariation_type() {
		return variation_type;
	}





	public void setVariation_type(String variation_type) {
		this.variation_type = variation_type;
	}





	public String getRefSeq_genes() {
		return RefSeq_genes;
	}





	public void setRefSeq_genes(String refSeq_genes) {
		RefSeq_genes = refSeq_genes;
	}





	public String getExonic_function() {
		return Exonic_function;
	}





	public void setExonic_function(String exonic_function) {
		Exonic_function = exonic_function;
	}





	public String getClinvar_id() {
		return Clinvar_id;
	}





	public void setClinvar_id(String clinvar_id) {
		Clinvar_id = clinvar_id;
	}





	public String getDisease_name_id() {
		return Disease_name_id;
	}





	public void setDisease_name_id(String disease_name_id) {
		Disease_name_id = disease_name_id;
	}





	public String getSignificance() {
		return Significance;
	}





	public void setSignificance(String significance) {
		Significance = significance;
	}





	public String getOMIM_ID() {
		return OMIM_ID;
	}





	public void setOMIM_ID(String oMIM_ID) {
		OMIM_ID = oMIM_ID;
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





	public String getThousandG_SAS() {
		return thousandG_SAS;
	}





	public void setThousandG_SAS(String thousandG_SAS) {
		this.thousandG_SAS = thousandG_SAS;
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





	public String getSIFT() {
		return SIFT;
	}





	public void setSIFT(String sIFT) {
		SIFT = sIFT;
	}





	public String getPolyPhenVal() {
		return PolyPhenVal;
	}





	public void setPolyPhenVal(String polyPhenVal) {
		PolyPhenVal = polyPhenVal;
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





	public String getUuId() {
		return uuId;
	}





	public void setUuId(String uuId) {
		this.uuId = uuId;
	}





	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Variation [Id=" + Id + ", Chrom=" + Chrom + ", Start=" + Start + ", End=" + End + ", Ref=" + Ref
				+ ", Alt=" + Alt + ", billion=" + billion + ", RsID=" + RsID + ", variation_type=" + variation_type
				+ ", RefSeq_genes=" + RefSeq_genes + ", Exonic_function=" + Exonic_function + ", Clinvar_id="
				+ Clinvar_id + ", Disease_name_id=" + Disease_name_id + ", Significance=" + Significance + ", OMIM_ID="
				+ OMIM_ID + ", gnomAD_exome_ALL=" + gnomAD_exome_ALL + ", gnomAD_exome_AFR=" + gnomAD_exome_AFR
				+ ", gnomAD_exome_AMR=" + gnomAD_exome_AMR + ", gnomAD_exome_ASJ=" + gnomAD_exome_ASJ
				+ ", gnomAD_exome_EAS=" + gnomAD_exome_EAS + ", gnomAD_exome_FIN=" + gnomAD_exome_FIN
				+ ", gnomAD_exome_NFE=" + gnomAD_exome_NFE + ", gnomAD_exome_OTH=" + gnomAD_exome_OTH
				+ ", gnomAD_exome_SAS=" + gnomAD_exome_SAS + ", thousandG_ALL=" + thousandG_ALL + ", thousandG_EUR="
				+ thousandG_EUR + ", thousandG_AFR=" + thousandG_AFR + ", thousandG_EAS=" + thousandG_EAS
				+ ", thousandG_AMR=" + thousandG_AMR + ", thousandG_SAS=" + thousandG_SAS + ", ExAC_ALL=" + ExAC_ALL
				+ ", ExAC_AFR=" + ExAC_AFR + ", ExAC_AMR=" + ExAC_AMR + ", ExAC_EAS=" + ExAC_EAS + ", ExAC_FIN="
				+ ExAC_FIN + ", ExAC_NFE=" + ExAC_NFE + ", ExAC_OTH=" + ExAC_OTH + ", ExAC_SAS=" + ExAC_SAS
				+ ", gnomAD_genome_ALL=" + gnomAD_genome_ALL + ", gnomAD_genome_AFR=" + gnomAD_genome_AFR
				+ ", gnomAD_genome_AMR=" + gnomAD_genome_AMR + ", gnomAD_genome_ASJ=" + gnomAD_genome_ASJ
				+ ", gnomAD_genome_EAS=" + gnomAD_genome_EAS + ", gnomAD_genome_FIN=" + gnomAD_genome_FIN
				+ ", gnomAD_genome_NFE=" + gnomAD_genome_NFE + ", gnomAD_genome_OTH=" + gnomAD_genome_OTH + ", SIFT="
				+ SIFT + ", PolyPhenVal=" + PolyPhenVal + ", GERP=" + GERP + ", CADD=" + CADD + ", uuId=" + uuId + "]";
	}


}