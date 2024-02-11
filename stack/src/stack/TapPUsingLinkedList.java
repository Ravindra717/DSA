package stack;

import java.util.Stack;


class StackUnderFlowException extends Exception{
	public StackUnderFlowException() {
		super("no element found");
	}
}

class SNode {
	int data;
	SNode next;
	
	public SNode(int data) {
		this.data=data;
		this.next=null;
	} 
}

class LStack {
	SNode top;
	int size;
	
	public LStack() {
		this.top=null;
		this.size=0;
	}
	
	public void push(int e) {
		SNode temp=new SNode(e);
		temp.next=top;
		top=temp;
		size++;
	}
	
	public int pop() throws StackUnderFlowException {
	    if(top == null) {
	        throw new StackUnderFlowException();
	    }
	    int e=top.data;
	    top=top.next;
	    size--;
	    return e;
	}
	
	public int size() {
		return size;
	}
	
	public int peek() {
		return top.data;
	}
	
	public boolean isEmpty() {
		if(top==null) {
			return true;
		}
		return false;
	}
	
	public boolean balancedParanthesis(String k) throws StackUnderFlowException {
		LStack stack = new LStack();
		for(int i=0;i<k.length();i++) {
			char c=k.charAt(i);
			
			if(c=='(' || c=='{' || c=='[') {
				stack.push(c);
			}else if(stack.size()>0 && (c==')' && stack.peek()=='('
					|| c=='}'&& stack.peek()=='{'
					|| c==']'&& stack.peek()=='[')) 
			{
				stack.pop();
			}else {
				return false;
			}
		}
		if(stack.size()==0) {
			return true;
		}
		return false;
	}
	
	//using loop
	public void closestSmallElementToLeft(int[]arr) {
		for (int i = 0; i < arr.length; i++) {
			int x=-1;
			for(int j=i-1;j>=0;j--) {
				if(arr[j]<arr[i]) {
					x=arr[j];
					break;
				}
			}
			System.out.println(x);
		}
	}
	
	//using stack
	public void closestElementToLeft(int[] arr) {
	    Stack<Integer> stack = new Stack<>();
	    for (int i = 0; i < arr.length; i++) {
	        while (!stack.isEmpty() && stack.peek() > arr[i]) {
	            stack.pop();
	        }
	        if (stack.isEmpty()) {
	            System.out.println("-1");
	        } else {
	            System.out.println(stack.peek());
	        }
	        stack.push(arr[i]);
	    }
	}
	
	 public void stockSpan(int[]arr) {
		 for (int i = 0; i < arr.length; i++) {
			int span=1;
			for(int j=i-1;j>=0;j--) {
				if(arr[j]<arr[i]) {
					span++;
				}
			}
			System.out.print(span+" ");
		}
	 }
	 
	 public void stockSpan2(int[] arr) throws StackUnderFlowException {
		    LStack stack = new LStack();
		    for (int i = 0; i < arr.length; i++) {
		        while (!stack.isEmpty() && stack.top.data < arr[i]) {
		            stack.pop();
		        }
		        if (stack.isEmpty()) {
		            System.out.println(i + 1);
		        } else {
		            System.out.println(i - stack.top.data);
		        }
		        stack.push(i);
		    }
		}


}


public class TapPUsingLinkedList {

	public static void main(String[] args) throws StackUnderFlowException {
		LStack s = new LStack();
//		s.push(10);
//		s.push(20);
//		s.push(30);
//		s.push(40);
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.size());
//		System.out.println(s.peek());
//		System.out.println(s.isEmpty());
//		String k="(}[]";
//		System.out.println(s.balancedParanthesis(k));
//		int[]arr= {5,3,7,12,15,21};
//		s.closestSmallElementToLeft(arr);
//		s.closestElementToLeft(arr);
		int[]arr= {12,14,10,15,6,10};
//		s.stockSpan(arr);
		s.stockSpan2(arr);
		
	
	
	}
}
