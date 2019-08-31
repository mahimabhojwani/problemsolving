package tree;

public class PrintLeafNode {

	public static void printLeafNode(Node root){
		
		if(root == null){
			return;
		}
		
		if(root.left == null && root.right==null){
			System.out.println(root.data);
		}

		printLeafNode(root.left);
		printLeafNode(root.right);
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
	    
			printLeafNode(root);
		}
}
