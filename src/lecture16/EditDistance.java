package lecture16;

import lecture5.MultiJagged;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];
		System.out.println(editDistanceDp("abd", "axc", arr));
		MultiJagged.display(arr);
	}
	public static int editDistance(String s1, String s2){
		if(s1.equals(s2)){
			return 0;
		}
		if(s2.length() == 0){
			return s1.length();
		}
		if(s1.length() == 0){
			return s2.length();
		}
		
		int ops = 0;
		
		if(s1.charAt(0) == s2.charAt(0)){
			ops = editDistance(s1.substring(1), s2.substring(1));
		}
		else{
			int insert = 1 + editDistance(s1.substring(1), s2);
			int remove = 1 + editDistance(s1, s2.substring(1));
			int replace = 1 + editDistance(s1.substring(1), s2.substring(1));
			ops = Math.min(insert, Math.min(remove, replace));
		}
		return ops;
	}
	// bug prefer the class one
	public static int editDistanceDp(String s1, String s2, int arr[][]){
		if(s1.equals(s2)){
			arr[0][0] = 0;
			return 0;
	
		}
		if(s2.length() == 0){
			arr[0][s1.length()] = s1.length();
			return arr[0][s1.length()];
		}
		if(s1.length() == 0){
			arr[s2.length()][0] = s2.length();
			return arr[s2.length()][0];
		}
		if(arr[s1.length()][s2.length()]!=0){
			return arr[s1.length()][s2.length()];
		}
		int ops = 0;
		
		if(s1.charAt(0) == s2.charAt(0)){
			ops = editDistanceDp(s1.substring(1), s2.substring(1), arr);
		}
		else{
			int insert = 1 + editDistanceDp(s1.substring(1), s2, arr);
			int remove = 1 + editDistanceDp(s1, s2.substring(1), arr);
			int replace = 1 + editDistanceDp(s1.substring(1), s2.substring(1), arr);
			ops = Math.min(insert, Math.min(remove, replace));
		}
		arr[s1.length()][s2.length()] = ops;
		return ops;
	}
	
}
