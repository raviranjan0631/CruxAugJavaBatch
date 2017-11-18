package lecture5;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		takeInput(scn, arr);
		display(arr);
		selectionSort(arr);
		System.out.println();
		display(arr);
	}
	public static void selectionSort(int[] arr){
		int temp;
		for(int i = 0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
			
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
