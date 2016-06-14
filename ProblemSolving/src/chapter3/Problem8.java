package chapter3;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Animal
{
	String name;
	int order;
	Animal(String name)
	{
		this.name=name;
	}
	void setOrder(int order)
	{
		this.order=order;
	}
	int getOrder()
	{
		return order;
	}
	boolean isOlderThan(Animal a)
	{
		return this.order<a.getOrder();
	}
}
class Cat extends Animal
{

	Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
class Dog extends Animal
{

	Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}

class AnimalQueue
{
	Queue<Cat> c;
	Queue<Dog> d;
	int order;
	AnimalQueue()
	{
		c=new LinkedList<Cat>();
		d=new LinkedList<Dog>();
		order=0;
	}
	void enqueue(Animal a)
	{
		a.setOrder(order);
		order++;
		if(a instanceof Cat)
		{
			c.add((Cat)a);
		}
		else if(a instanceof Dog)
		{
			d.add((Dog)a);
		}
	}
	Animal dequeueAny()
	{
		if(d.size()==0)
			return dequeueCat();
		
		else if(c.size()==0)
			return dequeueDog();
		
		Dog dog=d.peek();
		Cat cat=c.peek();
		
		if(dog.isOlderThan(cat))
			return dequeueDog();
		else
			return dequeueCat();
		
	}
	Cat dequeueCat()
	{
		return c.poll();
	}
	Dog dequeueDog()
	{
		return d.poll();
	}
}
public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
