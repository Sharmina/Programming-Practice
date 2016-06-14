package textgen;

import java.util.AbstractList;


/** A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 * @param <E> The type of the elements stored in the list
 */
public class MyLinkedList<E> extends AbstractList<E> {
	LLNode<E> head;
	LLNode<E> tail;
	int size;

	/** Create a new empty LinkedList */
	public MyLinkedList() {
		// TODO: Implement this method
	
		
		LLNode<E> hNode=new LLNode(null);
		LLNode<E> tNode=new LLNode(null);
		
		hNode.next=tNode;
		tNode.prev=hNode;
		
		head=hNode;
		tail=tNode;
		size=0;
	}

	/**
	 * Appends an element to the end of the list
	 * @param element The element to add
	 */
	public boolean add(E element ) 
	{
		// TODO: Implement this method
		if(element==null)
			throw new NullPointerException();
		
		LLNode<E> nNode=new LLNode<E>(element);
		
		
		nNode.prev=tail.prev;
		nNode.next=tail;
		
		tail.prev.next=nNode;
		tail.prev=nNode;
		
		size++;
		return true;
	}

	/** Get the element at position index 
	 * @throws IndexOutOfBoundsException if the index is out of bounds. */
	public E get(int index) 
	{
		// TODO: Implement this method.
		if(index<0 || index>size-1)
			throw new IndexOutOfBoundsException();
		
		
		LLNode<E> cNode=head.next;
		
		int i=0;
		while(i<index)
		{
			cNode=cNode.next;
			i++;
		}
		return cNode.data;
	}

	/**
	 * Add an element to the list at the specified index
	 * @param The index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element ) 
	{
		// TODO: Implement this method
		if(index<0 || index>size)
			throw new IndexOutOfBoundsException();
		
		if(element==null)
			throw new NullPointerException();
		
		LLNode<E> nNode=new LLNode<E>(element);
		
		LLNode<E> cNode=head.next;
		
		int i=0;
		while(i<index)
		{
			cNode=cNode.next;
			i++;
		}
		
		nNode.next=cNode;
		nNode.prev=cNode.prev;
		
		cNode.prev.next=nNode;
		cNode.prev=nNode;
		
		size++;
		
	}


	/** Return the size of the list */
	public int size() 
	{
		// TODO: Implement this method
		return size;
	}

	/** Remove a node at the specified index and return its data element.
	 * @param index The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index) 
	{
		// TODO: Implement this method
		if(index<0 || index>size-1)
			throw new IndexOutOfBoundsException();
		
		
		LLNode<E> cNode=head.next;
		
		int i=0;
		while(i<index)
		{
			cNode=cNode.next;
			i++;
		}
		
		cNode.prev.next=cNode.next;
		cNode.next.prev=cNode.prev;
		
		size--;
		return cNode.data;
		
	}

	/**
	 * Set an index position in the list to a new element
	 * @param index The index of the element to change
	 * @param element The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException if the index is out of bounds.
	 */
	public E set(int index, E element) 
	{
		// TODO: Implement this method
		if(index<0 || index>size-1)
			throw new IndexOutOfBoundsException();
		
		if(element==null)
			throw new NullPointerException();
		
		LLNode<E> cNode=head.next;
		
		int i=0;
		while(i<index)
		{
			cNode=cNode.next;
			i++;
		}
		
		E e=cNode.data;
		cNode.data=element;
		
		return e;
	}   
}

class LLNode<E> 
{
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// TODO: Add any other methods you think are useful here
	// E.g. you might want to add another constructor

	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
	}

}
