package com.dsa.sheet.binarytree;

import java.util.Stack;

// Refer Tushar Roy code of using 2 stack.

public class ZigZagTraversal {
	
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
	
	// Using 2 stack
	public static void zigZagTraversal(Node root) { 
		if(root == null) {
			return;
		}
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		s1.push(root);
		
		while(!s1.isEmpty() || !s2.isEmpty()) {
			while(!s1.isEmpty()) {
				root = s1.pop();
				System.out.println(root.data + " ");
				if(root.left != null) {
					s2.push(root.left);
				}
				if(root.right != null) {
					s2.push(root.right);
				}
			}
			while(!s2.isEmpty()) {
				root = s2.pop();
				System.out.println(root.data + " ");
				if(root.right != null) {
					s1.push(root.right);
				}
				if(root.left != null) {
					s1.push(root.left);
				}
			}
		}
	}
	
    
	private static void zigzagOptimized(Node parent) {
		Stack<Node> p = new Stack<>();
		Stack<Node> c = new Stack<>();
		p.push(parent);
		int level = 0;
		while (!p.isEmpty()) {
			Node node = p.pop();
			System.out.println(node.data + " ");
			if (level % 2 == 0) {
				if (node.left != null) {
					c.push(node.left);
				}
				if (node.right != null) {
					c.push(node.right);
				}
			} else {
				if (node.right != null) {
					c.push(node.right);
				}
				if (node.left != null) {
					c.push(node.left);
				}
			}
			if (p.size() == 0) {
				level++;
				p = c;
				c = new Stack<>();
			}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZigZagTraversal tree = new ZigZagTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		System.out.println("ZigZag Traversal is : ");
		ZigZagTraversal.zigZagTraversal(root);
		System.out.println("ZigZag Traversal Optimized : ");
		zigzagOptimized(root);
	}

}
