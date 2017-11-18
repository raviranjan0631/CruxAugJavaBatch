package assignment4;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		int pow = pow(x,n);
		System.out.println(pow);

	}
	static int pow(int x, int n){
		int pow=1,i=1;
		while(i<=n){
			pow*=x;
			i++;}
		return pow;
	}

}
