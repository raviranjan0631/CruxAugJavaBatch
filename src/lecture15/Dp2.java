package lecture15;

import lecture5.MultiJagged;

public class Dp2 {

	public static void main(String[] args) {
		
		///System.out.println(countBoardPathB2UShort(0, 10));
		//System.out.println(countMazePath(0, 0, 2, 2));
		//System.out.println(countMazePathDp(0, 0, 2, 2, new int[3][3]));
		//System.out.println(countMazePathB2UDp(0, 0, 2, 2));
		System.out.println(countMazepathB2UShort(0, 0, 2, 2));
	}
	
	// bottom up 
	public static int countBoardPathdpB2U(int s, int d, int[] arr){
		
		arr[d] = 1;
		for(int i = d-1;i>=0;i--){
			for(int j = 1; j<=6 && i+j<=d;j++){
				arr[i]+= arr[i+j]; 
			}
		}
		return arr[0];
	}
	
	public static int countBoardPathB2UShort(int s, int d ){
		int arr[]= new int[6];
		arr[0] = 1;int temp;
		for(int i = 1; i <= d; i++){
			for(int j = 0; j<= 4 ;j++){
				temp = arr[j]+arr[j+1];
				arr[j+1] =arr[j];
				arr[j] = temp;
			}
		}
		
		return arr[0];
		//or class bala
//		int arr[]= new int[6];
//		arr[0] = 1;
//		for(int i = 1; i <= d; i++){
//			int sum = arr[0];
//			for(int j = 5 ; j > 0 ; j--){
//				sum += arr[j]; 
//				arr[j] = arr[j - 1];
//			}
//			arr[0] = sum;
//		}
//		
//		
//		
//		return arr[0];
		
	
	}
	
	public static int countBoardPath(int s, int d){
		if(s == d){
			return 1;
		}
		
		int count = 0;
		for(int i = 1; i <= 6 && s +i <= d; i++){
			count += countBoardPath(s + i, d);
		}
		return count;
	}
	
	public static int countBoardPathRS(int s, int d, int[] storage){
		if(s == d){
			storage[s] = 1;
			return storage[d];
		}
		
		if(storage[s] != 0){
			return storage[s];
		}
		
		int count = 0;
		for(int i = 1; i <= 6 && s +i <= d; i++){
			count += countBoardPathRS(s + i, d, storage);
		}
		storage[s] = count;
		return count;
	}
	
	public static int countMazePath(int sr, int sc, int dr, int dc){
		if(sr == dr && sc == dc){
			return 1;
		}
		if(sc>dc || sr>dr){
			return 0;
		}
		int count = 0;
		count += countMazePath(sr, sc+1, dr, dc);
		count += countMazePath(sr+1, sc, dr, dc);
		return count;
	}

	public static int countMazePathDp(int sr , int sc, int dr, int dc, int storage[][]){//storage[dr+1][dc+1]
		if(sr == dr && sc == dc){
			int base[][] = new int[dr+1][dc+1];
			base[dr][dc] = 1;
			return base[dr][dc];
		}	
		if(storage[sr][sc] != 0){
			return storage[sr][sc];
		}
		int count = 0;
		count += countMazePath(sr, sc+1, dr, dc);
		count += countMazePath(sr+1, sc, dr, dc);
		storage[sr][sc] =  count;
		return storage[sr][sc];
	}
	
	public static int countMazePathB2UDp(int sr, int sc, int dr, int dc){
		int arr[][] = new int[dr+1][dc+1];
		for(int i = dr;i>=0;i--){
			for(int j = dc;j>=0;j--){
				if(j == dr||i == dc){
					arr[i][j] = 1;
				}
				else {
					arr[i][j] = arr[i+1][j]+arr[i][j+1];
				}
			}
		}
		
		return arr[0][0];
	}
	
	public static int countMazepathB2UShort(int sr, int sc, int dr, int dc){
		int arr[] = new int[dc+1];
		arr[dc] = 1;
		for(int i = 0; i <= dr; i++){
			for(int j = dc-1; j>=0;j--){
				arr[j] = arr[j+1] + arr[j];
				
			}
		}
		return arr[0];
	}
}
