package com.dsa.sheet.binarytree;

import java.util.Stack;

// Refer Tushar Roy code.

public class TraversalOfTree {
	
	
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
	
	// LVR
	public static void inOrderTraversalIterative(Node root) {
		if(root == null) {
			return;
		}
		Stack<Node> s = new Stack<Node>();
		Node curr = root;
		while(true) {
			if(curr != null) {
				s.push(curr);
				curr = curr.left;
			}
			else {
				if(s.isEmpty()) {
					break;
				}
				curr = s.pop();
				System.out.println(curr.data + " ");
				curr = curr.right;
			}
		
		}
	}
    
	// VLR
	public static void preOrderIterative(Node root) {
		if(root == null) {
			return;
		}
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		while(!s.isEmpty()) {
			root = s.pop();
			System.out.println(root.data + " ");
			if(root.right != null) {
				s.add(root.right);
			}
			if(root.left != null) {
				s.add(root.left);
			}
		}
	}
	
	// LRV using one stack
	public static void postOrder(Node root) {
		if(root == null) {
			return;
		}
		Stack<Node> s = new Stack<Node>();
		Node curr = root;
		while(!s.isEmpty() || curr != null) {
			if(curr != null) {
				s.push(curr);
				curr = curr.left;
			}
			else {
				Node temp = s.peek().right;
				if(temp == null) {
					temp = s.pop();
					System.out.println(temp.data + " ");
					while(!s.isEmpty() && temp == s.peek().right) {
						temp = s.pop();
						System.out.println(temp.data + " ");
					}
				}
				else {
					curr = temp;
				}
				
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TraversalOfTree tree = new TraversalOfTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("Inorder Iterative Traversal is : ");
		TraversalOfTree.inOrderTraversalIterative(root);
		System.out.println("Preorder Iterative Traversal is :");
		TraversalOfTree.preOrderIterative(root);
		System.out.println("PostOrder Iterative Traversal is : ");
		TraversalOfTree.postOrder(root);
	}

}
