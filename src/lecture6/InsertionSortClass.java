package lecture6;

import java.util.Scanner;

public class InsertionSortClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		takeInput(scn, arr);
		display(arr);
		insertionSort(arr);
		System.out.println();
		display(arr);
	}
	public static void insertionSort(int[] arr){
		for(int i = 1;i<arr.length;i++){
			for(int j = i-1; j>=0; j--){ //for(int j = i; j>=0; j--)
				if(arr[j]>arr[j+1]){//if(arr[j-1]>arr[j])
					swap(arr,j,j+1);////swap(arr,j-1,j)
				}
			}
		}
			
	}
	public static void swap(int[] arr,int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
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

}
