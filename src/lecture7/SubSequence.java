package lecture7;

import java.util.Scanner;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		subseq(s1);
	}
	public static void subseq(String str){
		int limit = (int)Math.pow(2, str.length());
		int counter =0;
		while(counter<limit){
			String word = "";
			int dec = counter;
			int index = str.length()-1;
			while(dec>0){
				int bit = dec%2;
				if(bit==1){
					word = str.charAt(index)+word;
				}
				index--;
				dec/=2;
			}
			System.out.println(word);
			counter++;
		}
	}

}
