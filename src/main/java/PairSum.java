import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class PairSum {
	
	public static void readArray(int arr[]){

        Scanner sc=new Scanner(System.in);

        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

    }

	public static void pairSum (int arr[], int sum){
		
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length; i++){
			
			if(mp.containsKey(sum-arr[i])){
				
				System.out.println("("+arr[i]+" "+(sum-arr[i])+")");
			}
			mp.put(arr[i], 1);
		}
		
	}
	
	public static void main(String args[]){
		
		int[] arr = new int[10];
		
		readArray(arr);
		
		int sum;
        Scanner sc = new Scanner(System.in);
		sum = sc.nextInt();
        
        pairSum(arr, sum);
        
		
	}
	
	
	
}
