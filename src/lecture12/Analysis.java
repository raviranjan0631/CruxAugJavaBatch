package lecture12;

import lecture5.BubbleSort;

public class Analysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10000];
		for(int i = 0;i<arr.length;i++){
			arr[i] = arr.length-i;
		}
		timeTakenByBubble(arr);
		timeTakenByMerge(arr);
	}
	public static void timeTakenByMerge(int[] arr){
		//1st jan 1970
		long start = System.currentTimeMillis();
		MergeSortVoid.mergeSort(arr, 0, arr.length-1);
		long end = System.currentTimeMillis();
		System.out.println("MergeSort "+(end-start));
	}
public static void timeTakenByBubble(int[] arr){
	long start = System.currentTimeMillis();
	BubbleSort.bubbleSort(arr);
	long end = System.currentTimeMillis();
	System.out.println("BubbleSort "+(end-start));	
	}

}
