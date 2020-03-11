package com.ilinks.practice.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class Samples {
	
	public static void main(String ...args) {
		//Find the factorial of 5 
		//Imparative type of programming
		int factorial = 1;
		for(int i = 1; i <= 5; i++) {
			factorial *=i;
		}
		System.out.println(" Factorial Of 5 : "+factorial);
		
		//Declarative type of programming
		factorial = IntStream.rangeClosed(1,5).reduce(1, (a, b) -> a*b);
		System.out.println("Factorial of 5 = "+factorial);
		
		//Find the longest string 
		List<String> strList = Arrays.asList("pradip","pradeep", "kumar", "ilinksinfotech", "skpk24");
		
		Optional<String> largest = strList.stream().reduce((a,b)->a.length()>b.length()?a:b);
		
		if(largest.isPresent())
			System.out.println("Largest String : "+largest.get());
		
		Optional<String> largest2 = strList.stream().max(Comparator.comparing(String::length));
		if(largest2.isPresent())
			System.out.println("largest2 String : "+largest2.get());
		
		//Second largest string in a List
		String[] strArr = {"a","b"};
		Optional<String> secondLargest = strList.stream().reduce((a,b)->{
			if(a.length() > b.length()) {
				if(strArr[0].length() < a.length()) {
					strArr[1] = strArr[0];
					strArr[0] = a;
				}else if(a.length() > strArr[1].length() ) {
					strArr[1] = a;
				}
				return strArr[1];
			}else {
				return b;
			}
		});
		
		if(secondLargest.isPresent())
			System.out.println("secondLargest String : "+secondLargest.get());
		
		int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		
		System.out.println(Arrays.stream(arr).max().getAsInt());
		System.out.println();
		
		int temp[] = {0};
		System.out.println("Fibonacci  Series : "+IntStream.rangeClosed(2, 10).reduce((a,b)->{
			temp[0] = a+b;
			System.out.println(temp[0]);
			a=b;
			b = temp[0];
			return a;
			}).getAsInt());
		
		System.out.println("Fibonacci  Series : ");
		int a = 1, b = 1, c = 0;
		System.out.println(" "+c);
		System.out.println(" "+a);
		System.out.println(" "+b);
		for(int i = 2; i < 10; ++i) {
			c = a + b;
			System.out.println(" "+c);
			a = b;
			b = c;
			
		}
		
	}
}
