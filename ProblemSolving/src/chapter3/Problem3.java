package chapter3;

import java.util.ArrayList;
import java.util.Stack;

class SetOfStacks{

	ArrayList<Stack<Integer>> stacks;
	int capacity;
	SetOfStacks(int capacity)
	{
		stacks=new ArrayList<Stack<Integer>>();
		this.capacity=capacity;
	}
	Stack<Integer> getLastStack()
	{
		if(stacks.size()==0)
			return null;
		return stacks.get(stacks.size()-1);
	}
	void push(int num)
	{
		Stack<Integer> s=getLastStack();
		
		
		if(s==null || s.size()==capacity)
		{
			Stack<Integer> n=new Stack<Integer>();
			n.push(num);
			stacks.add(n);
			
		}
		else
		{
			s.push(num);
		}
	}
	Integer pop()
	{
		int ret;
		Stack<Integer> s=getLastStack();
		if(s==null)
		{
			return null;
		}
		
		ret=s.pop();
			
		if(s.isEmpty())
			stacks.remove(stacks.size()-1);
		return ret;
				
		
	}
	Integer popAt(int index)
	{
		if(index>=stacks.size())
			return null;
		
		Stack s=stacks.get(index);
		int ret = 0;
		
		if(index==stacks.size()-1)
		{
			ret=(int) s.pop();
		}
		else
		{
			ret=(int) s.pop();
			leftShift(index+1);
		}
		
		return ret;
		
		
	}
	void leftShift(int index)
	{
		if(index==stacks.size())
			return;
		
		Stack<Integer> tmp=new Stack<Integer>();
		Stack<Integer> s=stacks.get(index);
		while(!s.isEmpty())
		{
			tmp.push(stacks.get(index).pop());
		}
		stacks.get(index-1).push(tmp.pop());
		while(!tmp.isEmpty())
		{
			s.push(tmp.pop());
		}
		leftShift(index+1);
	}
	
	void printStacks()
	{
		for(int i=0;i<stacks.size();i++)
		{
			System.out.print(i+":");
			for(int n:stacks.get(i))
			{
				System.out.print(n+"->");
			}
			System.out.println("\n");
		}
	}
	
}

public class Problem3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetOfStacks slist=new SetOfStacks(3);
		
		slist.push(1);
		slist.push(2);
		slist.push(3);
		slist.push(4);
		slist.push(5);
		slist.push(6);
		System.out.println("After push");
		slist.printStacks();
		slist.popAt(0);
		
		System.out.println("After Pop");
		slist.printStacks();
		
		slist.push(7);
		slist.push(8);
		System.out.println("After Pop");
		slist.printStacks();

	}

}
