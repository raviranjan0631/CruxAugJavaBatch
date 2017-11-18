package assignment5;

import java.util.Scanner;

public class PallendromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = new String();
		str = scn.next();
		System.out.println(pallendromeString(str));
	}
	public static boolean pallendromeString(String str){
		String strrev = new String();
		for(int i = str.length() - 1; i>=0;i--){
			strrev = strrev + str.charAt(i) + "";
		}
		if(strrev.equals(str)){
			return true;
		}
		return false;
	}

}
