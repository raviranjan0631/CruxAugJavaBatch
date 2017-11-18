package assignment6;

import java.util.Scanner;

public class FactorialPattern_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printFactorialPattern(n,0,0);
	}
	public static void printFactorialPattern(int num, int i, int j){
		if(i == num){
			return;
		}
		if(j<=i){
			System.out.print(factorial(i)/(factorial(j)*factorial(i-j)));
			printFactorialPattern(num, i, j+1);
		}
		else{
			System.out.println();
			printFactorialPattern(num, i+1, 0);
		}
		
	}
	public static int factorial(int num){
		int fact = 1;
		for(int i = 1; i<= num;i++){
			fact *= i;
		}
		return fact;
	}
}
