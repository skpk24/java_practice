package com.ilinks.practice.java;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.Serializable;
import java.util.RandomAccess;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		LinkedList ls = new LinkedList();
		
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof RandomAccess);
		System.out.println(ls instanceof Serializable);
		System.out.println(ls instanceof RandomAccess);
		
		
	}

}
