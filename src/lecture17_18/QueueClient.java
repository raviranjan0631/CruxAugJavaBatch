package lecture17_18;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueueUsingArray q = new QueueUsingArray(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);

		q.enqueue(31);
		q.enqueue(4);
		q.dequeue();
		q.enqueue(6);
		q.display();
		System.out.println();
		System.out.println(q.front());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}

}
