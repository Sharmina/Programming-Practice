package Chapter6;

public class Problem3 {

	static String removeDuplicateCharacters(String s) {

		if(s==null)
	        return null;
	    if(s.length()==0|| s.length()==1)
	        return s;
	    boolean[] charList=new boolean[256];
	   
	    StringBuffer sb=new StringBuffer();
	    
	    for(int i=0;i<s.length();i++)
	    {
	        int character=s.charAt(i)-'0';
	        
	        if(!charList[character])
	        {
	            charList[character]=true;
	            char c=(char) (character+'0');
	            sb.append(c);
	        }
	            
	        
	    }
	    return sb.toString();

	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeDuplicateCharacters("helloworld"));
	}

}
