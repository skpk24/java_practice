package com.ilinks.practice.java.tree;

import java.util.Stack;

public class ZigZagTreeTraversal {
	
	public static void traversl(Node root) {
		Stack<Node> currentLevel = new Stack<>();
		Stack<Node> nextLevel = new Stack<>();
		
		boolean rightToLeft = true;
		//while()
	}
	
	public static void main(String args[]) {
		
		
		Node root = TreeUtil.populateTree();
		String array = "40 30 32 35 20 15 55 50 62 59";
	    
	    traversl(root);
	}
}
