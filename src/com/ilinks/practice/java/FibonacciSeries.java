package com.ilinks.practice.java;

import java.util.Scanner;
import java.util.Arrays;

public class FibonacciSeries {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the value of n : ");
		int n = scanner.nextInt();
		System.out.println("total : "+fibd(n));
	}
	
	public static int fib(int n) {
		if(n <= 0) return 0;
		int a = 0, b = 1, c = 0;
		
		System.out.println(a);
		System.out.println(b);
		for(int i = 2; i <= n; i++) {
			c = a + b;
			a = b; 
			b = c;
			System.out.println(c);
		}
		return b;
	}
	
	//fib in recursive
	public static int fibr(int n) {
		if(n <= 1) {
			System.out.println(0);
			System.out.println(1);
			return n;
		}
		
		System.out.println(n);
		return fibr(n-1) + fibr(n-2);
	}
	
	//fib in dynamic programming
	public static int fibd(int n) {
		int f[] = new int[n+2];
		
		f[0] = 0;
		f[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		System.out.println(Arrays.toString(f));
		return f[n];
	}
	
}
