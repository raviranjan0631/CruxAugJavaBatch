package lecture5;

import java.util.Scanner;

public class SpiralPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		takeInput(scn, arr);
		display(arr);
		System.out.println("\n");
		spiral(arr);
	//spiral pattern

	
	}
	public static void spiral(int[][] arr){
		int row=0,col=0;
		int count=0;
		int n=0;
		while(count<=arr.length*arr.length){
			while((row+n)<arr.length){
				System.out.print(arr[row][col]+" ");
				row++;
				count++;
			}
			row--;
			count--;
			while((col+n)<arr.length){
				System.out.print(arr[row][col]+" ");
				col++;
				count++;
			}
			col--;
			count--;
			n++;
			while((row-n)>=0){
				System.out.print(arr[row][col]+" ");
				row--;
				count++;
			}
			row++;
			count--;
			while((col-n)>=0){
				System.out.print(arr[row][col]+" ");
				col--;
				count++;
			}
			count--;
			
			}
		}
	
	
	
	
	
	
	
	
	public static void takeInput(Scanner scn, int[][] arr){
		for(int row= 0;row<arr.length;row++){
			for(int col= 0;col<arr.length;col++){
				arr[row][col] = scn.nextInt();
			}
			
		}
	}
	
	

	public static void display(int[][] arr){
		for(int row= 0;row<arr.length;row++){
			for(int  col= 0;col<arr.length;col++){
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}

}
