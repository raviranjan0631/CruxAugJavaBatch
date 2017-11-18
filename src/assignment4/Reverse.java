package assignment4;

import java.util.Scanner;

public class Reverse {
	static int inverse(int num){
		int rem, count = 1, inv =0;
		while(num!=0){
			rem = num%10;
			inv += count*((int)Math.pow(10,rem-1));
			count += 1;
			num /=10;
		}
		return inv;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int inv = inverse(num);
		System.out.println(inv);
	}

}
