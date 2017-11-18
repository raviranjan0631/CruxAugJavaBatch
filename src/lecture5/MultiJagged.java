package lecture5;

import java.util.Scanner;

public class MultiJagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][];
		takeInput(scn, arr);
		display(arr);
	}
	public static void takeInput(Scanner scn, int[][] arr){
		for(int row= 0;row<arr.length;row++){
			int cols = scn.nextInt();
			 arr[row]= new int[cols];
			 for(int col =0; col<arr[col].length;col++){
				 arr[row][col] = scn.nextInt();
			 }
		}
	}
	public static void display(int arr[][]){
		for(int row = 0;row<arr.length;row++){
			for(int col = 0;col<arr[row].length;col++){
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}
