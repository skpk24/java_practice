package com.ilinks.practice.adt.queue;

public class Queue {
	private int in;
	private int out;
	private long qArr[];
	private int size;
	private int nItems;
	
	public Queue(int size) {
		this.size = size;
		this.qArr = new long[this.size];
		this.in = 0;
		this.out = -1;
		this.nItems = 0;
	}
	
	public void insert(long j) {
		qArr[in++] = j;
		nItems++;
	}
	
	public long pull() {
		long temp = qArr[out];
		out--;
		return temp;
	}
	
	public boolean isEmpty() {
		return in == out;
	}
	
	public boolean ifFull() {
		return false;
	}
}
