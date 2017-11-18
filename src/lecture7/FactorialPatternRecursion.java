package lecture7;

public class FactorialPatternRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(5,0,0);
	}
	public static void printPattern(int n,int row,int col){
		if(row==n+1){
			return;
		}
		else if(col<=row){
			System.out.print(factorial(row)/(factorial(col)*factorial(row-col)));
			printPattern(n,row,col+1);
		}
		else{System.out.println();
		printPattern(n,row+1,0);}
	}
	public static int factorial(int num){
		int fact = 1;
		
		for(int i =1;i<=num;i++){
			fact =fact * i;
		}
		return fact;
	}
}
