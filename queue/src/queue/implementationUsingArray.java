 package queue;
 
 class queue{
	 int []arr;
	 int size;
	 int front;
	 int rear;
	 int capacity;
	 
	 queue(int capacity){
		 this.capacity=capacity;
		 this.size=0;
		 this.front=0;
		 this.rear=-1;
		 this.arr=new int[capacity];
	 }
	 
	 //enqueue==adding elements
	 public void enqueue(int element) {
		    if(rear == capacity - 1) {
		        System.out.println("Queue is full");
		    } else {
		        rear++;
		        arr[rear] = element;
		        size++;
		    }
		}

		public int dequeue() {
		    int element = 0;
		    if(front > rear) {
		        System.out.println("Queue is empty");
		    } else {
		        element = arr[front];
		        front++;
		        size--;
		    }
		    return element;
		}

		public int getFront() {
		    if(front > rear) {
		        return -1;
		    } else {
		        return arr[front];
		    }
		}

		public int getRear() {
		    if(front > rear) {
		        return -1;
		    } else {
		        return arr[rear];
		    }
		}

		public boolean isEmpty() {
		    return size == 0;
		}

		public boolean isFull() {
		    return size == capacity;
		}
 }		
		


public class implementationUsingArray {

	public static void main(String[] args) {
		queue Q1 = new queue(6);
		Q1.enqueue(10);
		Q1.enqueue(1000);
		Q1.enqueue(1000000);
		System.out.println(Q1.dequeue());
		System.out.println(Q1.dequeue());
		System.out.println(Q1.getFront());
		System.out.println(Q1.getRear());
		System.out.println(Q1.isEmpty());
		System.out.println(Q1.isFull());

	}

}
