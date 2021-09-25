 package com.dsa.sheet.binarytree;

public class CheckIfTreesAreMirror {
	
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
	
	public static boolean checkMirrors(Node root1, Node root2) {
		if(root1 == null && root2 == null) {
			return true;
		}
		if(root1 == null || root2 == null) {
			return false;
		}
		boolean firstCheck = checkMirrors(root1.left, root2.right);
		boolean secondCheck = checkMirrors(root1.right, root2.left);
		
		return(root1.data == root2.data && firstCheck &&  secondCheck);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckIfTreesAreMirror tree1 = new CheckIfTreesAreMirror();
		tree1.root1 = new Node(1);
		tree1.root1.left = new Node(2);
		tree1.root1.right = new Node(3);
		tree1.root1.left.left = new Node(4);
		tree1.root1.left.right = new Node(5);
		CheckIfTreesAreMirror tree2 = new CheckIfTreesAreMirror();
		tree2.root2 = new Node(1);
		tree2.root2.left = new Node(3);
		tree2.root2.right = new Node(2);
		tree2.root2.right.left = new Node(5);
		tree2.root2.right.right = new Node(4);
		boolean result = CheckIfTreesAreMirror.checkMirrors(tree1.root1, tree2.root2);
		if(result == true) {
			System.out.println("Trees are mirrors");
		}
		else {
			System.out.println("Trees are not mirrors");
		}
	}

}
