package assignment6;

import java.util.Scanner;

public class NthTriangle_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(nthTriangle(num, 0 ));
	}
	public static int nthTriangle(int num, int sum){
		if (num == 0){
			return sum ;
		}
		return nthTriangle(num - 1, sum + num);
	}

}
