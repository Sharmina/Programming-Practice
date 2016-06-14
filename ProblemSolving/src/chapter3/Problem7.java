package chapter3;

import java.util.Stack;

public class Problem7 {

	static Stack<Integer> sort(Stack<Integer> s)
	{
		Stack<Integer> r=new Stack<Integer>();
		while(!s.isEmpty())
		{
			int tmp=s.pop();
			while(!r.isEmpty() && tmp<r.peek())
			{
				s.push(r.pop());
			}
			r.push(tmp);
		}
		
		return r;
	}
	static void print(Stack<Integer> s)
	{
		for(int i:s)
		{
			System.out.print(i+"->");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s=new Stack<Integer>();
		s.push(4);
		s.push(11);
		s.push(2);
		s.push(10);
		print(s);
		System.out.println("After sort");
		print(sort(s));

	}

}
