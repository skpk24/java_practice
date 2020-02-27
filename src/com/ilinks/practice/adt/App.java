package com.ilinks.practice.adt;

public class App {

	public static void main(String[] args) {
		Counter cntr = new Counter("MyCounter");
		
		cntr.increment();
		cntr.increment();
		cntr.increment();
		
		System.out.println(cntr.getCurrentValue());
		System.out.println(cntr.toString());

	}

}
