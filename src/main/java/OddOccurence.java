import java.util.Scanner;


public class OddOccurence {
	
	public static void readArray(int arr[]){

        Scanner sc=new Scanner(System.in);

        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

    }
	
	 public static int oddOccurence (int arr[]){
		 
		 int operator = 0;
		 
		 for (int i=0; i<arr.length; i++){
			 
			 operator = arr[i] ^ operator;
			 
		 }
		 return operator;
	 }
	 
	public static void main (String args[]){
		
	 int[] arr=new int[10];
	 
	 readArray(arr);
	 
	 System.out.println(oddOccurence(arr));
		
	}
	

}
