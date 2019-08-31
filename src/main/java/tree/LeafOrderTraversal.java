package tree;

import java.util.Stack;

public class LeafOrderTraversal {

	public static boolean isLeaf(Node root){
		
		if(root.left == null && root.right == null){
			return true;
		}
		return false;
	}
	
	public static boolean isLeafOrderTraversalSame(Node root1, Node root2){
		
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		
		s1.push(root1);
		s2.push(root2);
		
		while(!s1.empty() || !s2.empty()){
			
			if(s1.empty() || s2.empty()){
				return false;
			}
			
			Node temp1= s1.pop();
			
			while(!isLeaf(temp1) && temp1 != null){
			
				if (temp1.left!=null){
					s1.push(temp1.left);
				}
						
				if(temp1.right!=null){
					s1.push(temp1.right);
				}
				temp1 = s1.pop();
			}
			
			
           Node temp2= s2.pop();
			
			while(!isLeaf(temp2) && temp2 != null){
			
				if (temp2.left!=null){
					s2.push(temp2.left);
				}
						
				if(temp2.right!=null){
					s2.push(temp2.right);
				}
				temp2 = s2.pop();
			}
			
			if(temp1==null && temp2==null)
				return true;
			
			if((temp1==null && temp2!=null) || (temp1!=null && temp2==null))
				return false;
			
			if (temp1.data!=temp2.data){
				return false;
			}
		}
		return true;
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
	    
			Node root1 = new Node(8);
			insertNode(root1, 5);
			insertNode(root1, 3);
			insertNode(root1, 6);
			insertNode(root1, 2);
			insertNode(root1, 14);
			insertNode(root1, 13);
			insertNode(root1, 16);
			insertNode(root1, 12);
			insertNode(root1, 11);
			insertNode(root1, 10);
			insertNode(root1, 9);
			
			System.out.println(isLeafOrderTraversalSame(root, root1));
		}
}
