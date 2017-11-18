package lecture8;

import java.util.Scanner;

import assignment4array.BubbleSort;

public class BubbleSortRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[] arr = new int[n];
		BubbleSort.takeInput(arr, s);
		bubbleSortRecursionclass(arr, 0, arr.length-1);
		BubbleSort.display(arr);
		
		

	}
//	public static void bubbleSortRecursion(int arr[],int i,int j){
//		if(j<arr.length-i-1){
//			if(arr[j]>arr[j+1])
//			{int temp = arr[j];
//			arr[j] = arr[j+1];
//			arr[j+1]=temp;}
//			bubbleSortRecursion(arr, i, j+1);
//		}
//		else if(i<arr.length){
//			bubbleSortRecursion(arr, i+1, j);}
//		else
//			return;
//	}
	public static void bubbleSortRecursionclass(int arr[],int si,int ei){
		if(ei==0){
			return;
		}
		if(si<ei){
			if(arr[si]>arr[si+1])
			{int temp = arr[si];
			arr[si] = arr[si+1];
			arr[si+1]=temp;}
			bubbleSortRecursionclass(arr, si+1, ei);
		}
		else {
			bubbleSortRecursionclass(arr, 0, ei-1);}
		
	}
	
	
}
