package assignment7;

public class ReplacementByStar_5 {
     public static void main(String[] args) {
	System.out.println(replaceStar("helloll", ""));
    }
    public static String replaceStar(String str, String dup){
    	if(str.length()==1){
    		return str;
    	}
    	if(str.charAt(0)==str.charAt(1)){
    		dup = str.charAt(0)+"*"+replaceStar(str.substring(1), dup);
    	}
    	else{dup = str.charAt(0)+replaceStar(str.substring(1), dup);
    	}
    	return dup;
    }
}
