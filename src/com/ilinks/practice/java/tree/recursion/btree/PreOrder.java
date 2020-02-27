package com.ilinks.practice.java.tree.recursion.btree;

import com.ilinks.practice.java.tree.Node;

public class PreOrder {
	//Root, left, right
	public void traverse(Node rootnode) {
		if(rootnode == null) {
			return;
		}
		System.out.println(rootnode.data);
		traverse(rootnode.left);
		traverse(rootnode.right);
	}
}
