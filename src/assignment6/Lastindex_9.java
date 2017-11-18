package assignment6;

import java.util.Scanner;

import assignment4array.BubbleSort;

public class Lastindex_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];
		BubbleSort.takeInput(arr, s);
		int n = s.nextInt();
		System.out.println(isPresent(arr,arr.length-1, n));
	}
	public static int isPresent(int[] arr, int index, int n){
		if(index+1  == 0 ){
			return -1;
		}
		int b;
		if(arr[index] == n){
			return index;
		}
		else{
			b = isPresent(arr, index-1, n);
		}
		
		return b;
		
	}

}
