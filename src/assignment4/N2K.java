package assignment4;

import java.util.Scanner;

public class N2K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int sb = scn.nextInt();
		int sn = scn.nextInt();
		int db = scn.nextInt();
		int dn = sn2dn(sb, sn, db);
		System.out.println(dn);
	}
	
	static int sn2dn(int sb, int sn, int db){
		
		int dec = sn2dec(sb,sn);
		int dn = dec2dn(dec,db);
		return dn;
	}
	static int sn2dec(int sb, int sn){
		int dec = 0, decbit , base = 1;
		while(sn!=0){
			decbit = sn%10;
			dec += decbit*base;
			base *=sb;
			sn /=10;
		}
		return dec;
	}
	static int dec2dn(int dec, int db ){
		int dn = 0, base = 1, dnbit;
		while(dec!=0){
			dnbit = dec%db;
			dn += dnbit*base;
			base *= 10;
			dec /= db;
		}
		
		return dn;
	}

}
