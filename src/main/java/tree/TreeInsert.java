package tree;

public class TreeInsert {
	
	public static void printTree(Node root){
		
		if(root == null)
			return;
		
		printTree(root.left);
		System.out.println(root.data);
		printTree(root.right);
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
		insertNode(root, 1);

		//System.out.println(root.data);
		printTree(root);
	}
}
class Node{
	int data;
	Node left;
	Node right;
	
	Node(int x){
		data = x;
		left = null;
		right = null;
	}
}