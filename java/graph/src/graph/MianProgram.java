package graph;

import java.io.BufferedReader;
import java.io.FileReader;

public class MianProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph g=new Graph();
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader("graph.txt"));
			
			String line;
			int lineNo=0;
			while((line=reader.readLine())!=null)
			{
				String[]vertex=line.split(" ");
				Vertex v=new Vertex((vertex[0]));
				
				g.vList.add(v);
				g.mapping.put(v.index, lineNo);
				
				for(int i=1;i<vertex.length;i++)
				{
					g.addEdge((g.vList.size()-1),vertex[i]);
				}
				
				lineNo++;
						
			}
			
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Printing Graph");
		g.printGraph();
		
		System.out.println("BFS visiting order:");
		g.BFS(g.vList.getFirst());
		System.out.println("");
		
		g.initialize();
		
		System.out.println("DFS visiting order:");
		g.DFS(g.vList.getFirst());
		System.out.println("");
		
	}

}
