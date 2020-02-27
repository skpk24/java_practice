package com.ilinks.practice.java;

import java.util.Arrays;
import java.util.List;

public class StringObjects {
	
	public static void main(String ...args) {
		String s1 = "CAT";
		String s2 = "CAT";
		System.out.println("s1 == s2 : "+(s1 == s2));
		
		String s3 = new String("CAT");
		System.out.println("s1 == s3 : "+(s1 == s3));
		
		String s4 = s3.intern();
		System.out.println("s3 == s4 : "+(s3 == s4));
		
		int a = 11;
		int b = 10;
		
		System.out.println(" a & b = "+(a&b));
		
//		String s1 = "abc";
//		String s2 = new String("abc");
//		String s3 = "abc";
//		String s4 = new String("abc");
//		String s5 = new String("abc").intern();
		remainder();
		
		List<String> words = Arrays.asList(new String[]{"Hello", "World", "2019"});
		String msg = String.join(" ", words);
		System.out.println(msg);
	}
	
	public static void remainder() {
		int a = 53;
		int b = 4;
		
		System.out.println("1. a % b = "+ (a % b));
		System.out.println("2. a % b = "+ (a-((a/b)*b)));
	}
}
