package assignment7;

public class String2Number_2 {
	public static void main(String[] args) {
		System.out.println(string2Num("54376", 0, 1));
	}
	public static int string2Num(String str, int num,int pow){
		if(str.length()==0){
			return 0;
		}
		num += ( str.charAt(str.length()-1)-48)*Math.pow(10, pow-1)  + (string2Num(str.substring(0,str.length()-1), num,pow+1) );
		
		
		return num;
	}
}
