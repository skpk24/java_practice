package com.ilinks.practice.java8;

import java.util.*;

public class SortApple {
	
	protected static class Apple{
		private String name;
		private Double price;
		
		public Apple(String name, Double price) {
			this.name = name;
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public Double getPrice() {
			return price;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		
		@Override
		public String toString() {
			return "Apple [name=" + name + ", price=" + price + "]";
		}
		
		
	}

	public static void main(String[] args) {
		List<Apple> apples = new ArrayList<>();
		
		apples.add(new Apple("Apple1", 20.0));
		apples.add(new Apple("apple2", 23.0));
		
		apples.add(new Apple("Apple3", 34.0));
		apples.add(new Apple("apple", 11.0));
		System.out.println("Apples : "+apples);
		
		Collections.sort(apples, (a, b)-> a.getPrice().compareTo(b.getPrice()));
		
		System.out.println("Sorted Apples : "+apples);
		
		SortedSet<Integer> nums = new TreeSet<Integer>();
		nums.add(1);
		nums.add(5);
		nums.add(15);
		nums.add(3);
		nums.add(-10);
		nums.add(4);
		nums.add(20);
		
		SortedSet<Integer> subnum = nums.subSet(1,5);
		System.out.println("Subnums " +subnum);
		System.out.println("subnum.size() " +subnum.size());
	}

}
