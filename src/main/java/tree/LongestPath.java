package tree;

public class LongestPath {
   
	static int path;
	
	public static int longestPathLength (Node root){
		
		if(root == null){
			return 0;
		}
		
		int l = longestPathLength(root.left);
		int r = longestPathLength(root.right);
		
		if((l+r)>path){
			path = l+r;
		}
		
		return (Math.max(l, r)+1);
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
		
		path=0;
	  
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
		insertNode(root, 1);
		
		longestPathLength(root);
		
		System.out.println(path);
      
	}

}
