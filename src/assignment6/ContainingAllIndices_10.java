package assignment6;

import java.util.Scanner;

import assignment4array.BubbleSort;

public class ContainingAllIndices_10{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];
		BubbleSort.takeInput(arr, s);
		int n = s.nextInt();
		int[] arr1 = containingAllIndices(arr,n, 0, 0);
		BubbleSort.display(arr1);
	}
	public static int[] containingAllIndices(int[] arr,int n, int i ,int count){
		if(i == arr.length){
			int carr[] = new int[count];
			return carr;
		}
		if(n == arr[i]){
			count++;
		}
		int arr1[] = containingAllIndices(arr, n, i+1, count);
		if(n == arr[i]){
			arr1[count-1] = i;
			
		}
		return arr1;
	}
	

}
