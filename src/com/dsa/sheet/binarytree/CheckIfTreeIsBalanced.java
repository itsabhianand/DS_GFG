package com.dsa.sheet.binarytree;

// Refer code Library.

public class CheckIfTreeIsBalanced {
	
	static boolean flag = true;
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
	
	public static int checkBalanced(Node root) {
		if(root == null) {
			return 0;
		}
		int x = checkBalanced(root.left);
		int y = checkBalanced(root.right);
		if(Math.abs(x-y) > 1) {
			flag = false;
		}
		
		return (Math.max(x, y) + 1);
	}
	
	public static boolean func(Node root) {
		checkBalanced(root);
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckIfTreeIsBalanced tree = new CheckIfTreeIsBalanced();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.left.left = new Node(4);
		tree.root.left.left.left.left = new Node(5);
		tree.root.right = new Node(6);
		tree.root.right.right = new Node(7);
		boolean flag = CheckIfTreeIsBalanced.func(root);
		if(flag == true) {
			System.out.println("Yes Tree is balanced");
		}
		else {
			System.out.println("Tree is not balanced");
		}
	}

}
