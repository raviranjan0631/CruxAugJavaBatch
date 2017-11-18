package assignment7;

public class ReplacementDuplicate_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replacementDuplicate("helloll",""));
	}
	public static String replacementDuplicate(String str, String dup){
		if(str.length() == 1||str.length()==0){
			return str;
		}
		if(str.charAt(0) == str.charAt(1)&&str.length()>=2){
			dup = str.charAt(0)+replacementDuplicate(str.substring(2), dup);
		}
		else{dup = str.charAt(0)+replacementDuplicate(str.substring(1), dup);}
		return dup;
	}
}
