package assignment6;

import java.util.Scanner;

public class RightTriangleStarPattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		printRightTriangleStarReversePattern(num,num,num);
		
	}
	public static void printRightTriangleStarReversePattern(int num, int i,int j){
		if(i==0){
			return;
		}
		if(j>0){
			System.out.print("*");
			printRightTriangleStarReversePattern(num, i, j-1);
		}
		else{
			System.out.println();
			printRightTriangleStarReversePattern(num, i-1, i-1);
		}
	}

}
