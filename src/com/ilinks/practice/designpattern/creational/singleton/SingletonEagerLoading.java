package com.ilinks.practice.designpattern.creational.singleton;

public class SingletonEagerLoading {
	private static final SingletonEagerLoading instance = new SingletonEagerLoading();
	
	private SingletonEagerLoading() {};
	
	public static SingletonEagerLoading getInstance() {
		return instance;
	}
}
