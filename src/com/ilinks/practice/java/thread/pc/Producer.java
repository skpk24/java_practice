package com.ilinks.practice.java.thread.pc;

import java.util.List;
import java.util.Random;

public class Producer implements Runnable {
	
	private Random random = new Random();
	private List<Integer> pcList;
	
	public Producer(List pcList) {
		this.pcList = pcList; 
	}
	
	@Override
	public void run() {
		
		while(true) {
			synchronized(pcList) {
				pcList.add(random.nextInt());
				if(pcList.size() == 4) {
					try {
						pcList.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}

}
