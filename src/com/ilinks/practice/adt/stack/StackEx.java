package com.ilinks.practice.adt.stack;

import java.util.Arrays;

public class StackEx {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public StackEx(int maxSize) {
		this.maxSize = maxSize;
		this.stackArray = new char[this.maxSize];
		this.top = -1;
	}
	
	public void push(char j) {
		if(isFull()) {
			System.out.println("FULL");
			return;
		}
		top++;
		stackArray[top] = j;
		System.out.println(toString());
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("EMPTY");
			return '\u0000';
		}
		char temp = stackArray[top];
		top--;
		System.out.println(toString());
		return temp;
	}
	
	public char peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return top == -1?true:false;
	}
	
	public boolean isFull() {
		return top == maxSize - 1 ? true:false;
	}
	
	public String toString() {
		if(top < 0)return "";
		return Arrays.toString(Arrays.copyOfRange(stackArray, 0, top+1));
	}
}
