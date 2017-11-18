package assignment4array;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int[] arr = new int[num];
		takeInput(arr,scn);
		selectionSort(arr);
		display(arr);
		
	}
	public static void takeInput(int[] arr, Scanner scn){
		for(int i = 0;i<arr.length;i++){
			arr[i] = scn.nextInt();
		}
	}
	public static void display(int[] arr){
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void swap(int arr[], int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void selectionSort(int[] arr){
		for(int i = 0;i<arr.length;i++){
			int mid =i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[mid]<arr[j]){
					mid = j;
				}
				swap(arr,mid,i);
			}
		}
		
	}

}
