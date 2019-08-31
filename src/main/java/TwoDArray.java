import java.util.Scanner;


public class TwoDArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int twoD[][] = new int[5][];
		
		Scanner sc = new Scanner(System.in);
		for(int i  = 0 ; i < twoD.length ; i++ ){
			twoD[i] = new int[5];
			for(int j = 0; j < twoD[i].length ; j++){
				twoD[i][j] = sc.nextInt();
			}
		}
		
		for(int i  = 0 ; i < twoD.length ; i++ ){
			for(int j = 0; j < twoD[i].length ; j++){
				System.out.print(twoD[i][j] + " ");
			}
			System.out.println();
		}
	}

}
