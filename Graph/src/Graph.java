import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	
	HashMap<String,Vertex> V;
	List<Edge> E;
	Graph()
	{
		V=new HashMap<String,Vertex>();
		E=new LinkedList<Edge>();
	}
	void addVertex(String label)
	{
		Vertex v=new Vertex(label);
		V.put(label, v);
	}
	void addEdge(Vertex v,Vertex u)
	{
		Edge e=new Edge(v,u);
		E.add(e);
		v.edgelist.add(e);
		u.edgelist.add(e);
	}
	Vertex getVertex(String label)
	{
		return V.get(label);
	}
	void resetVertex()
	{
		Iterator it=V.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry item=(Entry) it.next();
			Vertex v=(Vertex) item.getValue();
			v.visited=false;
		}
	}
	
	void BFS(Vertex s)
	{
		resetVertex();
		Queue<Vertex> q=new LinkedList<Vertex>();
		s.visited=true;
		q.add(s);
		
		while(!q.isEmpty())
		{
			Vertex v=q.remove();
			System.out.println("visiting.. "+v.label);
			for(Edge e:v.edgelist)
			{
				Vertex u=e.getOtherVertex(v);
				if(!u.visited)
				{
					q.add(u);
					u.visited=true;
				}
			}
		}
		
	}
	void DFS(Vertex s)
	{
		resetVertex();
		Stack<Vertex> stack=new Stack<Vertex>();
		s.visited=true;
		stack.push(s);
	
	while(!stack.isEmpty())
	{
		Vertex v=stack.pop();
		System.out.println("visiting.. "+v.label);
		for(Edge e:v.edgelist)
		{
			Vertex u=e.getOtherVertex(v);
			if(!u.visited)
			{
				stack.push(u);
				u.visited=true;
			}
		}
	}
	}

}
