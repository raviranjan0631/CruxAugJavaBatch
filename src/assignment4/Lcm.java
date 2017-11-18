package assignment4;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int lcm = gcdCalc(num1,num2);
		System.out.println(lcm);
	}
	
	static int gcdCalc(int num1, int num2){
		int count =1, n,i=0;
		int a=num1,b=num2;
		if(num1>num2)
		{n = num1;}
		else{n = num2;} 
		for(i = 1;i<=n;i++){
			if(num1%i==0 && num2%i==0){
				count +=1;
			}
		}
		
		
		return lcm(num1, num2, count);
	}
	static int lcm(int num1, int num2, int gcd){
		int lcm = (num1*num2)/gcd;
		
		return lcm;
	}
}
