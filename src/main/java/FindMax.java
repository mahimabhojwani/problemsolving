import java.util.Scanner;

public class FindMax {

    public static void readArray(int arr[]){

        Scanner sc=new Scanner(System.in);

        for (int i=0; i<arr.length;i++){

            arr[i]=sc.nextInt();

        }
    }

    public static int findMax(int arr[]){

        int max=arr[0];

        for(int i=1; i<arr.length; i++){
            if (arr[i]>max)
                max=arr[i];

        }
        return max;
    }

    public static void main(String args[]){

        int arr[]=new int[6];
        readArray(arr);
        System.out.println(findMax(arr));
    }
}
