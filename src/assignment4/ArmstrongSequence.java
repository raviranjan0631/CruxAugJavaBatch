package assignment4;

import java.util.Scanner;

public class ArmstrongSequence {
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
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		while(num1<=num2){
			int arm = armstrong(num1);
			
			if(arm == num1){
				System.out.println(arm);
			}
			

			num1++;
		}
		
	}

}
