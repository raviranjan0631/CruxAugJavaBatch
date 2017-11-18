package assignment4;

import java.util.Scanner;

public class CountDigit {

	static int count(int num, int digit){
		int cont = 0, num1 = num;
		
		while(num>0){
			int rem = num%10;
			if(digit == rem){
				cont++;
			}
			num /= 10;
		}
		
		return cont;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		int digit = scn.nextInt();
		int cont = count(num,digit);
		System.out.println("digit "+digit+" repeated in number "+num+" "+cont+" times");
	}

}
