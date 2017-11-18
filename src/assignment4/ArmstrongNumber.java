package assignment4;

import java.util.Scanner;

public class ArmstrongNumber {
	
	static int armstrong(int num){
		int sum = 0, rem;
		while(num>0){
			rem = num%10;
			sum += rem*rem*rem;
			num /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		int num1 = num;
		int arm = armstrong(num);
		
		if(arm == num1){
			System.out.println("valid armstrong");
		}
		else{
			System.out.println("invalid armstrong");
		}

	}

}
