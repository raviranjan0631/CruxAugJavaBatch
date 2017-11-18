package lecture19;

import lecture17_18.QueueUsingArray;

public class QueueDynamicInheritance extends QueueUsingArray{

		public QueueDynamicInheritance() throws Exception{
			super();
		}
		public QueueDynamicInheritance(int capacity) throws Exception{
			super(capacity);
		}
		public  void enqueue(int ele) throws Exception{
			if(this.isFull()){
				int arr1[] = new int[2*arr.length];
				for(int i=0;i<this.size;i++){
					arr1[i] = this.arr[(i+this.front)%this.arr.length];
				}
				this.front = 0;
				this.arr = arr1;
			}
			super.enqueue(ele);
		}
}
