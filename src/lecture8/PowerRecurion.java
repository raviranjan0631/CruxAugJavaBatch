package lecture8;

import java.util.Scanner;

public class PowerRecurion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int pow = scn.nextInt();
		System.out.println(power(n,pow));
	}
	public static int power(int num,int pow){
		if(pow == 1)
			return num;
		return num*power(num,pow-1);
	}

}
