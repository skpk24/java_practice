package com.ilinks.practice.java.tree.recursion.btree;

import com.ilinks.practice.java.tree.Node;

public class PostOrder {
	//Left, Right, Root
	public void traverse(Node root) {
		if(root == null) {
			return ;
		}
		traverse(root.left);
		traverse(root.right);
		System.out.println(root.data);
	}
}
