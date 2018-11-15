package com.cg.springMVCOne.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "mobiledata")
public class Mobile {
	
	@Id
	@Column(name = "mobile_id")
	@NotNull(message="Mobile cannot be empty")
	Integer mobId;
	@Column(name = "mobile_name")
	@NotEmpty(message = "Name cannot be Empty")
	String mobName;
	@Column(name = "mobile_price")
	@NotNull(message = "Name cannot be Empty")
	Double mobPrice;
	@Column(name = "mobile_category")
	@NotEmpty(message = "Name cannot be Empty")
	String mobCategory;
	@Column(name = "mobile_online")
	@NotEmpty(message = "Name cannot be Empty")
	String mobOnline;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	
	public Mobile(Integer mobId, String mobName, Double mobPrice, String mobCategory, String type) {
		this.mobId = mobId;
		this.mobName  = mobName;
		this.mobPrice = mobPrice;
		this.mobCategory = mobCategory;
		this.mobOnline = type;
	}
	
	
	public String getMobOnline() {
		return mobOnline;
	}

	public void setMobOnline(String mobOnline) {
		this.mobOnline = mobOnline;
	}

	public Integer getMobId() {
		return mobId;
	}
	public void setMobId(Integer mobId) {
		this.mobId = mobId;
	}
	public String getMobName() {
		return mobName;
	}
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	public Double getMobPrice() {
		return mobPrice;
	}
	public void setMobPrice(Double mobPrice) {
		this.mobPrice = mobPrice;
	}
	public String getMobCategory() {
		return mobCategory;
	}
	public void setMobCategory(String mobCategory) {
		this.mobCategory = mobCategory;
	}

	@Override
	public String toString() {
		return "Mobile [mobId=" + mobId + ", mobName=" + mobName
				+ ", mobPrice=" + mobPrice + ", mobCategory=" + mobCategory
				+ ", Online=" + mobOnline + "]";
	}
	
}
