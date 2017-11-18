package lecture8;

import java.util.Scanner;

public class RecursionFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		System.out.println(recursionFactorial(n));
	}
	public static int recursionFactorial(int num){
		if(num == 1)
			{return 1;}
		
		return num*recursionFactorial(num-1);
	}

}
