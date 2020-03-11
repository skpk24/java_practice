package com.ilinks.practice.java.thread.cyclicbarrier;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.ilinks.practice.java.thread.cyclicbarrier.entity.Address;
import com.ilinks.practice.java.thread.cyclicbarrier.entity.Order;
import com.ilinks.practice.java.thread.cyclicbarrier.entity.Order.OrderBuilder;
import com.ilinks.practice.java.thread.cyclicbarrier.entity.OrderAdjustment;
import com.ilinks.practice.java.thread.cyclicbarrier.entity.OrderItem;

public class OrderService implements Runnable {
	
	public static CyclicBarrier barrier = new CyclicBarrier(4);
	
	@Override
	public void run() {
		
		System.out.println("Number of parties required to trip the barrier = "+ barrier.getParties()); 
		
		String orderId = UUID.randomUUID().toString();
		OrderBuilder builder = new Order.OrderBuilder(orderId, new Date());
		
		OrderItemService itemSer = new OrderItemService(orderId);
		OrderAdjustmentService adjustmentSer = new OrderAdjustmentService();
		OrderAddressService billingAddressSer = OrderAddressService.getInstance("BILLING");
		OrderAddressService shippingAddressSer = OrderAddressService.getInstance("SHIPPING");
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		Future<List<OrderItem>> itemFuture = service.submit(itemSer);
		Future<OrderAdjustment> adjFuture = service.submit(adjustmentSer);
		Future<Address> bilFuture = service.submit(billingAddressSer);
		Future<Address> shipFuture = service.submit(shippingAddressSer);
		
		try
        { 
			OrderService.barrier.await(); 
        } catch (InterruptedException | BrokenBarrierException e) { 
            e.printStackTrace(); 
        } 
		
		System.out.println("Get the futures");
		try {
			builder.setItems(itemFuture.get());
			builder.setAdjustment(adjFuture.get());
			builder.setBillingAddress(bilFuture.get());
			builder.setShippingAddress(shipFuture.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} 
		System.out.println("Get the futures 222");
		//No ERROR so calculate 
		BigDecimal gross = builder.calGrossTotal(builder.getItems());
		builder.setGrossTotal(gross);
		builder.setNetTotal(builder.calNetTotal(gross, builder.getAdjustment().getAdjustmentAmt()));
		
		Order order = builder.build();
		System.out.println("Order Created successful! "+order);
		// Resetting the newBarrier 
        barrier.reset();
        System.out.println("Barrier reset successful"); 
		//return order;
	}

}
