package lecture7;

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dec(10);
		//inc(10);
		incDec(10);

	}
	public static int sum(int i){
		int partSum = sum(i-1);
		
		return i+partSum;
		
	}
	public static void dec(int i){
		if(i == 0){
			return;
		}
		System.out.println(i);
		dec(i-1);
		
	}
	public static void inc(int i){
		if(i == 0){
			return;
		}
		
		inc(i-1);
		System.out.println(i);
		
	}
	public static void incDec(int i){
		if(i==1){
			System.out.println(1);
			return;}
		System.out.println(i);
		incDec(i-1);
		
		System.out.println(i);
	}

}
