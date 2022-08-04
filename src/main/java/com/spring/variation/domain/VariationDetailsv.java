package com.spring.variation.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "variation_detail_sv")
public class VariationDetailsv implements Serializable {
	
	private static long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue
    private int Id;
	@Column(name = "uu_id")
    private String uu_id;
	@Column(name = "AF")
    private String AF;
	@Column(name = "AnnotSV_ID")
    private String AnnotSV_ID;
	@Column(name = "SV_chrom")
    private String SV_chrom;
	@Column(name = "SV_start")
    private String SV_start;
	@Column(name = "SV_end")
    private String SV_end;
	@Column(name = "SV_length")
    private String SV_length;
	@Column(name = "SV_type")
    private String SV_type;
	@Column(name = "REF")
    private String REF;
	@Column(name = "ALT")
    private String ALT;
	@Column(name = "Tx")
    private String Tx;
	@Column(name = "Tx_start")
    private String Tx_start;
	@Column(name = "Tx_end")
    private String Tx_end;
	@Column(name = "Overlapped_tx_length")
    private String Overlapped_tx_length;
	@Column(name = "Overlapped_CDS_length")
    private String Overlapped_CDS_length;
	@Column(name = "Overlapped_CDS_percent")
    private String Overlapped_CDS_percent;
	@Column(name = "Frameshift")
    private String Frameshift;
	@Column(name = "Exon_count")
    private String Exon_count;
	@Column(name = "Location")
    private String Location;
	@Column(name = "Location2")
    private String Location2;
	@Column(name = "Dist_nearest_SS")
    private String Dist_nearest_SS;
	@Column(name = "Nearest_SS_type")
    private String Nearest_SS_type;
	@Column(name = "Intersect_start")
    private String Intersect_start;
	@Column(name = "Intersect_end")
    private String Intersect_end;
	@Column(name = "RE_gene")
    private String RE_gene;
	@Column(name = "P_gain_phen")
    private String P_gain_phen;
	@Column(name = "P_gain_hpo")
    private String P_gain_hpo;
	@Column(name = "P_gain_source")
    private String P_gain_source;
	@Column(name = "P_gain_coord")
    private String P_gain_coord;
	@Column(name = "P_loss_phen")
    private String P_loss_phen;
	@Column(name = "P_loss_hpo")
    private String P_loss_hpo;
	@Column(name = "P_loss_source")
    private String P_loss_source;
	@Column(name = "P_loss_coord")
    private String P_loss_coord;
	@Column(name = "P_ins_phen")
    private String P_ins_phen;
	@Column(name = "P_ins_hpo")
    private String P_ins_hpo;
	@Column(name = "P_ins_source")
    private String P_ins_source;
	@Column(name = "P_ins_coord")
    private String P_ins_coord;
	@Column(name = "P_snvindel_nb")
    private String P_snvindel_nb;
	@Column(name = "P_snvindel_phen")
    private String P_snvindel_phen;
	@Column(name = "B_gain_source")
    private String B_gain_source;
	@Column(name = "B_gain_coord")
    private String B_gain_coord;
	@Column(name = "B_loss_source")
    private String B_loss_source;
	@Column(name = "B_loss_coord")
    private String B_loss_coord;
	@Column(name = "B_ins_source")
    private String B_ins_source;
	@Column(name = "B_ins_coord")
    private String B_ins_coord;
	@Column(name = "B_inv_source")
    private String B_inv_source;
	@Column(name = "B_inv_coord")
    private String B_inv_coord;
	@Column(name = "TAD_coordinate")
    private String TAD_coordinate;
	@Column(name = "ENCODE_experiment")
    private String ENCODE_experiment;
	@Column(name = "GC_content_left")
    private String GC_content_left;
	@Column(name = "GC_content_right")
    private String GC_content_right;
	@Column(name = "Repeat_coord_left")
    private String Repeat_coord_left;
	@Column(name = "Repeat_type_left")
    private String Repeat_type_left;
	@Column(name = "Repeat_coord_right")
    private String Repeat_coord_right;
	@Column(name = "Repeat_type_right")
    private String Repeat_type_right;
	@Column(name = "Gap_left")
    private String Gap_left;
	@Column(name = "Gap_right")
    private String Gap_right;
	@Column(name = "SegDup_left")
    private String SegDup_left;
	@Column(name = "SegDup_right")
    private String SegDup_right;
	@Column(name = "ENCODE_blacklist_left")
    private String ENCODE_blacklist_left;
	@Column(name = "ENCODE_blacklist_characteristics_left")
    private String ENCODE_blacklist_characteristics_left;
	@Column(name = "ENCODE_blacklist_right")
    private String ENCODE_blacklist_right;
	@Column(name = "ENCODE_blacklist_characteristics_right")
    private String ENCODE_blacklist_characteristics_right;
	@Column(name = "ACMG")
    private String ACMG;
	@Column(name = "HI")
    private String HI;
	@Column(name = "TS")
    private String TS;
	@Column(name = "DDD_HI_percent")
    private String DDD_HI_percent;
	@Column(name = "DDD_status")
    private String DDD_status;
	@Column(name = "DDD_mode")
    private String DDD_mode;
	@Column(name = "DDD_consequence")
    private String DDD_consequence;
	@Column(name = "DDD_disease")
    private String DDD_disease;
	@Column(name = "DDD_pmid")
    private String DDD_pmid;
	@Column(name = "ExAC_del_Z")
    private String ExAC_del_Z;
	@Column(name = "ExAC_dupZ")
    private String ExAC_dupZ;
	@Column(name = "ExAC_cnvZ")
    private String ExAC_cnvZ;
	@Column(name = "ExAC_synZ")
    private String ExAC_synZ;
	@Column(name = "ExAC_misZ")
    private String ExAC_misZ;
	@Column(name = "OMIM_ID")
    private String OMIM_ID;
	@Column(name = "OMIM_phenotype")
    private String OMIM_phenotype;
	@Column(name = "OMIM_inheritance")
    private String OMIM_inheritance;
	@Column(name = "OMIM_morbid")
    private String OMIM_morbid;
	@Column(name = "OMIM_morbid_candidate")
    private String OMIM_morbid_candidate;
	@Column(name = "LOEUF_bin")
    private String LOEUF_bin;
	@Column(name = "GnomAD_pLI")
    private String GnomAD_pLI;
	@Column(name = "ExAC_pLI")
    private String ExAC_pLI;
	@Column(name = "AnnotSV_ranking_score")
    private String AnnotSV_ranking_score;
	@Column(name = "AnnotSV_ranking_criteria")
    private String AnnotSV_ranking_criteria;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUu_id() {
		return uu_id;
	}
	public void setUu_id(String uu_id) {
		this.uu_id = uu_id;
	}
	public String getAF() {
		return AF;
	}
	public void setAF(String aF) {
		AF = aF;
	}
	public String getAnnotSV_ID() {
		return AnnotSV_ID;
	}
	public void setAnnotSV_ID(String annotSV_ID) {
		AnnotSV_ID = annotSV_ID;
	}
	public String getSV_chrom() {
		return SV_chrom;
	}
	public void setSV_chrom(String sV_chrom) {
		SV_chrom = sV_chrom;
	}
	public String getSV_start() {
		return SV_start;
	}
	public void setSV_start(String sV_start) {
		SV_start = sV_start;
	}
	public String getSV_end() {
		return SV_end;
	}
	public void setSV_end(String sV_end) {
		SV_end = sV_end;
	}
	public String getSV_length() {
		return SV_length;
	}
	public void setSV_length(String sV_length) {
		SV_length = sV_length;
	}
	public String getSV_type() {
		return SV_type;
	}
	public void setSV_type(String sV_type) {
		SV_type = sV_type;
	}
	public String getREF() {
		return REF;
	}
	public void setREF(String rEF) {
		REF = rEF;
	}
	public String getALT() {
		return ALT;
	}
	public void setALT(String aLT) {
		ALT = aLT;
	}
	public String getTx() {
		return Tx;
	}
	public void setTx(String tx) {
		Tx = tx;
	}
	public String getTx_start() {
		return Tx_start;
	}
	public void setTx_start(String tx_start) {
		Tx_start = tx_start;
	}
	public String getTx_end() {
		return Tx_end;
	}
	public void setTx_end(String tx_end) {
		Tx_end = tx_end;
	}
	public String getOverlapped_tx_length() {
		return Overlapped_tx_length;
	}
	public void setOverlapped_tx_length(String overlapped_tx_length) {
		Overlapped_tx_length = overlapped_tx_length;
	}
	public String getOverlapped_CDS_length() {
		return Overlapped_CDS_length;
	}
	public void setOverlapped_CDS_length(String overlapped_CDS_length) {
		Overlapped_CDS_length = overlapped_CDS_length;
	}
	public String getOverlapped_CDS_percent() {
		return Overlapped_CDS_percent;
	}
	public void setOverlapped_CDS_percent(String overlapped_CDS_percent) {
		Overlapped_CDS_percent = overlapped_CDS_percent;
	}
	public String getFrameshift() {
		return Frameshift;
	}
	public void setFrameshift(String frameshift) {
		Frameshift = frameshift;
	}
	public String getExon_count() {
		return Exon_count;
	}
	public void setExon_count(String exon_count) {
		Exon_count = exon_count;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getLocation2() {
		return Location2;
	}
	public void setLocation2(String location2) {
		Location2 = location2;
	}
	public String getDist_nearest_SS() {
		return Dist_nearest_SS;
	}
	public void setDist_nearest_SS(String dist_nearest_SS) {
		Dist_nearest_SS = dist_nearest_SS;
	}
	public String getNearest_SS_type() {
		return Nearest_SS_type;
	}
	public void setNearest_SS_type(String nearest_SS_type) {
		Nearest_SS_type = nearest_SS_type;
	}
	public String getIntersect_start() {
		return Intersect_start;
	}
	public void setIntersect_start(String intersect_start) {
		Intersect_start = intersect_start;
	}
	public String getIntersect_end() {
		return Intersect_end;
	}
	public void setIntersect_end(String intersect_end) {
		Intersect_end = intersect_end;
	}
	public String getRE_gene() {
		return RE_gene;
	}
	public void setRE_gene(String rE_gene) {
		RE_gene = rE_gene;
	}
	public String getP_gain_phen() {
		return P_gain_phen;
	}
	public void setP_gain_phen(String p_gain_phen) {
		P_gain_phen = p_gain_phen;
	}
	public String getP_gain_hpo() {
		return P_gain_hpo;
	}
	public void setP_gain_hpo(String p_gain_hpo) {
		P_gain_hpo = p_gain_hpo;
	}
	public String getP_gain_source() {
		return P_gain_source;
	}
	public void setP_gain_source(String p_gain_source) {
		P_gain_source = p_gain_source;
	}
	public String getP_gain_coord() {
		return P_gain_coord;
	}
	public void setP_gain_coord(String p_gain_coord) {
		P_gain_coord = p_gain_coord;
	}
	public String getP_loss_phen() {
		return P_loss_phen;
	}
	public void setP_loss_phen(String p_loss_phen) {
		P_loss_phen = p_loss_phen;
	}
	public String getP_loss_hpo() {
		return P_loss_hpo;
	}
	public void setP_loss_hpo(String p_loss_hpo) {
		P_loss_hpo = p_loss_hpo;
	}
	public String getP_loss_source() {
		return P_loss_source;
	}
	public void setP_loss_source(String p_loss_source) {
		P_loss_source = p_loss_source;
	}
	public String getP_loss_coord() {
		return P_loss_coord;
	}
	public void setP_loss_coord(String p_loss_coord) {
		P_loss_coord = p_loss_coord;
	}
	public String getP_ins_phen() {
		return P_ins_phen;
	}
	public void setP_ins_phen(String p_ins_phen) {
		P_ins_phen = p_ins_phen;
	}
	public String getP_ins_hpo() {
		return P_ins_hpo;
	}
	public void setP_ins_hpo(String p_ins_hpo) {
		P_ins_hpo = p_ins_hpo;
	}
	public String getP_ins_source() {
		return P_ins_source;
	}
	public void setP_ins_source(String p_ins_source) {
		P_ins_source = p_ins_source;
	}
	public String getP_ins_coord() {
		return P_ins_coord;
	}
	public void setP_ins_coord(String p_ins_coord) {
		P_ins_coord = p_ins_coord;
	}
	public String getP_snvindel_nb() {
		return P_snvindel_nb;
	}
	public void setP_snvindel_nb(String p_snvindel_nb) {
		P_snvindel_nb = p_snvindel_nb;
	}
	public String getP_snvindel_phen() {
		return P_snvindel_phen;
	}
	public void setP_snvindel_phen(String p_snvindel_phen) {
		P_snvindel_phen = p_snvindel_phen;
	}
	public String getB_gain_source() {
		return B_gain_source;
	}
	public void setB_gain_source(String b_gain_source) {
		B_gain_source = b_gain_source;
	}
	public String getB_gain_coord() {
		return B_gain_coord;
	}
	public void setB_gain_coord(String b_gain_coord) {
		B_gain_coord = b_gain_coord;
	}
	public String getB_loss_source() {
		return B_loss_source;
	}
	public void setB_loss_source(String b_loss_source) {
		B_loss_source = b_loss_source;
	}
	public String getB_loss_coord() {
		return B_loss_coord;
	}
	public void setB_loss_coord(String b_loss_coord) {
		B_loss_coord = b_loss_coord;
	}
	public String getB_ins_source() {
		return B_ins_source;
	}
	public void setB_ins_source(String b_ins_source) {
		B_ins_source = b_ins_source;
	}
	public String getB_ins_coord() {
		return B_ins_coord;
	}
	public void setB_ins_coord(String b_ins_coord) {
		B_ins_coord = b_ins_coord;
	}
	public String getB_inv_source() {
		return B_inv_source;
	}
	public void setB_inv_source(String b_inv_source) {
		B_inv_source = b_inv_source;
	}
	public String getB_inv_coord() {
		return B_inv_coord;
	}
	public void setB_inv_coord(String b_inv_coord) {
		B_inv_coord = b_inv_coord;
	}
	public String getTAD_coordinate() {
		return TAD_coordinate;
	}
	public void setTAD_coordinate(String tAD_coordinate) {
		TAD_coordinate = tAD_coordinate;
	}
	public String getENCODE_experiment() {
		return ENCODE_experiment;
	}
	public void setENCODE_experiment(String eNCODE_experiment) {
		ENCODE_experiment = eNCODE_experiment;
	}
	public String getGC_content_left() {
		return GC_content_left;
	}
	public void setGC_content_left(String gC_content_left) {
		GC_content_left = gC_content_left;
	}
	public String getGC_content_right() {
		return GC_content_right;
	}
	public void setGC_content_right(String gC_content_right) {
		GC_content_right = gC_content_right;
	}
	public String getRepeat_coord_left() {
		return Repeat_coord_left;
	}
	public void setRepeat_coord_left(String repeat_coord_left) {
		Repeat_coord_left = repeat_coord_left;
	}
	public String getRepeat_type_left() {
		return Repeat_type_left;
	}
	public void setRepeat_type_left(String repeat_type_left) {
		Repeat_type_left = repeat_type_left;
	}
	public String getRepeat_coord_right() {
		return Repeat_coord_right;
	}
	public void setRepeat_coord_right(String repeat_coord_right) {
		Repeat_coord_right = repeat_coord_right;
	}
	public String getRepeat_type_right() {
		return Repeat_type_right;
	}
	public void setRepeat_type_right(String repeat_type_right) {
		Repeat_type_right = repeat_type_right;
	}
	public String getGap_left() {
		return Gap_left;
	}
	public void setGap_left(String gap_left) {
		Gap_left = gap_left;
	}
	public String getGap_right() {
		return Gap_right;
	}
	public void setGap_right(String gap_right) {
		Gap_right = gap_right;
	}
	public String getSegDup_left() {
		return SegDup_left;
	}
	public void setSegDup_left(String segDup_left) {
		SegDup_left = segDup_left;
	}
	public String getSegDup_right() {
		return SegDup_right;
	}
	public void setSegDup_right(String segDup_right) {
		SegDup_right = segDup_right;
	}
	public String getENCODE_blacklist_left() {
		return ENCODE_blacklist_left;
	}
	public void setENCODE_blacklist_left(String eNCODE_blacklist_left) {
		ENCODE_blacklist_left = eNCODE_blacklist_left;
	}
	public String getENCODE_blacklist_characteristics_left() {
		return ENCODE_blacklist_characteristics_left;
	}
	public void setENCODE_blacklist_characteristics_left(String eNCODE_blacklist_characteristics_left) {
		ENCODE_blacklist_characteristics_left = eNCODE_blacklist_characteristics_left;
	}
	public String getENCODE_blacklist_right() {
		return ENCODE_blacklist_right;
	}
	public void setENCODE_blacklist_right(String eNCODE_blacklist_right) {
		ENCODE_blacklist_right = eNCODE_blacklist_right;
	}
	public String getENCODE_blacklist_characteristics_right() {
		return ENCODE_blacklist_characteristics_right;
	}
	public void setENCODE_blacklist_characteristics_right(String eNCODE_blacklist_characteristics_right) {
		ENCODE_blacklist_characteristics_right = eNCODE_blacklist_characteristics_right;
	}
	public String getACMG() {
		return ACMG;
	}
	public void setACMG(String aCMG) {
		ACMG = aCMG;
	}
	public String getHI() {
		return HI;
	}
	public void setHI(String hI) {
		HI = hI;
	}
	public String getTS() {
		return TS;
	}
	public void setTS(String tS) {
		TS = tS;
	}
	public String getDDD_HI_percent() {
		return DDD_HI_percent;
	}
	public void setDDD_HI_percent(String dDD_HI_percent) {
		DDD_HI_percent = dDD_HI_percent;
	}
	public String getDDD_status() {
		return DDD_status;
	}
	public void setDDD_status(String dDD_status) {
		DDD_status = dDD_status;
	}
	public String getDDD_mode() {
		return DDD_mode;
	}
	public void setDDD_mode(String dDD_mode) {
		DDD_mode = dDD_mode;
	}
	public String getDDD_consequence() {
		return DDD_consequence;
	}
	public void setDDD_consequence(String dDD_consequence) {
		DDD_consequence = dDD_consequence;
	}
	public String getDDD_disease() {
		return DDD_disease;
	}
	public void setDDD_disease(String dDD_disease) {
		DDD_disease = dDD_disease;
	}
	public String getDDD_pmid() {
		return DDD_pmid;
	}
	public void setDDD_pmid(String dDD_pmid) {
		DDD_pmid = dDD_pmid;
	}
	public String getExAC_del_Z() {
		return ExAC_del_Z;
	}
	public void setExAC_del_Z(String exAC_del_Z) {
		ExAC_del_Z = exAC_del_Z;
	}
	public String getExAC_dupZ() {
		return ExAC_dupZ;
	}
	public void setExAC_dupZ(String exAC_dupZ) {
		ExAC_dupZ = exAC_dupZ;
	}
	public String getExAC_cnvZ() {
		return ExAC_cnvZ;
	}
	public void setExAC_cnvZ(String exAC_cnvZ) {
		ExAC_cnvZ = exAC_cnvZ;
	}
	public String getExAC_synZ() {
		return ExAC_synZ;
	}
	public void setExAC_synZ(String exAC_synZ) {
		ExAC_synZ = exAC_synZ;
	}
	public String getExAC_misZ() {
		return ExAC_misZ;
	}
	public void setExAC_misZ(String exAC_misZ) {
		ExAC_misZ = exAC_misZ;
	}
	public String getOMIM_ID() {
		return OMIM_ID;
	}
	public void setOMIM_ID(String oMIM_ID) {
		OMIM_ID = oMIM_ID;
	}
	public String getOMIM_phenotype() {
		return OMIM_phenotype;
	}
	public void setOMIM_phenotype(String oMIM_phenotype) {
		OMIM_phenotype = oMIM_phenotype;
	}
	public String getOMIM_inheritance() {
		return OMIM_inheritance;
	}
	public void setOMIM_inheritance(String oMIM_inheritance) {
		OMIM_inheritance = oMIM_inheritance;
	}
	public String getOMIM_morbid() {
		return OMIM_morbid;
	}
	public void setOMIM_morbid(String oMIM_morbid) {
		OMIM_morbid = oMIM_morbid;
	}
	public String getOMIM_morbid_candidate() {
		return OMIM_morbid_candidate;
	}
	public void setOMIM_morbid_candidate(String oMIM_morbid_candidate) {
		OMIM_morbid_candidate = oMIM_morbid_candidate;
	}
	public String getLOEUF_bin() {
		return LOEUF_bin;
	}
	public void setLOEUF_bin(String lOEUF_bin) {
		LOEUF_bin = lOEUF_bin;
	}
	public String getGnomAD_pLI() {
		return GnomAD_pLI;
	}
	public void setGnomAD_pLI(String gnomAD_pLI) {
		GnomAD_pLI = gnomAD_pLI;
	}
	public String getExAC_pLI() {
		return ExAC_pLI;
	}
	public void setExAC_pLI(String exAC_pLI) {
		ExAC_pLI = exAC_pLI;
	}
	public String getAnnotSV_ranking_score() {
		return AnnotSV_ranking_score;
	}
	public void setAnnotSV_ranking_score(String annotSV_ranking_score) {
		AnnotSV_ranking_score = annotSV_ranking_score;
	}
	public String getAnnotSV_ranking_criteria() {
		return AnnotSV_ranking_criteria;
	}
	public void setAnnotSV_ranking_criteria(String annotSV_ranking_criteria) {
		AnnotSV_ranking_criteria = annotSV_ranking_criteria;
	}
	@Override
	public String toString() {
		return "VariationDetailChrsv [Id=" + Id + ", uu_id=" + uu_id + ", AF=" + AF + ", AnnotSV_ID=" + AnnotSV_ID
				+ ", SV_chrom=" + SV_chrom + ", SV_start=" + SV_start + ", SV_end=" + SV_end + ", SV_length="
				+ SV_length + ", SV_type=" + SV_type + ", REF=" + REF + ", ALT=" + ALT + ", Tx=" + Tx + ", Tx_start="
				+ Tx_start + ", Tx_end=" + Tx_end + ", Overlapped_tx_length=" + Overlapped_tx_length
				+ ", Overlapped_CDS_length=" + Overlapped_CDS_length + ", Overlapped_CDS_percent="
				+ Overlapped_CDS_percent + ", Frameshift=" + Frameshift + ", Exon_count=" + Exon_count + ", Location="
				+ Location + ", Location2=" + Location2 + ", Dist_nearest_SS=" + Dist_nearest_SS + ", Nearest_SS_type="
				+ Nearest_SS_type + ", Intersect_start=" + Intersect_start + ", Intersect_end=" + Intersect_end
				+ ", RE_gene=" + RE_gene + ", P_gain_phen=" + P_gain_phen + ", P_gain_hpo=" + P_gain_hpo
				+ ", P_gain_source=" + P_gain_source + ", P_gain_coord=" + P_gain_coord + ", P_loss_phen=" + P_loss_phen
				+ ", P_loss_hpo=" + P_loss_hpo + ", P_loss_source=" + P_loss_source + ", P_loss_coord=" + P_loss_coord
				+ ", P_ins_phen=" + P_ins_phen + ", P_ins_hpo=" + P_ins_hpo + ", P_ins_source=" + P_ins_source
				+ ", P_ins_coord=" + P_ins_coord + ", P_snvindel_nb=" + P_snvindel_nb + ", P_snvindel_phen="
				+ P_snvindel_phen + ", B_gain_source=" + B_gain_source + ", B_gain_coord=" + B_gain_coord
				+ ", B_loss_source=" + B_loss_source + ", B_loss_coord=" + B_loss_coord + ", B_ins_source="
				+ B_ins_source + ", B_ins_coord=" + B_ins_coord + ", B_inv_source=" + B_inv_source + ", B_inv_coord="
				+ B_inv_coord + ", TAD_coordinate=" + TAD_coordinate + ", ENCODE_experiment=" + ENCODE_experiment
				+ ", GC_content_left=" + GC_content_left + ", GC_content_right=" + GC_content_right
				+ ", Repeat_coord_left=" + Repeat_coord_left + ", Repeat_type_left=" + Repeat_type_left
				+ ", Repeat_coord_right=" + Repeat_coord_right + ", Repeat_type_right=" + Repeat_type_right
				+ ", Gap_left=" + Gap_left + ", Gap_right=" + Gap_right + ", SegDup_left=" + SegDup_left
				+ ", SegDup_right=" + SegDup_right + ", ENCODE_blacklist_left=" + ENCODE_blacklist_left
				+ ", ENCODE_blacklist_characteristics_left=" + ENCODE_blacklist_characteristics_left
				+ ", ENCODE_blacklist_right=" + ENCODE_blacklist_right + ", ENCODE_blacklist_characteristics_right="
				+ ENCODE_blacklist_characteristics_right + ", ACMG=" + ACMG + ", HI=" + HI + ", TS=" + TS
				+ ", DDD_HI_percent=" + DDD_HI_percent + ", DDD_status=" + DDD_status + ", DDD_mode=" + DDD_mode
				+ ", DDD_consequence=" + DDD_consequence + ", DDD_disease=" + DDD_disease + ", DDD_pmid=" + DDD_pmid
				+ ", ExAC_del_Z=" + ExAC_del_Z + ", ExAC_dupZ=" + ExAC_dupZ + ", ExAC_cnvZ=" + ExAC_cnvZ
				+ ", ExAC_synZ=" + ExAC_synZ + ", ExAC_misZ=" + ExAC_misZ + ", OMIM_ID=" + OMIM_ID + ", OMIM_phenotype="
				+ OMIM_phenotype + ", OMIM_inheritance=" + OMIM_inheritance + ", OMIM_morbid=" + OMIM_morbid
				+ ", OMIM_morbid_candidate=" + OMIM_morbid_candidate + ", LOEUF_bin=" + LOEUF_bin + ", GnomAD_pLI="
				+ GnomAD_pLI + ", ExAC_pLI=" + ExAC_pLI + ", AnnotSV_ranking_score=" + AnnotSV_ranking_score
				+ ", AnnotSV_ranking_criteria=" + AnnotSV_ranking_criteria + "]";
	}
    

}