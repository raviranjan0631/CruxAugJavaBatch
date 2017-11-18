package lecture5;

import java.util.Scanner;

public class ArrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		takeInput(scn, arr);
		display(arr);
		int max = max(arr);
		System.out.println("max is "+max);
		int numsearch = scn.nextInt();
		int index = numSearch(arr,numsearch);
		System.out.println("position is "+index);
	}
	public static int numSearch(int[] arr, int numsearch){
	
		for(int i =0; i<arr.length;i++){
			if(numsearch==arr[i]){
				return i;
			}
		}
		return -1;
	}
	public static int max(int[] arr){
		int max = 0;
		for(int i = 0; i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		return max;
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
