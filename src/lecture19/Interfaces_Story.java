package lecture19;

public class Interfaces_Story {

}
class p{
	public static void fun(){
		System.out.println("i am in p");
	}
}
class c extends p{
	public static void fun(){
		System.out.println("i am in c");
	}
	public static void main(String[] args) {
		p P = new c();
		P.fun();
	}
}
