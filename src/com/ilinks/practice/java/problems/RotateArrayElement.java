package com.ilinks.practice.java.problems;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an unsorted array arr[] of size N, rotate it by D elements (clockwise). 

Input:
The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.

Output: 
For each testcase, in a new line, output the rotated array.

Constraints:
1 <= T <= 200
1 <= N <= 107
1 <= D <= N
0 <= arr[i] <= 105

Example:
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6

Explanation :
Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.
*/

public class RotateArrayElement {
	
	public static void rotate(int arr[], int d) {
		if(d == arr.length) return;
		int temp[] = new int[d];
		int i = 0;
		for(; i < arr.length; i++) {
			if(i < d) {
				temp[i] = arr[i];
			}
			if(d+i < arr.length) {
				arr[i] = arr[d+i];
			}
		}
		i -= d;
		for(int j = 0; i < arr.length; i++) {
			if(j < d)
			arr[i] = temp[j++];
		}
	}
	
	public static void rotate2(int arr[], int d) {
		if(d == arr.length) return;
		if(d == 0) return;
		int temp[] = new int[arr.length];
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			int ind = (i+n-d)%n;
			System.out.println("ind = "+ind);
			temp[ind] = arr[i];
		}
		print(temp);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		
		for(int i = 1; i <= testCases; i++) {
			int size = scan.nextInt();
			int rotateSize = scan.nextInt();
			int arr[] = new int[size];
			for(int j = 0; j < size; j++) {
				arr[j] = scan.nextInt();
			}
			rotate2(arr, rotateSize);
			System.out.println();
			print(arr);
		}
		
		System.out.println(3%5);
		
	}
	
	public static void print(int[] arr) {
		System.out.println(Arrays.toString(arr).replace("[", "").replace(",","").replace("]", ""));
	}

}
