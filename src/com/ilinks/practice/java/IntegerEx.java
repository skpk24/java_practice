package com.ilinks.practice.java;


import java.lang.Character;

public class IntegerEx {
	
	public static void main(String ...args) {
		Integer in1 = new Integer(100); 
		Integer in2 = new Integer(200);
		Integer in3 = 100;
		
		if(in1.equals(in3)) {
			System.out.println("Yes in1 == 100");
		}else {
			System.out.println("NO");
		}
		
		if(in2 == 200) {
			System.out.println("YES in2 == 200");
		}else {
			System.out.println("NO in2 != 200 ");
		}
	}
}
