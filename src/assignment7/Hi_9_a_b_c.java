package assignment7;

public class Hi_9_a_b_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeHi("abchitjklhillhi", ""));
		System.out.println(countHi("abchitjklhillhi", 0));

		System.out.println(removeHiWbye("abchitjklhillhi", ""));
	}
	
	//a
	public static int countHi(String str, int count){
		if(str.length()<3 && str.charAt(0)!='h'&&str.charAt(1)!='i'){
			return 0;
		}
		if(str.length()<3 && str.charAt(0)=='h'&&str.charAt(1)=='i')
		{return 1;}
		
		
		if(str.charAt(0)=='h'&&str.charAt(1)=='i'&&str.charAt(2)!='t'){
			count +=1+ countHi(str.substring(2), count);
			
		}
		else{
			count+= countHi(str.substring(1), count);
		}
		return count;
	}
	
	
	
	//b
	public static String removeHi(String str, String rmv){
		if(str.length()<3 && str.charAt(0)!='h'&&str.charAt(1)!='i'){
			return str;
		}
		if(str.length()<3 && str.charAt(0)=='h'&&str.charAt(1)=='i')
		{return "";}
		
		
		if(str.charAt(0)=='h'&&str.charAt(1)=='i'&&str.charAt(2)!='t'){
			rmv += removeHi(str.substring(2), rmv);
			
		}
		else{
			rmv += str.charAt(0)+removeHi(str.substring(1), rmv);
		}
		return rmv;
	}
	public static String removeHiWbye(String str, String rmv){
		if(str.length()<3 && str.charAt(0)!='h'&&str.charAt(1)!='i'){
			return str;
		}
		if(str.length()<3 && str.charAt(0)=='h'&&str.charAt(1)=='i')
		{return "bye";}
		
		
		if(str.charAt(0)=='h'&&str.charAt(1)=='i'&&str.charAt(2)!='t'){
			rmv += "bye"+removeHiWbye(str.substring(2), rmv);
			
		}
		else{
			rmv += str.charAt(0)+removeHiWbye(str.substring(1), rmv);
		}
		return rmv;
	}

}
