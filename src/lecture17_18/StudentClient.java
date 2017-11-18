package lecture17_18;

public class StudentClient {
	public static void main(String[] args) throws Exception {
		StackUsingArray stack = new StackUsingArray(10);
		for(int i =0;i<10;i++){
			stack.push(i);
		}
		for(int i=0;i<10;i++){
			System.out.println(stack.pop());
		}
	}
}
