package assignment5;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(oddEven(str));

	}
	public static  String oddEven(String str){
		String s1 = "";
		for(int i = 0;i<str.length();i++){
			if(i%2==0){
				s1 = s1+(char)((str.charAt(i)+1));
			}
			else{
				s1 = s1+(char)((str.charAt(i)-1));
			}
		}
		return s1;
	}

}
