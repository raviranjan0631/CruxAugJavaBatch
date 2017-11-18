package assignment5;

import java.util.Scanner;

public class ToogleString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String toogleStr = toogleString(str);
		System.out.println(toogleStr);
	}
	
	public static String toogleString(String str){
		String toogleString = new String();
		for(int i =0 ; i < str.length(); i++){
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
				int ch = str.charAt(i) - 32;
				toogleString = toogleString + (char)ch + "";
			}
			else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
				int ch = str.charAt(i) + 32;
				toogleString = toogleString + (char)ch + "";
			}
		}
		return toogleString;
	}

}
