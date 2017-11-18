package assignment4;

import java.util.Scanner;
public class o2b {
	
	static int o2b(int oct){
		return o2d(oct);
	}
	
	static int o2d(int oct){
		int dec = 0, base = 1, decbit;
		while(oct!=0){
			decbit = oct%10;
			dec += decbit*base;
			base *=8;
			oct /=10;
		}
		
		return d2b(dec);
	}
	static int d2b(int dec){
		int bin = 0, binbit, base = 1;
		while(dec!=0){
			binbit = dec%2;
			bin += base*binbit;
			base = base*10;
			dec /= 2;
		}
		return bin;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int oct = scn.nextInt();
		int bin = o2b(oct);
		System.out.println(bin);
		// TODO Auto-generated method stub

	}

}
