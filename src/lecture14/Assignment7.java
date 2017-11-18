package lecture14;

import java.util.ArrayList;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(moveXToEnd("abexexdexed", 0));
//		System.out.println(countHiWT("ahibhitchidhithi"));
//		System.out.println(checkString("bbabbbbabba", ""));
		printCodes("1123", "");

	}
	
	public static String moveXToEnd(String str, int xctr){
		if(str.length() == 0){
			String baseStr = "";
			while(xctr > 0){
				baseStr += 'x';
				xctr--;
			}
			return baseStr;
		}
		
		String myString = "";
		String recString = "";
		char ch = str.charAt(0);
		if(ch != 'x'){
			myString += ch;
			recString = moveXToEnd(str.substring(1), xctr);
		} else {
			recString = moveXToEnd(str.substring(1), xctr + 1);
		}
		return myString + recString;
	}
	
	public static int countHiWT(String str){
		if(str.length() < 2){
			return 0;
		}
		
		int count = 0;
		String hiString = "" + str.charAt(0) + str.charAt(1);
		if(hiString.equals("hi")){
			if(str.length() > 2){
				char ch = str.charAt(2);
				if(ch == 't'){
					count = countHiWT(str.substring(2));
				}
				else {
					count = 1 + countHiWT(str.substring(2));
				}
			} else {
				count = 1 + countHiWT(str.substring(2));
			}
		}else {
			count = countHiWT(str.substring(1));
		}
		return count;
	}
	//13
	public static boolean checkString(String str, String prev){
		if(str.length() > 0 && prev.equals("")){
			return str.charAt(0) == 'a' &&
					checkString(str.substring(1), "a");
		} else if(prev.equals("a")){
			return str.length() == 0 ||
					(str.charAt(0) == 'a' && checkString(str.substring(1), "a")) ||
					(str.length() >=2 && str.substring(0, 2).equals("bb") && checkString(str.substring(2), "bb"));
		} else if(prev.equals("bb")){
			return str.length() == 0 ||
					(str.charAt(0) == 'a' && checkString(str.substring(1), "a"));
		} else {
			return false;
		}
	}
	//12
	public static void printCodes(String str, String res){
		if(str.length() == 0){
			System.out.println(res);
			return;
		}
		
		char ch0 = str.charAt(0);
		char resChar0 = (char)(ch0 - '1' + 'a');
		printCodes(str.substring(1), res + resChar0);
		
		if(str.length() > 1 && ch0 <= '2'){
			char ch1 = str.charAt(1);
			if(ch1 <= '6'){
				char resChar1 = (char)((ch0 - '0')*10 + (ch1 - '0') - 1 + 'a');
				printCodes(str.substring(2), res + resChar1);
			}
		}
	}
	 public static ArrayList<String> int_to_char(String res,String str)
		{
			ArrayList<String> set = new ArrayList<String>();
			if (str.length() == 0) {
				set.add(res);
				return set;
			}

			if (str.charAt(0) == '0')
				return set;

			set.addAll(int_to_char(res + (char) (str.charAt(0) - '1' + 'a'),
					str.substring(1)));
			if (str.length() >= 2 && str.charAt(0) == '1') {
				set.addAll(int_to_char(
						res + (char) (10 + str.charAt(1) - '1' + 'a'),
						str.substring(2)));
			}
			if (str.length() >= 2 && str.charAt(0) == '2'
					&& str.charAt(1) <= '6') {
				set.addAll(int_to_char(
						res + (char) (20 + str.charAt(1) - '1' + 'a'),
						str.substring(2)));
			}
			return set;
		}
	
}
