package lecture8;

import java.util.Scanner;

public class elementFoundRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<arr.length;i++){
			arr[i] = scn.nextInt();
		}
		int num = scn.nextInt();
		System.out.println(element2found(arr,0,num));
	}
	public static boolean element2found(int[]arr,int index,int num){
		
		if(arr[index] == num){
			return true;
		}
		if(index == arr.length-1){
			return false;
		}
		return element2found(arr, index+1, num);
		
	}
}
