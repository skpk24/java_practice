package com.ilinks.java;

import java.util.Arrays;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int[] arr = {12, 32, 43, 11, 23};
        
        System.out.println(Arrays.stream(arr).sorted().distinct().limit(2).skip(1).findFirst());
    }

}
