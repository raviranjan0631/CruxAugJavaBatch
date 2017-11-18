package lecture20;

import java.util.Scanner;

import lecture17_18.StackDynamicInheritance;

public class StackArithmaticMethods {

	public static void main(String[] args)throws Exception {
		System.out.println(isBalanced("{[()]}"));
	}
	public static boolean isBalanced(String str) throws Exception{
		boolean isBalanced =true;
		StackDynamicInheritance stk = new StackDynamicInheritance(5);
		try{for(int i=0;i<str.length();i++){
				char ch = str.charAt(i);
				if(ch == '[' || ch == '{' || ch=='('){
					stk.push(ch);
				}else{
					if(ch=='}' ){
						if(stk.top() != '{'){
							return false;
						}
						stk.pop();
					}else if(ch == ']' ){
						if(stk.top() != '['){
							return false;
						}
						stk.pop();
					}else if(ch == ')' ){
						if(stk.top() != '('){
							return false;
						}
						stk.pop();
					}
				}
			}
		if(stk.isEmpty()){
			return true;
		}
		else {
			return false;
		}
		}catch(Exception e){
			return false;
		}
			}
}
