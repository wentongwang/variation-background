package com.spring.variation.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "email_code")
public class EmailCode implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue
    private int Id;
    @Column(name = "email")
    private String email;
    @Column(name = "code")
    private String code;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "EmailCode [Id=" + Id + ", email=" + email + ", code=" + code + "]";
	}
}