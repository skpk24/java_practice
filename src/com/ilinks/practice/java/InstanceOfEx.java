package com.ilinks.practice.java;

interface Vehicle{
	
}

class Car implements Vehicle{
	public Car() {}
	
	public boolean typeOf() {
		Vehicle v = new Car();
		
		return v instanceof Car;
	}
}

public class InstanceOfEx {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("Car == "+c.typeOf());
	}

}
