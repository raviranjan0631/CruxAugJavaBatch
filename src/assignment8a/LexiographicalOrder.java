package assignment8a;

import java.util.Scanner;

public class LexiographicalOrder {
	 public static void main(String args[]) {
	        // Your Code Here
	        Scanner scn=new Scanner(System.in);
			int num=scn.nextInt();
			System.out.print("0");
			LexicoGraphic(num,1);
			scn.close();
	    }
	    public static void LexicoGraphic(int N, int k) 
		{
		if (k > N) {return;} 			

		for(int i = 0; i<10; i++) 
		{ 
			if (k <= N) 
			{ 
		    	System.out.print(" "+k);
				k *= 10; 
				LexicoGraphic(N, k); 
				k /= 10; 
				k++; 
				if (k%10 == 0) return; 
			} 
		} 
		}
}
