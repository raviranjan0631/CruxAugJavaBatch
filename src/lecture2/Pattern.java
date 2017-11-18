package lecture2;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the line of pattern");
		int n=scn.nextInt();
		int row =1;
		int col=1;
		int count=0;
		while(row<=n){col=1;
			while(col<n-row+1){
				System.out.print(" ");
				col++;
			}
		    count=row;
			col=1;
			while(col<=row){
				System.out.print(count+" ");
				count++;
				col++;
			}
			count=count-2;
			col=1;
			while(col<=row-1){
				System.out.print(count+" ");
				count--;
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
