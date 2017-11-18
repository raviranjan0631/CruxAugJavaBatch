package lecture3;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row=0,col;
		while(row<n){
			col=0;
			int count = 1;
			while(col<=row){
				System.out.print(count+" ");
				col+=1;
				count = (count*(row-col+1))/col;
				
		}
			System.out.println();
			row++;
		}

	}

}
