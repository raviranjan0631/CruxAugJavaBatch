package lecture2;

import java.util.Scanner;

public class RemainderEvenOddSum {

	public static void main(String a[]){
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int oddsum=0,evensum=0;
		while(n!=0){
			oddsum+=n%10;
			n=n/10;
			evensum+=n%10;
			n=n/10;
		}
		System.out.println("odd palce sum is "+oddsum);
		System.out.println("even palce sum is "+evensum);
	}
}
