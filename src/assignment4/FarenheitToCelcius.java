package assignment4;

import java.util.Scanner;

public class FarenheitToCelcius {

	public static void main(String[] args) {
		double minf , maxf , step  ;
		System.out.println("enter min farehit value");
		Scanner scn = new Scanner(System.in);
		minf = scn.nextDouble();
		System.out.println("enter max farehit value");
		maxf = scn.nextDouble();
		System.out.println("enter steps value");
		step = scn.nextDouble();
		
		
		while(minf<=maxf){
			double c = (5/(double)9)*(minf-32.0);
			System.out.println((int)minf+"      "+(int)c);
			minf+=step;
		}
		// TODO Auto-generated method stub

	}

}
