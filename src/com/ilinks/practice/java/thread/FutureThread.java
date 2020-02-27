package com.ilinks.practice.java.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureThread {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		Future<Integer> future = service.submit(new Task());
		
		try {
			Integer result = future.get();
			System.out.println("Future Value : "+result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} 
	}
}

class Task implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		return new Random().nextInt();
	}
	
}