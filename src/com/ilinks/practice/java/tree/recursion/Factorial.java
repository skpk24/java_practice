package com.ilinks.practice.java.tree.recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	
	public static void main(String arge[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value n : ");
		long n = scanner.nextLong();
		BigInteger binN = BigInteger.valueOf(n);
		System.out.println("Factorial of "+n+" is "+findFactorial(binN) );
	}
	
	public static BigInteger findFactorial(BigInteger n) {
		
		if(n.equals(BigInteger.ZERO)) {
			return BigInteger.ONE;
		}
		BigInteger nMinusOne = n.subtract(BigInteger.ONE);
		return n.multiply(findFactorial(nMinusOne));
	}
	
	public static long findLFact(long n) {
		if(n == 0) {
			return 1;
		}
		return (n*findLFact(n-1));
	}
}
