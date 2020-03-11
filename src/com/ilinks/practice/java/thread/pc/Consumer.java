package com.ilinks.practice.java.thread.pc;

import java.util.List;

public class Consumer implements Runnable {
	
	private List<Integer> pcList;
	
	public Consumer(List pcList) {
		this.pcList = pcList;
	}

	@Override
	public void run() {
		while(true) {
			synchronized(pcList) {
				for(int i = 0; i < pcList.size(); i++) {
					System.out.println(pcList.get(i));
					pcList.remove(i);
				}
				
				if(pcList.size() == 0) {
					pcList.notifyAll();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}

	}

}
