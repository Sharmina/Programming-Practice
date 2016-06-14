package graph;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Vertex
{
	public int index;
	public int visited;
	int leader;
	int finishingTime;
	
	
	Vertex(int  n)	
	{
		index=n;
		visited=0;
		leader=-1;
		finishingTime=0;
		
	}
}
class EdgeList
{
	public LinkedList<Integer> edges;
	EdgeList()
	{
		edges=new LinkedList<Integer>();
	}
}

public class Graph {

	public Vertex [] vList;
	public EdgeList[] e;

	
	
	
	Graph(int n)
	{
		vList=new Vertex[n];
		e=new EdgeList[n];
		
		for(int i=0;i<n;i++)
		{
			vList[i].index=i;
			System.out.println(i);
		}
		
	}
	
	void addEdge(int i, int j)
	{
		
		e[i].edges.add(j);		
		
	}
	
	
	void printGraph()
	{
		for(int i=1;i<vList.length;i++)
		{
			System.out.print(vList[i].index+": ");
			System.out.print("Finishing Time: "+vList[i].finishingTime+" Leader:"+vList[i].leader+")" );
			for(int j=0;j<e[i].edges.size();j++)
			{
				System.out.print(e[i].edges.get(j)+" ");
			}
			System.out.print("\n");
		}
		
	}
	void DFSLoop(Graph g)
	{
		
	}

	
	void initialize()
	{
		for(int i=0;i<vList.length;i++)
		{
			vList[i].visited=0;
			vList[i].index=i;
		}
	}
	
	
	
}