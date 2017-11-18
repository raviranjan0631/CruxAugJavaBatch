package lecture5;

import java.util.Scanner;

public class WavePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		takeInput(scn, arr);
		display(arr);
		System.out.println("\n");
		pattern(arr);
	//wave pattern

	
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
	
	public static void pattern(int[][] arr){	
		int row = 0,col;
	 while(row<arr.length){
		col = 0;
		while(col<arr.length){
			System.out.print(arr[col][row]+" ");
			col++;
		}
		col--;
		System.out.println();
		row++;
	    while(col>=0){
	    	System.out.print(arr[col][row]+" ");
	    	col--;
	    }
	    System.out.println();
		row++;
	 	}
	 
		
	}
	//class wala spirallll
	public static void waveDisplay(int arr[][]){
		for(int col = 0;col<arr[0].length;col++){
			if(col%2==0){
				for(int row = 0;row<arr[0].length;row++){
				System.out.print(arr[row][col]+" ");
				}	}
			else{
				for(int row = 0;row<arr[0].length;row++){
					System.out.print(arr[row][col]+" ");
					}
			}
		System.out.println();
		}
	}
	
	}
