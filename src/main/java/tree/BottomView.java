package tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BottomView {

public static void bottomView(Node root){
		
		Queue<Pair> qu = new LinkedList<Pair>();
		HashMap<Integer, Integer> hp = new HashMap<Integer,Integer>();
		qu.add(new Pair(root,0));
		
		
		while(!qu.isEmpty()){
			
			Pair p = qu.remove();
			
			hp.put(p.level, p.node.data);
			
			if(p.node.left != null){
		     qu.add(new Pair(p.node.left,p.level - 1));
			}
			if(p.node.right != null){
			 qu.add(new Pair(p.node.right, p.level +1));
			}
			
		}
		 for(Integer data:hp.values()){ 
		       System.out.print( data + " "); 
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
    
		bottomView(root);
	}
}
