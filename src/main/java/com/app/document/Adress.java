package com.app.document;

import org.springframework.stereotype.Component;

@Component
public class Adress {
	private String village;
	private String mandal;
	private String district;
	private Integer pincode;
	private String state;
	public Adress() {
		super();
	}
	public Adress(String village, String mandal, String district, Integer pincode, String state) {
		super();
		this.village = village;
		this.mandal = mandal;
		this.district = district;
		this.pincode = pincode;
		this.state = state;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Adress [village=" + village + ", mandal=" + mandal + ", district=" + district + ", pincode=" + pincode
				+ ", state=" + state + "]";
	}
	

}
