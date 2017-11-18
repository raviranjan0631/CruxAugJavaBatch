package assignment4;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int gcd = gcdCalc(num1,num1);
		System.out.println(gcd);
	}
	
	static int gcdCalc(int num1, int num2){
		int count =0, n,i=0;
		if(num1>num2)
		{n = num1;}
		else{n = num2;} 
		for(i = 1;i<=n;i++){
			if(num1%i==0 && num2%i==0){
				count +=1;
			}
		}
	return count;
	}
}
