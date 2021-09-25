package com.dsa.sheet.binarytree;

// Refer GFG.

public class KthAncestorOfGiveNode {
	
	// temporary node to keep track of Node returned 
	// from previous recursive call during backtrack 
	static Node temp = null; 
	static int k; 
	
	// A Binary Tree Node 
	static class Node 
	{ 
	    int data; 
	    Node left, right; 
	}; 
	
	// Utility function to create a new tree node 
	static Node newNode(int data) 
	{ 
	    Node temp = new Node(); 
	    temp.data = data; 
	    temp.left = temp.right = null; 
	    return temp; 
	} 
	
	// recursive function to calculate Kth ancestor 
	static Node kthAncestorDFS(Node root, int node ) 
	{  
	    // Base case 
	    if (root == null) 
	        return null; 
	    
	    Node left = kthAncestorDFS(root.left,node);
	    Node right = kthAncestorDFS(root.right, node);
	    
	    if (root.data == node || left != null || right != null)
	    {  
	        if (k > 0)      
	            k--; 
	          
	        else if (k == 0) 
	        { 
	            // print the kth ancestor 
	            System.out.print("Kth ancestor is: "+root.data); 
	              
	            // return null to stop further backtracking 
	            return null; 
	        } 
	          
	        // return current node to previous call 
	        return root; 
	    } 
	    return null; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Node root = newNode(1); 
		    root.left = newNode(2); 
		    root.right = newNode(3); 
		    root.left.left = newNode(4); 
		    root.left.right = newNode(5); 
		  
		    k = 2; 
		    int node = 5; 
		  
		    // print kth ancestor of given node 
		    Node parent = kthAncestorDFS(root,node); 
		      
		    // check if parent is not null, it means 
		    // there is no Kth ancestor of the node 
		    if (parent != null) 
		        System.out.println("-1"); 
	}

}
