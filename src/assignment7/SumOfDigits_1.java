package assignment7;

public class SumOfDigits_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits("1456",0));
	}
	public static int sumOfDigits(String str,int sum){
		if(str.length()==0){
			
			return 0;
		}
		sum += str.charAt(str.length()-1)+sumOfDigits(str.substring(0,str.length()-1), sum)-48;
		System.out.println(sum);
		return sum;
	}

}
