package lecture21;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTreeUsingNode {

	private class Node{
		int data;
		ArrayList<Node> children;
		public Node(int data){
			this.data = data;
			this.children = new ArrayList<>();
		}
	}
	
	private  Node root;
	private int size;
	
	public GenericTreeUsingNode() {
		Scanner scn = new Scanner(System.in);
		this.root = this.takeInput(scn, null,0);
	}
	public Node takeInput(Scanner scn, Node parent, int ithchild){
		if(parent == null){
			System.out.println("Enter data for root node");
		}else{
			System.out.println("Enter data for "+ithchild+" for "+ parent.data);
		}
		
		
		int data = scn.nextInt();
		Node n = new Node(data);
		this.size+=1;
		System.out.println("please enter no. of children");
		int childCount = scn.nextInt();
		for(int i =0;i<childCount;i++){
			Node childNode = takeInput(scn ,n,i);
			n.children.add(childNode);
		}
		return n;
	}
	public void display(){
		this.display(this.root);
	}
	private void display(Node node){
		System.out.print(node.data+"-->");
		for(int i =0;i<node.children.size();i++){
			System.out.print(node.children.get(i).data+", ");
		}
		System.out.print("End");
		System.out.println();
		for(int i =0;i<node.children.size();i++){
			display(node.children.get(i));
		}
	}
	public int size(){
		return this.size;
	}
	public int size2(){
		return this.size2helper(this.root);
	}
	private int size2helper(Node n){
		int size = 1;
		for(int i = 0;i<n.children.size();i++){
			size +=  size2helper(n.children.get(i));
		}
		return size;
	}
	public int max(){
		return this.max(this.root);
	}
	public int max(Node n){
		int max = n.data;
		int max1 =0;
		for(int i = 0;i<n.children.size();i++){
			if(max<n.children.get(i).data){
				max1 = max(n.children.get(i));
				
			}
		}
		
		return Math.max(max,max1);
		
	}
	public int height(){
		return this.height(this.root);
	}
	private int height(Node n){
		int height =-1;
		for(int i =0;i<n.children.size();i++){
			int childHeight = height(n.children.get(i));
			if(childHeight>height){
				height = childHeight;
			}
		}
		return height+1;
		
	}
	public boolean find(int data){
		return this.find(this.root, data);
	}
	private boolean find(Node n, int data){
		boolean b = false;
		for(int i =0;i<n.children.size();i++){
			if(data == n.children.get(i).data){
				b=true;
				return b;
			}
			b = find(n.children.get(i), data);
			
		}
		return b;
	}
	public int justLargest(int data){
		return justLargest(this.root, data).data;
	}
	private Node justLargest(Node node, int data){
		Node rv = null;
		if(node.data>data){
			rv = node;
		}
		for(int i =0;i<node.children.size();i++){
			Node crv = justLargest(node.children.get(i), data);
			if(crv == null){
				continue;
			}else{
				if(rv == null){
					rv = crv;
				}else{
					if(crv.data<rv.data){
						rv = crv;
					}
				}
				
			}
		}
		return rv;
	}
	public int kthSmallest(int k){
		return this.kthSmallest(this.root, k).data;
	}
	private Node kthSmallest(Node node, int k){
		return null;
	}
	public void mirror(){
		this.mirror(this.root);
	}
	private void mirror(Node n){
		int l = 0;
		int r = n.children.size()-1;
		while(l<r){
			Node temp = n.children.get(l);
			n.children.set(l, n.children.get(r));
			n.children.set(r, temp);
			l++;
			r--;
		}
		for(int i = 0;i<n.children.size();i++){
			mirror(n.children.get(i));
		}
	}
	public void printAtLevel(int level){
		this.printAtLevel(this.root, level);
	}
	private void printAtLevel(Node n, int level){
		return;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
