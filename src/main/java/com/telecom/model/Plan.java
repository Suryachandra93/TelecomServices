package com.telecom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plan")
public class Plan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@Column(name="PLAN_NAME")
	private String planName;
	
	@Column(name="PRICE")
	private Float price;
	
	@Column(name="DURATION")
	private Float durationInMonths;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(Float durationInMonths) {
		this.durationInMonths = durationInMonths;
	}
	
	
}
