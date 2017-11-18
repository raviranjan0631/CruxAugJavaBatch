package lecture19;

public class LinkedKistUsingNode {
		
	private Node head;
	private Node tail;
	private int size;
	
	public LinkedKistUsingNode() {
		// TODO Auto-generated constructor stub
	}
	public LinkedKistUsingNode(Node head, Node tail ,int size) {
		this.head = head;
		this.tail = tail;
		this.size = size;
	}
	
	private class Node{
		int data;
		Node next;
		public Node(int data, Node next){
			this.data = data;
			this.next = next;
			}
		}
	
	public boolean isEmpty(){
		return this.size == 0;
	}
	
	public void addFirst(int data){
		if(this.isEmpty()){
			Node n = new Node(data, null);
			this.head = n;
			this.tail = n;
		}
		else{
			Node n = new Node(data, this.head);
			this.head = n;
		}
		this.size += 1;
	}
	
	public void addLast(int data){
		if(this.isEmpty()){
			this.addFirst(data);
		}
		else{
			Node n = new Node(data,null);
			this.tail.next = n;
			this.tail = n;
			this.size +=1;
		}
		
	}
	
	private Node getNodeAt(int idx) throws Exception{
		if(idx < 0 || idx >= this.size){
			throw new Exception("Index not valid");
		}
		if(idx == 0){
			return this.head;
		}else if(idx == size-1){
			return this.tail;
		}else{
			int counter = 0;
			Node n = this.head;
			while(counter < idx){
				n = n.next;
				counter += 1;
			}
			return n;
		}
		
		
	}
	
	public void addAt(int data, int idx) throws Exception{
		if(idx < 0 || idx > this.size){
			throw new Exception("Index not valid");
		}
		if(idx == 0){
			this.addFirst(data);
		}else if(idx == this.size){
			this.addLast(data);
		}else{
			Node prev = this.getNodeAt(idx-1);
			Node n = new Node(data, prev.next);
			prev.next = n;
			this.size += 1;
		}
		
	}
	
	public int getFirst() throws Exception{
		if(isEmpty()){
			throw new Exception("List is empty");
		}
		return this.head.data;
	}
	
	public int getLast()throws Exception{
		if(isEmpty()){
			throw new Exception("List is empty");
		}
		return this.tail.data;
	}
	
	public int getAt(int idx)throws Exception{
		if(isEmpty()){
			throw new Exception("List is empty");
		}
		Node n = this.getNodeAt(idx);
		return n.data;
		
	}
	
	public int removeFirst() throws Exception{
		if(isEmpty()){
			throw new Exception("List is empty");
		}
		if(this.size==1){
		this.tail =null;
		}
		Node n = this.head;
			this.head = this.head.next;
			this.size -=1;
			return n.data;
		
	}
	
	public int removeLast() throws Exception{
		if(isEmpty()){
			throw new Exception("List is empty");
		}
		if(size==1){
			return this.removeFirst();
			
			}else{
				Node slast = getNodeAt(this.size-2);
				Node n = slast.next;
				this.tail = slast;
				slast.next = null;
				this.size -= 1;
				return n.data;
			}
	}
	
	public int removeAt(int idx) throws Exception{
		if(idx < 0 || idx >= this.size){
			throw new Exception("Index not valid");
		}
		if(idx == 0){
			return this.removeFirst();
		}else if(idx == this.size-1){
			return this.removeLast();
		}else{
			Node prev = this.getNodeAt(idx-1);
			Node n = prev.next;
			prev.next = n.next;
			this.size -= 1;
			return n.data;
		}

	}
	
	public void display(){
		Node n = this.head;
		while(n != null ){
			System.out.print(n.data+", ");
			n = n.next;
		}
		System.out.println("End");
	}

	public void reverDI()throws Exception{
		if(this.isEmpty()){
			throw new Exception("List is empty");
		}
		if(this.size == 1){
			return;
		}
		int i =0, j=this.size-1;
		while(i<j){
			Node n =getNodeAt(i);
			Node n1 = getNodeAt(j);
			int k = n.data;
			n.data = n1.data;
			n1.data = k;
			i++;j--;
		}
	}
	
	public void reversePI()throws Exception{
		if(this.isEmpty()){
			throw new Exception("List is empty");
		}
		if(this.size == 1){
			return;
		}
		Node prev = null;
		Node curr = this.head;
		Node next = curr.next;
		while(curr != null){
			curr.next = prev;
			prev = curr;
			curr = next;
			if(curr!=null){
				next = next.next;
				}
		}
		this.tail = this.head;
		this.head = prev;
		
	}

	public void reversePR()throws Exception{
		if(this.isEmpty()){
			throw new Exception("List is empty");
		}
		if(this.size == 1){
			return;
		}
		reversePRHelper(this.head);
		Node n = this.head;
		this.head = this.tail;
		this.tail = n;
		this.tail.next = null;
	}
	
	private void reversePRHelper(Node n){
		if(n.next == null){
			return;
		}
		reversePRHelper(n.next);
		n.next.next = n;
	}
	
	public void reverseDR(){
		reverseDRHelper(new HeapMover(this.head),this.head,0);
		
	}
	
	public void reverseDRHelper(HeapMover hleft, Node right, int level){
		if(right == null){
			return;
		
		}

		reverseDRHelper(hleft, right.next,level+1);
		if(level>=(this.size/2)){
			int temp = hleft.left.data;
			hleft.left.data = right.data;
			right.data = temp;
			hleft.left = hleft.left.next;
		}
	}
	
	private class HeapMover{
		Node left;
		HeapMover(Node head ) {
			this.left = head;
		}
	}

	private Node nodeMid(){
		Node slow = this.head;
		Node fast = this.head;
		while(fast.next != null && fast.next.next!=null){
			slow = slow.next;
			if(fast.next.next!=null ){
			fast = fast.next.next;
			}
		}
		return slow;
		
	}
	
	public int mid(){
		return nodeMid().data;
	}

	private Node kthNode(int k){
		Node slow  = this.head;
		Node fast = this.head;
		for(int i=0;i<k;i++){
			fast = fast.next;
		}
		while(fast !=null){
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
	
	
	public int kthElement(int k){
		return kthNode(k).data;

	}
	
	public LinkedKistUsingNode merge (LinkedKistUsingNode other){
		Node first = this.head;
		Node second = other.head;
		LinkedKistUsingNode comb = new LinkedKistUsingNode();
		while(first!=null&&second!=null){
			if(first.data<second.data){
				comb.addLast(first.data);
				first = first.next;
			}
			else{
				comb.addLast(second.data);
				second = second.next;
			}
		}
		while(first!=null){
			comb.addLast(first.data);
			first = first.next;
		}
		while(second!= null){
			comb.addLast(second.data);
			second = second.next;
		}
		return comb;
	}
	
	public void mergeSort(){
		LinkedKistUsingNode sorted = mergeSortHelper();
		this.head = sorted.head;
		this.tail = sorted.tail;
	}
	
	private LinkedKistUsingNode mergeSortHelper(){
		if(this.size == 1){
			return this;
		}
		Node mid = nodeMid();
		Node midNxt = mid.next;
		mid.next = null;
		LinkedKistUsingNode first = new LinkedKistUsingNode(this.head, mid, (this.size+1)/2);
		LinkedKistUsingNode	second =new LinkedKistUsingNode(mid.next, this.tail, this.size/2);
		first.mergeSortHelper();
		second.mergeSortHelper();
		return first.merge(second);
		}
}
