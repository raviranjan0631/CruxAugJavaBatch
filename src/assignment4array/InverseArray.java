package assignment4array;

import java.util.Scanner;

public class InverseArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num =  scn.nextInt();
		int[] arr = new int[num];
		for(int i =0; i<num; i++){
			arr[i] = scn.nextInt();
		}
		System.out.println(inverseArray(arr));
	}
	public static boolean inverseArray(int[] arr){
		int invArr[] = new int[arr.length];
		int j; 
		for(int i = 0; i<arr.length;i++){
			j = arr[i];
			int k = i;
			invArr[j] = (k);
		}
		for(int i = 0; i<arr.length;i++){
			System.out.print(invArr[i]+" ");
		}
		for(int i = 0; i<arr.length;i++){
			if(arr[i] != invArr[i]){
				return false;
			}
		}
		return true;
		
	}
}
