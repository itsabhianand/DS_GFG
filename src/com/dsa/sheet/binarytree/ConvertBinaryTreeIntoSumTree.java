package com.dsa.sheet.binarytree;

// Refer code Library , also for building tree

public class ConvertBinaryTreeIntoSumTree {
	
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
	
	public static int convertIntoSum(Node root) {
		if(root == null) {
			return 0;
		}
		int a = convertIntoSum(root.left);
		int b= convertIntoSum(root.right);
		int x = root.data;
		root.data = a + b;
		return a+b+x;
	}
	
    public static void printInorder(Node node)  
    { 
        if (node == null) 
            return; 
        printInorder(node.left); 
        System.out.print(node.data + " "); 
        printInorder(node.right); 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertBinaryTreeIntoSumTree tree = new ConvertBinaryTreeIntoSumTree();
		tree.root = new Node(10);
		tree.root.left = new Node(-2);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(8);
		tree.root.left.right = new Node(-4);
		tree.root.right.left = new Node(7);
		tree.root.right.right = new Node(5);
		System.out.println(" Sum tree formed is : ");
		ConvertBinaryTreeIntoSumTree.convertIntoSum(root);
		ConvertBinaryTreeIntoSumTree.printInorder(root);
	}

}
