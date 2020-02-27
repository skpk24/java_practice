package com.ilinks.practice.java;

import java.util.ArrayList;

public class GenericTest {
	
	public static void main(String ...g) {
		ArrayList myList = new ArrayList();
		
		myList.add("Pradeep");
		myList.add(100);
		myList.add(false);
		
		for(int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
	}
}
