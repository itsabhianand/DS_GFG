package com.dsa.sheet.binarytree;

import java.util.HashMap;
import java.util.Map;

// refer Fit coder.

public class ConstructBinaryTreeFromInorderAndPreOrder {
	
	static Map<Character, Integer> map = new HashMap<Character, Integer>();
	static int preIndex = 0;
	
	static Node root;
	static class Node {
		char data;
		Node left, right;
		
		Node(char value){
			data = value;
			left = null;
			right = null;
		}
	}
	
	//char in[] = {'D', 'B', 'E', 'A', 'F', 'C'}; // LVR
    //char pre[] = {'A', 'B', 'D', 'E', 'F', 'C'}; // VLR
	public static Node buildTree(char[] in, char[] pre, int inStart, int inEnd) {
		
		int length = in.length;
		for(int i = 0; i < length; i++) {
			map.put(in[i], i);
		}
		if(inStart > inEnd) {
			return null;
		}
		
		char curr = pre[preIndex];
		preIndex++;
		Node tnode = new Node(curr);
		
		if(inStart == inEnd) {
			return tnode;
		}
		
		int inIndex = map.get(curr);
		tnode.left = buildTree(in, pre, inStart, inIndex - 1);
		tnode.right = buildTree(in, pre, inIndex + 1, inEnd);
		return tnode;
				
		
	}
	
	public static void printInorder(Node node)
	  {
	    if(node == null)
	    {
	      return;
	    }
	    printInorder(node.left);
	    System.out.print(node.data + " ");
	    printInorder(node.right);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char in[] = {'D', 'B', 'E', 'A', 'F', 'C'}; // LVR
      char pre[] = {'A', 'B', 'D', 'E', 'F', 'C'}; // VLR
      int len = in.length;
      ConstructBinaryTreeFromInorderAndPreOrder tree = new ConstructBinaryTreeFromInorderAndPreOrder();
      tree.root = ConstructBinaryTreeFromInorderAndPreOrder.buildTree(in, pre, 0, len-1);
      System.out.println("Inorder Traversal is : ");
      ConstructBinaryTreeFromInorderAndPreOrder.printInorder(root);
	}

}
