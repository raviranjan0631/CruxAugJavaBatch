package lecture9_10;

import java.util.ArrayList;

public class PermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(permutationV2("abc"));
	}
	public static void printpermutation(String inp, String result){
		if(inp.equals("")){
			System.out.println(result);
			return;
		}
		for(int i = 0;i<inp.length();i++){
			printpermutation(inp.substring(0,i)+inp.substring(i+1), result+inp.charAt(i));
		}
		
	}
	//class bala
	public static ArrayList<String> permute(String s){
		if(s.length()==1){
			ArrayList<String> base=new ArrayList<>();
			base.add(""+s.charAt(0));
			return base;
		}
		else{
			ArrayList<String> out=new ArrayList<>();
			out=permute(s.substring(1));
			ArrayList<String> mylist=new ArrayList<>();
			for(int i=0;i<out.size();i++){
				String s1=out.get(i);
				for(int j=0;j<=s1.length();j++){
					String s2=s1.substring(0,j)+s.charAt(0)+s1.substring(j,s1.length	());
					//System.out.println("-->"+s2);
					mylist.add(s2);
				}
			}
			
			return mylist;
		}
	}
	
	public static int countpermutation(String inp, String result){
		if(inp.equals("")){
			return 1;
		}
		int c = 0;
		for(int i = 0;i<inp.length();i++){
			c+=countpermutation(inp.substring(0,i)+inp.substring(i+1), result+inp.charAt(i));
		}
		
		return c;
	}
	
	//class bala version 2
	public static ArrayList<String> permutationV2(String s1){
		if(s1.length() == 0){
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

		
		ArrayList<String> recList = permutationV2(s1.substring(1));
		ArrayList<String> myList = new ArrayList<>();
		
		for(int i = 0;i<recList.size();i++){
			String s2 = recList.get(i);
			for(int j = 0;j<=s2.length();j++){
				String s3 = s2.substring(0, j)+s1.charAt(0)+s2.substring(j); 
				myList.add(s3);
			}
			
		}
		return myList;
		
	}
	
	
	
	
	
}
