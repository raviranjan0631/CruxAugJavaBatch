package assignment6;

import java.util.Scanner;

public class OddEvenPrint1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		printOddEven(num);
	}
	public static void printOddEven(int num){
		if(num ==1){
			System.out.println(num);
			return;
		}
		if(num%2!=0){
			System.out.println(num);
		}
		printOddEven(num-1);
		if(num%2==0){
			System.out.println(num);
		}
	}

}
