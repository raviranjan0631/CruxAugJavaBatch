package lecture2;

import java.util.Scanner;

public class RmainderPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner
		 scn= new Scanner(System.in);
		int n = scn.nextInt();
		int i=1,j;
		while(i<=n){
			j=1;
			while(j<=i){
				if((j==1)||(j==i)){
					System.out.print(i+" ");
				}
				else{
					System.out.print(0+" ");
				}
				j++;
			}
			
			
			System.out.println();
			i++;
		}

	}

}
