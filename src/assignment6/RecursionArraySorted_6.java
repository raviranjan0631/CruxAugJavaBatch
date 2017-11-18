package assignment6;

import java.util.Scanner;

import assignment4array.BubbleSort;

public class RecursionArraySorted_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];
		BubbleSort.takeInput(arr, s);
		System.out.println(isSorted(arr,0));
	}
	public static boolean isSorted(int[] arr, int index){
		if(index + 1 == arr.length ){
			return true;
		}
		boolean b = true;
		if(arr[index] <= arr[index+1]){
			b = isSorted(arr, index+1);
		}
		else{
			return false;
		}
		return b;
		
	}

}
