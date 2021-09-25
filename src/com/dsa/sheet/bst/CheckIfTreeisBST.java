package com.dsa.sheet.bst;

public class CheckIfTreeisBST {
	
	
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
	
	
   private static boolean checkBST(Node root,Integer low, Integer high) {
		
		if(root == null)
			return true;
		
		if(low!=null && root.data<=low || high!=null && root.data>=high)
			return false;
		
		return checkBST(root.left, low, root.data) && checkBST(root.right, root.data, high);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckIfTreeisBST tree = new CheckIfTreeisBST();
		tree.root = new Node(10);
		tree.root.left = new Node(5);
		tree.root.right = new Node(13);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(11);
		tree.root.right.right = new Node(15);
		
		boolean result = checkBST(tree.root, null, null);
		System.out.println(result);
	}

}
