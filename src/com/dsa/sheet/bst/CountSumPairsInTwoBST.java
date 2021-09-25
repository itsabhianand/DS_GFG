package com.dsa.sheet.bst;

import java.util.Stack;

public class CountSumPairsInTwoBST {
	
	static Node root1;
	static Node root2;
	static class Node {
		int data;
		Node left, right;
		
		Node(int value){
			data = value;
			left = null;
			right = null;
		}
	}
	
	public static void inOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.println(root.data + " ");
		inOrderTraversal(root.right);
		
	}
	
	public static int countPairs(Node root1, Node root2, int x) {
		if(root1 == null || root2 == null) {
			return 0;
		}
		
		//Take 2 Stacks
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		
		Node top1, top2;
		int count = 0;
		
		while(true) {
			
			//Traversing 1st BST to extreme left to push elements in stack having minimum value.
			 // to find next node in inorder
            // traversal of BST 1
			while(root1 != null) {
				s1.push(root1);
				root1 = root1.left;
				
			}
			
			//Traversing 2nd BST to extreme right to push elements in stack having maximum value.
			// to find next node in reverse
            // inorder traversal of BST 2
			while(root2 != null) {
				s2.push(root2);
				root2 = root2.right;
			}
			
			// if either gets empty then corresponding
            // tree traversal is completed
			if(s1.isEmpty() || s2.isEmpty())
				break;
			
			top1 = s1.peek();
			top2 = s2.peek();
			
			 // if the sum of the node's is equal to 'x'
			if(top1.data +top2.data == x) {
				count ++;
				
				// pop nodes from the respective stacks
				s1.pop();
				s2.pop();
				
				// insert next possible node in the
                // respective stacks
				root1 = top1.right;
				root2 = top2.left;
			}
			
			else if(top1.data + top2.data < x) {
				s1.pop();
				root1 = top1.right;
			}
			
			else {
				s2.pop();
				root2 = top2.left;
			}
			
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountSumPairsInTwoBST tree1 = new CountSumPairsInTwoBST();
		tree1.root1 = new Node(5);
		tree1.root1.left = new Node(3);
		tree1.root1.right = new Node(7);
		tree1.root1.left.left = new Node(2);
		tree1.root1.left.right = new Node(4);
		tree1.root1.right.left = new Node(6);
		tree1.root1.right.right = new Node(8);
		
		CountSumPairsInTwoBST tree2 = new CountSumPairsInTwoBST();
		tree2.root2 = new Node(10);
		tree2.root2.left = new Node(6);
		tree2.root2.right = new Node(15);
		tree2.root2.left.left = new Node(3);
		tree2.root2.left.right = new Node(8);
		tree2.root2.right.left = new Node(11);
		tree2.root2.right.right = new Node(18);
		
		System.out.println("First BST is : ");
		inOrderTraversal(tree1.root1);
		
		System.out.println("Second BST is : ");
		inOrderTraversal(tree2.root2);
		
		int x = 16;
		int count = countPairs(tree1.root1, tree2.root2, x);
		System.out.println("Total count Pairs are : " + count);
	}

}
