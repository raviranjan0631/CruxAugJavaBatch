package lecture17_18;

public class StackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingArray s = new StackUsingArray(5);
		
		s.push(1);
		s.display();
		s.push(2);
		s.push(3);
		s.display();
		s.pop();
		
		s.push(4);
		System.out.println(s);
		
	}

}
