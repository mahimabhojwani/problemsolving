import java.util.Scanner;

public class InputArray {

    /**
     * @param arr
     */
    public static void readArray(int arr[]) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }

    }

    public static void printArray(int arr[]) {

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String args[]) {

        int arr[] = new int[5];

        readArray(arr);
        printArray(arr);

    }


}
