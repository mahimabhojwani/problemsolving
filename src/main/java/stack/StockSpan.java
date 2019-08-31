package stack;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
   
	public static void readArray(int arr[]){

        Scanner sc=new Scanner(System.in);

        for (int i=0; i<arr.length;i++){

            arr[i]=sc.nextInt();

        }
    }
	
	public static void getSpan(int arr[]){
		
		Stack<Integer> s1 = new Stack<Integer>();	
		
		s1.push(0);
		System.out.println("Span of "+arr[0]+" : 0");
		
		for(int i = 1; i<arr.length; i++){
			
			if(arr[i] < arr[s1.peek()]){
				s1.push(i);
				System.out.println("Span of "+arr[i]+" : 0");
			}
			
			else{
				while( !(s1.empty()) && (arr[i] > arr[s1.peek()]) ){
					s1.pop();
		         }
				if(!(s1.empty())){
			  System.out.println("Span of "+arr[i]+" : "+(i-s1.peek()-1));
				}
				else{
					System.out.println("Span of "+arr[i]+" : "+(i));
				}
		      s1.push(i);
	     }
	  }	
   }
	
	public static void main(String args[]){

        int arr[]=new int[9];
        readArray(arr);
	    
        getSpan(arr);
        
	}
}
