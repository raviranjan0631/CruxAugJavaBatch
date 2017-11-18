package assignment5;

import java.util.Scanner;

public class OddEvenCharacterReplaceinString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		System.out.println(oddEvenCharacterReplaceinString(s));
		
	}
	public static String oddEvenCharacterReplaceinString(String str){
		String s1= new String();
		for(int i = 0; i<str.length(); i++){
			if(i%2==0)
			{int ch = str.charAt(i) + 1;
			s1 = s1+(char)ch+"";}
			else{	
			int ch = str.charAt(i) - 1;
			s1 = s1+(char)ch+"";}
		}
		
		System.out.println(s1);
		return s1;
	}
}
