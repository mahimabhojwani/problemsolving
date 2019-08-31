package tree;

import java.util.Scanner;

public class RightView {

	public static int printRightOrder(Node root ,int level, int max_ht){
		
		if(root == null){
			return level-1;
		}
		
		if(level>max_ht){
			max_ht=level;
			System.out.println(root.data);
		}
		
		int RR = printRightOrder(root.right, level+1, max_ht);
		if(RR>max_ht){
			max_ht=RR;
		}
		int LL = printRightOrder(root.left, level+1, max_ht);
		if(LL>max_ht){
			max_ht=LL;
		}
		return max_ht;
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
    
		printRightOrder(root,0,-1);
		
	}

}
