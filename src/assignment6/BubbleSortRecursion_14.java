package assignment6;

import java.util.Scanner;

import assignment4array.BubbleSort;

public class BubbleSortRecursion_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];
		BubbleSort.takeInput(arr, s);
		bubbleSort(arr,0,0);
		BubbleSort.display(arr);
	}
	public static void bubbleSort(int[] arr, int i, int j){
		if(i == arr.length){
			return;
		}
		if(j<arr.length-i-1){
			int count =0;
			if(arr[j]>arr[j+1]){
				swap(arr, j+1, j);
				count = 1;
			}
			bubbleSort(arr, i, j+1);
			if(count == 0){
				return;
			}
		}
		else{
			bubbleSort(arr, i+1, 0);
		}
	}
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
