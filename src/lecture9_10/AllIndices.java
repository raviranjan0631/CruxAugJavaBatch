package lecture9_10;

import java.util.ArrayList;
import java.util.Scanner;

import assignment4array.BubbleSort;

public class AllIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		BubbleSort.takeInput(arr, scn);
		int numSearch = scn.nextInt();
		//System.out.println(indices(arr,1,0));
		ArrayList<Integer> a1 =new ArrayList();
		System.out.println(indicesUp(arr, numSearch, 0, 0, a1));
	}
	//up to down
	public static ArrayList<Integer> indices(int[] arr, int num, int index){
		if(arr.length == index){
		 ArrayList<Integer> a2 = new ArrayList<>();
		 return a2;
		}
		ArrayList<Integer> a1 = indices(arr, num, index+1);
		if(arr[index] == num){
			a1.add(0,index);
			
		}
		
		
		return a1;
	}
	// only up
	public static ArrayList<Integer> indicesUp(int[] arr, int num, int index, int counter, ArrayList<Integer> a1){
		if(arr.length == index){
		 
		 return a1;
		}
		if(arr[index] == num){
			a1.add(counter,index);
			counter+=1;
			
		}
		indicesUp(arr, num, index+1, counter, a1);
		
		return a1;
	}
	public static void boardPaths(int s, int d, String path){
		
	}

}
