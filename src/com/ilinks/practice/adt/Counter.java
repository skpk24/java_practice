package com.ilinks.practice.adt;

public class Counter {
	private int counter;
	private String name;
	
	public Counter(String name) {
		this.name = name;
		this.counter = 0;
	}
	
	public void increment() {
		this.counter = this.counter + 1;
	}
	
	public int getCurrentValue() {
		return this.counter;
	}
	
	@Override
	public String toString() {
		return  this.name+ " = "+this.counter;
	}
}	
