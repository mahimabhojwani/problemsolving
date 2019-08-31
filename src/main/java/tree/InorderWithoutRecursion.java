package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InorderWithoutRecursion {

	public static void inorderWithoutRecursion(Node root){
		
		Stack<Node> st = new Stack<Node>();
		
		Node curr = root;
		
		while(curr != null || !st.isEmpty()){
			
			while(curr != null){
				
				st.push(curr);
				curr=curr.left;
			}
			
			curr = st.pop();
			System.out.println(curr.data);
			curr = curr.right;

		}
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
			insertNode(root, 11);
			insertNode(root, 10);
			insertNode(root, 9);
	    
			inorderWithoutRecursion(root);
		}
}
