package com.ilinks.practice.java.thread.cyclicbarrier.entity;

public class Address {
	
	private String addressType;
	private String address1;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	
	public Address(String type) {
		this.addressType = type;
	}
	
	public String getAddress1() {
		return address1;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public String getZipCode() {
		return zipCode;
	}
	
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() {
		return "Address [addressType=" + addressType + ", address1=" + address1 + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", zipCode=" + zipCode + "]";
	}
	
	
}
