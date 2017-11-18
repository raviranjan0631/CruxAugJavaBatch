package lecture6;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5,6,7};
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int k = binarySearch(arr, num);
		System.out.println(k);
	}

	public static int binarySearch(int arr[], int n){
		int beg = 0;
		int last = arr.length-1;
		int mid=(beg+last)/2;
		while(beg<=last){
			if(arr[mid] > n){
				last = mid-1;
				
			}
			else if(arr[mid] < n){
				beg = mid+1;
				
			}
			else if(arr[mid] == n){
				return mid +1;
			}
			mid=(beg+last)/2;
		}
		return -1;
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
