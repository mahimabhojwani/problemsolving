import java.util.Scanner;

public class SortArray {

    public static Scanner sc= new Scanner(System.in);

    public static void readArray(int arr[]){

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }

    public static int[] sortArray(int arr[]){
        int temp;
        for(int i=0; i<arr.length; i++){

            int r=minElement(arr,i+1,arr.length-1);

            temp=arr[i];
            arr[i]=arr[r];
            arr[r]=temp;
        }
        return arr;
    }

    public static int minElement(int arr[],int start,int last){

        int min=arr[start];
        int ind=start;

        for (int i=start;i<=last;i++){

            if (arr[i] < min ){
                min=arr[i];
                ind = i;
            }
        }
        return ind;
    }

    public static void main(String args[]){

        int arr[]=new int[5];
        readArray(arr);
        System.out.println(sortArray(arr));

    }

}
