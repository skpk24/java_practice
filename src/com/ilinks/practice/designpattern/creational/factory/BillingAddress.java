package com.ilinks.practice.designpattern.creational.factory;

public class BillingAddress implements Address {

	@Override
	public void createAddress() {
		System.out.println("Creating Billing Address.");
	}

}
