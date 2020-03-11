package com.ilinks.practice.java8;

public class SingletonThreadSafe {
	
	private static SingletonThreadSafe singleton;
	
	private SingletonThreadSafe() throws Exception{
		throw new Exception();
	}
	
	public static SingletonThreadSafe getInstance() {
		
		if(singleton ==  null) {
			synchronized(SingletonThreadSafe.class) {
				try {
					if(singleton ==  null)
					return new SingletonThreadSafe();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return singleton;
	}
}
