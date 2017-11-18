package assignment6;

import java.util.Scanner;

import assignment4array.BubbleSort;

public class FirstIndex_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];
		BubbleSort.takeInput(arr, s);
		int n = s.nextInt();
		System.out.println(isPresent(arr,0, n));
	}
	public static int isPresent(int[] arr, int index, int n){
		if(index  == arr.length ){
			return -1;
		}
		int b;
		if(arr[index] == n){
			return index;
		}
		else{
			b = isPresent(arr, index+1, n);
		}
		
		return b;
		
	}


}
