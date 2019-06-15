import java.util.Scanner;

public class RotateInN {

    public static void readArray(int arr[]) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }

    public static int[] cyclicRotate(int arr[],int x) {

        int arr1[] = new int[arr.length];
        x=x%arr.length;

        for (int i = 0; i < arr.length; i++) {

            arr1[i] = arr[(i+x)%arr.length];
        }

        return arr1;
    }

    public static void main(String args[]) {

        int arr[] = new int[5];
        int x;
        Scanner sc = new Scanner(System.in);

        readArray(arr);

        System.out.println("Rotation:");

        x = sc.nextInt();

            arr = cyclicRotate(arr,x);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}