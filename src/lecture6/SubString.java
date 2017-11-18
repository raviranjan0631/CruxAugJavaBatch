package lecture6;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s1 = new String();
		s1 = scn.next();
		int n = s1.length();
		for(int i =0; i<n;i++){
			for(int j=i;j<=n;j++){
				if(i!=j){
					System.out.println(s1.substring(i, j));}
			}
		}

	}

}
