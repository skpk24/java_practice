package com.ilinks.practice.java.thread.complitable;

import java.util.concurrent.*;
import java.util.function.Function;

public class BadExample {

	public static <U> void main(String[] args) {
		//Suppose if we wanted to do the sequence of operation using thread. 
		//If all tasks are asynch then its a big problem
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		//String orderValue = "";
		Future<String> order1 = service.submit(()->{return "GetOrders111";});
		try {
			String orders = order1.get();
			//orderValue = orders;
			Future<String> orderEnrich = service.submit(()->{return "enrichingOrders : "+orders;});
			Future<String> orderReconciliation = service.submit(()->{return "orderReconciliation : "+orders;});
			Future<String> orderAutoCreate = service.submit(()->{return "orderAutoCreate : "+orders;});
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		//In above code if too many heavy loaded tasks are there then its a big problem, for ex. get order is fetching millions of records and other services need to wait above code is going to fail.
		
		ProcessOrder p = (String s)->{System.out.println("S "+s); return 0;};
		//Solution
		CompletableFuture<String> cfuture = new CompletableFuture<>();
		for(int i = 0; i < 10; i++) {
			cfuture.supplyAsync(()->{return "GetOrders111";})
						.thenApply((x)->{return "enrichingOrders";})
						.thenApply((x)->{return "orderReconciliation";})
						.thenAccept((x)->{System.out.println("orderAutoCreate");});
		}
		
	}
}

@FunctionalInterface
interface ProcessOrder 
{ 
    int process(String x); 
} 

//class GetOrder implements Callable<String>{
//	@Override
//	public String call() throws Exception {
//		System.out.println("Getting orders ");
//		return "OrderGet";
//	}
//}
