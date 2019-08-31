package tree;


public class IsBST {

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

	public static boolean isBST(Node root, int max, int min){
		
			if(root == null)
				return true;
		
			if(root.data > max || root.data < min)
				return false;
			
			boolean left = isBST(root.left, root.data, min);
			boolean right = isBST(root.right, max, root.data);
			
			return left && right;
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
		
		root.data=20;
		
		System.out.println(isBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE));
		
	}

}

	
