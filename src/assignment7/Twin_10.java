package assignment7;

public class Twin_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(twins("AxAxAx",0));
	}
	public static int twins(String str,int count ){
		if(str.length()<3){
			return 0;
		}
		if(str.charAt(0)==str.charAt(2)){
			count += 1 + twins(str.substring(1), count);
		}
		else{
			count = twins(str.substring(1), count);
		}
		return count;
	}
}
