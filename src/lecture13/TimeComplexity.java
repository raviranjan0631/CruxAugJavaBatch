package lecture13;

import java.security.cert.PolicyNode;

public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(polynimial(5, 6));
	}
	public static int polynimial(int x, int n){
		int result = 0;
		int counter =1;
		for(int i = n;i>=1;i--){
			counter *=x;
			result += i*counter;
		}
		return result;
	}

}
