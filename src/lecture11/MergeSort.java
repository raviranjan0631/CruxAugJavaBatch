package lecture11;

import assignment4array.BubbleSort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a ={1,4,7,8,9};
		//int[] b = {2,3,5,6};
		int a[] = {2,1,5,3,0,6,7,11,9,8};
		//int k[] = mergec(a, b);
		int k[] = mergeSort(a, 0, a.length-1);
		BubbleSort.display(k);
	}
	public static int[] mergeSort(int[] arr, int beg, int last){
		if(beg==last){
			int[] base = new int[1];
			base[0] = arr[beg];
			return base;
		}
		int mid = (beg+last)/2;
		int arr1[] = mergeSort(arr, beg ,mid);
		int arr2[] = mergeSort(arr, mid+1 ,last);
		return merge(arr1, arr2);
	}
	public static int[] merge(int[] a, int[] b){
		int[] c = new int[a.length+b.length];
		int k = 0,i=0,j=0;
		while(k<c.length){
			if( i<a.length &&j<b.length&&a[i]<=b[j]){
				c[k] = a[i];
				i++;
				k++;
			}
			if(i<a.length &&j<b.length&&a[i]>b[j]){
				c[k] = b[j];
				j++;

				k++;
			}
			if(i==a.length&&j<b.length){
				c[k]=b[j];
				j++;
				k++;
			}
			else if(j==b.length&&i<a.length){
				c[k]=a[i];
				i++;
				k++;
			}
			
		}
		
		return c;
	}
//clASS BALA
	public static int[] mergec(int[] arr1, int[] arr2){
		int[] result = new int[arr1.length+arr2.length];
		int k = 0,i=0,j=0;
		while(i<arr1.length&&j<arr2.length){
			if(arr1[i]<arr2[j]){
				result[k] = arr1[i];
				i++;
				k++;
			}
			else {
				result[k] = arr2[j];
				j++;
				k++;
			}
			
		}	
		while(i<arr1.length){
			result[k] = arr1[i];
			i++;k++;
		}
		while(j<arr2.length){
			result[k] = arr2[j];
			j++;k++;
		}
		return result;
	}

}
