package lecture2;

import java.util.Scanner;

public class DiamondPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("enter n");
		int n = scn.nextInt();
		int orow=1,col;
		int row =orow;
		while(orow <= 2*n - 1){
			col=1;
			while(col<=n-row){
				System.out.print(" ");
				col++;
			}
			col=1;
			int counter = row;
			while(col <= row){
				System.out.print(counter+" ");
				counter++;
				col++;
			}
			counter = counter - 2;
			col=1;
			while(col<=row-1){
				System.out.print(counter+" ");
				counter--;
				col++;
			
			}
			
			if(orow < n){
				row++; 
			}
			else{
				row--;
			}
			orow++;
			System.out.println();
			
		}
	}

}
