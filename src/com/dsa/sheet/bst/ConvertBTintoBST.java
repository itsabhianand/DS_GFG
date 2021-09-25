package com.dsa.sheet.bst;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ConvertBTintoBST {
	
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
	
	// Function to traverse BT in inorder and store keys in set.
	
	public static void extractKeys(Node root, Set<Integer> set) {
		if(root == null) {
			return;
		}
		extractKeys(root.left, set);
		set.add(root.data);
		extractKeys(root.right, set);
		
	}
	
	// Function to store keys back in BT to form BST by reading from Set in Inorder fashion.
	
	public static void convertBTIntoBST(Node root, Iterator<Integer> iterator) {
		if(root == null) {
			return;
		}
		convertBTIntoBST(root.left, iterator);
		root.data = iterator.next(); // replacing node value
		convertBTIntoBST(root.right, iterator);
	}
	
	public static void inOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertBTintoBST tree = new ConvertBTintoBST();
		tree.root = new Node(8);
		tree.root.left = new Node(3);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(10);
		tree.root.left.right = new Node(2);
		tree.root.right.left = new Node(4);
		tree.root.right.right = new Node(6);
		System.out.println("Binary Tree is : ");
		inOrderTraversal(tree.root);
		
		Set<Integer> set = new TreeSet<Integer>();
		extractKeys(tree.root, set);
		
		Iterator<Integer> it = set.iterator();
		convertBTIntoBST(tree.root, it);
		System.out.println();
		System.out.println("BST formed is : ");
		inOrderTraversal(tree.root);
		
	}

}
