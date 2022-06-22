package com.cts.usermanagement.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AppUser {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String password;
	private Long mobile;
	private String mailId;
	private Date redgDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getmailId() {
		return mailId;
	}

	public void setmailId(String mailId) {
		this.mailId = mailId;
	}

	public Date getRedgDate() {
		return redgDate;
	}

	public void setRedgDate(Date redgDate) {
		this.redgDate = redgDate;
	}

}

