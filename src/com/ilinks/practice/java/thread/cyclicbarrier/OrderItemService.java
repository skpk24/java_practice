package com.ilinks.practice.java.thread.cyclicbarrier;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import com.ilinks.practice.java.thread.cyclicbarrier.entity.OrderItem;

public class OrderItemService implements Callable<List<OrderItem>> {
		
	private String orderId;
	
	public OrderItemService(String orderId) {
		this.orderId = orderId;
	}
	

	@Override
	public List<OrderItem> call() throws Exception {
		System.out.println("Creating Items");
		List<OrderItem> items = new ArrayList<>();
		for(int i  = 0; i<10; i++) {
			OrderItem item = new OrderItem();
			item.setOrderId(orderId);
			item.setItemSeqId(i+1);
			item.setProductId("productId"+i+1);
			item.setProductName("productName"+i+1);
			item.setQuantity(new BigDecimal(i+1));
			item.setPrice(new BigDecimal((i+1)*4));
			items.add(item);
			//System.out.println(item);
		}
		return items;
	}

}
