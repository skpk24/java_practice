package com.ilinks.practice.designpattern.creational.factory;

public class ShippingAddress implements Address {

	@Override
	public void createAddress() {
		System.out.println("Creating Shipping Address.");
	}

}
