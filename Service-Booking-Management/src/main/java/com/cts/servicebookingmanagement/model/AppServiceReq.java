package com.cts.servicebookingmanagement.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AppServiceReq {

	@Id
	@GeneratedValue
	private Integer id;
	private Integer productId;
	private Integer userId;
	private Date reqDate; 
	private String problem; 
	private String description; 
	private String status  ; //pending,resolved 
	
/*
    "id":1,
	"productId":1,
	"userId":1,
	"reqDate": "2022-02-02",
	"problem":"NA" ,
	"description":"NA" ,
	"status": "pending"
*/
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getReqDate() {
		return reqDate;
	}
	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}

		
	
}
