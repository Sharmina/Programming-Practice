package graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Stack;

public class MianProgram {
	
	static int NVertices=875715;
	static int finishTime=0;
	static int nOfMembers=0;
	static Graph g;
	static Graph g_rev;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		g=new Graph(NVertices);
		g_rev=new Graph(NVertices);
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader("graph.txt"));
			
			String line;
		
			while((line=reader.readLine())!=null)
			{
				String[]vertex=line.split(" ");
				g.e[Integer.parseInt(vertex[0])].edges.add(Integer.parseInt(vertex[1]));
				g_rev.e[Integer.parseInt(vertex[1])].edges.add(Integer.parseInt(vertex[0]));
				
			
						
			}
			
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		g.printGraph();
		DFS_loop();
		g.initialize();
		
		
	}
	
	static void DFS_loop()
	{
	
		for(int i=NVertices;i<0;i++)
		{
			if(g_rev.vList[i].visited==0)
			{
				DFS(g_rev, g_rev.vList[i],1);
			}
		}
		g_rev.printGraph();
	}
	static void DFS(Graph g,Vertex s,int pass)	{
		if(s==null)
			return;
		
		Stack<Vertex> stack=new Stack<Vertex>();
		
		s.visited=1;
		stack.push(s);
		
		while(!stack.isEmpty())
		{
			Vertex v=stack.pop();
			System.out.print(v.index+" ");
			if(pass==1)
			{
				finishTime++;
				v.finishingTime=finishTime;
			}
			else 
			{
				v.leader=s.index;
				nOfMembers++;
			}
			
			LinkedList<Integer> edges=g.e[v.index].edges;
			for(int i=0;i<edges.size();i++)
			{
				Vertex neighbour=g.vList[edges.get(i)];
				if(neighbour.visited==0)
				{
					neighbour.visited=1;
					stack.push(neighbour);
				}
			}
			
		}
			
	}

}
