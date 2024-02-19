package queue;

class node{
	int data;
	node next;
	
	node(int data){
		this.data=data;
		this.next=null;
	}
}

class myQueue{
	node front;
	node rear;
	int size;
	
	myQueue(){
		this.front=null;
		this.rear=null;
		this.size=0;
	}
	
	void enqueue(int element) {
		node temp=new node(element);
		if(isEmpty()) {
			front=temp;
			rear=temp;
		}else {
			rear.next=temp;
			rear=temp;
		}
		size++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}else {
			node temp=front;
			front=front.next;
			if(front == null) {
				rear = null;
			}
			size--;
			return temp.data;
		}
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int getFront() {
		return front.data;
	}
	
	public int getRear() {
		return rear.data;
	}
	
	void display() {
		node temp=front;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}

public class implementationUsingLinkedList {

	public static void main(String[] args) {
		myQueue Q2 = new myQueue();
		Q2.enqueue(10);
		Q2.enqueue(20);
		Q2.enqueue(30);
//		System.out.println(Q2.dequeue());
//		System.out.println(Q2.dequeue());
//		System.out.println(Q2.dequeue());
//		System.out.println(Q2.dequeue());
//		System.out.println(Q2.getFront());
//		System.out.println(Q2.getRear());
		Q2.display();
	}

}
