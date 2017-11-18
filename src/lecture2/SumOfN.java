package lecture2;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Please tell the number");
		int n=scn.nextInt();
		int i=1;
		int s=0;
		while(i<=n){
			s=s+i;
			i++;
		}
		System.out.println("sum of 1 to "+n+" is " +s);

	}

}
