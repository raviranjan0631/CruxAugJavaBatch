package lecture2;

import java.util.Scanner;

public class NthFebonnaci {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		int n =  scn.nextInt();
		int a=0,b=1,i=0,c;
		while(i<=n){
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			i++;
		}

	}

}
