package lecture8;

import java.util.Scanner;

import assignment4array.BubbleSort;

public class SelectionSortRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		BubbleSort.takeInput(arr, scn);
		selectionSortRecursionclass(arr,1,0);
		BubbleSort.display(arr);
	}
	public static void selectionSortRecursionclass(int arr[],int si,int ci){
		if(ci==arr.length-1){
			return;
		}
		if(si<arr.length){
			if(arr[ci]>arr[si])
			{int temp = arr[ci];
			arr[ci] = arr[si];
			arr[si]=temp;}
			selectionSortRecursionclass(arr, si+1, ci);
		}
		else {
			selectionSortRecursionclass(arr, ci+2, ci+1);}
		
	}
	


}
