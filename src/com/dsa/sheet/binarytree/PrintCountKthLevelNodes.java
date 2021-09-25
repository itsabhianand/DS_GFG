package com.dsa.sheet.binarytree;

public class PrintCountKthLevelNodes {
	
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
	static int count = 0;
	
	private static void printNodes(Node root, int level,int k) {
		if(root==null)
			return;
		if(level==k) {
			count++;
			System.out.print(root.data +" ");
		}
		
		printNodes(root.left, level+1, k);
		printNodes(root.right, level+1, k);
	}

	private static  void inorderTraversal(Node root) {

		if(root == null)
			return;

		inorderTraversal(root.left);
		System.out.print(root.data+" ");
		inorderTraversal(root.right);

		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintCountKthLevelNodes tree = new PrintCountKthLevelNodes();
		tree.root = new Node(6);
		tree.root.left = new Node(4);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(7);
		tree.root.right.right = new Node(11);
		System.out.println("Binary tree is - ");
		inorderTraversal(tree.root);
		System.out.println();
		int k = 3;
		printNodes(tree.root,1,k);
		System.out.println();
		System.out.println("The number of nodes present at "+k+"th level is : "+count);
	}

}
