import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []i={3,3,8,2,5,5,1,4,7,6};
		List<Integer> input=new ArrayList<Integer>();
		
		
		try{
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader("C:/Users/sahmed7/workspace/java/QuickSort/bin/wpm_log.txt"));
		   
		String strLine;
		while ((strLine = reader.readLine()) != null)   
		{
			input.add(Integer.parseInt(strLine));
		}
		   
		reader.close();
		}catch (Exception e)
		{//Catch exception if any
		      System.err.println("Error: " + e.getMessage());
		}
		    
		int []i=new int[input.size()];
		for(int j=0;j<input.size();j++)
		{
			i[j]=input.get(j);
		}
		QSort qsort=new QSort(i);
		qsort.doQSort(0, i.length-1);
		qsort.print();
	}

}
