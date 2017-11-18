package assignment4array;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int[] arr = new int[num];
		takeInput(arr,scn);
		bubbleSort(arr);
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
	public static void bubbleSort(int[] arr){
		for(int i = 0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
			}
		}
		
	}
	public static void swap(int arr[], int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
