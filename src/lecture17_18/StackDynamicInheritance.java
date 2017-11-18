package lecture17_18;

public class StackDynamicInheritance extends StackUsingArray{
		public StackDynamicInheritance(int capacity) {
			// TODO Auto-generated constructor stub
			super(capacity);
		}
		@Override
		public void push(int ele) throws Exception {
			if(this.isFull()){
				int arr1[] = new int[2*arr.length];
				for(int i =0;i<arr.length;i++){
					arr1[i] = arr[i];
				}
				this.arr=arr1;
			}
			// TODO Auto-generated method stub
		super.push(ele);
		}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		StackDynamicInheritance stack = new StackDynamicInheritance(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		System.out.println(stack.size());
	}

}
