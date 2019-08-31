import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KadaneAlgo {

	public static void readArray(int arr[]){

        Scanner sc=new Scanner(System.in);

        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
	
	public static List<Integer> maxSumSubArray (int arr[]){
		
		int maxsum=0; int currsum=0; int index=-1;
		
		for(int i=0; i<arr.length; i++){
			
			currsum += arr[i];
			
			if (currsum<0){
				currsum=0;
			}
		   if(maxsum<currsum){
			maxsum = currsum;
			index=i;
		  }
	   }	
		List<Integer> array = new ArrayList<Integer>();
		
		int tempSum = 0;
		
		while(tempSum < maxsum){
			array.add(arr[index]);
			tempSum += arr[index];
			index--;
		}
		Collections.reverse(array);
		return array;
   }

	public static void main(String args[]){
		
        int[] arr = new int[10];
		
		readArray(arr);
        
		System.out.println(maxSumSubArray(arr));
		
	}
 }
