
 public class TwoPointerSumPair {

	public static Pair pairSum(int arr[], int sum){
		
     int l=0, r=arr.length;
     int left, right;
     
    while(l<r){
     
     if(arr[l] + arr[r]==sum){
    	 Pair p = new Pair();
    	 p.left=arr[l];
    	 p.right=arr[r];
    	 return p;
         }
	 }
    return null;
   }
 }

  class Pair {
	  
	  int left, right;
	  
  }