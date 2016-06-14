
public class Pair implements Comparable<Pair>{
	
	String key;
	int value;
	
	Pair(String key, int value)
	{
		this.key=key;
		this.value=value;
	}

	@Override
	public int compareTo(Pair arg0) {
		// TODO Auto-generated method stub
		if(this.value==arg0.value)
			return 0;
		else if(this.value<arg0.value)
			return -1;
		else
			return 1;
	}
	
	void print()
	{
		System.out.print("("+this.key+","+this.value+")");
	}

}
