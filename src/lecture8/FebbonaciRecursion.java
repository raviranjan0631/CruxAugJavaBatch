package lecture8;

import java.util.Scanner;

public class FebbonaciRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		fib(num,0,1);
	}
	public static void fib(int num,int a,int b){
		if(a>num){
			return;
		}
		System.out.println(a);
		int c = a+b;
		
		a = b;
		b=c;
		fib(num,a,b);
	}

}
