import java.util.Scanner;

public class CyclicRotate {

    public static void readArray(int arr[]){

        Scanner sc=new Scanner(System.in);

        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

    }

    public static int[] cyclicRotate(int arr[]){

        int temp;
        temp=arr[arr.length-1];

        for (int i=arr.length-1; i>0;i--){

            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        return arr;
    }

    public static void main(String args[]){

        int arr[]=new int[5];
        readArray(arr);
        arr=cyclicRotate(arr);

        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }

}
