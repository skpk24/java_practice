package com.ilinks.practice.java.tree.recursion.btree;

import com.ilinks.practice.java.tree.Node;

public class InOrder {
	//Left, Root, Right
	public void traverse(Node root) {
		if(root == null) {
			return;
		}
		traverse(root.left);
		System.out.println(root.data);
		traverse(root.right);
	}
}
