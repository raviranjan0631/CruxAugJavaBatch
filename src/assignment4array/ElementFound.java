package assignment4array;

import java.util.Scanner;

public class ElementFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =  new Scanner(System.in);
		int n = scn.nextInt();
		int[] a= new int[n];
		System.out.println("enter the more number "+a.length/2 );
		for(int  i = 0; i<n;i++){
			a[i] = scn.nextInt();
		}
		
		int index = maxArray(a,scn);
		System.out.println(index);

	}
	public static int maxArray(int[] a, Scanner scn){
		
		System.out.println("enter the number u want to search");
		int num = scn.nextInt();
		for(int i = 0 ; i<a.length; i++){
			if(num == a[i]){
				return i;
			}
		}
		return -1;
	}

}
