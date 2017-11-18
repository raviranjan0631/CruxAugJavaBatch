package assignment6;

import java.util.Scanner;

public class RightTriangleStarPattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printRightTrianglePattern(n,1,1);
	}
	public static void printRightTrianglePattern(int num, int i, int j){
		if(i > num){
			return;
		}
		if(j<=i){
			System.out.print("*");
			printRightTrianglePattern(num, i, j+1);
		}
		else{
			System.out.println();
			printRightTrianglePattern(num, i+1, 1);
		}
	}

}
