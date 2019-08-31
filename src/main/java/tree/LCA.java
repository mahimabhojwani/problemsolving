package tree;

public class LCA {

	public static int recursiveLeastCommonAncestor(Node root, int p, int q){
		
		if(root == null){
			return -1;
		}
		
		int LCA = -1;
		
		if (p >root.data && q> root.data){
			
		LCA= recursiveLeastCommonAncestor(root.right, p, q);
		}
		
        if (p < root.data && q < root.data){
			
		LCA = recursiveLeastCommonAncestor(root.left, p, q);
		}
		
       if ((p > root.data && q < root.data)||(p < root.data && q >root.data)){
			
			return root.data;
		}
       return LCA;
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
			
			System.out.println(recursiveLeastCommonAncestor(root, 14, 6));
		}
	
}
