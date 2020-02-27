package com.ilinks.practice.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Use2Thread {

	public static void main(String[] args) {
		String s = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		
		char[] c = s.toCharArray();
		
		int mid = s.length() / 2;
		
		Thread t1 = new Thread(()-> {
			for(int i = 0; i <= mid; i++) {
				System.out.println(c[i]+"");
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i = mid+1; i<c.length;i++) {
				System.out.println(c[i]+"");
			}
		});
		
//		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		t2.start();
		
		//ExecutorService 
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(t1);
		service.execute(t2);
		
	}
	

}
