package lecture2;

import java.util.Scanner;

public class RectanglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int i=1,j;
		while(i<=n){
			j=1;
			while(j<=i){
				System.out.print(j+" ");
				j++;
			}
			j=1;
			while(j<=n-i){
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=n-i){
				System.out.print(" ");
				j++;
			
			}
			j=1;
			while(j<=i){
				if(i==j && j==n){
					break;
				}
				System.out.print(j+" ");
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
