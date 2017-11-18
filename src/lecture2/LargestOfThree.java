package lecture2;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter 1st number");
		int a=scn.nextInt();
		System.out.println("please enter 2nd number");
		int b=scn.nextInt();
		System.out.println("please enter 3rd number");
		int c=scn.nextInt();
		if((a>=b)&&(a>=c)){
			System.out.println(a+" is greatest");
		}
		else if(b>=c){
			System.out.println(b+" is greatest");
		}
		else{
			System.out.println(c+" is greatest");
		}

		
	}

}
