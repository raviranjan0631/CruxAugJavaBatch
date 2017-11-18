package assignment4;

import java.util.Scanner;

public class Binary2Decimal {
	static int b2d(int bin){
		int dec = 0,binbit,base=1;
		while(bin!=0){
			binbit = bin%10;
			dec += binbit*base; 
			base *=2;
			bin /=10;
		}
		return dec;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int bin = scn.nextInt();
		int dec = b2d(bin);
		System.out.println(dec);

	}

}
