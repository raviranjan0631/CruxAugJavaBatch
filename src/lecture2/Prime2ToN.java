package lecture2;

import java.util.Scanner;

public class Prime2ToN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = scn.nextInt();
		int counter = 2;
		while(counter <= n){
			int i  = 2;
			while(i < counter){
				if(counter%i == 0){
					break;
				}
				i = i + 1;
			}
			if(i == counter){
				System.out.print(counter+ ", ");
			}
			counter = counter + 1;
		}
		

	}

}
