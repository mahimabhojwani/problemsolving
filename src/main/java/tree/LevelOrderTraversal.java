package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderTraversal {

	public static void printLevelNode(Node root, int level, int height){
		 
		if (height == level){
			System.out.println(root.data);
		}
		
		if (root == null){
			return;
		}
		
		printLevelNode(root.left, level, height + 1);
		printLevelNode(root.right, level, height + 1);
	}
   
	public static void printLevelOrder(Node root){
		
		Queue<Node> qu = new LinkedList<Node>();
		
		qu.add(root);
		
		Node l,r;
		
		while(!qu.isEmpty()){
			
			if(root.left != null){
		     l = root.left;
		     qu.add(l);
			}
			if(root.right != null){
			 r = root.right;
			 qu.add(r);
			}
			
			System.out.println(qu.peek().data);
			 qu.remove();
			 root = qu.peek();	
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
         
		int level;
        Scanner sc = new Scanner(System.in);
		level = sc.nextInt();
		
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
    
		printLevelOrder(root);
		
	}

}

