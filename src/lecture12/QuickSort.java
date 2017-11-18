package lecture12;

import assignment4array.BubbleSort;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,1,7,2,9,8};
		quickSort(arr, 0, arr.length-1);
		BubbleSort.display(arr);
	}
	public static void quickSort(int[] arr, int lo, int hi){
		if(lo>=hi){
			return;
		}
		
		
		int mid = (lo+hi)/2;
		int pivot = arr[mid];
		int l = lo, r= hi;
		while(l<r){
			while(arr[l]<pivot){
			l++;
				}
			while(arr[r]>pivot){
			r--;
				}
			if(l<=r){
				BubbleSort.swap(arr, l, r);
				l++;
				r--;}
		}
		quickSort(arr,lo,r);
		quickSort(arr, l, hi);
	}
		

	
	
	
	
	
//	public static void quickSort(int arr[],int low, int high ){
//		if(low >= high){
//			return;
//		}
//		if(low<high){
//		int pi = partition(arr, low, high);
//		quickSort(arr, low, pi-1);
//		quickSort(arr, pi+1, high);}
//	}
//	public static int partition(int arr[], int low, int high){
//		int i = low-1;
//		int pivot = arr[high];
//		int j = low;
//		for(j = low ; j<high;j++){
//			if(arr[j]<=pivot){
//				i++;
//				BubbleSort.swap(arr, i, j);
//			}
//		}
//		BubbleSort.swap(arr, i+1, high);
//	return i+1;
//	}
}
