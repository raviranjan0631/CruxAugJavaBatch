package lecture2;

import java.util.Scanner;

public class Febonacci0ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n=scn.nextInt();
		int a=0;
		int b=1;
		int c=1;
		while(a<=n){
			System.out.println(a+",");
			c=a+b;
			a=b;
			b=c;
			
		}

	}

}
