package com.dsa.sheet.bst;

import com.dsa.sheet.bst.InsertInBST.Node;

public class FindInOrderPreOrderSuccessor {
	
	static Node store;
	static Node store1;
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
	// 5 10 14 15 16 30 32 35 36 37 40 45 50 80 90 100
	public static void findInOrderSuccessor(Node root, Node p) {
		if(root == null) {
			return;
		}
		
		if(p.right != null) {
			Node temp = p.right;
			while(temp.left != null) {
				temp = temp.left;
			}
			
			System.out.println("InOrder Successor is : " + temp.data);
		}
		else {
			while(root.data != p.data) {
				if(p.data <= root.data) {
					store = root;
					root = root.left;
				}
				else {
					root = root.right;
				}
			}
			System.out.println("Inorder successor found is : " + store.data);
		}
		
	}
	
	private static void inorderTraversal(Node root2) {
		if(root2==null)
			return;
		inorderTraversal(root2.left);
		System.out.print(root2.data+" ");
		inorderTraversal(root2.right);

	}
	// 5 10 14 15 16 30 32 35 36 37 40 45 50 80 90 100
	public static void findPredecessor(Node root, Node p) {
		if(root == null) {
			return;
		}
		if(p.left != null) {
			Node temp = p.left;
			while(temp.right != null) {
				temp = temp.right;
			}
			
			System.out.println("Predecessor is : " + temp.data);
		}
		
		else {
			while(root.data != p.data) {
				if(p.data > root.data) {
					store1 = root;
					root = root.right;
				}
				else {
					root = root.left;
				}
			}
			
			System.out.println("Predecessor found is : " + store1.data);
		}
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindInOrderPreOrderSuccessor tree = new FindInOrderPreOrderSuccessor();
		tree.root = new Node(50);
		tree.root.left = new Node(16);
		tree.root.left.left = new Node(14);
		tree.root.left.left.left = new Node(10);
		tree.root.left.left.left.left = new Node(5);
		tree.root.left.left.right = new Node(15);
		tree.root.left.right = new Node(40);
		tree.root.left.right.left = new Node(35);
		tree.root.left.right.right = new Node(45);
		tree.root.left.right.left.left = new Node(32);
		tree.root.left.right.left.left.left = new Node(30);
		tree.root.left.right.left.right = new Node(36);
		tree.root.left.right.left.right.right = new Node(37);
		tree.root.right = new Node(90);
		tree.root.right.left = new Node(80);
		tree.root.right.right = new Node(100);
		inorderTraversal(tree.root);
		System.out.println();
		FindInOrderPreOrderSuccessor.findInOrderSuccessor(root, tree.root.left.right.left.right);
		FindInOrderPreOrderSuccessor.findPredecessor(root, tree.root.left.right.left.right);
	}

}
