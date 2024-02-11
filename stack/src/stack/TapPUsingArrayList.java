//package stack;
//
//import java.util.ArrayList;
//
////class StackUnderFlowException extends Exception{
////	public StackUnderFlowException() {
////		super("No element in stack");
////	}
////}
//
//
//
//class Stack{
//	ArrayList al;
//	int top;
//	
//	public Stack() {
//		this.al=new ArrayList<Integer>();
//		this.top=-1;
//	}
//	
//	public void push(int element) {
//		al.add(element);
//	}
//	
//	public int pop() throws StackUnderFlowException {
//		if(al.size()==0) {
//			throw new StackUnderFlowException();
//		}
//		int lastIndex=al.size()-1;
//		int l=(int) al.get(lastIndex);
//		al.remove(lastIndex);
//		return l;
//	}
//	
//	public int peek() {
//		int lastIndex=al.size()-1;
//		return (int) al.get(lastIndex);
//	}
//	
//	public int size() {
//		return al.size();
//	}
//	
//	public boolean isEmpty() {
//		if(al.size()==0) {
//			return true;
//		}
//		return false;
//	}
//}
//
//public class TapPUsingArrayList {
//
//	public static void main(String[] args) throws StackUnderFlowException {
//		Stack myStack = new Stack();
//		myStack.push(10);
//		myStack.push(20);
//		myStack.push(30);
//		myStack.push(40);
////		System.out.println(myStack.pop());
////		System.out.println(myStack.peek());
////		System.out.println(myStack.pop());
////		System.out.println(myStack.pop());
////		System.out.println(myStack.peek());
////		System.out.println(myStack.peek());
//		System.out.println(myStack.size());
//		
//	}
//
//}
