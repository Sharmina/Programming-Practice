package chapter3;

import java.util.Stack;
class MyQueue<T>{
	Stack<T> oldest;
	Stack<T> newest;
	
	MyQueue()
	{
		oldest=new Stack<T>();
		newest=new Stack<T>();
	}
	void enque(T value)
	{
		newest.push(value);
	}
	void shiftStacks()
	{
		if(oldest.isEmpty())
		{
			while(!(newest.isEmpty()))
			{
				oldest.push(newest.pop());
			}
		}
	}
	T dequeue()
	{
		shiftStacks();
		return oldest.pop();
	}
	T peek()
	{
		shiftStacks();
		return oldest.peek();
	}
	int size()
	{
		return newest.size()+oldest.size();
	}
}
public class Problem5 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue<Integer> q=new MyQueue<Integer>();
		q.enque(1);
		q.enque(2);
		q.enque(3);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		q.enque(4);
		System.out.println(q.peek());
		

	}

}
