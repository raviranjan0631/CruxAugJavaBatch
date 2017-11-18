package assignment5;

import java.util.Scanner;

public class DifferencebetweenCharacters {
	public static void main(String args[]) {
        // Your Code Here
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String diffstr = ""+str.charAt(0);
        int diff;
        for(int i = 0;i<str.length()-1;i++){
            diff = (int)str.charAt(i+1)-(int)str.charAt(i);
            diffstr =diffstr+ diff+str.charAt(i+1);
        	}
        System.out.println(diffstr);
    	}
}
