import java.util.Scanner;

public class RotateArray {

    public static void readArray(int arr[]){

        Scanner sc=new Scanner(System.in);

        for(int i =0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }

    }

    public static int[] RotateArray(int arr[]){
        int temp;
        for (int i =0;i<arr.length/2;i++){

            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }

    public static void main(String args[]){

        int arr[]=new int[5];
         readArray(arr);
        arr = RotateArray(arr);

        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

}
