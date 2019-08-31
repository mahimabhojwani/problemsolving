package stack;

import java.util.Stack;

public class MinElement {
	
  static int CM = Integer.MAX_VALUE;
  static Stack<Integer> s1 = new Stack<Integer>();	
  
	public static void minElement(){
		
		if (s1.isEmpty()) 
            System.out.println("Stack is empty"); 
        else
            System.out.println("Minimum Element in the stack is: " + CM); 
	}

	public static void push(int a){
		
		if (s1.isEmpty()){
			CM= a;
			s1.push(a);
		}
		else {
			
			if(a<CM){
				s1.push(a-CM);
				CM = a;	
			}
			else 
				s1.push(a);
			System.out.println("Stack is pushing :" + s1.peek()); 
		}
	}
	
	public static void pop(){
		
		if(s1.empty()){
			
			System.out.println("Stack is empty"); 
            return; 
		}
		 
		int y = s1.pop();
	    
		if (y<CM){
			
			System.out.println("The popped Element is : "+CM);
			CM=CM-y;
		  }
		else 
		System.out.println("The popped Element is : "+y);
	}
	
	public static void main(String args[]){
	
		push(10);
		push(20);
		push(5);
		push(15);
		push(3);
		push(6);
		push(2);
		push(1);
		pop();
		pop();
		minElement();
	}
	
	
	
	
	
}
