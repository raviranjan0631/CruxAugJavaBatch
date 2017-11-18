package assignment4;

import java.util.Scanner;

public class d2o {
	static int d2o(int dec){
		int oct=0, octbit, base=1;
		while(dec!=0){
			octbit = dec%8;
			oct += octbit*base;
			base *= 10;
			dec = dec/8;
		}
		return oct;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int dec = scn.nextInt();
		int oct = d2o(dec);
		System.out.println(oct);

	}

}
