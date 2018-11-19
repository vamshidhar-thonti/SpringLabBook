package com.cg.purchase.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobiledata")
public class Mobile {
	
	@Id
	@Column(name = "mobile_id")
	private int mobId;
	@Column(name = "mobile_name")
	private String mobName;
	@Column(name = "mobile_price")
	private double mobPrice;
	@Column(name = "mobile_category")
	private String mobCategory;
	
	public int getMobId() {
		return mobId;
	}
	public void setMobId(int mobId) {
		this.mobId = mobId;
	}
	public String getMobName() {
		return mobName;
	}
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	public double getMobPrice() {
		return mobPrice;
	}
	public void setMobPrice(double mobPrice) {
		this.mobPrice = mobPrice;
	}
	public String getMobCategory() {
		return mobCategory;
	}
	public void setMobCategory(String mobCategory) {
		this.mobCategory = mobCategory;
	}

}
