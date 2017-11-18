package assignment5;

import java.util.Scanner;

public class RemoveDuplicates {public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    String str = s.next();
    String s1 = new String();
    s1= s1+str.charAt(0);
    
    for(int i =0;i<str.length()-1;i++){
        if(str.charAt(i)!=str.charAt(i+1)){
            s1=s1+str.charAt(i+1)+"";
        }
    }
    System.out.println(s1);
    // Your Code Here
}

}
