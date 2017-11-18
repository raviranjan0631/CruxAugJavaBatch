package lecture21;

public class GenericTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 3 20 2 50 0 60 0 30 3 70 0 80 0 90 0 40 2 100 0 110 0
		GenericTreeUsingNode t = new GenericTreeUsingNode();
		t.display();
		System.out.println(t.size2());
		System.out.println(t.max());
		System.out.println(t.height());
		System.out.println(t.find(30));
		System.out.println(t.justLargest(45));
		t.mirror();
		t.display();
	}

}
