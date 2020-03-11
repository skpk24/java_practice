package com.ilinks.practice.java.thread.cyclicbarrier;

import java.math.BigDecimal;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.ilinks.practice.java.thread.cyclicbarrier.entity.OrderAdjustment;

public class OrderAdjustmentService implements Callable<OrderAdjustment> {
	
	public OrderAdjustment call() {
		System.out.println("Creating Adjustment");
		try
        { 
			OrderService.barrier.await(3000, TimeUnit.MILLISECONDS); 
            // number of parties waiting at the barrier 
            System.out.println("Number of parties waiting at the barrier "+ 
            "at this point = " + OrderService.barrier.getNumberWaiting()); 
        } catch (InterruptedException | BrokenBarrierException | TimeoutException e) { 
            e.printStackTrace(); 
        } 
		return OrderAdjustment.getInstance("TAX", new BigDecimal(5));
	}

}
