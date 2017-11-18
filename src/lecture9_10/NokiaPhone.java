package lecture9_10;

import java.util.ArrayList;

public class NokiaPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(keypad1("123", ""));
		//System.out.println(keypad("12"));
	}
	public static String getCode(char ch){
		String retval = "";
		switch (ch) {
			case '1':
				retval = "abc";
				break;
			case '2':
				retval = "def";
				break;
			case '3':
				retval = "ghi";
				break;
			case '4':
				retval = "jkl";
				break;
			case '5':
				retval = "mno";
				break;
			case '6':
				retval = "pqr";
				break;
			case '7':
				retval = "stu";
				break;
			case '8':
				retval = "vwx";
				break;
			case '9':
				retval = "yz";
				break;
			default :
				retval ="";
				break;
		}
		return retval;
	}

	public static void keypad(String inpu, String result){
		if(inpu.equals("")){
			System.out.println(result);
			return;
		}
		String s = getCode(inpu.charAt(0));
		for(int i = 0;i<s.length();i++){
		keypad(inpu.substring(1),result+s.charAt(i));}
		
	}
	public static int keypad1(String inpu, String result){
		if(inpu.equals("")){
			return 1;
		}
		String s = getCode(inpu.charAt(0));
		int count =0;
		for(int i = 0;i<s.length();i++){
		count +=keypad1(inpu.substring(1),result+s.charAt(i));}
		
		return count;
	}
	public static ArrayList<String> keypad(String s){
		if(s.length()==0){
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}
		ArrayList<String> recList = keypad(s.substring(1));
		ArrayList<String> myList = new ArrayList<>();
		String s1 = getCode(s.charAt(0));
		for(int i = 0;i<s1.length();i++){
			for(int j = 0;j<recList.size();j++){
				myList.add(""+s1.charAt(i)+recList.get(j));
			}
		}
		return myList;
	}
}
