package assignment4array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =  new Scanner(System.in);
		int n = scn.nextInt();
		int[] a= new int[n];
		System.out.println("enter the number in sorted array"+a.length/2 );
		for(int  i = 0; i<n;i++){
			a[i] = scn.nextInt();
		}
		reverseArray(a,scn);

	}
	public static void reverseArray(int[] a, Scanner scn){
		
		for(int i = 0, j = a.length-1; i<j ; i++, j--){
			swap(a,i,j);
		}
		for(int i = 0;i<=a.length-1; i++){
			System.out.print(a[i]);
		}	
	}
	public static void swap(int[] a, int i, int j){
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp;
	}
}
