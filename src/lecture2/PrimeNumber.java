package lecture2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn= new Scanner(System.in);
		System.out.println("plz enter the number");
		int n=scn.nextInt();
		int i=1,c=0;
		while(i<=n){
			if(n%i==0){
				c++;
			}
			i++;
		}
		if (c==2){
			System.out.println("number is prime "+n);
		}
		else {
			System.out.println("number is not prime "+n);
		}
	}

}
