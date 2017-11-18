package lecture6;

import java.util.Scanner;
//class spiral pattern
public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		int[][] arr = new int[n][];
//		takeInput(scn, arr);
//		display(arr);
		int arr[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
		spiral(arr);
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
	static void display(int arr[][]){
		for(int row = 0;row<arr.length;row++){
			for(int col = 0;col<arr[row].length;col++){
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
	
	public static void spiral(int arr[][]){
		int maxele = arr.length*arr[0].length;
		int colmin=0,colmax=arr[0].length-1,rowmax=arr.length-1,rowmin=0;
		int counter = 1;
		while(counter<=maxele){
			for(int i =rowmin;i<=rowmax&&counter<=maxele;i++){
			
				System.out.print(arr[i][colmin]+" ");
				counter+=1;
			}
			colmin +=1;
			for(int i = colmin;i<=colmax&&counter<=maxele;i++){
				System.out.print(arr[rowmax][i]+" ");
				counter+=1;
			}
			rowmax -=1;
			for(int i=rowmax;i>=rowmin&&counter<=maxele;i--){
				System.out.print(arr[i][colmax]+" ");
				counter+=1;
			}
			colmax -=1;
			for(int i = colmax;i>=colmin&&counter<=maxele;i--){
				System.out.print(arr[rowmin][i]+" ");
				counter+=1;
			}
			rowmin+=1;
			
		}
	}
}
