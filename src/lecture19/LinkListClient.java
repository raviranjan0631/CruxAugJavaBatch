package lecture19;

public class LinkListClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		LinkedKistUsingNode l =new LinkedKistUsingNode();
		l.addFirst(10);
		l.addLast(20);
		l.addLast(30);
		l.addLast(40);
		l.addLast(50);
		l.display();
		l.reverseDR();
		l.display();
		System.out.println(l.mid());
		LinkedKistUsingNode l1 = new LinkedKistUsingNode();
		l1.addLast(11);
		l1.addLast(21);
		l1.addLast(31);
		l1.addLast(41);
		l = l.merge(l1);
		l.display();
		//l.mergeSort();
	}

}
