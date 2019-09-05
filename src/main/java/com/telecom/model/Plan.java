package com.telecom.model;

import org.springframework.data.annotation.Id;

public class Plan {

	@Id
	private String id;

	private String planName;

	private Float price;

	private Float durationInMonths;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
