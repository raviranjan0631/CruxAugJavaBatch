package lecture8;

import java.util.Scanner;

public class FirstIndiceOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<arr.length;i++){
			arr[i] = scn.nextInt();
		}
		int num = scn.nextInt();
		System.out.println(firstIndic(arr,0,num));
	
	}
	public static int firstIndic(int[] arr,int index,int num){
		if(arr[index] == num){
			return index;
		}
		if(index == arr.length-1){
			return -1;
		}
		return firstIndic(arr, index+1, num);
	}
	public static int lastIndic(int arr[], int index,int num){
		if(index == arr.length){
			return -1;
		}
		int idx = lastIndic(arr,index+1,num);
		if(idx==-1){
			if(arr[index]==num){
				return index;
			}
			else{return -1;}
		
			}
		return idx;
	}
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
			index-=1;
		}
		return outArr;
	}

}
