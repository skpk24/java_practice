package com.ilinks.practice.java.generics;

import java.util.ArrayList;
import java.util.List;

class Rectangle<T extends Number, E extends Number>{
	private T t;
	private E e;
	
	public Rectangle(T t, E e) {
		this.t = t;
		this.e = e;
	}

	public T getT() {
		return t;
	}

	public E getE() {
		return e;
	}

	public void setT(T t) {
		this.t = t;
	}

	public void setE(E e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Rectangle [t=" + t + ", e=" + e + "]";
	}
	
	@SuppressWarnings("unchecked")
	public <T extends Number> T area() throws UnsupportedOperationException{
		Class<? extends Number> tClass = this.getT().getClass();
		Class<? extends Number> eClass = this.getE().getClass(); 
		
		if(tClass == Integer.class) {
			Integer value1 = Integer.valueOf(this.getT().toString());
			Integer value2 = Integer.valueOf(this.getE().toString());
			Integer multiply = value1.intValue()*value2.intValue();
			return (T)multiply;
		}
		
		if(tClass == Long.class) {
			Long value1 = Long.valueOf(this.getT().toString());
			Long value2 = Long.valueOf(this.getE().toString());
			Long multiply = value1.longValue()*value2.longValue();
			return (T)multiply;
		}
		
		if(tClass == Double.class) {
			Double value1 = Double.valueOf(this.getT().toString());
			Double value2 = Double.valueOf(this.getE().toString());
			Double multiply = value1.doubleValue()*value2.doubleValue();
			return (T)multiply;
		}
		
		throw new UnsupportedOperationException();
	}
}

public class App {

	public static void main(String[] args) {
		List<String> strs = new ArrayList<>();
		
		Rectangle<Number, Number> rect = new Rectangle<>(10,20);
		
		System.out.println("Integer Object : "+(rect.area() instanceof Integer));
		System.out.println("Integer Result : "+rect.area());
		
		rect = new Rectangle<>(10l,20l);
		System.out.println("Long Object : "+(rect.area() instanceof Long));
		System.out.println("Long Result : "+rect.area());
		
		rect = new Rectangle<>(10.00,20.00);
		System.out.println("Long Object : "+(rect.area() instanceof Double));
		System.out.println("Long Result : "+rect.area());
		
		rect = new Rectangle<>(10.00f,20.00f);
		System.out.println("Long Object : "+(rect.area() instanceof Double));
		System.out.println("Long Result : "+rect.area());
		
 	}

}
