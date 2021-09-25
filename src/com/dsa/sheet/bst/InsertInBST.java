package com.dsa.sheet.bst;

public class InsertInBST {
   
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
	
	private static Node insertNode(Node root2,int value) {

		if(root2==null) {
			return new Node(value);
		}

		if(root2.data > value) 
			root2.left = insertNode(root2.left, value);

		else 
			root2.right = insertNode(root2.right, value);

		return root2;
	}


	private static void inorderTraversal( Node root2) {
		if(root2==null)
			return;
		inorderTraversal(root2.left);
		System.out.print(root2.data+" ");
		inorderTraversal(root2.right);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertInBST tree = new InsertInBST();
		tree.root = new Node(10);
		tree.root.left = new Node(5);
		tree.root.right = new Node(13);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(11);
		tree.root.right.right = new Node(15);
		
		System.out.print("Binary tree is - ");
		inorderTraversal(tree.root);
		System.out.println();
		int k = 7;
		insertNode(tree.root,k);
		System.out.print("After insertion Binary tree is - ");
		inorderTraversal(tree.root);	
	}

}
