package lecture17_18;

public class QueueUsingArray {
	protected int arr[];
	protected int size;
	protected int front;
	protected static final int DEFAULT_CAPACITY = 10;
	
	public QueueUsingArray() throws Exception{
		this(DEFAULT_CAPACITY);
	}
	
	public QueueUsingArray(int capacity) throws Exception{
		this.arr = new int[capacity];
		this.front = 0;
		this.size = 0;
	}
	
	public boolean isFull(){
	 return	this.size == arr.length;
		
	}
	public boolean isEmpty(){
		return this.size==0;
	}
	public int size(){
		return this.size;
	}
	public void enqueue(int num) throws Exception{
		if(this.isFull()){
			throw new Exception("Queue is full");
		}
		int ai = (this.front+this.size)%this.arr.length;
		this.arr[ai] = num;
		this.size++;
		
	}
	public int dequeue() throws Exception{
		if(isEmpty()){
			throw new Exception("Queue is empty");
		}
		int ele = this.arr[front];
		this.arr[this.front]=0;
		this.front = (this.front+1)%this.arr.length;
		this.size--;
		return ele;
	}
	public int front() throws Exception{
		if(isEmpty()){
			throw new Exception("Queue is empty");
		}
		return this.arr[this.front];
	}
	public void display(){
		for(int i = 0; i<this.size;i++){
			int idx = (i+this.front)%this.arr.length;
			System.out.print(this.arr[idx]+" ");
		}
	}
}
