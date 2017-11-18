package lecture4;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		boolean b = true;
		System.out.println("enter 1 of the sequence");
		int prev = scn.nextInt();
		
		int counter = 2;
		while(counter <= n){
			System.out.println("enter "+counter+" of the sequence");
			int current = scn.nextInt();
			if(b){if(prev < current){
				b = false;
			                          }
			}
			else{
				if(prev>current){
					System.out.println("Invalid");
					return;
				}
			}
			if(prev == current){
				System.out.println("invalid");
				return;
			}
			prev = current;
			counter += 1;
		}
         System.out.println("true");
	}

}
