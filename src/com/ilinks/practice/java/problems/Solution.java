package com.ilinks.practice.java.problems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the triplets function below.
    static long triplets(int[] a, int[] b, int[] c) {
        long result = 0;
        int i = 0, j = 0, k = 0, l = 0, oldj = 0;
        while(a[0] > b[l++] && (l < b.length)){
            i = l;
        }
        l = 0;
        while(b[l++] < c[0] && (l < b.length)){
            j = l;
            oldj = l;
        }
        if(j == b.length){
            return 0l;
        }
        System.out.println("$$$$$$$$$$$$$$ i = "+i+", j = "+j+", k = "+k);
        
        for(; i < 10;){
        	System.out.println("i = "+i+", j = "+j+", k = "+k);
            if(a[i] <= b[j] && b[j] >= c[k]){
                result = result + 1;
                if(k + 1 < c.length){
                    k++;
                }else{
                    k = 0;
                }
                
            }else if(a[i] <= b[j] && b[j] < c[k]){
                if(j+1 < b.length){
                    j++;
                }else{
                    j = oldj;
                    if(i+1 < a.length) {
                		i++;
                	}
                }
                k = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {

        int[] arra = new int[] {1, 3, 5};
        int[] arrb = new int[] {2, 3};
        int[] arrc = new int[] {1, 2, 3};

        long ans = triplets(arra, arrb, arrc);
        System.out.println(ans);
    }
}
