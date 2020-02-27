package com.ilinks.practice.designpattern.creational.singleton;

public class TestClonable implements Cloneable  {
	
	SingletonFullSafe fullsafe = SingletonFullSafe.getInstance();
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
