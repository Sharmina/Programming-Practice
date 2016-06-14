import java.util.ArrayList;

public class Heap {

	ArrayList<Pair> heapArray;
	int nextIndex;
	Heap()
	{
		heapArray=new ArrayList<Pair>();
		nextIndex=1;
		heapArray.add(null);
	}
	
	void insert(Pair n)
	{
		heapArray.add(nextIndex,n);
		bubbleUp(nextIndex);
		nextIndex++;
	}
	void bubbleUp(int index)
	{
		int parentIndex=(int) Math.ceil(index/2);
		while(parentIndex>0)
		{
			Pair parent=heapArray.get(parentIndex);
			Pair child=heapArray.get(index);
			if(parent.compareTo(child)>0)
			{
				Pair temp=heapArray.get(parentIndex);
				heapArray.set(parentIndex, child);
				heapArray.set(index, temp);
				
			}
			else
			{
				break;
				
			}
			index=parentIndex;
			parentIndex=(int) Math.ceil(index/2);
		}
	}
	int getMinChildIndex(int index)
	{
		int child1Index=2*index;
		int child2Index=2*index+1;
		
		if(child1Index>=nextIndex && child2Index>=nextIndex)
			return 0;
		if(child1Index>=nextIndex || child2Index>=nextIndex)
			return child1Index;
		
		Pair child1=heapArray.get(child1Index);
		Pair child2=heapArray.get(child2Index);

		
		if(child1.compareTo(child2)<0)
		{
			return child1Index;
		}
		else
			return child2Index;
	}
	Pair extractMin()
	{
		if(heapArray.size()==1)
			return null;
		
		Pair ret=heapArray.get(1);
		
		heapArray.set(1, heapArray.get(nextIndex-1));
		heapArray.remove(nextIndex-1);
		nextIndex--;
		int index=1;
		while(index<nextIndex)
		{
			int minIndex=getMinChildIndex(index);
			if(minIndex==0)
			{
				//nextIndex--;
				return ret;
			}
			if(heapArray.get(index).compareTo(heapArray.get(minIndex))>0)
			{
				Pair temp=heapArray.get(index);
				heapArray.set(index, heapArray.get(minIndex));
				heapArray.set(minIndex, temp);
			}
			index=minIndex;
		}
		return ret;
		
	}
	Pair Min()
	{
		if(heapArray.size()>1)
			return heapArray.get(1);
		else
			return null;
	}
	void print()
	{
		for(int i=1;i<nextIndex;i++)
		{
			heapArray.get(i).print();
		}
		System.out.print("\n");
	}
}
