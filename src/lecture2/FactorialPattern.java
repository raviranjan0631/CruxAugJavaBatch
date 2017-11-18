package lecture2;

import java.util.Scanner;

public class FactorialPattern {
	static int factorial (int a){
		int k=1;
			for(int i=1;i<=a;i++){
				k=k*i;}
			
			return k;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i=0,j=0;
		int l=0;
		while(i<n){j=0;
			while(j<=i){
				l=factorial(i)/(factorial(j)*factorial(i-j));
				System.out.print(l+" ");
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
