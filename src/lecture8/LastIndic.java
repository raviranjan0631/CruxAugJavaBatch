package lecture8;

import java.util.Scanner;

public class LastIndic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<arr.length;i++){
			arr[i] = scn.nextInt();
		}
		int num = scn.nextInt();
		System.out.println(firstIndic(arr,arr.length-1,num));
	
	}
	public static int firstIndic(int[] arr,int index,int num){
		if(arr[index] == num){
			return index;
		}
		if(index == 0){
			return -1;
		}
		return firstIndic(arr, index-1, num);
	}
//
}
