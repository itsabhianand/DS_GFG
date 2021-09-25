package com.dsa.sheet.binarytree;

import java.util.LinkedList;
import java.util.Queue;

// Refer code Library

public class HeightOfTree {
	
	static Node root;
	static class Node {
		int data;
		Node left, right;
		
		Node(int value){
			data = value;
			left = null;
			right = null;
		}
	}
	
	// Recursive
	public static int heightRecursive(Node root) {
		if(root == null) {
			return -1;
		}
		int leftHeight = heightRecursive(root.left);
		int rightHeight = heightRecursive(root.right);
		int result = (Math.max(leftHeight, rightHeight) + 1); // whenever it will return height to its previous parent node it will also include itself so adding +1.
		return result;
	}
	
	// Iterative
	
	public static int heightIterative(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int size = 1;
		int height =0;
		while(!q.isEmpty()) {
			Node temp = q.poll();
			if(temp.left != null) {
				q.add(temp.left);
			}
			if(temp.right != null) {
				q.add(temp.right);
			}
			size--;
			if(size == 0) {
				height++;
				size =q.size();
			}
			
		}
		
		return height - 1;
	}
	public static void main(String[] args) {
		HeightOfTree tree = new HeightOfTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.left.left = new Node(6);
		int heightRecursive = HeightOfTree.heightRecursive(root);
		System.out.println("Height of a tree in recursive way is : " + heightRecursive);
		//int heightIterative = HeightOfTree.heightIterative(root);
		//System.out.println("Height of a tree in Iterative way is : " + heightIterative);
	}

}
