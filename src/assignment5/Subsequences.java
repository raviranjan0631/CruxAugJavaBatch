package assignment5;

import java.util.Scanner;

public class Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		subSequence(str);
	}
	public static void subSequence(String str){
		for(int i = 0; i<str.length(); i++){
			for(int j = i; j<=str.length(); j++){
				if(i!=j){
					System.out.println(str.substring(i, j));
				}
			}
		}
	}

}
