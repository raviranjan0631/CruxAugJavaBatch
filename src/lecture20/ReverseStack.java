package lecture20;

import lecture17_18.StackDynamicInheritance;

public class ReverseStack {
	private static class HeapMover{
		StackDynamicInheritance primary;
		StackDynamicInheritance helper;
		
		public HeapMover(StackDynamicInheritance primary) {
			// TODO Auto-generated constructor stub
			this.primary = primary;
			this.helper= new StackDynamicInheritance(5);
		}
		
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		StackDynamicInheritance stk = new StackDynamicInheritance(5);
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.push(50);
		stk.push(60);
//		stk.display();
//		//reverseStack(stk, new StackDynamicInheritance(5),0);
//		StackDynamicInheritance arr[] = {stk, new StackDynamicInheritance(5)};
//		reverseStackAddress(arr);
//		stk = arr[0];
//		stk.display();
		HeapMover stks = new HeapMover(stk);
		reverseStackAddress2(stks);
		stks.primary.display();
	}
	
	
	
	public static void reverseStack(StackDynamicInheritance primary, StackDynamicInheritance helper,int level) throws Exception{
		if(primary.isEmpty()){
			return;
		}
		int n = primary.pop();
		reverseStack(primary, helper, level+1);
		helper.push(n);
		if(level == 0){
			while(!helper.isEmpty()){
				primary.push(helper.pop());
			}
		}
	}
	
	
	public static void reverseStackAddress(StackDynamicInheritance[] stk )throws Exception{
		if(stk[0].isEmpty()){
			stk[0] = stk[1];
			return ;
		}
		stk[1].push(stk[0].pop());
		reverseStackAddress(stk);
	}
	
	//prefer this one over the others
	
	public static void reverseStackAddress2(HeapMover stks )throws Exception{
		if(stks.primary.isEmpty()){
			stks.primary = stks.helper;
			return ;
		}
		stks.helper.push(stks.primary.pop());
		reverseStackAddress2(stks);
	}

}
