package assignment4;

import java.util.Scanner;

public class CharacterCheck {
	
	static char checkCase(char ch){
		char q;
		if(ch>='a' && ch<='z'){
			q='L';
		}
		else if(ch>='A' && ch<='Z'){
			q='U';
		}
		else{
			q='I';
		}
		return q;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		char q = checkCase(ch);
		System.out.println(q);
	}

}
