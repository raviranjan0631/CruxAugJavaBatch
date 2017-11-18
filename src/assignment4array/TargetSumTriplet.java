package assignment4array;

import java.util.Scanner;

public class TargetSumTriplet {
	 public static void main(String args[]) {
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int arr[] = new int[n];
	        takeInput(arr,scn);
	        int target = scn.nextInt();
	      
	        targetNumber(arr,target);
	        
	        
	    }
	    public static void targetNumber(int[] arr, int target){
	        int sum =0;
	        for(int i = 0;i<arr.length;i++){
	            for(int j = i+1;j<arr.length;j++){
	                for(int k = j+1;k<arr.length;k++)
	            	{sum = arr[i]+arr[j]+arr[k];
	                if(sum == target){
	                    System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
	                }
	                }
	            }
	        }
	    }
	    	public static void takeInput(int[] arr, Scanner scn){
			for(int i = 0;i<arr.length;i++){
				arr[i] = scn.nextInt();
			}
		
	}


}
