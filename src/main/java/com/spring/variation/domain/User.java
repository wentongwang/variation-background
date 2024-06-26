package com.spring.variation.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User implements Serializable {
	
	private static long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue
    private int id;
	@Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "role")
    private String role;
    @Column(name = "status")
    private int status;
    @Column(name = "email")
    private String email;
    @Column(name = "principal_type")
    private String principal_type;
    @Column(name = "application_purpose")
    private String application_purpose;
    @Column(name = "card_name")
    private String card_name;
    @Column(name = "card_no")
    private String card_no;
    @Column(name = "review_name")
    private String review_name;
    @Column(name = "registration_time")
    private Date registration_time;
    @Column(name = "review_time")
    private Date review_time;
    @Column(name = "code")
    private String code;
    @Column(name = "from1")
    private String from1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPrincipal_type() {
		return principal_type;
	}
	public void setPrincipal_type(String principal_type) {
		this.principal_type = principal_type;
	}
	public String getApplication_purpose() {
		return application_purpose;
	}
	public void setApplication_purpose(String application_purpose) {
		this.application_purpose = application_purpose;
	}
	public String getCard_name() {
		return card_name;
	}
	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}
	public String getCard_no() {
		return card_no;
	}
	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}
	public String getReview_name() {
		return review_name;
	}
	public void setReview_name(String review_name) {
		this.review_name = review_name;
	}
	public Date getRegistration_time() {
		return registration_time;
	}
	public void setRegistration_time(Date registration_time) {
		this.registration_time = registration_time;
	}
	public Date getReview_time() {
		return review_time;
	}
	public void setReview_time(Date review_time) {
		this.review_time = review_time;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getFrom1() {
		return from1;
	}
	public void setFrom1(String from1) {
		this.from1 = from1;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", role=" + role + ", status=" + status
				+ ", email=" + email + ", principal_type=" + principal_type + ", application_purpose="
				+ application_purpose + ", card_name=" + card_name + ", card_no=" + card_no + ", review_name="
				+ review_name + ", registration_time=" + registration_time + ", review_time=" + review_time + ", code="
				+ code + ", from1=" + from1 + "]";
	}
    
    
    
}