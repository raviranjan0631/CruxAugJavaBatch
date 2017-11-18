package lecture12;

import assignment4array.BubbleSort;

public class MergeSortVoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8,5,1,9,10,6,7,11};
		//int k[] = mergec(a, b);
		mergeSort(a, 0, a.length-1);
		BubbleSort.display(a);
	}
	public static void mergeSort(int[] arr, int low, int last){
		if(low== last){
			return;
		}
		if(low<last){
			int mid = (low+last)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, last);
			merge(arr, low, mid, last);
		}
		
	}
	
	public static void merge(int[] arr, int beg, int mid, int last){
		int i = beg, j = mid+1,k = beg;
		int[] arr1 = new int[j-i];
		int arr2[] = new int[last-mid];
		for( i = 0;i<arr1.length;i++){
			arr1[i] = arr[beg+i];
		}
		for( i = 0;i<arr2.length;i++){
			arr2[i] = arr[mid+1+i];
		}
		i =0;j=0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]){
				arr[k] = arr1[i];
				i++;
				k++;
			}
			else{
				arr[k] = arr2[j];
				k++;
				j++;
			}
		}
		while(i<arr1.length){
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length){
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}
		
	

}
