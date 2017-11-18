package lecture14;

public class Dp1 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		int N = 30;
//		
		long start = System.currentTimeMillis();
///		System.out.println(fibR(N));
//		System.out.println(countBoardPath(0, N));
		long end = System.currentTimeMillis();
		System.out.println("==========>"+ (end - start));
//		
		long start1 = System.currentTimeMillis();
		//dynamic programming
		System.out.println(fibRS(N, new int[N+1]));
///		System.out.println(countBoardPathRS(0, N, new int[N+1]));
		long end1 = System.currentTimeMillis();
		System.out.println("==========>"+ (end1 - start1));
		
//		long start2 = System.currentTimeMillis();
////		System.out.println(fibISS(N, new int[2]));
//		long end2 = System.currentTimeMillis();
//		System.out.println("==========>"+ (end2 - start2));
	}
	
	public static int fibR(int n){
		if(n == 0 || n == 1){
			return n;
		}
		
		int res = fibR(n-1) + fibR(n-2);
		return res;
	}
	
	// Top Down DP
	public static int fibRS(int n, int[] storage){
		if(n == 0 || n == 1){
			storage[0] = 0;
			storage[1] = 1;
			return storage[n];
		}
		
		if(storage[n] != 0){
			return storage[n];
		}
		
		int res = fibRS(n - 1, storage) + fibRS(n -2, storage );
		storage[n] = res;
		return res;
	}
	
	// Bottom Up DP
	public static int fibIS(int n, int[] storage){
		// seed
		storage[0] = 0;
		storage[1] = 1;
		
		int i = 2;
		while(i <= n){
			storage[i] = storage[i - 1] + storage[i - 2];
			i++;
		}
		
		return storage[n];
	}
	
	public static int fibISS(int n, int[] storage){
		// seed
		storage[0] = 0;
		storage[1] = 1;
		
		int i = 2;
		while(i <= n){
			int temp = storage[0];
			storage[0] = storage[1];
			storage[1] = temp + storage[1];
			i++;
		}
		
		return storage[1];
	}
	
	
	public static int countBoardPath(int s, int d){
		if(s == d){
			return 1;
		}
		
		int count = 0;
		for(int i = 1; i <= 6 && s +i <= d; i++){
			count += countBoardPath(s + i, d);
		}
		return count;
	}
	
	public static int countBoardPathRS(int s, int d, int[] storage){
		if(s == d){
			storage[s] = 1;
			return storage[d];
		}
		
		if(storage[s] != 0){
			return storage[s];
		}
		
		int count = 0;
		for(int i = 1; i <= 6 && s +i <= d; i++){
			count += countBoardPathRS(s + i, d, storage);
		}
		storage[s] = count;
		return count;
	}
	
}
