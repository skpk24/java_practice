package com.ilinks.practice.designpattern.creational.factory;

public class Checkout {
	
	public static void main(String args[]) {
		Address billingAddress = AddressFactory.getInstance("BILLING");
		billingAddress.createAddress();
		
		Address shippingAddress = AddressFactory.getInstance("SHIPPING");
		shippingAddress.createAddress();
	}
}
