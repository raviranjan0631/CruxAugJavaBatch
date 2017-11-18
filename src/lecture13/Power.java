package lecture13;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		timeSeive();
//		timePrintPrimes();
		System.out.println(countPallendromes("abbab"));
	}
	public static int power(int x, int n){
		if(n == 1){
			return x;
		}
		return x*power(x, n-1);
	}
	public static int powerbt(int x, int n){
		if(n == 1){
			return x;
		}
		int res=0;
		int halfphase = powerbt(x, n/2);
		
		if(n%2==0){
			res = halfphase*halfphase;
		}
		else{
			res = x*halfphase*halfphase;
		}
		return res;
				
	}
	public static void timePower(){
		long start = System.currentTimeMillis();
		power(2,30);
		long stop = System.currentTimeMillis();
		System.out.println(stop-start);
	}
	public static void timePowerBt(){
		long start = System.currentTimeMillis();
		powerbt(2,30);
		long stop = System.currentTimeMillis();
		System.out.println(stop-start);
	}
	public static void seive(int n){
		boolean b[] = new boolean[n+1];
		for(int i = 2;i<=n;i++){
			b[i] = true;
		}
		for(int i = 2; i * i <= n ; i++){
			for(int m=2; i*m<=n;i++){
				b[i*m] = false;
			}
		}
		for(int i = 2;i<=n;i++){
			if(b[i]){
//				System.out.println(i);
			}
		}
	}
	
	public static void prime(int n){
		boolean isprime = true;
		for(int i =2;i*i<=n;i++){
			if( n%i == 0){
				isprime = false;
				break;
			}
		}
		if(isprime){
//			System.out.println("prime");
		}
		else{
//			System.out.println("not prime");
		}
	}
	
	public static void printPrimes(int n){
		for(int i = 2; i <= n; i++){
			boolean isPrime = true;
			for(int j = 2; j*j <= i; j++){
				if(i%j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
//				System.out.println(i);
			}
		}
	}

	public static void timePrintPrimes(){
		long start = System.currentTimeMillis();
		printPrimes(1000000);
		long end = System.currentTimeMillis();
		System.out.println("=>>>>>>>>>>>>>>>>>>>>>"+(end-start));
	}
	
	public static void timeSeive(){
		long start = System.currentTimeMillis();
		seive(1000000);
		long end = System.currentTimeMillis();
		System.out.println("=>>>>>>>>>>>>>>>>>>>>>"+(end-start));
	}
	
	public static int countPallendromes(String str){
		int orbit=0, axis = 0, count = 0;
		while(axis<str.length()){
		if(axis-orbit>= 0 && axis+orbit<str.length() && str.charAt(axis+orbit) == str.charAt(axis-orbit)){
			count++;
			orbit++;
		}
		else{
			orbit = 0;
			axis += 1;
		}
		}
		axis =0;
		orbit = 1;
		while(axis<str.length()){
			if( axis-orbit >=0 && axis+orbit-1<str.length()  && str.charAt(axis+orbit-1)==str.charAt(axis-orbit)){
				count++;
				orbit++;
			}
			else{
				orbit = 1;
				axis++;
			}
		}
		return count;
	}
}
