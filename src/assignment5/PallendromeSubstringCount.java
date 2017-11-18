package assignment5;

import java.util.Scanner;

public class PallendromeSubstringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		subSequence(str);
	}
	public static void subSequence(String str){
		String rev = new String();
		int count = 0;
		for(int i = 0; i<str.length(); i++){
			for(int j = i; j<=str.length(); j++){
				if(i!=j){
					rev= str.substring(i, j);
				if(pallendromeString(rev)){++count;}
				}
			
			}
		}
		System.out.println(count);
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
