package chapter3;

import java.util.Stack;

class Tower
{
	int index;
	Stack<Integer> stack;
	
	Tower(int index)
	{
		this.index=index;
		stack=new Stack<Integer>();
	}
	
}
public class Problem6 {

	static void MoveTop(Tower src, Tower dest)
	{
		int elm=src.stack.pop();
		System.out.println("Moving "+elm+" from Tower "+src.index+" to "+dest.index);
		dest.stack.push(elm);
	}
	static void towerOfHanoi(int n,Tower src,Tower dest,Tower buffer)
	{
		if(n<0)
			return;
		
		towerOfHanoi(n-1,src,buffer,dest);
		MoveTop(src,dest);
		towerOfHanoi(n-1,buffer,dest,src);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tower one=new Tower(1);
		Tower two=new Tower(2);
		Tower three=new Tower(3);
		
		for(int i=0;i<4;i++)
		{
			one.stack.push(i);
		}
		
		towerOfHanoi(3,one,three,two);

	}

}
