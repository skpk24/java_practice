package com.ilinks.practice.adt.stack;

import java.util.Arrays;

public class App {
	
	public static void main(String ...arg) {
		Stack stack = new Stack(5);
		System.out.println(stack.toString());
		stack.push(10);
		stack.push(22);
		stack.push(100);
		stack.push(2323);
		stack.push(3434);
		stack.push(343);
		stack.push(334);
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println(reverseString("Hello"));
		
		
	}
	
	public static String reverseString(String str) {
		String reverse = "";
		int length = str.length();
		char chArr[] = str.toCharArray();
		
		StackEx stackEx = new StackEx(length);
		for(char ch : chArr) {
			stackEx.push(ch);
		}
		
		while(!stackEx.isEmpty()) {
			reverse += stackEx.pop();
		}
		System.out.println();
		return reverse;
	}
	
}
