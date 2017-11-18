package lecture20;

import lecture19.QueueDynamicInheritance;

public class QueueReverse {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		QueueDynamicInheritance que = new QueueDynamicInheritance();
		que.enqueue(10);
		que.enqueue(20);
		que.enqueue(30);
		que.enqueue(40);
		que.enqueue(50);
		reverseQueue(que);
		que.display();
	}
	public static void reverseQueue(QueueDynamicInheritance que)throws Exception{
		if(que.isEmpty()){
			return;
		}
		int n = que.dequeue();
		reverseQueue(que);
		que.enqueue(n);
	}

}
