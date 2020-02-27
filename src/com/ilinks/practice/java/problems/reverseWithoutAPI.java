package com.ilinks.practice.java.problems;

public class reverseWithoutAPI {

	public static void main(String[] args) {
		String str = "Pradeep KumarSK";
		long now = System.currentTimeMillis();
		System.out.println(now+" = Original String : "+ str);		
		char[] chrs = str.toCharArray();
		char[] temp = new char[str.length()];
		int j = 0;
		for(int i = chrs.length-1; i >= 0; i--) {
			temp[j++] = chrs[i];
		}
		System.out.println((System.currentTimeMillis() - now)+" = Reversed String : "+String.valueOf(temp));
				
	}
}
