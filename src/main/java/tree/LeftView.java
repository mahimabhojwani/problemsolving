package tree;

import java.util.Scanner;

public class LeftView {

	static int max_ht = -1;
	public static void printLeftOrder(Node root ,int level ){
		
		if(root == null){
			return ;
		}
		
		if(level>max_ht){
			max_ht=level;
			System.out.println(root.data);
		}
		
		printLeftOrder(root.left, level+1);
		printLeftOrder(root.right, level+1);
	}
	
public static Node insertNode(Node root, int value){
		
		if(root == null){
			root= new Node(value);
			return root;
		}
		
		if(value > root.data)
		 root.right = insertNode(root.right, value);
		else
		root.left =	insertNode(root.left, value);
		
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		Node root = new Node(8);
		insertNode(root, 5);
		insertNode(root, 3);
		insertNode(root, 6);
		insertNode(root, 2);
		insertNode(root, 14);
		insertNode(root, 13);
		insertNode(root, 16);
		insertNode(root, 12);
		insertNode(root, 1);
		insertNode(root, 11);
    
		printLeftOrder(root,0);
		
	}

}
