package assignment4;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc();
	
	}
	static void calc(){
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		char op = scn.next().charAt(0);
		int result=0;
		switch (op){
		case '+':{
			result = n1+n2;
			System.out.println(result);
			break;
		}
		case '-':{
			result = n1-n2;
			System.out.println(result);
			break;
		}
		case '*':{
			result = n1*n2;
			System.out.println(result);
			break;
		}
		case '/':{
			result = n1/n2;
			System.out.println(result);
			break;
		}
		case '%':{
			result = n1%n2;
			System.out.println(result);
			break;
		}
		case 'x':{
			return;
		}
		case 'X':{
			return;
		}
		
		
		default:{
			calc();
			break;
		}}
		
	}

}
