package com.dsa.sheet.bst;

public class CheckSiblings {
	
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
	
	public static boolean checkSiblings(Node root, int key1, int key2) {
		if(root == null) {
			return false;
		}
		
		if(root.left != null && root.right != null) {
			int left = root.left.data;
			int right = root.right.data;
			
			if(left == key1 && right == key2) {
				return true;
			}
			else if(left == key2 && right == key1) {
				return true;
			}
		}
		
		if(root.left != null) {
			return checkSiblings(root.left, key1, key2);
		}
		
		if(root.right != null) {
			return checkSiblings(root.right, key1, key2);
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckSiblings tree = new CheckSiblings();
		tree.root = new Node(6);
		tree.root.left = new Node(4);
		tree.root.right = new Node(8);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(7);
		tree.root.right.right = new Node(9);
		boolean result = CheckSiblings.checkSiblings(root, 4, 8);
		if(result) {
			System.out.println("Yes Nodes are siblings.");
		}
		else {
			System.out.println("No Nodes are not siblings.");
		}
	}

}
