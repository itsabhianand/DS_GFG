package com.dsa.sheet.binarytree;

public class CheckIfBinaryTreeIsSumTreeOrNot {
	
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
	
	public static int checkIfSumtree(Node root) {
		if(root == null) {
			return 0;
		}
		
		if(root.left == null && root.right == null) {
			return root.data;
		}
		
		int left = checkIfSumtree(root.left);
		int right = checkIfSumtree(root.right);
		
		if(root.data != left + right) {
			return 0;
		}
		
		return(root.data + left + right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckIfBinaryTreeIsSumTreeOrNot tree = new CheckIfBinaryTreeIsSumTreeOrNot();
		tree.root = new Node(70);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(10);
		tree.root.left.right = new Node(10);
		int result = CheckIfBinaryTreeIsSumTreeOrNot.checkIfSumtree(root);
		if(result == 0) {
			System.out.println("Tree is not sum tree !!!");
		}
		else {
			System.out.println("Tree is Sum Tree !!!");
		}
	}

}
