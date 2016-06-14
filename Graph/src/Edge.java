
public class Edge {
	Vertex u;
	Vertex v;
	int weight; 
	Edge(Vertex u,Vertex v)
	{
		this.u=u;
		this.v=v;
		this.weight=1;
	}
	Vertex getOtherVertex(Vertex k)
	{
		if(k==this.v)
			return this.u;
		else
			return this.v;
	}

}
