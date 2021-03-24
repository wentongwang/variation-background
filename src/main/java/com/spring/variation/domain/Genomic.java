package com.spring.variation.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "genomic")
public class Genomic implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue
    private int Id;
    @Column(name = "chrom")
    private String chrom;
    @Column(name = "source")
    private String source;
    @Column(name = "type")
    private String type;
    @Column(name = "start")
    private int start;
    @Column(name = "end")
    private int end;
    @Column(name = "score")
    private String score;
    @Column(name = "chain")
    private String chain;
    @Column(name = "cds_position")
    private String cds_position;
    @Column(name = "gene_id")
    private String gene_id;
    @Column(name = "parent")
    private String parent;
    @Column(name = "gene")
    private String gene;
    


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getChrom() {
		return chrom;
	}


	public void setChrom(String chrom) {
		this.chrom = chrom;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getStart() {
		return start;
	}


	public void setStart(int start) {
		this.start = start;
	}


	public int getEnd() {
		return end;
	}


	public void setEnd(int end) {
		this.end = end;
	}


	public String getScore() {
		return score;
	}


	public void setScore(String score) {
		this.score = score;
	}


	public String getChain() {
		return chain;
	}


	public void setChain(String chain) {
		this.chain = chain;
	}


	public String getCds_position() {
		return cds_position;
	}


	public void setCds_position(String cds_position) {
		this.cds_position = cds_position;
	}


	public String getGene_id() {
		return gene_id;
	}


	public void setGene_id(String gene_id) {
		this.gene_id = gene_id;
	}


	public String getParent() {
		return parent;
	}


	public void setParent(String parent) {
		this.parent = parent;
	}


	public String getGene() {
		return gene;
	}


	public void setGene(String gene) {
		this.gene = gene;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
	@Override
	public String toString() {
		return "Genomic [Id=" + Id + ", chrom=" + chrom + ", source=" + source + ", type=" + type + ", start=" + start
				+ ", end=" + end + ", score=" + score + ", chain=" + chain + ", cds_position=" + cds_position
				+ ", gene_id=" + gene_id + ", parent=" + parent + ", gene=" + gene + "]";
	}
}