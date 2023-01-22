package com.entiry;

import java.util.Scanner;

public  class BinarySearch
{
	 
        static class Node{
		int data;
		Node left=null;
		Node right=null;
		
		public Node(int data) {
			this.data=data;
		}
	}
	static Node createTree() {
		int data;
		Node root=null;
	    
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.print("Enter data : ");
	    data=sc.nextInt();
	    
	    if(data == -1)
	    {	
		   return null;
	    }
	    root=new Node(data);
	    
	    System.out.println("Enter left child of the node "+root.data);
	    root.left=createTree();
	   
	    System.out.println("Enter right child of the node "+root.data);
	    root.right=createTree();
//	    sc.close();
	    return root;
	}

	
	
	
	
	static void postorder(Node root) {
		if(root == null)
		  return;
	    postorder(root.left);
		postorder(root.right);
		System.out.print(root.data +" ");
	}
	
	


		public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    
	    Node root=createTree();
   
	    System.out.println();
	    
	    System.out.println("Postorder");
	    postorder(root);
	    
	    System.out.println();
	    
	    
	    
	 
	    
	  }
}
