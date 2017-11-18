package lecture7;

import java.util.Scanner;

public class StringBuilderjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		StringBuilder str = new StringBuilder(s.next());
//		System.out.println(oddEven(str));
		System.out.println(countString(str.toString()));

	}
	public static int countString(String str){
		int c[] = new int[26];
		for(int i =0;i<str.length();i++){
			c[str.charAt(i)-97]+=1;
		}
		int count =0;
		for(int i =0;i<c.length;i++){
			if(c[i]>1){
				count++;
			}
		}
		return count;
	}
//	public static  String oddEven(String str){
//		StringBuilder s1 = new StringBuilder();
//		for(int i = 0;i<str.length();i++){
//			if(i%2==0){
//				s1.append((char)(str.charAt(i)+1));
//			}
//			else{
//				s1.append((char)(str.charAt(i)-1));
//			}
//		}
//		return s1.toString();
//	}
//	public static String diffString(String str){
//		StringBuilder s1 = new StringBuilder();
//		s1.append(str.charAt(0));
//		int diff =0;
//		for(int i = 0;i<str.length()-1;i++){
//			diff = str.charAt(i+1)-str.charAt(i);
//			s1.append(diff);
//			s1.append(str.charAt(i+1));
//		}
//		return s1.toString();
//	}
}
