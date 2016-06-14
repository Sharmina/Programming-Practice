import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g=new Graph();
		int numVertex=0;
		int numEdges=0;
		File f=new File("graphData1");
		
		try {
			FileReader freader=new FileReader(f);
			BufferedReader breader=new BufferedReader(freader);
			String[] inputs=breader.readLine().split("\\s+");
			numVertex=Integer.parseInt(inputs[0]);
			numEdges=Integer.parseInt(inputs[1]);
			inputs=breader.readLine().split("\\s+");
			for(int i=0;i<numVertex;i++)
			{
				g.addVertex(inputs[i]);
			}
			for(int i=0;i<numEdges;i++)
			{
				inputs=breader.readLine().split("\\s+");
				Vertex u=g.getVertex(inputs[0]);
				Vertex v=g.getVertex(inputs[1]);
				g.addEdge(u, v);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("BFS...");
		g.BFS(g.V.get("s"));
		System.out.println("DFS...");
		g.DFS(g.V.get("s"));
		

	}

}
