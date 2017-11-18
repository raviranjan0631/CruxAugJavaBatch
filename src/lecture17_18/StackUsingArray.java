package lecture17_18;

public class StackUsingArray {
	protected int[] arr;
	protected int top;
	public StackUsingArray(int capacity){
		this.arr = new int[capacity];
		this.top = -1;
	}
	public int size(){
		return this.top+1;
	}
	public void push(int ele) throws Exception{
		if(this.isFull()){
			throw new Exception("stack is full");
		}
		this.top++;
		this.arr[this.top]=ele;
	}
	
	public int pop() throws Exception{
		if(this.isEmpty()){
			throw new Exception("stack is empty");
		}
		int ele = this.arr[this.top];
		this.arr[this.top] =0;
		this.top--;
		return ele;
	}
	
	public int top() throws Exception{
		if(this.isEmpty()){
			throw new Exception("stack is empty");
		}
		return this.arr[this.top];
	}
	public void display(){
		for(int i =0;i<this.size();i++){
			System.out.print(this.arr[i]+", ");
		}
		System.out.println("end");
	}
	public boolean isFull(){
		return this.size()==this.arr.length;
	}
	public boolean isEmpty(){
		return this.size()==0;
	}
	public String toString(){
		String result="";
		for(int i =0;i<this.size();i++){
			result += this.arr[i]+" ";
		}
		return result;
	}
}
