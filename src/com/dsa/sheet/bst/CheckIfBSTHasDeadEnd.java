package com.dsa.sheet.bst;

public class CheckIfBSTHasDeadEnd {
	
	static boolean flag = false;
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
	
	public static void checkDeadEnd(Node root, int min, int max) {
		if(root == null) {
			return;
		}
		
		if(flag) {
			return;
		}
		
		if(root.left == null && root.right == null) {
			if(min == max) {
				flag = true;
			}
			return;
		}
		checkDeadEnd(root.left, min, root.data - 1);
		checkDeadEnd(root.right, root.data + 1, max);
		System.out.println(root.data);
		return;
	}
	
	public static boolean checkDeadEndUtility(Node root, int min, int max) {
		checkDeadEnd(root, min, max);
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckIfBSTHasDeadEnd tree = new CheckIfBSTHasDeadEnd();
		tree.root = new Node(25);
		tree.root.left = new Node(18);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(17);
		tree.root.left.right = new Node(20);
		tree.root.left.right.left = new Node(19);
		tree.root.right.right = new Node(35);
		boolean result = checkDeadEndUtility(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		if(result) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
