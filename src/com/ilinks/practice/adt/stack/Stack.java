package com.ilinks.practice.adt.stack;

import java.util.Arrays;

public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.stackArray = new long[this.maxSize];
		this.top = -1;
	}
	
	public void push(long j) {
		if(isFull()) {
			System.out.println("FULL : "+j);
			return;
		}
		top++;
		stackArray[top] = j;
		System.out.println(toString());
	}
	
	public long pop() {
		if(isEmpty()) {
			System.out.println("EMPTY");
			return -1;
		}
		System.out.println(toString());
		long temp = stackArray[top];
		top--;
		return temp;
	}
	
	public long peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return top == -1?true:false;
	}
	
	public boolean isFull() {
		return top == maxSize - 1 ? true:false;
	}
	
	public String toString() {
		if(top < 0)return null;
		return Arrays.toString(Arrays.copyOfRange(stackArray, 0, top+1));
	}
}
