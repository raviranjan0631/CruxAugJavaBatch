package lecture19;

public class QueueDynamicClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueueDynamicInheritance q = new QueueDynamicInheritance(3);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.display();
	}

}
