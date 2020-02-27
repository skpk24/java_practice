package com.ilinks.practice.java.tree.recursion.btree;

import com.ilinks.practice.java.tree.Node;
import com.ilinks.practice.java.tree.TreeUtil;

public class BinaryTreeTraversal {

	public static void main(String[] args) {
		InOrder inorder = new InOrder();
		Node  root = TreeUtil.populateTree();
		String array = "40 30 32 35 20 15 55 50 62 59";
		System.out.println(array);
		System.out.println("In Order Traversal : ");
		inorder.traverse(root);
		System.out.println("Pre Order Traversal : ");
		PreOrder preOrder = new PreOrder();
		preOrder.traverse(root);
		System.out.println("Post Order Traversale : ");
		PostOrder postOrder = new PostOrder();
		postOrder.traverse(root);
	}

}
