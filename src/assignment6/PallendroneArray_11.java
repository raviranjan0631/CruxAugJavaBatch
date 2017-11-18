package assignment6;

import java.util.Scanner;

import assignment4array.BubbleSort;

public class PallendroneArray_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];
		BubbleSort.takeInput(arr, s);
		System.out.println(pallendrineArray(arr,0, arr.length-1));
	}
	public static boolean pallendrineArray(int arr[] , int first,int last ){
		if(first == last && arr.length%2!=0){
			return true;
		}
		if(first == (last-1) && arr.length%2==0 && arr[first]==arr[last]){
			return true;
		}
		
		boolean b;
		if(arr[first] == arr[last]){
			b = pallendrineArray(arr, first+1, last-1);
		}
		else {b = false;}
		return b;
	}

}
