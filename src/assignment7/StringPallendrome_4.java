package assignment7;

public class StringPallendrome_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "anba";
		System.out.println(isPallendrome(str,0,str.length()-1));
	}
	public static boolean isPallendrome(String str, int l, int r){
		if(str.length()%2==0 && str.charAt(l)==str.charAt(r) && l==(r-1) ){return true;}
		if(str.length()%2!=0 && l==(r) ){return true;}
		
		if(str.charAt(l) != str.charAt(r)){
			return false;
		}
		
		return isPallendrome(str, l+1, r-1);
	}
}
