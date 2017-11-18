package lecture9_10;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecursionStringSubSequence {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		printSubSequencesWithAscii("abc", "");
		System.out.println(countsubString("abc", ""));
	}
	
	
	
	public static void printSubSequences(String s, String subSeq){
		if(s.length() == 0 ){
			System.out.println(subSeq);
			return;
		}
		printSubSequences(s.substring(1, s.length()), subSeq);
		printSubSequences(s.substring(1, s.length()), subSeq+s.charAt(0));
	}
	

	
	
	
	public static void printSubSequencesWithAscii(String s, String subSeq){
		if(s.length() == 0 ){
			System.out.println(subSeq);
			return;
		}
		printSubSequencesWithAscii(s.substring(1, s.length()), subSeq);
		printSubSequencesWithAscii(s.substring(1, s.length()), subSeq+s.charAt(0));
		printSubSequencesWithAscii(s.substring(1, s.length()), subSeq+(int)(s.charAt(0)));
	}
	//class bala
	

	
	public static ArrayList<String> getSubSequence(String s){
		if(s.equals("")){
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}
		ArrayList<String> myList = new ArrayList<>();
			ArrayList<String> recList = getSubSequence(s.substring(1));
			myList.addAll(recList);
			for(int j = 0;j<recList.size();j++){
				String recString = recList.get(j);
				myList.add(s.charAt(0)+recString);
		}
		return myList;
	}
	
	
	
	
	public static int countsubString(String s, String subSeq){
		if(s.length() == 0 ){
			
			return 1;
		}int count =0;
		count +=countsubString(s.substring(1, s.length()), subSeq);
		count+=countsubString(s.substring(1, s.length()), subSeq+s.charAt(0));

		return count;
	}
}
