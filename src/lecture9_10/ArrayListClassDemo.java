package lecture9_10;
import java.util.*;
public class ArrayListClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 10;
//		Integer i1 =10;
//		Integer i3 = new Integer(10);
//		System.out.println(i3 == i1);
//		Integer i4 = 10;
//		System.out.println(i1);
		ArrayList<Integer> al = new ArrayList<>();
		//al.add(new Integer(10));
		al.add(10);
		for(int i = 0; i<25;i++)
			{al.add(20);}
		al.add(20);
		al.add(1, 30);
		System.out.println(al.size());
		System.out.println(al);
		
	}

}
