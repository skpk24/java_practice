package com.ilinks.practice.java.thread.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import com.ilinks.practice.java.thread.cyclicbarrier.entity.Address;

public class OrderAddressService implements Callable<Address> {
	
	private String type;
	
	private OrderAddressService(String type) {
		this.type = type;
	}
	
	public static OrderAddressService getInstance(String type) {
		return new OrderAddressService(type);
	}

	@Override
	public Address call() throws Exception {
		System.out.println("Creating Address");
		Address adr = new Address(type);
		adr.setAddress1("address1");
		adr.setCity("Bangalore");
		adr.setCountry("IN");
		adr.setState("KA");
		adr.setZipCode("234244");
		try
        { 
			OrderService.barrier.await(3000, TimeUnit.MILLISECONDS); 
            // number of parties waiting at the barrier 
            System.out.println("Number of parties waiting at the barrier "+ 
            "at this point = " + OrderService.barrier.getNumberWaiting());  
        } catch (InterruptedException | BrokenBarrierException e) { 
            e.printStackTrace(); 
        } 
		return adr;
	}
	
}
