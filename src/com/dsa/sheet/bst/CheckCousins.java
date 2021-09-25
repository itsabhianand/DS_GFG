package com.dsa.sheet.bst;

public class CheckCousins {
	
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
    
	public static boolean isCosuin(Node root, Node key1, Node key2) {
		int level_1 = level(root, key1, 1);
		int level_2 = level(root, key2, 1);
		
		if(level_1 == level_2) {
			return !(checkSiblings(root, key1.data, key2.data));
		}
		
		return false;
	}
	
	public static int level(Node root, Node key, int level) {
		if(root==null)
			return 0;
		
		if(key.data == root.data)
			return level;
		
		if(key.data < root.data) 
			return level(root.left, key, level+1);

		else 
			return level(root.right, key, level+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckCousins tree = new CheckCousins();
		tree.root = new Node(6);
		tree.root.left = new Node(4);
		tree.root.right = new Node(8);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(7);
		tree.root.right.right = new Node(9);
		boolean result = CheckCousins.isCosuin(root, tree.root.left.left, tree.root.right.left);
		if(result) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
