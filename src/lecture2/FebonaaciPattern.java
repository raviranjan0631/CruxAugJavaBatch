package lecture2;

import java.util.Scanner;

public class FebonaaciPattern {
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=1,j,a=0,b=1,c=1;
		while(i<=n){
			j=1;
			while(j<=i){
				System.out.print(a+" ");
				c=a+b;
				a=b;
				b=c;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
