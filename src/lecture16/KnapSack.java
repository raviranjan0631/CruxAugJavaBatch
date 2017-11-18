package lecture16;

import lecture5.MultiJagged;

public class KnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[] = {1,1,9,7,3};
		int wt[] = {2,4,4,3,1};
		int weight = 8;
		int arr[][] = new int[weight+1][wt.length+1];
		//System.out.println(knapsack(val, wt, weight, 0));
		System.out.println(knapsackDp(val, wt, weight, 0, arr));
		MultiJagged.display(arr);

	}
	public static int knapsack(int[] val, int[] wt, int weight, int index){
		if(wt.length == index||weight<=0){
			return 0;}
		int v =0;
		if(weight>=wt[index]){
			int val1 = val[index] + knapsack(val, wt, weight-wt[index], index+1);
			v = knapsack(val, wt, weight, index+1);
			return Math.max(val1, v);
			
		}
		else{
			v = knapsack(val, wt, weight, index+1);
			return v;
		}
	}
	
	public static int knapsackDp(int[] val, int[] wt, int weight, int index, int arr[][]){
		if(wt.length == index||weight<=0){
			
			return 0;}
		
		if(arr[weight][index] != 0  ){
			return arr[weight][index];
		}
	
		int v = 0;
	if(wt[index]>weight){
		v = knapsackDp(val, wt, weight, index+1, arr);
	}
	else{
		int val1 = val[index] + knapsackDp(val, wt, weight-wt[index], index+1, arr);
		int val2 = knapsackDp(val, wt, weight, index+1, arr);
		v=  Math.max(val1, val2);
	}
	arr[weight][index] = v;
	return v;
	}
}
