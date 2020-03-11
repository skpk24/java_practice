package com.ilinks.practice.java.problems;

public class CharCount {
	public static String countDuplicate(String message){
	    char a[] = message.toCharArray();
	    String str = "";
	    if(message.length() == 0)return message;
	     if(message.length() == 1)return message;
	     if(message.length() == 2 && message.charAt(0) == message.charAt(0)) return message.charAt(0)+"2";

	    int temp = 0;
	    for(int i = 0; i < a.length; i++){
	      //System.out.println(Arrays.toString(a));
	         int cnt = 1;
	      if(a[i] != 0 &&(i+1) < a.length && a[i] == a[i+1]){
	          str += a[i];
	          cnt++;
	          for(int j = i+2; j < a.length; j++){
	              if(a[i] == a[j]){
	               cnt++;
	                a[j-1] = 0;
	              }else{
	                //a[j] = 0;
	                temp = j;
	               break;
	              }
	            }
	          a[temp-1] = 0;
	          str += cnt;
	        }else{
	            if(a[i] != 0)
	                  str +=a[i];
	        }
	    }
	    return str;
	  }
	 
	  public static void main(String args[]){
	    String str1 = "abc";
	    String str = "abbbbbbccdeffg";
	    System.out.println(countDuplicate(str));
	    System.out.println(countDuplicate(str1));
	  }
}
