package com.ilinks.practice.java.tree;

public class TreeUtil {
	
	public static Node populateTree() {
		//40 30 32 35 20 15 55 50 62 59
		
		Node root = new Node(40);
		Node node30 = new Node(30);
		Node node32 = new Node(32);
		Node node35 = new Node(35);
		Node node20 = new Node(20);
		Node node15 = new Node(15);
		Node node55 = new Node(55);
		Node node50 = new Node(50);
		Node node62 = new Node(62);
		Node node59 = new Node(59);
		
		root.left = node30;
		node30.right = node32;
		node32.right = node35;
		node30.left = node20;
		
		node20.left = node15;
		root.right = node55;
		node55.left = node50;
		node55.right = node62;
		node62.left = node59;
		
		
		
		
//		for(int i = 1; i < arr.length; i++) {
//			if(arr[i] > root.data ) {
//				root.right  = new Node(arr[i]);
//			}else if(arr[i] <= root.data) {
//				root.left = new Node(arr[i]);
//			}
//		}
		
		return root;
	}
}
