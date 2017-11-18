package assignment7;

public class Hi_8_a_b_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countHi("abchijklhillhi", 0));
		System.out.println(removeHi("abchijklhillhi", ""));
		System.out.println(removeHiWbye("abchijklhillhi", ""));
		
	}
	//a
	public static int countHi(String str, int count){
		if(str.length()<2){
			return 0;
		}
		if(str.charAt(0)=='h'&&str.charAt(1)=='i'){
			count=1+countHi(str.substring(2), count);;
			
		}
		else{
			count = countHi(str.substring(1), count);
		}
		return count;
	}
	//b
	public static String removeHi(String str, String rmv){
		if(str.length()<2){
			return str;
		}
		if(str.charAt(0)=='h'&&str.charAt(1)=='i'){
			rmv += removeHi(str.substring(2), rmv);
			
		}
		else{
			rmv += str.charAt(0)+removeHi(str.substring(1), rmv);
		}
		return rmv;
	}
	//c
	public static String removeHiWbye(String str, String rmv){
		if(str.length()<2){
			return str;
		}
		if(str.charAt(0)=='h'&&str.charAt(1)=='i'){
			rmv += "bye"+removeHiWbye(str.substring(2), rmv);
			
		}
		else{
			rmv += str.charAt(0)+removeHiWbye(str.substring(1), rmv);
		}
		return rmv;
	}
}
