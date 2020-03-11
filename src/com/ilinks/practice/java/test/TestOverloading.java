package com.ilinks.practice.java.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class A{
	public void m1() throws IOException{
		System.out.println("In M1");
	}
}

class B extends A{
	public void m1() throws FileNotFoundException{
		System.out.println("In B M1");
		throw new FileNotFoundException();
	}
}

public class TestOverloading {
	public static void main(String args[]) {
		A a = new A();
		try {
			a.m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a  = new B();
		try {
			a.m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(10*2);
		String str = new String("Cheggers2019");
		System.out.println(str.substring(2, str.substring(0,2).length()));
		
		System.out.println(5 - Math.random()%10);
		
		List<String> list = new ArrayList<>();
		
		
	}
}
