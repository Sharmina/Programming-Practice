package graph;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Vertex
{
	public String index;
	public int visited;
	
	
	Vertex(String  n)	
	{
		index=n;
		visited=0;
		
	}
}
class EdgeList
{
	public LinkedList<String> edges;
	EdgeList()
	{
		edges=new LinkedList<String>();
	}
}

public class Graph {

	public LinkedList<Vertex> vList;
	public LinkedList<EdgeList> e;
	
	public Hashtable<String, Integer> mapping;
	
	
	Graph()
	{
		vList=new LinkedList<Vertex>();
		e=new LinkedList<EdgeList>();
		mapping=new Hashtable<String, Integer>();
		
		
	}
	
	void addEdge(int i, String j)
	{
		e.add(new EdgeList());
		e.get(i).edges.add(j);		
		
	}
	
	void printGraph()
	{
		for(int i=0;i<vList.size();i++)
		{
			System.out.print(vList.get(i).index+": ");
			for(int j=0;j<e.get(i).edges.size();j++)
			{
				System.out.print(e.get(i).edges.get(j)+" ");
			}
			System.out.print("\n");
		}
		
	}
	void BFS(Vertex s)
	{
		if(s==null)
			return;
		
		Queue<Vertex> q=new LinkedList<Vertex>();

		s.visited=1;
		q.add(s);
		
		while(!q.isEmpty())
		{
			Vertex v=(Vertex)q.remove();
			System.out.print(v.index+" ");
			
			LinkedList<String> edges=(e.get(mapping.get(v.index))).edges;
			
			for(int i=0;i<edges.size();i++)
			{
				
				if(vList.get(mapping.get(edges.get(i))).visited==0)
				{
					vList.get(mapping.get(edges.get(i))).visited=1;
					
					//System.out.println("putting "+vList.get(mapping.get(edges.get(i))).index);
					q.add(vList.get(mapping.get(edges.get(i))));
				}
					
			}
		}
	}
	void DFS(Vertex s)
	{
		if(s==null)
			return;
		
		Stack<Vertex> stack=new Stack<Vertex>();
		
		s.visited=1;
		stack.push(s);
		
		while(!stack.isEmpty())
		{
			Vertex v=stack.pop();
			System.out.print(v.index+" ");
			
			LinkedList<String> edges=e.get(mapping.get(v.index)).edges;
			for(int i=0;i<edges.size();i++)
			{
				Vertex neighbour=vList.get(mapping.get(edges.get(i)));
				if(neighbour.visited==0)
				{
					neighbour.visited=1;
					stack.push(neighbour);
				}
			}
		}
			
	}
	void initialize()
	{
		for(Vertex v:vList)
		{
			v.visited=0;
		}
	}
	
	
	
}


