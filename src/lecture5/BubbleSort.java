package lecture5;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		takeInput(scn, arr);
		display(arr);
		bubbleSort(arr);
		System.out.println();
		display(arr);
	}
	public static void bubbleSort(int[] arr){
		int temp;
		for(int i = 0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
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
