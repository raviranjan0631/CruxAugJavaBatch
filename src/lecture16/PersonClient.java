package lecture16;

public class PersonClient {

	public static void main(String[] args) {
		
		
		Person p1 = new Person("Harry" , 10);
		Person p2 = new Person("abc" , 13);
		System.out.println("P1: name "+ p1.name);
		System.out.println("P2: name "+ p2.name);
		System.out.println("P1: age "+ p1.age);
		System.out.println("P2: age "+ p2.age);
		swap(p1, p2);
		System.out.println("P1: name "+ p1.name);
		System.out.println("P2: name "+ p2.name);
		System.out.println("P1: age "+ p1.age);
		System.out.println("P2: age "+ p2.age);
		swap2(p1,p2);

		System.out.println("P1: name "+ p1.name);
		System.out.println("P2: name "+ p2.name);
		System.out.println("P1: age "+ p1.age);
		System.out.println("P2: age "+ p2.age);
	}
	public static void swap(Person p1, Person p2){
		Person temp = p1;
		p1 = p2;
		p2 = temp;
		
	}
	public static void swap2(Person p1, Person p2){
		String tempname = p1.name;
		p1.name = p2.name;
		p2.name = tempname;
		int tempage = p1.age;
		p1.age = p2.age;
		p2.age = tempage;
	}
}
