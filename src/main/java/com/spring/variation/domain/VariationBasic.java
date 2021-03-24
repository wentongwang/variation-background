package com.spring.variation.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "variation_basic")
public class VariationBasic implements Serializable {
	
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
    @Column(name = "variation_type")
    private String variation_type;
    @Column(name = "RefSeq_genes")
    private String RefSeq_genes;
    @Column(name = "Exonic_function")
    private String Exonic_function;
    @Column(name = "gnomAD_exome_ALL")
    private String gnomAD_exome_ALL;
    @Column(name = "1000G_ALL")
    private String thousandG_ALL;
    @Column(name = "ExAC_ALL")
    private String ExAC_ALL;
    @Column(name = "gnomAD_genome_ALL")
    private String gnomAD_genome_ALL;
    @Column(name = "uu_id")
    private String uuId;
    
    public VariationBasic() {
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

	public String getGnomAD_exome_ALL() {
		return gnomAD_exome_ALL;
	}

	public void setGnomAD_exome_ALL(String gnomAD_exome_ALL) {
		this.gnomAD_exome_ALL = gnomAD_exome_ALL;
	}

	public String getThousandG_ALL() {
		return thousandG_ALL;
	}

	public void setThousandG_ALL(String thousandG_ALL) {
		this.thousandG_ALL = thousandG_ALL;
	}

	public String getExAC_ALL() {
		return ExAC_ALL;
	}

	public void setExAC_ALL(String exAC_ALL) {
		ExAC_ALL = exAC_ALL;
	}

	public String getGnomAD_genome_ALL() {
		return gnomAD_genome_ALL;
	}

	public void setGnomAD_genome_ALL(String gnomAD_genome_ALL) {
		this.gnomAD_genome_ALL = gnomAD_genome_ALL;
	}

	public String getUuId() {
		return uuId;
	}

	public void setUuId(String uuId) {
		this.uuId = uuId;
	}

	@Override
	public String toString() {
		return "VariationBasic [Id=" + Id + ", Chrom=" + Chrom + ", Start=" + Start + ", End=" + End + ", Ref=" + Ref
				+ ", Alt=" + Alt + ", variation_type=" + variation_type + ", RefSeq_genes=" + RefSeq_genes
				+ ", Exonic_function=" + Exonic_function + ", gnomAD_exome_ALL=" + gnomAD_exome_ALL + ", thousandG_ALL="
				+ thousandG_ALL + ", ExAC_ALL=" + ExAC_ALL + ", gnomAD_genome_ALL=" + gnomAD_genome_ALL + ", uuId="
				+ uuId + "]";
	}
    
}
