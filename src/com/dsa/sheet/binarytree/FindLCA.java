package com.dsa.sheet.binarytree;

/*
 * Lowest Common Ancestor : The idea is to traverse the tree starting from the root. 
 * If any of the given keys (n1 and n2) matches with the root, then the root is LCA.
 * 
 * We will find the keys on the left and right side of a node, if there are no value at either side then 
 * we will send null. 
 * 
 * if there is no value at one side, we will be sending null and will check the other side. Wherever we get the first node as one of the keys, return that as LCA
 * 
 * if there are both the values on either sides of a node, then the root node is the LCA 
 * 
 * 
 * */

public class FindLCA {
	
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
	
	public static Node findLCA(Node root, int key1, int key2) {
		if(root == null) {
			return null;
		}
		if(root.data == key1 || root.data == key2) {
			return root;
		}
		
		Node left = findLCA(root.left, key1, key2);
		Node right = findLCA(root.right, key1, key2);
		
		if(left != null && right != null) {
			return root;
		}
		
		if(left != null) {
			return left;
		}
		else {
			return right;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindLCA tree = new FindLCA();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.left.left = new Node(6);
		tree.root.left.right.right = new Node(7);
		tree.root.right.right = new Node(8);
		Node root = FindLCA.findLCA(tree.root, 3, 8);
		System.out.println("LCA Root Node is : " + root.data);
		
	}

}
