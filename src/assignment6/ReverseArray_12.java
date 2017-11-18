package assignment6;

import java.util.Scanner;

import assignment4array.BubbleSort;

public class ReverseArray_12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];
		BubbleSort.takeInput(arr, s);
		reverseArray(arr,0, arr.length-1);
		BubbleSort.display(arr);
	}
	public static void reverseArray(int arr[] , int first,int last ){
		if(first == last){
			return ;
		}
		
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;
		reverseArray(arr, first+1, last-1);
		
	}


}
