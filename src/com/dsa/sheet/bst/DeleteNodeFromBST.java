package com.dsa.sheet.bst;

public class DeleteNodeFromBST {
	
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
	
	public static void printInorder(Node root) {
		if(root == null) {
			return;
		}
		printInorder(root.left);
		System.out.println(root.data);
		printInorder(root.right);
		
	}
     
	public static Node deleteNode(Node root, int value) {
		if(root == null) {
			return root;
		}
		if(root.data > value) {
			root.left = deleteNode(root.left, value);
		}
		else if(root.data < value) {
			root.right = deleteNode(root.right, value);
		}
		else {
			if(root.left == null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			else {
				Node succ = getSuccessor(root);
				root.data = succ.data;
				root.right = deleteNode(root.right, succ.data);
			}
		}
		
		return root;
	}
	
	public static Node getSuccessor(Node root) {
		Node curr = root.right;
		while (curr != null && curr.left != null) {
			curr = curr.left;
		}
		return curr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteNodeFromBST tree = new DeleteNodeFromBST();
		tree.root = new Node(5);
		tree.root.left = new Node(2);
		tree.root.right = new Node(12);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		tree.root.right.left = new Node(9);
		tree.root.right.right = new Node(21);
		tree.root.right.right.left = new Node(19);
		tree.root.right.right.left.left = new Node(17);
		tree.root.right.right.right = new Node(25);
		System.out.println("Print BST before deletion is : ");
		printInorder(root);
		Node root = deleteNode(tree.root, 12);
		System.out.println("Print BST after deletion is : ");
		printInorder(root);
		
	}

}
