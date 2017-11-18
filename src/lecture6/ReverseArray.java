package lecture6;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		takeInput(scn, arr);
		
		System.out.println();
		
		Reverse(arr);
		display(arr);
	}
	public static void Reverse(int[] arr){
		for(int l = 0, r = arr.length-1;l<r;l++,r--){
			swap(arr, l, r);
		}
	}
	
	public static void takeInput(Scanner scn, int[] arr){
		for(int i = 0; i< arr.length; i++){
			arr[i] = scn.nextInt();
		}
	}
	public static void display(int[] arr){
		for(int i = 0; i< arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	public static void swap(int[] arr,int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
