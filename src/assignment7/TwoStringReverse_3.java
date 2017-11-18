package assignment7;

public class TwoStringReverse_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(twoStringsRev("abcd","dcba",0, 3));
	}
	public static boolean twoStringsRev(String str1, String str2, int l, int r){
		boolean b=false;
		if(l == (str1.length()-1) && (r == 0) ){
			return true;
		}
		
		if(str1.length()!=str2.length()){
			return false;
		}
		if(str1.charAt(l) == str2.charAt(r)){
		b= twoStringsRev(str1, str2, l+1, r-1);
		}
		return b;
	}
}
