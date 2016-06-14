import java.util.LinkedList;
import java.util.List;

public class Vertex {
	
	String label;
	boolean visited;
	List<Edge> edgelist=null;
	Vertex(String label)
	{
		this.label=label;
		this.edgelist=new LinkedList<Edge>();
		this.visited=false;
	}
	

}
