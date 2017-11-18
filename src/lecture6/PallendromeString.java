package lecture6;

import java.util.Scanner;

public class PallendromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s1 = new String();
		s1 = scn.next();
		String s2 = new String();
		for(int i = s1.length()-1; i>=0;i--){
			s2 =  s2+s1.charAt(i)+"";
		}
		if(s1.equals(s2)){
			System.out.println("pallendrome");
		}
		else{
			System.out.println("not pallendrome");
		}
		

	}

}
