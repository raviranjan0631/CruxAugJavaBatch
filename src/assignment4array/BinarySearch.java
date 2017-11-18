package assignment4array;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =  new Scanner(System.in);
		int n = scn.nextInt();
		int[] a= new int[n];
		System.out.println("enter the number in sorted array"+a.length/2 );
		for(int  i = 0; i<n;i++){
			a[i] = scn.nextInt();
		}
		
		int index = binarySearch(a,scn);
		System.out.println(index);

	}
	public static int binarySearch(int[] a, Scanner scn){
		
		
		System.out.println("enter the number u want to search");
		int num = scn.nextInt();
		int beg = 0, last = a.length-1;
		int mid = (beg+last)/2;
		while(beg<=last){
			if(a[mid] == num){
				return mid;
			}
			if(a[mid]>num){
				last = mid -1;
			}
			if(a[mid]<num){
				beg = mid + 1;
			}
			mid=(beg+last)/2;
		}
		return -1;
	}

}
