package com.ilinks.practice.java.thread.pc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PcTest {
	

	public static void main(String[] args) {
		List<Integer> pcList = new ArrayList<>(4);
		Producer producer = new Producer(pcList);
		Consumer consumer = new Consumer(pcList);
		
		Thread prdThread = new Thread(producer, "Producer");
		Thread conThread = new Thread(consumer, "Consumer");
		
		prdThread.start();
		conThread.start();
		
//		try {
//			conThread.join(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
