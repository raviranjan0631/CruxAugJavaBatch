package assignment7;

public class MoveX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(moveX("acxbccdexxghtxfrx",0));
	}
	public static String moveX(String str,int ctrx){
		if(str.length() == 0){
			String base ="";
			while(ctrx>0){
				base += 'x';
				ctrx--;
			}
			return base;
		}
		String mystr ="";
		String recstring ="";
		char ch = str.charAt(0);
		if(str.charAt(0)!='x'){
			mystr += ch;
			recstring=moveX(str.substring(1), ctrx);
		}
		else{
			recstring=moveX(str.substring(1), ctrx+1);
		}
		return mystr+recstring;
	}
}
