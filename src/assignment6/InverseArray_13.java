package assignment6;

import java.util.Scanner;

import assignment4array.BubbleSort;

public class InverseArray_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];
		BubbleSort.takeInput(arr, s);
		int inv[] = inverse(arr, 0);
		BubbleSort.display(inv);
	}
	public static int[] inverse(int	arr[],int index){
		if(arr.length == index){
			int inv[] = new int[arr.length];
			return inv;
		}
		int inv[] = inverse(arr, index+1);
		int k = arr[index];
		inv[k] = index; 
		return inv;
	}
}


