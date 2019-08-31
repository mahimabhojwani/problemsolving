import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class ArrowBalloonBlast {

	public static void readArray(int arr[]){

        Scanner sc=new Scanner(System.in);

        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
	
	public static int countArrow( int arr[]){
		
		Set<Integer> mp = new HashSet<Integer>();
		int count=0;
		
		for (int i=0; i<arr.length; i++){
			
			 if (mp.contains(arr[i]+1)){
				 mp.remove(arr[i]+1);
				 mp.add(arr[i]);
			 }
			 else {
			mp.add(arr[i]);
			 count++;
			 }
		}
		return count;
	}
	
 public static void main(String args[]){
		
		int[] arr = new int[10];
		
		readArray(arr);
        
		System.out.println(countArrow(arr));
	}
	
}
