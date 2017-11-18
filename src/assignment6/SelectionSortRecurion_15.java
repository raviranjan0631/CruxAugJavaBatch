package assignment6;

import java.util.Scanner;

import assignment4array.BubbleSort;

public class SelectionSortRecurion_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];
		BubbleSort.takeInput(arr, s);
		selectionSort(arr,0,1,0);
		BubbleSort.display(arr);
	}
	public static void selectionSort(int[] arr, int i, int j, int k){
		if(i == arr.length){
			return;
		}
		
		if(j<arr.length){
			if(arr[i]>arr[j]){
				k = j; 
			}
			selectionSort(arr, i, j+1,k);
		}
		else{
			swap(arr,i,k);
			selectionSort(arr, i+1, i+1, 0);
		}
	}
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
