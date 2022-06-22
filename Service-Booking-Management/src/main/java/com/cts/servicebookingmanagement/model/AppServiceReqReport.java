package com.cts.servicebookingmanagement.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AppServiceReqReport {

	@Id
	@GeneratedValue
	private Integer reportId;
	private Integer serReqId;
	private Date reportDate;
	private String serviceType; // (general, repair, support),
	private String actionTaken;
	private String diagnosisDetails;
	private String isPaid;
	private Integer visitFees;
	private String repairDetails;
	
	
	public Integer getSerReqId() {
		return serReqId;
	}
	public void setSerReqId(Integer serReqId) {
		this.serReqId = serReqId;
	}
	public Date getReportDate() {
		return reportDate;
	}
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getActionTaken() {
		return actionTaken;
	}
	public void setActionTaken(String actionTaken) {
		this.actionTaken = actionTaken;
	}
	public String getDiagnosisDetails() {
		return diagnosisDetails;
	}
	public void setDiagnosisDetails(String diagnosisDetails) {
		this.diagnosisDetails = diagnosisDetails;
	}
	public String getIsPaid() {
		return isPaid;
	}
	public void setIsPaid(String isPaid) {
		this.isPaid = isPaid;
	}
	public Integer getVisitFees() {
		return visitFees;
	}
	public Integer getReportId() {
		return reportId;
	}
	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}
	public void setVisitFees(Integer visitFees) {
		this.visitFees = visitFees;
	}
	public String getRepairDetails() {
		return repairDetails;
	}
	public void setRepairDetails(String repairDetails) {
		this.repairDetails = repairDetails;
	}

}
