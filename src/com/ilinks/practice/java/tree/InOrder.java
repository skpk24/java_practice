package com.ilinks.practice.java.tree;

import java.util.Stack;

public class InOrder {
	
	public static void traverse(Node root) {
		
		if(root == null) {
			return ;
		}
		
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			Node node = stack.pop();
			
			if(node.left != null) {
				stack.push(root.left);
			}
			System.out.println(node.data);
			if(node.right != null) {
				stack.push(root.right);
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		Node root = TreeUtil.populateTree();
		String array = "40 30 32 35 20 15 55 50 62 59";
		traverse(root);
	}

}
