package assignment6;

import java.util.Scanner;

import assignment4array.BubbleSort;

public class NumberInArray_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];
		BubbleSort.takeInput(arr, s);
		int n = s.nextInt();
		System.out.println(isPresent(arr,0, n));
	}
	public static boolean isPresent(int[] arr, int index, int n){
		if(index  == arr.length ){
			return false;
		}
		boolean b = true;
		if(arr[index] == n){
			return true;
		}
		else{
			b = isPresent(arr, index+1, n);
		}
		
		return b;
		
	}

}
