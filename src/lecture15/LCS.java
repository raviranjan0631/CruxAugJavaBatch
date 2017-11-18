package lecture15;

import assignment4array.BubbleSort;
import lecture5.MultiJagged;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(commonSubSequenceRecursion("abcde", "bacde"));
		int arr[][] = new int[5][5];
		//System.out.println(commonSubSequenceRecursionDp("abcd", "bacd",arr));
		//System.out.println(commonSubSequenceRecursionDpB2U("abcd", "bacd"));
		//MultiJagged.display(arr);
//		System.out.println(commonSubSequenceRecursionDpB2UShort("abcde", "bacde"));
		System.out.println(commonSubSequenceRecursionDpB2UShortClass("abcde", "bacde"));
	}
	public static int commonSubSequenceRecursion(String str1, String str2){
		if(str1.length() == 0|| str2.length() == 0){
			return 0;
		}
		int count = 0,k,count1, count2;
		if(str1.charAt(0) == str2.charAt(0)){
			count = 1 + commonSubSequenceRecursion(str1.substring(1), str2.substring(1));
			k = count;
		}
		
		else{
			 count1 = commonSubSequenceRecursion(str1.substring(1), str2);
			 count2 = commonSubSequenceRecursion(str1, str2.substring(1));
			 if(count1 >= count2 && count1 >= count ){
					k = count1;
				}
			 else if(count2 >= count){
				 k = count2;
			 }
			 else{k = count;}
		}
		return k;
		
	}
	public static int commonSubSequenceRecursionDp(String str1, String str2, int arr[][]){
		if(str1.length() == 0|| str2.length() == 0){
			arr[0][0] = 0;
			return arr[0][0];
		}
		if(arr[str1.length()-1][str2.length()-1] != 0){
			return arr[str1.length()-1][str2.length()-1];
		}
		int count = 0,k,count1, count2;
		if(str1.charAt(0) == str2.charAt(0)){
			count = 1 + commonSubSequenceRecursionDp(str1.substring(1), str2.substring(1),arr);
			k = count;
		}
		else{
			 count1 = commonSubSequenceRecursionDp(str1.substring(1), str2,arr);
			 arr[str1.substring(1).length()][str2.length()-1] = count1;
			 count2 = commonSubSequenceRecursionDp(str1, str2.substring(1),arr);
			 arr[str1.length()-1][str2.substring(1).length()] = count2;
			 if(count1 >= count2 && count1 >= count ){
					k = count1;
				}
			 else if(count2 >= count){
				 k = count2;
			 }
			 else{k = count;}
		}
		arr[str1.length()-1][str2.length()-1] = k;
		return arr[str1.length()-1][str2.length()-1];
	}
	
	public static int commonSubSequenceRecursionDpB2U(String str1, String str2){
		int arr[][] = new int[str1.length()+1][str2.length()+1];
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[0].length;j++){
				if(i == 0|| j==0){
					arr[i][j] = 0;
				}
				else if(str1.charAt(str1.length()-i) == str2.charAt((str2.length()-j)) ){
					arr[i][j] = i;
				}
				else{
					arr[i][j] = arr[i-1][j]>=arr[i][j-1]?arr[i-1][j]:arr[i][j-1];
				}
			}
		}
		MultiJagged.display(arr);
		return arr[str1.length()][str2.length()];
	}
	
	public static int commonSubSequenceRecursionDpB2UShort(String str1, String str2){
			int arr[] = new int[str2.length()];
		//bug it give the answer decremented by one
		int dia = 0;
		for(int i = 0;i<str1.length();i++){
			dia = 0;
			for(int j =str1.length()-1;j>0;j--){
				if(str1.charAt(j) == str2.charAt(j)){
					dia++;
					arr[j] = dia;
				}
				else if(j != str1.length()-1){
					arr[j-1] = arr[j]>arr[j-1]?arr[j]:arr[j-1];
				}
			}
		}
		BubbleSort.display(arr);
			return arr[0];
	}
	//classbala
	public static int commonSubSequenceRecursionDpB2UShortClass(String s1, String s2){
		int[] storage = new int[s2.length()+1];
		for(int i = s1.length() - 1; i >= 0; i--){
			int currentdia = 0, prevdia = 0;
			for(int j = storage.length - 2; j >= 0; j--){
				currentdia = storage[j];
				if(s1.charAt(i) == s2.charAt(j)){
					storage[j] = prevdia + 1;
				}
				else{
					storage[j] = Math.max(storage[j], storage[j+1]);
				}
				prevdia = currentdia;
			}
		}
		
		return storage[0];
	}
}
