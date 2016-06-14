package chapter3;

import java.util.Stack;

class StackWithMin extends Stack<Integer>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Stack<Integer> min=new Stack<Integer>();
	public void push(int value)
	{
		
		if(min()>=value)
		{
			min.push(value);
		}
		super.push(value);
		
	}
	int min()
	{
		if(min.isEmpty())
			return Integer.MAX_VALUE;
		else
		{
			return min.peek();
		}
	}
	public Integer pop()
	{
		Integer ret=super.pop();
		if(ret==min.peek())
		{
			min.pop();
		}
		return ret;
	}
	
	
}

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWithMin stack=new StackWithMin();
		stack.push(1);
		System.out.println(stack.min());
		stack.push(2);
		System.out.println(stack.min());
		stack.push(0);
		System.out.println(stack.min());
		stack.pop();
		System.out.println(stack.min());

	}

}
