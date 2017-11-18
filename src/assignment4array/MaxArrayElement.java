package assignment4array;

import java.util.Scanner;

public class MaxArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =  new Scanner(System.in);
		int n = scn.nextInt();
		int[] a= new int[n];
		for(int  i = 0; i<n;i++){
			a[i] = scn.nextInt();
		}
		int max = maxArray(a,scn);
		System.out.println(max);

	}
	public static int maxArray(int[] a, Scanner scn){
		int max = 0;
		for(int i = 0 ; i<a.length; i++){
			if(max<a[i]){
				max = a[i];
			}
		}
		return max;
	}

}
