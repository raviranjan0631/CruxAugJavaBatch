package lecture8;

import java.util.Scanner;

public class ContainingIndicesOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<arr.length;i++){
			arr[i] = scn.nextInt();
		}
		int num = scn.nextInt();
		int count =0;
		int arr1[]=indices(arr,num,count,0);
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
	
	}
	public static int allIndic(int[] arr,int index,int num, int arr1[], int count){
		if(arr[index] == num){
			arr1[count] = index;
			count = count+1;
		}
		if(index == arr.length-1){
			return count;
		}
		return allIndic(arr, index+1, num, arr1,count);
	}
	//classbala
	public static int[] indices(int[] arr,int num,int ctr,int index){
	if(index==arr.length){
		int[] baseArr= new int[ctr];
		return baseArr;
	}
	if(arr[index]==num){
		ctr+=1;
	}
	int outArr[] = indices(arr,num,ctr,index+1);
	if(arr[index]==num){
		outArr[ctr-1]=index;

	}
	return outArr;
}
}
