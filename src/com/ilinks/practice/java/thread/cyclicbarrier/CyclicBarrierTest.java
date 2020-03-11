package com.ilinks.practice.java.thread.cyclicbarrier;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.ilinks.practice.java.thread.cyclicbarrier.entity.Order;

public class CyclicBarrierTest {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		for(int i = 0; i < 10;i++)
		service.execute(new OrderService());
		
		//new Thread(new OrderService()).start();
		
//		try {
//			System.out.println("Order Created : "+order.get());
//		} catch (InterruptedException | ExecutionException e) {
//			e.printStackTrace();
//		} 
	}

}
