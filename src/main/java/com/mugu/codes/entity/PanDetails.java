package com.mugu.codes.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PanDetails")
public class PanDetails {
			
	@Id
	@Column(name="pan")
	private String panNo;
	
	public PanDetails() {
		super();
	}
	@Column(name="credit")
	private double creditScore;
		
	public double getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(double creditScore) {
		this.creditScore = creditScore;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
		
}
