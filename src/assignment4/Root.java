package assignment4;

import java.util.Scanner;

public class Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		int root = root(x,n);
		System.out.println(root);
	}
	static int root(int x, int n){
		int c=0;
		while(x>0){
			
			x /=n;
			++c;
		}
		return --c;
	} 
}
