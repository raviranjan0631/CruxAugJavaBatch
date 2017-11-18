package lecture2;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.println("plz enter the line of pattern");
		int n=scn.nextInt();
		int row=1;
		int col=1;
		int count=1;
		while(row<=n){
			col=1;
			while(col<=row){
				System.out.print(count+" ");
				count++;
				col++;
			}
			row=row+1;
			System.out.println();
		}
	}

}
