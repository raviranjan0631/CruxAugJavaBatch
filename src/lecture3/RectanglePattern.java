package lecture3;

import java.util.Scanner;

public class RectanglePattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	int row=1;
	int numStar = 1+(n/2);
	int numspace=1;
	while(row<=n){ 
		int col = 1;
		while(col<=numStar){
			System.out.print("*");
			col++;
		}
		col = 1;
		while(col<=numspace){
			System.out.print(" ");
			col++;
		}
		col = 1;
		while(col<=numStar){
			System.out.print("*");
			col++;
		}
		if(row<=n/2){
			numStar -= 1;
			numspace +=2;
		}
		else{
			numStar +=1;
			numspace -=2;
		}
		row++;
		System.out.println();
	}
	}

}
